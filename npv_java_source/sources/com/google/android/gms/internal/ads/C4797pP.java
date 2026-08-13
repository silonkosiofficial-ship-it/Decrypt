package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4797pP {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.content.Context f37991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.ref.WeakReference f37992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f37993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.Executor f37994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.Executor f37995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f37996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4906qO f37997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p224w3.a f37998m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4233kG f38000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f38001p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37986a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37987b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37988c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4512mr f37990e = new com.google.android.gms.internal.ads.C4512mr();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.util.Map f37999n = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38002q = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f37989d = p174r3.v.c().c();

    public C4797pP(java.util.concurrent.Executor executor, android.content.Context context, java.lang.ref.WeakReference weakReference, java.util.concurrent.Executor executor2, com.google.android.gms.internal.ads.SM sm, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C4906qO c4906qO, p224w3.a aVar, com.google.android.gms.internal.ads.C4233kG c4233kG, com.google.android.gms.internal.ads.T90 t90) {
        this.f37993h = sm;
        this.f37991f = context;
        this.f37992g = weakReference;
        this.f37994i = executor2;
        this.f37996k = scheduledExecutorService;
        this.f37995j = executor;
        this.f37997l = c4906qO;
        this.f37998m = aVar;
        this.f38000o = c4233kG;
        this.f38001p = t90;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void j(final com.google.android.gms.internal.ads.C4797pP c4797pP, java.lang.String str) {
        int i6 = 5;
        final com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(c4797pP.f37991f, 5);
        e90A.h();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final java.lang.String next = itKeys.next();
                final com.google.android.gms.internal.ads.E90 e90A2 = com.google.android.gms.internal.ads.D90.a(c4797pP.f37991f, i6);
                e90A2.h();
                e90A2.Z(next);
                final java.lang.Object obj = new java.lang.Object();
                final com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
                P4.d dVarO = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(c4512mr, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25450W1)).longValue(), java.util.concurrent.TimeUnit.SECONDS, c4797pP.f37996k);
                c4797pP.f37997l.c(next);
                c4797pP.f38000o.E(next);
                final long jC = p174r3.v.c().c();
                dVarO.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.bP
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34309C.q(obj, c4512mr, next, jC, e90A2);
                    }
                }, c4797pP.f37994i);
                arrayList.add(dVarO);
                final com.google.android.gms.internal.ads.BinderC4247kP binderC4247kP = new com.google.android.gms.internal.ads.BinderC4247kP(c4797pP, obj, next, jC, e90A2, c4512mr);
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        org.json.JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i10 = 0;
                        while (i10 < jSONArray.length()) {
                            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                            java.lang.String strOptString = jSONObject2.optString("format", "");
                            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            android.os.Bundle bundle = new android.os.Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                java.util.Iterator<java.lang.String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    java.lang.String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            org.json.JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new com.google.android.gms.internal.ads.C4278kk(strOptString, bundle));
                            i10++;
                            jSONArray = jSONArray2;
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
                c4797pP.v(next, false, "", 0);
                try {
                    final com.google.android.gms.internal.ads.M70 m70C = c4797pP.f37993h.c(next, new org.json.JSONObject());
                    c4797pP.f37995j.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.gP
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f35601C.n(next, binderC4247kP, m70C, arrayList2);
                        }
                    });
                } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
                    try {
                        java.lang.String str2 = "Failed to create Adapter.";
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Qc)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e6.getMessage();
                        }
                        binderC4247kP.o(str2);
                    } catch (android.os.RemoteException e10) {
                        p224w3.p.e("", e10);
                    }
                }
                i6 = 5;
            }
            com.google.android.gms.internal.ads.AbstractC2652Nk0.a(arrayList).a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.cP
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    this.f34491a.f(e90A);
                    return null;
                }
            }, c4797pP.f37994i);
        } catch (org.json.JSONException e11) {
            p214v3.AbstractC7265q0.l("Malformed CLD response", e11);
            c4797pP.f38000o.o("MalformedJson");
            c4797pP.f37997l.a("MalformedJson");
            c4797pP.f37990e.d(e11);
            p174r3.v.s().x(e11, "AdapterInitializer.updateAdapterStatus");
            com.google.android.gms.internal.ads.T90 t90 = c4797pP.f38001p;
            e90A.c(e11);
            e90A.K0(false);
            t90.b(e90A.m());
        }
    }

    private final synchronized P4.d u() {
        java.lang.String strC = p174r3.v.s().j().i().c();
        if (!android.text.TextUtils.isEmpty(strC)) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(strC);
        }
        final com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        p174r3.v.s().j().w(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.dP
            @Override // java.lang.Runnable
            public final void run() {
                this.f34706C.o(c4512mr);
            }
        });
        return c4512mr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(java.lang.String str, boolean z6, java.lang.String str2, int i6) {
        this.f37999n.put(str, new com.google.android.gms.internal.ads.C3182ak(str, z6, i6, str2));
    }

    final /* synthetic */ java.lang.Object f(com.google.android.gms.internal.ads.E90 e90) {
        this.f37990e.c(java.lang.Boolean.TRUE);
        e90.K0(true);
        this.f38001p.b(e90.m());
        return null;
    }

    public final java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f37999n.keySet()) {
            com.google.android.gms.internal.ads.C3182ak c3182ak = (com.google.android.gms.internal.ads.C3182ak) this.f37999n.get(str);
            arrayList.add(new com.google.android.gms.internal.ads.C3182ak(str, c3182ak.f34129D, c3182ak.f34130E, c3182ak.f34131F));
        }
        return arrayList;
    }

    public final void l() {
        this.f38002q = false;
    }

    final /* synthetic */ void m() {
        synchronized (this) {
            try {
                if (this.f37988c) {
                    return;
                }
                v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (p174r3.v.c().c() - this.f37989d));
                this.f37997l.b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f38000o.q("com.google.android.gms.ads.MobileAds", "timeout");
                this.f37990e.d(new java.lang.Exception());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void n(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3620ek interfaceC3620ek, com.google.android.gms.internal.ads.M70 m70, java.util.List list) {
        try {
            try {
                if (j$.util.Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    interfaceC3620ek.e();
                    return;
                }
                android.content.Context context = (android.content.Context) this.f37992g.get();
                if (context == null) {
                    context = this.f37991f;
                }
                m70.n(context, interfaceC3620ek, list);
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("", e6);
            }
        } catch (android.os.RemoteException e10) {
            throw new com.google.android.gms.internal.ads.C3045Yg0(e10);
        } catch (com.google.android.gms.internal.ads.C5315u70 unused) {
            interfaceC3620ek.o("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void o(final com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f37994i.execute(new java.lang.Runnable(this) { // from class: com.google.android.gms.internal.ads.fP
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String strC = p174r3.v.s().j().i().c();
                boolean zIsEmpty = android.text.TextUtils.isEmpty(strC);
                com.google.android.gms.internal.ads.C4512mr c4512mr2 = c4512mr;
                if (zIsEmpty) {
                    c4512mr2.d(new java.lang.Exception());
                } else {
                    c4512mr2.c(strC);
                }
            }
        });
    }

    final /* synthetic */ void p() {
        this.f37997l.e();
        this.f38000o.d();
        this.f37987b = true;
    }

    final /* synthetic */ void q(java.lang.Object obj, com.google.android.gms.internal.ads.C4512mr c4512mr, java.lang.String str, long j6, com.google.android.gms.internal.ads.E90 e90) {
        synchronized (obj) {
            try {
                if (!c4512mr.isDone()) {
                    v(str, false, "Timeout.", (int) (p174r3.v.c().c() - j6));
                    this.f37997l.b(str, "timeout");
                    this.f38000o.q(str, "timeout");
                    com.google.android.gms.internal.ads.T90 t90 = this.f38001p;
                    e90.E("Timeout");
                    e90.K0(false);
                    t90.b(e90.m());
                    c4512mr.c(java.lang.Boolean.FALSE);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2459Ig.f28487a.e()).booleanValue()) {
            if (this.f37998m.f56219E >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25439V1)).intValue() && this.f38002q) {
                if (this.f37986a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f37986a) {
                            return;
                        }
                        this.f37997l.f();
                        this.f38000o.e();
                        this.f37990e.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.hP
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f36062C.p();
                            }
                        }, this.f37994i);
                        this.f37986a = true;
                        P4.d dVarU = u();
                        this.f37996k.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.aP
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f34072C.m();
                            }
                        }, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25461X1)).longValue(), java.util.concurrent.TimeUnit.SECONDS);
                        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarU, new com.google.android.gms.internal.ads.C4137jP(this), this.f37994i);
                        return;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f37986a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f37990e.c(java.lang.Boolean.FALSE);
        this.f37986a = true;
        this.f37987b = true;
    }

    public final void s(final com.google.android.gms.internal.ads.InterfaceC3950hk interfaceC3950hk) {
        this.f37990e.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.eP
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.C4797pP c4797pP = this.f34979C;
                try {
                    interfaceC3950hk.L4(c4797pP.g());
                } catch (android.os.RemoteException e6) {
                    p224w3.p.e("", e6);
                }
            }
        }, this.f37995j);
    }

    public final boolean t() {
        return this.f37987b;
    }
}
