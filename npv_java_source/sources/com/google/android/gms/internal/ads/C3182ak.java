package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3182ak extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3182ak> CREATOR = new com.google.android.gms.internal.ads.C3292bk();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f34128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f34129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f34130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f34131F;

    public C3182ak(java.lang.String str, boolean z6, int i6, java.lang.String str2) {
        this.f34128C = str;
        this.f34129D = z6;
        this.f34130E = i6;
        this.f34131F = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f34128C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.c(parcel, 2, this.f34129D);
        R3.c.k(parcel, 3, this.f34130E);
        R3.c.q(parcel, 4, this.f34131F, false);
        R3.c.b(parcel, iA);
    }
}
