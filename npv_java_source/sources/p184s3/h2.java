package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        p184s3.W0 w6 = null;
        android.os.Bundle bundleA = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        java.lang.String strF4 = null;
        java.lang.String strF5 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 2:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 3:
                    w6 = (p184s3.W0) R3.b.e(parcel, iR, p184s3.W0.CREATOR);
                    break;
                case 4:
                    bundleA = R3.b.a(parcel, iR);
                    break;
                case 5:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 6:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 7:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 8:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.g2(strF, jU, w6, bundleA, strF2, strF3, strF4, strF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.g2[i6];
    }
}
