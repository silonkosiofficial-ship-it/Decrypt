package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f21602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f21603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.reflect.Method f21604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.lang.reflect.Method f21605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.lang.reflect.Method f21606e;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                f21602a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                java.lang.Class cls = java.lang.Long.TYPE;
                f21603b = android.os.Trace.class.getMethod("isTagEnabled", cls);
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                f21604c = android.os.Trace.class.getMethod("asyncTraceBegin", cls, java.lang.String.class, cls2);
                f21605d = android.os.Trace.class.getMethod("asyncTraceEnd", cls, java.lang.String.class, cls2);
                f21606e = android.os.Trace.class.getMethod("traceCounter", cls, java.lang.String.class, cls2);
            } catch (java.lang.Exception e6) {
            }
        }
    }

    public static void a(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }

    public static void b() {
        android.os.Trace.endSection();
    }
}
