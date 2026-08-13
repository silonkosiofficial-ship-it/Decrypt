package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2723Pj extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2723Pj> CREATOR = new com.google.android.gms.internal.ads.C2760Qj();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f30768C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f30769D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f30770E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final byte[] f30771F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String[] f30772G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final java.lang.String[] f30773H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f30774I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final long f30775J;

    C2723Pj(boolean z6, java.lang.String str, int i6, byte[] bArr, java.lang.String[] strArr, java.lang.String[] strArr2, boolean z10, long j6) {
        this.f30768C = z6;
        this.f30769D = str;
        this.f30770E = i6;
        this.f30771F = bArr;
        this.f30772G = strArr;
        this.f30773H = strArr2;
        this.f30774I = z10;
        this.f30775J = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        boolean z6 = this.f30768C;
        int iA = R3.c.a(parcel);
        R3.c.c(parcel, 1, z6);
        R3.c.q(parcel, 2, this.f30769D, false);
        R3.c.k(parcel, 3, this.f30770E);
        R3.c.f(parcel, 4, this.f30771F, false);
        R3.c.r(parcel, 5, this.f30772G, false);
        R3.c.r(parcel, 6, this.f30773H, false);
        R3.c.c(parcel, 7, this.f30774I);
        R3.c.n(parcel, 8, this.f30775J);
        R3.c.b(parcel, iA);
    }
}
