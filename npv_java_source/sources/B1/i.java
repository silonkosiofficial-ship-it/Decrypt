package B1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void b(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static int c(int i6, int i10, int i11, java.lang.String str) {
        if (i6 < i10) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11)));
        }
        if (i6 <= i11) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11)));
    }

    public static int d(int i6) {
        if (i6 >= 0) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static int e(int i6, java.lang.String str) {
        if (i6 >= 0) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException(str);
    }

    public static int f(int i6, int i10) {
        if ((i6 & i10) == i6) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException("Requested flags 0x" + java.lang.Integer.toHexString(i6) + ", but only 0x" + java.lang.Integer.toHexString(i10) + " are allowed");
    }

    public static java.lang.Object g(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    public static java.lang.Object h(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj2));
    }

    public static void i(boolean z6, java.lang.String str) {
        if (!z6) {
            throw new java.lang.IllegalStateException(str);
        }
    }
}
