package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3057Yp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        java.lang.String strF2 = null;
        java.util.ArrayList arrayListH = null;
        java.util.ArrayList arrayListH2 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
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
                    zM = R3.b.m(parcel, iR);
                    break;
                case 5:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 6:
                    arrayListH = R3.b.h(parcel, iR);
                    break;
                case 7:
                    zM3 = R3.b.m(parcel, iR);
                    break;
                case 8:
                    zM4 = R3.b.m(parcel, iR);
                    break;
                case 9:
                    arrayListH2 = R3.b.h(parcel, iR);
                    break;
                default:
                    R3.b.x(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C3021Xp(strF, strF2, zM, zM2, arrayListH, zM3, zM4, arrayListH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C3021Xp[i6];
    }
}
