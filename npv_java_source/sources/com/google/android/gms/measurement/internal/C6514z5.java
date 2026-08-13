package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6514z5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f42754b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f42755a;

    private C6514z5(java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        this.f42755a = map2;
        map2.putAll(map);
    }

    private static int a(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (java.lang.ClassCastException unused) {
            return -1;
        }
    }

    public static com.google.android.gms.measurement.internal.C6514z5 c(android.content.SharedPreferences sharedPreferences) {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String strF = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(strF) && strF.length() > 754) {
            map.put("GoogleConsent", java.lang.String.valueOf(strF.charAt(754)));
        }
        int iA = a(sharedPreferences, "IABTCF_gdprApplies");
        if (iA != -1) {
            map.put("gdprApplies", java.lang.String.valueOf(iA));
        }
        int iA2 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (iA2 != -1) {
            map.put("EnableAdvertiserConsentMode", java.lang.String.valueOf(iA2));
        }
        int iA3 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (iA3 != -1) {
            map.put("PolicyVersion", java.lang.String.valueOf(iA3));
        }
        java.lang.String strF2 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(strF2)) {
            map.put("PurposeConsents", strF2);
        }
        int iA4 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (iA4 != -1) {
            map.put("CmpSdkID", java.lang.String.valueOf(iA4));
        }
        return new com.google.android.gms.measurement.internal.C6514z5(map);
    }

    public static java.lang.String d(java.lang.String str, boolean z6) {
        if (!z6 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i6 = 1;
        while (i6 < 64) {
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6)) {
                charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i6);
                return java.lang.String.valueOf(charArray);
            }
            i6++;
        }
        i6 = 0;
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i6);
        return java.lang.String.valueOf(charArray);
    }

    private static java.lang.String f(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (java.lang.ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int h() {
        try {
            java.lang.String str = (java.lang.String) this.f42755a.get("CmpSdkID");
            if (android.text.TextUtils.isEmpty(str)) {
                return -1;
            }
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            java.lang.String str = (java.lang.String) this.f42755a.get("PolicyVersion");
            if (android.text.TextUtils.isEmpty(str)) {
                return -1;
            }
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public final android.os.Bundle b() {
        if (!"1".equals(this.f42755a.get("GoogleConsent")) || !"1".equals(this.f42755a.get("gdprApplies")) || !"1".equals(this.f42755a.get("EnableAdvertiserConsentMode"))) {
            return android.os.Bundle.EMPTY;
        }
        int i6 = i();
        if (i6 < 0) {
            return android.os.Bundle.EMPTY;
        }
        java.lang.String str = (java.lang.String) this.f42755a.get("PurposeConsents");
        if (android.text.TextUtils.isEmpty(str)) {
            return android.os.Bundle.EMPTY;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = "denied";
        if (str.length() > 0) {
            bundle.putString(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE.f41713C, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(com.google.android.gms.measurement.internal.A3.a.AD_PERSONALIZATION.f41713C, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && i6 >= 4) {
            java.lang.String str3 = com.google.android.gms.measurement.internal.A3.a.AD_USER_DATA.f41713C;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    public final java.lang.String e() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("1");
        int iH = h();
        if (iH < 0 || iH > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((iH >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iH & 63));
        }
        int i6 = i();
        if (i6 < 0 || i6 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6));
        }
        Q3.AbstractC1477p.a(true);
        int i10 = "1".equals(this.f42755a.get("gdprApplies")) ? 2 : 0;
        int i11 = i10 | 4;
        if ("1".equals(this.f42755a.get("EnableAdvertiserConsentMode"))) {
            i11 = i10 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11));
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.measurement.internal.C6514z5) {
            return g().equalsIgnoreCase(((com.google.android.gms.measurement.internal.C6514z5) obj).g());
        }
        return false;
    }

    final java.lang.String g() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : f42754b) {
            if (this.f42755a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((java.lang.String) this.f42755a.get(str));
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final java.lang.String toString() {
        return g();
    }
}
