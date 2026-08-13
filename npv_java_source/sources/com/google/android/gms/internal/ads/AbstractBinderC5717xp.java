package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5717xp extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC5827yp {
    public AbstractBinderC5717xp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.InterfaceC5167sp c4948qp;
        switch (i6) {
            case 1:
                j();
                break;
            case 2:
                i();
                break;
            case 3:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c4948qp = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c4948qp = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5167sp ? (com.google.android.gms.internal.ads.InterfaceC5167sp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4948qp(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                S1(c4948qp);
                break;
            case 4:
                int i11 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                L(i11);
                break;
            case 5:
                p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                I4(w6);
                break;
            case 6:
                e();
                break;
            case 7:
                d();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
