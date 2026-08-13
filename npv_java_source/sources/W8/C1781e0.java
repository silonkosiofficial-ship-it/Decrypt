package W8;

/* JADX INFO: renamed from: W8.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1781e0 implements W8.InterfaceC1783f0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.Future f15498C;

    public C1781e0(java.util.concurrent.Future future) {
        this.f15498C = future;
    }

    @Override // W8.InterfaceC1783f0
    public void e() {
        this.f15498C.cancel(false);
    }

    public java.lang.String toString() {
        return "DisposableFutureHandle[" + this.f15498C + ']';
    }
}
