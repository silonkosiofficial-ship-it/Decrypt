package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2686Oj implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        java.lang.String[] strArrG = null;
        java.lang.String[] strArrG2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 2) {
                strArrG = R3.b.g(parcel, iR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                strArrG2 = R3.b.g(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C2649Nj(strF, strArrG, strArrG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C2649Nj[i6];
    }
}
