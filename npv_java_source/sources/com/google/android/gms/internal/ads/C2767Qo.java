package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2767Qo implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.Bundle bundleA = null;
        p224w3.a aVar = null;
        android.content.pm.ApplicationInfo applicationInfo = null;
        java.lang.String strF = null;
        java.util.ArrayList arrayListH = null;
        android.content.pm.PackageInfo packageInfo = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        com.google.android.gms.internal.ads.C4108j80 c4108j80 = null;
        java.lang.String strF4 = null;
        android.os.Bundle bundleA2 = null;
        android.os.Bundle bundleA3 = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    bundleA = R3.b.a(parcel, iR);
                    break;
                case 2:
                    aVar = (p224w3.a) R3.b.e(parcel, iR, p224w3.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (android.content.pm.ApplicationInfo) R3.b.e(parcel, iR, android.content.pm.ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 5:
                    arrayListH = R3.b.h(parcel, iR);
                    break;
                case 6:
                    packageInfo = (android.content.pm.PackageInfo) R3.b.e(parcel, iR, android.content.pm.PackageInfo.CREATOR);
                    break;
                case 7:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 8:
                default:
                    R3.b.x(parcel, iR);
                    break;
                case 9:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 10:
                    c4108j80 = (com.google.android.gms.internal.ads.C4108j80) R3.b.e(parcel, iR, com.google.android.gms.internal.ads.C4108j80.CREATOR);
                    break;
                case 11:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 12:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 13:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 14:
                    bundleA2 = R3.b.a(parcel, iR);
                    break;
                case 15:
                    bundleA3 = R3.b.a(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C2730Po(bundleA, aVar, applicationInfo, strF, arrayListH, packageInfo, strF2, strF3, c4108j80, strF4, zM, zM2, bundleA2, bundleA3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C2730Po[i6];
    }
}
