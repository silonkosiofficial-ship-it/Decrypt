package p026c5;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f24420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f24421b;

    private c(java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.l(str);
        Q3.AbstractC1477p.l(str2);
        this.f24420a = str;
        this.f24421b = str2;
    }

    public static p026c5.c a(java.lang.String str) throws Q4.m {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strA = V3.r.a(jSONObject.optString("challenge"));
        java.lang.String strA2 = V3.r.a(jSONObject.optString("ttl"));
        if (strA == null || strA2 == null) {
            throw new Q4.m("Unexpected server response.");
        }
        return new p026c5.c(strA, strA2);
    }

    public java.lang.String b() {
        return this.f24420a;
    }
}
