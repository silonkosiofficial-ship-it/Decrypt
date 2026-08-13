package M;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private M0.C1332d f6486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private M0.P f6487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private R0.AbstractC1494h.b f6488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.List f6493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private M.c f6494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f6495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Y0.e f6496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private M0.C1339k f6497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Y0.v f6498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private M0.K f6499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f6501p;

    private e(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, java.util.List list) {
        this.f6486a = c1332d;
        this.f6487b = p6;
        this.f6488c = bVar;
        this.f6489d = i6;
        this.f6490e = z6;
        this.f6491f = i10;
        this.f6492g = i11;
        this.f6493h = list;
        this.f6495j = M.a.f6472a.a();
        this.f6500o = -1;
        this.f6501p = -1;
    }

    public /* synthetic */ e(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, java.util.List list, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, bVar, i6, z6, i10, i11, list);
    }

    private final M0.C1338j e(long j6, Y0.v vVar) {
        M0.C1339k c1339kL = l(vVar);
        return new M0.C1338j(c1339kL, M.b.a(j6, this.f6490e, this.f6489d, c1339kL.b()), M.b.b(this.f6490e, this.f6489d, this.f6491f), X0.u.e(this.f6489d, X0.u.f15666a.b()), null);
    }

    private final void g() {
        this.f6497l = null;
        this.f6499n = null;
        this.f6501p = -1;
        this.f6500o = -1;
    }

    private final boolean j(M0.K k6, long j6, Y0.v vVar) {
        if (k6 == null || k6.w().j().c() || vVar != k6.l().d()) {
            return true;
        }
        if (Y0.C1859b.f(j6, k6.l().a())) {
            return false;
        }
        return Y0.C1859b.l(j6) != Y0.C1859b.l(k6.l().a()) || ((float) Y0.C1859b.k(j6)) < k6.w().h() || k6.w().f();
    }

    private final M0.C1339k l(Y0.v vVar) {
        M0.C1339k c1339k = this.f6497l;
        if (c1339k == null || vVar != this.f6498m || c1339k.c()) {
            this.f6498m = vVar;
            M0.C1332d c1332d = this.f6486a;
            M0.P pD = M0.Q.d(this.f6487b, vVar);
            Y0.e eVar = this.f6496k;
            p247y7.AbstractC7350t.c(eVar);
            R0.AbstractC1494h.b bVar = this.f6488c;
            java.util.List listM = this.f6493h;
            if (listM == null) {
                listM = p097j7.AbstractC6879v.m();
            }
            c1339k = new M0.C1339k(c1332d, pD, listM, eVar, bVar);
        }
        this.f6497l = c1339k;
        return c1339k;
    }

    private final M0.K m(Y0.v vVar, long j6, M0.C1338j c1338j) {
        float fMin = java.lang.Math.min(c1338j.j().b(), c1338j.A());
        M0.C1332d c1332d = this.f6486a;
        M0.P p6 = this.f6487b;
        java.util.List listM = this.f6493h;
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        int i6 = this.f6491f;
        boolean z6 = this.f6490e;
        int i10 = this.f6489d;
        Y0.e eVar = this.f6496k;
        p247y7.AbstractC7350t.c(eVar);
        return new M0.K(new M0.J(c1332d, p6, list, i6, z6, i10, eVar, vVar, this.f6488c, j6, (p247y7.AbstractC7342k) null), c1338j, Y0.c.f(j6, Y0.u.a(H.E.a(fMin), H.E.a(c1338j.h()))), null);
    }

    public final Y0.e a() {
        return this.f6496k;
    }

    public final M0.K b() {
        return this.f6499n;
    }

    public final M0.K c() {
        M0.K k6 = this.f6499n;
        if (k6 != null) {
            return k6;
        }
        throw new java.lang.IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i6, Y0.v vVar) {
        int i10 = this.f6500o;
        int i11 = this.f6501p;
        if (i6 == i10 && i10 != -1) {
            return i11;
        }
        int iA = H.E.a(e(Y0.c.a(0, i6, 0, Integer.MAX_VALUE), vVar).h());
        this.f6500o = i6;
        this.f6501p = iA;
        return iA;
    }

    public final boolean f(long j6, Y0.v vVar) {
        M0.C1338j c1338jE;
        if (this.f6492g > 1) {
            M.c.a aVar = M.c.f6474h;
            M.c cVar = this.f6494i;
            M0.P p6 = this.f6487b;
            Y0.e eVar = this.f6496k;
            p247y7.AbstractC7350t.c(eVar);
            M.c cVarA = aVar.a(cVar, vVar, p6, eVar, this.f6488c);
            this.f6494i = cVarA;
            j6 = cVarA.c(j6, this.f6492g);
        }
        if (j(this.f6499n, j6, vVar)) {
            c1338jE = e(j6, vVar);
        } else {
            M0.K k6 = this.f6499n;
            p247y7.AbstractC7350t.c(k6);
            if (Y0.C1859b.f(j6, k6.l().a())) {
                return false;
            }
            M0.K k10 = this.f6499n;
            p247y7.AbstractC7350t.c(k10);
            c1338jE = k10.w();
        }
        this.f6499n = m(vVar, j6, c1338jE);
        return true;
    }

    public final int h(Y0.v vVar) {
        return H.E.a(l(vVar).b());
    }

    public final int i(Y0.v vVar) {
        return H.E.a(l(vVar).a());
    }

    public final void k(Y0.e eVar) {
        Y0.e eVar2 = this.f6496k;
        long jD = eVar != null ? M.a.d(eVar) : M.a.f6472a.a();
        if (eVar2 == null) {
            this.f6496k = eVar;
            this.f6495j = jD;
        } else if (eVar == null || !M.a.e(this.f6495j, jD)) {
            this.f6496k = eVar;
            this.f6495j = jD;
            g();
        }
    }

    public final void n(M0.C1332d c1332d, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, java.util.List list) {
        this.f6486a = c1332d;
        this.f6487b = p6;
        this.f6488c = bVar;
        this.f6489d = i6;
        this.f6490e = z6;
        this.f6491f = i10;
        this.f6492g = i11;
        this.f6493h = list;
        g();
    }
}
