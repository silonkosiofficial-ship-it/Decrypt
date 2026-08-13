package B3;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.google.android.gms.internal.ads.AbstractC2354Fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.webkit.WebView f621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B3.c0 f622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.webkit.WebViewClient f624d;

    public g0(android.webkit.WebView webView, B3.c0 c0Var, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f621a = webView;
        this.f622b = c0Var;
        this.f623c = yk0;
    }

    private final void d() {
        this.f621a.evaluateJavascript(java.lang.String.format(java.util.Locale.getDefault(), (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25282G9), this.f622b.a()), null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2354Fj
    protected final android.webkit.WebViewClient a() {
        return this.f624d;
    }

    final /* synthetic */ void b() {
        android.webkit.WebViewClient webViewClientG;
        try {
            p174r3.v.t();
            android.webkit.WebView webView = this.f621a;
            if (android.os.Build.VERSION.SDK_INT < 26) {
                if (G2.f.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClientG = G2.e.g(webView);
                    } catch (java.lang.RuntimeException e6) {
                        p174r3.v.s().x(e6, "AdUtil.getWebViewClient");
                    }
                }
                throw new java.lang.IllegalStateException("getWebViewClient not supported");
            }
            webViewClientG = webView.getWebViewClient();
            if (webViewClientG == this) {
                return;
            }
            if (webViewClientG != null) {
                this.f624d = webViewClientG;
            }
            this.f621a.setWebViewClient(this);
            d();
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public final void c() {
        this.f623c.execute(new java.lang.Runnable() { // from class: B3.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f616C.b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2354Fj, android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        d();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2354Fj, android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        d();
        super.onPageStarted(webView, str, bitmap);
    }
}
