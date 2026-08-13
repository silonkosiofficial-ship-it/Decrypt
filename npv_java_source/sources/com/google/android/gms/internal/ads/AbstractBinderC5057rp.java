package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5057rp extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC5167sp {
    public AbstractBinderC5057rp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static com.google.android.gms.internal.ads.InterfaceC5167sp o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5167sp ? (com.google.android.gms.internal.ads.InterfaceC5167sp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4948qp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            java.lang.String strE = e();
            parcel2.writeNoException();
            parcel2.writeString(strE);
        } else {
            if (i6 != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
