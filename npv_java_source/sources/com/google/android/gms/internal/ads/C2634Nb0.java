package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2634Nb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2708Pb0 f30334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.webkit.WebView f30335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2673Oc0 f30336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.HashMap f30337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3167ac0 f30338e;

    private C2634Nb0(com.google.android.gms.internal.ads.C2708Pb0 c2708Pb0, android.webkit.WebView webView, boolean z6) {
        java.util.HashMap map = new java.util.HashMap();
        this.f30337d = map;
        this.f30338e = new com.google.android.gms.internal.ads.C3167ac0();
        com.google.android.gms.internal.ads.AbstractC5692xc0.a();
        this.f30334a = c2708Pb0;
        this.f30335b = webView;
        if (a() != webView) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.AbstractC2191Bb0) it.next()).d(webView);
            }
            this.f30336c = new com.google.android.gms.internal.ads.C2673Oc0(webView);
        }
        if (!G2.f.a("WEB_MESSAGE_LISTENER")) {
            throw new java.lang.UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        h();
        G2.e.a(this.f30335b, "omidJsSessionService", new java.util.HashSet(java.util.Arrays.asList("*")), new com.google.android.gms.internal.ads.C2561Lb0(this));
    }

    public static com.google.android.gms.internal.ads.C2634Nb0 b(com.google.android.gms.internal.ads.C2708Pb0 c2708Pb0, android.webkit.WebView webView, boolean z6) {
        return new com.google.android.gms.internal.ads.C2634Nb0(c2708Pb0, webView, true);
    }

    static /* bridge */ /* synthetic */ void c(com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0, java.lang.String str) {
        com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0 = (com.google.android.gms.internal.ads.AbstractC2191Bb0) c2634Nb0.f30337d.get(str);
        if (abstractC2191Bb0 != null) {
            abstractC2191Bb0.c();
            c2634Nb0.f30337d.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void e(com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0, java.lang.String str) {
        com.google.android.gms.internal.ads.EnumC2376Gb0 enumC2376Gb0 = com.google.android.gms.internal.ads.EnumC2376Gb0.DEFINED_BY_JAVASCRIPT;
        com.google.android.gms.internal.ads.EnumC2487Jb0 enumC2487Jb0 = com.google.android.gms.internal.ads.EnumC2487Jb0.DEFINED_BY_JAVASCRIPT;
        com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0 = com.google.android.gms.internal.ads.EnumC2671Ob0.JAVASCRIPT;
        com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0 = new com.google.android.gms.internal.ads.C2339Fb0(com.google.android.gms.internal.ads.C2228Cb0.a(enumC2376Gb0, enumC2487Jb0, enumC2671Ob0, enumC2671Ob0, false), com.google.android.gms.internal.ads.C2265Db0.b(c2634Nb0.f30334a, c2634Nb0.f30335b, null, null), str);
        c2634Nb0.f30337d.put(str, c2339Fb0);
        c2339Fb0.d(c2634Nb0.a());
        for (com.google.android.gms.internal.ads.C3071Zb0 c3071Zb0 : c2634Nb0.f30338e.a()) {
            c2339Fb0.b((android.view.View) c3071Zb0.b().get(), c3071Zb0.a(), c3071Zb0.c());
        }
        c2339Fb0.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        G2.e.i(this.f30335b, "omidJsSessionService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final android.view.View a() {
        com.google.android.gms.internal.ads.C2673Oc0 c2673Oc0 = this.f30336c;
        if (c2673Oc0 == null) {
            return null;
        }
        return (android.view.View) c2673Oc0.get();
    }

    public final void f(android.view.View view, com.google.android.gms.internal.ads.EnumC2450Ib0 enumC2450Ib0, java.lang.String str) {
        java.util.Iterator it = this.f30337d.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.AbstractC2191Bb0) it.next()).b(view, enumC2450Ib0, "Ad overlay");
        }
        this.f30338e.b(view, enumC2450Ib0, "Ad overlay");
    }

    public final void g(com.google.android.gms.internal.ads.C4078iu c4078iu) {
        java.util.Iterator it = this.f30337d.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.AbstractC2191Bb0) it.next()).c();
        }
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new com.google.android.gms.internal.ads.C2524Kb0(this, c4078iu, timer), 1000L);
    }
}
