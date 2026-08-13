package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3763g0 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f35498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f35499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f35500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f35501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f35502f;

    public C3763g0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f35498b = iArr;
        this.f35499c = jArr;
        this.f35500d = jArr2;
        this.f35501e = jArr3;
        int length = iArr.length;
        this.f35497a = length;
        if (length <= 0) {
            this.f35502f = 0L;
        } else {
            int i6 = length - 1;
            this.f35502f = jArr2[i6] + jArr3[i6];
        }
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f35502f;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        long[] jArr = this.f35501e;
        int iV = com.google.android.gms.internal.ads.EW.v(jArr, j6, true, true);
        com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(jArr[iV], this.f35499c[iV]);
        if (u6.f32078a >= j6 || iV == this.f35497a - 1) {
            return new com.google.android.gms.internal.ads.R0(u6, u6);
        }
        int i6 = iV + 1;
        return new com.google.android.gms.internal.ads.R0(u6, new com.google.android.gms.internal.ads.U0(this.f35501e[i6], this.f35499c[i6]));
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }

    public final java.lang.String toString() {
        long[] jArr = this.f35500d;
        long[] jArr2 = this.f35501e;
        long[] jArr3 = this.f35499c;
        return "ChunkIndex(length=" + this.f35497a + ", sizes=" + java.util.Arrays.toString(this.f35498b) + ", offsets=" + java.util.Arrays.toString(jArr3) + ", timeUs=" + java.util.Arrays.toString(jArr2) + ", durationsUs=" + java.util.Arrays.toString(jArr) + ")";
    }
}
