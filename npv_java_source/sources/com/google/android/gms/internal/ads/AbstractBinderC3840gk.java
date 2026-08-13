package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3840gk extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3950hk {
    public AbstractBinderC3840gk() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static com.google.android.gms.internal.ads.InterfaceC3950hk o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3950hk ? (com.google.android.gms.internal.ads.InterfaceC3950hk) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3730fk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.internal.ads.C3182ak.CREATOR);
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        L4(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
