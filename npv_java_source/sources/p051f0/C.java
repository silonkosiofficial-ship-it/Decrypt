package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p051f0.C6541c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p051f0.C6541c f44783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f44784t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f44785u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p237x7.l f44786v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p237x7.l f44787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f44788x;

    public C(p051f0.C6541c c6541c, p237x7.l lVar, p237x7.l lVar2, boolean z6, boolean z10) {
        p237x7.l lVarK;
        p237x7.l lVarH;
        super(0, p051f0.n.f44834G.a(), p051f0.p.K(lVar, (c6541c == null || (lVarH = c6541c.h()) == null) ? ((p051f0.C6539a) p051f0.p.f44855j.get()).h() : lVarH, z6), p051f0.p.M(lVar2, (c6541c == null || (lVarK = c6541c.k()) == null) ? ((p051f0.C6539a) p051f0.p.f44855j.get()).k() : lVarK));
        this.f44783s = c6541c;
        this.f44784t = z6;
        this.f44785u = z10;
        this.f44786v = super.h();
        this.f44787w = super.k();
        this.f44788x = V.AbstractC1701c.a();
    }

    private final p051f0.C6541c T() {
        p051f0.C6541c c6541c = this.f44783s;
        return c6541c == null ? (p051f0.C6541c) p051f0.p.f44855j.get() : c6541c;
    }

    @Override // p051f0.C6541c
    public p051f0.l C() {
        return T().C();
    }

    @Override // p051f0.C6541c
    public p170r.L E() {
        return T().E();
    }

    @Override // p051f0.C6541c, p051f0.k
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public p237x7.l h() {
        return this.f44786v;
    }

    @Override // p051f0.C6541c
    public void P(p170r.L l6) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.C6541c
    public p051f0.C6541c Q(p237x7.l lVar, p237x7.l lVar2) {
        p237x7.l lVarL = p051f0.p.L(lVar, h(), false, 4, null);
        p237x7.l lVarM = p051f0.p.M(lVar2, k());
        return !this.f44784t ? new p051f0.C(T().Q(null, lVarM), lVarL, lVarM, false, true) : T().Q(lVarL, lVarM);
    }

    public final long U() {
        return this.f44788x;
    }

    @Override // p051f0.C6541c, p051f0.k
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public java.lang.Void m(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.C6541c, p051f0.k
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public java.lang.Void n(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    public void X(p237x7.l lVar) {
        this.f44786v = lVar;
    }

    public void Y(p237x7.l lVar) {
        this.f44787w = lVar;
    }

    @Override // p051f0.C6541c, p051f0.k
    public void d() {
        p051f0.C6541c c6541c;
        t(true);
        if (!this.f44785u || (c6541c = this.f44783s) == null) {
            return;
        }
        c6541c.d();
    }

    @Override // p051f0.k
    public int f() {
        return T().f();
    }

    @Override // p051f0.k
    public p051f0.n g() {
        return T().g();
    }

    @Override // p051f0.C6541c, p051f0.k
    public boolean i() {
        return T().i();
    }

    @Override // p051f0.C6541c, p051f0.k
    public int j() {
        return T().j();
    }

    @Override // p051f0.C6541c, p051f0.k
    public p237x7.l k() {
        return this.f44787w;
    }

    @Override // p051f0.C6541c, p051f0.k
    public void o() {
        T().o();
    }

    @Override // p051f0.C6541c, p051f0.k
    public void p(p051f0.y yVar) {
        T().p(yVar);
    }

    @Override // p051f0.k
    public void u(int i6) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.k
    public void v(p051f0.n nVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.C6541c, p051f0.k
    public void w(int i6) {
        T().w(i6);
    }

    @Override // p051f0.C6541c, p051f0.k
    public p051f0.k x(p237x7.l lVar) {
        p237x7.l lVarL = p051f0.p.L(lVar, h(), false, 4, null);
        return !this.f44784t ? p051f0.p.D(T().x(null), lVarL, true) : T().x(lVarL);
    }
}
