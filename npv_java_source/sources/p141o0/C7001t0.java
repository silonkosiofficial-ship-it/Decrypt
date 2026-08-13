package p141o0;

/* JADX INFO: renamed from: o0.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7001t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p141o0.C7001t0 f52252a = new p141o0.C7001t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f52253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.reflect.Method f52254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f52255d;

    private C7001t0() {
    }

    public final void a(android.graphics.Canvas canvas, boolean z6) {
        java.lang.reflect.Method method;
        java.lang.reflect.Method declaredMethod;
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            p141o0.C7010w0.f52258a.a(canvas, z6);
            return;
        }
        if (!f52255d) {
            try {
                if (i6 == 28) {
                    java.lang.reflect.Method declaredMethod2 = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass());
                    f52253b = (java.lang.reflect.Method) declaredMethod2.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new java.lang.Class[0]);
                    declaredMethod = (java.lang.reflect.Method) declaredMethod2.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new java.lang.Class[0]);
                } else {
                    f52253b = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    declaredMethod = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                f52254c = declaredMethod;
                java.lang.reflect.Method method2 = f52253b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                java.lang.reflect.Method method3 = f52254c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            f52255d = true;
        }
        if (z6) {
            try {
                java.lang.reflect.Method method4 = f52253b;
                if (method4 != null) {
                    p247y7.AbstractC7350t.c(method4);
                    method4.invoke(canvas, null);
                }
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                return;
            }
        }
        if (z6 || (method = f52254c) == null) {
            return;
        }
        p247y7.AbstractC7350t.c(method);
        method.invoke(canvas, null);
    }
}
