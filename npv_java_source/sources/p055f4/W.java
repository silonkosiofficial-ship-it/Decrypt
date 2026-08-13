package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class W extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p055f4.X f45084a;

    /* synthetic */ W(p055f4.X x6, p055f4.V v6) {
        this.f45084a = x6;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        if (p055f4.X.f(this.f45084a, str)) {
            this.f45084a.f45086D.e(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        if (this.f45084a.f45087E) {
            return;
        }
        this.f45084a.f45087E = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i6, java.lang.String str, java.lang.String str2) {
        this.f45084a.f45086D.f(i6, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String string = webResourceRequest.getUrl().toString();
        if (!p055f4.X.f(this.f45084a, string)) {
            return false;
        }
        this.f45084a.f45086D.e(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (!p055f4.X.f(this.f45084a, str)) {
            return false;
        }
        this.f45084a.f45086D.e(str);
        return true;
    }
}
