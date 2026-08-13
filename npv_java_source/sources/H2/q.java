package H2;

/* JADX INFO: loaded from: classes.dex */
public class q implements H2.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f4288a = new java.lang.String[0];

    @Override // H2.z
    public java.lang.String[] a() {
        return f4288a;
    }

    @Override // H2.z
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView) {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // H2.z
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
        throw new java.lang.UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
