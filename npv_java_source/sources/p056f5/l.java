package p056f5;

/* JADX INFO: loaded from: classes3.dex */
public enum l implements java.util.concurrent.Executor {
    INSTANCE;


    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final android.os.Handler f45284D = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        f45284D.post(runnable);
    }
}
