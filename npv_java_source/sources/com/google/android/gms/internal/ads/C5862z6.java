package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5862z6 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5532w6 f40216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f40219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f40220e;

    public C5862z6(com.google.android.gms.internal.ads.C5532w6 c5532w6, int i6, long j6, long j10) {
        this.f40216a = c5532w6;
        this.f40217b = i6;
        this.f40218c = j6;
        long j11 = (j10 - j6) / ((long) c5532w6.f39539d);
        this.f40219d = j11;
        this.f40220e = d(j11);
    }

    private final long d(long j6) {
        return com.google.android.gms.internal.ads.EW.M(j6 * ((long) this.f40217b), 1000000L, this.f40216a.f39538c, java.math.RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f40220e;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        long jMax = java.lang.Math.max(0L, java.lang.Math.min((((long) this.f40216a.f39538c) * j6) / (((long) this.f40217b) * 1000000), this.f40219d - 1));
        long j10 = ((long) this.f40216a.f39539d) * jMax;
        long jD = d(jMax);
        com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(jD, this.f40218c + j10);
        if (jD >= j6 || jMax == this.f40219d - 1) {
            return new com.google.android.gms.internal.ads.R0(u6, u6);
        }
        long j11 = jMax + 1;
        return new com.google.android.gms.internal.ads.R0(u6, new com.google.android.gms.internal.ads.U0(d(j11), this.f40218c + (j11 * ((long) this.f40216a.f39539d))));
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }
}
