package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Id0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2454Id0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C2454Id0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final com.google.android.gms.internal.ads.C2749Qd0 T2(com.google.android.gms.internal.ads.C2638Nd0 c2638Nd0) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2638Nd0);
        android.os.Parcel parcelY0 = y0(3, parcelQ0);
        com.google.android.gms.internal.ads.C2749Qd0 c2749Qd0 = (com.google.android.gms.internal.ads.C2749Qd0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, com.google.android.gms.internal.ads.C2749Qd0.CREATOR);
        parcelY0.recycle();
        return c2749Qd0;
    }

    public final com.google.android.gms.internal.ads.C2380Gd0 d2(com.google.android.gms.internal.ads.C2306Ed0 c2306Ed0) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2306Ed0);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        com.google.android.gms.internal.ads.C2380Gd0 c2380Gd0 = (com.google.android.gms.internal.ads.C2380Gd0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, com.google.android.gms.internal.ads.C2380Gd0.CREATOR);
        parcelY0.recycle();
        return c2380Gd0;
    }

    public final void f3(com.google.android.gms.internal.ads.C2195Bd0 c2195Bd0) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2195Bd0);
        L0(2, parcelQ0);
    }
}
