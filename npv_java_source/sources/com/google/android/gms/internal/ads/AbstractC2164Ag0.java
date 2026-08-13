package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ag0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2164Ag0 {
    public static int a(int i6, int i10, java.lang.String str) {
        java.lang.String strB;
        if (i6 >= 0 && i6 < i10) {
            return i6;
        }
        if (i6 < 0) {
            strB = com.google.android.gms.internal.ads.AbstractC2829Sg0.b("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i6));
        } else {
            if (i10 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i10);
            }
            strB = com.google.android.gms.internal.ads.AbstractC2829Sg0.b("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        throw new java.lang.IndexOutOfBoundsException(strB);
    }

    public static int b(int i6, int i10, java.lang.String str) {
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IndexOutOfBoundsException(n(i6, i10, "index"));
        }
        return i6;
    }

    public static java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException((java.lang.String) obj2);
    }

    public static java.lang.Object d(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(com.google.android.gms.internal.ads.AbstractC2829Sg0.b(str, obj2));
    }

    public static void e(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void f(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void g(boolean z6, java.lang.String str, char c6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.AbstractC2829Sg0.b(str, java.lang.Character.valueOf(c6)));
        }
    }

    public static void h(boolean z6, java.lang.String str, long j6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.AbstractC2829Sg0.b(str, java.lang.Long.valueOf(j6)));
        }
    }

    public static void i(boolean z6, java.lang.String str, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.AbstractC2829Sg0.b(str, obj));
        }
    }

    public static void j(boolean z6, java.lang.String str, int i6, int i10) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.AbstractC2829Sg0.b(str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10)));
        }
    }

    public static void k(int i6, int i10, int i11) {
        java.lang.String strN;
        if (i6 < 0 || i10 < i6 || i10 > i11) {
            if (i6 < 0 || i6 > i11) {
                strN = n(i6, i11, "start index");
            } else {
                strN = (i10 < 0 || i10 > i11) ? n(i10, i11, "end index") : com.google.android.gms.internal.ads.AbstractC2829Sg0.b("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i6));
            }
            throw new java.lang.IndexOutOfBoundsException(strN);
        }
    }

    public static void l(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void m(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalStateException((java.lang.String) obj);
        }
    }

    private static java.lang.String n(int i6, int i10, java.lang.String str) {
        if (i6 < 0) {
            return com.google.android.gms.internal.ads.AbstractC2829Sg0.b("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return com.google.android.gms.internal.ads.AbstractC2829Sg0.b("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i10);
    }
}
