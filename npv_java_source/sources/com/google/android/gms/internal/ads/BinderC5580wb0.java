package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class BinderC5580wb0 extends com.google.android.gms.internal.ads.AbstractBinderC2214Bp {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4062il0 f39648C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5497vp f39649D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5690xb0 f39650E;

    BinderC5580wb0(com.google.android.gms.internal.ads.C5690xb0 c5690xb0, com.google.android.gms.internal.ads.C4062il0 c4062il0, com.google.android.gms.internal.ads.InterfaceC5497vp interfaceC5497vp) {
        this.f39648C = c4062il0;
        this.f39649D = interfaceC5497vp;
        this.f39650E = c5690xb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void F(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void i() {
        com.google.android.gms.internal.ads.AbstractC2669Oa0.a(this.f39649D, this.f39648C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void x(p184s3.W0 w6) {
        p224w3.p.g("Failed to load rewarded ad with error: " + w6.f().toString() + ", adUnitId: " + this.f39650E.f38985e.f54130C);
        this.f39650E.a(w6);
    }
}
