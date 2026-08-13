package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class J1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        java.lang.String strF = null;
        p184s3.X1 x6 = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 2) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 3) {
                x6 = (p184s3.X1) R3.b.e(parcel, iR, p184s3.X1.CREATOR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                iT2 = R3.b.t(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.I1(strF, iT, x6, iT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.I1[i6];
    }
}
