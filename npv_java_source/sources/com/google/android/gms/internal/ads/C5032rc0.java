package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5032rc0 extends com.google.android.gms.internal.ads.AbstractC4593nc0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.webkit.WebView f38514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.Long f38515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Map f38516g;

    public C5032rc0(java.lang.String str, java.util.Map map, java.lang.String str2) {
        super(str);
        this.f38515f = null;
        this.f38516g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4593nc0
    public final void c() {
        super.c();
        new android.os.Handler().postDelayed(new com.google.android.gms.internal.ads.RunnableC4923qc0(this), java.lang.Math.max(4000 - (this.f38515f == null ? 4000L : java.util.concurrent.TimeUnit.MILLISECONDS.convert(java.lang.System.nanoTime() - this.f38515f.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS)), 2000L));
        this.f38514e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4593nc0
    public final void i(com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0, com.google.android.gms.internal.ads.C2265Db0 c2265Db0) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map mapI = c2265Db0.i();
        java.util.Iterator it = mapI.keySet().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(mapI.get((java.lang.String) it.next()));
            throw null;
        }
        j(c2339Fb0, c2265Db0, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4593nc0
    public final void o() {
        android.webkit.WebView webView = new android.webkit.WebView(com.google.android.gms.internal.ads.C3277bc0.b().a());
        this.f38514e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f38514e.getSettings().setAllowContentAccess(false);
        this.f38514e.getSettings().setAllowFileAccess(false);
        this.f38514e.setWebViewClient(new com.google.android.gms.internal.ads.C4813pc0(this));
        n(this.f38514e);
        com.google.android.gms.internal.ads.C3496dc0.k(this.f38514e, null);
        java.util.Iterator it = this.f38516g.keySet().iterator();
        if (!it.hasNext()) {
            this.f38515f = java.lang.Long.valueOf(java.lang.System.nanoTime());
        } else {
            androidx.appcompat.app.D.a(this.f38516g.get((java.lang.String) it.next()));
            throw null;
        }
    }
}
