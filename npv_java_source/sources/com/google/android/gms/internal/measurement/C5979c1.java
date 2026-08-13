package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5979c1 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.C5979c1> CREATOR = new com.google.android.gms.internal.measurement.C5970b1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f40805C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f40806D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f40807E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f40808F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String f40809G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final java.lang.String f40810H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final android.os.Bundle f40811I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.lang.String f40812J;

    public C5979c1(long j6, long j10, boolean z6, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, java.lang.String str4) {
        this.f40805C = j6;
        this.f40806D = j10;
        this.f40807E = z6;
        this.f40808F = str;
        this.f40809G = str2;
        this.f40810H = str3;
        this.f40811I = bundle;
        this.f40812J = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.n(parcel, 1, this.f40805C);
        R3.c.n(parcel, 2, this.f40806D);
        R3.c.c(parcel, 3, this.f40807E);
        R3.c.q(parcel, 4, this.f40808F, false);
        R3.c.q(parcel, 5, this.f40809G, false);
        R3.c.q(parcel, 6, this.f40810H, false);
        R3.c.e(parcel, 7, this.f40811I, false);
        R3.c.q(parcel, 8, this.f40812J, false);
        R3.c.b(parcel, iA);
    }
}
