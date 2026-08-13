package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2909Ul extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2945Vl {
    public AbstractBinderC2909Ul() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2945Vl o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2945Vl ? (com.google.android.gms.internal.ads.InterfaceC2945Vl) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2873Tl(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceY;
        int iO;
        if (i6 != 1) {
            if (i6 == 2) {
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iO = o(string);
            } else if (i6 == 3) {
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceY = E(string2);
            } else {
                if (i6 != 4) {
                    return false;
                }
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iO = Z(string3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(iO);
            return true;
        }
        java.lang.String string4 = parcel.readString();
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        iInterfaceY = y(string4);
        parcel2.writeNoException();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceY);
        return true;
    }
}
