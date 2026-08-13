package H;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final H.D.a f3652l = new H.D.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f3653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.P f3654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Y0.e f3659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final R0.AbstractC1494h.b f3660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f3661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M0.C1339k f3662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Y0.v f3663k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private D(M0.C1332d c1332d, M0.P p6, int i6, int i10, boolean z6, int i11, Y0.e eVar, R0.AbstractC1494h.b bVar, java.util.List list) {
        this.f3653a = c1332d;
        this.f3654b = p6;
        this.f3655c = i6;
        this.f3656d = i10;
        this.f3657e = z6;
        this.f3658f = i11;
        this.f3659g = eVar;
        this.f3660h = bVar;
        this.f3661i = list;
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("no maxLines".toString());
        }
        if (i10 <= 0) {
            throw new java.lang.IllegalArgumentException("no minLines".toString());
        }
        if (i10 > i6) {
            throw new java.lang.IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }

    public /* synthetic */ D(M0.C1332d c1332d, M0.P p6, int i6, int i10, boolean z6, int i11, Y0.e eVar, R0.AbstractC1494h.b bVar, java.util.List list, int i12, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, (i12 & 4) != 0 ? Integer.MAX_VALUE : i6, (i12 & 8) != 0 ? 1 : i10, (i12 & 16) != 0 ? true : z6, (i12 & 32) != 0 ? X0.u.f15666a.a() : i11, eVar, bVar, (i12 & 256) != 0 ? p097j7.AbstractC6879v.m() : list, null);
    }

    public /* synthetic */ D(M0.C1332d c1332d, M0.P p6, int i6, int i10, boolean z6, int i11, Y0.e eVar, R0.AbstractC1494h.b bVar, java.util.List list, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, i6, i10, z6, i11, eVar, bVar, list);
    }

    private final M0.C1339k f() {
        M0.C1339k c1339k = this.f3662j;
        if (c1339k != null) {
            return c1339k;
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }

    private final M0.C1338j n(long j6, Y0.v vVar) {
        m(vVar);
        int iN = Y0.C1859b.n(j6);
        int iL = ((this.f3657e || X0.u.e(this.f3658f, X0.u.f15666a.b())) && Y0.C1859b.h(j6)) ? Y0.C1859b.l(j6) : Integer.MAX_VALUE;
        int i6 = (this.f3657e || !X0.u.e(this.f3658f, X0.u.f15666a.b())) ? this.f3655c : 1;
        if (iN != iL) {
            iL = E7.j.k(c(), iN, iL);
        }
        return new M0.C1338j(f(), Y0.C1859b.f16201b.b(0, iL, 0, Y0.C1859b.k(j6)), i6, X0.u.e(this.f3658f, X0.u.f15666a.b()), null);
    }

    public final Y0.e a() {
        return this.f3659g;
    }

    public final R0.AbstractC1494h.b b() {
        return this.f3660h;
    }

    public final int c() {
        return H.E.a(f().b());
    }

    public final int d() {
        return this.f3655c;
    }

    public final int e() {
        return this.f3656d;
    }

    public final int g() {
        return this.f3658f;
    }

    public final java.util.List h() {
        return this.f3661i;
    }

    public final boolean i() {
        return this.f3657e;
    }

    public final M0.P j() {
        return this.f3654b;
    }

    public final M0.C1332d k() {
        return this.f3653a;
    }

    public final M0.K l(long j6, Y0.v vVar, M0.K k6) {
        if (k6 != null && H.U.a(k6, this.f3653a, this.f3654b, this.f3661i, this.f3655c, this.f3657e, this.f3658f, this.f3659g, vVar, this.f3660h, j6)) {
            return k6.a(new M0.J(k6.l().j(), this.f3654b, k6.l().g(), k6.l().e(), k6.l().h(), k6.l().f(), k6.l().b(), k6.l().d(), k6.l().c(), j6, (p247y7.AbstractC7342k) null), Y0.c.f(j6, Y0.u.a(H.E.a(k6.w().A()), H.E.a(k6.w().h()))));
        }
        M0.C1338j c1338jN = n(j6, vVar);
        return new M0.K(new M0.J(this.f3653a, this.f3654b, this.f3661i, this.f3655c, this.f3657e, this.f3658f, this.f3659g, vVar, this.f3660h, j6, (p247y7.AbstractC7342k) null), c1338jN, Y0.c.f(j6, Y0.u.a(H.E.a(c1338jN.A()), H.E.a(c1338jN.h()))), null);
    }

    public final void m(Y0.v vVar) {
        M0.C1339k c1339k = this.f3662j;
        if (c1339k == null || vVar != this.f3663k || c1339k.c()) {
            this.f3663k = vVar;
            c1339k = new M0.C1339k(this.f3653a, M0.Q.d(this.f3654b, vVar), this.f3661i, this.f3659g, this.f3660h);
        }
        this.f3662j = c1339k;
    }
}
