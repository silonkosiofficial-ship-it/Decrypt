package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class x implements java.util.concurrent.Executor {
    x() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        new java.lang.Thread(runnable).start();
    }
}
