package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6159x1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f41277G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.Q0 f41278H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41279I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6159x1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, android.os.Bundle bundle, com.google.android.gms.internal.measurement.Q0 q6) {
        super(c5997e1);
        this.f41277G = bundle;
        this.f41278H = q6;
        this.f41279I = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41279I.f40867i)).performAction(this.f41277G, this.f41278H, this.f40868C);
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    protected final void b() {
        this.f41278H.e0(null);
    }
}
