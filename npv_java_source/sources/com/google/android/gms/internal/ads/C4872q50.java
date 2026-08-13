package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4872q50 implements com.google.android.gms.internal.ads.F50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3232b80 f38181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f38182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2505Jk0 f38183c = new com.google.android.gms.internal.ads.C4652o50(this);

    public C4872q50(com.google.android.gms.internal.ads.InterfaceC3232b80 interfaceC3232b80, java.util.concurrent.Executor executor) {
        this.f38181a = interfaceC3232b80;
        this.f38182b = executor;
    }

    @Override // com.google.android.gms.internal.ads.F50
    public final /* bridge */ /* synthetic */ P4.d a(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, java.lang.Object obj) {
        return c(g50, e50, null);
    }

    final /* synthetic */ P4.d b(com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC, com.google.android.gms.internal.ads.C5751y50 c5751y50) {
        com.google.android.gms.internal.ads.InterfaceC3232b80 interfaceC3232b80 = this.f38181a;
        com.google.android.gms.internal.ads.InterfaceC4438m80 interfaceC4438m80 = c5751y50.f39985b;
        com.google.android.gms.internal.ads.C2730Po c2730Po = c5751y50.f39984a;
        com.google.android.gms.internal.ads.C4328l80 c4328l80C = interfaceC3232b80.c(interfaceC4438m80);
        if (c4328l80C != null && c2730Po != null) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(interfaceC4115jC.b().g(c2730Po), this.f38183c, this.f38182b);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C4762p50(interfaceC4438m80, c2730Po, c4328l80C));
    }

    public final P4.d c(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, final com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC) {
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(new com.google.android.gms.internal.ads.B50(this.f38181a, interfaceC4115jC, this.f38182b).c()), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.m50
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f37283a.b(interfaceC4115jC, (com.google.android.gms.internal.ads.C5751y50) obj);
            }
        }, this.f38182b), java.lang.Exception.class, new com.google.android.gms.internal.ads.C4542n50(this), this.f38182b);
    }

    @Override // com.google.android.gms.internal.ads.F50
    public final /* bridge */ /* synthetic */ java.lang.Object f() {
        return null;
    }
}
