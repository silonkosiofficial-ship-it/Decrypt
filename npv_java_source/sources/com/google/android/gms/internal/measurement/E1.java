package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class E1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.app.Activity f40480G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1.c f40481H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E1(com.google.android.gms.internal.measurement.C5997e1.c cVar, android.app.Activity activity) {
        super(com.google.android.gms.internal.measurement.C5997e1.this);
        this.f40480G = activity;
        this.f40481H = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(com.google.android.gms.internal.measurement.C5997e1.this.f40867i)).onActivityStopped(X3.b.c2(this.f40480G), this.f40869D);
    }
}
