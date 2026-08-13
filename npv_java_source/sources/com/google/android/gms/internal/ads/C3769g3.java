package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3769g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.M0 f35517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f35522f;

    private C3769g3(com.google.android.gms.internal.ads.M0 m6, long j6, long j10, long[] jArr, int i6, int i10) {
        this.f35517a = new com.google.android.gms.internal.ads.M0(m6);
        this.f35518b = j6;
        this.f35519c = j10;
        this.f35522f = jArr;
        this.f35520d = i6;
        this.f35521e = i10;
    }

    public static com.google.android.gms.internal.ads.C3769g3 b(com.google.android.gms.internal.ads.M0 m6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        long[] jArr;
        int i6;
        int i10;
        int iW = c5128sR.w();
        int iF = (iW & 1) != 0 ? c5128sR.F() : -1;
        long jK = (iW & 2) != 0 ? c5128sR.K() : -1L;
        if ((iW & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i11 = 0; i11 < 100; i11++) {
                jArr2[i11] = c5128sR.C();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iW & 8) != 0) {
            c5128sR.m(4);
        }
        if (c5128sR.r() >= 24) {
            c5128sR.m(21);
            int iE = c5128sR.E();
            i10 = iE & 4095;
            i6 = iE >> 12;
        } else {
            i6 = -1;
            i10 = -1;
        }
        return new com.google.android.gms.internal.ads.C3769g3(m6, iF, jK, jArr, i6, i10);
    }

    public final long a() {
        long j6 = this.f35518b;
        if (j6 == -1 || j6 == 0) {
            return -9223372036854775807L;
        }
        com.google.android.gms.internal.ads.M0 m6 = this.f35517a;
        return com.google.android.gms.internal.ads.EW.L((j6 * ((long) m6.f29630g)) - 1, m6.f29627d);
    }
}
