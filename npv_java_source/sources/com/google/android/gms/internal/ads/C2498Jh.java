package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2498Jh extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2572Lh {
    C2498Jh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2572Lh
    public final void v1(com.google.android.gms.internal.ads.InterfaceC2239Ch interfaceC2239Ch) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2239Ch);
        L0(1, parcelQ0);
    }
}
