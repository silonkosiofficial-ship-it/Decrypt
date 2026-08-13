package p214v3;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC7232a implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p214v3.B f55870C;

    RunnableC7232a(p214v3.B b6) {
        this.f55870C = b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f55870C.f55821b = java.lang.Thread.currentThread();
        this.f55870C.a();
    }
}
