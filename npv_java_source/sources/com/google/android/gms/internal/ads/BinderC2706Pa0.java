package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class BinderC2706Pa0 extends com.google.android.gms.internal.ads.AbstractBinderC2488Jc {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4062il0 f30749C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p184s3.I1 f30750D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2743Qa0 f30751E;

    BinderC2706Pa0(com.google.android.gms.internal.ads.C2743Qa0 c2743Qa0, com.google.android.gms.internal.ads.C4062il0 c4062il0, p184s3.I1 i6) {
        this.f30749C = c4062il0;
        this.f30750D = i6;
        this.f30751E = c2743Qa0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void B(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void B3(p184s3.W0 w6) {
        p224w3.p.g("Failed to load app open ad with error parcel: " + w6.f().toString() + " for ad unit: " + this.f30750D.f54130C);
        this.f30751E.a(w6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void Q0(com.google.android.gms.internal.ads.InterfaceC2414Hc interfaceC2414Hc) {
        com.google.android.gms.internal.ads.AbstractC2669Oa0.a(interfaceC2414Hc, this.f30749C);
    }
}
