package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6355d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        com.google.android.gms.measurement.internal.Y5 y6 = null;
        java.lang.String strF3 = null;
        com.google.android.gms.measurement.internal.E e6 = null;
        com.google.android.gms.measurement.internal.E e10 = null;
        com.google.android.gms.measurement.internal.E e11 = null;
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 2:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 3:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 4:
                    y6 = (com.google.android.gms.measurement.internal.Y5) R3.b.e(parcel, iR, com.google.android.gms.measurement.internal.Y5.CREATOR);
                    break;
                case 5:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 6:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 7:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 8:
                    e6 = (com.google.android.gms.measurement.internal.E) R3.b.e(parcel, iR, com.google.android.gms.measurement.internal.E.CREATOR);
                    break;
                case 9:
                    jU2 = R3.b.u(parcel, iR);
                    break;
                case 10:
                    e10 = (com.google.android.gms.measurement.internal.E) R3.b.e(parcel, iR, com.google.android.gms.measurement.internal.E.CREATOR);
                    break;
                case 11:
                    jU3 = R3.b.u(parcel, iR);
                    break;
                case 12:
                    e11 = (com.google.android.gms.measurement.internal.E) R3.b.e(parcel, iR, com.google.android.gms.measurement.internal.E.CREATOR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.C6362e(strF, strF2, y6, jU, zM, strF3, e6, jU2, e10, jU3, e11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.measurement.internal.C6362e[i6];
    }
}
