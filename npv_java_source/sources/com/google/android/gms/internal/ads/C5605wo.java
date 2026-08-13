package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5605wo extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C5605wo> CREATOR = new com.google.android.gms.internal.ads.C5715xo();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f39685C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.util.List f39686D;

    public C5605wo(boolean z6, java.util.List list) {
        this.f39685C = z6;
        this.f39686D = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        boolean z6 = this.f39685C;
        int iA = R3.c.a(parcel);
        R3.c.c(parcel, 2, z6);
        R3.c.s(parcel, 3, this.f39686D, false);
        R3.c.b(parcel, iA);
    }
}
