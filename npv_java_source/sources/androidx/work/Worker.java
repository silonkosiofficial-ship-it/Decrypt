package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends androidx.work.ListenableWorker {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f23806H;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.Worker.this.f23806H.q(androidx.work.Worker.this.doWork());
            } catch (java.lang.Throwable th) {
                androidx.work.Worker.this.f23806H.r(th);
            }
        }
    }

    @androidx.annotation.Keep
    @android.annotation.SuppressLint({"BanKeepAnnotation"})
    public Worker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract androidx.work.ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final P4.d startWork() {
        this.f23806H = androidx.work.impl.utils.futures.c.u();
        getBackgroundExecutor().execute(new androidx.work.Worker.a());
        return this.f23806H;
    }
}
