package p242y1;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    private static class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f57197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f57198b;

        /* JADX INFO: renamed from: y1.i$a$a, reason: collision with other inner class name */
        private static class C0756a extends java.lang.Thread {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final int f57199C;

            C0756a(java.lang.Runnable runnable, java.lang.String str, int i6) {
                super(runnable, str);
                this.f57199C = i6;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                android.os.Process.setThreadPriority(this.f57199C);
                super.run();
            }
        }

        a(java.lang.String str, int i6) {
            this.f57197a = str;
            this.f57198b = i6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new y1.i.a.C0756a(runnable, this.f57197a, this.f57198b);
        }
    }

    private static class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private java.util.concurrent.Callable f57200C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private B1.a f57201D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private android.os.Handler f57202E;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ B1.a f57203C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f57204D;

            a(B1.a aVar, java.lang.Object obj) {
                this.f57203C = aVar;
                this.f57204D = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f57203C.accept(this.f57204D);
            }
        }

        b(android.os.Handler handler, java.util.concurrent.Callable callable, B1.a aVar) {
            this.f57200C = callable;
            this.f57201D = aVar;
            this.f57202E = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.Object objCall;
            try {
                objCall = this.f57200C.call();
            } catch (java.lang.Exception unused) {
                objCall = null;
            }
            this.f57202E.post(new y1.i.b.a(this.f57201D, objCall));
        }
    }

    static java.util.concurrent.ThreadPoolExecutor a(java.lang.String str, int i6, int i10) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, i10, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new y1.i.a(str, i6));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(java.util.concurrent.Executor executor, java.util.concurrent.Callable callable, B1.a aVar) {
        executor.execute(new y1.i.b(p242y1.b.a(), callable, aVar));
    }

    static java.lang.Object c(java.util.concurrent.ExecutorService executorService, java.util.concurrent.Callable callable, int i6) throws java.lang.InterruptedException {
        try {
            return executorService.submit(callable).get(i6, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e6) {
            throw e6;
        } catch (java.util.concurrent.ExecutionException e10) {
            throw new java.lang.RuntimeException(e10);
        } catch (java.util.concurrent.TimeoutException unused) {
            throw new java.lang.InterruptedException("timeout");
        }
    }
}
