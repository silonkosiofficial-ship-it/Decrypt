package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3221b3 implements com.google.android.gms.internal.ads.InterfaceC3549e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f34198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f34199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34200c;

    private C3221b3(long[] jArr, long[] jArr2, long j6) {
        this.f34198a = jArr;
        this.f34199b = jArr2;
        this.f34200c = j6 == -9223372036854775807L ? com.google.android.gms.internal.ads.EW.K(jArr2[jArr2.length - 1]) : j6;
    }

    public static com.google.android.gms.internal.ads.C3221b3 d(long j6, com.google.android.gms.internal.ads.C5524w2 c5524w2, long j10) {
        int length = c5524w2.f39503G.length;
        int i6 = length + 1;
        long[] jArr = new long[i6];
        long[] jArr2 = new long[i6];
        jArr[0] = j6;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j6 += (long) (c5524w2.f39501E + c5524w2.f39503G[i11]);
            j11 += (long) (c5524w2.f39502F + c5524w2.f39504H[i11]);
            jArr[i10] = j6;
            jArr2[i10] = j11;
        }
        return new com.google.android.gms.internal.ads.C3221b3(jArr, jArr2, j10);
    }

    private static android.util.Pair e(long j6, long[] jArr, long[] jArr2) {
        java.lang.Long lValueOf;
        java.lang.Long lValueOf2;
        int iV = com.google.android.gms.internal.ads.EW.v(jArr, j6, true, true);
        long j10 = jArr[iV];
        long j11 = jArr2[iV];
        int i6 = iV + 1;
        if (i6 == jArr.length) {
            lValueOf = java.lang.Long.valueOf(j10);
            lValueOf2 = java.lang.Long.valueOf(j11);
        } else {
            long j12 = jArr[i6];
            long j13 = jArr2[i6];
            double d6 = j12 == j10 ? 0.0d : (j6 - j10) / (j12 - j10);
            lValueOf = java.lang.Long.valueOf(j6);
            lValueOf2 = java.lang.Long.valueOf(((long) (d6 * (j13 - j11))) + j11);
        }
        return android.util.Pair.create(lValueOf, lValueOf2);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f34200c;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        android.util.Pair pairE = e(com.google.android.gms.internal.ads.EW.N(java.lang.Math.max(0L, java.lang.Math.min(j6, this.f34200c))), this.f34199b, this.f34198a);
        com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(com.google.android.gms.internal.ads.EW.K(((java.lang.Long) pairE.first).longValue()), ((java.lang.Long) pairE.second).longValue());
        return new com.google.android.gms.internal.ads.R0(u6, u6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final int c() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long f() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long h(long j6) {
        return com.google.android.gms.internal.ads.EW.K(((java.lang.Long) e(j6, this.f34198a, this.f34199b).second).longValue());
    }
}
