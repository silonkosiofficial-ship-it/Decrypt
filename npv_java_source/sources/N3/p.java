package N3;

/* JADX INFO: loaded from: classes.dex */
public final class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.app.PendingIntent pendingIntent = null;
        int iT = 0;
        int iT2 = 0;
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = R3.b.t(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (android.app.PendingIntent) R3.b.e(parcel, iR, android.app.PendingIntent.CREATOR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                strF = R3.b.f(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new N3.C1389b(iT, iT2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new N3.C1389b[i6];
    }
}
