package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class Q implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.P f50023C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.util.concurrent.Callable f50024D;

    Q(p115l4.P p6, java.util.concurrent.Callable callable) {
        this.f50023C = p6;
        this.f50024D = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f50023C.s(this.f50024D.call());
        } catch (java.lang.Exception e6) {
            this.f50023C.r(e6);
        } catch (java.lang.Throwable th) {
            this.f50023C.r(new java.lang.RuntimeException(th));
        }
    }
}
