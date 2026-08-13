package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2177Ap extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2251Cp {
    C2177Ap(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void F(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void i() {
        L0(1, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void x(p184s3.W0 w6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, w6);
        L0(3, parcelQ0);
    }
}
