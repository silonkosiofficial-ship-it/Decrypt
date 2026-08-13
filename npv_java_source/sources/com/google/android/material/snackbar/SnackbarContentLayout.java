package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.widget.TextView f43610C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.widget.Button f43611D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43612E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f43613F;

    public SnackbarContentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43612E = p245y4.d.g(context, p125m4.a.f50490H, p135n4.a.f51491b);
    }

    private static void a(android.view.View view, int i6, int i10) {
        if (androidx.core.view.X.T(view)) {
            androidx.core.view.X.B0(view, androidx.core.view.X.E(view), i6, androidx.core.view.X.D(view), i10);
        } else {
            view.setPadding(view.getPaddingLeft(), i6, view.getPaddingRight(), i10);
        }
    }

    private boolean b(int i6, int i10, int i11) {
        boolean z6;
        if (i6 != getOrientation()) {
            setOrientation(i6);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f43610C.getPaddingTop() == i10 && this.f43610C.getPaddingBottom() == i11) {
            return z6;
        }
        a(this.f43610C, i10, i11);
        return true;
    }

    public android.widget.Button getActionView() {
        return this.f43611D;
    }

    public android.widget.TextView getMessageView() {
        return this.f43610C;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f43610C = (android.widget.TextView) findViewById(p125m4.e.f50615G);
        this.f43611D = (android.widget.Button) findViewById(p125m4.e.f50614F);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(p125m4.c.f50573e);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(p125m4.c.f50571d);
        android.text.Layout layout = this.f43610C.getLayout();
        boolean z6 = layout != null && layout.getLineCount() > 1;
        if (!z6 || this.f43613F <= 0 || this.f43611D.getMeasuredWidth() <= this.f43613F) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i6, i10);
    }

    public void setMaxInlineActionWidth(int i6) {
        this.f43613F = i6;
    }
}
