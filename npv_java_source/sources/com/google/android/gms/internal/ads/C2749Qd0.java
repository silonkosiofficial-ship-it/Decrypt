package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2749Qd0 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2749Qd0> CREATOR = new com.google.android.gms.internal.ads.C2786Rd0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f31020C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final byte[] f31021D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f31022E;

    C2749Qd0(int i6, byte[] bArr, int i10) {
        this.f31020C = i6;
        this.f31021D = bArr == null ? null : java.util.Arrays.copyOf(bArr, bArr.length);
        this.f31022E = i10;
    }

    public C2749Qd0(byte[] bArr, int i6) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f31020C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.f(parcel, 2, this.f31021D, false);
        R3.c.k(parcel, 3, this.f31022E);
        R3.c.b(parcel, iA);
    }
}
