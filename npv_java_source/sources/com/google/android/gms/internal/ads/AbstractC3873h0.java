package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3873h0 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f35965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f35968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f35970f;

    public AbstractC3873h0(long j6, long j10, int i6, int i10, boolean z6) {
        long jE;
        this.f35965a = j6;
        this.f35966b = j10;
        this.f35967c = i10 == -1 ? 1 : i10;
        this.f35969e = i6;
        if (j6 == -1) {
            this.f35968d = -1L;
            jE = -9223372036854775807L;
        } else {
            this.f35968d = j6 - j10;
            jE = e(j6, j10, i6);
        }
        this.f35970f = jE;
    }

    private static long e(long j6, long j10, int i6) {
        return (java.lang.Math.max(0L, j6 - j10) * 8000000) / ((long) i6);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f35970f;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        long j10 = this.f35968d;
        if (j10 == -1) {
            com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(0L, this.f35966b);
            return new com.google.android.gms.internal.ads.R0(u6, u6);
        }
        long j11 = ((long) this.f35969e) * j6;
        long j12 = this.f35967c;
        long jMin = ((j11 / 8000000) / j12) * j12;
        if (j10 != -1) {
            jMin = java.lang.Math.min(jMin, j10 - j12);
        }
        long jMax = this.f35966b + java.lang.Math.max(jMin, 0L);
        long jD = d(jMax);
        com.google.android.gms.internal.ads.U0 u10 = new com.google.android.gms.internal.ads.U0(jD, jMax);
        if (this.f35968d != -1 && jD < j6) {
            long j13 = jMax + ((long) this.f35967c);
            if (j13 < this.f35965a) {
                return new com.google.android.gms.internal.ads.R0(u10, new com.google.android.gms.internal.ads.U0(d(j13), j13));
            }
        }
        return new com.google.android.gms.internal.ads.R0(u10, u10);
    }

    public final long d(long j6) {
        return e(j6, this.f35966b, this.f35969e);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return this.f35968d != -1;
    }
}
