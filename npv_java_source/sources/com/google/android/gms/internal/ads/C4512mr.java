package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4512mr implements P4.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4062il0 f37424C = com.google.android.gms.internal.ads.C4062il0.D();

    private static final boolean a(boolean z6) {
        if (!z6) {
            p174r3.v.s().w(new java.lang.IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z6;
    }

    public final boolean c(java.lang.Object obj) {
        boolean zF = this.f37424C.f(obj);
        a(zF);
        return zF;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.f37424C.cancel(z6);
    }

    public final boolean d(java.lang.Throwable th) {
        boolean zH = this.f37424C.h(th);
        a(zH);
        return zH;
    }

    @Override // P4.d
    public final void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f37424C.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f37424C.get();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f37424C.get(j6, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37424C.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f37424C.isDone();
    }
}
