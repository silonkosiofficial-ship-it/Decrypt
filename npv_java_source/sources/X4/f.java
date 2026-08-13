package X4;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f15877a;

    public f(java.lang.String str) {
        this.f15877a = str;
    }

    public java.lang.String a() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("debugToken", this.f15877a);
        return jSONObject.toString();
    }
}
