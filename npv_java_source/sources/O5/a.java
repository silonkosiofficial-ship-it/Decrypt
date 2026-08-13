package O5;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.firebase.remoteconfig.internal.f f8050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.google.firebase.remoteconfig.internal.f f8051b;

    a(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        this.f8050a = fVar;
        this.f8051b = fVar2;
    }

    public static O5.a a(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new O5.a(fVar, fVar2);
    }

    private java.lang.String c(java.lang.String str) {
        java.lang.String strD = d(this.f8050a, str);
        if (strD != null) {
            return strD;
        }
        java.lang.String strD2 = d(this.f8051b, str);
        return strD2 != null ? strD2 : "";
    }

    private static java.lang.String d(com.google.firebase.remoteconfig.internal.f fVar, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.g gVarF = fVar.f();
        if (gVarF == null) {
            return null;
        }
        try {
            return gVarF.g().getString(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    Q5.e b(com.google.firebase.remoteconfig.internal.g gVar) throws N5.j {
        org.json.JSONArray jSONArrayJ = gVar.j();
        long jK = gVar.k();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i6 = 0; i6 < jSONArrayJ.length(); i6++) {
            try {
                org.json.JSONObject jSONObject = jSONArrayJ.getJSONObject(i6);
                java.lang.String string = jSONObject.getString("rolloutId");
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    java.lang.String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray);
                }
                java.lang.String strOptString = jSONArray.optString(0, "");
                hashSet.add(Q5.d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jK).a());
            } catch (org.json.JSONException e6) {
                throw new N5.j("Exception parsing rollouts metadata to create RolloutsState.", e6);
            }
        }
        return Q5.e.a(hashSet);
    }
}
