package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2955Vv implements com.google.android.gms.internal.ads.SO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f32614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2465Ij f32615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f32616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2955Vv f32617d = this;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f32618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f32619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f32620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f32621h;

    /* synthetic */ C2955Vv(com.google.android.gms.internal.ads.C2331Ev c2331Ev, android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2465Ij interfaceC2465Ij, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f32616c = c2331Ev;
        this.f32614a = context;
        this.f32615b = interfaceC2465Ij;
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A = com.google.android.gms.internal.ads.C3322bz0.a(this);
        this.f32618e = interfaceC3213az0A;
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A2 = com.google.android.gms.internal.ads.C3322bz0.a(interfaceC2465Ij);
        this.f32619f = interfaceC3213az0A2;
        com.google.android.gms.internal.ads.OO oo = new com.google.android.gms.internal.ads.OO(interfaceC3213az0A2);
        this.f32620g = oo;
        this.f32621h = com.google.android.gms.internal.ads.Zy0.c(new com.google.android.gms.internal.ads.QO(interfaceC3213az0A, oo));
    }

    @Override // com.google.android.gms.internal.ads.SO
    public final com.google.android.gms.internal.ads.HO b() {
        return new com.google.android.gms.internal.ads.C2847Sv(this.f32616c, this.f32617d, null);
    }

    @Override // com.google.android.gms.internal.ads.SO
    public final com.google.android.gms.internal.ads.PO f() {
        return (com.google.android.gms.internal.ads.PO) this.f32621h.b();
    }
}
