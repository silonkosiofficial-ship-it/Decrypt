package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZM {
    public static java.lang.String a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
                if (jSONObjectOptJSONObject != null) {
                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    org.json.JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (b(jSONArrayOptJSONArray2, str) && !b(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    private static boolean b(org.json.JSONArray jSONArray, java.lang.String str) {
        if (jSONArray != null && str != null) {
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                java.lang.String strOptString = jSONArray.optString(i6);
                try {
                    if ((((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Oa)).booleanValue() ? java.util.regex.Pattern.compile(strOptString, 2) : java.util.regex.Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (java.util.regex.PatternSyntaxException e6) {
                    p174r3.v.s().x(e6, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
