package M0;

/* JADX INFO: renamed from: M0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1338j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1339k f6723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f6726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f6727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f6729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List f6730h;

    /* JADX INFO: renamed from: M0.j$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f6731D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float[] f6732E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p247y7.M f6733F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p247y7.L f6734G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j6, float[] fArr, p247y7.M m6, p247y7.L l6) {
            super(1);
            this.f6731D = j6;
            this.f6732E = fArr;
            this.f6733F = m6;
            this.f6734G = l6;
        }

        public final void a(M0.C1345q c1345q) {
            long j6 = this.f6731D;
            float[] fArr = this.f6732E;
            p247y7.M m6 = this.f6733F;
            p247y7.L l6 = this.f6734G;
            long jB = M0.O.b(c1345q.r(c1345q.f() > M0.N.l(j6) ? c1345q.f() : M0.N.l(j6)), c1345q.r(c1345q.b() < M0.N.k(j6) ? c1345q.b() : M0.N.k(j6)));
            c1345q.e().e(jB, fArr, m6.f57252C);
            int iJ = m6.f57252C + (M0.N.j(jB) * 4);
            for (int i6 = m6.f57252C; i6 < iJ; i6 += 4) {
                int i10 = i6 + 1;
                float f6 = fArr[i10];
                float f10 = l6.f57251C;
                fArr[i10] = f6 + f10;
                int i11 = i6 + 3;
                fArr[i11] = fArr[i11] + f10;
            }
            m6.f57252C = iJ;
            l6.f57251C += c1345q.e().getHeight();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((M0.C1345q) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: M0.j$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p141o0.Q1 f6735D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f6736E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f6737F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p141o0.Q1 q6, int i6, int i10) {
            super(1);
            this.f6735D = q6;
            this.f6736E = i6;
            this.f6737F = i10;
        }

        public final void a(M0.C1345q c1345q) {
            p141o0.P1.a(this.f6735D, c1345q.j(c1345q.e().y(c1345q.r(this.f6736E), c1345q.r(this.f6737F))), 0L, 2, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((M0.C1345q) obj);
            return p087i7.M.f46721a;
        }
    }

    private C1338j(M0.C1339k c1339k, long j6, int i6, boolean z6) {
        boolean z10;
        this.f6723a = c1339k;
        this.f6724b = i6;
        if (Y0.C1859b.n(j6) != 0 || Y0.C1859b.m(j6) != 0) {
            throw new java.lang.IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listF = c1339k.f();
        int size = listF.size();
        int i10 = 0;
        int i11 = 0;
        float f6 = 0.0f;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                z10 = false;
                break;
            }
            M0.r rVar = (M0.r) listF.get(i12);
            M0.InterfaceC1344p interfaceC1344pC = M0.AbstractC1348u.c(rVar.b(), Y0.c.b(0, Y0.C1859b.l(j6), 0, Y0.C1859b.g(j6) ? E7.j.d(Y0.C1859b.k(j6) - M0.AbstractC1348u.d(f6), i10) : Y0.C1859b.k(j6), 5, null), this.f6724b - i11, z6);
            float height = f6 + interfaceC1344pC.getHeight();
            int iU = i11 + interfaceC1344pC.u();
            java.util.List list = listF;
            arrayList.add(new M0.C1345q(interfaceC1344pC, rVar.c(), rVar.a(), i11, iU, f6, height));
            if (interfaceC1344pC.w() || (iU == this.f6724b && i12 != p097j7.AbstractC6879v.o(this.f6723a.f()))) {
                z10 = true;
                i11 = iU;
                f6 = height;
                break;
            } else {
                i12++;
                i11 = iU;
                f6 = height;
                i10 = 0;
                listF = list;
            }
        }
        this.f6727e = f6;
        this.f6728f = i11;
        this.f6725c = z10;
        this.f6730h = arrayList;
        this.f6726d = Y0.C1859b.l(j6);
        java.util.List arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            M0.C1345q c1345q = (M0.C1345q) arrayList.get(i13);
            java.util.List listR = c1345q.e().r();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(listR.size());
            int size3 = listR.size();
            for (int i14 = 0; i14 < size3; i14++) {
                p131n0.i iVar = (p131n0.i) listR.get(i14);
                arrayList3.add(iVar != null ? c1345q.i(iVar) : null);
            }
            p097j7.AbstractC6879v.C(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f6723a.g().size()) {
            int size4 = this.f6723a.g().size() - arrayList2.size();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(size4);
            for (int i15 = 0; i15 < size4; i15++) {
                arrayList4.add(null);
            }
            arrayList2 = p097j7.AbstractC6879v.C0(arrayList2, arrayList4);
        }
        this.f6729g = arrayList2;
    }

    public /* synthetic */ C1338j(M0.C1339k c1339k, long j6, int i6, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1339k, j6, i6, z6);
    }

    private final void G(int i6) {
        if (i6 < 0 || i6 >= b().i().length()) {
            throw new java.lang.IllegalArgumentException(("offset(" + i6 + ") is out of bounds [0, " + b().length() + ')').toString());
        }
    }

    private final void H(int i6) {
        if (i6 < 0 || i6 > b().i().length()) {
            throw new java.lang.IllegalArgumentException(("offset(" + i6 + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    private final void I(int i6) {
        if (i6 < 0 || i6 >= this.f6728f) {
            throw new java.lang.IllegalArgumentException(("lineIndex(" + i6 + ") is out of bounds [0, " + this.f6728f + ')').toString());
        }
    }

    private final M0.C1332d b() {
        return this.f6723a.e();
    }

    public final float A() {
        return this.f6726d;
    }

    public final long B(int i6) {
        H(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(i6 == b().length() ? p097j7.AbstractC6879v.o(this.f6730h) : M0.AbstractC1341m.a(this.f6730h, i6));
        return c1345q.k(c1345q.e().j(c1345q.r(i6)), false);
    }

    public final void C(p141o0.InterfaceC6993q0 interfaceC6993q0, long j6, p141o0.c2 c2Var, X0.k kVar, p161q0.h hVar, int i6) {
        interfaceC6993q0.m();
        java.util.List list = this.f6730h;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            M0.C1345q c1345q = (M0.C1345q) list.get(i10);
            c1345q.e().c(interfaceC6993q0, j6, c2Var, kVar, hVar, i6);
            interfaceC6993q0.d(0.0f, c1345q.e().getHeight());
        }
        interfaceC6993q0.s();
    }

    public final void E(p141o0.InterfaceC6993q0 interfaceC6993q0, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.c2 c2Var, X0.k kVar, p161q0.h hVar, int i6) {
        U0.b.a(this, interfaceC6993q0, abstractC6984n0, f6, c2Var, kVar, hVar, i6);
    }

    public final float[] a(long j6, float[] fArr, int i6) {
        G(M0.N.l(j6));
        H(M0.N.k(j6));
        p247y7.M m6 = new p247y7.M();
        m6.f57252C = i6;
        M0.AbstractC1341m.d(this.f6730h, j6, new M0.C1338j.a(j6, fArr, m6, new p247y7.L()));
        return fArr;
    }

    public final X0.i c(int i6) {
        H(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(i6 == b().length() ? p097j7.AbstractC6879v.o(this.f6730h) : M0.AbstractC1341m.a(this.f6730h, i6));
        return c1345q.e().m(c1345q.r(i6));
    }

    public final p131n0.i d(int i6) {
        G(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.a(this.f6730h, i6));
        return c1345q.i(c1345q.e().q(c1345q.r(i6)));
    }

    public final p131n0.i e(int i6) {
        H(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(i6 == b().length() ? p097j7.AbstractC6879v.o(this.f6730h) : M0.AbstractC1341m.a(this.f6730h, i6));
        return c1345q.i(c1345q.e().i(c1345q.r(i6)));
    }

    public final boolean f() {
        return this.f6725c;
    }

    public final float g() {
        if (this.f6730h.isEmpty()) {
            return 0.0f;
        }
        return ((M0.C1345q) this.f6730h.get(0)).e().l();
    }

    public final float h() {
        return this.f6727e;
    }

    public final float i(int i6, boolean z6) {
        H(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(i6 == b().length() ? p097j7.AbstractC6879v.o(this.f6730h) : M0.AbstractC1341m.a(this.f6730h, i6));
        return c1345q.e().z(c1345q.r(i6), z6);
    }

    public final M0.C1339k j() {
        return this.f6723a;
    }

    public final float k() {
        if (this.f6730h.isEmpty()) {
            return 0.0f;
        }
        M0.C1345q c1345q = (M0.C1345q) p097j7.AbstractC6879v.t0(this.f6730h);
        return c1345q.o(c1345q.e().h());
    }

    public final float l(int i6) {
        I(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.b(this.f6730h, i6));
        return c1345q.o(c1345q.e().o(c1345q.s(i6)));
    }

    public final int m() {
        return this.f6728f;
    }

    public final int n(int i6, boolean z6) {
        I(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.b(this.f6730h, i6));
        return c1345q.m(c1345q.e().t(c1345q.s(i6), z6));
    }

    public final int o(int i6) {
        int iA;
        if (i6 >= b().length()) {
            iA = p097j7.AbstractC6879v.o(this.f6730h);
        } else {
            iA = i6 < 0 ? 0 : M0.AbstractC1341m.a(this.f6730h, i6);
        }
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(iA);
        return c1345q.n(c1345q.e().k(c1345q.r(i6)));
    }

    public final int p(float f6) {
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.c(this.f6730h, f6));
        return c1345q.d() == 0 ? c1345q.g() : c1345q.n(c1345q.e().x(c1345q.t(f6)));
    }

    public final float q(int i6) {
        I(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.b(this.f6730h, i6));
        return c1345q.e().A(c1345q.s(i6));
    }

    public final float r(int i6) {
        I(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.b(this.f6730h, i6));
        return c1345q.e().v(c1345q.s(i6));
    }

    public final int s(int i6) {
        I(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.b(this.f6730h, i6));
        return c1345q.m(c1345q.e().s(c1345q.s(i6)));
    }

    public final float t(int i6) {
        I(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.b(this.f6730h, i6));
        return c1345q.o(c1345q.e().g(c1345q.s(i6)));
    }

    public final int u(long j6) {
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(M0.AbstractC1341m.c(this.f6730h, p131n0.g.n(j6)));
        return c1345q.d() == 0 ? c1345q.f() : c1345q.m(c1345q.e().p(c1345q.q(j6)));
    }

    public final X0.i v(int i6) {
        H(i6);
        M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(i6 == b().length() ? p097j7.AbstractC6879v.o(this.f6730h) : M0.AbstractC1341m.a(this.f6730h, i6));
        return c1345q.e().f(c1345q.r(i6));
    }

    public final java.util.List w() {
        return this.f6730h;
    }

    public final p141o0.Q1 x(int i6, int i10) {
        if (i6 >= 0 && i6 <= i10 && i10 <= b().i().length()) {
            if (i6 == i10) {
                return p141o0.Y.a();
            }
            p141o0.Q1 q1A = p141o0.Y.a();
            M0.AbstractC1341m.d(this.f6730h, M0.O.b(i6, i10), new M0.C1338j.b(q1A, i6, i10));
            return q1A;
        }
        throw new java.lang.IllegalArgumentException(("Start(" + i6 + ") or End(" + i10 + ") is out of range [0.." + b().i().length() + "), or start > end!").toString());
    }

    public final java.util.List y() {
        return this.f6729g;
    }

    public final long z(p131n0.i iVar, int i6, M0.I i10) {
        M0.N.a aVar;
        M0.N.a aVar2;
        int iC = M0.AbstractC1341m.c(this.f6730h, iVar.l());
        if (((M0.C1345q) this.f6730h.get(iC)).a() >= iVar.e() || iC == p097j7.AbstractC6879v.o(this.f6730h)) {
            M0.C1345q c1345q = (M0.C1345q) this.f6730h.get(iC);
            return M0.C1345q.l(c1345q, c1345q.e().d(c1345q.p(iVar), i6, i10), false, 1, null);
        }
        int iC2 = M0.AbstractC1341m.c(this.f6730h, iVar.e());
        long jA = M0.N.f6666b.a();
        while (true) {
            aVar = M0.N.f6666b;
            if (!M0.N.g(jA, aVar.a()) || iC > iC2) {
                break;
            }
            M0.C1345q c1345q2 = (M0.C1345q) this.f6730h.get(iC);
            jA = M0.C1345q.l(c1345q2, c1345q2.e().d(c1345q2.p(iVar), i6, i10), false, 1, null);
            iC++;
        }
        if (M0.N.g(jA, aVar.a())) {
            return aVar.a();
        }
        long jA2 = aVar.a();
        while (true) {
            aVar2 = M0.N.f6666b;
            if (!M0.N.g(jA2, aVar2.a()) || iC > iC2) {
                break;
            }
            M0.C1345q c1345q3 = (M0.C1345q) this.f6730h.get(iC2);
            jA2 = M0.C1345q.l(c1345q3, c1345q3.e().d(c1345q3.p(iVar), i6, i10), false, 1, null);
            iC2--;
        }
        return M0.N.g(jA2, aVar2.a()) ? jA : M0.O.b(M0.N.n(jA), M0.N.i(jA2));
    }
}
