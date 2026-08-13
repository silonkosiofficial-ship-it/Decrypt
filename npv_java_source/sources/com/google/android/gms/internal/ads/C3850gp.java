package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3850gp extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC4069ip {
    C3850gp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void D(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(7, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void e() {
        L0(4, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void g() {
        L0(6, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void h() {
        L0(1, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void j() {
        L0(2, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void k() {
        L0(8, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void l() {
        L0(3, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4069ip
    public final void q2(com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3302bp);
        L0(5, parcelQ0);
    }
}
