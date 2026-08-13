package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3288bi extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3397ci {
    public AbstractBinderC3288bi() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static com.google.android.gms.internal.ads.InterfaceC3397ci o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3397ci ? (com.google.android.gms.internal.ads.InterfaceC3397ci) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3178ai(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.InterfaceC4274ki c4055ii;
        if (i6 != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c4055ii = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c4055ii = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4274ki ? (com.google.android.gms.internal.ads.InterfaceC4274ki) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4055ii(strongBinder);
        }
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        N3(c4055ii);
        parcel2.writeNoException();
        return true;
    }
}
