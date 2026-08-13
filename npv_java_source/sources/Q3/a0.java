package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iT2 = 0;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 2) {
                zM = R3.b.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = R3.b.m(parcel, iR);
            } else if (iL == 4) {
                iT2 = R3.b.t(parcel, iR);
            } else if (iL != 5) {
                R3.b.x(parcel, iR);
            } else {
                iT3 = R3.b.t(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new Q3.r(iT, zM, zM2, iT2, iT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new Q3.r[i6];
    }
}
