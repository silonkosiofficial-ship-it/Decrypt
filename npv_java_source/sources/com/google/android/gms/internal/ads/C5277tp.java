package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5277tp extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC5497vp {
    C5277tp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void K4(p184s3.X1 x6, com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2251Cp);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void S2(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(5, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final p184s3.U0 c() {
        android.os.Parcel parcelY0 = y0(12, q0());
        p184s3.U0 u0O6 = p184s3.T0.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return u0O6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void d3(com.google.android.gms.internal.ads.InterfaceC5827yp interfaceC5827yp) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC5827yp);
        L0(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void m5(p184s3.X1 x6, com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2251Cp);
        L0(14, parcelQ0);
    }
}
