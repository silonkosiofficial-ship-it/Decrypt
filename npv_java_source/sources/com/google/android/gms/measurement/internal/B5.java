package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class B5 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.B5> CREATOR = new com.google.android.gms.measurement.internal.A5();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f41738C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f41739D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f41740E;

    B5(java.lang.String str, long j6, int i6) {
        this.f41738C = str;
        this.f41739D = j6;
        this.f41740E = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, this.f41738C, false);
        R3.c.n(parcel, 2, this.f41739D);
        R3.c.k(parcel, 3, this.f41740E);
        R3.c.b(parcel, iA);
    }
}
