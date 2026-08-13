package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f18127a = {android.R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f18128b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final android.graphics.Rect f18129c = new android.graphics.Rect();

    public static boolean a(android.graphics.drawable.Drawable drawable) {
        return true;
    }

    static void b(android.graphics.drawable.Drawable drawable) {
        java.lang.String name = drawable.getClass().getName();
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 29 || i6 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(android.graphics.drawable.Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f18127a);
        } else {
            drawable.setState(f18128b);
        }
        drawable.setState(state);
    }

    public static android.graphics.PorterDuff.Mode d(int i6, android.graphics.PorterDuff.Mode mode) {
        if (i6 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
