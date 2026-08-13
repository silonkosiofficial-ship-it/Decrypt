package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6111r1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.Q0 f41164G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41165H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6111r1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, com.google.android.gms.internal.measurement.Q0 q6) {
        super(c5997e1);
        this.f41164G = q6;
        this.f41165H = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41165H.f40867i)).getCurrentScreenName(this.f41164G);
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    protected final void b() {
        this.f41164G.e0(null);
    }
}
