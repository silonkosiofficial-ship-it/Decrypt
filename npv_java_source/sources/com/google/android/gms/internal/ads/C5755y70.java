package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5755y70 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5865z70 f39992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f39993b;

    C5755y70(com.google.android.gms.internal.ads.C5865z70 c5865z70, int i6) {
        this.f39993b = i6;
        this.f39992a = c5865z70;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p174r3.v.s().x(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        int i6 = this.f39993b;
        this.f39992a.b((java.lang.String) obj, i6);
    }
}
