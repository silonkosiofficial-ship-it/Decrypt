package L3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.Bundle bundleA = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = R3.b.t(parcel, iR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                bundleA = R3.b.a(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new L3.a(iT, iT2, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new L3.a[i6];
    }
}
