package com.google.android.material.drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    private static class a {
        static void a(android.graphics.Outline outline, android.graphics.Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class b {
        static void a(android.graphics.Outline outline, android.graphics.Path path) {
            outline.setPath(path);
        }
    }

    public static android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    public static android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i6, int i10) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i6 == -1) {
            i6 = h(drawable, drawable2);
        }
        if (i10 == -1) {
            i10 = g(drawable, drawable2);
        }
        if (i6 > drawable.getIntrinsicWidth() || i10 > drawable.getIntrinsicHeight()) {
            float f6 = i6 / i10;
            if (f6 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i10 = (int) (intrinsicWidth / f6);
                i6 = intrinsicWidth;
            } else {
                i10 = drawable.getIntrinsicHeight();
                i6 = (int) (f6 * i10);
            }
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i6, i10);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        return d(drawable, colorStateList, mode, false);
    }

    private static android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, boolean z6) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        } else if (z6) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] e(int[] iArr) {
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i10 = iArr[i6];
            if (i10 == 16842912) {
                return iArr;
            }
            if (i10 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i6] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static android.content.res.ColorStateList f(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            return android.content.res.ColorStateList.valueOf(((android.graphics.drawable.ColorDrawable) drawable).getColor());
        }
        if (android.os.Build.VERSION.SDK_INT < 29 || !com.google.android.material.drawable.a.a(drawable)) {
            return null;
        }
        return com.google.android.material.drawable.b.a(drawable).getColorStateList();
    }

    private static int g(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int h(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    public static void i(android.graphics.Outline outline, android.graphics.Path path) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            com.google.android.material.drawable.d.b.a(outline, path);
            return;
        }
        if (i6 >= 29) {
            try {
                com.google.android.material.drawable.d.a.a(outline, path);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            com.google.android.material.drawable.d.a.a(outline, path);
        }
    }

    public static android.graphics.PorterDuffColorFilter j(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
