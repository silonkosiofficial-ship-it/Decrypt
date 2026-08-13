package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4703oc0 extends com.google.android.gms.internal.ads.AbstractC4593nc0 {
    public C4703oc0(java.lang.String str, android.webkit.WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        n(webView);
    }
}
