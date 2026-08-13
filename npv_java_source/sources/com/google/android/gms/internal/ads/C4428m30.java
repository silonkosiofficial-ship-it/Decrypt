package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4428m30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f37276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f37277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f37278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f37281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2585Lq f37282g;

    C4428m30(com.google.android.gms.internal.ads.C2585Lq c2585Lq, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, int i6, boolean z6, boolean z10) {
        this.f37282g = c2585Lq;
        this.f37276a = context;
        this.f37277b = scheduledExecutorService;
        this.f37278c = executor;
        this.f37279d = i6;
        this.f37280e = z6;
        this.f37281f = z10;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.e((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(this.f37282g.a(this.f37276a, this.f37279d)), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.k30
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f36887a.c((p144o3.a.C0676a) obj);
            }
        }, this.f37278c), ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25537e1)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f37277b), java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.l30
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f37062a.d((java.lang.Throwable) obj);
            }
        }, this.f37278c);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    final /* synthetic */ com.google.android.gms.internal.ads.C4538n30 c(p144o3.a.C0676a c0676a) {
        com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0 = new com.google.android.gms.internal.ads.C2530Ke0();
        if (!this.f37280e) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25594j3)).booleanValue()) {
                com.google.android.gms.internal.ads.C2677Oe0 c2677Oe0K = com.google.android.gms.internal.ads.C2677Oe0.k(this.f37276a);
                j$.util.Objects.requireNonNull(c0676a);
                java.lang.String strA = c0676a.a();
                j$.util.Objects.requireNonNull(strA);
                c2530Ke0 = c2677Oe0K.j(strA, this.f37276a.getPackageName(), ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25655p3)).longValue(), this.f37281f);
            } else if (this.f37280e) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25605k3)).booleanValue()) {
                    try {
                        com.google.android.gms.internal.ads.C2677Oe0 c2677Oe0K2 = com.google.android.gms.internal.ads.C2677Oe0.k(this.f37276a);
                        j$.util.Objects.requireNonNull(c0676a);
                        java.lang.String strA2 = c0676a.a();
                        j$.util.Objects.requireNonNull(strA2);
                        c2530Ke0 = c2677Oe0K2.j(strA2, this.f37276a.getPackageName(), ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25655p3)).longValue(), this.f37281f);
                    } catch (java.io.IOException | java.lang.IllegalArgumentException e6) {
                        p174r3.v.s().x(e6, "AdIdInfoSignalSource.getPaidV1");
                        c2530Ke0 = new com.google.android.gms.internal.ads.C2530Ke0();
                    }
                }
            }
        } else if (this.f37280e) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25605k3)).booleanValue()) {
                com.google.android.gms.internal.ads.C2677Oe0 c2677Oe0K3 = com.google.android.gms.internal.ads.C2677Oe0.k(this.f37276a);
                j$.util.Objects.requireNonNull(c0676a);
                java.lang.String strA3 = c0676a.a();
                j$.util.Objects.requireNonNull(strA3);
                c2530Ke0 = c2677Oe0K3.j(strA3, this.f37276a.getPackageName(), ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25655p3)).longValue(), this.f37281f);
            }
        }
        return new com.google.android.gms.internal.ads.C4538n30(c0676a, null, c2530Ke0);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C4538n30 d(java.lang.Throwable th) {
        p184s3.C7147y.b();
        android.content.ContentResolver contentResolver = this.f37276a.getContentResolver();
        return new com.google.android.gms.internal.ads.C4538n30(null, contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id"), new com.google.android.gms.internal.ads.C2530Ke0());
    }
}
