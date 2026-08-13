package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1993b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f21704a;

    /* JADX INFO: renamed from: androidx.core.view.b0$a */
    static class a {
        static float a(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.b0$b */
    static class b {
        static int a(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.b0$c */
    static class c {
        static int a(android.view.ViewConfiguration viewConfiguration, int i6, int i10, int i11) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i6, i10, i11);
        }

        static int b(android.view.ViewConfiguration viewConfiguration, int i6, int i10, int i11) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i6, i10, i11);
        }
    }

    static {
        if (android.os.Build.VERSION.SDK_INT == 25) {
            try {
                f21704a = android.view.ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private static int a(android.content.res.Resources resources, int i6, B1.j jVar, int i10) {
        int dimensionPixelSize;
        if (i6 != -1) {
            return (i6 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i6)) < 0) ? i10 : dimensionPixelSize;
        }
        return ((java.lang.Integer) jVar.get()).intValue();
    }

    private static float b(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 25 && (method = f21704a) != null) {
            try {
                return ((java.lang.Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (java.lang.Exception unused) {
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int c(android.content.res.Resources resources, java.lang.String str, java.lang.String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int d(android.content.res.Resources resources, int i6, int i10) {
        if (i6 == 4194304 && i10 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int e(android.content.res.Resources resources, int i6, int i10) {
        if (i6 == 4194304 && i10 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? androidx.core.view.AbstractC1993b0.a.a(viewConfiguration) : b(viewConfiguration, context);
    }

    public static int g(android.view.ViewConfiguration viewConfiguration) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? androidx.core.view.AbstractC1993b0.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(android.content.Context context, final android.view.ViewConfiguration viewConfiguration, int i6, int i10, int i11) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.AbstractC1993b0.c.a(viewConfiguration, i6, i10, i11);
        }
        if (!k(i6, i10, i11)) {
            return Integer.MIN_VALUE;
        }
        android.content.res.Resources resources = context.getResources();
        int iD = d(resources, i11, i10);
        j$.util.Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new B1.j() { // from class: androidx.core.view.Z
            @Override // B1.j
            public final java.lang.Object get() {
                return java.lang.Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(android.content.Context context, final android.view.ViewConfiguration viewConfiguration, int i6, int i10, int i11) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.AbstractC1993b0.c.b(viewConfiguration, i6, i10, i11);
        }
        if (!k(i6, i10, i11)) {
            return Integer.MAX_VALUE;
        }
        android.content.res.Resources resources = context.getResources();
        int iE = e(resources, i11, i10);
        j$.util.Objects.requireNonNull(viewConfiguration);
        return a(resources, iE, new B1.j() { // from class: androidx.core.view.a0
            @Override // B1.j
            public final java.lang.Object get() {
                return java.lang.Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float j(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? androidx.core.view.AbstractC1993b0.a.b(viewConfiguration) : b(viewConfiguration, context);
    }

    private static boolean k(int i6, int i10, int i11) {
        android.view.InputDevice device = android.view.InputDevice.getDevice(i6);
        return (device == null || device.getMotionRange(i10, i11) == null) ? false : true;
    }

    public static boolean l(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.AbstractC1993b0.b.b(viewConfiguration);
        }
        android.content.res.Resources resources = context.getResources();
        int iC = c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iC != 0 && resources.getBoolean(iC);
    }
}
