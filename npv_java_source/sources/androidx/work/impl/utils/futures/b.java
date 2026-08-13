package androidx.work.impl.utils.futures;

/* JADX INFO: loaded from: classes.dex */
enum b implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "DirectExecutor";
    }
}
