package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5970b1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        long jU = 0;
        long jU2 = 0;
        boolean zM = false;
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        android.os.Bundle bundleA = null;
        java.lang.String strF4 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 2:
                    jU2 = R3.b.u(parcel, iR);
                    break;
                case 3:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 4:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 5:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 6:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 7:
                    bundleA = R3.b.a(parcel, iR);
                    break;
                case 8:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.measurement.C5979c1(jU, jU2, zM, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.measurement.C5979c1[i6];
    }
}
