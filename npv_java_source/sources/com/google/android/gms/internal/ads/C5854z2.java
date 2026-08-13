package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5854z2 implements android.os.Parcelable.Creator {
    C5854z2() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        string.getClass();
        java.lang.String string2 = parcel.readString();
        java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        return new com.google.android.gms.internal.ads.A2(string, string2, com.google.android.gms.internal.ads.AbstractC3398ci0.N(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.A2[i6];
    }
}
