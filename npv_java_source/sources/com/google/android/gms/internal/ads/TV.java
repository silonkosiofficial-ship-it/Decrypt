package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class TV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V3.f f31945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.VV f31946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f31947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.LinkedHashMap f31948d = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31949e = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25279G6)).booleanValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3266bU f31950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f31952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f31953i;

    public TV(V3.f fVar, com.google.android.gms.internal.ads.VV vv, com.google.android.gms.internal.ads.C3266bU c3266bU, com.google.android.gms.internal.ads.C2559La0 c2559La0) {
        this.f31945a = fVar;
        this.f31946b = vv;
        this.f31950f = c3266bU;
        this.f31947c = c2559La0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean q(com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.SV sv = (com.google.android.gms.internal.ads.SV) this.f31948d.get(r60);
        if (sv == null) {
            return false;
        }
        return sv.f31706c == 8;
    }

    public final synchronized long a() {
        return this.f31952h;
    }

    final synchronized P4.d f(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, P4.d dVar, com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0) {
        com.google.android.gms.internal.ads.U60 u60 = c3558e70.f34899b.f34448b;
        long jC = this.f31945a.c();
        java.lang.String str = r60.f31204w;
        if (str != null) {
            this.f31948d.put(r60, new com.google.android.gms.internal.ads.SV(str, r60.f31171f0, 9, 0L, null));
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVar, new com.google.android.gms.internal.ads.RV(this, jC, u60, r60, str, c2337Fa0, c3558e70), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        }
        return dVar;
    }

    public final synchronized java.lang.String g() {
        java.util.ArrayList arrayList;
        try {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f31948d.entrySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.SV sv = (com.google.android.gms.internal.ads.SV) ((java.util.Map.Entry) it.next()).getValue();
                if (sv.f31706c != Integer.MAX_VALUE) {
                    arrayList.add(sv.toString());
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return android.text.TextUtils.join("_", arrayList);
    }

    public final synchronized void i(com.google.android.gms.internal.ads.R60 r60) {
        try {
            this.f31952h = this.f31945a.c() - this.f31953i;
            if (r60 != null) {
                this.f31950f.e(r60);
            }
            this.f31951g = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.f31952h = this.f31945a.c() - this.f31953i;
    }

    public final synchronized void k(java.util.List list) {
        this.f31953i = this.f31945a.c();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.R60 r60 = (com.google.android.gms.internal.ads.R60) it.next();
            if (!android.text.TextUtils.isEmpty(r60.f31204w)) {
                this.f31948d.put(r60, new com.google.android.gms.internal.ads.SV(r60.f31204w, r60.f31171f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.f31953i = this.f31945a.c();
    }

    public final synchronized void m(com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.SV sv = (com.google.android.gms.internal.ads.SV) this.f31948d.get(r60);
        if (sv == null || this.f31951g) {
            return;
        }
        sv.f31706c = 8;
    }
}
