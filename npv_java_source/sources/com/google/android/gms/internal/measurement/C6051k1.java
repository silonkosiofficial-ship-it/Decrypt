package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6051k1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.app.Activity f41001G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41002H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41003I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41004J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6051k1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        super(c5997e1);
        this.f41001G = activity;
        this.f41002H = str;
        this.f41003I = str2;
        this.f41004J = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41004J.f40867i)).setCurrentScreen(X3.b.c2(this.f41001G), this.f41002H, this.f41003I, this.f40868C);
    }
}
