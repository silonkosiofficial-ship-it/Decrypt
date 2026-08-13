package p086i5;

/* JADX INFO: loaded from: classes3.dex */
public class d implements p086i5.b, p096j5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p096j5.a f46695a;

    private static java.lang.String c(java.lang.String str, android.os.Bundle bundle) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p096j5.b
    public void a(p096j5.a aVar) {
        this.f46695a = aVar;
        p076h5.g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // p086i5.b
    public void b(java.lang.String str, android.os.Bundle bundle) {
        p096j5.a aVar = this.f46695a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (org.json.JSONException unused) {
                p076h5.g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
