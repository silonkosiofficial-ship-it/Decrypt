package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC4262kc implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final android.webkit.ValueCallback f36984C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3385cc f36985D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ android.webkit.WebView f36986E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ boolean f36987F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4482mc f36988G;

    RunnableC4262kc(com.google.android.gms.internal.ads.C4482mc c4482mc, final com.google.android.gms.internal.ads.C3385cc c3385cc, final android.webkit.WebView webView, final boolean z6) {
        this.f36985D = c3385cc;
        this.f36986E = webView;
        this.f36987F = z6;
        this.f36988G = c4482mc;
        this.f36984C = new android.webkit.ValueCallback() { // from class: com.google.android.gms.internal.ads.jc
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                this.f36701a.f36988G.c(c3385cc, webView, (java.lang.String) obj, z6);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f36986E.getSettings().getJavaScriptEnabled()) {
            try {
                this.f36986E.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f36984C);
            } catch (java.lang.Throwable unused) {
                this.f36984C.onReceiveValue("");
            }
        }
    }
}
