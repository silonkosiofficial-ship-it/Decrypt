package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
public final class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = "";
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
        java.lang.String strF2 = "";
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 4) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 7) {
                googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) R3.b.e(parcel, iR, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
            } else if (iL != 8) {
                R3.b.x(parcel, iR);
            } else {
                strF2 = R3.b.f(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.auth.api.signin.SignInAccount(strF, googleSignInAccount, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.auth.api.signin.SignInAccount[i6];
    }
}
