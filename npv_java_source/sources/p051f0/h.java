package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p051f0.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.l f44817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44818h;

    public h(int i6, p051f0.n nVar, p237x7.l lVar) {
        super(i6, nVar, null);
        this.f44817g = lVar;
        this.f44818h = 1;
    }

    @Override // p051f0.k
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public p237x7.l h() {
        return this.f44817g;
    }

    @Override // p051f0.k
    public void d() {
        if (e()) {
            return;
        }
        n(this);
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
    public void m(p051f0.k kVar) {
        this.f44818h++;
    }

    @Override // p051f0.k
    public void n(p051f0.k kVar) {
        int i6 = this.f44818h - 1;
        this.f44818h = i6;
        if (i6 == 0) {
            b();
        }
    }

    @Override // p051f0.k
    public void o() {
    }

    @Override // p051f0.k
    public void p(p051f0.y yVar) {
        p051f0.p.Z();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.k
    public p051f0.k x(p237x7.l lVar) {
        p051f0.p.g0(this);
        return new p051f0.e(f(), g(), p051f0.p.L(lVar, h(), false, 4, null), this);
    }
}
