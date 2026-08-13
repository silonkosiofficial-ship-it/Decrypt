package L3;

/* JADX INFO: loaded from: classes.dex */
public final class w implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                strF = R3.b.f(parcel, iR);
            } else if (iL != 5) {
                R3.b.x(parcel, iR);
            } else {
                googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) R3.b.e(parcel, iR, com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(strF, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration[i6];
    }
}
