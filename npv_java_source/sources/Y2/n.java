package Y2;

/* JADX INFO: loaded from: classes.dex */
class n implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.Executor f16328C;

    static class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.Runnable f16329C;

        a(java.lang.Runnable runnable) {
            this.f16329C = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f16329C.run();
            } catch (java.lang.Exception e6) {
                p024c3.a.d("Executor", "Background execution failure.", e6);
            }
        }
    }

    n(java.util.concurrent.Executor executor) {
        this.f16328C = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f16328C.execute(new Y2.n.a(runnable));
    }
}
