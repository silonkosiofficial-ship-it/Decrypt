package C;

/* JADX INFO: renamed from: C.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0833g implements D.InterfaceC0876m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.K f1071a;

    public C0833g(C.K k6) {
        this.f1071a = k6;
    }

    @Override // D.InterfaceC0876m
    public int a() {
        return this.f1071a.r().d();
    }

    @Override // D.InterfaceC0876m
    public int b() {
        return ((C.InterfaceC0837k) p097j7.AbstractC6879v.t0(this.f1071a.r().j())).getIndex();
    }

    @Override // D.InterfaceC0876m
    public void c() {
        D0.Z zX = this.f1071a.x();
        if (zX != null) {
            zX.j();
        }
    }

    @Override // D.InterfaceC0876m
    public boolean d() {
        return !this.f1071a.r().j().isEmpty();
    }

    @Override // D.InterfaceC0876m
    public int e() {
        return this.f1071a.n();
    }
}
