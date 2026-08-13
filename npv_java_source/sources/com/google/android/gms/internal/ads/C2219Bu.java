package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2219Bu extends com.google.android.gms.internal.ads.AbstractC2182Au {
    public C2219Bu(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4704od c4704od, boolean z6, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT) {
        super(interfaceC2698Ot, c4704od, z6, binderC5240tT);
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return E0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
