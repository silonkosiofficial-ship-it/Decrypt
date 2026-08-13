package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4278kk extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4278kk> CREATOR = new com.google.android.gms.internal.ads.C4388lk();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f37000C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final android.os.Bundle f37001D;

    public C4278kk(java.lang.String str, android.os.Bundle bundle) {
        this.f37000C = str;
        this.f37001D = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f37000C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.e(parcel, 2, this.f37001D, false);
        R3.c.b(parcel, iA);
    }
}
