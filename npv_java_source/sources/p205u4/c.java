package p205u4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static android.graphics.Rect a(android.content.Context context, int i6, int i10) {
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context, null, p125m4.j.f51034o2, i6, i10, new int[0]);
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(p125m4.j.f51058r2, context.getResources().getDimensionPixelSize(p125m4.c.f50547I));
        int dimensionPixelSize2 = typedArrayI.getDimensionPixelSize(p125m4.j.f51066s2, context.getResources().getDimensionPixelSize(p125m4.c.f50548J));
        int dimensionPixelSize3 = typedArrayI.getDimensionPixelSize(p125m4.j.f51050q2, context.getResources().getDimensionPixelSize(p125m4.c.f50546H));
        int dimensionPixelSize4 = typedArrayI.getDimensionPixelSize(p125m4.j.f51042p2, context.getResources().getDimensionPixelSize(p125m4.c.f50545G));
        typedArrayI.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new android.graphics.Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public static android.graphics.drawable.InsetDrawable b(android.graphics.drawable.Drawable drawable, android.graphics.Rect rect) {
        return new android.graphics.drawable.InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
