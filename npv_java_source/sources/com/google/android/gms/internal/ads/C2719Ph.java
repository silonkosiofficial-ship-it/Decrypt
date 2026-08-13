package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2719Ph extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2830Sh {
    C2719Ph(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2830Sh
    public final void y3(com.google.android.gms.internal.ads.InterfaceC2424Hh interfaceC2424Hh, java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2424Hh);
        parcelQ0.writeString(str);
        L0(1, parcelQ0);
    }
}
