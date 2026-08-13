package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static android.content.pm.PackageInfo a() {
        return android.webkit.WebView.getCurrentWebViewPackage();
    }

    public static boolean b(android.webkit.WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static android.webkit.WebChromeClient c(android.webkit.WebView webView) {
        return webView.getWebChromeClient();
    }

    public static android.webkit.WebViewClient d(android.webkit.WebView webView) {
        return webView.getWebViewClient();
    }

    public static void e(android.webkit.WebSettings webSettings, boolean z6) {
        webSettings.setSafeBrowsingEnabled(z6);
    }
}
