package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2288Dp extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C2288Dp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void d2(com.google.android.gms.internal.ads.InterfaceC5167sp interfaceC5167sp, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC5167sp);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        L0(2, parcelQ0);
    }
}
