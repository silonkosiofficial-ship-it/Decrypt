package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3266bU {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f34324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.U60 f34325d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.R60 f34326e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p184s3.g2 f34327f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f34323b = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f34322a = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());

    public C3266bU(java.lang.String str) {
        this.f34324c = str;
    }

    private static java.lang.String j(com.google.android.gms.internal.ads.R60 r60) {
        return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25287H3)).booleanValue() ? r60.f31191p0 : r60.f31204w;
    }

    private final synchronized void k(com.google.android.gms.internal.ads.R60 r60, int i6) {
        java.util.Map map = this.f34323b;
        java.lang.String strJ = j(r60);
        if (map.containsKey(strJ)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> itKeys = r60.f31202v.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                bundle.putString(next, r60.f31202v.getString(next));
            } catch (org.json.JSONException unused) {
            }
        }
        p184s3.g2 g2Var = new p184s3.g2(r60.f31138E, 0L, null, bundle, r60.f31139F, r60.f31140G, r60.f31141H, r60.f31142I);
        try {
            this.f34322a.add(i6, g2Var);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            p174r3.v.s().x(e6, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f34323b.put(strJ, g2Var);
    }

    private final void l(com.google.android.gms.internal.ads.R60 r60, long j6, p184s3.W0 w6, boolean z6) {
        java.util.Map map = this.f34323b;
        java.lang.String strJ = j(r60);
        if (map.containsKey(strJ)) {
            if (this.f34326e == null) {
                this.f34326e = r60;
            }
            p184s3.g2 g2Var = (p184s3.g2) this.f34323b.get(strJ);
            g2Var.f54253D = j6;
            g2Var.f54254E = w6;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25246D6)).booleanValue() && z6) {
                this.f34327f = g2Var;
            }
        }
    }

    public final p184s3.g2 a() {
        return this.f34327f;
    }

    public final com.google.android.gms.internal.ads.BinderC5654xC b() {
        return new com.google.android.gms.internal.ads.BinderC5654xC(this.f34326e, "", this, this.f34325d, this.f34324c);
    }

    public final java.util.List c() {
        return this.f34322a;
    }

    public final void d(com.google.android.gms.internal.ads.R60 r60) {
        k(r60, this.f34322a.size());
    }

    public final void e(com.google.android.gms.internal.ads.R60 r60) {
        int iIndexOf = this.f34322a.indexOf(this.f34323b.get(j(r60)));
        if (iIndexOf < 0 || iIndexOf >= this.f34323b.size()) {
            iIndexOf = this.f34322a.indexOf(this.f34327f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.f34323b.size()) {
            return;
        }
        this.f34327f = (p184s3.g2) this.f34322a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f34322a.size()) {
                return;
            }
            p184s3.g2 g2Var = (p184s3.g2) this.f34322a.get(iIndexOf);
            g2Var.f54253D = 0L;
            g2Var.f54254E = null;
        }
    }

    public final void f(com.google.android.gms.internal.ads.R60 r60, long j6, p184s3.W0 w6) {
        l(r60, j6, w6, false);
    }

    public final void g(com.google.android.gms.internal.ads.R60 r60, long j6, p184s3.W0 w6) {
        l(r60, j6, null, true);
    }

    public final synchronized void h(java.lang.String str, java.util.List list) {
        try {
            if (this.f34323b.containsKey(str)) {
                int iIndexOf = this.f34322a.indexOf((p184s3.g2) this.f34323b.get(str));
                try {
                    this.f34322a.remove(iIndexOf);
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    p174r3.v.s().x(e6, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.f34323b.remove(str);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    k((com.google.android.gms.internal.ads.R60) it.next(), iIndexOf);
                    iIndexOf++;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void i(com.google.android.gms.internal.ads.U60 u60) {
        this.f34325d = u60;
    }
}
