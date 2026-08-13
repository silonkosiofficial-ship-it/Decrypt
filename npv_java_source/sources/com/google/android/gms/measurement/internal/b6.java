package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        java.lang.String strF = null;
        java.lang.Long lV = null;
        java.lang.Float fQ = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        java.lang.Double dO = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 2:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 3:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 4:
                    lV = R3.b.v(parcel, iR);
                    break;
                case 5:
                    fQ = R3.b.q(parcel, iR);
                    break;
                case 6:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 7:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 8:
                    dO = R3.b.o(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.Y5(iT, strF, jU, lV, fQ, strF2, strF3, dO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.measurement.internal.Y5[i6];
    }
}
