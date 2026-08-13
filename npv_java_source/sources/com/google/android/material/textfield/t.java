package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
abstract class t {
    static void a(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            } else {
                androidx.core.graphics.drawable.a.o(drawable, android.content.res.ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static android.widget.ImageView.ScaleType b(int i6) {
        if (i6 == 0) {
            return android.widget.ImageView.ScaleType.FIT_XY;
        }
        if (i6 == 1) {
            return android.widget.ImageView.ScaleType.FIT_START;
        }
        if (i6 == 2) {
            return android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        if (i6 == 3) {
            return android.widget.ImageView.ScaleType.FIT_END;
        }
        if (i6 != 5) {
            return i6 != 6 ? android.widget.ImageView.ScaleType.CENTER : android.widget.ImageView.ScaleType.CENTER_INSIDE;
        }
        return android.widget.ImageView.ScaleType.CENTER_CROP;
    }

    private static int[] c(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        java.lang.System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void d(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
        androidx.core.graphics.drawable.a.o(drawableMutate, android.content.res.ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    static void e(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
    }

    private static void f(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnLongClickListener onLongClickListener) {
        boolean zN = androidx.core.view.X.N(checkableImageButton);
        boolean z6 = onLongClickListener != null;
        boolean z10 = zN || z6;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zN);
        checkableImageButton.setPressable(zN);
        checkableImageButton.setLongClickable(z6);
        androidx.core.view.X.w0(checkableImageButton, z10 ? 1 : 2);
    }

    static void g(com.google.android.material.internal.CheckableImageButton checkableImageButton, int i6) {
        checkableImageButton.setMinimumWidth(i6);
        checkableImageButton.setMinimumHeight(i6);
    }

    static void h(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.widget.ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
