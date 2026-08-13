package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class N1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            if (R3.b.l(iR) != 15) {
                R3.b.x(parcel, iR);
            } else {
                strF = R3.b.f(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.M1(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.M1[i6];
    }
}
