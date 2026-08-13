package B;

/* JADX INFO: loaded from: classes.dex */
public final class h implements D.InterfaceC0876m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B.D f373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f374b;

    public h(B.D d6, int i6) {
        this.f373a = d6;
        this.f374b = i6;
    }

    @Override // D.InterfaceC0876m
    public int a() {
        return this.f373a.w().d();
    }

    @Override // D.InterfaceC0876m
    public int b() {
        return java.lang.Math.min(a() - 1, ((B.l) p097j7.AbstractC6879v.t0(this.f373a.w().j())).getIndex() + this.f374b);
    }

    @Override // D.InterfaceC0876m
    public void c() {
        D0.Z zD = this.f373a.D();
        if (zD != null) {
            zD.j();
        }
    }

    @Override // D.InterfaceC0876m
    public boolean d() {
        return !this.f373a.w().j().isEmpty();
    }

    @Override // D.InterfaceC0876m
    public int e() {
        return java.lang.Math.max(0, this.f373a.r() - this.f374b);
    }
}
