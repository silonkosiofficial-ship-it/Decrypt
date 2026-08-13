package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3178ai extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3397ci {
    C3178ai(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3397ci
    public final void N3(com.google.android.gms.internal.ads.InterfaceC4274ki interfaceC4274ki) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC4274ki);
        L0(1, parcelQ0);
    }
}
