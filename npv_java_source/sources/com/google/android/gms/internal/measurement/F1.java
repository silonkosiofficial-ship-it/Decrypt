package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class F1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.app.Activity f40503G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1.c f40504H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F1(com.google.android.gms.internal.measurement.C5997e1.c cVar, android.app.Activity activity) {
        super(com.google.android.gms.internal.measurement.C5997e1.this);
        this.f40503G = activity;
        this.f40504H = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(com.google.android.gms.internal.measurement.C5997e1.this.f40867i)).onActivityPaused(X3.b.c2(this.f40503G), this.f40869D);
    }
}
