package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4482mc extends java.lang.Thread {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f37365C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f37366D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f37367E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3495dc f37368F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f37369G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f37370H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f37371I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f37372J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f37373K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f37374L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f37375M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f37376N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.lang.String f37377O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f37378P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f37379Q;

    public C4482mc() {
        com.google.android.gms.internal.ads.C3495dc c3495dc = new com.google.android.gms.internal.ads.C3495dc();
        this.f37365C = false;
        this.f37366D = false;
        this.f37368F = c3495dc;
        this.f37367E = new java.lang.Object();
        this.f37370H = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC5259tg.f39004d.e()).intValue();
        this.f37371I = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC5259tg.f39001a.e()).intValue();
        this.f37372J = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC5259tg.f39005e.e()).intValue();
        this.f37373K = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC5259tg.f39003c.e()).intValue();
        this.f37374L = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25536e0)).intValue();
        this.f37375M = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25547f0)).intValue();
        this.f37376N = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25558g0)).intValue();
        this.f37369G = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC5259tg.f39006f.e()).intValue();
        this.f37377O = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25580i0);
        this.f37378P = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25591j0)).booleanValue();
        this.f37379Q = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25602k0)).booleanValue();
        ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25612l0)).booleanValue();
        setName("ContentFetchTask");
    }

    final com.google.android.gms.internal.ads.C4372lc a(android.view.View view, com.google.android.gms.internal.ads.C3385cc c3385cc) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new android.graphics.Rect());
            if ((view instanceof android.widget.TextView) && !(view instanceof android.widget.EditText)) {
                java.lang.CharSequence text = ((android.widget.TextView) view).getText();
                if (!android.text.TextUtils.isEmpty(text)) {
                    c3385cc.h(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new com.google.android.gms.internal.ads.C4372lc(this, 1, 0);
                }
            } else if ((view instanceof android.webkit.WebView) && !(view instanceof com.google.android.gms.internal.ads.InterfaceC2698Ot)) {
                android.webkit.WebView webView = (android.webkit.WebView) view;
                if (V3.n.d()) {
                    c3385cc.f();
                    webView.post(new com.google.android.gms.internal.ads.RunnableC4262kc(this, c3385cc, webView, globalVisibleRect));
                    return new com.google.android.gms.internal.ads.C4372lc(this, 0, 1);
                }
            } else if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int i6 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    com.google.android.gms.internal.ads.C4372lc c4372lcA = a(viewGroup.getChildAt(i11), c3385cc);
                    i6 += c4372lcA.f37191a;
                    i10 += c4372lcA.f37192b;
                }
                return new com.google.android.gms.internal.ads.C4372lc(this, i6, i10);
            }
        }
        return new com.google.android.gms.internal.ads.C4372lc(this, 0, 0);
    }

    final void b(android.view.View view) {
        try {
            com.google.android.gms.internal.ads.C3385cc c3385cc = new com.google.android.gms.internal.ads.C3385cc(this.f37370H, this.f37371I, this.f37372J, this.f37373K, this.f37374L, this.f37375M, this.f37376N, this.f37379Q);
            android.content.Context contextB = p174r3.v.e().b();
            if (contextB != null && !android.text.TextUtils.isEmpty(this.f37377O)) {
                java.lang.String str = (java.lang.String) view.getTag(contextB.getResources().getIdentifier((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25569h0), "id", contextB.getPackageName()));
                if (str != null && str.equals(this.f37377O)) {
                    return;
                }
            }
            com.google.android.gms.internal.ads.C4372lc c4372lcA = a(view, c3385cc);
            c3385cc.j();
            if (c4372lcA.f37191a == 0 && c4372lcA.f37192b == 0) {
                return;
            }
            int i6 = c4372lcA.f37192b;
            if (i6 != 0) {
                if (i6 == 0) {
                }
                this.f37368F.a(c3385cc);
            } else if (c3385cc.b() == 0) {
                return;
            }
            if (this.f37368F.c(c3385cc)) {
                return;
            }
            this.f37368F.a(c3385cc);
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Exception in fetchContentOnUIThread", e6);
            p174r3.v.s().x(e6, "ContentFetchTask.fetchContent");
        }
    }

    final void c(com.google.android.gms.internal.ads.C3385cc c3385cc, android.webkit.WebView webView, java.lang.String str, boolean z6) {
        c3385cc.e();
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String strOptString = new org.json.JSONObject(str).optString("text");
                if (this.f37378P || android.text.TextUtils.isEmpty(webView.getTitle())) {
                    c3385cc.i(strOptString, z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    c3385cc.i(webView.getTitle() + "\n" + strOptString, z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (c3385cc.l()) {
                this.f37368F.b(c3385cc);
            }
        } catch (org.json.JSONException unused) {
            p224w3.p.b("Json string may be malformed.");
        } catch (java.lang.Throwable th) {
            p224w3.p.c("Failed to get webview content.", th);
            p174r3.v.s().x(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void d() {
        synchronized (this.f37367E) {
            try {
                if (this.f37365C) {
                    p224w3.p.b("Content hash thread already started, quitting...");
                } else {
                    this.f37365C = true;
                    start();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f37367E) {
            this.f37366D = true;
            p224w3.p.b("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00eb */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:74:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4482mc.run():void");
    }
}
