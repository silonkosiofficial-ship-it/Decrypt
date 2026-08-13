package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.E> CREATOR = new p085i4.C6652d();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f41772C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.D f41773D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f41774E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f41775F;

    E(com.google.android.gms.measurement.internal.E e6, long j6) {
        Q3.AbstractC1477p.l(e6);
        this.f41772C = e6.f41772C;
        this.f41773D = e6.f41773D;
        this.f41774E = e6.f41774E;
        this.f41775F = j6;
    }

    public E(java.lang.String str, com.google.android.gms.measurement.internal.D d6, java.lang.String str2, long j6) {
        this.f41772C = str;
        this.f41773D = d6;
        this.f41774E = str2;
        this.f41775F = j6;
    }

    public final java.lang.String toString() {
        return "origin=" + this.f41774E + ",name=" + this.f41772C + ",params=" + java.lang.String.valueOf(this.f41773D);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, this.f41772C, false);
        R3.c.p(parcel, 3, this.f41773D, i6, false);
        R3.c.q(parcel, 4, this.f41774E, false);
        R3.c.n(parcel, 5, this.f41775F);
        R3.c.b(parcel, iA);
    }
}
