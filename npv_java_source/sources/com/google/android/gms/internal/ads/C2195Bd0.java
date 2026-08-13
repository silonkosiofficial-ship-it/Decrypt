package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2195Bd0 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2195Bd0> CREATOR = new com.google.android.gms.internal.ads.C2232Cd0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f25998C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final byte[] f25999D;

    C2195Bd0(int i6, byte[] bArr) {
        this.f25998C = i6;
        this.f25999D = bArr;
    }

    public C2195Bd0(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f25998C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.f(parcel, 2, this.f25999D, false);
        R3.c.b(parcel, iA);
    }
}
