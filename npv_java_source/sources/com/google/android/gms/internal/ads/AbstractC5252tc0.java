package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5252tc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.view.WindowManager f38997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f38998b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static float f38999c = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    public static org.json.JSONObject a(int i6, int i10, int i11, int i12) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("x", i6 / f38999c);
            jSONObject.put("y", i10 / f38999c);
            jSONObject.put("width", i11 / f38999c);
            jSONObject.put("height", i12 / f38999c);
        } catch (org.json.JSONException e6) {
            com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error with creating viewStateObject", e6);
        }
        return jSONObject;
    }

    public static void b(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (org.json.JSONException e6) {
            com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error with setting ad session id", e6);
        }
    }

    public static void c(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new org.json.JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (org.json.JSONException e6) {
            e6.printStackTrace();
        }
    }

    public static void d(android.content.Context context) {
        if (context != null) {
            f38999c = context.getResources().getDisplayMetrics().density;
            f38997a = (android.view.WindowManager) context.getSystemService("window");
        }
    }

    public static void e(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (java.lang.NullPointerException | org.json.JSONException e6) {
            com.google.android.gms.internal.ads.AbstractC5362uc0.a("JSONException during JSONObject.put for name [" + str + "]", e6);
        }
    }

    public static void f(org.json.JSONObject jSONObject) {
        float f6;
        float f10;
        if (f38997a != null) {
            android.graphics.Point point = new android.graphics.Point(0, 0);
            f38997a.getDefaultDisplay().getRealSize(point);
            float f11 = point.x;
            float f12 = f38999c;
            f6 = f11 / f12;
            f10 = point.y / f12;
        } else {
            f6 = 0.0f;
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f6);
            jSONObject.put("height", f10);
        } catch (org.json.JSONException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[LOOP:1: B:42:0x00ab->B:46:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[SYNTHETIC] */
    public static boolean g(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONArray jSONArrayOptJSONArray;
        org.json.JSONArray jSONArrayOptJSONArray2;
        int i6;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            java.lang.String[] strArr = f38998b;
            for (int i10 = 0; i10 < 4; i10++) {
                java.lang.String str = strArr[i10];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && java.lang.Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && java.lang.Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                org.json.JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                org.json.JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null) {
                    }
                    if (h(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                        for (i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                            if (g(jSONArrayOptJSONArray.optJSONObject(i6), jSONArrayOptJSONArray2.optJSONObject(i6))) {
                            }
                        }
                        return true;
                    }
                } else if (h(jSONArrayOptJSONArray3, jSONArrayOptJSONArray4)) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                        if (jSONArrayOptJSONArray3.optString(i11, "").equals(jSONArrayOptJSONArray4.optString(i11, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                        if (h(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                            while (i6 < jSONArrayOptJSONArray.length()) {
                                if (g(jSONArrayOptJSONArray.optJSONObject(i6), jSONArrayOptJSONArray2.optJSONObject(i6))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean h(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
