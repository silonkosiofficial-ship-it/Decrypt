package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5577wa implements com.google.android.gms.internal.ads.InterfaceC2967Wd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3001Xc0 f39640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4815pd0 f39641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka f39642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5467va f39643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3710fa f39644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2631Na f39645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2299Ea f39646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5357ua f39647h;

    C5577wa(com.google.android.gms.internal.ads.AbstractC3001Xc0 abstractC3001Xc0, com.google.android.gms.internal.ads.C4815pd0 c4815pd0, com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka viewOnAttachStateChangeListenerC2521Ka, com.google.android.gms.internal.ads.C5467va c5467va, com.google.android.gms.internal.ads.C3710fa c3710fa, com.google.android.gms.internal.ads.C2631Na c2631Na, com.google.android.gms.internal.ads.C2299Ea c2299Ea, com.google.android.gms.internal.ads.C5357ua c5357ua) {
        this.f39640a = abstractC3001Xc0;
        this.f39641b = c4815pd0;
        this.f39642c = viewOnAttachStateChangeListenerC2521Ka;
        this.f39643d = c5467va;
        this.f39644e = c3710fa;
        this.f39645f = c2631Na;
        this.f39646g = c2299Ea;
        this.f39647h = c5357ua;
    }

    private final java.util.Map e() {
        java.util.HashMap map = new java.util.HashMap();
        com.google.android.gms.internal.ads.AbstractC3001Xc0 abstractC3001Xc0 = this.f39640a;
        com.google.android.gms.internal.ads.Q8 q8B = this.f39641b.b();
        map.put("v", abstractC3001Xc0.d());
        map.put("gms", java.lang.Boolean.valueOf(this.f39640a.g()));
        map.put("int", q8B.a1());
        map.put("attts", java.lang.Long.valueOf(q8B.Y0().b0()));
        map.put("att", q8B.Y0().e0());
        map.put("attkid", q8B.Y0().f0());
        map.put("up", java.lang.Boolean.valueOf(this.f39643d.a()));
        map.put("t", new java.lang.Throwable());
        com.google.android.gms.internal.ads.C2299Ea c2299Ea = this.f39646g;
        if (c2299Ea != null) {
            map.put("tcq", java.lang.Long.valueOf(c2299Ea.c()));
            map.put("tpq", java.lang.Long.valueOf(this.f39646g.g()));
            map.put("tcv", java.lang.Long.valueOf(this.f39646g.d()));
            map.put("tpv", java.lang.Long.valueOf(this.f39646g.h()));
            map.put("tchv", java.lang.Long.valueOf(this.f39646g.b()));
            map.put("tphv", java.lang.Long.valueOf(this.f39646g.f()));
            map.put("tcc", java.lang.Long.valueOf(this.f39646g.a()));
            map.put("tpc", java.lang.Long.valueOf(this.f39646g.e()));
            com.google.android.gms.internal.ads.C3710fa c3710fa = this.f39644e;
            if (c3710fa != null) {
                map.put("nt", java.lang.Long.valueOf(c3710fa.a()));
            }
            com.google.android.gms.internal.ads.C2631Na c2631Na = this.f39645f;
            if (c2631Na != null) {
                map.put("vs", java.lang.Long.valueOf(c2631Na.c()));
                map.put("vf", java.lang.Long.valueOf(this.f39645f.b()));
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2967Wd0
    public final java.util.Map a() {
        com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka viewOnAttachStateChangeListenerC2521Ka = this.f39642c;
        java.util.Map mapE = e();
        mapE.put("lts", java.lang.Long.valueOf(viewOnAttachStateChangeListenerC2521Ka.a()));
        return mapE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2967Wd0
    public final java.util.Map b() {
        java.util.Map mapE = e();
        com.google.android.gms.internal.ads.Q8 q8A = this.f39641b.a();
        mapE.put("gai", java.lang.Boolean.valueOf(this.f39640a.h()));
        mapE.put("did", q8A.Z0());
        mapE.put("dst", java.lang.Integer.valueOf(q8A.N0() - 1));
        mapE.put("doo", java.lang.Boolean.valueOf(q8A.K0()));
        return mapE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2967Wd0
    public final java.util.Map c() {
        com.google.android.gms.internal.ads.C5357ua c5357ua = this.f39647h;
        java.util.Map mapE = e();
        if (c5357ua != null) {
            mapE.put("vst", c5357ua.a());
        }
        return mapE;
    }

    final void d(android.view.View view) {
        this.f39642c.d(view);
    }
}
