package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class H implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = -1;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        long jU = 0;
        long jU2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 2:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 3:
                    iT4 = R3.b.t(parcel, iR);
                    break;
                case 4:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 5:
                    jU2 = R3.b.u(parcel, iR);
                    break;
                case 6:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 7:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 8:
                    iT5 = R3.b.t(parcel, iR);
                    break;
                case 9:
                    iT = R3.b.t(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new Q3.C1474m(iT2, iT3, iT4, jU, jU2, strF, strF2, iT5, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new Q3.C1474m[i6];
    }
}
