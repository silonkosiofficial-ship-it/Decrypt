package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2873Tl extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2945Vl {
    C2873Tl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final com.google.android.gms.internal.ads.InterfaceC2874Tm E(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        android.os.Parcel parcelY0 = y0(3, parcelQ0);
        com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874TmO6 = com.google.android.gms.internal.ads.AbstractBinderC2838Sm.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC2874TmO6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final boolean Z(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        android.os.Parcel parcelY0 = y0(4, parcelQ0);
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final boolean o(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2945Vl
    public final com.google.android.gms.internal.ads.InterfaceC3053Yl y(java.lang.String str) {
        com.google.android.gms.internal.ads.InterfaceC3053Yl c2981Wl;
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c2981Wl = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c2981Wl = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3053Yl ? (com.google.android.gms.internal.ads.InterfaceC3053Yl) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2981Wl(strongBinder);
        }
        parcelY0.recycle();
        return c2981Wl;
    }
}
