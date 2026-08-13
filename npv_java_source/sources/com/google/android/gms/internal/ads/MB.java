package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class MB implements com.google.android.gms.internal.ads.InterfaceC3571eE, com.google.android.gms.internal.ads.ZG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f29679C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f29680D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p224w3.a f29681E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f29682F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4797pP f29683G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f29684H;

    public MB(android.content.Context context, com.google.android.gms.internal.ads.C4546n70 c4546n70, p224w3.a aVar, p214v3.InterfaceC7268s0 interfaceC7268s0, com.google.android.gms.internal.ads.C4797pP c4797pP, com.google.android.gms.internal.ads.T90 t90) {
        this.f29679C = context;
        this.f29680D = c4546n70;
        this.f29681E = aVar;
        this.f29682F = interfaceC7268s0;
        this.f29683G = c4797pP;
        this.f29684H = t90;
    }

    private final void b() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25507b4)).booleanValue()) {
            p214v3.InterfaceC7268s0 interfaceC7268s0 = this.f29682F;
            android.content.Context context = this.f29679C;
            p224w3.a aVar = this.f29681E;
            com.google.android.gms.internal.ads.C4546n70 c4546n70 = this.f29680D;
            com.google.android.gms.internal.ads.T90 t90 = this.f29684H;
            p174r3.v.d().c(context, aVar, c4546n70.f37513f, interfaceC7268s0.i(), t90);
        }
        this.f29683G.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void G(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void a(B3.N n6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25518c4)).booleanValue()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
    }
}
