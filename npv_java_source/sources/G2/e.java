package G2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.net.Uri f3031a = android.net.Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final android.net.Uri f3032b = android.net.Uri.parse("");

    public interface a {
        void a(android.webkit.WebView webView, G2.c cVar, android.net.Uri uri, boolean z6, G2.a aVar);
    }

    public static void a(android.webkit.WebView webView, java.lang.String str, java.util.Set set, G2.e.a aVar) {
        if (!H2.w.f4317U.d()) {
            throw H2.w.a();
        }
        f(webView).a(str, (java.lang.String[]) set.toArray(new java.lang.String[0]), aVar);
    }

    private static org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface b(android.webkit.WebView webView) {
        return d().createWebView(webView);
    }

    public static android.content.pm.PackageInfo c() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return H2.g.a();
        }
        try {
            return e();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static H2.z d() {
        return H2.x.c();
    }

    private static android.content.pm.PackageInfo e() {
        return (android.content.pm.PackageInfo) java.lang.Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static H2.y f(android.webkit.WebView webView) {
        return new H2.y(b(webView));
    }

    public static android.webkit.WebViewClient g(android.webkit.WebView webView) {
        H2.AbstractC1234a.e eVar = H2.w.f4304H;
        if (eVar.c()) {
            return H2.g.d(webView);
        }
        if (eVar.d()) {
            return f(webView).b();
        }
        throw H2.w.a();
    }

    public static boolean h() {
        if (H2.w.f4314R.d()) {
            return d().getStatics().isMultiProcessEnabled();
        }
        throw H2.w.a();
    }

    public static void i(android.webkit.WebView webView, java.lang.String str) {
        if (!H2.w.f4317U.d()) {
            throw H2.w.a();
        }
        f(webView).c(str);
    }

    public static void j(android.webkit.WebView webView, boolean z6) {
        if (!H2.w.f4334f0.d()) {
            throw H2.w.a();
        }
        f(webView).d(z6);
    }
}
