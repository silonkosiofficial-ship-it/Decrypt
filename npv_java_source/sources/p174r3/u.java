package p174r3;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p184s3.U {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p224w3.a f53889C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p184s3.c2 f53890D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.Future f53891E = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.H0(new p174r3.q(this));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.content.Context f53892F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p174r3.s f53893G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.webkit.WebView f53894H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p184s3.H f53895I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Z9 f53896J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.os.AsyncTask f53897K;

    public u(android.content.Context context, p184s3.c2 c2Var, java.lang.String str, p224w3.a aVar) {
        this.f53892F = context;
        this.f53889C = aVar;
        this.f53890D = c2Var;
        this.f53894H = new android.webkit.WebView(context);
        this.f53893G = new p174r3.s(context, str);
        o6(0);
        this.f53894H.setVerticalScrollBarEnabled(false);
        this.f53894H.getSettings().setJavaScriptEnabled(true);
        this.f53894H.setWebViewClient(new p174r3.o(this));
        this.f53894H.setOnTouchListener(new p174r3.p(this));
    }

    static /* bridge */ /* synthetic */ java.lang.String u6(p174r3.u uVar, java.lang.String str) {
        if (uVar.f53896J == null) {
            return str;
        }
        android.net.Uri uriA = android.net.Uri.parse(str);
        try {
            uriA = uVar.f53896J.a(uriA, uVar.f53892F, null, null);
        } catch (com.google.android.gms.internal.ads.C3162aa e6) {
            p224w3.p.h("Unable to process ad data", e6);
        }
        return uriA.toString();
    }

    static /* bridge */ /* synthetic */ void x6(p174r3.u uVar, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        uVar.f53892F.startActivity(intent);
    }

    @Override // p184s3.V
    public final void C() {
        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
        this.f53897K.cancel(true);
        this.f53891E.cancel(false);
        this.f53894H.destroy();
        this.f53894H = null;
    }

    @Override // p184s3.V
    public final void F1(p184s3.InterfaceC7122p0 interfaceC7122p0) {
    }

    @Override // p184s3.V
    public final void F2(com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final boolean H0() {
        return false;
    }

    @Override // p184s3.V
    public final void I5(com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525Kc) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void J() {
        Q3.AbstractC1477p.e("pause must be called on the main UI thread.");
    }

    @Override // p184s3.V
    public final boolean K3(p184s3.X1 x6) {
        Q3.AbstractC1477p.m(this.f53894H, "This Search Ad has already been torn down");
        this.f53893G.f(x6, this.f53889C);
        this.f53897K = new p174r3.r(this, null).execute(new java.lang.Void[0]);
        return true;
    }

    @Override // p184s3.V
    public final boolean P5() {
        return false;
    }

    @Override // p184s3.V
    public final void T1(p184s3.c2 c2Var) {
        throw new java.lang.IllegalStateException("AdSize must be set before initialization");
    }

    @Override // p184s3.V
    public final void V0(p184s3.i2 i2Var) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void V5(p184s3.E e6) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void W0(java.lang.String str) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void W2(com.google.android.gms.internal.ads.InterfaceC2947Vn interfaceC2947Vn) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void X() {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void X1(com.google.android.gms.internal.ads.InterfaceC3055Yn interfaceC3055Yn, java.lang.String str) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void Y() {
        Q3.AbstractC1477p.e("resume must be called on the main UI thread.");
    }

    @Override // p184s3.V
    public final void Y1(com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ip) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void Y4(boolean z6) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final void e6(boolean z6) {
    }

    @Override // p184s3.V
    public final android.os.Bundle f() {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final boolean f0() {
        return false;
    }

    @Override // p184s3.V
    public final void g3(p184s3.C7084c1 c7084c1) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final p184s3.H h() {
        throw new java.lang.IllegalStateException("getIAdListener not implemented");
    }

    @Override // p184s3.V
    public final void h0() {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final p184s3.c2 i() {
        return this.f53890D;
    }

    @Override // p184s3.V
    public final void i2(p184s3.InterfaceC7101i0 interfaceC7101i0) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final p184s3.InterfaceC7101i0 j() {
        throw new java.lang.IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // p184s3.V
    public final void j4(p184s3.Q1 q6) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final p184s3.U0 k() {
        return null;
    }

    @Override // p184s3.V
    public final p184s3.Y0 l() {
        return null;
    }

    @Override // p184s3.V
    public final void l1(p184s3.N0 n6) {
    }

    @Override // p184s3.V
    public final void m6(X3.a aVar) {
    }

    @Override // p184s3.V
    public final X3.a n() {
        Q3.AbstractC1477p.e("getAdFrame must be called on the main UI thread.");
        return X3.b.c2(this.f53894H);
    }

    @Override // p184s3.V
    public final void o3(p184s3.X1 x6, p184s3.K k6) {
    }

    final void o6(int i6) {
        if (this.f53894H == null) {
            return;
        }
        this.f53894H.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, i6));
    }

    final java.lang.String q() {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https://").appendEncodedPath((java.lang.String) com.google.android.gms.internal.ads.AbstractC4600ng.f37636d.e());
        builder.appendQueryParameter("query", this.f53893G.d());
        builder.appendQueryParameter("pubId", this.f53893G.c());
        builder.appendQueryParameter("mappver", this.f53893G.a());
        java.util.Map mapE = this.f53893G.e();
        for (java.lang.String str : mapE.keySet()) {
            builder.appendQueryParameter(str, (java.lang.String) mapE.get(str));
        }
        android.net.Uri uriBuild = builder.build();
        com.google.android.gms.internal.ads.Z9 z10 = this.f53896J;
        if (z10 != null) {
            try {
                uriBuild = z10.b(uriBuild, this.f53892F);
            } catch (com.google.android.gms.internal.ads.C3162aa e6) {
                p224w3.p.h("Unable to process ad data", e6);
            }
        }
        return s() + "#" + uriBuild.getEncodedQuery();
    }

    @Override // p184s3.V
    public final void r2(java.lang.String str) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    final java.lang.String s() {
        java.lang.String strB = this.f53893G.b();
        if (true == android.text.TextUtils.isEmpty(strB)) {
            strB = "www.google.com";
        }
        return "https://" + strB + ((java.lang.String) com.google.android.gms.internal.ads.AbstractC4600ng.f37636d.e());
    }

    @Override // p184s3.V
    public final java.lang.String t() {
        throw new java.lang.IllegalStateException("getAdUnitId not implemented");
    }

    @Override // p184s3.V
    public final java.lang.String u() {
        return null;
    }

    @Override // p184s3.V
    public final void u3(p184s3.H h6) {
        this.f53895I = h6;
    }

    @Override // p184s3.V
    public final void v3(p184s3.C7113m0 c7113m0) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // p184s3.V
    public final java.lang.String w() {
        return null;
    }

    @Override // p184s3.V
    public final void x4(p184s3.InterfaceC7077a0 interfaceC7077a0) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    final int y(java.lang.String str) {
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("height");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            p184s3.C7147y.b();
            return p224w3.g.z(this.f53892F, java.lang.Integer.parseInt(queryParameter));
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }
}
