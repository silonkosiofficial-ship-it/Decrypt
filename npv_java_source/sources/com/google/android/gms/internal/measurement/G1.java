package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class G1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.app.Activity f40509G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1.c f40510H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G1(com.google.android.gms.internal.measurement.C5997e1.c cVar, android.app.Activity activity) {
        super(com.google.android.gms.internal.measurement.C5997e1.this);
        this.f40509G = activity;
        this.f40510H = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(com.google.android.gms.internal.measurement.C5997e1.this.f40867i)).onActivityDestroyed(X3.b.c2(this.f40509G), this.f40869D);
    }
}
