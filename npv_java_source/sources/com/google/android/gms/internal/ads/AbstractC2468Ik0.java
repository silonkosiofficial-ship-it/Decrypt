package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ik0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2468Ik0 extends com.google.android.gms.internal.ads.AbstractFutureC2394Gk0 implements P4.d {
    protected AbstractC2468Ik0() {
    }

    @Override // P4.d
    public final void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        q().e(runnable, executor);
    }

    protected abstract P4.d q();
}
