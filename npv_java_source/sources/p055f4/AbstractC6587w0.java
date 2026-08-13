package p055f4;

/* JADX INFO: renamed from: f4.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6587w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.Boolean f45262a;

    public static void a(android.webkit.WebView webView, java.lang.String str) {
        boolean zBooleanValue;
        synchronized (p055f4.AbstractC6587w0.class) {
            if (f45262a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f45262a = java.lang.Boolean.TRUE;
                } catch (java.lang.IllegalStateException unused) {
                    f45262a = java.lang.Boolean.FALSE;
                }
                zBooleanValue = f45262a.booleanValue();
            } else {
                zBooleanValue = f45262a.booleanValue();
            }
            throw th;
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
