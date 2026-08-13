package p104k3;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p184s3.U0 f49512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f49513b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p104k3.j f49514c;

    private u(p184s3.U0 u6) {
        this.f49512a = u6;
        if (u6 != null) {
            try {
                java.util.List listJ = u6.j();
                if (listJ != null) {
                    java.util.Iterator it = listJ.iterator();
                    while (it.hasNext()) {
                        p104k3.j jVarE = p104k3.j.e((p184s3.g2) it.next());
                        if (jVarE != null) {
                            this.f49513b.add(jVarE);
                        }
                    }
                }
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e6);
            }
        }
        p184s3.U0 u10 = this.f49512a;
        if (u10 == null) {
            return;
        }
        try {
            p184s3.g2 g2VarE = u10.e();
            if (g2VarE != null) {
                this.f49514c = p104k3.j.e(g2VarE);
            }
        } catch (android.os.RemoteException e10) {
            p224w3.p.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    public static p104k3.u d(p184s3.U0 u6) {
        if (u6 != null) {
            return new p104k3.u(u6);
        }
        return null;
    }

    public static p104k3.u e(p184s3.U0 u6) {
        return new p104k3.u(u6);
    }

    public java.lang.String a() {
        try {
            p184s3.U0 u6 = this.f49512a;
            if (u6 != null) {
                return u6.i();
            }
            return null;
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e6);
            return null;
        }
    }

    public android.os.Bundle b() {
        try {
            p184s3.U0 u6 = this.f49512a;
            if (u6 != null) {
                return u6.d();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Could not forward getResponseExtras to ResponseInfo.", e6);
        }
        return new android.os.Bundle();
    }

    public java.lang.String c() {
        try {
            p184s3.U0 u6 = this.f49512a;
            if (u6 != null) {
                return u6.h();
            }
            return null;
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Could not forward getResponseId to ResponseInfo.", e6);
            return null;
        }
    }

    public final p184s3.U0 f() {
        return this.f49512a;
    }

    public final org.json.JSONObject g() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String strC = c();
        if (strC == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strC);
        }
        java.lang.String strA = a();
        if (strA == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strA);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f49513b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((p104k3.j) it.next()).f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        p104k3.j jVar = this.f49514c;
        if (jVar != null) {
            jSONObject.put("Loaded Adapter Response", jVar.f());
        }
        android.os.Bundle bundleB = b();
        if (bundleB != null) {
            jSONObject.put("Response Extras", p184s3.C7147y.b().k(bundleB));
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        try {
            return g().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
