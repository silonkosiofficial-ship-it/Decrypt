package p214v3;

/* JADX INFO: renamed from: v3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7240e {
    public static android.os.Bundle a(android.content.Context context, java.lang.String str, android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (android.text.TextUtils.isEmpty(str)) {
            return android.os.Bundle.EMPTY;
        }
        android.preference.PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }

    public static android.os.Bundle b(android.content.Context context, java.lang.String str) {
        org.json.JSONArray jSONArray;
        int i6;
        java.lang.Object obj;
        android.content.SharedPreferences sharedPreferences;
        java.lang.Object obj2;
        if (android.text.TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new org.json.JSONArray(str);
            } catch (org.json.JSONException e6) {
                p224w3.p.c("JSON parsing error", e6);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return android.os.Bundle.EMPTY;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("bk");
            java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i6 = 1;
            } else if (iOptInt != 1) {
                i6 = iOptInt != 2 ? 0 : 3;
            } else {
                i6 = 2;
            }
            if (!android.text.TextUtils.isEmpty(strOptString) && !android.text.TextUtils.isEmpty(strOptString2) && i6 != 0) {
                java.util.List listF = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c('/')).f(strOptString2);
                if (listF.size() > 2 || listF.isEmpty()) {
                    obj = null;
                } else {
                    if (listF.size() == 1) {
                        sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
                        obj2 = listF.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((java.lang.String) listF.get(0), 0);
                        obj2 = listF.get(1);
                    }
                    obj = sharedPreferences.getAll().get((java.lang.String) obj2);
                }
                if (obj != null) {
                    int i11 = i6 - 1;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (obj instanceof java.lang.Boolean) {
                                bundle.putBoolean(strOptString, ((java.lang.Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof java.lang.Integer) {
                            bundle.putInt(strOptString, ((java.lang.Integer) obj).intValue());
                        } else if (obj instanceof java.lang.Long) {
                            bundle.putLong(strOptString, ((java.lang.Long) obj).longValue());
                        } else if (obj instanceof java.lang.Float) {
                            bundle.putFloat(strOptString, ((java.lang.Float) obj).floatValue());
                        }
                    } else if (obj instanceof java.lang.String) {
                        bundle.putString(strOptString, (java.lang.String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void c(android.content.Context context) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            com.google.android.gms.internal.ads.C2677Oe0 c2677Oe0K = com.google.android.gms.internal.ads.C2677Oe0.k(context);
            com.google.android.gms.internal.ads.C2714Pe0 c2714Pe0J = com.google.android.gms.internal.ads.C2714Pe0.j(context);
            com.google.android.gms.internal.ads.C2751Qe0 c2751Qe0A = com.google.android.gms.internal.ads.C2751Qe0.a(context);
            c2677Oe0K.l();
            c2677Oe0K.m();
            c2714Pe0J.k();
            c2751Qe0A.b(null);
        } catch (java.io.IOException e6) {
            p174r3.v.s().x(e6, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new java.io.IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (java.io.IOException e10) {
            p174r3.v.s().x(e10, "clearStorageOnIdlessMode_scar");
        }
    }
}
