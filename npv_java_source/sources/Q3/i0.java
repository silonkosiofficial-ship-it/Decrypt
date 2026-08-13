package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.Bundle bundleA = null;
        Q3.C1466e c1466e = null;
        int iT = 0;
        N3.C1391d[] c1391dArr = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                bundleA = R3.b.a(parcel, iR);
            } else if (iL == 2) {
                c1391dArr = (N3.C1391d[]) R3.b.i(parcel, iR, N3.C1391d.CREATOR);
            } else if (iL == 3) {
                iT = R3.b.t(parcel, iR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                c1466e = (Q3.C1466e) R3.b.e(parcel, iR, Q3.C1466e.CREATOR);
            }
        }
        R3.b.k(parcel, iY);
        return new Q3.h0(bundleA, c1391dArr, iT, c1466e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new Q3.h0[i6];
    }
}
