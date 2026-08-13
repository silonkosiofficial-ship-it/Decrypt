package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class QU implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.RU f30998a;

    QU(com.google.android.gms.internal.ads.RU ru) {
        this.f30998a = ru;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p184s3.W0 w0A = this.f30998a.f31272a.d().a(th);
        this.f30998a.f31275d.u0(w0A);
        com.google.android.gms.internal.ads.L70.b(w0A.f54145C, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* synthetic */ void c(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.AbstractC2777Qy) obj).b();
    }
}
