package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44874k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f44875a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44877c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p051f0.f f44881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f0.u.a f44883i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f44876b = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.p f44878d = new f0.u.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f44879e = new f0.u.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X.b f44880f = new X.b(new f0.u.a[16], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f44884j = -1;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p237x7.l f44885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Object f44886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p170r.H f44887c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f44894j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f44888d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final X.f f44889e = new X.f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p170r.K f44890f = new p170r.K(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p170r.L f44891g = new p170r.L(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final X.b f44892h = new X.b(new V.J[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final V.K f44893i = new f0.u.a.C0501a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final X.f f44895k = new X.f();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final java.util.HashMap f44896l = new java.util.HashMap();

        /* JADX INFO: renamed from: f0.u$a$a, reason: collision with other inner class name */
        public static final class C0501a implements V.K {
            C0501a() {
            }

            @Override // V.K
            public void a(V.J j6) {
                f0.u.a.this.f44894j++;
            }

            @Override // V.K
            public void b(V.J j6) {
                f0.u.a.this.f44894j--;
            }
        }

        public a(p237x7.l lVar) {
            this.f44885a = lVar;
        }

        private final void d(java.lang.Object obj) {
            int i6 = this.f44888d;
            p170r.H h6 = this.f44887c;
            if (h6 == null) {
                return;
            }
            long[] jArr = h6.f53316a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i10 << 3) + i12;
                            java.lang.Object obj2 = h6.f53317b[i13];
                            boolean z6 = h6.f53318c[i13] != i6;
                            if (z6) {
                                m(obj, obj2);
                            }
                            if (z6) {
                                h6.q(i13);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0089 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x008b A[LOOP:0: B:11:0x003b->B:26:0x008b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:36:0x008f A[EDGE_INSN: B:36:0x008f->B:27:0x008f BREAK  A[LOOP:0: B:11:0x003b->B:26:0x008b], SYNTHETIC] */
        private final void l(java.lang.Object obj, int i6, java.lang.Object obj2, p170r.H h6) {
            int i10;
            int i11;
            if (this.f44894j > 0) {
                return;
            }
            int iP = h6.p(obj, i6, -1);
            if (!(obj instanceof V.J) || iP == i6) {
                i10 = -1;
            } else {
                V.J.a aVarP = ((V.J) obj).p();
                this.f44896l.put(obj, aVarP.a());
                p170r.N nB = aVarP.b();
                X.f fVar = this.f44895k;
                fVar.g(obj);
                java.lang.Object[] objArr = nB.f53317b;
                long[] jArr = nB.f53316a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j6 = jArr[i12];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                        } else {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j6 & 255) < 128) {
                                    p051f0.y yVar = (p051f0.y) objArr[(i12 << 3) + i15];
                                    if (yVar instanceof p051f0.z) {
                                        ((p051f0.z) yVar).r(p051f0.g.a(2));
                                    }
                                    fVar.a(yVar, obj);
                                    i11 = 8;
                                } else {
                                    i11 = i13;
                                }
                                j6 >>= i11;
                                i15++;
                                i13 = i11;
                            }
                            if (i14 != i13) {
                                break;
                            } else if (i12 != length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                i10 = -1;
            }
            if (iP == i10) {
                if (obj instanceof p051f0.z) {
                    ((p051f0.z) obj).r(p051f0.g.a(2));
                }
                this.f44889e.a(obj, obj2);
            }
        }

        private final void m(java.lang.Object obj, java.lang.Object obj2) {
            this.f44889e.f(obj2, obj);
            if (!(obj2 instanceof V.J) || this.f44889e.c(obj2)) {
                return;
            }
            this.f44895k.g(obj2);
            this.f44896l.remove(obj2);
        }

        public final void c() {
            this.f44889e.b();
            this.f44890f.i();
            this.f44895k.b();
            this.f44896l.clear();
        }

        public final void e(java.lang.Object obj) {
            p170r.H h6 = (p170r.H) this.f44890f.p(obj);
            if (h6 == null) {
                return;
            }
            java.lang.Object[] objArr = h6.f53317b;
            int[] iArr = h6.f53318c;
            long[] jArr = h6.f53316a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            int i12 = (i6 << 3) + i11;
                            java.lang.Object obj2 = objArr[i12];
                            int i13 = iArr[i12];
                            m(obj, obj2);
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i6 == length) {
                    return;
                } else {
                    i6++;
                }
            }
        }

        public final p237x7.l f() {
            return this.f44885a;
        }

        public final boolean g() {
            return this.f44890f.g();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0011->B:15:0x0046, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0046], SYNTHETIC] */
        public final void h() {
            p170r.L l6 = this.f44891g;
            p237x7.l lVar = this.f44885a;
            java.lang.Object[] objArr = l6.f53341b;
            long[] jArr = l6.f53340a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j6 = jArr[i6];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i10 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j6) < 128) {
                                lVar.l(objArr[(i6 << 3) + i11]);
                            }
                            j6 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i6 != length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
            l6.m();
        }

        public final void i(java.lang.Object obj, p237x7.l lVar, p237x7.a aVar) {
            java.lang.Object obj2 = this.f44886b;
            p170r.H h6 = this.f44887c;
            int i6 = this.f44888d;
            this.f44886b = obj;
            this.f44887c = (p170r.H) this.f44890f.c(obj);
            if (this.f44888d == -1) {
                this.f44888d = p051f0.p.H().f();
            }
            V.K k6 = this.f44893i;
            X.b bVarC = V.v1.c();
            try {
                bVarC.d(k6);
                p051f0.k.f44821e.h(lVar, null, aVar);
                bVarC.D(bVarC.t() - 1);
                java.lang.Object obj3 = this.f44886b;
                p247y7.AbstractC7350t.c(obj3);
                d(obj3);
                this.f44886b = obj2;
                this.f44887c = h6;
                this.f44888d = i6;
            } catch (java.lang.Throwable th) {
                bVarC.D(bVarC.t() - 1);
                throw th;
            }
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16991. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        public final boolean j(java.util.Set r43) {
            /*
                Method dump skipped, instruction units count: 1699
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.u.a.j(java.util.Set):boolean");
        }

        public final void k(java.lang.Object obj) {
            java.lang.Object obj2 = this.f44886b;
            p247y7.AbstractC7350t.c(obj2);
            int i6 = this.f44888d;
            p170r.H h6 = this.f44887c;
            if (h6 == null) {
                h6 = new p170r.H(0, 1, null);
                this.f44887c = h6;
                this.f44890f.s(obj2, h6);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            l(obj, i6, obj2, h6);
        }

        public final void n(p237x7.l lVar) {
            long[] jArr;
            int i6;
            long[] jArr2;
            int i10;
            long j6;
            int i11;
            long j10;
            int i12;
            p170r.K k6 = this.f44890f;
            long[] jArr3 = k6.f53333a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j11 = jArr3[i13];
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i13 << 3) + i16;
                            java.lang.Object obj = k6.f53334b[i17];
                            p170r.H h6 = (p170r.H) k6.f53335c[i17];
                            java.lang.Boolean bool = (java.lang.Boolean) lVar.l(obj);
                            if (bool.booleanValue()) {
                                java.lang.Object[] objArr = h6.f53317b;
                                int[] iArr = h6.f53318c;
                                long[] jArr4 = h6.f53316a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i11 = i15;
                                    int i18 = 0;
                                    while (true) {
                                        long j13 = jArr4[i18];
                                        i10 = i13;
                                        j6 = j11;
                                        j10 = -9187201950435737472L;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                if ((j13 & 255) < 128) {
                                                    int i21 = (i18 << 3) + i20;
                                                    java.lang.Object obj2 = objArr[i21];
                                                    int i22 = iArr[i21];
                                                    m(obj, obj2);
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i19 != 8) {
                                                break;
                                            }
                                        }
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        i13 = i10;
                                        j11 = j6;
                                    }
                                } else {
                                    i10 = i13;
                                    j6 = j11;
                                    i11 = i15;
                                    j10 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i10 = i13;
                                j6 = j11;
                                i11 = i15;
                                j10 = j12;
                            }
                            if (bool.booleanValue()) {
                                k6.q(i17);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = i13;
                            j6 = j11;
                            i11 = i15;
                            j10 = j12;
                            i12 = i14;
                        }
                        j11 = j6 >> i12;
                        i16++;
                        i14 = i12;
                        j12 = j10;
                        jArr3 = jArr2;
                        i15 = i11;
                        i13 = i10;
                    }
                    jArr = jArr3;
                    int i23 = i13;
                    if (i15 != i14) {
                        return;
                    } else {
                        i6 = i23;
                    }
                } else {
                    jArr = jArr3;
                    i6 = i13;
                }
                if (i6 == length) {
                    return;
                }
                i13 = i6 + 1;
                jArr3 = jArr;
            }
        }

        public final void o(V.J j6) {
            long[] jArr;
            int i6;
            p170r.H h6;
            p170r.K k6 = this.f44890f;
            int iF = p051f0.p.H().f();
            java.lang.Object objC = this.f44889e.d().c(j6);
            if (objC == null) {
                return;
            }
            if (!(objC instanceof p170r.L)) {
                p170r.H h10 = (p170r.H) k6.c(objC);
                if (h10 == null) {
                    h10 = new p170r.H(0, 1, null);
                    k6.s(objC, h10);
                    p087i7.M m6 = p087i7.M.f46721a;
                }
                l(j6, iF, objC, h10);
                return;
            }
            p170r.L l6 = (p170r.L) objC;
            java.lang.Object[] objArr = l6.f53341b;
            long[] jArr2 = l6.f53340a;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            java.lang.Object obj = objArr[(i10 << 3) + i13];
                            p170r.H h11 = (p170r.H) k6.c(obj);
                            if (h11 == null) {
                                h6 = new p170r.H(0, 1, null);
                                k6.s(obj, h6);
                                p087i7.M m10 = p087i7.M.f46721a;
                            } else {
                                h6 = h11;
                            }
                            l(j6, iF, obj, h6);
                            i6 = 8;
                        } else {
                            i6 = i11;
                        }
                        j10 >>= i6;
                        i13++;
                        i11 = i6;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i12 != i11) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                jArr2 = jArr;
            }
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {
        b() {
            super(2);
        }

        public final void a(java.util.Set set, p051f0.k kVar) {
            p051f0.u.this.i(set);
            if (p051f0.u.this.m()) {
                p051f0.u.this.r();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((java.util.Set) obj, (p051f0.k) obj2);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final void a(java.lang.Object obj) {
            if (p051f0.u.this.f44882h) {
                return;
            }
            X.b bVar = p051f0.u.this.f44880f;
            p051f0.u uVar = p051f0.u.this;
            synchronized (bVar) {
                f0.u.a aVar = uVar.f44883i;
                p247y7.AbstractC7350t.c(aVar);
                aVar.k(obj);
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        public final void a() {
            do {
                X.b bVar = p051f0.u.this.f44880f;
                p051f0.u uVar = p051f0.u.this;
                synchronized (bVar) {
                    try {
                        if (!uVar.f44877c) {
                            uVar.f44877c = true;
                            try {
                                X.b bVar2 = uVar.f44880f;
                                int iT = bVar2.t();
                                if (iT > 0) {
                                    java.lang.Object[] objArrS = bVar2.s();
                                    int i6 = 0;
                                    do {
                                        ((f0.u.a) objArrS[i6]).h();
                                        i6++;
                                    } while (i6 < iT);
                                }
                                uVar.f44877c = false;
                            } catch (java.lang.Throwable th) {
                                uVar.f44877c = false;
                                throw th;
                            }
                        }
                        p087i7.M m6 = p087i7.M.f46721a;
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
            } while (p051f0.u.this.m());
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public u(p237x7.l lVar) {
        this.f44875a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(java.util.Set set) {
        java.lang.Object obj;
        java.util.List listC0;
        java.util.List list;
        do {
            obj = this.f44876b.get();
            if (obj == null) {
                list = set;
            } else {
                if (obj instanceof java.util.Set) {
                    listC0 = p097j7.AbstractC6879v.p(obj, set);
                } else {
                    if (!(obj instanceof java.util.List)) {
                        q();
                        throw new p087i7.C6665k();
                    }
                    listC0 = p097j7.AbstractC6879v.C0((java.util.Collection) obj, p097j7.AbstractC6879v.e(set));
                }
                list = listC0;
            }
        } while (!p200u.AbstractC7162c0.a(this.f44876b, obj, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z6;
        synchronized (this.f44880f) {
            z6 = this.f44877c;
        }
        if (z6) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            java.util.Set setP = p();
            if (setP == null) {
                return z10;
            }
            synchronized (this.f44880f) {
                try {
                    X.b bVar = this.f44880f;
                    int iT = bVar.t();
                    if (iT > 0) {
                        java.lang.Object[] objArrS = bVar.s();
                        int i6 = 0;
                        do {
                            z10 = ((f0.u.a) objArrS[i6]).j(setP) || z10;
                            i6++;
                        } while (i6 < iT);
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final f0.u.a n(p237x7.l lVar) {
        java.lang.Object obj;
        X.b bVar = this.f44880f;
        int iT = bVar.t();
        if (iT <= 0) {
            obj = null;
            break;
        }
        java.lang.Object[] objArrS = bVar.s();
        int i6 = 0;
        while (true) {
            obj = objArrS[i6];
            if (((f0.u.a) obj).f() == lVar) {
                break;
            }
            i6++;
            if (i6 >= iT) {
                obj = null;
                break;
            }
        }
        f0.u.a aVar = (f0.u.a) obj;
        if (aVar != null) {
            return aVar;
        }
        p247y7.AbstractC7350t.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        f0.u.a aVar2 = new f0.u.a((p237x7.l) p247y7.W.f(lVar, 1));
        this.f44880f.d(aVar2);
        return aVar2;
    }

    private final java.util.Set p() {
        java.lang.Object obj;
        java.lang.Object objSubList;
        java.util.Set set;
        do {
            obj = this.f44876b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof java.util.Set) {
                set = (java.util.Set) obj;
            } else {
                if (!(obj instanceof java.util.List)) {
                    q();
                    throw new p087i7.C6665k();
                }
                java.util.List list = (java.util.List) obj;
                java.util.Set set2 = (java.util.Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!p200u.AbstractC7162c0.a(this.f44876b, obj, objSubList));
        return set;
    }

    private final java.lang.Void q() {
        V.AbstractC1741q.s("Unexpected notification");
        throw new p087i7.C6665k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.f44875a.l(new f0.u.d());
    }

    public final void j() {
        synchronized (this.f44880f) {
            try {
                X.b bVar = this.f44880f;
                int iT = bVar.t();
                if (iT > 0) {
                    java.lang.Object[] objArrS = bVar.s();
                    int i6 = 0;
                    do {
                        ((f0.u.a) objArrS[i6]).c();
                        i6++;
                    } while (i6 < iT);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void k(java.lang.Object obj) {
        synchronized (this.f44880f) {
            try {
                X.b bVar = this.f44880f;
                int iT = bVar.t();
                int i6 = 0;
                for (int i10 = 0; i10 < iT; i10++) {
                    f0.u.a aVar = (f0.u.a) bVar.s()[i10];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i6++;
                    } else if (i6 > 0) {
                        bVar.s()[i10 - i6] = bVar.s()[i10];
                    }
                }
                int i11 = iT - i6;
                p097j7.AbstractC6872n.w(bVar.s(), null, i11, iT);
                bVar.M(i11);
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void l(p237x7.l lVar) {
        synchronized (this.f44880f) {
            try {
                X.b bVar = this.f44880f;
                int iT = bVar.t();
                int i6 = 0;
                for (int i10 = 0; i10 < iT; i10++) {
                    f0.u.a aVar = (f0.u.a) bVar.s()[i10];
                    aVar.n(lVar);
                    if (!aVar.g()) {
                        i6++;
                    } else if (i6 > 0) {
                        bVar.s()[i10 - i6] = bVar.s()[i10];
                    }
                }
                int i11 = iT - i6;
                p097j7.AbstractC6872n.w(bVar.s(), null, i11, iT);
                bVar.M(i11);
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void o(java.lang.Object obj, p237x7.l lVar, p237x7.a aVar) {
        f0.u.a aVarN;
        synchronized (this.f44880f) {
            aVarN = n(lVar);
        }
        boolean z6 = this.f44882h;
        f0.u.a aVar2 = this.f44883i;
        long j6 = this.f44884j;
        if (j6 != -1) {
            if (!(j6 == V.AbstractC1701c.a())) {
                V.I0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j6 + "), currentThread={id=" + V.AbstractC1701c.a() + ", name=" + V.AbstractC1701c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f44882h = false;
            this.f44883i = aVarN;
            this.f44884j = V.AbstractC1701c.a();
            aVarN.i(obj, this.f44879e, aVar);
        } finally {
            this.f44883i = aVar2;
            this.f44882h = z6;
            this.f44884j = j6;
        }
    }

    public final void s() {
        this.f44881g = p051f0.k.f44821e.i(this.f44878d);
    }

    public final void t() {
        p051f0.f fVar = this.f44881g;
        if (fVar != null) {
            fVar.e();
        }
    }
}
