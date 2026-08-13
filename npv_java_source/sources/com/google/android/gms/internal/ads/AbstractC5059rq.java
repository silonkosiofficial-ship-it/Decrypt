package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5059rq {
    static android.net.Uri a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return android.net.Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i6 = iIndexOf + 1;
        return android.net.Uri.parse(str.substring(0, i6) + str2 + "=" + str3 + "&" + str.substring(i6));
    }

    public static java.lang.String b(android.net.Uri uri, android.content.Context context, java.util.Map map) {
        java.lang.String strA;
        if (p174r3.v.r().p(context) && (strA = p174r3.v.r().a(context)) != null) {
            java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25682s0);
            java.lang.String string = uri.toString();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25672r0)).booleanValue() && string.contains(str)) {
                p174r3.v.r().j(context, strA, (java.util.Map) map.get("_ac"));
                return d(string, context).replace(str, strA);
            }
            if (!android.text.TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                return string;
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25662q0)).booleanValue()) {
                return string;
            }
            java.lang.String string2 = a(d(string, context), "fbs_aeid", strA).toString();
            p174r3.v.r().j(context, strA, (java.util.Map) map.get("_ac"));
            return string2;
        }
        return uri.toString();
    }

    public static java.lang.String c(java.lang.String str, android.content.Context context, boolean z6, java.util.Map map) {
        java.lang.String strA;
        if ((((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25752z0)).booleanValue() && !z6) || !p174r3.v.r().p(context) || android.text.TextUtils.isEmpty(str) || (strA = p174r3.v.r().a(context)) == null) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25682s0);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25672r0)).booleanValue() && str.contains(str2)) {
            if (p174r3.v.t().O(str)) {
                p174r3.v.r().j(context, strA, (java.util.Map) map.get("_ac"));
                return d(str, context).replace(str2, strA);
            }
            if (!p174r3.v.t().P(str)) {
                return str;
            }
            p174r3.v.r().k(context, strA, (java.util.Map) map.get("_ai"));
            return d(str, context).replace(str2, strA);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25662q0)).booleanValue()) {
            return str;
        }
        if (p174r3.v.t().O(str)) {
            p174r3.v.r().j(context, strA, (java.util.Map) map.get("_ac"));
            return a(d(str, context), "fbs_aeid", strA).toString();
        }
        if (!p174r3.v.t().P(str)) {
            return str;
        }
        p174r3.v.r().k(context, strA, (java.util.Map) map.get("_ai"));
        return a(d(str, context), "fbs_aeid", strA).toString();
    }

    private static java.lang.String d(java.lang.String str, android.content.Context context) {
        java.lang.String strD = p174r3.v.r().d(context);
        java.lang.String strB = p174r3.v.r().b(context);
        if (!str.contains("gmp_app_id") && !android.text.TextUtils.isEmpty(strD)) {
            str = a(str, "gmp_app_id", strD).toString();
        }
        return (str.contains("fbs_aiid") || android.text.TextUtils.isEmpty(strB)) ? str : a(str, "fbs_aiid", strB).toString();
    }
}
