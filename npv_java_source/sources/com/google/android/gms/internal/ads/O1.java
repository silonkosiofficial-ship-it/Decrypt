package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class O1 extends com.google.android.gms.internal.ads.H0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.T0 f30424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.P1 f30425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O1(com.google.android.gms.internal.ads.P1 p6, com.google.android.gms.internal.ads.T0 t6, com.google.android.gms.internal.ads.T0 t10) {
        super(t6);
        this.f30424b = t10;
        this.f30425c = p6;
    }

    @Override // com.google.android.gms.internal.ads.H0, com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        com.google.android.gms.internal.ads.R0 r0B = this.f30424b.b(j6);
        com.google.android.gms.internal.ads.U0 u6 = r0B.f31105a;
        com.google.android.gms.internal.ads.U0 u10 = new com.google.android.gms.internal.ads.U0(u6.f32078a, u6.f32079b + this.f30425c.f30615C);
        com.google.android.gms.internal.ads.U0 u11 = r0B.f31106b;
        return new com.google.android.gms.internal.ads.R0(u10, new com.google.android.gms.internal.ads.U0(u11.f32078a, u11.f32079b + this.f30425c.f30615C));
    }
}
