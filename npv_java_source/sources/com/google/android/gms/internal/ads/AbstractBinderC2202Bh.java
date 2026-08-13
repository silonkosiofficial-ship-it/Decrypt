package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2202Bh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2239Ch {
    public AbstractBinderC2202Bh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceG;
        java.lang.String strK;
        switch (i6) {
            case 2:
                iInterfaceG = g();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceG);
                return true;
            case 3:
                strK = k();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 4:
                java.util.List listP = p();
                parcel2.writeNoException();
                parcel2.writeList(listP);
                return true;
            case 5:
                strK = h();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 6:
                iInterfaceG = e();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceG);
                return true;
            case 7:
                strK = j();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 8:
                double dB = b();
                parcel2.writeNoException();
                parcel2.writeDouble(dB);
                return true;
            case 9:
                strK = n();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 10:
                strK = m();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 11:
                android.os.Bundle bundleC = c();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundleC);
                return true;
            case 12:
                q();
                parcel2.writeNoException();
                return true;
            case 13:
                iInterfaceG = f();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceG);
                return true;
            case 14:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                U(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                boolean zZ0 = z0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZ0 ? 1 : 0);
                return true;
            case 16:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                D0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                iInterfaceG = d();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceG);
                return true;
            case 18:
                iInterfaceG = i();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceG);
                return true;
            case 19:
                strK = l();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            default:
                return false;
        }
    }
}
