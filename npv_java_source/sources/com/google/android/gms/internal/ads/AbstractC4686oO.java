package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4686oO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final java.util.Map f37803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final android.content.Context f37804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final java.util.concurrent.Executor f37805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p224w3.v f37806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f37807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3.c f37808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f37809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f37810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f37811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f37812j;

    protected AbstractC4686oO(java.util.concurrent.Executor executor, p224w3.v vVar, C3.c cVar, android.content.Context context) {
        this.f37803a = new java.util.HashMap();
        this.f37811i = new java.util.concurrent.atomic.AtomicBoolean();
        this.f37812j = new java.util.concurrent.atomic.AtomicReference(new android.os.Bundle());
        this.f37805c = executor;
        this.f37806d = vVar;
        this.f37807e = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25549f2)).booleanValue();
        this.f37808f = cVar;
        this.f37809g = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25582i2)).booleanValue();
        this.f37810h = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25356N6)).booleanValue();
        this.f37804b = context;
    }

    private final void a(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            p224w3.p.b("Empty or null paramMap.");
            return;
        }
        if (!this.f37811i.getAndSet(true)) {
            final java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ta);
            this.f37812j.set(p214v3.AbstractC7240e.a(this.f37804b, str, new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.mO
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
                    this.f37348a.d(str, sharedPreferences, str2);
                }
            }));
        }
        android.os.Bundle bundle = (android.os.Bundle) this.f37812j.get();
        for (java.lang.String str2 : bundle.keySet()) {
            map.put(str2, java.lang.String.valueOf(bundle.get(str2)));
        }
    }

    private final void h(java.util.Map map, boolean z6) {
        if (map.isEmpty()) {
            p224w3.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final java.lang.String strA = this.f37808f.a(map);
        p214v3.AbstractC7265q0.k(strA);
        boolean z10 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("scar"));
        if (this.f37807e) {
            if (!z6 || this.f37809g) {
                if (!z10 || this.f37810h) {
                    this.f37805c.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.lO
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37171C.f37806d.o(strA);
                        }
                    });
                }
            }
        }
    }

    protected final java.lang.String b(java.util.Map map) {
        return this.f37808f.a(map);
    }

    public final j$.util.concurrent.ConcurrentHashMap c() {
        return new j$.util.concurrent.ConcurrentHashMap(this.f37803a);
    }

    final /* synthetic */ void d(java.lang.String str, android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
        this.f37812j.set(p214v3.AbstractC7240e.b(this.f37804b, str));
    }

    public final void e(java.util.Map map) {
        if (map.isEmpty()) {
            p224w3.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final java.lang.String strA = this.f37808f.a(map);
        p214v3.AbstractC7265q0.k(strA);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Yc)).booleanValue() || this.f37807e) {
            this.f37805c.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.nO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37587C.f37806d.o(strA);
                }
            });
        }
    }

    public final void f(java.util.Map map) {
        h(map, true);
    }

    public final void g(java.util.Map map) {
        h(map, false);
    }
}
