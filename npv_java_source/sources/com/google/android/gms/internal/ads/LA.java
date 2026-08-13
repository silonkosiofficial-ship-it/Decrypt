package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3482dR f29416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f29417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5429v90 f29418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3028Xw f29419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3158aW f29420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5110sF f29421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3558e70 f29422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.NR f29423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3787gC f29424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.Executor f29425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5678xR f29426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f29427l;

    LA(com.google.android.gms.internal.ads.C3482dR c3482dR, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C5429v90 c5429v90, com.google.android.gms.internal.ads.C3028Xw c3028Xw, com.google.android.gms.internal.ads.C3158aW c3158aW, com.google.android.gms.internal.ads.C5110sF c5110sF, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.NR nr, com.google.android.gms.internal.ads.C3787gC c3787gC, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C5678xR c5678xR, com.google.android.gms.internal.ads.C3266bU c3266bU) {
        this.f29416a = c3482dR;
        this.f29417b = c4546n70;
        this.f29418c = c5429v90;
        this.f29419d = c3028Xw;
        this.f29420e = c3158aW;
        this.f29421f = c5110sF;
        this.f29422g = c3558e70;
        this.f29423h = nr;
        this.f29424i = c3787gC;
        this.f29425j = executor;
        this.f29426k = c5678xR;
        this.f29427l = c3266bU;
    }

    public final p184s3.W0 a(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.P70.b(th, this.f29427l);
    }

    public final com.google.android.gms.internal.ads.C5110sF c() {
        return this.f29421f;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C3558e70 d(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        this.f29419d.a(c3558e70);
        return c3558e70;
    }

    public final P4.d e(final com.google.android.gms.internal.ads.C4108j80 c4108j80) {
        com.google.android.gms.internal.ads.C3124a90 c3124a90A = this.f29418c.b(com.google.android.gms.internal.ads.EnumC4770p90.GET_CACHE_KEY, this.f29424i.c()).f(new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.GA
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f27705a.f(c4108j80, (com.google.android.gms.internal.ads.C2730Po) obj);
            }
        }).a();
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(c3124a90A, new com.google.android.gms.internal.ads.JA(this), this.f29425j);
        return c3124a90A;
    }

    final /* synthetic */ P4.d f(com.google.android.gms.internal.ads.C4108j80 c4108j80, com.google.android.gms.internal.ads.C2730Po c2730Po) {
        c2730Po.f30801K = c4108j80;
        return this.f29423h.a(c2730Po);
    }

    public final P4.d g(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        com.google.android.gms.internal.ads.C3124a90 c3124a90A = this.f29418c.b(com.google.android.gms.internal.ads.EnumC4770p90.NOTIFY_CACHE_HIT, this.f29423h.f(c2730Po)).a();
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(c3124a90A, new com.google.android.gms.internal.ads.KA(this), this.f29425j);
        return c3124a90A;
    }

    public final P4.d h(P4.d dVar) {
        com.google.android.gms.internal.ads.C4330l90 c4330l90F = this.f29418c.b(com.google.android.gms.internal.ads.EnumC4770p90.RENDERER, dVar).e(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.FA
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.C3558e70 c3558e70 = (com.google.android.gms.internal.ads.C3558e70) obj;
                this.f27316a.d(c3558e70);
                return c3558e70;
            }
        }).f(this.f29420e);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25737x5)).booleanValue()) {
            c4330l90F = c4330l90F.i(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25747y5)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
        }
        return c4330l90F.a();
    }

    public final P4.d i() {
        p184s3.X1 x6 = this.f29417b.f37511d;
        if (x6.f54175Z == null && x6.f54170U == null) {
            return j(this.f29424i.c());
        }
        com.google.android.gms.internal.ads.C5429v90 c5429v90 = this.f29418c;
        com.google.android.gms.internal.ads.C3482dR c3482dR = this.f29416a;
        return com.google.android.gms.internal.ads.AbstractC3562e90.c(c3482dR.a(), com.google.android.gms.internal.ads.EnumC4770p90.PRELOADED_LOADER, c5429v90).a();
    }

    public final P4.d j(P4.d dVar) {
        com.google.android.gms.internal.ads.C4330l90 c4330l90F;
        com.google.android.gms.internal.ads.C3558e70 c3558e70 = this.f29422g;
        if (c3558e70 != null) {
            com.google.android.gms.internal.ads.C5429v90 c5429v90 = this.f29418c;
            c4330l90F = com.google.android.gms.internal.ads.AbstractC3562e90.c(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c3558e70), com.google.android.gms.internal.ads.EnumC4770p90.SERVER_TRANSACTION, c5429v90);
        } else {
            p174r3.v.f().j();
            com.google.android.gms.internal.ads.C4330l90 c4330l90B = this.f29418c.b(com.google.android.gms.internal.ads.EnumC4770p90.SERVER_TRANSACTION, dVar);
            final com.google.android.gms.internal.ads.C5678xR c5678xR = this.f29426k;
            j$.util.Objects.requireNonNull(c5678xR);
            c4330l90F = c4330l90B.f(new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.IA
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    return c5678xR.a((com.google.android.gms.internal.ads.C2730Po) obj);
                }
            });
        }
        return c4330l90F.a();
    }

    public final void k(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        this.f29422g = c3558e70;
    }
}
