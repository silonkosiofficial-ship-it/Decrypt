package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2807Rr implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2879Tr f31369C;

    RunnableC2807Rr(com.google.android.gms.internal.ads.C2879Tr c2879Tr) {
        this.f31369C = c2879Tr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31369C.t("surfaceDestroyed", new java.lang.String[0]);
    }
}
