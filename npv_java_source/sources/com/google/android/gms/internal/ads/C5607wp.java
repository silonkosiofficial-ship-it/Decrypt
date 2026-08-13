package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5607wp extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC5827yp {
    C5607wp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void I4(p184s3.W0 w6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, w6);
        L0(5, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void L(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(4, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void S1(com.google.android.gms.internal.ads.InterfaceC5167sp interfaceC5167sp) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC5167sp);
        L0(3, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void d() {
        L0(7, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void e() {
        L0(6, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void i() {
        L0(2, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5827yp
    public final void j() {
        L0(1, q0());
    }
}
