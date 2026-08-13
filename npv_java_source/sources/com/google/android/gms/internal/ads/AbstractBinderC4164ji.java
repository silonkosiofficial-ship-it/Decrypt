package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4164ji extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC4274ki {
    public AbstractBinderC4164ji() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strS;
        java.util.List listA;
        android.os.IInterface iInterfaceK;
        com.google.android.gms.internal.ads.InterfaceC3946hi c3836gi;
        int i11;
        boolean zH;
        switch (i6) {
            case 2:
                strS = s();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 3:
                listA = A();
                parcel2.writeNoException();
                parcel2.writeList(listA);
                return true;
            case 4:
                strS = p();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 5:
                iInterfaceK = k();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceK);
                return true;
            case 6:
                strS = q();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 7:
                strS = n();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 8:
                double d6 = d();
                parcel2.writeNoException();
                parcel2.writeDouble(d6);
                return true;
            case 9:
                strS = w();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 10:
                strS = u();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 11:
                iInterfaceK = g();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceK);
                return true;
            case 12:
                strS = t();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 13:
                C();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterfaceK = h();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceK);
                return true;
            case 15:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                X5(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                boolean zA4 = a4(bundle2);
                parcel2.writeNoException();
                i11 = zA4;
                parcel2.writeInt(i11);
                return true;
            case 17:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                Z1(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                iInterfaceK = m();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceK);
                return true;
            case 19:
                iInterfaceK = l();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceK);
                return true;
            case 20:
                android.os.Bundle bundleE = e();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundleE);
                return true;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c3836gi = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c3836gi = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3946hi ? (com.google.android.gms.internal.ads.InterfaceC3946hi) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3836gi(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                R2(c3836gi);
                parcel2.writeNoException();
                return true;
            case 22:
                z();
                parcel2.writeNoException();
                return true;
            case 23:
                listA = v();
                parcel2.writeNoException();
                parcel2.writeList(listA);
                return true;
            case 24:
                zH = H();
                parcel2.writeNoException();
                int i12 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zH;
                parcel2.writeInt(i11);
                return true;
            case 25:
                p184s3.D0 d0O6 = p184s3.C0.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                j3(d0O6);
                parcel2.writeNoException();
                return true;
            case 26:
                p184s3.A0 a0O6 = p184s3.AbstractBinderC7151z0.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                S5(a0O6);
                parcel2.writeNoException();
                return true;
            case 27:
                Q();
                parcel2.writeNoException();
                return true;
            case 28:
                h0();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterfaceK = j();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceK);
                return true;
            case 30:
                zH = T();
                parcel2.writeNoException();
                int i13 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zH;
                parcel2.writeInt(i11);
                return true;
            case 31:
                iInterfaceK = i();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceK);
                return true;
            case 32:
                p184s3.N0 n0O6 = p184s3.M0.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                p1(n0O6);
                parcel2.writeNoException();
                return true;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                P2(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
