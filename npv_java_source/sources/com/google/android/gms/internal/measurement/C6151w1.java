package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6151w1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41262G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.Q0 f41263H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41264I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6151w1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.String str, com.google.android.gms.internal.measurement.Q0 q6) {
        super(c5997e1);
        this.f41262G = str;
        this.f41263H = q6;
        this.f41264I = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41264I.f40867i)).getMaxUserProperties(this.f41262G, this.f41263H);
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    protected final void b() {
        this.f41263H.e0(null);
    }
}
