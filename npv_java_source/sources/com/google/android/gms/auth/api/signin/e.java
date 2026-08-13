package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
public final class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.util.ArrayList arrayListJ = null;
        android.accounts.Account account = null;
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.util.ArrayList arrayListJ2 = null;
        java.lang.String strF3 = null;
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 2:
                    arrayListJ = R3.b.j(parcel, iR, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 3:
                    account = (android.accounts.Account) R3.b.e(parcel, iR, android.accounts.Account.CREATOR);
                    break;
                case 4:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 5:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 6:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 7:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 8:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 9:
                    arrayListJ2 = R3.b.j(parcel, iR, L3.a.CREATOR);
                    break;
                case 10:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(iT, arrayListJ, account, zM, zM2, zM3, strF, strF2, arrayListJ2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions[i6];
    }
}
