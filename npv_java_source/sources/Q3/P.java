package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class P implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        android.os.IBinder iBinderS = null;
        N3.C1389b c1389b = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 2) {
                iBinderS = R3.b.s(parcel, iR);
            } else if (iL == 3) {
                c1389b = (N3.C1389b) R3.b.e(parcel, iR, N3.C1389b.CREATOR);
            } else if (iL == 4) {
                zM = R3.b.m(parcel, iR);
            } else if (iL != 5) {
                R3.b.x(parcel, iR);
            } else {
                zM2 = R3.b.m(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new Q3.O(iT, iBinderS, c1389b, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new Q3.O[i6];
    }
}
