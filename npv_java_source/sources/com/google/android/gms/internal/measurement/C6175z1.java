package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6175z1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1.b f41310G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41311H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6175z1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, com.google.android.gms.internal.measurement.C5997e1.b bVar) {
        super(c5997e1);
        this.f41310G = bVar;
        this.f41311H = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41311H.f40867i)).registerOnMeasurementEventListener(this.f41310G);
    }
}
