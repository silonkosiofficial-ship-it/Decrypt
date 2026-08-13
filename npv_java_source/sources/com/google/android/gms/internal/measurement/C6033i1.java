package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6033i1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40975G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40976H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.Q0 f40977I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f40978J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6033i1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.Q0 q6) {
        super(c5997e1);
        this.f40975G = str;
        this.f40976H = str2;
        this.f40977I = q6;
        this.f40978J = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f40978J.f40867i)).getConditionalUserProperties(this.f40975G, this.f40976H, this.f40977I);
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    protected final void b() {
        this.f40977I.e0(null);
    }
}
