package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2363Fq extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2363Fq> CREATOR = new com.google.android.gms.internal.ads.C2400Gq();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f27458C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f27459D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p184s3.c2 f27460E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p184s3.X1 f27461F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f27462G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final java.lang.String f27463H;

    public C2363Fq(java.lang.String str, java.lang.String str2, p184s3.c2 c2Var, p184s3.X1 x6, int i6, java.lang.String str3) {
        this.f27458C = str;
        this.f27459D = str2;
        this.f27460E = c2Var;
        this.f27461F = x6;
        this.f27462G = i6;
        this.f27463H = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f27458C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.q(parcel, 2, this.f27459D, false);
        R3.c.p(parcel, 3, this.f27460E, i6, false);
        R3.c.p(parcel, 4, this.f27461F, i6, false);
        R3.c.k(parcel, 5, this.f27462G);
        R3.c.q(parcel, 6, this.f27463H, false);
        R3.c.b(parcel, iA);
    }
}
