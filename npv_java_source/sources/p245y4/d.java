package p245y4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    private static float a(java.lang.String[] strArr, int i6) {
        float f6 = java.lang.Float.parseFloat(strArr[i6]);
        if (f6 >= 0.0f && f6 <= 1.0f) {
            return f6;
        }
        throw new java.lang.IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f6);
    }

    private static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static android.animation.TimeInterpolator c(java.lang.String str) {
        if (!e(str, "cubic-bezier")) {
            if (e(str, "path")) {
                return androidx.core.view.animation.a.b(androidx.core.graphics.h.e(b(str, "path")));
            }
            throw new java.lang.IllegalArgumentException("Invalid motion easing type: " + str);
        }
        java.lang.String[] strArrSplit = b(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return androidx.core.view.animation.a.a(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new java.lang.IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean d(java.lang.String str) {
        return e(str, "cubic-bezier") || e(str, "path");
    }

    private static boolean e(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int f(android.content.Context context, int i6, int i10) {
        return B4.b.c(context, i6, i10);
    }

    public static android.animation.TimeInterpolator g(android.content.Context context, int i6, android.animation.TimeInterpolator timeInterpolator) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new java.lang.IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        java.lang.String strValueOf = java.lang.String.valueOf(typedValue.string);
        return d(strValueOf) ? c(strValueOf) : android.view.animation.AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
