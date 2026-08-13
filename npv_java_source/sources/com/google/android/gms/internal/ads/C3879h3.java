package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3879h3 implements com.google.android.gms.internal.ads.InterfaceC3549e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f35976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f35978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f35980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f35981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f35982g;

    private C3879h3(long j6, int i6, long j10, int i10, long j11, long[] jArr) {
        this.f35976a = j6;
        this.f35977b = i6;
        this.f35978c = j10;
        this.f35979d = i10;
        this.f35980e = j11;
        this.f35982g = jArr;
        this.f35981f = j11 != -1 ? j6 + j11 : -1L;
    }

    public static com.google.android.gms.internal.ads.C3879h3 d(com.google.android.gms.internal.ads.C3769g3 c3769g3, long j6) {
        long[] jArr;
        long jA = c3769g3.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j10 = c3769g3.f35519c;
        if (j10 == -1 || (jArr = c3769g3.f35522f) == null) {
            com.google.android.gms.internal.ads.M0 m6 = c3769g3.f35517a;
            return new com.google.android.gms.internal.ads.C3879h3(j6, m6.f29626c, jA, m6.f29629f, -1L, null);
        }
        com.google.android.gms.internal.ads.M0 m10 = c3769g3.f35517a;
        return new com.google.android.gms.internal.ads.C3879h3(j6, m10.f29626c, jA, m10.f29629f, j10, jArr);
    }

    private final long e(int i6) {
        return (this.f35978c * ((long) i6)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f35978c;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        if (!g()) {
            com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(0L, this.f35976a + ((long) this.f35977b));
            return new com.google.android.gms.internal.ads.R0(u6, u6);
        }
        long jMax = java.lang.Math.max(0L, java.lang.Math.min(j6, this.f35978c));
        double d6 = (jMax * 100.0d) / this.f35978c;
        double d10 = 0.0d;
        if (d6 > 0.0d) {
            if (d6 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i6 = (int) d6;
                long[] jArr = this.f35982g;
                com.google.android.gms.internal.ads.LC.b(jArr);
                double d11 = jArr[i6];
                d10 = d11 + ((d6 - ((double) i6)) * ((i6 == 99 ? 256.0d : jArr[i6 + 1]) - d11));
            }
        }
        long j10 = this.f35980e;
        com.google.android.gms.internal.ads.U0 u10 = new com.google.android.gms.internal.ads.U0(jMax, this.f35976a + java.lang.Math.max(this.f35977b, java.lang.Math.min(java.lang.Math.round((d10 / 256.0d) * j10), j10 - 1)));
        return new com.google.android.gms.internal.ads.R0(u10, u10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final int c() {
        return this.f35979d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long f() {
        return this.f35981f;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return this.f35982g != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long h(long j6) {
        if (!g()) {
            return 0L;
        }
        long j10 = j6 - this.f35976a;
        if (j10 <= this.f35977b) {
            return 0L;
        }
        long[] jArr = this.f35982g;
        com.google.android.gms.internal.ads.LC.b(jArr);
        double d6 = (j10 * 256.0d) / this.f35980e;
        int iV = com.google.android.gms.internal.ads.EW.v(jArr, (long) d6, true, true);
        long jE = e(iV);
        long j11 = jArr[iV];
        int i6 = iV + 1;
        long jE2 = e(i6);
        long j12 = iV == 99 ? 256L : jArr[i6];
        return jE + java.lang.Math.round((j11 == j12 ? 0.0d : (d6 - j11) / (j12 - j11)) * (jE2 - jE));
    }
}
