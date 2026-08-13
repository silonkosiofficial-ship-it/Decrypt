package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2693Oo implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            if (R3.b.l(iR) != 2) {
                R3.b.x(parcel, iR);
            } else {
                parcelFileDescriptor = (android.os.ParcelFileDescriptor) R3.b.e(parcel, iR, android.os.ParcelFileDescriptor.CREATOR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C2656No(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C2656No[i6];
    }
}
