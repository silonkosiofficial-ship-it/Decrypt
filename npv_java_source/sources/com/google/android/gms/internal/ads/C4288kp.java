package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4288kp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        p184s3.X1 x6 = null;
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                x6 = (p184s3.X1) R3.b.e(parcel, iR, p184s3.X1.CREATOR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                strF = R3.b.f(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C4178jp(x6, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C4178jp[i6];
    }
}
