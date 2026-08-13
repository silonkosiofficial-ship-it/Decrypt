package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class R1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                zM = R3.b.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = R3.b.m(parcel, iR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                zM3 = R3.b.m(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.Q1(zM, zM2, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.Q1[i6];
    }
}
