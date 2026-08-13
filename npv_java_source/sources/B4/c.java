package B4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static android.content.res.ColorStateList a(android.content.Context context, android.content.res.TypedArray typedArray, int i6) {
        int resourceId;
        android.content.res.ColorStateList colorStateListA;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (colorStateListA = p100k.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i6) : colorStateListA;
    }

    public static android.content.res.ColorStateList b(android.content.Context context, androidx.appcompat.widget.c0 c0Var, int i6) {
        int iN;
        android.content.res.ColorStateList colorStateListA;
        return (!c0Var.s(i6) || (iN = c0Var.n(i6, 0)) == 0 || (colorStateListA = p100k.a.a(context, iN)) == null) ? c0Var.c(i6) : colorStateListA;
    }

    public static int c(android.content.Context context, android.content.res.TypedArray typedArray, int i6, int i10) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!typedArray.getValue(i6, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i6, i10);
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i10);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static android.graphics.drawable.Drawable d(android.content.Context context, android.content.res.TypedArray typedArray, int i6) {
        int resourceId;
        android.graphics.drawable.Drawable drawableB;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (drawableB = p100k.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i6) : drawableB;
    }

    static int e(android.content.res.TypedArray typedArray, int i6, int i10) {
        return typedArray.hasValue(i6) ? i6 : i10;
    }

    public static B4.d f(android.content.Context context, android.content.res.TypedArray typedArray, int i6) {
        int resourceId;
        if (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0) {
            return null;
        }
        return new B4.d(context, resourceId);
    }

    public static boolean g(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
