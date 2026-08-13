package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f18558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f18559b;

    static {
        f18559b = android.os.Build.VERSION.SDK_INT >= 27;
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
            f18558a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f18558a.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    public static void a(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2) {
        java.lang.reflect.Method method = f18558a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (java.lang.Exception e6) {
            }
        }
    }

    public static boolean b(android.view.View view) {
        return androidx.core.view.X.z(view) == 1;
    }

    public static void c(android.view.View view) {
        try {
            java.lang.reflect.Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (java.lang.IllegalAccessException e6) {
        } catch (java.lang.NoSuchMethodException unused) {
        } catch (java.lang.reflect.InvocationTargetException e10) {
        }
    }
}
