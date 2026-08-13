package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6362e extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.C6362e> CREATOR = new com.google.android.gms.measurement.internal.C6355d();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public java.lang.String f42359C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public java.lang.String f42360D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.Y5 f42361E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f42362F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f42363G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public java.lang.String f42364H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.E f42365I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f42366J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.E f42367K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f42368L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.E f42369M;

    C6362e(com.google.android.gms.measurement.internal.C6362e c6362e) {
        Q3.AbstractC1477p.l(c6362e);
        this.f42359C = c6362e.f42359C;
        this.f42360D = c6362e.f42360D;
        this.f42361E = c6362e.f42361E;
        this.f42362F = c6362e.f42362F;
        this.f42363G = c6362e.f42363G;
        this.f42364H = c6362e.f42364H;
        this.f42365I = c6362e.f42365I;
        this.f42366J = c6362e.f42366J;
        this.f42367K = c6362e.f42367K;
        this.f42368L = c6362e.f42368L;
        this.f42369M = c6362e.f42369M;
    }

    C6362e(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.Y5 y6, long j6, boolean z6, java.lang.String str3, com.google.android.gms.measurement.internal.E e6, long j10, com.google.android.gms.measurement.internal.E e10, long j11, com.google.android.gms.measurement.internal.E e11) {
        this.f42359C = str;
        this.f42360D = str2;
        this.f42361E = y6;
        this.f42362F = j6;
        this.f42363G = z6;
        this.f42364H = str3;
        this.f42365I = e6;
        this.f42366J = j10;
        this.f42367K = e10;
        this.f42368L = j11;
        this.f42369M = e11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, this.f42359C, false);
        R3.c.q(parcel, 3, this.f42360D, false);
        R3.c.p(parcel, 4, this.f42361E, i6, false);
        R3.c.n(parcel, 5, this.f42362F);
        R3.c.c(parcel, 6, this.f42363G);
        R3.c.q(parcel, 7, this.f42364H, false);
        R3.c.p(parcel, 8, this.f42365I, i6, false);
        R3.c.n(parcel, 9, this.f42366J);
        R3.c.p(parcel, 10, this.f42367K, i6, false);
        R3.c.n(parcel, 11, this.f42368L);
        R3.c.p(parcel, 12, this.f42369M, i6, false);
        R3.c.b(parcel, iA);
    }
}
