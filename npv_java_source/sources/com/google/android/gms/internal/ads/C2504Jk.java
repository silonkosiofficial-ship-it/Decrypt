package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2504Jk implements com.google.android.gms.internal.ads.InterfaceC2208Bk, com.google.android.gms.internal.ads.InterfaceC2171Ak {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f28742C;

    public C2504Jk(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.Z9 z10, p174r3.a aVar2) throws com.google.android.gms.internal.ads.C3530du {
        p174r3.v.a();
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = com.google.android.gms.internal.ads.C3640eu.a(context, com.google.android.gms.internal.ads.C2625Mu.a(), "", false, false, null, null, aVar, null, null, null, com.google.android.gms.internal.ads.C4704od.a(), null, null, null, null);
        this.f28742C = interfaceC2698OtA;
        interfaceC2698OtA.N().setWillNotDraw(true);
    }

    private static final void w(java.lang.Runnable runnable) {
        p184s3.C7147y.b();
        if (p224w3.g.w()) {
            p214v3.AbstractC7265q0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            p214v3.AbstractC7265q0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (p214v3.E0.f55826l.post(runnable)) {
                return;
            }
            p224w3.p.g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208Bk
    public final void G(final java.lang.String str) {
        p214v3.AbstractC7265q0.k("loadHtml on adWebView from html");
        w(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Gk
            @Override // java.lang.Runnable
            public final void run() {
                this.f27871C.d(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final /* synthetic */ void G0(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.AbstractC5927zk.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5817yk
    public final /* synthetic */ void O(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.AbstractC5927zk.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208Bk
    public final void S(final java.lang.String str) {
        p214v3.AbstractC7265q0.k("loadHtmlWrapper on adWebView from path: ".concat(java.lang.String.valueOf(str)));
        w(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Dk
            @Override // java.lang.Runnable
            public final void run() {
                this.f26765C.f(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061il
    public final void W(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        this.f28742C.g1(str, new com.google.android.gms.internal.ads.C2467Ik(this, interfaceC3838gj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5817yk
    public final /* synthetic */ void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.AbstractC5927zk.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208Bk
    public final void a0(java.lang.String str) {
        p214v3.AbstractC7265q0.k("loadJavascript on adWebView from path: ".concat(java.lang.String.valueOf(str)));
        final java.lang.String str2 = java.lang.String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        w(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Hk
            @Override // java.lang.Runnable
            public final void run() {
                this.f28102C.l(str2);
            }
        });
    }

    final /* synthetic */ void b(java.lang.String str) {
        this.f28742C.o(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208Bk
    public final void c() {
        this.f28742C.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208Bk
    public final void c0(final com.google.android.gms.internal.ads.C2614Mk c2614Mk) {
        com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = this.f28742C.M();
        j$.util.Objects.requireNonNull(c2614Mk);
        interfaceC2552KuM.K(new com.google.android.gms.internal.ads.InterfaceC2515Ju() { // from class: com.google.android.gms.internal.ads.Ek
            @Override // com.google.android.gms.internal.ads.InterfaceC2515Ju
            public final void a() {
                long jA = p174r3.v.c().a();
                com.google.android.gms.internal.ads.C2614Mk c2614Mk2 = c2614Mk;
                final long j6 = c2614Mk2.f29821c;
                final java.util.ArrayList arrayList = c2614Mk2.f29820b;
                arrayList.add(java.lang.Long.valueOf(jA - j6));
                p214v3.AbstractC7265q0.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + java.lang.String.valueOf(arrayList.get(0)) + " ms.");
                com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
                final com.google.android.gms.internal.ads.C3952hl c3952hl = c2614Mk2.f29819a;
                final com.google.android.gms.internal.ads.C3842gl c3842gl = c2614Mk2.f29822d;
                final com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk = c2614Mk2.f29823e;
                handlerC2345Fe0.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Nk
                    @Override // java.lang.Runnable
                    public final void run() {
                        c3952hl.j(c3842gl, interfaceC2208Bk, arrayList, j6);
                    }
                }, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25502b)).intValue());
            }
        });
    }

    final /* synthetic */ void d(java.lang.String str) {
        this.f28742C.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void f(java.lang.String str) {
        this.f28742C.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208Bk
    public final boolean h() {
        return this.f28742C.L0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2208Bk
    public final com.google.android.gms.internal.ads.C4170jl j() {
        return new com.google.android.gms.internal.ads.C4170jl(this);
    }

    final /* synthetic */ void l(java.lang.String str) {
        this.f28742C.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final void o(final java.lang.String str) {
        p214v3.AbstractC7265q0.k("invokeJavascript on adWebView from js");
        w(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Fk
            @Override // java.lang.Runnable
            public final void run() {
                this.f27450C.b(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final /* synthetic */ void q(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.AbstractC5927zk.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061il
    public final void q0(java.lang.String str, final com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        this.f28742C.V0(str, new V3.o() { // from class: com.google.android.gms.internal.ads.Ck
            @Override // V3.o
            public final boolean apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj2 = (com.google.android.gms.internal.ads.InterfaceC3838gj) obj;
                if (interfaceC3838gj2 instanceof com.google.android.gms.internal.ads.C2467Ik) {
                    return ((com.google.android.gms.internal.ads.C2467Ik) interfaceC3838gj2).f28495a.equals(interfaceC3838gj);
                }
                return false;
            }
        });
    }
}
