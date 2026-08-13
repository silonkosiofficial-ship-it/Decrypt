package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3000Xc implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        long jU = 0;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 2) {
                parcelFileDescriptor = (android.os.ParcelFileDescriptor) R3.b.e(parcel, iR, android.os.ParcelFileDescriptor.CREATOR);
            } else if (iL == 3) {
                zM = R3.b.m(parcel, iR);
            } else if (iL == 4) {
                zM2 = R3.b.m(parcel, iR);
            } else if (iL == 5) {
                jU = R3.b.u(parcel, iR);
            } else if (iL != 6) {
                R3.b.x(parcel, iR);
            } else {
                zM3 = R3.b.m(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C2964Wc(parcelFileDescriptor, zM, zM2, jU, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C2964Wc[i6];
    }
}
