package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5935zo implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.lang.String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            if (R3.b.l(iR) != 1) {
                R3.b.x(parcel, iR);
            } else {
                strF = R3.b.f(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C5825yo(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C5825yo[i6];
    }
}
