package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3278bd extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C3278bd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final com.google.android.gms.internal.ads.C2964Wc T2(com.google.android.gms.internal.ads.C3072Zc c3072Zc) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c3072Zc);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        com.google.android.gms.internal.ads.C2964Wc c2964Wc = (com.google.android.gms.internal.ads.C2964Wc) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, com.google.android.gms.internal.ads.C2964Wc.CREATOR);
        parcelY0.recycle();
        return c2964Wc;
    }

    public final long d2(com.google.android.gms.internal.ads.C3072Zc c3072Zc) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c3072Zc);
        android.os.Parcel parcelY0 = y0(3, parcelQ0);
        long j6 = parcelY0.readLong();
        parcelY0.recycle();
        return j6;
    }

    public final com.google.android.gms.internal.ads.C2964Wc f3(com.google.android.gms.internal.ads.C3072Zc c3072Zc) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c3072Zc);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        com.google.android.gms.internal.ads.C2964Wc c2964Wc = (com.google.android.gms.internal.ads.C2964Wc) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, com.google.android.gms.internal.ads.C2964Wc.CREATOR);
        parcelY0.recycle();
        return c2964Wc;
    }
}
