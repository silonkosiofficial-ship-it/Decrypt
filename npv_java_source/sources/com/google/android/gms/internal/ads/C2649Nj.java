package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2649Nj extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2649Nj> CREATOR = new com.google.android.gms.internal.ads.C2686Oj();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f30361C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String[] f30362D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String[] f30363E;

    C2649Nj(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.f30361C = str;
        this.f30362D = strArr;
        this.f30363E = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f30361C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.r(parcel, 2, this.f30362D, false);
        R3.c.r(parcel, 3, this.f30363E, false);
        R3.c.b(parcel, iA);
    }
}
