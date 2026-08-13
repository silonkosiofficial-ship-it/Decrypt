package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3292bk implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        boolean zM = false;
        int iT = 0;
        java.lang.String strF2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                strF = R3.b.f(parcel, iR);
            } else if (iL == 2) {
                zM = R3.b.m(parcel, iR);
            } else if (iL == 3) {
                iT = R3.b.t(parcel, iR);
            } else if (iL != 4) {
                R3.b.x(parcel, iR);
            } else {
                strF2 = R3.b.f(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C3182ak(strF, zM, iT, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C3182ak[i6];
    }
}
