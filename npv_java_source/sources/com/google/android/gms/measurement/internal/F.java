package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            if (R3.b.l(iR) != 2) {
                R3.b.x(parcel, iR);
            } else {
                bundleA = R3.b.a(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.D(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.measurement.internal.D[i6];
    }
}
