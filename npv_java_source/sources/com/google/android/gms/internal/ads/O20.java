package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class O20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f30430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f30431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f30432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f30433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f30434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f30435f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30436g = 0;

    public O20(android.content.Context context, java.util.concurrent.Executor executor, java.util.Set set, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f30430a = context;
        this.f30432c = executor;
        this.f30431b = set;
        this.f30433d = q90;
        this.f30434e = c3588eO;
    }

    public final P4.d a(final java.lang.Object obj, final android.os.Bundle bundle, final boolean z6) {
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(this.f30430a, 8);
        e90A.h();
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.f30431b.size());
        java.util.List arrayList2 = new java.util.ArrayList();
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.Db;
        if (!((java.lang.String) p184s3.A.c().a(abstractC5037rf)).isEmpty()) {
            arrayList2 = java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(abstractC5037rf)).split(","));
        }
        java.util.List list = arrayList2;
        this.f30435f = p174r3.v.c().c();
        final android.os.Bundle bundle2 = new android.os.Bundle();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && bundle != null) {
            bundle.putLong((obj instanceof com.google.android.gms.internal.ads.C3677fC ? com.google.android.gms.internal.ads.MN.CLIENT_SIGNALS_START : com.google.android.gms.internal.ads.MN.GMS_SIGNALS_START).e(), p174r3.v.c().a());
        }
        for (final com.google.android.gms.internal.ads.L20 l20 : this.f30431b) {
            if (!list.contains(java.lang.String.valueOf(l20.a()))) {
                final long jC = p174r3.v.c().c();
                P4.d dVarB = l20.b();
                dVarB.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.M20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29640C.b(jC, l20, bundle2);
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
                arrayList.add(dVarB);
            }
        }
        P4.d dVarA = com.google.android.gms.internal.ads.AbstractC2652Nk0.b(arrayList).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.N20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Object obj2;
                android.os.Bundle bundle3;
                java.lang.String str;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.ads.K20 k20 = (com.google.android.gms.internal.ads.K20) ((P4.d) it.next()).get();
                    if (k20 != null) {
                        boolean z10 = z6;
                        k20.c(obj2);
                        if (z10) {
                            k20.b(obj2);
                        }
                    }
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && (bundle3 = bundle) != null) {
                    android.os.Bundle bundle4 = bundle2;
                    long jA = p174r3.v.c().a();
                    if (obj2 instanceof com.google.android.gms.internal.ads.C3677fC) {
                        bundle3.putLong(com.google.android.gms.internal.ads.MN.CLIENT_SIGNALS_END.e(), jA);
                        str = "client_sig_latency_key";
                    } else {
                        bundle3.putLong(com.google.android.gms.internal.ads.MN.GMS_SIGNALS_END.e(), jA);
                        str = "gms_sig_latency_key";
                    }
                    bundle3.putBundle(str, bundle4);
                }
                return obj2;
            }
        }, this.f30432c);
        if (com.google.android.gms.internal.ads.T90.a()) {
            com.google.android.gms.internal.ads.P90.a(dVarA, this.f30433d, e90A);
        }
        return dVarA;
    }

    public final void b(long j6, com.google.android.gms.internal.ads.L20 l20, android.os.Bundle bundle) {
        long jC = p174r3.v.c().c() - j6;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2311Eg.f27098a.e()).booleanValue()) {
            p214v3.AbstractC7265q0.k("Signal runtime (ms) : " + com.google.android.gms.internal.ads.AbstractC2829Sg0.c(l20.getClass().getCanonicalName()) + " = " + jC);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25644o2)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + l20.a(), jC);
                }
            }
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25582i2)).booleanValue()) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f30434e.a();
            c3479dOA.b("action", "lat_ms");
            c3479dOA.b("lat_grp", "sig_lat_grp");
            c3479dOA.b("lat_id", java.lang.String.valueOf(l20.a()));
            c3479dOA.b("clat_ms", java.lang.String.valueOf(jC));
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25593j2)).booleanValue()) {
                synchronized (this) {
                    this.f30436g++;
                }
                c3479dOA.b("seq_num", p174r3.v.s().i().d());
                synchronized (this) {
                    try {
                        if (this.f30436g == this.f30431b.size() && this.f30435f != 0) {
                            this.f30436g = 0;
                            c3479dOA.b((l20.a() <= 39 || l20.a() >= 52) ? "lat_clsg" : "lat_gmssg", java.lang.String.valueOf(p174r3.v.c().c() - this.f30435f));
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            c3479dOA.h();
        }
    }
}
