package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 extends p127m7.a implements W8.InterfaceC1822z0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final W8.L0 f15457D = new W8.L0();

    private L0() {
        super(W8.InterfaceC1822z0.f15544h);
    }

    @Override // W8.InterfaceC1822z0
    public W8.InterfaceC1783f0 E0(boolean z6, boolean z10, p237x7.l lVar) {
        return W8.M0.f15460C;
    }

    @Override // W8.InterfaceC1822z0
    public R8.h N() {
        return R8.k.i();
    }

    @Override // W8.InterfaceC1822z0
    public java.util.concurrent.CancellationException e0() {
        throw new java.lang.IllegalStateException("This job is always active");
    }

    @Override // W8.InterfaceC1822z0
    public W8.InterfaceC1783f0 e1(p237x7.l lVar) {
        return W8.M0.f15460C;
    }

    @Override // W8.InterfaceC1822z0
    public boolean f() {
        return true;
    }

    @Override // W8.InterfaceC1822z0
    public boolean f1() {
        return false;
    }

    @Override // W8.InterfaceC1822z0
    public java.lang.Object g0(p127m7.e eVar) {
        throw new java.lang.UnsupportedOperationException("This job is always active");
    }

    @Override // W8.InterfaceC1822z0
    public boolean isCancelled() {
        return false;
    }

    @Override // W8.InterfaceC1822z0
    public W8.InterfaceC1807s l1(W8.InterfaceC1811u interfaceC1811u) {
        return W8.M0.f15460C;
    }

    @Override // W8.InterfaceC1822z0
    public void o(java.util.concurrent.CancellationException cancellationException) {
    }

    @Override // W8.InterfaceC1822z0
    public boolean start() {
        return false;
    }

    public java.lang.String toString() {
        return "NonCancellable";
    }
}
