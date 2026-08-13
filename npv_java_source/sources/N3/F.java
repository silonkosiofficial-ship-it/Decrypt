package N3;

/* JADX INFO: loaded from: classes.dex */
public final class F implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        int iT = 0;
        java.lang.String strF = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                zM = R3.b.m(parcel, iR);
            } else if (iL == 2) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 3) {
                iT2 = R3.b.t(parcel, iR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                iT = R3.b.t(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new N3.E(zM, strF, iT2, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new N3.E[i6];
    }
}
