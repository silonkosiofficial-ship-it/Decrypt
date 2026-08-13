package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6024h1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40955G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40956H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f40957I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ boolean f40958J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f40959K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6024h1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z6) {
        super(c5997e1);
        this.f40955G = str;
        this.f40956H = str2;
        this.f40957I = obj;
        this.f40958J = z6;
        this.f40959K = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f40959K.f40867i)).setUserProperty(this.f40955G, this.f40956H, X3.b.c2(this.f40957I), this.f40958J, this.f40868C);
    }
}
