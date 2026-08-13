package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2866Th extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2938Vh {
    C2866Th(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2938Vh
    public final void J3(com.google.android.gms.internal.ads.InterfaceC2424Hh interfaceC2424Hh) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2424Hh);
        L0(1, parcelQ0);
    }
}
