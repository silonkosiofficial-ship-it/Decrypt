package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2661Nt extends android.webkit.WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f30408a;

    public C2661Nt(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f30408a = interfaceC2698Ot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final android.content.Context b(android.webkit.WebView webView) {
        if (!(webView instanceof com.google.android.gms.internal.ads.InterfaceC2698Ot)) {
            return webView.getContext();
        }
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) webView;
        android.app.Activity activityH = interfaceC2698Ot.h();
        return activityH != null ? activityH : interfaceC2698Ot.getContext();
    }

    protected final boolean a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.webkit.JsResult jsResult, android.webkit.JsPromptResult jsPromptResult, boolean z6) {
        android.app.AlertDialog alertDialogCreate;
        p174r3.b bVarF;
        try {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f30408a;
            if (interfaceC2698Ot != null && interfaceC2698Ot.M() != null && this.f30408a.M().f() != null && (bVarF = this.f30408a.M().f()) != null && !bVarF.c()) {
                bVarF.b("window." + str + "('" + str3 + "')");
                return false;
            }
            p174r3.v.t();
            android.app.AlertDialog.Builder builderL = p214v3.E0.l(context);
            builderL.setTitle(str2);
            if (z6) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
                linearLayout.setOrientation(1);
                android.widget.TextView textView = new android.widget.TextView(context);
                textView.setText(str3);
                android.widget.EditText editText = new android.widget.EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                alertDialogCreate = builderL.setView(linearLayout).setPositiveButton(android.R.string.ok, new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC2587Lt(jsPromptResult, editText)).setNegativeButton(android.R.string.cancel, new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC2551Kt(jsPromptResult)).setOnCancelListener(new com.google.android.gms.internal.ads.DialogInterfaceOnCancelListenerC2514Jt(jsPromptResult)).create();
            } else {
                alertDialogCreate = builderL.setMessage(str3).setPositiveButton(android.R.string.ok, new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC2477It(jsResult)).setNegativeButton(android.R.string.cancel, new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC2440Ht(jsResult)).setOnCancelListener(new com.google.android.gms.internal.ads.DialogInterfaceOnCancelListenerC2403Gt(jsResult)).create();
            }
            alertDialogCreate.show();
            return true;
        } catch (android.view.WindowManager.BadTokenException e6) {
            p224w3.p.h("Fail to display Dialog.", e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        java.lang.String str;
        if (webView instanceof com.google.android.gms.internal.ads.InterfaceC2698Ot) {
            p204u3.x xVarP = ((com.google.android.gms.internal.ads.InterfaceC2698Ot) webView).P();
            if (xVarP != null) {
                xVarP.b();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        p224w3.p.g(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i6 = com.google.android.gms.internal.ads.AbstractC2624Mt.f29843a[consoleMessage.messageLevel().ordinal()];
        if (i6 == 1) {
            p224w3.p.d(str);
        } else if (i6 == 2) {
            p224w3.p.g(str);
        } else if (i6 == 3 || i6 == 4 || i6 != 5) {
            p224w3.p.f(str);
        } else {
            p224w3.p.b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z6, boolean z10, android.os.Message message) {
        android.webkit.WebView.WebViewTransport webViewTransport = (android.webkit.WebView.WebViewTransport) message.obj;
        android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
        if (this.f30408a.T() != null) {
            webView2.setWebViewClient(this.f30408a.T());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(java.lang.String str, java.lang.String str2, long j6, long j10, long j11, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        long j12 = 5242880 - j11;
        if (j12 <= 0) {
            quotaUpdater.updateQuota(j6);
            return;
        }
        if (j6 == 0) {
            if (j10 > j12 || j10 > 1048576) {
                j10 = 0;
            }
        } else if (j10 == 0) {
            j10 = java.lang.Math.min(j6 + java.lang.Math.min(131072L, j12), 1048576L);
        } else {
            if (j10 <= java.lang.Math.min(1048576 - j6, j12)) {
                j6 += j10;
            }
            j10 = j6;
        }
        quotaUpdater.updateQuota(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        boolean z6;
        if (callback != null) {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f30408a;
            p174r3.v.t();
            if (p214v3.E0.b(interfaceC2698Ot.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z6 = true;
            } else {
                com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f30408a;
                p174r3.v.t();
                if (p214v3.E0.b(interfaceC2698Ot2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            callback.invoke(str, z6, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        p204u3.x xVarP = this.f30408a.P();
        if (xVarP == null) {
            p224w3.p.g("Could not get ad overlay when hiding custom view.");
        } else {
            xVarP.i();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(android.view.View view, int i6, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        p204u3.x xVarP = this.f30408a.P();
        if (xVarP == null) {
            p224w3.p.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            xVarP.r6(view, customViewCallback);
            xVarP.p6(i6);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
