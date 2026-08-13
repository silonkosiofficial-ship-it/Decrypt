package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6127t1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41210G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41211H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ boolean f41212I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.Q0 f41213J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41214K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6127t1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.String str, java.lang.String str2, boolean z6, com.google.android.gms.internal.measurement.Q0 q6) {
        super(c5997e1);
        this.f41210G = str;
        this.f41211H = str2;
        this.f41212I = z6;
        this.f41213J = q6;
        this.f41214K = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41214K.f40867i)).getUserProperties(this.f41210G, this.f41211H, this.f41212I, this.f41213J);
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    protected final void b() {
        this.f41213J.e0(null);
    }
}
