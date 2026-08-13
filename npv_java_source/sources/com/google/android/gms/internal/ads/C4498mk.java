package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4498mk extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4498mk> CREATOR = new com.google.android.gms.internal.ads.C4718ok();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f37396C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f37397D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f37398E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f37399F;

    public C4498mk(int i6, int i10, java.lang.String str, int i11) {
        this.f37396C = i6;
        this.f37397D = i10;
        this.f37398E = str;
        this.f37399F = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f37397D;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.q(parcel, 2, this.f37398E, false);
        R3.c.k(parcel, 3, this.f37399F);
        R3.c.k(parcel, 1000, this.f37396C);
        R3.c.b(parcel, iA);
    }
}
