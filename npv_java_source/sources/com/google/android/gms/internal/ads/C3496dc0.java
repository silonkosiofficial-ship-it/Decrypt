package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3496dc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3496dc0 f34760a = new com.google.android.gms.internal.ads.C3496dc0();

    private C3496dc0() {
    }

    public static final com.google.android.gms.internal.ads.C3496dc0 a() {
        return f34760a;
    }

    public static final boolean k(android.webkit.WebView webView, java.lang.String str) {
        if (webView == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (java.lang.IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(java.lang.String.valueOf(str)));
            return true;
        }
    }

    final void b(android.webkit.WebView webView, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String string;
        if (webView == null) {
            com.google.android.gms.internal.ads.AbstractC5800yb0.f40106a.booleanValue();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (java.lang.Object obj : objArr) {
            if (obj == null) {
                string = "null";
            } else {
                if (obj instanceof java.lang.String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append(string);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        java.lang.String string2 = sb.toString();
        android.os.Handler handler = webView.getHandler();
        if (handler == null || android.os.Looper.myLooper() == handler.getLooper()) {
            k(webView, string2);
        } else {
            handler.post(new com.google.android.gms.internal.ads.RunnableC3386cc0(this, webView, string2));
        }
    }

    public final void c(android.webkit.WebView webView, java.lang.String str) {
        b(webView, "finishSession", str);
    }

    public final void d(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        b(webView, "init", jSONObject, str);
    }

    public final void e(android.webkit.WebView webView, java.lang.String str, float f6) {
        b(webView, "setDeviceVolume", java.lang.Float.valueOf(f6), str);
    }

    public final void f(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        b(webView, "setLastActivity", jSONObject);
    }

    public final void g(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        b(webView, "setDeviceLockState", str2);
    }

    public final void h(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        b(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void i(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        b(webView, "setState", str2, str);
    }

    public final void j(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
