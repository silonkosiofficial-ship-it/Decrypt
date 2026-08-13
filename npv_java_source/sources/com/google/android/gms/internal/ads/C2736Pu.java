package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2736Pu extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2810Ru {
    C2736Pu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2810Ru
    public final void w5(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2699Ou interfaceC2699Ou) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2699Ou);
        L0(2, parcelQ0);
    }
}
