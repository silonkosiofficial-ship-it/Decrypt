package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class N implements java.util.concurrent.Executor {
    N() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
