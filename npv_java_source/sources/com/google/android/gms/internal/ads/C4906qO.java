package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4906qO {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f38258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f38259f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f38255b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38256c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38257d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f38254a = p174r3.v.s().j();

    public C4906qO(java.lang.String str, com.google.android.gms.internal.ads.C4246kO c4246kO) {
        this.f38258e = str;
        this.f38259f = c4246kO;
    }

    private final java.util.Map g() {
        java.util.Map mapI = this.f38259f.i();
        mapI.put("tms", java.lang.Long.toString(p174r3.v.c().c(), 10));
        mapI.put("tid", this.f38254a.M() ? "" : this.f38258e);
        return mapI;
    }

    public final synchronized void a(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25571h2)).booleanValue()) {
            java.util.Map mapG = g();
            mapG.put("action", "aaia");
            mapG.put("aair", "MalformedJson");
            this.f38255b.add(mapG);
        }
    }

    public final synchronized void b(java.lang.String str, java.lang.String str2) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25571h2)).booleanValue()) {
            java.util.Map mapG = g();
            mapG.put("action", "adapter_init_finished");
            mapG.put("ancn", str);
            mapG.put("rqe", str2);
            this.f38255b.add(mapG);
        }
    }

    public final synchronized void c(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25571h2)).booleanValue()) {
            java.util.Map mapG = g();
            mapG.put("action", "adapter_init_started");
            mapG.put("ancn", str);
            this.f38255b.add(mapG);
        }
    }

    public final synchronized void d(java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25571h2)).booleanValue()) {
            java.util.Map mapG = g();
            mapG.put("action", "adapter_init_finished");
            mapG.put("ancn", str);
            this.f38255b.add(mapG);
        }
    }

    public final synchronized void e() {
        try {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25571h2)).booleanValue() && !this.f38257d) {
                java.util.Map mapG = g();
                mapG.put("action", "init_finished");
                this.f38255b.add(mapG);
                java.util.Iterator it = this.f38255b.iterator();
                while (it.hasNext()) {
                    this.f38259f.g((java.util.Map) it.next());
                }
                this.f38257d = true;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25571h2)).booleanValue() && !this.f38256c) {
            java.util.Map mapG = g();
            mapG.put("action", "init_started");
            this.f38255b.add(mapG);
            this.f38256c = true;
        }
    }
}
