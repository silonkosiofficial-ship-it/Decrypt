package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        Q3.r rVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    rVar = (Q3.r) R3.b.e(parcel, iR, Q3.r.CREATOR);
                    break;
                case 2:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 4:
                    iArrC = R3.b.c(parcel, iR);
                    break;
                case 5:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 6:
                    iArrC2 = R3.b.c(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new Q3.C1466e(rVar, zM, zM2, iArrC, iT, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new Q3.C1466e[i6];
    }
}
