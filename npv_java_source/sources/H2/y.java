package H2;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface f4357a;

    public y(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f4357a = webViewProviderBoundaryInterface;
    }

    public void a(java.lang.String str, java.lang.String[] strArr, G2.e.a aVar) {
        this.f4357a.addWebMessageListener(str, strArr, Z9.a.c(new H2.u(aVar)));
    }

    public android.webkit.WebViewClient b() {
        return this.f4357a.getWebViewClient();
    }

    public void c(java.lang.String str) {
        this.f4357a.removeWebMessageListener(str);
    }

    public void d(boolean z6) {
        this.f4357a.setAudioMuted(z6);
    }
}
