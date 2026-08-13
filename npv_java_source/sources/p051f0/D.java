package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p051f0.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p051f0.k f44789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f44790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f44791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p237x7.l f44792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p237x7.l f44793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f44794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p051f0.k f44795m;

    public D(p051f0.k kVar, p237x7.l lVar, boolean z6, boolean z10) {
        p237x7.l lVarH;
        super(0, p051f0.n.f44834G.a(), null);
        this.f44789g = kVar;
        this.f44790h = z6;
        this.f44791i = z10;
        this.f44792j = p051f0.p.K(lVar, (kVar == null || (lVarH = kVar.h()) == null) ? ((p051f0.C6539a) p051f0.p.f44855j.get()).h() : lVarH, z6);
        this.f44794l = V.AbstractC1701c.a();
        this.f44795m = this;
    }

    private final p051f0.k A() {
        p051f0.k kVar = this.f44789g;
        return kVar == null ? (p051f0.k) p051f0.p.f44855j.get() : kVar;
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public p237x7.l h() {
        return this.f44792j;
    }

    public final long C() {
        return this.f44794l;
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public java.lang.Void m(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public java.lang.Void n(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    public void F(p237x7.l lVar) {
        this.f44792j = lVar;
    }

    @Override // p051f0.k
    public void d() {
        p051f0.k kVar;
        t(true);
        if (!this.f44791i || (kVar = this.f44789g) == null) {
            return;
        }
        kVar.d();
    }

    @Override // p051f0.k
    public int f() {
        return A().f();
    }

    @Override // p051f0.k
    public p051f0.n g() {
        return A().g();
    }

    @Override // p051f0.k
    public boolean i() {
        return A().i();
    }

    @Override // p051f0.k
    public p237x7.l k() {
        return this.f44793k;
    }

    @Override // p051f0.k
    public void o() {
        A().o();
    }

    @Override // p051f0.k
    public void p(p051f0.y yVar) {
        A().p(yVar);
    }

    @Override // p051f0.k
    public p051f0.k x(p237x7.l lVar) {
        p237x7.l lVarL = p051f0.p.L(lVar, h(), false, 4, null);
        return !this.f44790h ? p051f0.p.D(A().x(null), lVarL, true) : A().x(lVarL);
    }
}
