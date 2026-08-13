package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    static class a {
        public static android.os.Handler a(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }

    static java.util.concurrent.ThreadPoolExecutor b(final java.lang.String str) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new java.util.concurrent.ThreadFactory() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.emoji2.text.c.c(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Thread c(java.lang.String str, java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    static android.os.Handler d() {
        return android.os.Build.VERSION.SDK_INT >= 28 ? androidx.emoji2.text.c.a.a(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper());
    }
}
