package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2904Ui implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2698Ot f32255a;

    C2904Ui(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f32255a = interfaceC2698Ot;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p174r3.v.s().x(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        p224w3.w wVar = this.f32255a.Q() != null ? this.f32255a.Q().f31207x0 : null;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f32255a;
        new p214v3.Z(interfaceC2698Ot.getContext(), interfaceC2698Ot.n().f56217C, str, null, wVar).b();
    }
}
