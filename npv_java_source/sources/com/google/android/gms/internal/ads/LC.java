package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LC {
    public static int a(int i6, int i10, int i11) {
        if (i6 < 0 || i6 >= i11) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return i6;
    }

    public static java.lang.Object b(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.IllegalStateException();
    }

    public static java.lang.String c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return str;
    }

    public static void d(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void e(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void f(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void g(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
