package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23524a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Field f23525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f23526c;

    static class a {
        static float a(android.view.View view) {
            return view.getTransitionAlpha();
        }

        static void b(android.view.View view, float f6) {
            view.setTransitionAlpha(f6);
        }
    }

    D() {
    }

    public void a(android.view.View view) {
    }

    public float b(android.view.View view) {
        if (f23524a) {
            try {
                return androidx.transition.D.a.a(view);
            } catch (java.lang.NoSuchMethodError unused) {
                f23524a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(android.view.View view) {
    }

    public abstract void d(android.view.View view, int i6, int i10, int i11, int i12);

    public void e(android.view.View view, float f6) {
        if (f23524a) {
            try {
                androidx.transition.D.a.b(view, f6);
                return;
            } catch (java.lang.NoSuchMethodError unused) {
                f23524a = false;
            }
        }
        view.setAlpha(f6);
    }

    public void f(android.view.View view, int i6) {
        if (!f23526c) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mViewFlags");
                f23525b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            f23526c = true;
        }
        java.lang.reflect.Field field = f23525b;
        if (field != null) {
            try {
                f23525b.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (java.lang.IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(android.view.View view, android.graphics.Matrix matrix);

    public abstract void h(android.view.View view, android.graphics.Matrix matrix);
}
