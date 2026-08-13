package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class C0 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.E0 f26109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26110b;

    public C0(com.google.android.gms.internal.ads.E0 e6, long j6) {
        this.f26109a = e6;
        this.f26110b = j6;
    }

    private final com.google.android.gms.internal.ads.U0 d(long j6, long j10) {
        return new com.google.android.gms.internal.ads.U0((j6 * 1000000) / ((long) this.f26109a.f26862e), this.f26110b + j10);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f26109a.a();
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        com.google.android.gms.internal.ads.LC.b(this.f26109a.f26868k);
        com.google.android.gms.internal.ads.E0 e6 = this.f26109a;
        com.google.android.gms.internal.ads.D0 d6 = e6.f26868k;
        long[] jArr = d6.f26586a;
        long[] jArr2 = d6.f26587b;
        int iV = com.google.android.gms.internal.ads.EW.v(jArr, e6.b(j6), true, false);
        com.google.android.gms.internal.ads.U0 u0D = d(iV == -1 ? 0L : jArr[iV], iV != -1 ? jArr2[iV] : 0L);
        if (u0D.f32078a == j6 || iV == jArr.length - 1) {
            return new com.google.android.gms.internal.ads.R0(u0D, u0D);
        }
        int i6 = iV + 1;
        return new com.google.android.gms.internal.ads.R0(u0D, d(jArr[i6], jArr2[i6]));
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }
}
