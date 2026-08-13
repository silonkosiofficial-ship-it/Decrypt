package H2;

/* JADX INFO: loaded from: classes.dex */
public class A implements H2.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface f4283a;

    public A(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f4283a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // H2.z
    public java.lang.String[] a() {
        return this.f4283a.getSupportedFeatures();
    }

    @Override // H2.z
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView) {
        return (org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface) Z9.a.a(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface.class, this.f4283a.createWebView(webView));
    }

    @Override // H2.z
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
        return (org.chromium.support_lib_boundary.StaticsBoundaryInterface) Z9.a.a(org.chromium.support_lib_boundary.StaticsBoundaryInterface.class, this.f4283a.getStatics());
    }
}
