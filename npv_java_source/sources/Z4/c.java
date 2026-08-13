package Z4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    private static java.util.Map a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject != org.json.JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (java.lang.Exception e6) {
            Z4.b.f().b("Failed to parse JSONObject into Map:\n" + e6);
            return java.util.Collections.emptyMap();
        }
    }

    public static java.util.Map b(java.lang.String str) {
        Z4.b bVarF;
        java.lang.StringBuilder sb;
        Q3.AbstractC1477p.f(str);
        java.lang.String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            bVarF = Z4.b.f();
            sb = new java.lang.StringBuilder();
            sb.append("Invalid token (too few subsections):\n");
            sb.append(str);
        } else {
            try {
                java.util.Map mapA = a(new java.lang.String(android.util.Base64.decode(strArrSplit[1], 11), "UTF-8"));
                return mapA == null ? java.util.Collections.emptyMap() : mapA;
            } catch (java.io.UnsupportedEncodingException e6) {
                bVarF = Z4.b.f();
                sb = new java.lang.StringBuilder();
                sb.append("Unable to decode token (charset unknown):\n");
                sb.append(e6);
            }
        }
        bVarF.d(sb.toString());
        return java.util.Collections.emptyMap();
    }

    private static java.util.List c(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            java.lang.Object objD = jSONArray.get(i6);
            if (objD instanceof org.json.JSONArray) {
                objD = c((org.json.JSONArray) objD);
            } else if (objD instanceof org.json.JSONObject) {
                objD = d((org.json.JSONObject) objD);
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    private static java.util.Map d(org.json.JSONObject jSONObject) throws org.json.JSONException {
        p170r.C7026a c7026a = new p170r.C7026a();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objD = jSONObject.get(next);
            if (objD instanceof org.json.JSONArray) {
                objD = c((org.json.JSONArray) objD);
            } else if (objD instanceof org.json.JSONObject) {
                objD = d((org.json.JSONObject) objD);
            } else if (objD.equals(org.json.JSONObject.NULL)) {
                objD = null;
            }
            c7026a.put(next, objD);
        }
        return c7026a;
    }
}
