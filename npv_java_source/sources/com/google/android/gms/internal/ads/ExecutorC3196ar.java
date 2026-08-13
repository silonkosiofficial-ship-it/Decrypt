package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ExecutorC3196ar implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Handler f34153C = new p214v3.HandlerC7266r0(android.os.Looper.getMainLooper());

    ExecutorC3196ar() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            this.f34153C.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            p174r3.v.t();
            p214v3.E0.n(p174r3.v.s().e(), th);
            throw th;
        }
    }
}
