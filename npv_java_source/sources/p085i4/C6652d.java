package p085i4;

/* JADX INFO: renamed from: i4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6652d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        com.google.android.gms.measurement.internal.D d6 = null;
        java.lang.String strF2 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 3) {
                d6 = (com.google.android.gms.measurement.internal.D) R3.b.e(parcel, iR, com.google.android.gms.measurement.internal.D.CREATOR);
            } else if (iL == 4) {
                strF2 = R3.b.f(parcel, iR);
            } else if (iL != 5) {
                R3.b.x(parcel, iR);
            } else {
                jU = R3.b.u(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.E(strF, d6, strF2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.measurement.internal.E[i6];
    }
}
