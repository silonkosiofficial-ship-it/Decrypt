package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class WI implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f32711a = "Google";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.ZI f32712b;

    WI(com.google.android.gms.internal.ads.ZI zi, java.lang.String str, boolean z6) {
        this.f32712b = zi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25627m5)).booleanValue()) {
            p174r3.v.s().w(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        this.f32712b.f33551k.t((com.google.android.gms.internal.ads.InterfaceC2698Ot) obj);
        com.google.android.gms.internal.ads.ZI zi = this.f32712b;
        com.google.android.gms.internal.ads.C4512mr c4512mrC0 = zi.f33551k.c0();
        com.google.android.gms.internal.ads.QT qtT = zi.T(this.f32711a, true);
        if (qtT != null && c4512mrC0 != null) {
            c4512mrC0.c(qtT);
        } else if (c4512mrC0 != null) {
            c4512mrC0.cancel(false);
        }
    }
}
