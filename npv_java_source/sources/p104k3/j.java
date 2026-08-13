package p104k3;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p184s3.g2 f49486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p104k3.C6885b f49487b;

    private j(p184s3.g2 g2Var) {
        this.f49486a = g2Var;
        p184s3.W0 w6 = g2Var.f54254E;
        this.f49487b = w6 == null ? null : w6.e();
    }

    public static p104k3.j e(p184s3.g2 g2Var) {
        if (g2Var != null) {
            return new p104k3.j(g2Var);
        }
        return null;
    }

    public java.lang.String a() {
        return this.f49486a.f54257H;
    }

    public java.lang.String b() {
        return this.f49486a.f54259J;
    }

    public java.lang.String c() {
        return this.f49486a.f54258I;
    }

    public java.lang.String d() {
        return this.f49486a.f54256G;
    }

    public final org.json.JSONObject f() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("Adapter", this.f49486a.f54252C);
        jSONObject.put("Latency", this.f49486a.f54253D);
        java.lang.String strD = d();
        if (strD == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", strD);
        }
        java.lang.String strA = a();
        if (strA == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", strA);
        }
        java.lang.String strC = c();
        if (strC == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", strC);
        }
        java.lang.String strB = b();
        if (strB == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", strB);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str : this.f49486a.f54255F.keySet()) {
            jSONObject2.put(str, this.f49486a.f54255F.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        p104k3.C6885b c6885b = this.f49487b;
        if (c6885b == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", c6885b.e());
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        try {
            return f().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
