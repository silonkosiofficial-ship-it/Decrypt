package p085i4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends com.google.android.gms.internal.measurement.AbstractBinderC5969b0 implements p085i4.InterfaceC6654f {
    public h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5969b0
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.util.List listZ5;
        switch (i6) {
            case 1:
                com.google.android.gms.measurement.internal.E e6 = (com.google.android.gms.measurement.internal.E) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                com.google.android.gms.measurement.internal.M5 m6 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                d6(e6, m6);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.measurement.internal.Y5 y6 = (com.google.android.gms.measurement.internal.Y5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.Y5.CREATOR);
                com.google.android.gms.measurement.internal.M5 m10 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                G1(y6, m10);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                com.google.android.gms.measurement.internal.M5 m11 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                X0(m11);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.E e10 = (com.google.android.gms.measurement.internal.E) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                U3(e10, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.measurement.internal.M5 m12 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                W5(m12);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.measurement.internal.M5 m13 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                boolean zH = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                listZ5 = z5(m13, zH);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ5);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.E e11 = (com.google.android.gms.measurement.internal.E) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                byte[] bArrL5 = l5(e11, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrL5);
                return true;
            case 10:
                long j6 = parcel.readLong();
                java.lang.String string4 = parcel.readString();
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                U2(j6, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.measurement.internal.M5 m14 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                java.lang.String strK2 = k2(m14);
                parcel2.writeNoException();
                parcel2.writeString(strK2);
                return true;
            case 12:
                com.google.android.gms.measurement.internal.C6362e c6362e = (com.google.android.gms.measurement.internal.C6362e) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.C6362e.CREATOR);
                com.google.android.gms.measurement.internal.M5 m15 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                w2(c6362e, m15);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.measurement.internal.C6362e c6362e2 = (com.google.android.gms.measurement.internal.C6362e) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.C6362e.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                m3(c6362e2);
                parcel2.writeNoException();
                return true;
            case 14:
                java.lang.String string7 = parcel.readString();
                java.lang.String string8 = parcel.readString();
                boolean zH2 = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                com.google.android.gms.measurement.internal.M5 m16 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                listZ5 = S4(string7, string8, zH2, m16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ5);
                return true;
            case 15:
                java.lang.String string9 = parcel.readString();
                java.lang.String string10 = parcel.readString();
                java.lang.String string11 = parcel.readString();
                boolean zH3 = com.google.android.gms.internal.measurement.AbstractC5960a0.h(parcel);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                listZ5 = w1(string9, string10, string11, zH3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ5);
                return true;
            case 16:
                java.lang.String string12 = parcel.readString();
                java.lang.String string13 = parcel.readString();
                com.google.android.gms.measurement.internal.M5 m17 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                listZ5 = N0(string12, string13, m17);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ5);
                return true;
            case 17:
                java.lang.String string14 = parcel.readString();
                java.lang.String string15 = parcel.readString();
                java.lang.String string16 = parcel.readString();
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                listZ5 = Z2(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ5);
                return true;
            case 18:
                com.google.android.gms.measurement.internal.M5 m18 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                A1(m18);
                parcel2.writeNoException();
                return true;
            case 19:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.measurement.internal.M5 m19 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                C1(bundle, m19);
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.measurement.internal.M5 m20 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                D1(m20);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                com.google.android.gms.measurement.internal.M5 m21 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                p085i4.C6650b c6650bS4 = s4(m21);
                parcel2.writeNoException();
                com.google.android.gms.internal.measurement.AbstractC5960a0.g(parcel2, c6650bS4);
                return true;
            case 24:
                com.google.android.gms.measurement.internal.M5 m22 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                listZ5 = k5(m22, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ5);
                return true;
            case 25:
                com.google.android.gms.measurement.internal.M5 m23 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                f4(m23);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.measurement.internal.M5 m24 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                j5(m24);
                parcel2.writeNoException();
                return true;
            case 27:
                com.google.android.gms.measurement.internal.M5 m25 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                Y2(m25);
                parcel2.writeNoException();
                return true;
            case 28:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.measurement.internal.M5 m26 = (com.google.android.gms.measurement.internal.M5) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, com.google.android.gms.measurement.internal.M5.CREATOR);
                com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
                U0(bundle3, m26);
                parcel2.writeNoException();
                return true;
        }
    }
}
