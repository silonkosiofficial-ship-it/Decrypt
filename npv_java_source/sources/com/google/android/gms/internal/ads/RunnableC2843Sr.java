package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2843Sr implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ boolean f31790C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2879Tr f31791D;

    RunnableC2843Sr(com.google.android.gms.internal.ads.C2879Tr c2879Tr, boolean z6) {
        this.f31790C = z6;
        this.f31791D = c2879Tr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31791D.t("windowVisibilityChanged", "isVisible", java.lang.String.valueOf(this.f31790C));
    }
}
