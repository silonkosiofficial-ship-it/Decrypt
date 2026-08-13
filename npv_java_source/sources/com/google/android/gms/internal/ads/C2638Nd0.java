package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2638Nd0 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2638Nd0> CREATOR = new com.google.android.gms.internal.ads.C2712Pd0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f30339C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f30340D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f30341E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f30342F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f30343G;

    C2638Nd0(int i6, int i10, int i11, java.lang.String str, java.lang.String str2) {
        this.f30339C = i6;
        this.f30340D = i10;
        this.f30341E = str;
        this.f30342F = str2;
        this.f30343G = i11;
    }

    public C2638Nd0(int i6, int i10, java.lang.String str, java.lang.String str2) {
        this(1, 1, i10 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f30339C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, this.f30340D);
        R3.c.q(parcel, 3, this.f30341E, false);
        R3.c.q(parcel, 4, this.f30342F, false);
        R3.c.k(parcel, 5, this.f30343G);
        R3.c.b(parcel, iA);
    }
}
