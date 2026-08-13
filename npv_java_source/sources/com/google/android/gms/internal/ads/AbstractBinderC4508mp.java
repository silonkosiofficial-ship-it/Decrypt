package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4508mp extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC4618np {
    public AbstractBinderC4508mp() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static com.google.android.gms.internal.ads.InterfaceC4618np o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4618np ? (com.google.android.gms.internal.ads.InterfaceC4618np) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4398lp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 1:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                O3(aVarY0);
                break;
            case 2:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                r5(aVarY1, i11);
                break;
            case 3:
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                I0(aVarY2);
                break;
            case 4:
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                c0(aVarY3);
                break;
            case 5:
                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                u1(aVarY4);
                break;
            case 6:
                X3.a aVarY5 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                k0(aVarY5);
                break;
            case 7:
                X3.a aVarY6 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.C4728op c4728op = (com.google.android.gms.internal.ads.C4728op) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C4728op.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                c5(aVarY6, c4728op);
                break;
            case 8:
                X3.a aVarY7 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                zze(aVarY7);
                break;
            case 9:
                X3.a aVarY8 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                O2(aVarY8, i12);
                break;
            case 10:
                X3.a aVarY9 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                k6(aVarY9);
                break;
            case 11:
                X3.a aVarY10 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                m0(aVarY10);
                break;
            case 12:
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
