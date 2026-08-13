package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class H1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.app.Activity f40525G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.Q0 f40526H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1.c f40527I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H1(com.google.android.gms.internal.measurement.C5997e1.c cVar, android.app.Activity activity, com.google.android.gms.internal.measurement.Q0 q6) {
        super(com.google.android.gms.internal.measurement.C5997e1.this);
        this.f40525G = activity;
        this.f40526H = q6;
        this.f40527I = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(com.google.android.gms.internal.measurement.C5997e1.this.f40867i)).onActivitySaveInstanceState(X3.b.c2(this.f40525G), this.f40526H, this.f40869D);
    }
}
