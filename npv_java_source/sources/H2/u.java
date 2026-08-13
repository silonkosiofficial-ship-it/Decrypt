package H2;

/* JADX INFO: loaded from: classes.dex */
public class u implements org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private G2.e.a f4295a;

    public u(G2.e.a aVar) {
        this.f4295a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler, android.net.Uri uri, boolean z6, java.lang.reflect.InvocationHandler invocationHandler2) {
        G2.c cVarB = H2.t.b((org.chromium.support_lib_boundary.WebMessageBoundaryInterface) Z9.a.a(org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class, invocationHandler));
        if (cVarB != null) {
            this.f4295a.a(webView, cVarB, uri, z6, H2.r.a(invocationHandler2));
        }
    }
}
