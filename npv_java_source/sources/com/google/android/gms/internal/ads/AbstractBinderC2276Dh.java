package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2276Dh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2313Eh {
    public AbstractBinderC2276Dh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceI;
        java.lang.String strK;
        switch (i6) {
            case 2:
                iInterfaceI = i();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceI);
                return true;
            case 3:
                strK = k();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 4:
                java.util.List listM = m();
                parcel2.writeNoException();
                parcel2.writeList(listM);
                return true;
            case 5:
                strK = h();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 6:
                iInterfaceI = d();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceI);
                return true;
            case 7:
                strK = j();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 8:
                strK = g();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 9:
                android.os.Bundle bundleB = b();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundleB);
                return true;
            case 10:
                n();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceI = c();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceI);
                return true;
            case 12:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                U1(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                boolean zU = U(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 14:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                i0(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceI = f();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceI);
                return true;
            case 16:
                iInterfaceI = e();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceI);
                return true;
            case 17:
                strK = l();
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            default:
                return false;
        }
    }
}
