package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    private static java.lang.String a(int i6, int i10, java.lang.String str) {
        if (i6 < 0) {
            return M4.j.a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return M4.j.a("%s (%s) must be less than size (%s)", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i10);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static java.lang.String b(int i6, int i10, java.lang.String str) {
        if (i6 < 0) {
            return M4.j.a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return M4.j.a("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i10);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static java.lang.String c(int i6, int i10, int i11) {
        if (i6 < 0 || i6 > i11) {
            return b(i6, i11, "start index");
        }
        return (i10 < 0 || i10 > i11) ? b(i10, i11, "end index") : M4.j.a("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i6));
    }

    public static void d(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void e(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void f(boolean z6, java.lang.String str, int i6, int i10) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(M4.j.a(str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10)));
        }
    }

    public static int g(int i6, int i10) {
        return h(i6, i10, "index");
    }

    public static int h(int i6, int i10, java.lang.String str) {
        if (i6 < 0 || i6 >= i10) {
            throw new java.lang.IndexOutOfBoundsException(a(i6, i10, str));
        }
        return i6;
    }

    public static java.lang.Object i(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    public static java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj2));
    }

    public static int k(int i6, int i10) {
        return l(i6, i10, "index");
    }

    public static int l(int i6, int i10, java.lang.String str) {
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IndexOutOfBoundsException(b(i6, i10, str));
        }
        return i6;
    }

    public static void m(int i6, int i10, int i11) {
        if (i6 < 0 || i10 < i6 || i10 > i11) {
            throw new java.lang.IndexOutOfBoundsException(c(i6, i10, i11));
        }
    }

    public static void n(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void o(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static void p(boolean z6, java.lang.String str, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalStateException(M4.j.a(str, obj));
        }
    }
}
