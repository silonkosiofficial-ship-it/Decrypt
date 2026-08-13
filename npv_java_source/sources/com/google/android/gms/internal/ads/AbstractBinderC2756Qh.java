package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2756Qh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2830Sh {
    public AbstractBinderC2756Qh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2830Sh o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2830Sh ? (com.google.android.gms.internal.ads.InterfaceC2830Sh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2719Ph(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.InterfaceC2424Hh c2350Fh;
        if (i6 != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c2350Fh = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c2350Fh = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2424Hh ? (com.google.android.gms.internal.ads.InterfaceC2424Hh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2350Fh(strongBinder);
        }
        java.lang.String string = parcel.readString();
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        y3(c2350Fh, string);
        parcel2.writeNoException();
        return true;
    }
}
