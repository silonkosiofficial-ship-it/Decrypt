package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5786yP implements com.google.android.gms.internal.ads.HC, com.google.android.gms.internal.ads.InterfaceC3571eE, com.google.android.gms.internal.ads.InterfaceC5766yD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f40052C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f40053D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f40054E;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.BinderC5654xC f40057H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p184s3.W0 f40058I;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private org.json.JSONObject f40062M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private org.json.JSONObject f40063N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f40064O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f40065P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f40066Q;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.lang.String f40059J = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.lang.String f40060K = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.lang.String f40061L = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f40055F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.ads.EnumC5676xP f40056G = com.google.android.gms.internal.ads.EnumC5676xP.AD_REQUESTED;

    C5786yP(com.google.android.gms.internal.ads.KP kp, com.google.android.gms.internal.ads.C4546n70 c4546n70, java.lang.String str) {
        this.f40052C = kp;
        this.f40054E = str;
        this.f40053D = c4546n70.f37513f;
    }

    private static org.json.JSONObject f(p184s3.W0 w6) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorDomain", w6.f54147E);
        jSONObject.put("errorCode", w6.f54145C);
        jSONObject.put("errorDescription", w6.f54146D);
        p184s3.W0 w10 = w6.f54148F;
        jSONObject.put("underlyingError", w10 == null ? null : f(w10));
        return jSONObject;
    }

    private final org.json.JSONObject g(com.google.android.gms.internal.ads.BinderC5654xC binderC5654xC) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("winningAdapterClassName", binderC5654xC.i());
        jSONObject.put("responseSecsSinceEpoch", binderC5654xC.c());
        jSONObject.put("responseId", binderC5654xC.h());
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25555f9)).booleanValue()) {
            java.lang.String strF = binderC5654xC.f();
            if (!android.text.TextUtils.isEmpty(strF)) {
                p224w3.p.b("Bidding data: ".concat(java.lang.String.valueOf(strF)));
                jSONObject.put("biddingData", new org.json.JSONObject(strF));
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f40059J)) {
            jSONObject.put("adRequestUrl", this.f40059J);
        }
        if (!android.text.TextUtils.isEmpty(this.f40060K)) {
            jSONObject.put("postBody", this.f40060K);
        }
        if (!android.text.TextUtils.isEmpty(this.f40061L)) {
            jSONObject.put("adResponseBody", this.f40061L);
        }
        java.lang.Object obj = this.f40062M;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        java.lang.Object obj2 = this.f40063N;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25588i9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f40066Q);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (p184s3.g2 g2Var : binderC5654xC.j()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("adapterClassName", g2Var.f54252C);
            jSONObject2.put("latencyMillis", g2Var.f54253D);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25566g9)).booleanValue()) {
                jSONObject2.put("credentials", p184s3.C7147y.b().k(g2Var.f54255F));
            }
            p184s3.W0 w6 = g2Var.f54254E;
            jSONObject2.put("error", w6 == null ? null : f(w6));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25630m9)).booleanValue() || !this.f40052C.r()) {
            return;
        }
        this.f40052C.g(this.f40053D, this);
    }

    public final java.lang.String a() {
        return this.f40054E;
    }

    public final org.json.JSONObject b() throws org.json.JSONException {
        org.json.JSONObject jSONObjectG;
        android.os.IBinder iBinder;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("state", this.f40056G);
        jSONObject.put("format", com.google.android.gms.internal.ads.R60.a(this.f40055F));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25630m9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f40064O);
            if (this.f40064O) {
                jSONObject.put("shown", this.f40065P);
            }
        }
        com.google.android.gms.internal.ads.BinderC5654xC binderC5654xC = this.f40057H;
        if (binderC5654xC != null) {
            jSONObjectG = g(binderC5654xC);
        } else {
            p184s3.W0 w6 = this.f40058I;
            org.json.JSONObject jSONObjectG2 = null;
            if (w6 != null && (iBinder = w6.f54149G) != null) {
                com.google.android.gms.internal.ads.BinderC5654xC binderC5654xC2 = (com.google.android.gms.internal.ads.BinderC5654xC) iBinder;
                jSONObjectG2 = g(binderC5654xC2);
                if (binderC5654xC2.j().isEmpty()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(f(this.f40058I));
                    jSONObjectG2.put("errors", jSONArray);
                }
            }
            jSONObjectG = jSONObjectG2;
        }
        jSONObject.put("responseInfo", jSONObjectG);
        return jSONObject;
    }

    public final void c() {
        this.f40064O = true;
    }

    public final void d() {
        this.f40065P = true;
    }

    public final boolean e() {
        return this.f40056G != com.google.android.gms.internal.ads.EnumC5676xP.AD_REQUESTED;
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(p184s3.W0 w6) {
        if (this.f40052C.r()) {
            this.f40056G = com.google.android.gms.internal.ads.EnumC5676xP.AD_LOAD_FAILED;
            this.f40058I = w6;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25630m9)).booleanValue()) {
                this.f40052C.g(this.f40053D, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        if (this.f40052C.r()) {
            if (!c3558e70.f34899b.f34447a.isEmpty()) {
                this.f40055F = ((com.google.android.gms.internal.ads.R60) c3558e70.f34899b.f34447a.get(0)).f31162b;
            }
            if (!android.text.TextUtils.isEmpty(c3558e70.f34899b.f34448b.f32124l)) {
                this.f40059J = c3558e70.f34899b.f34448b.f32124l;
            }
            if (!android.text.TextUtils.isEmpty(c3558e70.f34899b.f34448b.f32125m)) {
                this.f40060K = c3558e70.f34899b.f34448b.f32125m;
            }
            if (c3558e70.f34899b.f34448b.f32128p.length() > 0) {
                this.f40063N = c3558e70.f34899b.f34448b.f32128p;
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25588i9)).booleanValue()) {
                if (!this.f40052C.t()) {
                    this.f40066Q = true;
                    return;
                }
                if (!android.text.TextUtils.isEmpty(c3558e70.f34899b.f34448b.f32126n)) {
                    this.f40061L = c3558e70.f34899b.f34448b.f32126n;
                }
                if (c3558e70.f34899b.f34448b.f32127o.length() > 0) {
                    this.f40062M = c3558e70.f34899b.f34448b.f32127o;
                }
                com.google.android.gms.internal.ads.KP kp = this.f40052C;
                org.json.JSONObject jSONObject = this.f40062M;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!android.text.TextUtils.isEmpty(this.f40061L)) {
                    length += this.f40061L.length();
                }
                kp.l(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5766yD
    public final void x0(com.google.android.gms.internal.ads.AbstractC3673fA abstractC3673fA) {
        if (this.f40052C.r()) {
            this.f40057H = abstractC3673fA.c();
            this.f40056G = com.google.android.gms.internal.ads.EnumC5676xP.AD_LOADED;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25630m9)).booleanValue()) {
                this.f40052C.g(this.f40053D, this);
            }
        }
    }
}
