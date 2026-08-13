package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5609wq extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC5829yq {
    C5609wq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5829yq
    public final void M1(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, bundle);
        L0(3, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5829yq
    public final void y(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        L0(2, parcelQ0);
    }
}
