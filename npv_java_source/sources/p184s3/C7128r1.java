package p184s3;

/* JADX INFO: renamed from: s3.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7128r1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        p184s3.W0 w6 = null;
        android.os.IBinder iBinderS = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 2) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 3) {
                strF2 = R3.b.f(parcel, iR);
            } else if (iL == 4) {
                w6 = (p184s3.W0) R3.b.e(parcel, iR, p184s3.W0.CREATOR);
            } else if (iL != 5) {
                R3.b.x(parcel, iR);
            } else {
                iBinderS = R3.b.s(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p184s3.W0(iT, strF, strF2, w6, iBinderS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p184s3.W0[i6];
    }
}
