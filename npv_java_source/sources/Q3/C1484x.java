package Q3;

/* JADX INFO: renamed from: Q3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1484x implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.util.ArrayList arrayListJ = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL != 2) {
                R3.b.x(parcel, iR);
            } else {
                arrayListJ = R3.b.j(parcel, iR, Q3.C1474m.CREATOR);
            }
        }
        R3.b.k(parcel, iY);
        return new Q3.C1480t(iT, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new Q3.C1480t[i6];
    }
}
