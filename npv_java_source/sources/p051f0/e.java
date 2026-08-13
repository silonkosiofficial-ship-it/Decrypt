package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p051f0.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.l f44814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p051f0.k f44815h;

    public e(int i6, p051f0.n nVar, p237x7.l lVar, p051f0.k kVar) {
        super(i6, nVar, null);
        this.f44814g = lVar;
        this.f44815h = kVar;
        kVar.m(this);
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public p237x7.l h() {
        return this.f44814g;
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public java.lang.Void m(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public java.lang.Void n(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public java.lang.Void p(p051f0.y yVar) {
        p051f0.p.Z();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public p051f0.e x(p237x7.l lVar) {
        return new p051f0.e(f(), g(), p051f0.p.L(lVar, h(), false, 4, null), this.f44815h);
    }

    @Override // p051f0.k
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.f44815h.f()) {
            b();
        }
        this.f44815h.n(this);
        super.d();
    }

    @Override // p051f0.k
    public boolean i() {
        return true;
    }

    @Override // p051f0.k
    public p237x7.l k() {
        return null;
    }

    @Override // p051f0.k
    public void o() {
    }
}
