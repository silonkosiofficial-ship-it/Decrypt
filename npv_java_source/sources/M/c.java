package M;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M.c.a f6474h = new M.c.a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f6475i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static M.c f6476j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y0.v f6477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.P f6478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y0.e f6479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R0.AbstractC1494h.b f6480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M0.P f6481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6483g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final M.c a(M.c cVar, Y0.v vVar, M0.P p6, Y0.e eVar, R0.AbstractC1494h.b bVar) {
            if (cVar != null && vVar == cVar.g() && p247y7.AbstractC7350t.b(p6, cVar.f()) && eVar.getDensity() == cVar.d().getDensity() && bVar == cVar.e()) {
                return cVar;
            }
            M.c cVar2 = M.c.f6476j;
            if (cVar2 != null && vVar == cVar2.g() && p247y7.AbstractC7350t.b(p6, cVar2.f()) && eVar.getDensity() == cVar2.d().getDensity() && bVar == cVar2.e()) {
                return cVar2;
            }
            M.c cVar3 = new M.c(vVar, M0.Q.d(p6, vVar), Y0.g.a(eVar.getDensity(), eVar.v0()), bVar, null);
            M.c.f6476j = cVar3;
            return cVar3;
        }
    }

    private c(Y0.v vVar, M0.P p6, Y0.e eVar, R0.AbstractC1494h.b bVar) {
        this.f6477a = vVar;
        this.f6478b = p6;
        this.f6479c = eVar;
        this.f6480d = bVar;
        this.f6481e = M0.Q.d(p6, vVar);
        this.f6482f = Float.NaN;
        this.f6483g = Float.NaN;
    }

    public /* synthetic */ c(Y0.v vVar, M0.P p6, Y0.e eVar, R0.AbstractC1494h.b bVar, p247y7.AbstractC7342k abstractC7342k) {
        this(vVar, p6, eVar, bVar);
    }

    public final long c(long j6, int i6) {
        float height = this.f6483g;
        float height2 = this.f6482f;
        if (java.lang.Float.isNaN(height) || java.lang.Float.isNaN(height2)) {
            height = M0.AbstractC1348u.a(M.d.f6484a, this.f6481e, Y0.c.b(0, 0, 0, 0, 15, null), this.f6479c, this.f6480d, (64 & 32) != 0 ? p097j7.AbstractC6879v.m() : null, (64 & 64) != 0 ? p097j7.AbstractC6879v.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? false : false).getHeight();
            height2 = M0.AbstractC1348u.a(M.d.f6485b, this.f6481e, Y0.c.b(0, 0, 0, 0, 15, null), this.f6479c, this.f6480d, (64 & 32) != 0 ? p097j7.AbstractC6879v.m() : null, (64 & 64) != 0 ? p097j7.AbstractC6879v.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? false : false).getHeight() - height;
            this.f6483g = height;
            this.f6482f = height2;
        }
        return Y0.c.a(Y0.C1859b.n(j6), Y0.C1859b.l(j6), i6 != 1 ? E7.j.g(E7.j.d(java.lang.Math.round(height + (height2 * (i6 - 1))), 0), Y0.C1859b.k(j6)) : Y0.C1859b.m(j6), Y0.C1859b.k(j6));
    }

    public final Y0.e d() {
        return this.f6479c;
    }

    public final R0.AbstractC1494h.b e() {
        return this.f6480d;
    }

    public final M0.P f() {
        return this.f6478b;
    }

    public final Y0.v g() {
        return this.f6477a;
    }
}
