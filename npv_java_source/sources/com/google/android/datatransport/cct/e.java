package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static java.lang.String a(java.lang.String str, java.lang.String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new java.lang.IllegalArgumentException("Invalid input received");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + str2.length());
        for (int i6 = 0; i6 < str.length(); i6++) {
            sb.append(str.charAt(i6));
            if (str2.length() > i6) {
                sb.append(str2.charAt(i6));
            }
        }
        return sb.toString();
    }
}
