package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class A1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.Long f40435G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40436H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40437I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f40438J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final /* synthetic */ boolean f40439K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final /* synthetic */ boolean f40440L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f40441M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.Long l6, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6, boolean z10) {
        super(c5997e1);
        this.f40435G = l6;
        this.f40436H = str;
        this.f40437I = str2;
        this.f40438J = bundle;
        this.f40439K = z6;
        this.f40440L = z10;
        this.f40441M = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        java.lang.Long l6 = this.f40435G;
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f40441M.f40867i)).logEvent(this.f40436H, this.f40437I, this.f40438J, this.f40439K, this.f40440L, l6 == null ? this.f40868C : l6.longValue());
    }
}
