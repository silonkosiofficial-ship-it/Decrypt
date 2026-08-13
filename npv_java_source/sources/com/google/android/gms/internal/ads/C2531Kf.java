package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2531Kf extends com.google.android.gms.internal.ads.AbstractC2568Lf {
    C2531Kf() {
    }

    private static final java.lang.String b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i6 = 0;
        int i10 = 0;
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0) {
            int i11 = length - 1;
            if (str.charAt(i11) != ',') {
                break;
            }
            length = i11;
        }
        if (length < i10) {
            return null;
        }
        if (i10 != 0) {
            i6 = i10;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i6, length);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2568Lf
    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String strB = b(str);
        java.lang.String strB2 = b(str2);
        if (android.text.TextUtils.isEmpty(strB)) {
            return strB2;
        }
        if (android.text.TextUtils.isEmpty(strB2)) {
            return strB;
        }
        return strB + "," + strB2;
    }
}
