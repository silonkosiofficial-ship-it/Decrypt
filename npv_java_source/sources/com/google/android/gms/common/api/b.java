package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        N3.C1389b c1389b = null;
        int iT = 0;
        android.app.PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iT = R3.b.t(parcel, iR);
            } else if (iL == 2) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (android.app.PendingIntent) R3.b.e(parcel, iR, android.app.PendingIntent.CREATOR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                c1389b = (N3.C1389b) R3.b.e(parcel, iR, N3.C1389b.CREATOR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.common.api.Status(iT, strF, pendingIntent, c1389b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.common.api.Status[i6];
    }
}
