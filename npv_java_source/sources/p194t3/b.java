package p194t3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 2) {
                strF2 = R3.b.f(parcel, iR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                strF3 = R3.b.f(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p194t3.a(strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p194t3.a[i6];
    }
}
