package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2252Cq extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2326Eq {
    C2252Cq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2326Eq
    public final com.google.android.gms.internal.ads.InterfaceC2215Bq t0(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        com.google.android.gms.internal.ads.InterfaceC2215Bq c5939zq;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c5939zq = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c5939zq = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2215Bq ? (com.google.android.gms.internal.ads.InterfaceC2215Bq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5939zq(strongBinder);
        }
        parcelY0.recycle();
        return c5939zq;
    }
}
