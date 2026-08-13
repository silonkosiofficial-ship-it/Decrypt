package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2433Hm extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2507Jm {
    C2433Hm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2507Jm
    public final void x(p184s3.W0 w6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, w6);
        L0(4, parcelQ0);
    }
}
