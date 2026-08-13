package p184s3;

/* JADX INFO: renamed from: s3.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7087d1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            if (R3.b.l(iR) != 2) {
                R3.b.x(parcel, iR);
            } else {
                iT = R3.b.t(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.C7084c1(iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.C7084c1[i6];
    }
}
