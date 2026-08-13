package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3503dg extends androidx.browser.customtabs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f34769a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f34770b = java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25348M9)).split(","));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3832gg f34771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.browser.customtabs.b f34772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f34773e;

    C3503dg(com.google.android.gms.internal.ads.C3832gg c3832gg, androidx.browser.customtabs.b bVar, com.google.android.gms.internal.ads.C4246kO c4246kO) {
        this.f34772d = bVar;
        this.f34771c = c3832gg;
        this.f34773e = c4246kO;
    }

    private final void m(java.lang.String str) {
        B3.AbstractC0797c.d(this.f34773e, null, "pact_action", new android.util.Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.b
    public final void a(java.lang.String str, android.os.Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f34772d;
        if (bVar != null) {
            bVar.a(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final android.os.Bundle b(java.lang.String str, android.os.Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f34772d;
        if (bVar != null) {
            return bVar.b(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.b
    public final void d(int i6, int i10, android.os.Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f34772d;
        if (bVar != null) {
            bVar.d(i6, i10, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void e(android.os.Bundle bundle) {
        this.f34769a.set(false);
        androidx.browser.customtabs.b bVar = this.f34772d;
        if (bVar != null) {
            bVar.e(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void g(int i6, android.os.Bundle bundle) {
        java.util.List list;
        this.f34769a.set(false);
        androidx.browser.customtabs.b bVar = this.f34772d;
        if (bVar != null) {
            bVar.g(i6, bundle);
        }
        this.f34771c.i(p174r3.v.c().a());
        if (this.f34771c == null || (list = this.f34770b) == null || !list.contains(java.lang.String.valueOf(i6))) {
            return;
        }
        this.f34771c.f();
        m("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.b
    public final void h(java.lang.String str, android.os.Bundle bundle) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f34769a.set(true);
                m("pact_con");
                this.f34771c.h(jSONObject.getString("paw_id"));
            }
        } catch (org.json.JSONException e6) {
            p214v3.AbstractC7265q0.l("Message is not in JSON format: ", e6);
        }
        androidx.browser.customtabs.b bVar = this.f34772d;
        if (bVar != null) {
            bVar.h(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void i(int i6, android.net.Uri uri, boolean z6, android.os.Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f34772d;
        if (bVar != null) {
            bVar.i(i6, uri, z6, bundle);
        }
    }

    public final java.lang.Boolean l() {
        return java.lang.Boolean.valueOf(this.f34769a.get());
    }
}
