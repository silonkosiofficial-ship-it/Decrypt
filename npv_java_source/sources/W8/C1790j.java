package W8;

/* JADX INFO: renamed from: W8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1790j implements W8.InterfaceC1792k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Future f15505a;

    public C1790j(java.util.concurrent.Future future) {
        this.f15505a = future;
    }

    @Override // W8.InterfaceC1792k
    public void a(java.lang.Throwable th) {
        this.f15505a.cancel(false);
    }

    public java.lang.String toString() {
        return "CancelFutureOnCancel[" + this.f15505a + ']';
    }
}
