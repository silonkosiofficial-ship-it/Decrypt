package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5373ui implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5483vi f39209a;

    public C5373ui(com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi) {
        this.f39209a = interfaceC5483vi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        if (this.f39209a == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("name");
        if (str == null) {
            p224w3.p.f("Ad metadata with no name parameter.");
            str = "";
        }
        android.os.Bundle bundleA = null;
        if (map.containsKey("info")) {
            try {
                bundleA = p214v3.V.a(new org.json.JSONObject((java.lang.String) map.get("info")));
            } catch (org.json.JSONException e6) {
                p224w3.p.e("Failed to convert ad metadata to JSON.", e6);
            }
        }
        if (bundleA == null) {
            p224w3.p.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f39209a.C(str, bundleA);
        }
    }
}
