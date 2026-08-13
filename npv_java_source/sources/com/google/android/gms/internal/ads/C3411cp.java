package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3411cp extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C3411cp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void d2(com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3302bp);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        L0(2, parcelQ0);
    }
}
