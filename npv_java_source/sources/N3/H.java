package N3;

/* JADX INFO: loaded from: classes.dex */
public final class H implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        java.lang.String strF = null;
        android.os.IBinder iBinderS = null;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 2) {
                iBinderS = R3.b.s(parcel, iR);
            } else if (iL == 3) {
                zM = R3.b.m(parcel, iR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                zM2 = R3.b.m(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new N3.G(strF, iBinderS, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new N3.G[i6];
    }
}
