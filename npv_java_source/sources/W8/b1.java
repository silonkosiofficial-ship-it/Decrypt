package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends W8.J {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final W8.b1 f15488E = new W8.b1();

    private b1() {
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        W8.f1 f1Var = (W8.f1) iVar.i(W8.f1.f15500E);
        if (f1Var == null) {
            throw new java.lang.UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f1Var.f15501D = true;
    }

    @Override // W8.J
    public java.lang.String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // W8.J
    public boolean v1(p127m7.i iVar) {
        return false;
    }

    @Override // W8.J
    public W8.J x1(int i6, java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
