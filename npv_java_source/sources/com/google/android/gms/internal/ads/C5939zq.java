package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5939zq extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2215Bq {
    C5939zq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2215Bq
    public final void F3(X3.a aVar, com.google.android.gms.internal.ads.C2363Fq c2363Fq, com.google.android.gms.internal.ads.InterfaceC5829yq interfaceC5829yq) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2363Fq);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC5829yq);
        L0(1, parcelQ0);
    }
}
