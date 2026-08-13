package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ed0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2306Ed0 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2306Ed0> CREATOR = new com.google.android.gms.internal.ads.C2343Fd0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f27092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f27093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f27094E;

    C2306Ed0(int i6, java.lang.String str, java.lang.String str2) {
        this.f27092C = i6;
        this.f27093D = str;
        this.f27094E = str2;
    }

    public C2306Ed0(java.lang.String str, java.lang.String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f27092C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.q(parcel, 2, this.f27093D, false);
        R3.c.q(parcel, 3, this.f27094E, false);
        R3.c.b(parcel, iA);
    }
}
