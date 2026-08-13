package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static android.webkit.TracingController a() {
        return android.webkit.TracingController.getInstance();
    }

    public static java.lang.ClassLoader b() {
        return android.webkit.WebView.getWebViewClassLoader();
    }

    public static android.os.Looper c(android.webkit.WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean d(android.webkit.TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(java.lang.String str) {
        android.webkit.WebView.setDataDirectorySuffix(str);
    }

    public static void f(android.webkit.TracingController tracingController, G2.b bVar) {
        H2.n.a();
        throw null;
    }

    public static boolean g(android.webkit.TracingController tracingController, java.io.OutputStream outputStream, java.util.concurrent.Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
