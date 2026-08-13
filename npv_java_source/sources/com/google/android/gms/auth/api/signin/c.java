package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        java.lang.String strF4 = null;
        android.net.Uri uri = null;
        java.lang.String strF5 = null;
        java.lang.String strF6 = null;
        java.util.ArrayList arrayListJ = null;
        java.lang.String strF7 = null;
        java.lang.String strF8 = null;
        long jU = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
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
                    uri = (android.net.Uri) R3.b.e(parcel, iR, android.net.Uri.CREATOR);
                    break;
                case 7:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                case 8:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 9:
                    strF6 = R3.b.f(parcel, iR);
                    break;
                case 10:
                    arrayListJ = R3.b.j(parcel, iR, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 11:
                    strF7 = R3.b.f(parcel, iR);
                    break;
                case 12:
                    strF8 = R3.b.f(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(iT, strF, strF2, strF3, strF4, uri, strF5, jU, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i6];
    }
}
