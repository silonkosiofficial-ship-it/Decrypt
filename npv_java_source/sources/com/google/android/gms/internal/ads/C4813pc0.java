package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4813pc0 extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5032rc0 f38029a;

    C4813pc0(com.google.android.gms.internal.ads.C5032rc0 c5032rc0) {
        this.f38029a = c5032rc0;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        java.lang.String str = "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + java.lang.String.valueOf(webView);
        if (this.f38029a.a() == webView) {
            this.f38029a.n(null);
        }
        webView.destroy();
        return true;
    }
}
