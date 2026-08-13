package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6006f1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f40937G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f40938H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6006f1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, android.os.Bundle bundle) {
        super(c5997e1);
        this.f40937G = bundle;
        this.f40938H = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f40938H.f40867i)).setConditionalUserProperty(this.f40937G, this.f40868C);
    }
}
