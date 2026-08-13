package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class O90 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f30455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f30456b;

    O90(com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90) {
        this.f30455a = q90;
        this.f30456b = e90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.E90 e90 = this.f30456b;
        e90.c(th);
        e90.K0(false);
        this.f30455a.a(e90);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void c(java.lang.Object obj) {
    }
}
