package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class G2 implements android.os.Parcelable.Creator {
    G2() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, com.google.android.gms.internal.ads.I2.class.getClassLoader());
        return new com.google.android.gms.internal.ads.J2(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.J2[i6];
    }
}
