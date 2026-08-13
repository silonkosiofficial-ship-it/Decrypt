package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4815pd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f38032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f38033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2929Vc0 f38034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3001Xc0 f38035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4705od0 f38036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4705od0 f38037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p115l4.AbstractC6931l f38038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p115l4.AbstractC6931l f38039h;

    C4815pd0(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0, com.google.android.gms.internal.ads.AbstractC3001Xc0 abstractC3001Xc0, com.google.android.gms.internal.ads.C4375ld0 c4375ld0, com.google.android.gms.internal.ads.C4485md0 c4485md0) {
        this.f38032a = context;
        this.f38033b = executor;
        this.f38034c = c2929Vc0;
        this.f38035d = abstractC3001Xc0;
        this.f38036e = c4375ld0;
        this.f38037f = c4485md0;
    }

    public static com.google.android.gms.internal.ads.C4815pd0 e(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0, com.google.android.gms.internal.ads.AbstractC3001Xc0 abstractC3001Xc0) {
        final com.google.android.gms.internal.ads.C4815pd0 c4815pd0 = new com.google.android.gms.internal.ads.C4815pd0(context, executor, c2929Vc0, abstractC3001Xc0, new com.google.android.gms.internal.ads.C4375ld0(), new com.google.android.gms.internal.ads.C4485md0());
        c4815pd0.f38038g = c4815pd0.f38035d.h() ? c4815pd0.h(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.id0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f36323a.c();
            }
        }) : p115l4.AbstractC6934o.e(c4815pd0.f38036e.a());
        c4815pd0.f38039h = c4815pd0.h(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.jd0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f36709a.d();
            }
        });
        return c4815pd0;
    }

    private static com.google.android.gms.internal.ads.Q8 g(p115l4.AbstractC6931l abstractC6931l, com.google.android.gms.internal.ads.Q8 q10) {
        return !abstractC6931l.o() ? q10 : (com.google.android.gms.internal.ads.Q8) abstractC6931l.l();
    }

    private final p115l4.AbstractC6931l h(java.util.concurrent.Callable callable) {
        return p115l4.AbstractC6934o.c(this.f38033b, callable).d(this.f38033b, new p115l4.InterfaceC6926g() { // from class: com.google.android.gms.internal.ads.kd0
            @Override // p115l4.InterfaceC6926g
            public final void d(java.lang.Exception exc) {
                this.f36994a.f(exc);
            }
        });
    }

    public final com.google.android.gms.internal.ads.Q8 a() {
        return g(this.f38038g, this.f38036e.a());
    }

    public final com.google.android.gms.internal.ads.Q8 b() {
        return g(this.f38039h, this.f38037f.a());
    }

    final /* synthetic */ com.google.android.gms.internal.ads.Q8 c() {
        com.google.android.gms.internal.ads.C5316u8 c5316u8B0 = com.google.android.gms.internal.ads.Q8.B0();
        p144o3.a.C0676a c0676aA = p144o3.a.a(this.f38032a);
        java.lang.String strA = c0676aA.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            java.util.UUID uuidFromString = java.util.UUID.fromString(strA);
            byte[] bArr = new byte[16];
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strA = android.util.Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            c5316u8B0.D0(strA);
            c5316u8B0.C0(c0676aA.b());
            c5316u8B0.f0(6);
        }
        return (com.google.android.gms.internal.ads.Q8) c5316u8B0.u();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.Q8 d() throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.Context context = this.f38032a;
        return com.google.android.gms.internal.ads.AbstractC3498dd0.a(context, context.getPackageName(), java.lang.Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(java.lang.Exception exc) {
        if (exc instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
        this.f38034c.c(2025, -1L, exc);
    }
}
