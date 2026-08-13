package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3520dp extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3630ep {
    public AbstractBinderC3520dp() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        int iU;
        if (i6 == 1) {
            com.google.android.gms.internal.ads.C4178jp c4178jp = (com.google.android.gms.internal.ads.C4178jp) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C4178jp.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            n4(c4178jp);
        } else if (i6 != 2) {
            com.google.android.gms.internal.ads.InterfaceC4069ip c3850gp = null;
            com.google.android.gms.internal.ads.C3411cp c3411cp = null;
            if (i6 == 3) {
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c3850gp = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4069ip ? (com.google.android.gms.internal.ads.InterfaceC4069ip) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3850gp(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                Z5(c3850gp);
            } else if (i6 != 34) {
                switch (i6) {
                    case 5:
                        iU = u();
                        parcel2.writeNoException();
                        int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                        parcel2.writeInt(iU);
                        return true;
                    case 6:
                        g();
                        break;
                    case 7:
                        j();
                        break;
                    case 8:
                        d();
                        break;
                    case 9:
                        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        I0(aVarY0);
                        break;
                    case 10:
                        X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        b0(aVarY1);
                        break;
                    case 11:
                        X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        k0(aVarY2);
                        break;
                    case 12:
                        java.lang.String strF = f();
                        parcel2.writeNoException();
                        parcel2.writeString(strF);
                        return true;
                    case 13:
                        java.lang.String string = parcel.readString();
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        v0(string);
                        break;
                    case 14:
                        p184s3.InterfaceC7077a0 interfaceC7077a0O6 = p184s3.Z.o6(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        J1(interfaceC7077a0O6);
                        break;
                    case 15:
                        android.os.Bundle bundleB = b();
                        parcel2.writeNoException();
                        com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundleB);
                        return true;
                    case 16:
                        android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            c3411cp = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.C3411cp ? (com.google.android.gms.internal.ads.C3411cp) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.C3411cp(strongBinder2);
                        }
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        o2(c3411cp);
                        break;
                    case 17:
                        parcel.readString();
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        break;
                    case 18:
                        X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        g0(aVarY3);
                        break;
                    case 19:
                        java.lang.String string2 = parcel.readString();
                        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                        u0(string2);
                        break;
                    case 20:
                        iU = w();
                        parcel2.writeNoException();
                        int i12 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                        parcel2.writeInt(iU);
                        return true;
                    case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        p184s3.U0 u0C = c();
                        parcel2.writeNoException();
                        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, u0C);
                        return true;
                    default:
                        return false;
                }
            } else {
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                O(zG);
            }
        } else {
            s();
        }
        parcel2.writeNoException();
        return true;
    }
}
