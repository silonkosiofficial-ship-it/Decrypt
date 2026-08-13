package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5937zp extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C5937zp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final android.os.IBinder d2(X3.a aVar, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        parcelY0.recycle();
        return strongBinder;
    }
}
