package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFutureC2394Gk0 extends com.google.android.gms.internal.ads.AbstractC2867Th0 implements java.util.concurrent.Future {
    protected AbstractFutureC2394Gk0() {
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return o().get();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return o().get(j6, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return o().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return o().isDone();
    }

    protected abstract java.util.concurrent.Future o();
}
