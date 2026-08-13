package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class A5 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        long jU = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 2) {
                jU = R3.b.u(parcel, iR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                iT = R3.b.t(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.B5(strF, jU, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.measurement.internal.B5[i6];
    }
}
