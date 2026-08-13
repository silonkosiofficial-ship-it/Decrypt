package p042e1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static long f44547A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static long f44548B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f44551u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static boolean f44556z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.HashMap f44560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e1.d.b f44561e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f44566j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44569m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p042e1.c f44571o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e1.d.b f44574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e1.d.a f44549s = new e1.d.a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f44550t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f44552v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static boolean f44553w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f44554x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f44555y = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44557a = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44562f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44563g = 32;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean[] f44567k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44568l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44570n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p042e1.i[] f44572p = new p042e1.i[1000];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p042e1.b[] f44564h = new p042e1.b[32];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p042e1.b a(p042e1.d dVar, p042e1.i iVar, p042e1.i iVar2, float f6) {
            p247y7.AbstractC7350t.f(dVar, "linearSystem");
            p247y7.AbstractC7350t.f(iVar, "variableA");
            p247y7.AbstractC7350t.f(iVar2, "variableC");
            return dVar.v().j(iVar, iVar2, f6);
        }

        public final p042e1.e b() {
            d();
            return null;
        }

        public final boolean c() {
            return p042e1.d.f44553w;
        }

        public final p042e1.e d() {
            p042e1.d.b();
            return null;
        }

        public final boolean e() {
            return p042e1.d.f44551u;
        }

        public final void f(boolean z6) {
            p042e1.d.f44551u = z6;
        }
    }

    public interface b {
        void a(e1.d.b bVar);

        void b(p042e1.i iVar);

        p042e1.i c(p042e1.d dVar, boolean[] zArr);

        void clear();

        p042e1.i getKey();

        boolean isEmpty();
    }

    public final class c extends p042e1.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p042e1.d f44575i;

        public c(p042e1.d dVar, p042e1.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "cache");
            this.f44575i = dVar;
            H(new p042e1.j(this, cVar));
        }
    }

    public d() {
        G();
        this.f44571o = new p042e1.c();
        this.f44561e = new p042e1.h(this.f44571o);
        this.f44574r = f44556z ? new e1.d.c(this, this.f44571o) : new p042e1.b(this.f44571o);
    }

    private final void C() {
        this.f44562f *= 2;
        p042e1.b[] bVarArr = this.f44564h;
        p247y7.AbstractC7350t.c(bVarArr);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(bVarArr, this.f44562f);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
        this.f44564h = (p042e1.b[]) objArrCopyOf;
        p042e1.c cVar = this.f44571o;
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(cVar.b(), this.f44562f);
        p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(...)");
        cVar.e((p042e1.i[]) objArrCopyOf2);
        int i6 = this.f44562f;
        this.f44567k = new boolean[i6];
        this.f44563g = i6;
        this.f44570n = i6;
    }

    private final int F(e1.d.b bVar, boolean z6) {
        int i6 = this.f44568l;
        for (int i10 = 0; i10 < i6; i10++) {
            this.f44567k[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f44568l * 2) {
                return i11;
            }
            if (bVar.getKey() != null) {
                boolean[] zArr = this.f44567k;
                p042e1.i key = bVar.getKey();
                p247y7.AbstractC7350t.c(key);
                zArr[key.o()] = true;
            }
            p042e1.i iVarC = bVar.c(this, this.f44567k);
            if (iVarC != null) {
                if (this.f44567k[iVarC.o()]) {
                    return i11;
                }
                this.f44567k[iVarC.o()] = true;
            }
            if (iVarC != null) {
                int i12 = this.f44569m;
                float f6 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < i12; i14++) {
                    p042e1.b[] bVarArr = this.f44564h;
                    p247y7.AbstractC7350t.c(bVarArr);
                    p042e1.b bVar2 = bVarArr[i14];
                    p247y7.AbstractC7350t.c(bVar2);
                    p042e1.i iVarU = bVar2.u();
                    p247y7.AbstractC7350t.c(iVarU);
                    if (iVarU.x() != e1.i.b.UNRESTRICTED && !bVar2.t() && bVar2.x(iVarC)) {
                        e1.b.a aVarV = bVar2.v();
                        p247y7.AbstractC7350t.c(aVarV);
                        float fG = aVarV.g(iVarC);
                        if (fG < 0.0f) {
                            float f10 = (-bVar2.s()) / fG;
                            if (f10 < f6) {
                                i13 = i14;
                                f6 = f10;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    p042e1.b[] bVarArr2 = this.f44564h;
                    p247y7.AbstractC7350t.c(bVarArr2);
                    p042e1.b bVar3 = bVarArr2[i13];
                    p247y7.AbstractC7350t.c(bVar3);
                    p042e1.i iVarU2 = bVar3.u();
                    p247y7.AbstractC7350t.c(iVarU2);
                    iVarU2.H(-1);
                    bVar3.B(iVarC);
                    p042e1.i iVarU3 = bVar3.u();
                    p247y7.AbstractC7350t.c(iVarU3);
                    iVarU3.H(i13);
                    p042e1.i iVarU4 = bVar3.u();
                    p247y7.AbstractC7350t.c(iVarU4);
                    iVarU4.N(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
        return i11;
    }

    private final void G() {
        int i6 = 0;
        if (f44556z) {
            int i10 = this.f44569m;
            while (i6 < i10) {
                p042e1.b[] bVarArr = this.f44564h;
                p247y7.AbstractC7350t.c(bVarArr);
                p042e1.b bVar = bVarArr[i6];
                if (bVar != null) {
                    this.f44571o.c().a(bVar);
                }
                p042e1.b[] bVarArr2 = this.f44564h;
                p247y7.AbstractC7350t.c(bVarArr2);
                bVarArr2[i6] = null;
                i6++;
            }
            return;
        }
        int i11 = this.f44569m;
        while (i6 < i11) {
            p042e1.b[] bVarArr3 = this.f44564h;
            p247y7.AbstractC7350t.c(bVarArr3);
            p042e1.b bVar2 = bVarArr3[i6];
            if (bVar2 != null) {
                this.f44571o.a().a(bVar2);
            }
            p042e1.b[] bVarArr4 = this.f44564h;
            p247y7.AbstractC7350t.c(bVarArr4);
            bVarArr4[i6] = null;
            i6++;
        }
    }

    public static final /* synthetic */ p042e1.e b() {
        return null;
    }

    private final p042e1.i e(e1.i.b bVar, java.lang.String str) {
        p042e1.i iVar = (p042e1.i) this.f44571o.d().b();
        if (iVar == null) {
            iVar = new p042e1.i(bVar, java.lang.String.valueOf(str));
        } else {
            iVar.C();
        }
        iVar.L(bVar, str);
        int i6 = this.f44573q;
        int i10 = this.f44557a;
        if (i6 >= i10) {
            int i11 = i10 * 2;
            this.f44557a = i11;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f44572p, i11);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            this.f44572p = (p042e1.i[]) objArrCopyOf;
        }
        p042e1.i[] iVarArr = this.f44572p;
        int i12 = this.f44573q;
        this.f44573q = i12 + 1;
        iVarArr[i12] = iVar;
        return iVar;
    }

    private final void p(p042e1.b bVar) {
        if (f44553w && bVar.t()) {
            p042e1.i iVarU = bVar.u();
            p247y7.AbstractC7350t.c(iVarU);
            iVarU.E(this, bVar.s());
        } else {
            p042e1.b[] bVarArr = this.f44564h;
            p247y7.AbstractC7350t.c(bVarArr);
            bVarArr[this.f44569m] = bVar;
            p042e1.i iVarU2 = bVar.u();
            p247y7.AbstractC7350t.c(iVarU2);
            iVarU2.H(this.f44569m);
            this.f44569m++;
            p042e1.i iVarU3 = bVar.u();
            p247y7.AbstractC7350t.c(iVarU3);
            iVarU3.N(this, bVar);
        }
        if (f44553w && this.f44558b) {
            int i6 = 0;
            while (i6 < this.f44569m) {
                p042e1.b[] bVarArr2 = this.f44564h;
                p247y7.AbstractC7350t.c(bVarArr2);
                if (bVarArr2[i6] == null) {
                    java.lang.System.out.println((java.lang.Object) "WTF");
                }
                p042e1.b[] bVarArr3 = this.f44564h;
                p247y7.AbstractC7350t.c(bVarArr3);
                if (bVarArr3[i6] != null) {
                    p042e1.b[] bVarArr4 = this.f44564h;
                    p247y7.AbstractC7350t.c(bVarArr4);
                    p042e1.b bVar2 = bVarArr4[i6];
                    p247y7.AbstractC7350t.c(bVar2);
                    if (bVar2.t()) {
                        p042e1.b[] bVarArr5 = this.f44564h;
                        p247y7.AbstractC7350t.c(bVarArr5);
                        p042e1.b bVar3 = bVarArr5[i6];
                        p247y7.AbstractC7350t.c(bVar3);
                        p042e1.i iVarU4 = bVar3.u();
                        p247y7.AbstractC7350t.c(iVarU4);
                        iVarU4.E(this, bVar3.s());
                        (f44556z ? this.f44571o.c() : this.f44571o.a()).a(bVar3);
                        p042e1.b[] bVarArr6 = this.f44564h;
                        p247y7.AbstractC7350t.c(bVarArr6);
                        bVarArr6[i6] = null;
                        int i10 = i6 + 1;
                        int i11 = this.f44569m;
                        int i12 = i10;
                        while (i10 < i11) {
                            p042e1.b[] bVarArr7 = this.f44564h;
                            p247y7.AbstractC7350t.c(bVarArr7);
                            int i13 = i10 - 1;
                            p042e1.b[] bVarArr8 = this.f44564h;
                            p247y7.AbstractC7350t.c(bVarArr8);
                            bVarArr7[i13] = bVarArr8[i10];
                            p042e1.b[] bVarArr9 = this.f44564h;
                            p247y7.AbstractC7350t.c(bVarArr9);
                            p042e1.b bVar4 = bVarArr9[i13];
                            p247y7.AbstractC7350t.c(bVar4);
                            p042e1.i iVarU5 = bVar4.u();
                            p247y7.AbstractC7350t.c(iVarU5);
                            if (iVarU5.r() == i10) {
                                p042e1.b[] bVarArr10 = this.f44564h;
                                p247y7.AbstractC7350t.c(bVarArr10);
                                p042e1.b bVar5 = bVarArr10[i13];
                                p247y7.AbstractC7350t.c(bVar5);
                                p042e1.i iVarU6 = bVar5.u();
                                p247y7.AbstractC7350t.c(iVarU6);
                                iVarU6.H(i13);
                            }
                            i12 = i10;
                            i10++;
                        }
                        if (i12 < this.f44569m) {
                            p042e1.b[] bVarArr11 = this.f44564h;
                            p247y7.AbstractC7350t.c(bVarArr11);
                            bVarArr11[i12] = null;
                        }
                        this.f44569m--;
                        i6--;
                    }
                }
                i6++;
            }
            this.f44558b = false;
        }
    }

    private final void r() {
        int i6 = this.f44569m;
        for (int i10 = 0; i10 < i6; i10++) {
            p042e1.b[] bVarArr = this.f44564h;
            p247y7.AbstractC7350t.c(bVarArr);
            p042e1.b bVar = bVarArr[i10];
            p247y7.AbstractC7350t.c(bVar);
            p042e1.i iVarU = bVar.u();
            p247y7.AbstractC7350t.c(iVarU);
            iVarU.D(bVar.s());
        }
    }

    private final int x(e1.d.b bVar) {
        int i6 = this.f44569m;
        for (int i10 = 0; i10 < i6; i10++) {
            p042e1.b[] bVarArr = this.f44564h;
            p247y7.AbstractC7350t.c(bVarArr);
            p042e1.b bVar2 = bVarArr[i10];
            p247y7.AbstractC7350t.c(bVar2);
            p042e1.i iVarU = bVar2.u();
            p247y7.AbstractC7350t.c(iVarU);
            if (iVarU.x() != e1.i.b.UNRESTRICTED) {
                p042e1.b[] bVarArr2 = this.f44564h;
                p247y7.AbstractC7350t.c(bVarArr2);
                p042e1.b bVar3 = bVarArr2[i10];
                p247y7.AbstractC7350t.c(bVar3);
                float f6 = 0.0f;
                if (bVar3.s() < 0.0f) {
                    boolean z6 = false;
                    int i11 = 0;
                    while (!z6) {
                        i11++;
                        int i12 = this.f44569m;
                        float f10 = Float.MAX_VALUE;
                        int i13 = 0;
                        int i14 = -1;
                        int iO = -1;
                        int i15 = 0;
                        while (true) {
                            if (i13 >= i12) {
                                break;
                            }
                            p042e1.b[] bVarArr3 = this.f44564h;
                            p247y7.AbstractC7350t.c(bVarArr3);
                            p042e1.b bVar4 = bVarArr3[i13];
                            p247y7.AbstractC7350t.c(bVar4);
                            p042e1.i iVarU2 = bVar4.u();
                            p247y7.AbstractC7350t.c(iVarU2);
                            if (iVarU2.x() != e1.i.b.UNRESTRICTED && !bVar4.t() && bVar4.s() < f6) {
                                if (f44555y) {
                                    e1.b.a aVarV = bVar4.v();
                                    p247y7.AbstractC7350t.c(aVarV);
                                    int iA = aVarV.a();
                                    int i16 = 0;
                                    while (i16 < iA) {
                                        e1.b.a aVarV2 = bVar4.v();
                                        p247y7.AbstractC7350t.c(aVarV2);
                                        p042e1.i iVarB = aVarV2.b(i16);
                                        e1.b.a aVarV3 = bVar4.v();
                                        p247y7.AbstractC7350t.c(aVarV3);
                                        float fG = aVarV3.g(iVarB);
                                        if (fG > f6) {
                                            for (int i17 = 0; i17 < 9; i17++) {
                                                p247y7.AbstractC7350t.c(iVarB);
                                                float f11 = iVarB.u()[i17] / fG;
                                                if ((f11 < f10 && i17 == i15) || i17 > i15) {
                                                    i15 = i17;
                                                    iO = iVarB.o();
                                                    i14 = i13;
                                                    f10 = f11;
                                                }
                                            }
                                        }
                                        i16++;
                                        f6 = 0.0f;
                                    }
                                } else {
                                    int i18 = this.f44568l;
                                    for (int i19 = 1; i19 < i18; i19++) {
                                        p042e1.i iVar = this.f44571o.b()[i19];
                                        e1.b.a aVarV4 = bVar4.v();
                                        p247y7.AbstractC7350t.c(aVarV4);
                                        float fG2 = aVarV4.g(iVar);
                                        if (fG2 > 0.0f) {
                                            for (int i20 = 0; i20 < 9; i20++) {
                                                p247y7.AbstractC7350t.c(iVar);
                                                float f12 = iVar.u()[i20] / fG2;
                                                if ((f12 < f10 && i20 == i15) || i20 > i15) {
                                                    i14 = i13;
                                                    iO = i19;
                                                    i15 = i20;
                                                    f10 = f12;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i13++;
                            f6 = 0.0f;
                        }
                        if (i14 != -1) {
                            p042e1.b[] bVarArr4 = this.f44564h;
                            p247y7.AbstractC7350t.c(bVarArr4);
                            p042e1.b bVar5 = bVarArr4[i14];
                            p247y7.AbstractC7350t.c(bVar5);
                            p042e1.i iVarU3 = bVar5.u();
                            p247y7.AbstractC7350t.c(iVarU3);
                            iVarU3.H(-1);
                            p042e1.i iVar2 = this.f44571o.b()[iO];
                            p247y7.AbstractC7350t.c(iVar2);
                            bVar5.B(iVar2);
                            p042e1.i iVarU4 = bVar5.u();
                            p247y7.AbstractC7350t.c(iVarU4);
                            iVarU4.H(i14);
                            p042e1.i iVarU5 = bVar5.u();
                            p247y7.AbstractC7350t.c(iVarU5);
                            iVarU5.N(this, bVar5);
                        } else {
                            z6 = true;
                        }
                        if (i11 > this.f44568l / 2) {
                            z6 = true;
                        }
                        f6 = 0.0f;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public final p042e1.b[] A() {
        return this.f44564h;
    }

    public final int B(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "obj");
        p042e1.i iVarN = ((p122m1.d) obj).n();
        if (iVarN != null) {
            return (int) (iVarN.n() + 0.5f);
        }
        return 0;
    }

    public final void D() {
        e1.d.b bVar = this.f44561e;
        p247y7.AbstractC7350t.c(bVar);
        if (bVar.isEmpty()) {
            r();
            return;
        }
        if (this.f44565i || this.f44566j) {
            int i6 = this.f44569m;
            for (int i10 = 0; i10 < i6; i10++) {
                p042e1.b[] bVarArr = this.f44564h;
                p247y7.AbstractC7350t.c(bVarArr);
                p042e1.b bVar2 = bVarArr[i10];
                p247y7.AbstractC7350t.c(bVar2);
                if (bVar2.t()) {
                }
            }
            r();
            return;
        }
        e1.d.b bVar3 = this.f44561e;
        p247y7.AbstractC7350t.c(bVar3);
        E(bVar3);
    }

    public final void E(e1.d.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "goal");
        x(bVar);
        F(bVar, false);
        r();
    }

    public final void H() {
        int length = this.f44571o.b().length;
        for (int i6 = 0; i6 < length; i6++) {
            p042e1.i iVar = this.f44571o.b()[i6];
            if (iVar != null) {
                iVar.C();
            }
        }
        this.f44571o.d().c(this.f44572p, this.f44573q);
        this.f44573q = 0;
        p097j7.AbstractC6872n.B(this.f44571o.b(), null, 0, 0, 6, null);
        java.util.HashMap map = this.f44560d;
        if (map != null) {
            map.clear();
        }
        this.f44559c = 0;
        e1.d.b bVar = this.f44561e;
        p247y7.AbstractC7350t.c(bVar);
        bVar.clear();
        this.f44568l = 1;
        int i10 = this.f44569m;
        for (int i11 = 0; i11 < i10; i11++) {
            p042e1.b[] bVarArr = this.f44564h;
            p247y7.AbstractC7350t.c(bVarArr);
            if (bVarArr[i11] != null) {
                p042e1.b[] bVarArr2 = this.f44564h;
                p247y7.AbstractC7350t.c(bVarArr2);
                p042e1.b bVar2 = bVarArr2[i11];
                p247y7.AbstractC7350t.c(bVar2);
                bVar2.F(false);
            }
        }
        G();
        this.f44569m = 0;
        this.f44574r = f44556z ? new e1.d.c(this, this.f44571o) : new p042e1.b(this.f44571o);
    }

    public final void I(boolean z6) {
        this.f44565i = z6;
    }

    public final void J(boolean z6) {
        this.f44558b = z6;
    }

    public final void K(boolean z6) {
        this.f44566j = z6;
    }

    public final void f(p122m1.e eVar, p122m1.e eVar2, float f6, int i6) {
        p247y7.AbstractC7350t.f(eVar, "widget");
        p247y7.AbstractC7350t.f(eVar2, "target");
        m1.d.b bVar = m1.d.b.LEFT;
        p042e1.i iVarU = u(eVar.l(bVar));
        m1.d.b bVar2 = m1.d.b.TOP;
        p042e1.i iVarU2 = u(eVar.l(bVar2));
        m1.d.b bVar3 = m1.d.b.RIGHT;
        p042e1.i iVarU3 = u(eVar.l(bVar3));
        m1.d.b bVar4 = m1.d.b.BOTTOM;
        p042e1.i iVarU4 = u(eVar.l(bVar4));
        p042e1.i iVarU5 = u(eVar2.l(bVar));
        p042e1.i iVarU6 = u(eVar2.l(bVar2));
        p042e1.i iVarU7 = u(eVar2.l(bVar3));
        p042e1.i iVarU8 = u(eVar2.l(bVar4));
        p042e1.b bVarV = v();
        double d6 = f6;
        double d10 = i6;
        bVarV.q(iVarU2, iVarU4, iVarU6, iVarU8, (float) (java.lang.Math.sin(d6) * d10));
        h(bVarV);
        p042e1.b bVarV2 = v();
        bVarV2.q(iVarU, iVarU3, iVarU5, iVarU7, (float) (java.lang.Math.cos(d6) * d10));
        h(bVarV2);
    }

    public final void g(p042e1.i iVar, p042e1.i iVar2, int i6, float f6, p042e1.i iVar3, p042e1.i iVar4, int i10, int i11) {
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        p247y7.AbstractC7350t.f(iVar3, "c");
        p247y7.AbstractC7350t.f(iVar4, "d");
        p042e1.b bVarV = v();
        bVarV.h(iVar, iVar2, i6, f6, iVar3, iVar4, i10);
        if (i11 != 8) {
            bVarV.d(this, i11);
        }
        h(bVarV);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    public final void h(p042e1.b bVar) {
        p042e1.i iVarZ;
        if (bVar == null) {
            return;
        }
        boolean z6 = true;
        if (this.f44569m + 1 >= this.f44570n || this.f44568l + 1 >= this.f44563g) {
            C();
        }
        boolean z10 = false;
        if (!bVar.t()) {
            bVar.M(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                p042e1.i iVarT = t();
                bVar.G(iVarT);
                int i6 = this.f44569m;
                p(bVar);
                if (this.f44569m == i6 + 1) {
                    e1.d.b bVar2 = this.f44574r;
                    p247y7.AbstractC7350t.c(bVar2);
                    bVar2.a(bVar);
                    e1.d.b bVar3 = this.f44574r;
                    p247y7.AbstractC7350t.c(bVar3);
                    F(bVar3, true);
                    if (iVarT.r() == -1) {
                        if (p247y7.AbstractC7350t.b(bVar.u(), iVarT) && (iVarZ = bVar.z(iVarT)) != null) {
                            bVar.B(iVarZ);
                        }
                        if (!bVar.t()) {
                            p042e1.i iVarU = bVar.u();
                            p247y7.AbstractC7350t.c(iVarU);
                            iVarU.N(this, bVar);
                        }
                        (f44556z ? this.f44571o.c() : this.f44571o.a()).a(bVar);
                        this.f44569m--;
                    }
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (!bVar.w()) {
                return;
            } else {
                z10 = z6;
            }
        }
        if (z10) {
            return;
        }
        p(bVar);
    }

    public final p042e1.b i(p042e1.i iVar, p042e1.i iVar2, int i6, int i10) {
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        if (f44552v && i10 == 8 && iVar2.A() && iVar.r() == -1) {
            iVar.E(this, iVar2.n() + i6);
            return null;
        }
        p042e1.b bVarV = v();
        bVarV.n(iVar, iVar2, i6);
        if (i10 != 8) {
            bVarV.d(this, i10);
        }
        h(bVarV);
        return bVarV;
    }

    public final void j(p042e1.i iVar, int i6) {
        p042e1.b bVarV;
        p247y7.AbstractC7350t.f(iVar, "a");
        if (f44552v && iVar.r() == -1) {
            float f6 = i6;
            iVar.E(this, f6);
            int i10 = this.f44559c + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                p042e1.i iVar2 = this.f44571o.b()[i11];
                if (iVar2 != null && iVar2.t() && iVar2.v() == iVar.o()) {
                    iVar2.E(this, iVar2.w() + f6);
                }
            }
            return;
        }
        int iR = iVar.r();
        if (iVar.r() != -1) {
            p042e1.b[] bVarArr = this.f44564h;
            p247y7.AbstractC7350t.c(bVarArr);
            p042e1.b bVar = bVarArr[iR];
            p247y7.AbstractC7350t.c(bVar);
            if (!bVar.t()) {
                e1.b.a aVarV = bVar.v();
                p247y7.AbstractC7350t.c(aVarV);
                if (aVarV.a() == 0) {
                    bVar.E(true);
                } else {
                    bVarV = v();
                    bVarV.m(iVar, i6);
                }
            }
            bVar.D(i6);
            return;
        }
        bVarV = v();
        bVarV.i(iVar, i6);
        h(bVarV);
    }

    public final void k(p042e1.i iVar, p042e1.i iVar2, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        p042e1.b bVarV = v();
        p042e1.i iVarW = w();
        iVarW.K(0);
        bVarV.o(iVar, iVar2, iVarW, i6);
        h(bVarV);
    }

    public final void l(p042e1.i iVar, p042e1.i iVar2, int i6, int i10) {
        p042e1.b bVarV = v();
        p042e1.i iVarW = w();
        iVarW.K(0);
        bVarV.o(iVar, iVar2, iVarW, i6);
        if (i10 != 8) {
            e1.b.a aVarV = bVarV.v();
            p247y7.AbstractC7350t.c(aVarV);
            q(bVarV, (int) ((-1) * aVarV.g(iVarW)), i10);
        }
        h(bVarV);
    }

    public final void m(p042e1.i iVar, p042e1.i iVar2, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        p042e1.b bVarV = v();
        p042e1.i iVarW = w();
        iVarW.K(0);
        bVarV.p(iVar, iVar2, iVarW, i6);
        h(bVarV);
    }

    public final void n(p042e1.i iVar, p042e1.i iVar2, int i6, int i10) {
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        p042e1.b bVarV = v();
        p042e1.i iVarW = w();
        iVarW.K(0);
        bVarV.p(iVar, iVar2, iVarW, i6);
        if (i10 != 8) {
            e1.b.a aVarV = bVarV.v();
            p247y7.AbstractC7350t.c(aVarV);
            q(bVarV, (int) ((-1) * aVarV.g(iVarW)), i10);
        }
        h(bVarV);
    }

    public final void o(p042e1.i iVar, p042e1.i iVar2, p042e1.i iVar3, p042e1.i iVar4, float f6, int i6) {
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        p247y7.AbstractC7350t.f(iVar3, "c");
        p247y7.AbstractC7350t.f(iVar4, "d");
        p042e1.b bVarV = v();
        bVarV.k(iVar, iVar2, iVar3, iVar4, f6);
        if (i6 != 8) {
            bVarV.d(this, i6);
        }
        h(bVarV);
    }

    public final void q(p042e1.b bVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(bVar, "row");
        bVar.e(s(i10, null), i6);
    }

    public final p042e1.i s(int i6, java.lang.String str) {
        if (this.f44568l + 1 >= this.f44563g) {
            C();
        }
        p042e1.i iVarE = e(e1.i.b.ERROR, str);
        int i10 = this.f44559c + 1;
        this.f44559c = i10;
        this.f44568l++;
        iVarE.F(i10);
        iVarE.K(i6);
        this.f44571o.b()[this.f44559c] = iVarE;
        e1.d.b bVar = this.f44561e;
        p247y7.AbstractC7350t.c(bVar);
        bVar.b(iVarE);
        return iVarE;
    }

    public final p042e1.i t() {
        if (this.f44568l + 1 >= this.f44563g) {
            C();
        }
        p042e1.i iVarE = e(e1.i.b.SLACK, null);
        int i6 = this.f44559c + 1;
        this.f44559c = i6;
        this.f44568l++;
        iVarE.F(i6);
        this.f44571o.b()[this.f44559c] = iVarE;
        return iVarE;
    }

    public final p042e1.i u(java.lang.Object obj) {
        p042e1.i iVarN = null;
        if (obj == null) {
            return null;
        }
        if (this.f44568l + 1 >= this.f44563g) {
            C();
        }
        if (obj instanceof p122m1.d) {
            p122m1.d dVar = (p122m1.d) obj;
            iVarN = dVar.n();
            if (iVarN == null) {
                dVar.x(this.f44571o);
                iVarN = dVar.n();
            }
            p247y7.AbstractC7350t.c(iVarN);
            if (iVarN.o() == -1 || iVarN.o() > this.f44559c || this.f44571o.b()[iVarN.o()] == null) {
                if (iVarN.o() != -1) {
                    iVarN.C();
                }
                int i6 = this.f44559c + 1;
                this.f44559c = i6;
                this.f44568l++;
                iVarN.F(i6);
                iVarN.I(e1.i.b.UNRESTRICTED);
                this.f44571o.b()[this.f44559c] = iVarN;
            }
        }
        return iVarN;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021 A[PHI: r0
  0x0021: PHI (r0v6 e1.b) = (r0v4 e1.b), (r0v11 e1.b) binds: [B:9:0x0031, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public final p042e1.b v() {
        p042e1.b bVar;
        if (f44556z) {
            bVar = (p042e1.b) this.f44571o.c().b();
            if (bVar == null) {
                bVar = new e1.d.c(this, this.f44571o);
                f44548B++;
            } else {
                bVar.C();
            }
        } else {
            bVar = (p042e1.b) this.f44571o.a().b();
            if (bVar == null) {
                bVar = new p042e1.b(this.f44571o);
                f44547A++;
            } else {
                bVar.C();
            }
        }
        p042e1.i.f44589T.a();
        return bVar;
    }

    public final p042e1.i w() {
        if (this.f44568l + 1 >= this.f44563g) {
            C();
        }
        p042e1.i iVarE = e(e1.i.b.SLACK, null);
        int i6 = this.f44559c + 1;
        this.f44559c = i6;
        this.f44568l++;
        iVarE.F(i6);
        this.f44571o.b()[this.f44559c] = iVarE;
        return iVarE;
    }

    public final p042e1.c y() {
        return this.f44571o;
    }

    public final p042e1.c z() {
        return this.f44571o;
    }
}
