package W8;

/* JADX INFO: renamed from: W8.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1785g0 implements W8.InterfaceC1792k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W8.InterfaceC1783f0 f15502a;

    public C1785g0(W8.InterfaceC1783f0 interfaceC1783f0) {
        this.f15502a = interfaceC1783f0;
    }

    @Override // W8.InterfaceC1792k
    public void a(java.lang.Throwable th) {
        this.f15502a.e();
    }

    public java.lang.String toString() {
        return "DisposeOnCancel[" + this.f15502a + ']';
    }
}
