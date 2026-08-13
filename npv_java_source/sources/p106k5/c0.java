package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.ExecutorService f49608a = p106k5.E.c("awaitEvenIfOnMainThread task continuation executor");

    public static java.lang.Object b(p115l4.AbstractC6931l abstractC6931l) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        abstractC6931l.h(f49608a, new p115l4.InterfaceC6922c() { // from class: k5.b0
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l2) {
                return p106k5.c0.d(countDownLatch, abstractC6931l2);
            }
        });
        countDownLatch.await(android.os.Looper.getMainLooper() == android.os.Looper.myLooper() ? 3000L : 4000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        if (abstractC6931l.o()) {
            return abstractC6931l.l();
        }
        if (abstractC6931l.m()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        if (abstractC6931l.n()) {
            throw new java.lang.IllegalStateException(abstractC6931l.k());
        }
        throw new java.util.concurrent.TimeoutException();
    }

    public static boolean c(java.util.concurrent.CountDownLatch countDownLatch, long j6, java.util.concurrent.TimeUnit timeUnit) {
        boolean zAwait;
        boolean z6 = false;
        try {
            long nanos = timeUnit.toNanos(j6);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z6 = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z6) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (java.lang.Throwable th) {
            if (z6) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object d(java.util.concurrent.CountDownLatch countDownLatch, p115l4.AbstractC6931l abstractC6931l) {
        countDownLatch.countDown();
        return null;
    }
}
