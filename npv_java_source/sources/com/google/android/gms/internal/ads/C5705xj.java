package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5705xj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f39903a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f39904b = new java.util.HashMap();

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("id");
        java.lang.String str2 = (java.lang.String) map.get("fail");
        java.lang.String str3 = (java.lang.String) map.get("fail_reason");
        java.lang.String str4 = (java.lang.String) map.get("fail_stack");
        java.lang.String str5 = (java.lang.String) map.get("result");
        if (true == android.text.TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        java.lang.String strConcat = android.text.TextUtils.isEmpty(str4) ? "" : "\n".concat(java.lang.String.valueOf(str4));
        synchronized (this.f39903a) {
            try {
                com.google.android.gms.internal.ads.InterfaceC5595wj interfaceC5595wj = (com.google.android.gms.internal.ads.InterfaceC5595wj) this.f39904b.remove(str);
                if (interfaceC5595wj == null) {
                    p224w3.p.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!android.text.TextUtils.isEmpty(str2)) {
                    interfaceC5595wj.o(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    interfaceC5595wj.a(null);
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str5);
                    if (p214v3.AbstractC7265q0.m()) {
                        p214v3.AbstractC7265q0.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    interfaceC5595wj.a(jSONObject);
                } catch (org.json.JSONException e6) {
                    interfaceC5595wj.o(e6.getMessage());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final P4.d b(com.google.android.gms.internal.ads.InterfaceC2541Kk interfaceC2541Kk, java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        p174r3.v.t();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        c(string, new com.google.android.gms.internal.ads.C5485vj(this, c4512mr));
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            interfaceC2541Kk.G0(str, jSONObject2);
        } catch (java.lang.Exception e6) {
            c4512mr.d(e6);
        }
        return c4512mr;
    }

    public final void c(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC5595wj interfaceC5595wj) {
        synchronized (this.f39903a) {
            this.f39904b.put(str, interfaceC5595wj);
        }
    }
}
