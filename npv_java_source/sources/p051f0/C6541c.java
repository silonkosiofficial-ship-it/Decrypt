package p051f0;

/* JADX INFO: renamed from: f0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6541c extends p051f0.k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final p051f0.C6541c.a f44800p = new p051f0.C6541c.a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f44801q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f44802r = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.l f44803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p237x7.l f44804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p170r.L f44806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.util.List f44807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p051f0.n f44808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f44809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44811o;

    /* JADX INFO: renamed from: f0.c$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C6541c(int i6, p051f0.n nVar, p237x7.l lVar, p237x7.l lVar2) {
        super(i6, nVar, null);
        this.f44803g = lVar;
        this.f44804h = lVar2;
        this.f44808l = p051f0.n.f44834G.a();
        this.f44809m = f44802r;
        this.f44810n = 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074 A[LOOP:0: B:7:0x001c->B:24:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[EDGE_INSN: B:28:0x0077->B:25:0x0077 BREAK  A[LOOP:0: B:7:0x001c->B:24:0x0074], SYNTHETIC] */
    private final void A() {
        p170r.L lE = E();
        if (lE != null) {
            R();
            P(null);
            int iF = f();
            java.lang.Object[] objArr = lE.f53341b;
            long[] jArr = lE.f53340a;
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
                                for (p051f0.A aE = ((p051f0.y) objArr[(i6 << 3) + i11]).e(); aE != null; aE = aE.e()) {
                                    if (aE.f() == iF || p097j7.AbstractC6879v.Z(this.f44808l, java.lang.Integer.valueOf(aE.f()))) {
                                        aE.h(0);
                                    }
                                }
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
        }
        b();
    }

    private final void N() {
        int length = this.f44809m.length;
        for (int i6 = 0; i6 < length; i6++) {
            p051f0.p.Y(this.f44809m[i6]);
        }
    }

    private final void R() {
        if (!this.f44811o) {
            return;
        }
        V.I0.b("Unsupported operation on a snapshot that has been applied");
    }

    private final void S() {
        if (!this.f44811o || ((p051f0.k) this).f44826d >= 0) {
            return;
        }
        V.I0.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        J(f());
        p087i7.M m6 = p087i7.M.f46721a;
        if (D() || e()) {
            return;
        }
        int iF = f();
        synchronized (p051f0.p.I()) {
            int i6 = p051f0.p.f44850e;
            p051f0.p.f44850e = i6 + 1;
            u(i6);
            p051f0.p.f44849d = p051f0.p.f44849d.N(f());
        }
        v(p051f0.p.z(g(), iF + 1, f()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0198 A[EDGE_INSN: B:109:0x0198->B:85:0x0198 BREAK  A[LOOP:2: B:70:0x015c->B:84:0x0196], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0198 A[EDGE_INSN: B:110:0x0198->B:85:0x0198 BREAK  A[LOOP:2: B:70:0x015c->B:84:0x0196], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0150 A[EDGE_INSN: B:115:0x0150->B:66:0x0150 BREAK  A[LOOP:5: B:50:0x0111->B:65:0x014d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0150 A[EDGE_INSN: B:116:0x0150->B:66:0x0150 BREAK  A[LOOP:5: B:50:0x0111->B:65:0x014d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7 A[LOOP:0: B:34:0x00c5->B:35:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5 A[LOOP:1: B:40:0x00e3->B:41:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0125 A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x012d A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d A[Catch: all -> 0x0139, LOOP:5: B:50:0x0111->B:65:0x014d, LOOP_END, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0152 A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167 A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0173 A[Catch: all -> 0x0139, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x017b A[Catch: all -> 0x0139, TRY_LEAVE, TryCatch #2 {all -> 0x0139, blocks: (B:47:0x0107, B:50:0x0111, B:52:0x011b, B:54:0x0125, B:56:0x012d, B:59:0x013e, B:65:0x014d, B:67:0x0152, B:70:0x015c, B:72:0x0167, B:75:0x0173, B:77:0x017b), top: B:105:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x018f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0196 A[LOOP:2: B:70:0x015c->B:84:0x0196, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x019e A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:44:0x00f5, B:86:0x019a, B:88:0x019e, B:90:0x01a5, B:93:0x01b3), top: B:101:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a5 A[Catch: all -> 0x01b1, LOOP:4: B:89:0x01a3->B:90:0x01a5, LOOP_END, TryCatch #0 {all -> 0x01b1, blocks: (B:44:0x00f5, B:86:0x019a, B:88:0x019e, B:90:0x01a5, B:93:0x01b3), top: B:101:0x00f5 }] */
    public p051f0.l C() throws java.lang.Throwable {
        p170r.L lE;
        java.lang.Object[] objArr;
        long[] jArr;
        int length;
        int i6;
        long j6;
        int i10;
        int i11;
        java.util.List list;
        int size;
        int i12;
        java.lang.Object[] objArr2;
        long[] jArr2;
        int length2;
        int i13;
        long j10;
        int i14;
        int i15;
        int i16;
        java.util.Set setA;
        int size2;
        int i17;
        java.util.Set setA2;
        int size3;
        int i18;
        p170r.L lE2 = E();
        java.util.Map mapR = lE2 != null ? p051f0.p.R((p051f0.C6541c) p051f0.p.f44855j.get(), this, p051f0.p.f44849d.C(((p051f0.C6539a) p051f0.p.f44855j.get()).f())) : null;
        java.util.List listM = p097j7.AbstractC6879v.m();
        synchronized (p051f0.p.I()) {
            try {
                p051f0.p.g0(this);
                if (lE2 == null || lE2.c() == 0) {
                    c();
                    p051f0.C6539a c6539a = (p051f0.C6539a) p051f0.p.f44855j.get();
                    p051f0.p.a0(c6539a, p051f0.p.f44846a);
                    lE = c6539a.E();
                    if (lE == null || !lE.e()) {
                        lE = null;
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                    this.f44811o = true;
                    if (lE != null) {
                        setA2 = X.e.a(lE);
                        if (!setA2.isEmpty()) {
                            size3 = listM.size();
                            for (i18 = 0; i18 < size3; i18++) {
                                ((p237x7.p) listM.get(i18)).u(setA2, this);
                            }
                        }
                    }
                    if (lE2 != null && lE2.e()) {
                        setA = X.e.a(lE2);
                        size2 = listM.size();
                        for (i17 = 0; i17 < size2; i17++) {
                            ((p237x7.p) listM.get(i17)).u(setA, this);
                        }
                    }
                    synchronized (p051f0.p.I()) {
                        try {
                            r();
                            p051f0.p.C();
                            if (lE != null) {
                                try {
                                    objArr = lE.f53341b;
                                    jArr = lE.f53340a;
                                    length = jArr.length - 2;
                                    if (length >= 0) {
                                        i6 = 0;
                                        while (true) {
                                            j6 = jArr[i6];
                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                i10 = 8 - ((~(i6 - length)) >>> 31);
                                                for (i11 = 0; i11 < i10; i11++) {
                                                    if ((j6 & 255) < 128) {
                                                        p051f0.p.U((p051f0.y) objArr[(i6 << 3) + i11]);
                                                    }
                                                    j6 >>= 8;
                                                }
                                                if (i10 == 8) {
                                                    break;
                                                }
                                            }
                                            if (i6 != length) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            if (lE2 != null) {
                                objArr2 = lE2.f53341b;
                                jArr2 = lE2.f53340a;
                                length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    i13 = 0;
                                    while (true) {
                                        j10 = jArr2[i13];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            i15 = 8 - ((~(i13 - length2)) >>> 31);
                                            for (i16 = 0; i16 < i15; i16++) {
                                                if ((j10 & 255) < 128) {
                                                    p051f0.p.U((p051f0.y) objArr2[(i13 << 3) + i16]);
                                                }
                                                j10 >>= 8;
                                            }
                                            i14 = 1;
                                            if (i15 == 8) {
                                                break;
                                            }
                                        } else {
                                            i14 = 1;
                                        }
                                        if (i13 != length2) {
                                            break;
                                        }
                                        i13 += i14;
                                    }
                                }
                            }
                            list = this.f44807k;
                            if (list != null) {
                                size = list.size();
                                for (i12 = 0; i12 < size; i12++) {
                                    p051f0.p.U((p051f0.y) list.get(i12));
                                }
                            }
                            this.f44807k = null;
                            p087i7.M m10 = p087i7.M.f46721a;
                            return f0.l.b.f44828a;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                    }
                } else {
                    p051f0.C6539a c6539a2 = (p051f0.C6539a) p051f0.p.f44855j.get();
                    p051f0.l lVarI = I(p051f0.p.f44850e, mapR, p051f0.p.f44849d.C(c6539a2.f()));
                    if (!p247y7.AbstractC7350t.b(lVarI, f0.l.b.f44828a)) {
                        return lVarI;
                    }
                    c();
                    p051f0.p.a0(c6539a2, p051f0.p.f44846a);
                    lE = c6539a2.E();
                    P(null);
                    c6539a2.P(null);
                }
                listM = p051f0.p.f44853h;
                p087i7.M m11 = p087i7.M.f46721a;
                this.f44811o = true;
                if (lE != null) {
                    setA2 = X.e.a(lE);
                    if (!setA2.isEmpty()) {
                        size3 = listM.size();
                        while (i18 < size3) {
                            ((p237x7.p) listM.get(i18)).u(setA2, this);
                        }
                    }
                }
                if (lE2 != null) {
                    setA = X.e.a(lE2);
                    size2 = listM.size();
                    while (i17 < size2) {
                        ((p237x7.p) listM.get(i17)).u(setA, this);
                    }
                }
                synchronized (p051f0.p.I()) {
                    r();
                    p051f0.p.C();
                    if (lE != null) {
                        objArr = lE.f53341b;
                        jArr = lE.f53340a;
                        length = jArr.length - 2;
                        if (length >= 0) {
                            i6 = 0;
                            while (true) {
                                j6 = jArr[i6];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    i10 = 8 - ((~(i6 - length)) >>> 31);
                                    while (i11 < i10) {
                                        if ((j6 & 255) < 128) {
                                            p051f0.p.U((p051f0.y) objArr[(i6 << 3) + i11]);
                                        }
                                        j6 >>= 8;
                                    }
                                    if (i10 == 8) {
                                        break;
                                        break;
                                    }
                                }
                                if (i6 != length) {
                                    break;
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                    if (lE2 != null) {
                        objArr2 = lE2.f53341b;
                        jArr2 = lE2.f53340a;
                        length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            i13 = 0;
                            while (true) {
                                j10 = jArr2[i13];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    i15 = 8 - ((~(i13 - length2)) >>> 31);
                                    while (i16 < i15) {
                                        if ((j10 & 255) < 128) {
                                            p051f0.p.U((p051f0.y) objArr2[(i13 << 3) + i16]);
                                        }
                                        j10 >>= 8;
                                    }
                                    i14 = 1;
                                    if (i15 == 8) {
                                        break;
                                        break;
                                    }
                                } else {
                                    i14 = 1;
                                }
                                if (i13 != length2) {
                                    break;
                                    break;
                                }
                                i13 += i14;
                            }
                        }
                    }
                    list = this.f44807k;
                    if (list != null) {
                        size = list.size();
                        while (i12 < size) {
                            p051f0.p.U((p051f0.y) list.get(i12));
                        }
                    }
                    this.f44807k = null;
                    p087i7.M m12 = p087i7.M.f46721a;
                    return f0.l.b.f44828a;
                }
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean D() {
        return this.f44811o;
    }

    public p170r.L E() {
        return this.f44806j;
    }

    public final p051f0.n F() {
        return this.f44808l;
    }

    public final int[] G() {
        return this.f44809m;
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: H */
    public p237x7.l h() {
        return this.f44803g;
    }

    public final p051f0.l I(int i6, java.util.Map map, p051f0.n nVar) {
        p170r.L l6;
        java.util.List listC0;
        p051f0.n nVar2;
        java.lang.Object[] objArr;
        long[] jArr;
        int i10;
        p051f0.n nVar3;
        int i11;
        p051f0.A aW;
        p051f0.A aS;
        p051f0.n nVarM = g().N(f()).M(this.f44808l);
        p170r.L lE = E();
        p247y7.AbstractC7350t.c(lE);
        java.lang.Object[] objArr2 = lE.f53341b;
        long[] jArr2 = lE.f53340a;
        int length = jArr2.length - 2;
        java.util.ArrayList arrayList = null;
        if (length >= 0) {
            listC0 = null;
            int i12 = 0;
            while (true) {
                long j6 = jArr2[i12];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j6 & 255) < 128) {
                            p051f0.y yVar = (p051f0.y) objArr2[(i12 << 3) + i15];
                            p051f0.A aE = yVar.e();
                            p051f0.A aW2 = p051f0.p.W(aE, i6, nVar);
                            if (aW2 == null || (aW = p051f0.p.W(aE, f(), nVarM)) == null) {
                                nVar3 = nVarM;
                            } else {
                                nVar3 = nVarM;
                                if (aW.f() != 1 && !p247y7.AbstractC7350t.b(aW2, aW)) {
                                    p051f0.A aW3 = p051f0.p.W(aE, f(), g());
                                    if (aW3 == null) {
                                        p051f0.p.V();
                                        throw new p087i7.C6665k();
                                    }
                                    if (map == null || (aS = (p051f0.A) map.get(aW2)) == null) {
                                        aS = yVar.s(aW, aW2, aW3);
                                    }
                                    if (aS == null) {
                                        return new f0.l.a(this);
                                    }
                                    if (!p247y7.AbstractC7350t.b(aS, aW3)) {
                                        if (p247y7.AbstractC7350t.b(aS, aW2)) {
                                            if (arrayList == null) {
                                                arrayList = new java.util.ArrayList();
                                            }
                                            arrayList.add(p087i7.B.a(yVar, aW2.d()));
                                            if (listC0 == null) {
                                                listC0 = new java.util.ArrayList();
                                            }
                                            listC0.add(yVar);
                                        } else {
                                            if (arrayList == null) {
                                                arrayList = new java.util.ArrayList();
                                            }
                                            arrayList.add(!p247y7.AbstractC7350t.b(aS, aW) ? p087i7.B.a(yVar, aS) : p087i7.B.a(yVar, aW.d()));
                                        }
                                    }
                                }
                            }
                            i11 = 8;
                        } else {
                            nVar3 = nVarM;
                            i11 = i13;
                        }
                        j6 >>= i11;
                        i15++;
                        i13 = i11;
                        objArr2 = objArr2;
                        jArr2 = jArr2;
                        lE = lE;
                        nVarM = nVar3;
                    }
                    nVar2 = nVarM;
                    l6 = lE;
                    objArr = objArr2;
                    jArr = jArr2;
                    i10 = 1;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    nVar2 = nVarM;
                    l6 = lE;
                    objArr = objArr2;
                    jArr = jArr2;
                    i10 = 1;
                }
                if (i12 == length) {
                    break;
                }
                i12 += i10;
                objArr2 = objArr;
                jArr2 = jArr;
                lE = l6;
                nVarM = nVar2;
            }
        } else {
            l6 = lE;
            listC0 = null;
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                p087i7.u uVar = (p087i7.u) arrayList.get(i16);
                p051f0.y yVar2 = (p051f0.y) uVar.a();
                p051f0.A a6 = (p051f0.A) uVar.b();
                a6.h(f());
                synchronized (p051f0.p.I()) {
                    a6.g(yVar2.e());
                    yVar2.C(a6);
                    p087i7.M m6 = p087i7.M.f46721a;
                }
            }
        }
        if (listC0 != null) {
            int size2 = listC0.size();
            for (int i17 = 0; i17 < size2; i17++) {
                l6.x((p051f0.y) listC0.get(i17));
            }
            java.util.List list = this.f44807k;
            if (list != null) {
                listC0 = p097j7.AbstractC6879v.C0(list, listC0);
            }
            this.f44807k = listC0;
        }
        return f0.l.b.f44828a;
    }

    public final void J(int i6) {
        synchronized (p051f0.p.I()) {
            this.f44808l = this.f44808l.N(i6);
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public final void K(p051f0.n nVar) {
        synchronized (p051f0.p.I()) {
            this.f44808l = this.f44808l.M(nVar);
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public final void L(int i6) {
        if (i6 >= 0) {
            this.f44809m = p097j7.AbstractC6872n.E(this.f44809m, i6);
        }
    }

    public final void M(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f44809m;
        if (iArr2.length != 0) {
            iArr = p097j7.AbstractC6872n.F(iArr2, iArr);
        }
        this.f44809m = iArr;
    }

    public final void O(boolean z6) {
        this.f44811o = z6;
    }

    public void P(p170r.L l6) {
        this.f44806j = l6;
    }

    public p051f0.C6541c Q(p237x7.l lVar, p237x7.l lVar2) {
        p051f0.C6542d c6542d;
        z();
        S();
        J(f());
        synchronized (p051f0.p.I()) {
            int i6 = p051f0.p.f44850e;
            p051f0.p.f44850e = i6 + 1;
            p051f0.p.f44849d = p051f0.p.f44849d.N(i6);
            p051f0.n nVarG = g();
            v(nVarG.N(i6));
            c6542d = new p051f0.C6542d(i6, p051f0.p.z(nVarG, f() + 1, i6), p051f0.p.L(lVar, h(), false, 4, null), p051f0.p.M(lVar2, k()), this);
        }
        if (!D() && !e()) {
            int iF = f();
            synchronized (p051f0.p.I()) {
                int i10 = p051f0.p.f44850e;
                p051f0.p.f44850e = i10 + 1;
                u(i10);
                p051f0.p.f44849d = p051f0.p.f44849d.N(f());
                p087i7.M m6 = p087i7.M.f46721a;
            }
            v(p051f0.p.z(g(), iF + 1, f()));
        }
        return c6542d;
    }

    @Override // p051f0.k
    public void c() {
        p051f0.p.f44849d = p051f0.p.f44849d.C(f()).s(this.f44808l);
    }

    @Override // p051f0.k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // p051f0.k
    public boolean i() {
        return false;
    }

    @Override // p051f0.k
    public int j() {
        return this.f44805i;
    }

    @Override // p051f0.k
    public p237x7.l k() {
        return this.f44804h;
    }

    @Override // p051f0.k
    public void m(p051f0.k kVar) {
        this.f44810n++;
    }

    @Override // p051f0.k
    public void n(p051f0.k kVar) {
        if (!(this.f44810n > 0)) {
            V.I0.a("no pending nested snapshots");
        }
        int i6 = this.f44810n - 1;
        this.f44810n = i6;
        if (i6 != 0 || this.f44811o) {
            return;
        }
        A();
    }

    @Override // p051f0.k
    public void o() {
        if (this.f44811o || e()) {
            return;
        }
        B();
    }

    @Override // p051f0.k
    public void p(p051f0.y yVar) {
        p170r.L lE = E();
        if (lE == null) {
            lE = p170r.X.a();
            P(lE);
        }
        lE.h(yVar);
    }

    @Override // p051f0.k
    public void r() {
        N();
        super.r();
    }

    @Override // p051f0.k
    public void w(int i6) {
        this.f44805i = i6;
    }

    @Override // p051f0.k
    public p051f0.k x(p237x7.l lVar) {
        p051f0.e eVar;
        z();
        S();
        int iF = f();
        J(f());
        synchronized (p051f0.p.I()) {
            int i6 = p051f0.p.f44850e;
            p051f0.p.f44850e = i6 + 1;
            p051f0.p.f44849d = p051f0.p.f44849d.N(i6);
            eVar = new p051f0.e(i6, p051f0.p.z(g(), iF + 1, i6), p051f0.p.L(lVar, h(), false, 4, null), this);
        }
        if (!D() && !e()) {
            int iF2 = f();
            synchronized (p051f0.p.I()) {
                int i10 = p051f0.p.f44850e;
                p051f0.p.f44850e = i10 + 1;
                u(i10);
                p051f0.p.f44849d = p051f0.p.f44849d.N(f());
                p087i7.M m6 = p087i7.M.f46721a;
            }
            v(p051f0.p.z(g(), iF2 + 1, f()));
        }
        return eVar;
    }
}
