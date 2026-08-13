package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5715xo implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        java.util.ArrayList arrayListH = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                zM = R3.b.m(parcel, iR);
            } else if (iL != 3) {
                R3.b.x(parcel, iR);
            } else {
                arrayListH = R3.b.h(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C5605wo(zM, arrayListH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C5605wo[i6];
    }
}
