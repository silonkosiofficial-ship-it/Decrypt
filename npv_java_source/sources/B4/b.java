package B4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static android.util.TypedValue a(android.content.Context context, int i6) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(android.content.Context context, int i6, boolean z6) {
        android.util.TypedValue typedValueA = a(context, i6);
        if (typedValueA == null || typedValueA.type != 18) {
            return z6;
        }
        return typedValueA.data != 0;
    }

    public static int c(android.content.Context context, int i6, int i10) {
        android.util.TypedValue typedValueA = a(context, i6);
        return (typedValueA == null || typedValueA.type != 16) ? i10 : typedValueA.data;
    }

    public static int d(android.content.Context context, int i6, java.lang.String str) {
        return e(context, i6, str).data;
    }

    public static android.util.TypedValue e(android.content.Context context, int i6, java.lang.String str) {
        android.util.TypedValue typedValueA = a(context, i6);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i6)));
    }

    public static android.util.TypedValue f(android.view.View view, int i6) {
        return e(view.getContext(), i6, view.getClass().getCanonicalName());
    }
}
