package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B70 {
    public static android.os.Bundle a(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new android.os.Bundle() : bundle2;
    }

    public static void b(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void c(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void d(android.os.Bundle bundle, java.lang.String str, java.util.List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new java.util.ArrayList<>(list));
        }
    }

    public static void e(android.os.Bundle bundle, java.lang.String str, int i6, boolean z6) {
        if (z6) {
            bundle.putInt(str, i6);
        }
    }

    public static void f(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, boolean z6) {
        if (!z6 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void g(android.os.Bundle bundle, java.lang.String str, boolean z6, boolean z10) {
        if (z10) {
            bundle.putBoolean(str, z6);
        }
    }
}
