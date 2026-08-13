package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3158aW implements com.google.android.gms.internal.ads.InterfaceC5268tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5429v90 f34091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.GC f34092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2337Fa0 f34093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f34094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f34095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f34096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4111jA f34097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f34098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f34099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.content.Context f34100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f34101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.DV f34102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f34103m;

    C3158aW(android.content.Context context, com.google.android.gms.internal.ads.C5429v90 c5429v90, com.google.android.gms.internal.ads.TV tv, com.google.android.gms.internal.ads.GC gc, com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.InterfaceC4111jA interfaceC4111jA, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C3266bU c3266bU, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.DV dv, com.google.android.gms.internal.ads.YN yn) {
        this.f34100j = context;
        this.f34091a = c5429v90;
        this.f34098h = tv;
        this.f34092b = gc;
        this.f34093c = c2337Fa0;
        this.f34094d = c2559La0;
        this.f34097g = interfaceC4111jA;
        this.f34095e = executor;
        this.f34096f = scheduledExecutorService;
        this.f34099i = c3266bU;
        this.f34101k = q90;
        this.f34102l = dv;
        this.f34103m = yn;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    static java.lang.String d(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        java.lang.String str = "No fill.";
        java.lang.String str2 = true != ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25727w5)).booleanValue() ? "No ad config." : "No fill.";
        int i6 = c3558e70.f34899b.f34448b.f32118f;
        if (i6 == 0) {
            str = str2;
        } else if (i6 >= 200 && i6 < 300) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25717v5)).booleanValue()) {
                str = str2;
            }
        } else if (i6 < 300 || i6 >= 400) {
            str = "Received error HTTP response code: " + i6;
        } else {
            str = "No location header to follow redirect or too many redirects.";
        }
        com.google.android.gms.internal.ads.T60 t60 = c3558e70.f34899b.f34448b.f32122j;
        return t60 != null ? t60.a() : str;
    }

    final /* synthetic */ P4.d a(com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.VT vt, java.lang.Throwable th) {
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(this.f34100j, 12);
        e90A.Z(r60.f31138E);
        e90A.h();
        P4.d dVarO = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(vt.b(c3558e70, r60), r60.f31151R, java.util.concurrent.TimeUnit.MILLISECONDS, this.f34096f);
        this.f34098h.f(c3558e70, r60, dVarO, this.f34093c);
        com.google.android.gms.internal.ads.P90.a(dVarO, this.f34101k, e90A);
        return dVarO;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
    public final /* synthetic */ P4.d b(java.lang.Object obj) {
        java.util.Iterator it;
        com.google.android.gms.internal.ads.VT vtF;
        int i6;
        com.google.android.gms.internal.ads.C2730Po c2730Po;
        android.os.Bundle bundle;
        final com.google.android.gms.internal.ads.C3558e70 c3558e70 = (com.google.android.gms.internal.ads.C3558e70) obj;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && (c2730Po = c3558e70.f34899b.f34450d) != null && (bundle = c2730Po.f30805O) != null) {
            this.f34103m.a().putAll(bundle);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25614l2)).booleanValue()) {
            this.f34103m.a().putLong(com.google.android.gms.internal.ads.MN.RENDERING_START.e(), p174r3.v.c().a());
        }
        java.lang.String strD = d(c3558e70);
        this.f34099i.i(c3558e70.f34899b.f34448b);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25587i8)).booleanValue() && (i6 = c3558e70.f34899b.f34448b.f32118f) != 0 && (i6 < 200 || i6 >= 300)) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(3, strD));
        }
        com.google.android.gms.internal.ads.U60 u60 = c3558e70.f34899b.f34448b;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25287H3)).booleanValue()) {
            for (com.google.android.gms.internal.ads.R60 r60 : c3558e70.f34899b.f34447a) {
                this.f34099i.d(r60);
                it = r60.f31160a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        this.f34099i.f(r60, 0L, com.google.android.gms.internal.ads.P70.d(1, null, null));
                        break;
                        break;
                    }
                    vtF = this.f34097g.f(r60.f31162b, (java.lang.String) it.next());
                    if (vtF == null) {
                    }
                }
            }
        } else {
            java.lang.String str = u60.f32129q;
            if (android.text.TextUtils.isEmpty(str)) {
                while (r0.hasNext()) {
                    this.f34099i.d(r60);
                    it = r60.f31160a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            this.f34099i.f(r60, 0L, com.google.android.gms.internal.ads.P70.d(1, null, null));
                            break;
                        }
                        vtF = this.f34097g.f(r60.f31162b, (java.lang.String) it.next());
                        if (vtF == null && vtF.a(c3558e70, r60)) {
                            break;
                        }
                    }
                }
            } else {
                this.f34099i.h(str, c3558e70.f34899b.f34447a);
            }
        }
        this.f34092b.F0(new com.google.android.gms.internal.ads.C2739Px(c3558e70, this.f34094d, this.f34093c), this.f34095e);
        if (c3558e70.f34899b.f34448b.f32130r > 1) {
            return this.f34102l.b(c3558e70);
        }
        com.google.android.gms.internal.ads.C3124a90 c3124a90A = com.google.android.gms.internal.ads.AbstractC3562e90.c(com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.XV(3, d(c3558e70))), com.google.android.gms.internal.ads.EnumC4770p90.RENDER_CONFIG_INIT, this.f34091a).a();
        this.f34098h.l();
        int i10 = 0;
        for (final com.google.android.gms.internal.ads.R60 r61 : c3558e70.f34899b.f34447a) {
            for (java.lang.String str2 : r61.f31160a) {
                final com.google.android.gms.internal.ads.VT vtF2 = this.f34097g.f(r61.f31162b, str2);
                if (vtF2 != null && vtF2.a(c3558e70, r61)) {
                    c3124a90A = this.f34091a.b(com.google.android.gms.internal.ads.EnumC4770p90.RENDER_CONFIG_WATERFALL, c3124a90A).h("render-config-" + i10 + "-" + str2).c(java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.YV
                        @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                        public final P4.d b(java.lang.Object obj2) {
                            return this.f33360a.a(r61, c3558e70, vtF2, (java.lang.Throwable) obj2);
                        }
                    }).a();
                    break;
                }
            }
            i10++;
        }
        final com.google.android.gms.internal.ads.TV tv = this.f34098h;
        j$.util.Objects.requireNonNull(tv);
        c3124a90A.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ZV
            @Override // java.lang.Runnable
            public final void run() {
                tv.j();
            }
        }, this.f34095e);
        return c3124a90A;
    }
}
