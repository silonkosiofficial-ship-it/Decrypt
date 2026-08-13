package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        N3.C1389b c1389b = null;
        int iT = 0;
        Q3.O o6 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 2) {
                c1389b = (N3.C1389b) R3.b.e(parcel, iR, N3.C1389b.CREATOR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                o6 = (Q3.O) R3.b.e(parcel, iR, Q3.O.CREATOR);
            }
        }
        R3.b.k(parcel, iY);
        return new p105k4.l(iT, c1389b, o6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p105k4.l[i6];
    }
}
