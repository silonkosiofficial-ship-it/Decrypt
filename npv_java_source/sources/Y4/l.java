package Y4;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f16388b;

    private l(int i6, java.lang.String str) {
        this.f16387a = i6;
        this.f16388b = str;
    }

    public static Y4.l a(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(new org.json.JSONObject(str).optString("error"));
        return new Y4.l(jSONObject.optInt("code"), jSONObject.optString("message"));
    }

    public int b() {
        return this.f16387a;
    }

    public java.lang.String c() {
        return this.f16388b;
    }
}
