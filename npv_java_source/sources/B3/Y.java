package B3;

/* JADX INFO: loaded from: classes.dex */
final class Y extends D3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ B3.C0795a f581b;

    Y(B3.C0795a c0795a, java.lang.String str) {
        this.f580a = str;
        this.f581b = c0795a;
    }

    @Override // D3.b
    public final void a(java.lang.String str) {
        p224w3.p.g("Failed to generate query info for the tagging library, error: ".concat(java.lang.String.valueOf(str)));
        java.lang.String strConcat = ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue() ? ",\"as\":".concat(this.f581b.f597k.a().toString()) : "";
        java.lang.String str2 = this.f580a;
        java.util.Locale locale = java.util.Locale.getDefault();
        com.google.android.gms.internal.ads.C4380lg c4380lg = com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c;
        final java.lang.String str3 = java.lang.String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, java.lang.Long.valueOf(((java.lang.Boolean) c4380lg.e()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2422Hg.f28094f.e()).longValue() : 0L), strConcat);
        if (((java.lang.Boolean) c4380lg.e()).booleanValue()) {
            try {
                this.f581b.f594h.execute(new java.lang.Runnable() { // from class: B3.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f576C.f581b.f588b.evaluateJavascript(str3, null);
                    }
                });
            } catch (java.lang.RuntimeException e6) {
                p174r3.v.s().w(e6, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.f581b.f588b.evaluateJavascript(str3, null);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28090b.e()).booleanValue()) {
            this.f581b.f598l.c();
        }
    }

    @Override // D3.b
    public final void b(D3.a aVar) {
        final java.lang.String str;
        java.lang.String strB = aVar.b();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("paw_id", this.f580a);
            jSONObject.put("signal", strB);
            jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2422Hg.f28094f.e()).longValue() : 0L);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue()) {
                jSONObject.put("as", this.f581b.f597k.a());
            }
            str = java.lang.String.format(java.util.Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (org.json.JSONException unused) {
            java.lang.String strConcat = ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue() ? ",\"as\":".concat(this.f581b.f597k.a().toString()) : "";
            str = java.lang.String.format(java.util.Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f580a, aVar.b(), java.lang.Long.valueOf(((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2422Hg.f28094f.e()).longValue() : 0L), strConcat);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28091c.e()).booleanValue()) {
            try {
                this.f581b.f594h.execute(new java.lang.Runnable() { // from class: B3.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f578C.f581b.f588b.evaluateJavascript(str, null);
                    }
                });
            } catch (java.lang.RuntimeException e6) {
                p174r3.v.s().w(e6, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.f581b.f588b.evaluateJavascript(str, null);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28089a.e()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2422Hg.f28090b.e()).booleanValue()) {
            this.f581b.f598l.c();
        }
    }
}
