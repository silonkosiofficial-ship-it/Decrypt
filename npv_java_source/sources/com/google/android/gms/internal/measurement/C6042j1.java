package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6042j1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40987G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40988H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f40989I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f40990J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6042j1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        super(c5997e1);
        this.f40987G = str;
        this.f40988H = str2;
        this.f40989I = bundle;
        this.f40990J = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f40990J.f40867i)).clearConditionalUserProperty(this.f40987G, this.f40988H, this.f40989I);
    }
}
