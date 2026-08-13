package N3;

/* JADX INFO: loaded from: classes.dex */
public final class q implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        long jU = -1;
        int iT = 0;
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 2) {
                iT = R3.b.t(parcel, iR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                jU = R3.b.u(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new N3.C1391d(strF, iT, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new N3.C1391d[i6];
    }
}
