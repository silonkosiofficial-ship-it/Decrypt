package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6294t {
    public static int a(int i6, int i10, java.lang.String str) {
        java.lang.String strA;
        if (i6 >= 0 && i6 < i10) {
            return i6;
        }
        if (i6 < 0) {
            strA = com.google.android.gms.internal.play_billing.AbstractC6300u.a("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i6));
        } else {
            if (i10 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i10);
            }
            strA = com.google.android.gms.internal.play_billing.AbstractC6300u.a("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        throw new java.lang.IndexOutOfBoundsException(strA);
    }

    public static int b(int i6, int i10, java.lang.String str) {
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IndexOutOfBoundsException(f(i6, i10, "index"));
        }
        return i6;
    }

    public static java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException((java.lang.String) obj2);
    }

    public static void d(boolean z6, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.AbstractC6300u.a(str, obj, obj2));
        }
    }

    public static void e(int i6, int i10, int i11) {
        java.lang.String strF;
        if (i6 < 0 || i10 < i6 || i10 > i11) {
            if (i6 < 0 || i6 > i11) {
                strF = f(i6, i11, "start index");
            } else {
                strF = (i10 < 0 || i10 > i11) ? f(i10, i11, "end index") : com.google.android.gms.internal.play_billing.AbstractC6300u.a("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i6));
            }
            throw new java.lang.IndexOutOfBoundsException(strF);
        }
    }

    private static java.lang.String f(int i6, int i10, java.lang.String str) {
        if (i6 < 0) {
            return com.google.android.gms.internal.play_billing.AbstractC6300u.a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return com.google.android.gms.internal.play_billing.AbstractC6300u.a("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i10);
    }
}
