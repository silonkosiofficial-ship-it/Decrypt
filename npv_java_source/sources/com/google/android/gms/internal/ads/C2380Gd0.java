package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2380Gd0 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2380Gd0> CREATOR = new com.google.android.gms.internal.ads.C2417Hd0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f27856C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Q8 f27857D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private byte[] f27858E;

    C2380Gd0(int i6, byte[] bArr) {
        this.f27856C = i6;
        this.f27858E = bArr;
        b();
    }

    private final void b() {
        com.google.android.gms.internal.ads.Q8 q10 = this.f27857D;
        if (q10 != null || this.f27858E == null) {
            if (q10 == null || this.f27858E != null) {
                if (q10 != null && this.f27858E != null) {
                    throw new java.lang.IllegalStateException("Invalid internal representation - full");
                }
                if (q10 != null || this.f27858E != null) {
                    throw new java.lang.IllegalStateException("Impossible");
                }
                throw new java.lang.IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final com.google.android.gms.internal.ads.Q8 e() {
        if (this.f27857D == null) {
            try {
                this.f27857D = com.google.android.gms.internal.ads.Q8.X0(this.f27858E, com.google.android.gms.internal.ads.C5730xv0.a());
                this.f27858E = null;
            } catch (com.google.android.gms.internal.ads.Vv0 | java.lang.NullPointerException e6) {
                throw new java.lang.IllegalStateException(e6);
            }
        }
        b();
        return this.f27857D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f27856C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        byte[] bArrL = this.f27858E;
        if (bArrL == null) {
            bArrL = this.f27857D.l();
        }
        R3.c.f(parcel, 2, bArrL, false);
        R3.c.b(parcel, iA);
    }
}
