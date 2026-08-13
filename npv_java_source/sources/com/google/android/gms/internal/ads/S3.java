package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class S3 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.U3 f31529a;

    /* synthetic */ S3(com.google.android.gms.internal.ads.U3 u6, com.google.android.gms.internal.ads.T3 t6) {
        this.f31529a = u6;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        com.google.android.gms.internal.ads.U3 u6 = this.f31529a;
        return u6.f32088d.e(u6.f32090f);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        com.google.android.gms.internal.ads.U3 u6 = this.f31529a;
        long jF = u6.f32088d.f(j6);
        long j10 = u6.f32086b;
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(jF);
        com.google.android.gms.internal.ads.U3 u10 = this.f31529a;
        long jLongValue = j10 + bigIntegerValueOf.multiply(java.math.BigInteger.valueOf(u10.f32087c - u10.f32086b)).divide(java.math.BigInteger.valueOf(this.f31529a.f32090f)).longValue();
        com.google.android.gms.internal.ads.U3 u11 = this.f31529a;
        com.google.android.gms.internal.ads.U0 u12 = new com.google.android.gms.internal.ads.U0(j6, java.lang.Math.max(u11.f32086b, java.lang.Math.min(jLongValue - 30000, u11.f32087c - 1)));
        return new com.google.android.gms.internal.ads.R0(u12, u12);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }
}
