package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2360Fn extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2471In {
    C2360Fn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471In
    public final com.google.android.gms.internal.ads.InterfaceC2323En t0(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        com.google.android.gms.internal.ads.InterfaceC2323En c2249Cn;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c2249Cn = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c2249Cn = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2323En ? (com.google.android.gms.internal.ads.InterfaceC2323En) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2249Cn(strongBinder);
        }
        parcelY0.recycle();
        return c2249Cn;
    }
}
