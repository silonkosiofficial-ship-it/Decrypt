package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        Q3.M m6 = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL != 2) {
                R3.b.x(parcel, iR);
            } else {
                m6 = (Q3.M) R3.b.e(parcel, iR, Q3.M.CREATOR);
            }
        }
        R3.b.k(parcel, iY);
        return new p105k4.j(iT, m6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p105k4.j[i6];
    }
}
