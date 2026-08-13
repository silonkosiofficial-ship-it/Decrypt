package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2591Lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f29597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f29598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RT f29599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.HM f29600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f29601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.Executor f29602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f29603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC4616no f29604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC4616no f29605i;

    C2591Lx(android.content.Context context, p214v3.InterfaceC7268s0 interfaceC7268s0, com.google.android.gms.internal.ads.RT rt, com.google.android.gms.internal.ads.HM hm, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.Yk0 yk1, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f29597a = context;
        this.f29598b = interfaceC7268s0;
        this.f29599c = rt;
        this.f29600d = hm;
        this.f29601e = yk0;
        this.f29602f = yk1;
        this.f29603g = scheduledExecutorService;
    }

    public static boolean j(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((java.lang.CharSequence) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25512ba));
    }

    private final P4.d k(final java.lang.String str, final android.view.InputEvent inputEvent, java.util.Random random) {
        try {
            if (!str.contains((java.lang.CharSequence) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25512ba)) || this.f29598b.M()) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(str);
            }
            final android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25523ca), java.lang.String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.f((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(this.f29599c.a()), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.Fx
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        return this.f27590a.d(builderBuildUpon, str, inputEvent, (java.lang.Integer) obj);
                    }
                }, this.f29602f), java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.Gx
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        return this.f27922a.e(builderBuildUpon, (java.lang.Throwable) obj);
                    }
                }, this.f29601e);
            }
            builderBuildUpon.appendQueryParameter((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25534da), "11");
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(builderBuildUpon.toString());
        } catch (java.lang.Exception e6) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(e6);
        }
    }

    public final P4.d b(final java.lang.String str, java.util.Random random) {
        return android.text.TextUtils.isEmpty(str) ? com.google.android.gms.internal.ads.AbstractC2652Nk0.h(str) : com.google.android.gms.internal.ads.AbstractC2652Nk0.f(k(str, this.f29600d.a(), random), java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.Cx
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f26539a.c(str, (java.lang.Throwable) obj);
            }
        }, this.f29601e);
    }

    final /* synthetic */ P4.d c(java.lang.String str, final java.lang.Throwable th) {
        this.f29601e.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Ex
            @Override // java.lang.Runnable
            public final void run() {
                this.f27256C.g(th);
            }
        });
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(str);
    }

    final /* synthetic */ P4.d d(final android.net.Uri.Builder builder, java.lang.String str, android.view.InputEvent inputEvent, java.lang.Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25534da), "10");
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(builder.toString());
        }
        android.net.Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25545ea), "1");
        builderBuildUpon.appendQueryParameter((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25534da), "12");
        if (str.contains((java.lang.CharSequence) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25556fa))) {
            builderBuildUpon.authority((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25567ga));
        }
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(this.f29599c.b(builderBuildUpon.build(), inputEvent)), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.Hx
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                java.lang.String str2 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25534da);
                android.net.Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(builder2.toString());
            }
        }, this.f29602f);
    }

    final /* synthetic */ P4.d e(android.net.Uri.Builder builder, final java.lang.Throwable th) {
        this.f29601e.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Dx
            @Override // java.lang.Runnable
            public final void run() {
                this.f26819C.h(th);
            }
        });
        builder.appendQueryParameter((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25534da), "9");
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(builder.toString());
    }

    final /* synthetic */ void g(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.InterfaceC4616no interfaceC4616noC;
        java.lang.String str;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25589ia)).booleanValue()) {
            interfaceC4616noC = com.google.android.gms.internal.ads.C4396lo.e(this.f29597a);
            this.f29605i = interfaceC4616noC;
            str = "AttributionReporting.getUpdatedUrlAndRegisterSource";
        } else {
            interfaceC4616noC = com.google.android.gms.internal.ads.C4396lo.c(this.f29597a);
            this.f29604h = interfaceC4616noC;
            str = "AttributionReportingSampled.getUpdatedUrlAndRegisterSource";
        }
        interfaceC4616noC.a(th, str);
    }

    final /* synthetic */ void h(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.InterfaceC4616no interfaceC4616noC;
        java.lang.String str;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25589ia)).booleanValue()) {
            interfaceC4616noC = com.google.android.gms.internal.ads.C4396lo.e(this.f29597a);
            this.f29605i = interfaceC4616noC;
            str = "AttributionReporting";
        } else {
            interfaceC4616noC = com.google.android.gms.internal.ads.C4396lo.c(this.f29597a);
            this.f29604h = interfaceC4616noC;
            str = "AttributionReportingSampled";
        }
        interfaceC4616noC.a(th, str);
    }

    public final void i(java.lang.String str, com.google.android.gms.internal.ads.C2559La0 c2559La0, java.util.Random random, p224w3.w wVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2652Nk0.o(k(str, this.f29600d.a(), random), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25578ha)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f29603g), new com.google.android.gms.internal.ads.C2555Kx(this, c2559La0, str, wVar), this.f29601e);
    }
}
