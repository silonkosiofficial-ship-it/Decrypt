package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6143v1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41249H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f41250I;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41253L;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ int f41248G = 5;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f41251J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f41252K = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6143v1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, boolean z6, int i6, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        super(false);
        this.f41249H = str;
        this.f41250I = obj;
        this.f41253L = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41253L.f40867i)).logHealthData(this.f41248G, this.f41249H, X3.b.c2(this.f41250I), X3.b.c2(null), X3.b.c2(null));
    }
}
