package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2608Mh extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2682Oh {
    C2608Mh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2682Oh
    public final void Q5(com.google.android.gms.internal.ads.InterfaceC2313Eh interfaceC2313Eh) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2313Eh);
        L0(1, parcelQ0);
    }
}
