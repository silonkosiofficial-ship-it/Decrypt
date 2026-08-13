package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class O implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Handler f50016C = new p065g4.a(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f50016C.post(runnable);
    }
}
