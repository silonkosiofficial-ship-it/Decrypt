package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4838pp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        int iT = 0;
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                strF = R3.b.f(parcel, iR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                iT = R3.b.t(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C4728op(strF, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C4728op[i6];
    }
}
