package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        java.lang.String strF = null;
        p184s3.c2[] c2VarArr = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 2:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 3:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 4:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 5:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 6:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 7:
                    iT4 = R3.b.t(parcel, iR);
                    break;
                case 8:
                    c2VarArr = (p184s3.c2[]) R3.b.i(parcel, iR, p184s3.c2.CREATOR);
                    break;
                case 9:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 10:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 11:
                    zM4 = R3.b.m(parcel, iR);
                    break;
                case 12:
                    zM5 = R3.b.m(parcel, iR);
                    break;
                case 13:
                    zM6 = R3.b.m(parcel, iR);
                    break;
                case 14:
                    zM7 = R3.b.m(parcel, iR);
                    break;
                case 15:
                    zM8 = R3.b.m(parcel, iR);
                    break;
                case 16:
                    zM9 = R3.b.m(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.c2(strF, iT, iT2, zM, iT3, iT4, c2VarArr, zM2, zM3, zM4, zM5, zM6, zM7, zM8, zM9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.c2[i6];
    }
}
