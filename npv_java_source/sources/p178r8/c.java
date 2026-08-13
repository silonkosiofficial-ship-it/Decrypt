package p178r8;

/* JADX INFO: loaded from: classes2.dex */
class c implements G8.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.InterfaceC1420a f53986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.InterfaceC1420a f53987c;

    public c(boolean z6, O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
        this.f53985a = z6;
        this.f53986b = interfaceC1420a;
        this.f53987c = interfaceC1420a2;
    }

    @Override // G8.e.a
    public boolean a(F8.e0 e0Var, F8.e0 e0Var2) {
        return p178r8.d.d(this.f53985a, this.f53986b, this.f53987c, e0Var, e0Var2);
    }
}
