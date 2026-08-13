package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2472Io extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C2472Io(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void C3(p214v3.D d6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, d6);
        L0(2, parcelQ0);
    }

    public final void d2(java.lang.String str, com.google.android.gms.internal.ads.C5825yo c5825yo) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c5825yo);
        L0(1, parcelQ0);
    }
}
