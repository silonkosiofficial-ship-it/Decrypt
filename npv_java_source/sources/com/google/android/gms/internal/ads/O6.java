package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class O6 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC3448d7 f30445C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.P6 f30446D;

    O6(com.google.android.gms.internal.ads.P6 p6, com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) {
        this.f30445C = abstractC3448d7;
        this.f30446D = p6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30446D.f30650D.put(this.f30445C);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
