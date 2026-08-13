package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class e6 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        java.lang.String strF4 = null;
        java.lang.String strF5 = null;
        java.lang.String strF6 = null;
        java.lang.String strF7 = null;
        java.lang.Boolean boolN = null;
        java.util.ArrayList arrayListH = null;
        java.lang.String strF8 = null;
        java.lang.String strF9 = null;
        java.lang.String strF10 = null;
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        long jU5 = 0;
        long jU6 = 0;
        long jU7 = 0;
        boolean zM = true;
        boolean zM2 = true;
        boolean zM3 = false;
        int iT = 0;
        boolean zM4 = false;
        boolean zM5 = false;
        int iT2 = 0;
        long jU8 = -2147483648L;
        java.lang.String strF11 = "";
        java.lang.String strF12 = strF11;
        java.lang.String strF13 = strF12;
        java.lang.String strF14 = strF13;
        int iT3 = 100;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 2:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 3:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 4:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 5:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 6:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 7:
                    jU2 = R3.b.u(parcel, iR);
                    break;
                case 8:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                case 9:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 10:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 11:
                    jU8 = R3.b.u(parcel, iR);
                    break;
                case 12:
                    strF6 = R3.b.f(parcel, iR);
                    break;
                case 13:
                    jU3 = R3.b.u(parcel, iR);
                    break;
                case 14:
                    jU4 = R3.b.u(parcel, iR);
                    break;
                case 15:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 16:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 17:
                case 20:
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                default:
                    R3.b.x(parcel, iR);
                    break;
                case 18:
                    zM4 = R3.b.m(parcel, iR);
                    break;
                case 19:
                    strF7 = R3.b.f(parcel, iR);
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    boolN = R3.b.n(parcel, iR);
                    break;
                case 22:
                    jU5 = R3.b.u(parcel, iR);
                    break;
                case 23:
                    arrayListH = R3.b.h(parcel, iR);
                    break;
                case 24:
                    strF8 = R3.b.f(parcel, iR);
                    break;
                case 25:
                    strF11 = R3.b.f(parcel, iR);
                    break;
                case 26:
                    strF12 = R3.b.f(parcel, iR);
                    break;
                case 27:
                    strF9 = R3.b.f(parcel, iR);
                    break;
                case 28:
                    zM5 = R3.b.m(parcel, iR);
                    break;
                case 29:
                    jU6 = R3.b.u(parcel, iR);
                    break;
                case 30:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 31:
                    strF13 = R3.b.f(parcel, iR);
                    break;
                case 32:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 34:
                    jU7 = R3.b.u(parcel, iR);
                    break;
                case 35:
                    strF10 = R3.b.f(parcel, iR);
                    break;
                case 36:
                    strF14 = R3.b.f(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.M5(strF, strF2, strF3, strF4, jU, jU2, strF5, zM, zM3, jU8, strF6, jU3, jU4, iT, zM2, zM4, strF7, boolN, jU5, arrayListH, strF8, strF11, strF12, strF9, zM5, jU6, iT3, strF13, iT2, jU7, strF10, strF14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.measurement.internal.M5[i6];
    }
}
