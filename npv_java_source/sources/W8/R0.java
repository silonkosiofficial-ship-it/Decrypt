package W8;

/* JADX INFO: loaded from: classes2.dex */
final class R0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final W8.J f15470C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final W8.InterfaceC1794l f15471D;

    public R0(W8.J j6, W8.InterfaceC1794l interfaceC1794l) {
        this.f15470C = j6;
        this.f15471D = interfaceC1794l;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15471D.F(this.f15470C, p087i7.M.f46721a);
    }
}
