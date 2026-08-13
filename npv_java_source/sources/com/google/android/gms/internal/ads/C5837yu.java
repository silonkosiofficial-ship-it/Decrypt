package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5837yu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5947zu f40164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5727xu f40165b;

    public C5837yu(com.google.android.gms.internal.ads.InterfaceC5947zu interfaceC5947zu, com.google.android.gms.internal.ads.C5727xu c5727xu) {
        this.f40165b = c5727xu;
        this.f40164a = interfaceC5947zu;
    }

    final /* synthetic */ void a(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097ZtQ1 = ((com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu) this.f40165b.f39936a).q1();
        if (abstractC3097ZtQ1 == null) {
            p224w3.p.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            abstractC3097ZtQ1.D0(uri);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignals(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            com.google.android.gms.internal.ads.Z9 z9H = ((com.google.android.gms.internal.ads.InterfaceC2367Fu) this.f40164a).H();
            if (z9H == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                com.google.android.gms.internal.ads.T9 t9C = z9H.c();
                if (t9C == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else {
                    if (this.f40164a.getContext() != null) {
                        com.google.android.gms.internal.ads.InterfaceC5947zu interfaceC5947zu = this.f40164a;
                        return t9C.f(interfaceC5947zu.getContext(), str, ((com.google.android.gms.internal.ads.InterfaceC2441Hu) interfaceC5947zu).N(), this.f40164a.h());
                    }
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        p214v3.AbstractC7265q0.k(str2);
        return "";
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignals() {
        java.lang.String str;
        com.google.android.gms.internal.ads.Z9 z9H = ((com.google.android.gms.internal.ads.InterfaceC2367Fu) this.f40164a).H();
        if (z9H == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            com.google.android.gms.internal.ads.T9 t9C = z9H.c();
            if (t9C == null) {
                str = "Signals object is empty, ignoring.";
            } else {
                if (this.f40164a.getContext() != null) {
                    com.google.android.gms.internal.ads.InterfaceC5947zu interfaceC5947zu = this.f40164a;
                    return t9C.i(interfaceC5947zu.getContext(), ((com.google.android.gms.internal.ads.InterfaceC2441Hu) interfaceC5947zu).N(), this.f40164a.h());
                }
                str = "Context is null, ignoring.";
            }
        }
        p214v3.AbstractC7265q0.k(str);
        return "";
    }

    @android.webkit.JavascriptInterface
    public void notify(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            p224w3.p.g("URL is empty, ignoring message");
        } else {
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.wu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39713C.a(str);
                }
            });
        }
    }
}
