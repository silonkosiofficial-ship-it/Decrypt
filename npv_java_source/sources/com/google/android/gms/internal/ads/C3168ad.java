package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3168ad implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        int iT = 0;
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        java.lang.String strF4 = null;
        android.os.Bundle bundleA = null;
        java.lang.String strF5 = null;
        long jU = 0;
        long jU2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 2:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 3:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 4:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 5:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 6:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 7:
                    bundleA = R3.b.a(parcel, iR);
                    break;
                case 8:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 9:
                    jU2 = R3.b.u(parcel, iR);
                    break;
                case 10:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                case 11:
                    iT = R3.b.t(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C3072Zc(strF, jU, strF2, strF3, strF4, bundleA, zM, jU2, strF5, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C3072Zc[i6];
    }
}
