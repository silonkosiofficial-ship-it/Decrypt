package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3834gh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3944hh {
    public AbstractBinderC3834gh() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static com.google.android.gms.internal.ads.InterfaceC3944hh o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3944hh ? (com.google.android.gms.internal.ads.InterfaceC3944hh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3724fh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 2) {
            java.lang.String strI = i();
            parcel2.writeNoException();
            parcel2.writeString(strI);
            return true;
        }
        if (i6 != 3) {
            return false;
        }
        java.util.List listG = g();
        parcel2.writeNoException();
        parcel2.writeList(listG);
        return true;
    }
}
