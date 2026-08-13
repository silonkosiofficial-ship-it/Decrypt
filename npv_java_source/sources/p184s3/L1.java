package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class L1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL != 2) {
                R3.b.x(parcel, iR);
            } else {
                iT2 = R3.b.t(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.K1(iT, iT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.K1[i6];
    }
}
