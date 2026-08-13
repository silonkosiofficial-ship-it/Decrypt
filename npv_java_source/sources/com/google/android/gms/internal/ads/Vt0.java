package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Vt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f32605a = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f32606b = java.util.regex.Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(java.lang.String str, java.lang.String str2) {
        long j6 = -1;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                j6 = java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.internal.ads.AbstractC3586eM.c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return j6;
        }
        java.util.regex.Matcher matcher = f32605a.matcher(str2);
        if (!matcher.matches()) {
            return j6;
        }
        try {
            java.lang.String strGroup = matcher.group(2);
            if (strGroup == null) {
                throw null;
            }
            long j10 = java.lang.Long.parseLong(strGroup);
            java.lang.String strGroup2 = matcher.group(1);
            if (strGroup2 == null) {
                throw null;
            }
            long j11 = (j10 - java.lang.Long.parseLong(strGroup2)) + 1;
            if (j6 < 0) {
                return j11;
            }
            if (j6 == j11) {
                return j6;
            }
            com.google.android.gms.internal.ads.AbstractC3586eM.f("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return java.lang.Math.max(j6, j11);
        } catch (java.lang.NumberFormatException unused2) {
            com.google.android.gms.internal.ads.AbstractC3586eM.c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j6;
        }
    }

    public static long b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        java.util.regex.Matcher matcher = f32606b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        java.lang.String strGroup = matcher.group(1);
        strGroup.getClass();
        return java.lang.Long.parseLong(strGroup);
    }
}
