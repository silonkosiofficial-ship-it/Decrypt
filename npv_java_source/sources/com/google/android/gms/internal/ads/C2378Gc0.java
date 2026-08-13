package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2378Gc0 implements com.google.android.gms.internal.ads.InterfaceC3935hc0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C2378Gc0 f27843i = new com.google.android.gms.internal.ads.C2378Gc0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final android.os.Handler f27844j = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static android.os.Handler f27845k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.lang.Runnable f27846l = new com.google.android.gms.internal.ads.RunnableC2304Ec0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.lang.Runnable f27847m = new com.google.android.gms.internal.ads.RunnableC2341Fc0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27849b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27855h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f27848a = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27850c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f27851d = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2193Bc0 f27853f = new com.google.android.gms.internal.ads.C2193Bc0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4153jc0 f27852e = new com.google.android.gms.internal.ads.C4153jc0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2230Cc0 f27854g = new com.google.android.gms.internal.ads.C2230Cc0(new com.google.android.gms.internal.ads.C2489Jc0());

    C2378Gc0() {
    }

    public static com.google.android.gms.internal.ads.C2378Gc0 d() {
        return f27843i;
    }

    static /* bridge */ /* synthetic */ void g(com.google.android.gms.internal.ads.C2378Gc0 c2378Gc0) {
        c2378Gc0.f27849b = 0;
        c2378Gc0.f27851d.clear();
        c2378Gc0.f27850c = false;
        for (com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0 : com.google.android.gms.internal.ads.C2963Wb0.a().b()) {
        }
        c2378Gc0.f27855h = java.lang.System.nanoTime();
        c2378Gc0.f27853f.i();
        long jNanoTime = java.lang.System.nanoTime();
        com.google.android.gms.internal.ads.InterfaceC4045ic0 interfaceC4045ic0A = c2378Gc0.f27852e.a();
        if (c2378Gc0.f27853f.e().size() > 0) {
            for (java.lang.String str : c2378Gc0.f27853f.e()) {
                org.json.JSONObject jSONObjectA = interfaceC4045ic0A.a(null);
                android.view.View viewA = c2378Gc0.f27853f.a(str);
                com.google.android.gms.internal.ads.InterfaceC4045ic0 interfaceC4045ic0B = c2378Gc0.f27852e.b();
                java.lang.String strC = c2378Gc0.f27853f.c(str);
                if (strC != null) {
                    org.json.JSONObject jSONObjectA2 = interfaceC4045ic0B.a(viewA);
                    com.google.android.gms.internal.ads.AbstractC5252tc0.b(jSONObjectA2, str);
                    try {
                        jSONObjectA2.put("notVisibleReason", strC);
                    } catch (org.json.JSONException e6) {
                        com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error with setting not visible reason", e6);
                    }
                    com.google.android.gms.internal.ads.AbstractC5252tc0.c(jSONObjectA, jSONObjectA2);
                }
                com.google.android.gms.internal.ads.AbstractC5252tc0.f(jSONObjectA);
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(str);
                c2378Gc0.f27854g.c(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (c2378Gc0.f27853f.f().size() > 0) {
            org.json.JSONObject jSONObjectA3 = interfaceC4045ic0A.a(null);
            c2378Gc0.k(null, interfaceC4045ic0A, jSONObjectA3, 1, false);
            com.google.android.gms.internal.ads.AbstractC5252tc0.f(jSONObjectA3);
            c2378Gc0.f27854g.d(jSONObjectA3, c2378Gc0.f27853f.f(), jNanoTime);
        } else {
            c2378Gc0.f27854g.b();
        }
        c2378Gc0.f27853f.g();
        long jNanoTime2 = java.lang.System.nanoTime() - c2378Gc0.f27855h;
        if (c2378Gc0.f27848a.size() > 0) {
            java.util.Iterator it = c2378Gc0.f27848a.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        com.google.android.gms.internal.ads.C3825gc0.a().c();
    }

    private final void k(android.view.View view, com.google.android.gms.internal.ads.InterfaceC4045ic0 interfaceC4045ic0, org.json.JSONObject jSONObject, int i6, boolean z6) {
        interfaceC4045ic0.b(view, jSONObject, this, i6 == 1, z6);
    }

    private static final void l() {
        android.os.Handler handler = f27845k;
        if (handler != null) {
            handler.removeCallbacks(f27847m);
            f27845k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3935hc0
    public final void a(android.view.View view, com.google.android.gms.internal.ads.InterfaceC4045ic0 interfaceC4045ic0, org.json.JSONObject jSONObject, boolean z6) {
        int iL;
        boolean z10;
        if (com.google.android.gms.internal.ads.AbstractC5802yc0.a(view) != null || (iL = this.f27853f.l(view)) == 3) {
            return;
        }
        org.json.JSONObject jSONObjectA = interfaceC4045ic0.a(view);
        com.google.android.gms.internal.ads.AbstractC5252tc0.c(jSONObject, jSONObjectA);
        java.lang.String strD = this.f27853f.d(view);
        if (strD != null) {
            com.google.android.gms.internal.ads.AbstractC5252tc0.b(jSONObjectA, strD);
            try {
                jSONObjectA.put("hasWindowFocus", java.lang.Boolean.valueOf(this.f27853f.k(view)));
            } catch (org.json.JSONException e6) {
                com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error with setting has window focus", e6);
            }
            boolean zJ = this.f27853f.j(strD);
            java.lang.Object objValueOf = java.lang.Boolean.valueOf(zJ);
            if (zJ) {
                try {
                    jSONObjectA.put("isPipActive", objValueOf);
                } catch (org.json.JSONException e10) {
                    com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error with setting is picture-in-picture active", e10);
                }
            }
            this.f27853f.h();
        } else {
            com.google.android.gms.internal.ads.C5912zc0 c5912zc0B = this.f27853f.b(view);
            if (c5912zc0B != null) {
                com.google.android.gms.internal.ads.C3071Zb0 c3071Zb0A = c5912zc0B.a();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.ArrayList arrayListB = c5912zc0B.b();
                int size = arrayListB.size();
                for (int i6 = 0; i6 < size; i6++) {
                    jSONArray.put((java.lang.String) arrayListB.get(i6));
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", c3071Zb0A.d());
                    jSONObjectA.put("friendlyObstructionPurpose", c3071Zb0A.a());
                    jSONObjectA.put("friendlyObstructionReason", c3071Zb0A.c());
                } catch (org.json.JSONException e11) {
                    com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error with setting friendly obstruction", e11);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            k(view, interfaceC4045ic0, jSONObjectA, iL, z6 || z10);
        }
        this.f27849b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (f27845k == null) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            f27845k = handler;
            handler.post(f27846l);
            f27845k.postDelayed(f27847m, 200L);
        }
    }

    public final void j() {
        l();
        this.f27848a.clear();
        f27844j.post(new com.google.android.gms.internal.ads.RunnableC2267Dc0(this));
    }
}
