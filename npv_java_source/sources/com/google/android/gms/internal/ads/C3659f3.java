package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3659f3 implements com.google.android.gms.internal.ads.InterfaceC3549e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f35252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f35253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f35254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f35255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35256e;

    private C3659f3(long[] jArr, long[] jArr2, long j6, long j10, int i6) {
        this.f35252a = jArr;
        this.f35253b = jArr2;
        this.f35254c = j6;
        this.f35255d = j10;
        this.f35256e = i6;
    }

    public static com.google.android.gms.internal.ads.C3659f3 d(long j6, long j10, com.google.android.gms.internal.ads.M0 m6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iC;
        c5128sR.m(10);
        int iW = c5128sR.w();
        if (iW <= 0) {
            return null;
        }
        int i6 = m6.f29627d;
        long jM = com.google.android.gms.internal.ads.EW.M(iW, ((long) (i6 >= 32000 ? 1152 : 576)) * 1000000, i6, java.math.RoundingMode.DOWN);
        int iG = c5128sR.G();
        int iG2 = c5128sR.G();
        int iG3 = c5128sR.G();
        c5128sR.m(2);
        long j11 = j10 + ((long) m6.f29626c);
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        int i10 = 0;
        long j12 = j10;
        while (i10 < iG) {
            long j13 = jM;
            jArr[i10] = (((long) i10) * jM) / ((long) iG);
            jArr2[i10] = java.lang.Math.max(j12, j11);
            if (iG3 == 1) {
                iC = c5128sR.C();
            } else if (iG3 == 2) {
                iC = c5128sR.G();
            } else if (iG3 == 3) {
                iC = c5128sR.E();
            } else {
                if (iG3 != 4) {
                    return null;
                }
                iC = c5128sR.F();
            }
            j12 += ((long) iC) * ((long) iG2);
            i10++;
            jM = j13;
        }
        long j14 = jM;
        if (j6 != -1 && j6 != j12) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("VbriSeeker", "VBRI data size mismatch: " + j6 + ", " + j12);
        }
        return new com.google.android.gms.internal.ads.C3659f3(jArr, jArr2, j14, j12, m6.f29629f);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f35254c;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        long[] jArr = this.f35252a;
        int iV = com.google.android.gms.internal.ads.EW.v(jArr, j6, true, true);
        com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(jArr[iV], this.f35253b[iV]);
        if (u6.f32078a < j6) {
            long[] jArr2 = this.f35252a;
            if (iV != jArr2.length - 1) {
                int i6 = iV + 1;
                return new com.google.android.gms.internal.ads.R0(u6, new com.google.android.gms.internal.ads.U0(jArr2[i6], this.f35253b[i6]));
            }
        }
        return new com.google.android.gms.internal.ads.R0(u6, u6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final int c() {
        return this.f35256e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long f() {
        return this.f35255d;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long h(long j6) {
        return this.f35252a[com.google.android.gms.internal.ads.EW.v(this.f35253b, j6, true, true)];
    }
}
