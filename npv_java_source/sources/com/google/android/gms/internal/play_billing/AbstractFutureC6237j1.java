package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFutureC6237j1 extends com.google.android.gms.internal.play_billing.V implements java.util.concurrent.Future {
    protected AbstractFutureC6237j1() {
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return m().get();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return m().get(j6, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return m().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return m().isDone();
    }

    protected abstract java.util.concurrent.Future m();
}
