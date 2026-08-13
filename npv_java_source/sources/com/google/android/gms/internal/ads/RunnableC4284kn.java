package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC4284kn implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel f37010C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrw f37011D;

    RunnableC4284kn(com.google.android.gms.internal.ads.zzbrw zzbrwVar, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f37010C = adOverlayInfoParcel;
        this.f37011D = zzbrwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p174r3.v.m();
        p204u3.y.a(this.f37011D.f40428a, this.f37010C, true, null);
    }
}
