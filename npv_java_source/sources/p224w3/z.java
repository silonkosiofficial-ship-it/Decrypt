package p224w3;

/* JADX INFO: loaded from: classes.dex */
public final class z implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 3) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 4) {
                iT2 = R3.b.t(parcel, iR);
            } else if (iL == 5) {
                zM = R3.b.m(parcel, iR);
            } else if (iL != 6) {
                R3.b.x(parcel, iR);
            } else {
                zM2 = R3.b.m(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p224w3.a(strF, iT, iT2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p224w3.a[i6];
    }
}
