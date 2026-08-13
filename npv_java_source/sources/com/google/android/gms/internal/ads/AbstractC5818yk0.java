package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5818yk0 extends com.google.android.gms.internal.ads.Vk0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.Executor f40126E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5928zk0 f40127F;

    AbstractC5818yk0(com.google.android.gms.internal.ads.C5928zk0 c5928zk0, java.util.concurrent.Executor executor) {
        this.f40127F = c5928zk0;
        executor.getClass();
        this.f40126E = executor;
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final void d(java.lang.Throwable th) {
        this.f40127F.f40368R = null;
        if (th instanceof java.util.concurrent.ExecutionException) {
            this.f40127F.h(((java.util.concurrent.ExecutionException) th).getCause());
        } else if (th instanceof java.util.concurrent.CancellationException) {
            this.f40127F.cancel(false);
        } else {
            this.f40127F.h(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final void e(java.lang.Object obj) {
        this.f40127F.f40368R = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final boolean f() {
        return this.f40127F.isDone();
    }

    abstract void h(java.lang.Object obj);

    final void i() {
        try {
            this.f40126E.execute(this);
        } catch (java.util.concurrent.RejectedExecutionException e6) {
            this.f40127F.h(e6);
        }
    }
}
