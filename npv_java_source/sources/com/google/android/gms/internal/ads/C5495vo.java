package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5495vo implements android.os.Parcelable.Creator {
    public static final com.google.android.gms.internal.ads.C5385uo a(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.Bundle bundleA = null;
        p184s3.X1 x6 = null;
        p184s3.c2 c2Var = null;
        java.lang.String strF = null;
        android.content.pm.ApplicationInfo applicationInfo = null;
        android.content.pm.PackageInfo packageInfo = null;
        java.lang.String strF2 = null;
        java.lang.String strF3 = null;
        java.lang.String strF4 = null;
        p224w3.a aVar = null;
        android.os.Bundle bundleA2 = null;
        java.util.ArrayList arrayListH = null;
        android.os.Bundle bundleA3 = null;
        java.lang.String strF5 = null;
        java.lang.String strF6 = null;
        java.util.ArrayList arrayListH2 = null;
        java.lang.String strF7 = null;
        com.google.android.gms.internal.ads.C3505dh c3505dh = null;
        java.util.ArrayList arrayListH3 = null;
        java.lang.String strF8 = null;
        java.lang.String strF9 = null;
        java.lang.String strF10 = null;
        android.os.Bundle bundleA4 = null;
        java.lang.String strF11 = null;
        p184s3.C7084c1 c7084c1 = null;
        android.os.Bundle bundleA5 = null;
        java.lang.String strF12 = null;
        java.lang.String strF13 = null;
        java.lang.String strF14 = null;
        java.util.ArrayList arrayListD = null;
        java.lang.String strF15 = null;
        java.util.ArrayList arrayListH4 = null;
        java.util.ArrayList arrayListH5 = null;
        java.lang.String strF16 = null;
        com.google.android.gms.internal.ads.C4498mk c4498mk = null;
        java.lang.String strF17 = null;
        android.os.Bundle bundleA6 = null;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        boolean zM2 = false;
        int iT5 = 0;
        int iT6 = 0;
        boolean zM3 = false;
        boolean zM4 = false;
        int iT7 = 0;
        boolean zM5 = false;
        boolean zM6 = false;
        int iT8 = 0;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        float fP = 0.0f;
        float fP2 = 0.0f;
        long jU = 0;
        long jU2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 2:
                    bundleA = R3.b.a(parcel, iR);
                    break;
                case 3:
                    x6 = (p184s3.X1) R3.b.e(parcel, iR, p184s3.X1.CREATOR);
                    break;
                case 4:
                    c2Var = (p184s3.c2) R3.b.e(parcel, iR, p184s3.c2.CREATOR);
                    break;
                case 5:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 6:
                    applicationInfo = (android.content.pm.ApplicationInfo) R3.b.e(parcel, iR, android.content.pm.ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (android.content.pm.PackageInfo) R3.b.e(parcel, iR, android.content.pm.PackageInfo.CREATOR);
                    break;
                case 8:
                    strF2 = R3.b.f(parcel, iR);
                    break;
                case 9:
                    strF3 = R3.b.f(parcel, iR);
                    break;
                case 10:
                    strF4 = R3.b.f(parcel, iR);
                    break;
                case 11:
                    aVar = (p224w3.a) R3.b.e(parcel, iR, p224w3.a.CREATOR);
                    break;
                case 12:
                    bundleA2 = R3.b.a(parcel, iR);
                    break;
                case 13:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 14:
                    arrayListH = R3.b.h(parcel, iR);
                    break;
                case 15:
                    bundleA3 = R3.b.a(parcel, iR);
                    break;
                case 16:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    R3.b.x(parcel, iR);
                    break;
                case 18:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 19:
                    iT4 = R3.b.t(parcel, iR);
                    break;
                case 20:
                    fP = R3.b.p(parcel, iR);
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    strF5 = R3.b.f(parcel, iR);
                    break;
                case 25:
                    jU = R3.b.u(parcel, iR);
                    break;
                case 26:
                    strF6 = R3.b.f(parcel, iR);
                    break;
                case 27:
                    arrayListH2 = R3.b.h(parcel, iR);
                    break;
                case 28:
                    strF7 = R3.b.f(parcel, iR);
                    break;
                case 29:
                    c3505dh = (com.google.android.gms.internal.ads.C3505dh) R3.b.e(parcel, iR, com.google.android.gms.internal.ads.C3505dh.CREATOR);
                    break;
                case 30:
                    arrayListH3 = R3.b.h(parcel, iR);
                    break;
                case 31:
                    jU2 = R3.b.u(parcel, iR);
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    strF8 = R3.b.f(parcel, iR);
                    break;
                case 34:
                    fP2 = R3.b.p(parcel, iR);
                    break;
                case 35:
                    iT5 = R3.b.t(parcel, iR);
                    break;
                case 36:
                    iT6 = R3.b.t(parcel, iR);
                    break;
                case 37:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 39:
                    strF9 = R3.b.f(parcel, iR);
                    break;
                case 40:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 41:
                    strF10 = R3.b.f(parcel, iR);
                    break;
                case 42:
                    zM4 = R3.b.m(parcel, iR);
                    break;
                case 43:
                    iT7 = R3.b.t(parcel, iR);
                    break;
                case 44:
                    bundleA4 = R3.b.a(parcel, iR);
                    break;
                case 45:
                    strF11 = R3.b.f(parcel, iR);
                    break;
                case 46:
                    c7084c1 = (p184s3.C7084c1) R3.b.e(parcel, iR, p184s3.C7084c1.CREATOR);
                    break;
                case 47:
                    zM5 = R3.b.m(parcel, iR);
                    break;
                case 48:
                    bundleA5 = R3.b.a(parcel, iR);
                    break;
                case 49:
                    strF12 = R3.b.f(parcel, iR);
                    break;
                case 50:
                    strF13 = R3.b.f(parcel, iR);
                    break;
                case 51:
                    strF14 = R3.b.f(parcel, iR);
                    break;
                case 52:
                    zM6 = R3.b.m(parcel, iR);
                    break;
                case 53:
                    arrayListD = R3.b.d(parcel, iR);
                    break;
                case 54:
                    strF15 = R3.b.f(parcel, iR);
                    break;
                case 55:
                    arrayListH4 = R3.b.h(parcel, iR);
                    break;
                case 56:
                    iT8 = R3.b.t(parcel, iR);
                    break;
                case 57:
                    zM7 = R3.b.m(parcel, iR);
                    break;
                case 58:
                    zM8 = R3.b.m(parcel, iR);
                    break;
                case 59:
                    zM9 = R3.b.m(parcel, iR);
                    break;
                case 60:
                    arrayListH5 = R3.b.h(parcel, iR);
                    break;
                case 61:
                    strF16 = R3.b.f(parcel, iR);
                    break;
                case 63:
                    c4498mk = (com.google.android.gms.internal.ads.C4498mk) R3.b.e(parcel, iR, com.google.android.gms.internal.ads.C4498mk.CREATOR);
                    break;
                case 64:
                    strF17 = R3.b.f(parcel, iR);
                    break;
                case 65:
                    bundleA6 = R3.b.a(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C5385uo(iT, bundleA, x6, c2Var, strF, applicationInfo, packageInfo, strF2, strF3, strF4, aVar, bundleA2, iT2, arrayListH, bundleA3, zM, iT3, iT4, fP, strF5, jU, strF6, arrayListH2, strF7, c3505dh, arrayListH3, jU2, strF8, fP2, zM2, iT5, iT6, zM3, strF9, strF10, zM4, iT7, bundleA4, strF11, c7084c1, zM5, bundleA5, strF12, strF13, strF14, zM6, arrayListD, strF15, arrayListH4, iT8, zM7, zM8, zM9, arrayListH5, strF16, c4498mk, strF17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C5385uo[i6];
    }
}
