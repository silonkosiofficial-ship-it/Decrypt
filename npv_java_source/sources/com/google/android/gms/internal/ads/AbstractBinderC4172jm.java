package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4172jm extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC4282km {
    public AbstractBinderC4172jm() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static com.google.android.gms.internal.ads.InterfaceC4282km o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4282km ? (com.google.android.gms.internal.ads.InterfaceC4282km) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4063im(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strU;
        android.os.IInterface iInterfaceL;
        int iY;
        float fE;
        switch (i6) {
            case 2:
                strU = u();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 3:
                java.util.List listV = v();
                parcel2.writeNoException();
                parcel2.writeList(listV);
                return true;
            case 4:
                strU = s();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 5:
                iInterfaceL = l();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceL);
                return true;
            case 6:
                strU = t();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 7:
                strU = q();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 8:
                double d6 = d();
                parcel2.writeNoException();
                parcel2.writeDouble(d6);
                return true;
            case 9:
                strU = A();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 10:
                strU = w();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 11:
                iInterfaceL = j();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceL);
                return true;
            case 12:
                parcel2.writeNoException();
                iInterfaceL = null;
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceL);
                return true;
            case 13:
                iInterfaceL = m();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceL);
                return true;
            case 14:
                iInterfaceL = n();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceL);
                return true;
            case 15:
                iInterfaceL = p();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceL);
                return true;
            case 16:
                android.os.Bundle bundleH = h();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundleH);
                return true;
            case 17:
                iY = Y();
                parcel2.writeNoException();
                int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(iY);
                return true;
            case 18:
                iY = h0();
                parcel2.writeNoException();
                int i12 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(iY);
                return true;
            case 19:
                C();
                parcel2.writeNoException();
                return true;
            case 20:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                P1(aVarY0);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                p3(aVarY1, aVarY2, aVarY3);
                parcel2.writeNoException();
                return true;
            case 22:
                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                D5(aVarY4);
                parcel2.writeNoException();
                return true;
            case 23:
                fE = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case 24:
                fE = g();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case 25:
                fE = i();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            default:
                return false;
        }
    }
}
