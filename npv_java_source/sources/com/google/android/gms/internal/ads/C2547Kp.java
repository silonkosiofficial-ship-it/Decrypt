package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2547Kp extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2547Kp> CREATOR = new com.google.android.gms.internal.ads.C2584Lp();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f29010C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f29011D;

    public C2547Kp(java.lang.String str, java.lang.String str2) {
        this.f29010C = str;
        this.f29011D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f29010C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.q(parcel, 2, this.f29011D, false);
        R3.c.b(parcel, iA);
    }
}
