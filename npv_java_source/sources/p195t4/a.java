package p195t4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static int a(int i6, int i10) {
        return androidx.core.graphics.a.k(i6, (android.graphics.Color.alpha(i6) * i10) / 255);
    }

    public static int b(android.content.Context context, int i6, int i10) {
        java.lang.Integer numF = f(context, i6);
        return numF != null ? numF.intValue() : i10;
    }

    public static int c(android.content.Context context, int i6, java.lang.String str) {
        return l(context, B4.b.e(context, i6, str));
    }

    public static int d(android.view.View view, int i6) {
        return l(view.getContext(), B4.b.f(view, i6));
    }

    public static int e(android.view.View view, int i6, int i10) {
        return b(view.getContext(), i6, i10);
    }

    public static java.lang.Integer f(android.content.Context context, int i6) {
        android.util.TypedValue typedValueA = B4.b.a(context, i6);
        if (typedValueA != null) {
            return java.lang.Integer.valueOf(l(context, typedValueA));
        }
        return null;
    }

    public static android.content.res.ColorStateList g(android.content.Context context, int i6) {
        android.util.TypedValue typedValueA = B4.b.a(context, i6);
        if (typedValueA == null) {
            return null;
        }
        int i10 = typedValueA.resourceId;
        if (i10 != 0) {
            return androidx.core.content.a.d(context, i10);
        }
        int i11 = typedValueA.data;
        if (i11 != 0) {
            return android.content.res.ColorStateList.valueOf(i11);
        }
        return null;
    }

    public static boolean h(int i6) {
        return i6 != 0 && androidx.core.graphics.a.d(i6) > 0.5d;
    }

    public static int i(int i6, int i10) {
        return androidx.core.graphics.a.g(i10, i6);
    }

    public static int j(int i6, int i10, float f6) {
        return i(i6, androidx.core.graphics.a.k(i10, java.lang.Math.round(android.graphics.Color.alpha(i10) * f6)));
    }

    public static int k(android.view.View view, int i6, int i10, float f6) {
        return j(d(view, i6), d(view, i10), f6);
    }

    private static int l(android.content.Context context, android.util.TypedValue typedValue) {
        int i6 = typedValue.resourceId;
        return i6 != 0 ? androidx.core.content.a.c(context, i6) : typedValue.data;
    }
}
