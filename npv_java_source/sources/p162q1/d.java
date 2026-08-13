package p162q1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f52958q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f52959r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static long f52960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f52961t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q1.d.a f52964c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    p162q1.b[] f52967f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final p162q1.c f52974m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private q1.d.a f52977p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f52962a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.HashMap f52963b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52965d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52966e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52968g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52969h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean[] f52970i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f52971j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f52972k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f52973l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p162q1.i[] f52975n = new p162q1.i[f52958q];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f52976o = 0;

    interface a {
        void a(p162q1.i iVar);

        p162q1.i b(p162q1.d dVar, boolean[] zArr);

        void c(q1.d.a aVar);

        void clear();

        p162q1.i getKey();
    }

    class b extends p162q1.b {
        public b(p162q1.c cVar) {
            this.f52952e = new p162q1.j(this, cVar);
        }
    }

    public d() {
        this.f52967f = null;
        this.f52967f = new p162q1.b[32];
        C();
        p162q1.c cVar = new p162q1.c();
        this.f52974m = cVar;
        this.f52964c = new p162q1.h(cVar);
        this.f52977p = f52959r ? new q1.d.b(cVar) : new p162q1.b(cVar);
    }

    private final int B(q1.d.a aVar, boolean z6) {
        for (int i6 = 0; i6 < this.f52971j; i6++) {
            this.f52970i[i6] = false;
        }
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10++;
            if (i10 >= this.f52971j * 2) {
                return i10;
            }
            if (aVar.getKey() != null) {
                this.f52970i[aVar.getKey().f52994c] = true;
            }
            p162q1.i iVarB = aVar.b(this, this.f52970i);
            if (iVarB != null) {
                boolean[] zArr = this.f52970i;
                int i11 = iVarB.f52994c;
                if (zArr[i11]) {
                    return i10;
                }
                zArr[i11] = true;
            }
            if (iVarB != null) {
                float f6 = Float.MAX_VALUE;
                int i12 = -1;
                for (int i13 = 0; i13 < this.f52972k; i13++) {
                    p162q1.b bVar = this.f52967f[i13];
                    if (bVar.f52948a.f53001j != q1.i.a.UNRESTRICTED && !bVar.f52953f && bVar.t(iVarB)) {
                        float fG = bVar.f52952e.g(iVarB);
                        if (fG < 0.0f) {
                            float f10 = (-bVar.f52949b) / fG;
                            if (f10 < f6) {
                                i12 = i13;
                                f6 = f10;
                            }
                        }
                    }
                }
                if (i12 > -1) {
                    p162q1.b bVar2 = this.f52967f[i12];
                    bVar2.f52948a.f52995d = -1;
                    bVar2.y(iVarB);
                    p162q1.i iVar = bVar2.f52948a;
                    iVar.f52995d = i12;
                    iVar.g(bVar2);
                }
            } else {
                z10 = true;
            }
        }
        return i10;
    }

    private void C() {
        int i6 = 0;
        if (f52959r) {
            while (true) {
                p162q1.b[] bVarArr = this.f52967f;
                if (i6 >= bVarArr.length) {
                    return;
                }
                p162q1.b bVar = bVarArr[i6];
                if (bVar != null) {
                    this.f52974m.f52954a.a(bVar);
                }
                this.f52967f[i6] = null;
                i6++;
            }
        } else {
            while (true) {
                p162q1.b[] bVarArr2 = this.f52967f;
                if (i6 >= bVarArr2.length) {
                    return;
                }
                p162q1.b bVar2 = bVarArr2[i6];
                if (bVar2 != null) {
                    this.f52974m.f52955b.a(bVar2);
                }
                this.f52967f[i6] = null;
                i6++;
            }
        }
    }

    private p162q1.i a(q1.i.a aVar, java.lang.String str) {
        p162q1.i iVar = (p162q1.i) this.f52974m.f52956c.b();
        if (iVar == null) {
            iVar = new p162q1.i(aVar, str);
        } else {
            iVar.d();
        }
        iVar.f(aVar, str);
        int i6 = this.f52976o;
        int i10 = f52958q;
        if (i6 >= i10) {
            int i11 = i10 * 2;
            f52958q = i11;
            this.f52975n = (p162q1.i[]) java.util.Arrays.copyOf(this.f52975n, i11);
        }
        p162q1.i[] iVarArr = this.f52975n;
        int i12 = this.f52976o;
        this.f52976o = i12 + 1;
        iVarArr[i12] = iVar;
        return iVar;
    }

    private final void l(p162q1.b bVar) {
        p162q1.b bVar2;
        p162q1.f fVar;
        if (f52959r) {
            bVar2 = this.f52967f[this.f52972k];
            if (bVar2 != null) {
                fVar = this.f52974m.f52954a;
                fVar.a(bVar2);
            }
        } else {
            bVar2 = this.f52967f[this.f52972k];
            if (bVar2 != null) {
                fVar = this.f52974m.f52955b;
                fVar.a(bVar2);
            }
        }
        p162q1.b[] bVarArr = this.f52967f;
        int i6 = this.f52972k;
        bVarArr[i6] = bVar;
        p162q1.i iVar = bVar.f52948a;
        iVar.f52995d = i6;
        this.f52972k = i6 + 1;
        iVar.g(bVar);
    }

    private void n() {
        for (int i6 = 0; i6 < this.f52972k; i6++) {
            p162q1.b bVar = this.f52967f[i6];
            bVar.f52948a.f52997f = bVar.f52949b;
        }
    }

    public static p162q1.b s(p162q1.d dVar, p162q1.i iVar, p162q1.i iVar2, float f6) {
        return dVar.r().j(iVar, iVar2, f6);
    }

    private int u(q1.d.a aVar) {
        for (int i6 = 0; i6 < this.f52972k; i6++) {
            p162q1.b bVar = this.f52967f[i6];
            if (bVar.f52948a.f53001j != q1.i.a.UNRESTRICTED && bVar.f52949b < 0.0f) {
                boolean z6 = false;
                int i10 = 0;
                while (!z6) {
                    i10++;
                    float f6 = Float.MAX_VALUE;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 >= this.f52972k) {
                            break;
                        }
                        p162q1.b bVar2 = this.f52967f[i13];
                        if (bVar2.f52948a.f53001j != q1.i.a.UNRESTRICTED && !bVar2.f52953f && bVar2.f52949b < 0.0f) {
                            for (int i15 = 1; i15 < this.f52971j; i15++) {
                                p162q1.i iVar = this.f52974m.f52957d[i15];
                                float fG = bVar2.f52952e.g(iVar);
                                if (fG > 0.0f) {
                                    for (int i16 = 0; i16 < 9; i16++) {
                                        float f10 = iVar.f52999h[i16] / fG;
                                        if ((f10 < f6 && i16 == i14) || i16 > i14) {
                                            f6 = f10;
                                            i11 = i13;
                                            i12 = i15;
                                            i14 = i16;
                                        }
                                    }
                                }
                            }
                        }
                        i13++;
                    }
                    if (i11 != -1) {
                        p162q1.b bVar3 = this.f52967f[i11];
                        bVar3.f52948a.f52995d = -1;
                        bVar3.y(this.f52974m.f52957d[i12]);
                        p162q1.i iVar2 = bVar3.f52948a;
                        iVar2.f52995d = i11;
                        iVar2.g(bVar3);
                    } else {
                        z6 = true;
                    }
                    if (i10 > this.f52971j / 2) {
                        z6 = true;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    public static p162q1.e w() {
        return null;
    }

    private void y() {
        int i6 = this.f52965d * 2;
        this.f52965d = i6;
        this.f52967f = (p162q1.b[]) java.util.Arrays.copyOf(this.f52967f, i6);
        p162q1.c cVar = this.f52974m;
        cVar.f52957d = (p162q1.i[]) java.util.Arrays.copyOf(cVar.f52957d, this.f52965d);
        int i10 = this.f52965d;
        this.f52970i = new boolean[i10];
        this.f52966e = i10;
        this.f52973l = i10;
    }

    void A(q1.d.a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        p162q1.c cVar;
        int i6 = 0;
        while (true) {
            cVar = this.f52974m;
            p162q1.i[] iVarArr = cVar.f52957d;
            if (i6 >= iVarArr.length) {
                break;
            }
            p162q1.i iVar = iVarArr[i6];
            if (iVar != null) {
                iVar.d();
            }
            i6++;
        }
        cVar.f52956c.c(this.f52975n, this.f52976o);
        this.f52976o = 0;
        java.util.Arrays.fill(this.f52974m.f52957d, (java.lang.Object) null);
        java.util.HashMap map = this.f52963b;
        if (map != null) {
            map.clear();
        }
        this.f52962a = 0;
        this.f52964c.clear();
        this.f52971j = 1;
        for (int i10 = 0; i10 < this.f52972k; i10++) {
            this.f52967f[i10].f52950c = false;
        }
        C();
        this.f52972k = 0;
        this.f52977p = f52959r ? new q1.d.b(this.f52974m) : new p162q1.b(this.f52974m);
    }

    public void b(p172r1.e eVar, p172r1.e eVar2, float f6, int i6) {
        r1.d.b bVar = r1.d.b.LEFT;
        p162q1.i iVarQ = q(eVar.m(bVar));
        r1.d.b bVar2 = r1.d.b.TOP;
        p162q1.i iVarQ2 = q(eVar.m(bVar2));
        r1.d.b bVar3 = r1.d.b.RIGHT;
        p162q1.i iVarQ3 = q(eVar.m(bVar3));
        r1.d.b bVar4 = r1.d.b.BOTTOM;
        p162q1.i iVarQ4 = q(eVar.m(bVar4));
        p162q1.i iVarQ5 = q(eVar2.m(bVar));
        p162q1.i iVarQ6 = q(eVar2.m(bVar2));
        p162q1.i iVarQ7 = q(eVar2.m(bVar3));
        p162q1.i iVarQ8 = q(eVar2.m(bVar4));
        p162q1.b bVarR = r();
        double d6 = f6;
        double d10 = i6;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (java.lang.Math.sin(d6) * d10));
        d(bVarR);
        p162q1.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (java.lang.Math.cos(d6) * d10));
        d(bVarR2);
    }

    public void c(p162q1.i iVar, p162q1.i iVar2, int i6, float f6, p162q1.i iVar3, p162q1.i iVar4, int i10, int i11) {
        p162q1.b bVarR = r();
        bVarR.h(iVar, iVar2, i6, f6, iVar3, iVar4, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
    }

    public void d(p162q1.b bVar) {
        p162q1.i iVarW;
        if (bVar == null) {
            return;
        }
        boolean z6 = true;
        if (this.f52972k + 1 >= this.f52973l || this.f52971j + 1 >= this.f52966e) {
            y();
        }
        boolean z10 = false;
        if (!bVar.f52953f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                p162q1.i iVarP = p();
                bVar.f52948a = iVarP;
                l(bVar);
                this.f52977p.c(bVar);
                B(this.f52977p, true);
                if (iVarP.f52995d == -1) {
                    if (bVar.f52948a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        bVar.y(iVarW);
                    }
                    if (!bVar.f52953f) {
                        bVar.f52948a.g(bVar);
                    }
                    this.f52972k--;
                }
            } else {
                z6 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z10 = z6;
            }
        }
        if (z10) {
            return;
        }
        l(bVar);
    }

    public p162q1.b e(p162q1.i iVar, p162q1.i iVar2, int i6, int i10) {
        if (i10 == 8 && iVar2.f52998g && iVar.f52995d == -1) {
            iVar.e(this, iVar2.f52997f + i6);
            return null;
        }
        p162q1.b bVarR = r();
        bVarR.n(iVar, iVar2, i6);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(p162q1.i iVar, int i6) {
        p162q1.b bVarR;
        int i10 = iVar.f52995d;
        if (i10 == -1) {
            iVar.e(this, i6);
            return;
        }
        if (i10 != -1) {
            p162q1.b bVar = this.f52967f[i10];
            if (!bVar.f52953f) {
                if (bVar.f52952e.a() == 0) {
                    bVar.f52953f = true;
                } else {
                    bVarR = r();
                    bVarR.m(iVar, i6);
                }
            }
            bVar.f52949b = i6;
            return;
        }
        bVarR = r();
        bVarR.i(iVar, i6);
        d(bVarR);
    }

    public void g(p162q1.i iVar, p162q1.i iVar2, int i6, boolean z6) {
        p162q1.b bVarR = r();
        p162q1.i iVarT = t();
        iVarT.f52996e = 0;
        bVarR.o(iVar, iVar2, iVarT, i6);
        d(bVarR);
    }

    public void h(p162q1.i iVar, p162q1.i iVar2, int i6, int i10) {
        p162q1.b bVarR = r();
        p162q1.i iVarT = t();
        iVarT.f52996e = 0;
        bVarR.o(iVar, iVar2, iVarT, i6);
        if (i10 != 8) {
            m(bVarR, (int) (bVarR.f52952e.g(iVarT) * (-1.0f)), i10);
        }
        d(bVarR);
    }

    public void i(p162q1.i iVar, p162q1.i iVar2, int i6, boolean z6) {
        p162q1.b bVarR = r();
        p162q1.i iVarT = t();
        iVarT.f52996e = 0;
        bVarR.p(iVar, iVar2, iVarT, i6);
        d(bVarR);
    }

    public void j(p162q1.i iVar, p162q1.i iVar2, int i6, int i10) {
        p162q1.b bVarR = r();
        p162q1.i iVarT = t();
        iVarT.f52996e = 0;
        bVarR.p(iVar, iVar2, iVarT, i6);
        if (i10 != 8) {
            m(bVarR, (int) (bVarR.f52952e.g(iVarT) * (-1.0f)), i10);
        }
        d(bVarR);
    }

    public void k(p162q1.i iVar, p162q1.i iVar2, p162q1.i iVar3, p162q1.i iVar4, float f6, int i6) {
        p162q1.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f6);
        if (i6 != 8) {
            bVarR.d(this, i6);
        }
        d(bVarR);
    }

    void m(p162q1.b bVar, int i6, int i10) {
        bVar.e(o(i10, null), i6);
    }

    public p162q1.i o(int i6, java.lang.String str) {
        if (this.f52971j + 1 >= this.f52966e) {
            y();
        }
        p162q1.i iVarA = a(q1.i.a.ERROR, str);
        int i10 = this.f52962a + 1;
        this.f52962a = i10;
        this.f52971j++;
        iVarA.f52994c = i10;
        iVarA.f52996e = i6;
        this.f52974m.f52957d[i10] = iVarA;
        this.f52964c.a(iVarA);
        return iVarA;
    }

    public p162q1.i p() {
        if (this.f52971j + 1 >= this.f52966e) {
            y();
        }
        p162q1.i iVarA = a(q1.i.a.SLACK, null);
        int i6 = this.f52962a + 1;
        this.f52962a = i6;
        this.f52971j++;
        iVarA.f52994c = i6;
        this.f52974m.f52957d[i6] = iVarA;
        return iVarA;
    }

    public p162q1.i q(java.lang.Object obj) {
        p162q1.i iVarF = null;
        if (obj == null) {
            return null;
        }
        if (this.f52971j + 1 >= this.f52966e) {
            y();
        }
        if (obj instanceof p172r1.d) {
            p172r1.d dVar = (p172r1.d) obj;
            iVarF = dVar.f();
            if (iVarF == null) {
                dVar.m(this.f52974m);
                iVarF = dVar.f();
            }
            int i6 = iVarF.f52994c;
            if (i6 == -1 || i6 > this.f52962a || this.f52974m.f52957d[i6] == null) {
                if (i6 != -1) {
                    iVarF.d();
                }
                int i10 = this.f52962a + 1;
                this.f52962a = i10;
                this.f52971j++;
                iVarF.f52994c = i10;
                iVarF.f53001j = q1.i.a.UNRESTRICTED;
                this.f52974m.f52957d[i10] = iVarF;
            }
        }
        return iVarF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f A[PHI: r0
  0x001f: PHI (r0v6 q1.b) = (r0v4 q1.b), (r0v11 q1.b) binds: [B:9:0x002d, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    public p162q1.b r() {
        p162q1.b bVar;
        if (f52959r) {
            bVar = (p162q1.b) this.f52974m.f52954a.b();
            if (bVar == null) {
                bVar = new q1.d.b(this.f52974m);
                f52961t++;
            } else {
                bVar.z();
            }
        } else {
            bVar = (p162q1.b) this.f52974m.f52955b.b();
            if (bVar == null) {
                bVar = new p162q1.b(this.f52974m);
                f52960s++;
            } else {
                bVar.z();
            }
        }
        p162q1.i.b();
        return bVar;
    }

    public p162q1.i t() {
        if (this.f52971j + 1 >= this.f52966e) {
            y();
        }
        p162q1.i iVarA = a(q1.i.a.SLACK, null);
        int i6 = this.f52962a + 1;
        this.f52962a = i6;
        this.f52971j++;
        iVarA.f52994c = i6;
        this.f52974m.f52957d[i6] = iVarA;
        return iVarA;
    }

    public p162q1.c v() {
        return this.f52974m;
    }

    public int x(java.lang.Object obj) {
        p162q1.i iVarF = ((p172r1.d) obj).f();
        if (iVarF != null) {
            return (int) (iVarF.f52997f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f52968g || this.f52969h) {
            for (int i6 = 0; i6 < this.f52972k; i6++) {
                if (this.f52967f[i6].f52953f) {
                }
            }
            n();
            return;
        }
        A(this.f52964c);
    }
}
