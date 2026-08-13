package B3;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f646a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f647b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f650e;

    l0(android.content.Context context, com.google.android.gms.internal.ads.C4246kO c4246kO, java.util.concurrent.ExecutorService executorService) {
        this.f648c = context;
        this.f649d = c4246kO;
        this.f650e = executorService;
    }

    private final void h(final boolean z6) {
        java.util.Map map = this.f647b;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        this.f647b.put(boolValueOf, new java.util.ArrayList());
        this.f650e.submit(new java.lang.Runnable() { // from class: B3.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f639C.c(z6);
            }
        });
    }

    private final void i(B3.n0 n0Var, android.util.Pair pair, boolean z6) {
        n0Var.d();
        D3.a aVarB = n0Var.b();
        if (aVarB != null) {
            ((D3.b) pair.first).b(aVarB);
        } else {
            ((D3.b) pair.first).a(n0Var.c());
        }
        B3.AbstractC0797c.d(this.f649d, null, "sgpcr", new android.util.Pair("se", "query_g"), new android.util.Pair("ad_format", p104k3.EnumC6886c.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", "true"), new android.util.Pair("lat_ms", java.lang.Long.toString(p174r3.v.c().a() - ((java.lang.Long) pair.second).longValue())), new android.util.Pair("sgpc_h", java.lang.Boolean.toString(z6)), new android.util.Pair("sgpc_rs", java.lang.Boolean.toString(n0Var.b() != null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(boolean z6, boolean z10) {
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z6);
            java.util.Map map = this.f646a;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
            B3.n0 n0Var = (B3.n0) map.get(boolValueOf);
            int iA = 0;
            if (z10 && n0Var != null) {
                iA = n0Var.a() + 1;
            }
            int i6 = iA;
            B3.n0 n0Var2 = (B3.n0) this.f646a.get(boolValueOf);
            final B3.m0 m0Var = new B3.m0(this, z6, i6, n0Var2 == null ? null : java.lang.Boolean.valueOf(n0Var2.f()), this.f649d);
            final p104k3.g gVarG = ((k3.g.a) new k3.g.a().b(com.google.ads.mediation.admob.AdMobAdapter.class, bundle)).g();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Wa)).booleanValue()) {
                this.f650e.submit(new java.util.concurrent.Callable() { // from class: B3.k0
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.f642a.a(gVarG, m0Var);
                    }
                });
            } else {
                D3.a.a(this.f648c, p104k3.EnumC6886c.BANNER, gVarG, m0Var);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ java.lang.Object a(p104k3.g gVar, B3.m0 m0Var) {
        D3.a.a(this.f648c, p104k3.EnumC6886c.BANNER, gVar, m0Var);
        return java.lang.Boolean.TRUE;
    }

    public final synchronized void b() {
        h(true);
        h(false);
    }

    final /* synthetic */ void c(boolean z6) {
        d(z6, false);
    }

    final /* synthetic */ void e(java.lang.Object obj, android.util.Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof android.webkit.WebView) {
            android.webkit.CookieManager cookieManagerA = p174r3.v.u().a(this.f648c);
            if (cookieManagerA != null) {
                zAcceptThirdPartyCookies = cookieManagerA.acceptThirdPartyCookies((android.webkit.WebView) obj);
            }
        }
        java.util.Map map = this.f646a;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zAcceptThirdPartyCookies);
        B3.n0 n0Var = (B3.n0) map.get(boolValueOf);
        if (n0Var != null && !n0Var.e()) {
            i(n0Var, pair, true);
            return;
        }
        java.util.List arrayList = (java.util.List) this.f647b.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f647b.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    final synchronized void f(final boolean z6, B3.n0 n0Var) {
        try {
            java.util.Map map = this.f646a;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
            B3.n0 n0Var2 = (B3.n0) map.get(boolValueOf);
            if (n0Var2 == null || n0Var2.e() || n0Var2.b() == null || n0Var.b() != null) {
                this.f646a.put(boolValueOf, n0Var);
            }
            long jLongValue = ((java.lang.Long) (n0Var.b() != null ? com.google.android.gms.internal.ads.AbstractC2422Hg.f28092d.e() : com.google.android.gms.internal.ads.AbstractC2422Hg.f28093e.e())).longValue();
            final boolean z10 = n0Var.b() == null;
            com.google.android.gms.internal.ads.AbstractC3524dr.f34798d.schedule(new java.lang.Runnable() { // from class: B3.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f633C.d(z6, z10);
                }
            }, jLongValue, java.util.concurrent.TimeUnit.SECONDS);
            java.util.List list = (java.util.List) this.f647b.get(boolValueOf);
            this.f647b.put(boolValueOf, new java.util.ArrayList());
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    i(n0Var, (android.util.Pair) it.next(), false);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(final java.lang.Object obj, D3.b bVar) {
        final android.util.Pair pair = new android.util.Pair(bVar, java.lang.Long.valueOf(p174r3.v.c().a()));
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: B3.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f628C.e(obj, pair);
            }
        });
    }
}
