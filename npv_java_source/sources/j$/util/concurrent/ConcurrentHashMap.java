package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentHashMap<K, V> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable, j$.util.concurrent.v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f48049g = java.lang.Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f48050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f48051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f48052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f48053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f48054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f48055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f48056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f48057o;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile transient j$.util.concurrent.l[] f48058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile transient j$.util.concurrent.l[] f48059b;
    private volatile transient long baseCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile transient j$.util.concurrent.c[] f48060c;
    private volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient j$.util.concurrent.i f48061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient j$.util.concurrent.s f48062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient j$.util.concurrent.e f48063f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        java.io.ObjectStreamField objectStreamField = new java.io.ObjectStreamField("segments", j$.util.concurrent.n[].class);
        java.lang.Class cls = java.lang.Integer.TYPE;
        serialPersistentFields = new java.io.ObjectStreamField[]{objectStreamField, new java.io.ObjectStreamField("segmentMask", cls), new java.io.ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVarH = j$.sun.misc.a.h();
        f48050h = aVarH;
        f48051i = aVarH.j(j$.util.concurrent.ConcurrentHashMap.class, "sizeCtl");
        f48052j = aVarH.j(j$.util.concurrent.ConcurrentHashMap.class, "transferIndex");
        f48053k = aVarH.j(j$.util.concurrent.ConcurrentHashMap.class, "baseCount");
        f48054l = aVarH.j(j$.util.concurrent.ConcurrentHashMap.class, "cellsBusy");
        f48055m = aVarH.j(j$.util.concurrent.c.class, "value");
        f48056n = aVarH.a(j$.util.concurrent.l[].class);
        int iB = aVarH.b(j$.util.concurrent.l[].class);
        if (((iB - 1) & iB) != 0) {
            throw new java.lang.ExceptionInInitializerError("array index scale not a power of two");
        }
        f48057o = 31 - java.lang.Integer.numberOfLeadingZeros(iB);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i6) {
        this(i6, 0.75f, 1);
    }

    public ConcurrentHashMap(int i6, float f6, int i10) {
        if (f6 <= 0.0f || i6 < 0 || i10 <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        long j6 = (long) (((double) ((i6 < i10 ? i10 : i6) / f6)) + 1.0d);
        this.sizeCtl = j6 >= 1073741824 ? 1073741824 : l((int) j6);
    }

    public ConcurrentHashMap(java.util.Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #2 {all -> 0x014c, blocks: (B:97:0x013d, B:99:0x0141), top: B:132:0x013d }] */
    private final void a(long j6, int i6) {
        boolean zD;
        int iB;
        j$.util.concurrent.c[] cVarArr;
        j$.sun.misc.a aVar;
        long j10;
        long j11;
        boolean z6;
        int length;
        boolean z10;
        int length2;
        int length3;
        j$.util.concurrent.c cVar;
        long j12;
        j$.util.concurrent.l[] lVarArr;
        int length4;
        j$.util.concurrent.l[] lVarArr2;
        j$.util.concurrent.c[] cVarArr2 = this.f48060c;
        if (cVarArr2 == null) {
            j$.sun.misc.a aVar2 = f48050h;
            long j13 = f48053k;
            long j14 = this.baseCount;
            j12 = j14 + j6;
            if (!aVar2.d(this, j13, j14, j12)) {
                if (cVarArr2 != null || (length3 = cVarArr2.length - 1) < 0 || (cVar = cVarArr2[length3 & j$.util.concurrent.ThreadLocalRandom.b()]) == null) {
                    zD = true;
                } else {
                    j$.sun.misc.a aVar3 = f48050h;
                    long j15 = f48055m;
                    long j16 = cVar.value;
                    zD = aVar3.d(cVar, j15, j16, j16 + j6);
                    if (zD) {
                        if (i6 <= 1) {
                            return;
                        } else {
                            j12 = j();
                        }
                    }
                }
                iB = j$.util.concurrent.ThreadLocalRandom.b();
                if (iB == 0) {
                    j$.util.concurrent.ThreadLocalRandom.f();
                    iB = j$.util.concurrent.ThreadLocalRandom.b();
                    zD = true;
                }
                boolean z11 = zD;
                while (true) {
                    boolean z12 = false;
                    while (true) {
                        cVarArr = this.f48060c;
                        if (cVarArr == null && (length = cVarArr.length) > 0) {
                            j$.util.concurrent.c cVar2 = cVarArr[(length - 1) & iB];
                            if (cVar2 != null) {
                                if (z11) {
                                    j$.sun.misc.a aVar4 = f48050h;
                                    long j17 = f48055m;
                                    long j18 = cVar2.value;
                                    if (!aVar4.d(cVar2, j17, j18, j18 + j6)) {
                                        if (this.f48060c == cVarArr && length < f48049g) {
                                            if (!z12) {
                                                z12 = true;
                                            } else if (this.cellsBusy == 0 && aVar4.c(this, f48054l, 0, 1)) {
                                                break;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    z11 = true;
                                }
                                iB = j$.util.concurrent.ThreadLocalRandom.a(iB);
                            } else if (this.cellsBusy == 0) {
                                j$.util.concurrent.c cVar3 = new j$.util.concurrent.c(j6);
                                if (this.cellsBusy == 0 && f48050h.c(this, f48054l, 0, 1)) {
                                    try {
                                        j$.util.concurrent.c[] cVarArr3 = this.f48060c;
                                        if (cVarArr3 == null || (length2 = cVarArr3.length) <= 0) {
                                            z10 = false;
                                        } else {
                                            int i10 = (length2 - 1) & iB;
                                            if (cVarArr3[i10] == null) {
                                                cVarArr3[i10] = cVar3;
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        this.cellsBusy = 0;
                                        if (z10) {
                                            return;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        this.cellsBusy = 0;
                                        throw th;
                                    }
                                }
                            }
                            z12 = false;
                            iB = j$.util.concurrent.ThreadLocalRandom.a(iB);
                        } else if (this.cellsBusy != 0 && this.f48060c == cVarArr && f48050h.c(this, f48054l, 0, 1)) {
                            try {
                                if (this.f48060c == cVarArr) {
                                    j$.util.concurrent.c[] cVarArr4 = new j$.util.concurrent.c[2];
                                    cVarArr4[iB & 1] = new j$.util.concurrent.c(j6);
                                    this.f48060c = cVarArr4;
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                this.cellsBusy = 0;
                                if (z6) {
                                    return;
                                }
                            } catch (java.lang.Throwable th2) {
                                this.cellsBusy = 0;
                                throw th2;
                            }
                        } else {
                            aVar = f48050h;
                            j10 = f48053k;
                            j11 = this.baseCount;
                            if (aVar.d(this, j10, j11, j11 + j6)) {
                                return;
                            }
                        }
                    }
                    try {
                        if (this.f48060c == cVarArr) {
                            this.f48060c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(cVarArr, length << 1);
                        }
                        this.cellsBusy = 0;
                    } catch (java.lang.Throwable th3) {
                        this.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        } else {
            if (cVarArr2 != null) {
                zD = true;
            } else {
                zD = true;
            }
            iB = j$.util.concurrent.ThreadLocalRandom.b();
            if (iB == 0) {
                j$.util.concurrent.ThreadLocalRandom.f();
                iB = j$.util.concurrent.ThreadLocalRandom.b();
                zD = true;
            }
            boolean z13 = zD;
            while (true) {
                boolean z14 = false;
                while (true) {
                    cVarArr = this.f48060c;
                    if (cVarArr == null) {
                    }
                    if (this.cellsBusy != 0) {
                    }
                    aVar = f48050h;
                    j10 = f48053k;
                    j11 = this.baseCount;
                    if (aVar.d(this, j10, j11, j11 + j6)) {
                        return;
                    }
                }
                if (this.f48060c == cVarArr) {
                    this.f48060c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(cVarArr, length << 1);
                }
                this.cellsBusy = 0;
            }
        }
        if (i6 < 0) {
            return;
        }
        while (true) {
            int i11 = this.sizeCtl;
            if (j12 < i11 || (lVarArr = this.f48058a) == null || (length4 = lVarArr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(length4) | 32768;
            if (i11 < 0) {
                if ((i11 >>> 16) != iNumberOfLeadingZeros || i11 == iNumberOfLeadingZeros + 1 || i11 == iNumberOfLeadingZeros + 65535 || (lVarArr2 = this.f48059b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (f48050h.c(this, f48051i, i11, i11 + 1)) {
                    m(lVarArr, lVarArr2);
                }
            } else if (f48050h.c(this, f48051i, i11, (iNumberOfLeadingZeros << 16) + 2)) {
                m(lVarArr, null);
            }
            j12 = j();
        }
    }

    static final boolean b(j$.util.concurrent.l[] lVarArr, int i6, j$.util.concurrent.l lVar) {
        return f48050h.e(lVarArr, (((long) i6) << f48057o) + ((long) f48056n), lVar);
    }

    static java.lang.Class c(java.lang.Object obj) {
        java.lang.reflect.Type[] actualTypeArguments;
        if (!(obj instanceof java.lang.Comparable)) {
            return null;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls == java.lang.String.class) {
            return cls;
        }
        java.lang.reflect.Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (java.lang.reflect.Type type : genericInterfaces) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                if (parameterizedType.getRawType() == java.lang.Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    private final j$.util.concurrent.l[] e() {
        while (true) {
            j$.util.concurrent.l[] lVarArr = this.f48058a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i6 = this.sizeCtl;
            if (i6 < 0) {
                java.lang.Thread.yield();
            } else if (f48050h.c(this, f48051i, i6, -1)) {
                try {
                    j$.util.concurrent.l[] lVarArr2 = this.f48058a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i10 = i6 > 0 ? i6 : 16;
                        j$.util.concurrent.l[] lVarArr3 = new j$.util.concurrent.l[i10];
                        this.f48058a = lVarArr3;
                        i6 = i10 - (i10 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    return lVarArr2;
                } finally {
                    this.sizeCtl = i6;
                }
            }
        }
    }

    static final void h(j$.util.concurrent.l[] lVarArr, int i6, j$.util.concurrent.l lVar) {
        f48050h.l(lVarArr, (((long) i6) << f48057o) + ((long) f48056n), lVar);
    }

    static final int i(int i6) {
        return (i6 ^ (i6 >>> 16)) & Integer.MAX_VALUE;
    }

    static final j$.util.concurrent.l k(j$.util.concurrent.l[] lVarArr, int i6) {
        return (j$.util.concurrent.l) f48050h.g(lVarArr, (((long) i6) << f48057o) + ((long) f48056n));
    }

    private static final int l(int i6) {
        int iNumberOfLeadingZeros = (-1) >>> java.lang.Integer.numberOfLeadingZeros(i6 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + iNumberOfLeadingZeros;
    }

    private final void m(j$.util.concurrent.l[] lVarArr, j$.util.concurrent.l[] lVarArr2) {
        j$.util.concurrent.l[] lVarArr3;
        j$.util.concurrent.g gVar;
        boolean z6;
        int i6;
        j$.util.concurrent.l lVar;
        j$.util.concurrent.ConcurrentHashMap<K, V> concurrentHashMap = this;
        j$.util.concurrent.l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i10 = f48049g;
        boolean z10 = true;
        int i11 = i10 > 1 ? (length >>> 3) / i10 : length;
        char c6 = 16;
        int i12 = i11 < 16 ? 16 : i11;
        if (lVarArr2 == null) {
            try {
                j$.util.concurrent.l[] lVarArr5 = new j$.util.concurrent.l[length << 1];
                concurrentHashMap.f48059b = lVarArr5;
                concurrentHashMap.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (java.lang.Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        j$.util.concurrent.g gVar2 = new j$.util.concurrent.g(lVarArr3);
        boolean zB = true;
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (true) {
            if (zB) {
                int i15 = i14 - 1;
                if (i15 >= i13 || z11) {
                    i13 = i13;
                    i14 = i15;
                    zB = false;
                } else {
                    int i16 = concurrentHashMap.transferIndex;
                    if (i16 <= 0) {
                        i14 = -1;
                    } else {
                        j$.sun.misc.a aVar = f48050h;
                        long j6 = f48052j;
                        int i17 = i16 > i12 ? i16 - i12 : 0;
                        int i18 = i13;
                        if (aVar.c(this, j6, i16, i17)) {
                            i14 = i16 - 1;
                            i13 = i17;
                        } else {
                            i13 = i18;
                            i14 = i15;
                        }
                    }
                    zB = false;
                }
            } else {
                int i19 = i13;
                j$.util.concurrent.r rVar = null;
                j$.util.concurrent.l lVar2 = null;
                if (i14 < 0 || i14 >= length || (i6 = i14 + length) >= length2) {
                    i12 = i12;
                    length2 = length2;
                    gVar = gVar2;
                    concurrentHashMap = this;
                    if (z11) {
                        concurrentHashMap.f48059b = null;
                        concurrentHashMap.f48058a = lVarArr3;
                        concurrentHashMap.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    z6 = true;
                    j$.sun.misc.a aVar2 = f48050h;
                    long j10 = f48051i;
                    int i20 = concurrentHashMap.sizeCtl;
                    int i21 = i14;
                    if (aVar2.c(this, j10, i20, i20 - 1)) {
                        c6 = 16;
                        if (i20 - 2 != ((java.lang.Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i14 = length;
                        zB = true;
                        z11 = true;
                    } else {
                        c6 = 16;
                        i14 = i21;
                    }
                } else {
                    j$.util.concurrent.l lVarK = k(lVarArr4, i14);
                    if (lVarK == null) {
                        zB = b(lVarArr4, i14, gVar2);
                        z6 = z10;
                    } else {
                        int i22 = lVarK.f48083a;
                        if (i22 == -1) {
                            zB = z10;
                            z6 = zB;
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArr4, i14) == lVarK) {
                                        if (i22 >= 0) {
                                            int i23 = i22 & length;
                                            j$.util.concurrent.l lVar3 = lVarK;
                                            for (j$.util.concurrent.l lVar4 = lVarK.f48086d; lVar4 != null; lVar4 = lVar4.f48086d) {
                                                int i24 = lVar4.f48083a & length;
                                                if (i24 != i23) {
                                                    lVar3 = lVar4;
                                                    i23 = i24;
                                                }
                                            }
                                            if (i23 == 0) {
                                                lVar = null;
                                                lVar2 = lVar3;
                                            } else {
                                                lVar = lVar3;
                                            }
                                            j$.util.concurrent.l lVar5 = lVarK;
                                            while (lVar5 != lVar3) {
                                                int i25 = lVar5.f48083a;
                                                java.lang.Object obj = lVar5.f48084b;
                                                int i26 = i12;
                                                java.lang.Object obj2 = lVar5.f48085c;
                                                int i27 = length2;
                                                if ((i25 & length) == 0) {
                                                    lVar2 = new j$.util.concurrent.l(i25, obj, obj2, lVar2);
                                                } else {
                                                    lVar = new j$.util.concurrent.l(i25, obj, obj2, lVar);
                                                }
                                                lVar5 = lVar5.f48086d;
                                                i12 = i26;
                                                length2 = i27;
                                            }
                                            i12 = i12;
                                            length2 = length2;
                                            h(lVarArr3, i14, lVar2);
                                            h(lVarArr3, i6, lVar);
                                            h(lVarArr4, i14, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i12 = i12;
                                            length2 = length2;
                                            if (lVarK instanceof j$.util.concurrent.q) {
                                                j$.util.concurrent.q qVar = (j$.util.concurrent.q) lVarK;
                                                j$.util.concurrent.r rVar2 = null;
                                                j$.util.concurrent.r rVar3 = null;
                                                j$.util.concurrent.l lVar6 = qVar.f48102f;
                                                int i28 = 0;
                                                int i29 = 0;
                                                j$.util.concurrent.r rVar4 = null;
                                                while (lVar6 != null) {
                                                    j$.util.concurrent.q qVar2 = qVar;
                                                    int i30 = lVar6.f48083a;
                                                    j$.util.concurrent.g gVar3 = gVar2;
                                                    j$.util.concurrent.r rVar5 = new j$.util.concurrent.r(i30, lVar6.f48084b, lVar6.f48085c, null, null);
                                                    if ((i30 & length) == 0) {
                                                        rVar5.f48107h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar = rVar5;
                                                        } else {
                                                            rVar3.f48086d = rVar5;
                                                        }
                                                        i28++;
                                                        rVar3 = rVar5;
                                                    } else {
                                                        rVar5.f48107h = rVar2;
                                                        if (rVar2 == null) {
                                                            rVar4 = rVar5;
                                                        } else {
                                                            rVar2.f48086d = rVar5;
                                                        }
                                                        i29++;
                                                        rVar2 = rVar5;
                                                    }
                                                    lVar6 = lVar6.f48086d;
                                                    qVar = qVar2;
                                                    gVar2 = gVar3;
                                                }
                                                j$.util.concurrent.q qVar3 = qVar;
                                                j$.util.concurrent.g gVar4 = gVar2;
                                                j$.util.concurrent.l lVarP = i28 <= 6 ? p(rVar) : i29 != 0 ? new j$.util.concurrent.q(rVar) : qVar3;
                                                j$.util.concurrent.l lVarP2 = i29 <= 6 ? p(rVar4) : i28 != 0 ? new j$.util.concurrent.q(rVar4) : qVar3;
                                                h(lVarArr3, i14, lVarP);
                                                h(lVarArr3, i6, lVarP2);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i14, gVar);
                                            }
                                        }
                                        zB = true;
                                    } else {
                                        i12 = i12;
                                        length2 = length2;
                                    }
                                    gVar = gVar2;
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            concurrentHashMap = this;
                            c6 = 16;
                            z6 = true;
                        }
                    }
                    gVar = gVar2;
                }
                gVar2 = gVar;
                concurrentHashMap = concurrentHashMap;
                z10 = z6;
                i13 = i19;
                i12 = i12;
                length2 = length2;
                c6 = c6;
            }
        }
    }

    private final void n(j$.util.concurrent.l[] lVarArr, int i6) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        j$.util.concurrent.l lVarK = k(lVarArr, i6);
        if (lVarK == null || lVarK.f48083a < 0) {
            return;
        }
        synchronized (lVarK) {
            try {
                if (k(lVarArr, i6) == lVarK) {
                    j$.util.concurrent.r rVar = null;
                    j$.util.concurrent.l lVar = lVarK;
                    j$.util.concurrent.r rVar2 = null;
                    while (lVar != null) {
                        j$.util.concurrent.r rVar3 = new j$.util.concurrent.r(lVar.f48083a, lVar.f48084b, lVar.f48085c, null, null);
                        rVar3.f48107h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f48086d = rVar3;
                        }
                        lVar = lVar.f48086d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i6, new j$.util.concurrent.q(rVar));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final void o(int i6) {
        int length;
        int iL = i6 >= 536870912 ? 1073741824 : l(i6 + (i6 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                return;
            }
            j$.util.concurrent.l[] lVarArr = this.f48058a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i11 = i10 > iL ? i10 : iL;
                if (f48050h.c(this, f48051i, i10, -1)) {
                    try {
                        if (this.f48058a == lVarArr) {
                            this.f48058a = new j$.util.concurrent.l[i11];
                            i10 = i11 - (i11 >>> 2);
                        }
                        this.sizeCtl = i10;
                    } catch (java.lang.Throwable th) {
                        this.sizeCtl = i10;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i10 || length >= 1073741824) {
                    return;
                }
                if (lVarArr == this.f48058a) {
                    if (f48050h.c(this, f48051i, i10, ((java.lang.Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(lVarArr, null);
                    }
                }
            }
        }
    }

    static j$.util.concurrent.l p(j$.util.concurrent.l lVar) {
        j$.util.concurrent.l lVar2 = null;
        j$.util.concurrent.l lVar3 = null;
        while (lVar != null) {
            j$.util.concurrent.l lVar4 = new j$.util.concurrent.l(lVar.f48083a, lVar.f48084b, lVar.f48085c);
            if (lVar3 == null) {
                lVar2 = lVar4;
            } else {
                lVar3.f48086d = lVar4;
            }
            lVar = lVar.f48086d;
            lVar3 = lVar4;
        }
        return lVar2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        long j6;
        boolean z6;
        boolean z10;
        java.lang.Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j10 = 0;
        long j11 = 0;
        j$.util.concurrent.l lVar = null;
        while (true) {
            java.lang.Object object = objectInputStream.readObject();
            java.lang.Object object2 = objectInputStream.readObject();
            j6 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j11++;
            lVar = new j$.util.concurrent.l(i(object.hashCode()), object, object2, lVar);
        }
        if (j11 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j12 = (long) (((double) (j11 / 0.75f)) + 1.0d);
        int iL = j12 >= 1073741824 ? 1073741824 : l((int) j12);
        j$.util.concurrent.l[] lVarArr = new j$.util.concurrent.l[iL];
        int i6 = iL - 1;
        while (lVar != null) {
            j$.util.concurrent.l lVar2 = lVar.f48086d;
            int i10 = lVar.f48083a;
            int i11 = i10 & i6;
            j$.util.concurrent.l lVarK = k(lVarArr, i11);
            if (lVarK == null) {
                z10 = true;
            } else {
                java.lang.Object obj2 = lVar.f48084b;
                if (lVarK.f48083a >= 0) {
                    j$.util.concurrent.l lVar3 = lVarK;
                    int i12 = 0;
                    while (true) {
                        if (lVar3 == null) {
                            z6 = true;
                            break;
                        }
                        if (lVar3.f48083a == i10 && ((obj = lVar3.f48084b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z6 = false;
                            break;
                        } else {
                            i12++;
                            lVar3 = lVar3.f48086d;
                        }
                    }
                    if (!z6 || i12 < 8) {
                        z10 = z6;
                    } else {
                        long j13 = j10 + 1;
                        lVar.f48086d = lVarK;
                        j$.util.concurrent.l lVar4 = lVar;
                        j$.util.concurrent.r rVar = null;
                        j$.util.concurrent.r rVar2 = null;
                        while (lVar4 != null) {
                            long j14 = j13;
                            j$.util.concurrent.r rVar3 = new j$.util.concurrent.r(lVar4.f48083a, lVar4.f48084b, lVar4.f48085c, null, null);
                            rVar3.f48107h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f48086d = rVar3;
                            }
                            lVar4 = lVar4.f48086d;
                            rVar2 = rVar3;
                            j13 = j14;
                        }
                        h(lVarArr, i11, new j$.util.concurrent.q(rVar));
                        j10 = j13;
                    }
                } else if (((j$.util.concurrent.q) lVarK).e(i10, obj2, lVar.f48085c) == null) {
                    j10 += j6;
                }
                z10 = false;
            }
            if (z10) {
                j10++;
                lVar.f48086d = lVarK;
                h(lVarArr, i11, lVar);
            }
            j6 = 1;
            lVar = lVar2;
        }
        this.f48058a = lVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j10;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        int i6 = 0;
        int i10 = 1;
        while (i10 < 16) {
            i6++;
            i10 <<= 1;
        }
        int i11 = 32 - i6;
        int i12 = i10 - 1;
        j$.util.concurrent.n[] nVarArr = new j$.util.concurrent.n[16];
        for (int i13 = 0; i13 < 16; i13++) {
            nVarArr[i13] = new j$.util.concurrent.n();
        }
        java.io.ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", nVarArr);
        putFieldPutFields.put("segmentShift", i11);
        putFieldPutFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        if (lVarArr != null) {
            j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                j$.util.concurrent.l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(lVarA.f48084b);
                objectOutputStream.writeObject(lVarA.f48085c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        j$.util.concurrent.l lVarK;
        j$.util.concurrent.l lVar;
        j$.util.concurrent.l[] lVarArrD = this.f48058a;
        long j6 = 0;
        loop0: while (true) {
            int i6 = 0;
            while (true) {
                if (lVarArrD == null || i6 >= lVarArrD.length) {
                    break loop0;
                }
                lVarK = k(lVarArrD, i6);
                if (lVarK == null) {
                    i6++;
                } else {
                    int i10 = lVarK.f48083a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (lVarK) {
                        try {
                            if (k(lVarArrD, i6) == lVarK) {
                                if (i10 >= 0) {
                                    lVar = lVarK;
                                } else {
                                    lVar = lVarK instanceof j$.util.concurrent.q ? ((j$.util.concurrent.q) lVarK).f48102f : null;
                                }
                                while (lVar != null) {
                                    j6--;
                                    lVar = lVar.f48086d;
                                }
                                h(lVarArrD, i6, null);
                                i6++;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            lVarArrD = d(lVarArrD, lVarK);
        }
        if (j6 != 0) {
            a(j6, -1);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0044 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0043 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        j$.util.concurrent.r rVarB;
        java.lang.Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i6 = i(obj.hashCode());
        j$.util.concurrent.l[] lVarArrE = this.f48058a;
        int i10 = 0;
        java.lang.Object objApply = null;
        int i11 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i12 = (length - 1) & i6;
                    j$.util.concurrent.l lVarK = k(lVarArrE, i12);
                    if (lVarK == null) {
                        break;
                    }
                    int i13 = lVarK.f48083a;
                    if (i13 == -1) {
                        lVarArrE = d(lVarArrE, lVarK);
                    } else {
                        synchronized (lVarK) {
                            try {
                                if (k(lVarArrE, i12) == lVarK) {
                                    if (i13 >= 0) {
                                        i11 = 1;
                                        j$.util.concurrent.l lVar = null;
                                        j$.util.concurrent.l lVar2 = lVarK;
                                        while (true) {
                                            if (lVar2.f48083a == i6 && ((obj2 = lVar2.f48084b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = biFunction.apply(obj, lVar2.f48085c);
                                                if (objApply == null) {
                                                    j$.util.concurrent.l lVar3 = lVar2.f48086d;
                                                    if (lVar != null) {
                                                        lVar.f48086d = lVar3;
                                                    } else {
                                                        h(lVarArrE, i12, lVar3);
                                                    }
                                                    i10 = -1;
                                                    break;
                                                }
                                                lVar2.f48085c = objApply;
                                                break;
                                            }
                                            j$.util.concurrent.l lVar4 = lVar2.f48086d;
                                            if (lVar4 == null) {
                                                break;
                                            }
                                            i11++;
                                            lVar = lVar2;
                                            lVar2 = lVar4;
                                        }
                                    } else if (lVarK instanceof j$.util.concurrent.q) {
                                        j$.util.concurrent.q qVar = (j$.util.concurrent.q) lVarK;
                                        j$.util.concurrent.r rVar = qVar.f48101e;
                                        if (rVar != null && (rVarB = rVar.b(i6, obj, null)) != null) {
                                            objApply = biFunction.apply(obj, rVarB.f48085c);
                                            if (objApply != null) {
                                                rVarB.f48085c = objApply;
                                            } else {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i12, p(qVar.f48102f));
                                                }
                                                i10 = -1;
                                            }
                                        }
                                        i11 = 2;
                                    } else if (lVarK instanceof j$.util.concurrent.m) {
                                        throw new java.lang.IllegalStateException("Recursive update");
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return objApply;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        obj.getClass();
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        if (lVarArr != null) {
            j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                j$.util.concurrent.l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                java.lang.Object obj2 = lVarA.f48085c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    final j$.util.concurrent.l[] d(j$.util.concurrent.l[] lVarArr, j$.util.concurrent.l lVar) {
        j$.util.concurrent.l[] lVarArr2;
        int i6;
        if (!(lVar instanceof j$.util.concurrent.g) || (lVarArr2 = ((j$.util.concurrent.g) lVar).f48076e) == null) {
            return this.f48058a;
        }
        int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
        while (lVarArr2 == this.f48059b && this.f48058a == lVarArr && (i6 = this.sizeCtl) < 0 && (i6 >>> 16) == iNumberOfLeadingZeros && i6 != iNumberOfLeadingZeros + 1 && i6 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
            if (f48050h.c(this, f48051i, i6, i6 + 1)) {
                m(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        j$.util.concurrent.e eVar = this.f48063f;
        if (eVar != null) {
            return eVar;
        }
        j$.util.concurrent.e eVar2 = new j$.util.concurrent.e(this);
        this.f48063f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        V value;
        V v6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, length, 0, length);
        while (true) {
            j$.util.concurrent.l lVarA = pVar.a();
            if (lVarA == null) {
                for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v6 = get(key)) == null || (value != v6 && !value.equals(v6))) {
                        return false;
                    }
                }
                return true;
            }
            java.lang.Object obj2 = lVarA.f48085c;
            java.lang.Object obj3 = map.get(lVarA.f48084b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, boolean z6) {
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int i6 = i(obj.hashCode());
        j$.util.concurrent.l[] lVarArrE = this.f48058a;
        int i10 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i11 = (length - 1) & i6;
                    j$.util.concurrent.l lVarK = k(lVarArrE, i11);
                    if (lVarK != null) {
                        int i12 = lVarK.f48083a;
                        if (i12 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            if (z6 && i12 == i6 && (((obj5 = lVarK.f48084b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = lVarK.f48085c) != null)) {
                                return obj6;
                            }
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i11) != lVarK) {
                                        obj3 = null;
                                    } else if (i12 >= 0) {
                                        i10 = 1;
                                        j$.util.concurrent.l lVar = lVarK;
                                        while (true) {
                                            if (lVar.f48083a != i6 || ((obj4 = lVar.f48084b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                j$.util.concurrent.l lVar2 = lVar.f48086d;
                                                if (lVar2 == null) {
                                                    lVar.f48086d = new j$.util.concurrent.l(i6, obj, obj2);
                                                    obj3 = null;
                                                } else {
                                                    i10++;
                                                    lVar = lVar2;
                                                }
                                            } else {
                                                obj3 = lVar.f48085c;
                                                if (!z6) {
                                                    lVar.f48085c = obj2;
                                                }
                                            }
                                        }
                                    } else if (lVarK instanceof j$.util.concurrent.q) {
                                        j$.util.concurrent.r rVarE = ((j$.util.concurrent.q) lVarK).e(i6, obj, obj2);
                                        if (rVarE != null) {
                                            java.lang.Object obj7 = rVarE.f48085c;
                                            if (!z6) {
                                                rVarE.f48085c = obj2;
                                            }
                                            obj3 = obj7;
                                        } else {
                                            obj3 = null;
                                        }
                                        i10 = 2;
                                    } else {
                                        if (lVarK instanceof j$.util.concurrent.m) {
                                            throw new java.lang.IllegalStateException("Recursive update");
                                        }
                                        obj3 = null;
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(lVarArrE, i11);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    } else if (b(lVarArrE, i11, new j$.util.concurrent.l(i6, obj, obj2))) {
                        break;
                    }
                }
            }
            lVarArrE = e();
        }
        a(1L, i10);
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(java.util.function.BiConsumer biConsumer) {
        biConsumer.getClass();
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        if (lVarArr == null) {
            return;
        }
        j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            j$.util.concurrent.l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.f48084b, lVarA.f48085c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00ad A[PHI: r7
  0x00ad: PHI (r7v3 boolean) = 
  (r7v1 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
 binds: [B:67:0x00ac, B:48:0x0077, B:50:0x007d, B:54:0x0085, B:56:0x008b, B:43:0x0069, B:32:0x004b, B:34:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int length;
        int i6;
        j$.util.concurrent.l lVarK;
        boolean z6;
        java.lang.Object obj4;
        j$.util.concurrent.r rVarB;
        j$.util.concurrent.l lVarP;
        java.lang.Object obj5;
        int i10 = i(obj.hashCode());
        j$.util.concurrent.l[] lVarArrD = this.f48058a;
        while (lVarArrD != null && (length = lVarArrD.length) != 0 && (lVarK = k(lVarArrD, (i6 = (length - 1) & i10))) != null) {
            int i11 = lVarK.f48083a;
            if (i11 == -1) {
                lVarArrD = d(lVarArrD, lVarK);
            } else {
                synchronized (lVarK) {
                    try {
                        if (k(lVarArrD, i6) == lVarK) {
                            z6 = true;
                            if (i11 >= 0) {
                                j$.util.concurrent.l lVar = null;
                                j$.util.concurrent.l lVar2 = lVarK;
                                while (true) {
                                    if (lVar2.f48083a != i10 || ((obj5 = lVar2.f48084b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        j$.util.concurrent.l lVar3 = lVar2.f48086d;
                                        if (lVar3 != null) {
                                            lVar = lVar2;
                                            lVar2 = lVar3;
                                        }
                                    } else {
                                        obj4 = lVar2.f48085c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                lVar2.f48085c = obj2;
                                            } else if (lVar != null) {
                                                lVar.f48086d = lVar2.f48086d;
                                            } else {
                                                lVarP = lVar2.f48086d;
                                                h(lVarArrD, i6, lVarP);
                                            }
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else if (lVarK instanceof j$.util.concurrent.q) {
                                j$.util.concurrent.q qVar = (j$.util.concurrent.q) lVarK;
                                j$.util.concurrent.r rVar = qVar.f48101e;
                                if (rVar == null || (rVarB = rVar.b(i10, obj, null)) == null) {
                                    obj4 = null;
                                } else {
                                    obj4 = rVarB.f48085c;
                                    if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                        obj4 = null;
                                    } else if (obj2 != null) {
                                        rVarB.f48085c = obj2;
                                    } else if (qVar.f(rVarB)) {
                                        lVarP = p(qVar.f48102f);
                                        h(lVarArrD, i6, lVarP);
                                    }
                                }
                            } else {
                                if (lVarK instanceof j$.util.concurrent.m) {
                                    throw new java.lang.IllegalStateException("Recursive update");
                                }
                                z6 = false;
                                obj4 = null;
                            }
                        } else {
                            z6 = false;
                            obj4 = null;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        int length;
        j$.util.concurrent.l lVarK;
        java.lang.Object obj2;
        int i6 = i(obj.hashCode());
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        if (lVarArr != null && (length = lVarArr.length) > 0 && (lVarK = k(lVarArr, (length - 1) & i6)) != null) {
            int i10 = lVarK.f48083a;
            if (i10 == i6) {
                java.lang.Object obj3 = lVarK.f48084b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) lVarK.f48085c;
                }
            } else if (i10 < 0) {
                j$.util.concurrent.l lVarA = lVarK.a(i6, obj);
                if (lVarA != null) {
                    return (V) lVarA.f48085c;
                }
                return null;
            }
            while (true) {
                lVarK = lVarK.f48086d;
                if (lVarK == null) {
                    break;
                }
                if (lVarK.f48083a == i6 && ((obj2 = lVarK.f48084b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return (V) lVarK.f48085c;
                }
            }
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        V v6 = get(obj);
        return v6 == null ? obj2 : v6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        int iHashCode = 0;
        if (lVarArr != null) {
            j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                j$.util.concurrent.l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.f48085c.hashCode() ^ lVarA.f48084b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    final long j() {
        j$.util.concurrent.c[] cVarArr = this.f48060c;
        long j6 = this.baseCount;
        if (cVarArr != null) {
            for (j$.util.concurrent.c cVar : cVarArr) {
                if (cVar != null) {
                    j6 += cVar.value;
                }
            }
        }
        return j6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        j$.util.concurrent.i iVar = this.f48061d;
        if (iVar != null) {
            return iVar;
        }
        j$.util.concurrent.i iVar2 = new j$.util.concurrent.i(this);
        this.f48061d = iVar2;
        return iVar2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        int i6;
        java.lang.Object obj3;
        java.lang.Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        j$.util.concurrent.l[] lVarArrE = this.f48058a;
        int i11 = 0;
        java.lang.Object obj5 = null;
        int i12 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    j$.util.concurrent.l lVarK = k(lVarArrE, i13);
                    i6 = 1;
                    if (lVarK != null) {
                        int i14 = lVarK.f48083a;
                        if (i14 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i13) == lVarK) {
                                        if (i14 >= 0) {
                                            j$.util.concurrent.l lVar = null;
                                            j$.util.concurrent.l lVar2 = lVarK;
                                            i11 = 1;
                                            while (true) {
                                                if (lVar2.f48083a == i10 && ((obj3 = lVar2.f48084b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    java.lang.Object objApply = biFunction.apply(lVar2.f48085c, obj4);
                                                    if (objApply == null) {
                                                        j$.util.concurrent.l lVar3 = lVar2.f48086d;
                                                        if (lVar != null) {
                                                            lVar.f48086d = lVar3;
                                                        } else {
                                                            h(lVarArrE, i13, lVar3);
                                                        }
                                                        obj5 = objApply;
                                                        i12 = -1;
                                                        break;
                                                    }
                                                    lVar2.f48085c = objApply;
                                                    obj5 = objApply;
                                                    break;
                                                }
                                                j$.util.concurrent.l lVar4 = lVar2.f48086d;
                                                if (lVar4 == null) {
                                                    lVar2.f48086d = new j$.util.concurrent.l(i10, obj, obj4);
                                                    obj5 = obj4;
                                                    i12 = 1;
                                                    break;
                                                }
                                                i11++;
                                                lVar = lVar2;
                                                lVar2 = lVar4;
                                            }
                                        } else if (lVarK instanceof j$.util.concurrent.q) {
                                            j$.util.concurrent.q qVar = (j$.util.concurrent.q) lVarK;
                                            j$.util.concurrent.r rVar = qVar.f48101e;
                                            j$.util.concurrent.r rVarB = rVar == null ? null : rVar.b(i10, obj, null);
                                            java.lang.Object objApply2 = rVarB == null ? obj4 : biFunction.apply(rVarB.f48085c, obj4);
                                            if (objApply2 != null) {
                                                if (rVarB != null) {
                                                    rVarB.f48085c = objApply2;
                                                } else {
                                                    qVar.e(i10, obj, objApply2);
                                                    i12 = 1;
                                                }
                                            } else if (rVarB != null) {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i13, p(qVar.f48102f));
                                                }
                                                i12 = -1;
                                            }
                                            i11 = 2;
                                            obj5 = objApply2;
                                        } else if (lVarK instanceof j$.util.concurrent.m) {
                                            throw new java.lang.IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(lVarArrE, i13);
                                }
                                i6 = i12;
                                obj4 = obj5;
                                break;
                            }
                        }
                    } else if (b(lVarArrE, i13, new j$.util.concurrent.l(i10, obj, obj4))) {
                        break;
                    }
                }
            }
            lVarArrE = e();
        }
        if (i6 != 0) {
            a(i6, i11);
        }
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k6, V v6) {
        return (V) f(k6, v6, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        o(map.size());
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k6, V v6) {
        return (V) f(k6, v6, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        if (lVarArr == null) {
            return;
        }
        j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            j$.util.concurrent.l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            java.lang.Object obj = lVarA.f48085c;
            java.lang.Object obj2 = lVarA.f48084b;
            do {
                java.lang.Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j6 = j();
        if (j6 < 0) {
            return 0;
        }
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j6;
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        j$.util.concurrent.l[] lVarArr = this.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, length, 0, length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        j$.util.concurrent.l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                java.lang.Object obj = lVarA.f48084b;
                java.lang.Object obj2 = lVarA.f48085c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
        j$.util.concurrent.s sVar = this.f48062e;
        if (sVar != null) {
            return sVar;
        }
        j$.util.concurrent.s sVar2 = new j$.util.concurrent.s(this);
        this.f48062e = sVar2;
        return sVar2;
    }
}
