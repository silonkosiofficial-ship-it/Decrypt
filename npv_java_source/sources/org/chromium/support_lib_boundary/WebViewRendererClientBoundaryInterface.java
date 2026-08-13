package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes2.dex */
public interface WebViewRendererClientBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onRendererResponsive(android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler);

    void onRendererUnresponsive(android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler);
}
