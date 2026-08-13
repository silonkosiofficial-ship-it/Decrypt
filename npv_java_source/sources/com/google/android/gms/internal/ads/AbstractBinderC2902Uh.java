package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2902Uh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2938Vh {
    public AbstractBinderC2902Uh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2938Vh o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2938Vh ? (com.google.android.gms.internal.ads.InterfaceC2938Vh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2866Th(iBinder);
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
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        J3(c2350Fh);
        parcel2.writeNoException();
        return true;
    }
}
