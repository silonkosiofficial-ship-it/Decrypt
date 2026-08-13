package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5387up extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC5497vp {
    public AbstractBinderC5387up() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static com.google.android.gms.internal.ads.InterfaceC5497vp o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5497vp ? (com.google.android.gms.internal.ads.InterfaceC5497vp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5277tp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceF;
        com.google.android.gms.internal.ads.InterfaceC2251Cp c2177Ap = null;
        com.google.android.gms.internal.ads.InterfaceC2251Cp c2177Ap2 = null;
        com.google.android.gms.internal.ads.C2288Dp c2288Dp = null;
        com.google.android.gms.internal.ads.InterfaceC5827yp c5607wp = null;
        switch (i6) {
            case 1:
                p184s3.X1 x6 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c2177Ap = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2251Cp ? (com.google.android.gms.internal.ads.InterfaceC2251Cp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2177Ap(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                K4(x6, c2177Ap);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    c5607wp = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.InterfaceC5827yp ? (com.google.android.gms.internal.ads.InterfaceC5827yp) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.C5607wp(strongBinder2);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                d3(c5607wp);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zP = p();
                parcel2.writeNoException();
                int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 4:
                java.lang.String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 5:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                S2(aVarY0);
                parcel2.writeNoException();
                return true;
            case 6:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c2288Dp = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.C2288Dp ? (com.google.android.gms.internal.ads.C2288Dp) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.ads.C2288Dp(strongBinder3);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                A2(c2288Dp);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.internal.ads.C2547Kp c2547Kp = (com.google.android.gms.internal.ads.C2547Kp) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C2547Kp.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                b3(c2547Kp);
                parcel2.writeNoException();
                return true;
            case 8:
                p184s3.K0 k0O6 = p184s3.J0.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                L2(k0O6);
                parcel2.writeNoException();
                return true;
            case 9:
                android.os.Bundle bundleB = b();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundleB);
                return true;
            case 10:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                p2(aVarY1, zG);
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceF = f();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceF);
                return true;
            case 12:
                iInterfaceF = c();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceF);
                return true;
            case 13:
                p184s3.N0 n0O6 = p184s3.M0.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                N5(n0O6);
                parcel2.writeNoException();
                return true;
            case 14:
                p184s3.X1 x10 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c2177Ap2 = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.InterfaceC2251Cp ? (com.google.android.gms.internal.ads.InterfaceC2251Cp) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.ads.C2177Ap(strongBinder4);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                m5(x10, c2177Ap2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zG2 = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                T3(zG2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
