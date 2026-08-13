package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5927zk {
    public static void a(com.google.android.gms.internal.ads.InterfaceC2171Ak interfaceC2171Ak, java.lang.String str, java.util.Map map) {
        try {
            interfaceC2171Ak.a(str, p184s3.C7147y.b().l(map));
        } catch (org.json.JSONException unused) {
            p224w3.p.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(com.google.android.gms.internal.ads.InterfaceC2171Ak interfaceC2171Ak, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String string = jSONObject.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        p224w3.p.b("Dispatching AFMA event: ".concat(sb.toString()));
        interfaceC2171Ak.o(sb.toString());
    }

    public static void c(com.google.android.gms.internal.ads.InterfaceC2171Ak interfaceC2171Ak, java.lang.String str, java.lang.String str2) {
        interfaceC2171Ak.o(str + "(" + str2 + ");");
    }

    public static void d(com.google.android.gms.internal.ads.InterfaceC2171Ak interfaceC2171Ak, java.lang.String str, org.json.JSONObject jSONObject) {
        interfaceC2171Ak.q(str, jSONObject.toString());
    }
}
