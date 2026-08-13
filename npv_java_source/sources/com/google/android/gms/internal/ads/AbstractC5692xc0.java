package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5692xc0 {
    public static void a() {
        if (!com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
            throw new java.lang.IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static void c(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void d(java.lang.String str, int i6, java.lang.String str2) {
        if (str.length() > 256) {
            throw new java.lang.IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
    }
}
