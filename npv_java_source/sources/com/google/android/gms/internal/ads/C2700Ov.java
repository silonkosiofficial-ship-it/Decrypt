package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2700Ov implements com.google.android.gms.internal.ads.InterfaceC3335c50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f30586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p184s3.c2 f30587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f30588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f30589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f30590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f30591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f30592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f30593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f30594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f30595j;

    /* synthetic */ C2700Ov(com.google.android.gms.internal.ads.C2331Ev c2331Ev, android.content.Context context, java.lang.String str, p184s3.c2 c2Var, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f30589d = c2331Ev;
        this.f30586a = context;
        this.f30587b = c2Var;
        this.f30588c = str;
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A = com.google.android.gms.internal.ads.C3322bz0.a(context);
        this.f30590e = interfaceC3213az0A;
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A2 = com.google.android.gms.internal.ads.C3322bz0.a(c2Var);
        this.f30591f = interfaceC3213az0A2;
        com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0C = com.google.android.gms.internal.ads.Zy0.c(new com.google.android.gms.internal.ads.VX(c2331Ev.f27161N));
        this.f30592g = interfaceC4309kz0C;
        com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0C2 = com.google.android.gms.internal.ads.Zy0.c(com.google.android.gms.internal.ads.C3160aY.a());
        this.f30593h = interfaceC4309kz0C2;
        com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0C3 = com.google.android.gms.internal.ads.Zy0.c(com.google.android.gms.internal.ads.C4231kF.a());
        this.f30594i = interfaceC4309kz0C3;
        this.f30595j = com.google.android.gms.internal.ads.Zy0.c(new com.google.android.gms.internal.ads.C3116a50(interfaceC3213az0A, c2331Ev.f27195d, interfaceC3213az0A2, c2331Ev.f27173T, interfaceC4309kz0C, interfaceC4309kz0C2, com.google.android.gms.internal.ads.C4766p70.a(), interfaceC4309kz0C3));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335c50
    public final com.google.android.gms.internal.ads.BinderC5904zX a() {
        return new com.google.android.gms.internal.ads.BinderC5904zX(this.f30586a, this.f30587b, this.f30588c, (com.google.android.gms.internal.ads.Z40) this.f30595j.b(), (com.google.android.gms.internal.ads.UX) this.f30592g.b(), com.google.android.gms.internal.ads.C4740ov.c(this.f30589d.f27189b), (com.google.android.gms.internal.ads.C3588eO) this.f30589d.f27161N.b());
    }
}
