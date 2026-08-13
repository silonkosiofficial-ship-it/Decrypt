package p174r3;

/* JADX INFO: loaded from: classes.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        int iT = 0;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        float fP = 0.0f;
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 2:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 4:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 5:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 6:
                    fP = R3.b.p(parcel, iR);
                    break;
                case 7:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 8:
                    zM4 = R3.b.m(parcel, iR);
                    break;
                case 9:
                    zM5 = R3.b.m(parcel, iR);
                    break;
                case 10:
                    zM6 = R3.b.m(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new p174r3.l(zM, zM2, strF, zM3, fP, iT, zM4, zM5, zM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p174r3.l[i6];
    }
}
