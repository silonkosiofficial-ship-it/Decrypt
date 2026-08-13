package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class s implements p115l4.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f50031a = new java.util.concurrent.CountDownLatch(1);

    /* synthetic */ s(p115l4.r rVar) {
    }

    @Override // p115l4.InterfaceC6927h
    public final void a(java.lang.Object obj) {
        this.f50031a.countDown();
    }

    @Override // p115l4.InterfaceC6924e
    public final void b() {
        this.f50031a.countDown();
    }

    public final void c() throws java.lang.InterruptedException {
        this.f50031a.await();
    }

    @Override // p115l4.InterfaceC6926g
    public final void d(java.lang.Exception exc) {
        this.f50031a.countDown();
    }

    public final boolean e(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f50031a.await(j6, timeUnit);
    }
}
