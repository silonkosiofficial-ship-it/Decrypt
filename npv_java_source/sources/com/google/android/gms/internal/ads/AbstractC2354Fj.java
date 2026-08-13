package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2354Fj extends android.webkit.WebViewClient {
    protected abstract android.webkit.WebViewClient a();

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z6) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.doUpdateVisitedHistory(webView, str, z6);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i6, java.lang.String str, java.lang.String str2) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedError(webView, i6, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return false;
        }
        return webViewClientA.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i6, android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onSafeBrowsingHit(webView, webResourceRequest, i6, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(android.webkit.WebView webView, float f6, float f10) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onScaleChanged(webView, f6, f10);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return null;
        }
        return webViewClientA.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return null;
        }
        return webViewClientA.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return false;
        }
        return webViewClientA.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return false;
        }
        return webViewClientA.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return false;
        }
        return webViewClientA.shouldOverrideUrlLoading(webView, str);
    }
}
