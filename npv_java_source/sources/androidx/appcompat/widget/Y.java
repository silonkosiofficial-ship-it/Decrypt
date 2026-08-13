package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f18394a = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f18395b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f18396c = {android.R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f18397d = {android.R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f18398e = {android.R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f18399f = {android.R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f18400g = {android.R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f18401h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f18402i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f18403j = new int[1];

    public static void a(android.view.View view, android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p090j.j.f49022y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(p090j.j.f48810D0)) {
                java.lang.String str = "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).";
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(android.content.Context context, int i6) {
        android.content.res.ColorStateList colorStateListE = e(context, i6);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f18395b, colorStateListE.getDefaultColor());
        }
        android.util.TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValueF, true);
        return d(context, i6, typedValueF.getFloat());
    }

    public static int c(android.content.Context context, int i6) {
        int[] iArr = f18403j;
        iArr[0] = i6;
        androidx.appcompat.widget.c0 c0VarU = androidx.appcompat.widget.c0.u(context, null, iArr);
        try {
            return c0VarU.b(0, 0);
        } finally {
            c0VarU.w();
        }
    }

    static int d(android.content.Context context, int i6, float f6) {
        int iC = c(context, i6);
        return androidx.core.graphics.a.k(iC, java.lang.Math.round(android.graphics.Color.alpha(iC) * f6));
    }

    public static android.content.res.ColorStateList e(android.content.Context context, int i6) {
        int[] iArr = f18403j;
        iArr[0] = i6;
        androidx.appcompat.widget.c0 c0VarU = androidx.appcompat.widget.c0.u(context, null, iArr);
        try {
            return c0VarU.c(0);
        } finally {
            c0VarU.w();
        }
    }

    private static android.util.TypedValue f() {
        java.lang.ThreadLocal threadLocal = f18394a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
