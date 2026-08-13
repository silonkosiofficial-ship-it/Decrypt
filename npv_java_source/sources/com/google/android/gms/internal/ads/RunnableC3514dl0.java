package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3514dl0 extends com.google.android.gms.internal.ads.AbstractC3015Xj0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.lang.Runnable f34790J;

    public RunnableC3514dl0(java.lang.Runnable runnable) {
        runnable.getClass();
        this.f34790J = runnable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final java.lang.String c() {
        return "task=[" + this.f34790J.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f34790J.run();
        } catch (java.lang.Throwable th) {
            h(th);
            throw th;
        }
    }
}
