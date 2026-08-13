package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class WQ implements com.google.android.gms.internal.ads.InterfaceC5898zR {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.regex.Pattern f32740h = java.util.regex.Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5677xQ f32741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f32742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f32743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f32744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.DS f32745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f32746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.content.Context f32747g;

    WQ(android.content.Context context, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C5677xQ c5677xQ, com.google.android.gms.internal.ads.Yk0 yk0, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.DS ds, com.google.android.gms.internal.ads.Q90 q90) {
        this.f32747g = context;
        this.f32743c = c4546n70;
        this.f32741a = c5677xQ;
        this.f32742b = yk0;
        this.f32744d = scheduledExecutorService;
        this.f32745e = ds;
        this.f32746f = q90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5898zR
    public final P4.d a(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        android.content.Context context = this.f32747g;
        P4.d dVarC = this.f32741a.c(c2730Po);
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(context, 11);
        com.google.android.gms.internal.ads.P90.d(dVarC, e90A);
        P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(dVarC, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.TQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f31936a.c((com.google.android.gms.internal.ads.BR) obj);
            }
        }, this.f32742b);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25737x5)).booleanValue()) {
            dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.f(com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarN, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25747y5)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.f32744d), java.util.concurrent.TimeoutException.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.UQ
                @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                public final P4.d b(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.C4688oQ(5));
                }
            }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        }
        com.google.android.gms.internal.ads.P90.a(dVarN, this.f32746f, e90A);
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarN, new com.google.android.gms.internal.ads.VQ(this), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        return dVarN;
    }

    final /* synthetic */ P4.d c(com.google.android.gms.internal.ads.BR br) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C3558e70(new com.google.android.gms.internal.ads.C3120a70(this.f32743c), com.google.android.gms.internal.ads.C3339c70.a(new java.io.InputStreamReader(br.b()), br.a())));
    }
}
