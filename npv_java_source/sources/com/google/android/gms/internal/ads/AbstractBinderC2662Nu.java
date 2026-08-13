package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2662Nu extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2699Ou {
    public AbstractBinderC2662Nu() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strE;
        switch (i6) {
            case 1:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                i0(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                android.os.Bundle bundleM2 = M2(bundle2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundleM2);
                return true;
            case 3:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                y4(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                java.lang.String string3 = parcel.readString();
                java.lang.String string4 = parcel.readString();
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                t5(string3, string4, aVarY0);
                parcel2.writeNoException();
                return true;
            case 5:
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                java.util.Map mapQ5 = q5(string5, string6, zG);
                parcel2.writeNoException();
                parcel2.writeMap(mapQ5);
                return true;
            case 6:
                java.lang.String string7 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                int iY = y(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iY);
                return true;
            case 7:
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                U(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                java.lang.String string8 = parcel.readString();
                java.lang.String string9 = parcel.readString();
                android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                O5(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                java.lang.String string10 = parcel.readString();
                java.lang.String string11 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                java.util.List listH4 = h4(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listH4);
                return true;
            case 10:
                strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 11:
                strE = h();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 12:
                long jC = c();
                parcel2.writeNoException();
                parcel2.writeLong(jC);
                return true;
            case 13:
                java.lang.String string12 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                W(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                java.lang.String string13 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                p0(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                java.lang.String string14 = parcel.readString();
                java.lang.String string15 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                u5(aVarY1, string14, string15);
                parcel2.writeNoException();
                return true;
            case 16:
                strE = g();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 17:
                strE = i();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 18:
                strE = d();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 19:
                android.os.Bundle bundle6 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                D0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
