package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2293Du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f26785a = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f26786b = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static java.lang.String a(com.google.android.gms.internal.ads.R60 r60) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && r60.f31153T && r60.f31155V.b() && r60.f31162b != 4) {
            com.google.android.gms.internal.ads.MT mt = r60.f31155V.c() == 1 ? com.google.android.gms.internal.ads.MT.VIDEO : com.google.android.gms.internal.ads.MT.HTML_DISPLAY;
            java.lang.String str = r60.f31183l0;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("creativeType", mt.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (org.json.JSONException e6) {
                p224w3.p.h("Unable to build OMID ENV JSON", e6);
            }
        }
        return null;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String... strArr) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.regex.Matcher matcher = f26785a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            java.lang.String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            str = str.substring(iEnd);
        } else if (!f26786b.matcher(str).find() && (str2 = strArr[0]) != null) {
            sb.append(str2);
        }
        sb.append(str);
        return sb.toString();
    }
}
