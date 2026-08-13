package E2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f2100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f2101b;

    public static void a(java.lang.String str) {
        E2.c.a(str);
    }

    public static void b() {
        E2.c.b();
    }

    private static void c(java.lang.String str, java.lang.Exception exc) {
        if (exc instanceof java.lang.reflect.InvocationTargetException) {
            java.lang.Throwable cause = exc.getCause();
            if (!(cause instanceof java.lang.RuntimeException)) {
                throw new java.lang.RuntimeException(cause);
            }
            throw ((java.lang.RuntimeException) cause);
        }
        java.lang.String str2 = "Unable to call " + str + " via reflection";
    }

    public static boolean d() {
        try {
            if (f2101b == null) {
                return android.os.Trace.isEnabled();
            }
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        try {
            if (f2101b == null) {
                f2100a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2101b = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            }
            return ((java.lang.Boolean) f2101b.invoke(null, java.lang.Long.valueOf(f2100a))).booleanValue();
        } catch (java.lang.Exception e6) {
            c("isTagEnabled", e6);
            return false;
        }
    }
}
