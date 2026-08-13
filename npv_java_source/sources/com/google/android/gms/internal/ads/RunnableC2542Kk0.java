package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2542Kk0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.concurrent.Future f29006C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.ads.InterfaceC2505Jk0 f29007D;

    RunnableC2542Kk0(java.util.concurrent.Future future, com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0) {
        this.f29006C = future;
        this.f29007D = interfaceC2505Jk0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable thA;
        java.lang.Object obj = this.f29006C;
        if ((obj instanceof com.google.android.gms.internal.ads.AbstractC5160sl0) && (thA = com.google.android.gms.internal.ads.AbstractC5270tl0.a((com.google.android.gms.internal.ads.AbstractC5160sl0) obj)) != null) {
            this.f29007D.a(thA);
            return;
        }
        try {
            this.f29007D.c(com.google.android.gms.internal.ads.AbstractC2652Nk0.p(this.f29006C));
        } catch (java.util.concurrent.ExecutionException e6) {
            this.f29007D.a(e6.getCause());
        } catch (java.lang.Throwable th) {
            this.f29007D.a(th);
        }
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.C5370ug0 c5370ug0A = com.google.android.gms.internal.ads.AbstractC5590wg0.a(this);
        c5370ug0A.a(this.f29007D);
        return c5370ug0A.toString();
    }
}
