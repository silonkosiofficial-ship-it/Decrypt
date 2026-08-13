package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        android.os.Bundle bundleA = null;
        java.util.ArrayList arrayListH = null;
        java.lang.String strF = null;
        p184s3.M1 m6 = null;
        android.location.Location location = null;
        java.lang.String strF2 = null;
        android.os.Bundle bundleA2 = null;
        android.os.Bundle bundleA3 = null;
        java.util.ArrayList arrayListH2 = null;
        java.lang.String strF3 = null;
        java.lang.String strF4 = null;
        p184s3.X x6 = null;
        java.lang.String strF5 = null;
        java.util.ArrayList arrayListH3 = null;
        java.lang.String strF6 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 2:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 3:
                    bundleA = R3.b.a(parcel, iR);
                    break;
                case 4:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 5:
                    arrayListH = R3.b.h(parcel, iR);
                    break;
                case 6:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 7:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 8:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 9:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 10:
                    m6 = (p184s3.M1) R3.b.e(parcel, iR, p184s3.M1.CREATOR);
                    break;
                case 11:
                    location = (android.location.Location) R3.b.e(parcel, iR, android.location.Location.CREATOR);
                    break;
                case 12:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 13:
                    bundleA2 = R3.b.a(parcel, iR);
                    break;
                case 14:
                    bundleA3 = R3.b.a(parcel, iR);
                    break;
                case 15:
                    arrayListH2 = R3.b.h(parcel, iR);
                    break;
                case 16:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 17:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 18:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 19:
                    x6 = (p184s3.X) R3.b.e(parcel, iR, p184s3.X.CREATOR);
                    break;
                case 20:
                    iT4 = R3.b.t(parcel, iR);
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                case 22:
                    arrayListH3 = R3.b.h(parcel, iR);
                    break;
                case 23:
                    iT5 = R3.b.t(parcel, iR);
                    break;
                case 24:
                    strF6 = R3.b.f(parcel, iR);
                    break;
                case 25:
                    iT6 = R3.b.t(parcel, iR);
                    break;
                case 26:
                    jU2 = R3.b.u(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.X1(iT, jU, bundleA, iT2, arrayListH, zM, iT3, zM2, strF, m6, location, strF2, bundleA2, bundleA3, arrayListH2, strF3, strF4, zM3, x6, iT4, strF5, arrayListH3, iT5, strF6, iT6, jU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.X1[i6];
    }
}
