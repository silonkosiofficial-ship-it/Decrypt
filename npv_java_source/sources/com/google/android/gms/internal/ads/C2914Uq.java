package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2914Uq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f32273a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p214v3.C7274v0 f32274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3022Xq f32275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.content.Context f32277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p224w3.a f32278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f32279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2346Ff f32280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.Boolean f32281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f32282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f32283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2842Sq f32284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.lang.Object f32285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private P4.d f32286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f32287o;

    public C2914Uq() {
        p214v3.C7274v0 c7274v0 = new p214v3.C7274v0();
        this.f32274b = c7274v0;
        this.f32275c = new com.google.android.gms.internal.ads.C3022Xq(p184s3.C7147y.d(), c7274v0);
        this.f32276d = false;
        this.f32280h = null;
        this.f32281i = null;
        this.f32282j = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f32283k = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f32284l = new com.google.android.gms.internal.ads.C2842Sq(null);
        this.f32285m = new java.lang.Object();
        this.f32287o = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public final void A(java.lang.String str) {
        this.f32279g = str;
    }

    public final boolean a(android.content.Context context) {
        if (V3.n.i()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25639n8)).booleanValue()) {
                return this.f32287o.get();
            }
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int b() {
        return this.f32283k.get();
    }

    public final int c() {
        return this.f32282j.get();
    }

    public final android.content.Context e() {
        return this.f32277e;
    }

    public final android.content.res.Resources f() {
        if (this.f32278f.f56220F) {
            return this.f32277e.getResources();
        }
        try {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ma)).booleanValue()) {
                return p224w3.t.a(this.f32277e).getResources();
            }
            p224w3.t.a(this.f32277e).getResources();
            return null;
        } catch (p224w3.s e6) {
            p224w3.p.h("Cannot load resource from dynamite apk or local jar", e6);
            return null;
        }
    }

    public final com.google.android.gms.internal.ads.C2346Ff h() {
        com.google.android.gms.internal.ads.C2346Ff c2346Ff;
        synchronized (this.f32273a) {
            c2346Ff = this.f32280h;
        }
        return c2346Ff;
    }

    public final com.google.android.gms.internal.ads.C3022Xq i() {
        return this.f32275c;
    }

    public final p214v3.InterfaceC7268s0 j() {
        p214v3.C7274v0 c7274v0;
        synchronized (this.f32273a) {
            c7274v0 = this.f32274b;
        }
        return c7274v0;
    }

    public final P4.d l() {
        if (this.f32277e != null) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25451W2)).booleanValue()) {
                synchronized (this.f32285m) {
                    try {
                        P4.d dVar = this.f32286n;
                        if (dVar != null) {
                            return dVar;
                        }
                        P4.d dVarH0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.Pq
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return this.f30818a.p();
                            }
                        });
                        this.f32286n = dVarH0;
                        return dVarH0;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new java.util.ArrayList());
    }

    public final java.lang.Boolean m() {
        java.lang.Boolean bool;
        synchronized (this.f32273a) {
            bool = this.f32281i;
        }
        return bool;
    }

    public final java.lang.String o() {
        return this.f32279g;
    }

    final /* synthetic */ java.util.ArrayList p() {
        android.content.Context contextA = com.google.android.gms.internal.ads.AbstractC3092Zo.a(this.f32277e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.pm.PackageInfo packageInfoF = W3.e.a(contextA).f(contextA.getApplicationInfo().packageName, 4096);
            if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                int i6 = 0;
                while (true) {
                    java.lang.String[] strArr = packageInfoF.requestedPermissions;
                    if (i6 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoF.requestedPermissionsFlags[i6] & 2) != 0) {
                        arrayList.add(strArr[i6]);
                    }
                    i6++;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void r() {
        this.f32284l.a();
    }

    public final void s() {
        this.f32282j.decrementAndGet();
    }

    public final void t() {
        this.f32283k.incrementAndGet();
    }

    public final void u() {
        this.f32282j.incrementAndGet();
    }

    public final void v(android.content.Context context, p224w3.a aVar) {
        com.google.android.gms.internal.ads.C2346Ff c2346Ff;
        synchronized (this.f32273a) {
            try {
                if (!this.f32276d) {
                    this.f32277e = context.getApplicationContext();
                    this.f32278f = aVar;
                    p174r3.v.e().c(this.f32275c);
                    this.f32274b.t(this.f32277e);
                    com.google.android.gms.internal.ads.C4396lo.d(this.f32277e, this.f32278f);
                    p174r3.v.h();
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25549f2)).booleanValue()) {
                        c2346Ff = new com.google.android.gms.internal.ads.C2346Ff();
                    } else {
                        p214v3.AbstractC7265q0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c2346Ff = null;
                    }
                    this.f32280h = c2346Ff;
                    if (c2346Ff != null) {
                        com.google.android.gms.internal.ads.AbstractC3854gr.a(new com.google.android.gms.internal.ads.C2769Qq(this).b(), "AppState.registerCsiReporter");
                    }
                    android.content.Context context2 = this.f32277e;
                    if (V3.n.i()) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25639n8)).booleanValue()) {
                            try {
                                ((android.net.ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.C2806Rq(this));
                            } catch (java.lang.RuntimeException e6) {
                                p224w3.p.h("Failed to register network callback", e6);
                                this.f32287o.set(true);
                            }
                        }
                    }
                    this.f32276d = true;
                    l();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p174r3.v.t().H(context, aVar.f56217C);
    }

    public final void w(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.C4396lo.d(this.f32277e, this.f32278f).b(th, str, ((java.lang.Double) com.google.android.gms.internal.ads.AbstractC2570Lg.f29551g.e()).floatValue());
    }

    public final void x(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.C4396lo.d(this.f32277e, this.f32278f).a(th, str);
    }

    public final void y(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.C4396lo.f(this.f32277e, this.f32278f).a(th, str);
    }

    public final void z(java.lang.Boolean bool) {
        synchronized (this.f32273a) {
            this.f32281i = bool;
        }
    }
}
