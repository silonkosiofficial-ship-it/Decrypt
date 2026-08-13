package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes3.dex */
public final class Snackbar$SnackbarLayout extends com.google.android.material.snackbar.BaseTransientBottomBar.c {
    public Snackbar$SnackbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c, android.view.View
    public /* bridge */ /* synthetic */ void setBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        super.setBackgroundTintMode(mode);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c, android.view.View
    public /* bridge */ /* synthetic */ void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c, android.view.View
    public /* bridge */ /* synthetic */ void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }
}
