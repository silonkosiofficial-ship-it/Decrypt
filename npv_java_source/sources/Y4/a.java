package Y4;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f16350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f16351b;

    private a(java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.l(str);
        Q3.AbstractC1477p.l(str2);
        this.f16350a = str;
        this.f16351b = str2;
    }

    public static Y4.a a(java.lang.String str) throws Q4.m {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strA = V3.r.a(jSONObject.optString("token"));
        java.lang.String strA2 = V3.r.a(jSONObject.optString("ttl"));
        if (strA == null || strA2 == null) {
            throw new Q4.m("Unexpected server response.");
        }
        return new Y4.a(strA, strA2);
    }

    public java.lang.String b() {
        return this.f16351b;
    }

    public java.lang.String c() {
        return this.f16350a;
    }
}
