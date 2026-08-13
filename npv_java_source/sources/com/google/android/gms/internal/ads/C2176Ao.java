package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2176Ao extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2250Co {
    C2176Ao(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void A3(com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2730Po);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2435Ho);
        L0(5, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void I2(com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2730Po);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2435Ho);
        L0(4, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void R3(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2435Ho);
        L0(7, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2250Co
    public final void j1(com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC2435Ho interfaceC2435Ho) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2730Po);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2435Ho);
        L0(6, parcelQ0);
    }
}
