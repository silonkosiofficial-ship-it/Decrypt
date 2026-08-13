package p224w3;

/* JADX INFO: loaded from: classes.dex */
final class b implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f56222a = new java.util.concurrent.atomic.AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.String f56223b;

    b(java.lang.String str) {
        this.f56223b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "AdWorker(" + this.f56223b + ") #" + this.f56222a.getAndIncrement());
    }
}
