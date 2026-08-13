package p026c5;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f24419a;

    public a(java.lang.String str) {
        this.f24419a = str;
    }

    public java.lang.String a() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("playIntegrityToken", this.f24419a);
        return jSONObject.toString();
    }
}
