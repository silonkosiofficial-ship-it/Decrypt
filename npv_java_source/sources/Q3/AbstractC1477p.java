package Q3;

/* JADX INFO: renamed from: Q3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1477p {
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

    public static void c(boolean z6, java.lang.String str, java.lang.Object... objArr) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static void d(android.os.Handler handler) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            java.lang.String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void e(java.lang.String str) {
        if (!V3.u.a()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static java.lang.String f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static java.lang.String g(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
        return str;
    }

    public static void h() {
        i("Must not be called on GoogleApiHandler thread.");
    }

    public static void i(java.lang.String str) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != null) {
            java.lang.String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new java.lang.IllegalStateException(str);
            }
        }
    }

    public static void j() {
        k("Must not be called on the main application thread");
    }

    public static void k(java.lang.String str) {
        if (V3.u.a()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static java.lang.Object l(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    public static java.lang.Object m(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj2));
    }

    public static int n(int i6) {
        if (i6 != 0) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException("Given Integer is zero");
    }

    public static void o(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void p(boolean z6, java.lang.Object obj) {
        if (!z6) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
