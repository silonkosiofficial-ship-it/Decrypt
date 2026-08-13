package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends com.google.android.material.appbar.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final android.graphics.Rect f42828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final android.graphics.Rect f42829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42831g;

    public e() {
        this.f42828d = new android.graphics.Rect();
        this.f42829e = new android.graphics.Rect();
        this.f42830f = 0;
    }

    public e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42828d = new android.graphics.Rect();
        this.f42829e = new android.graphics.Rect();
        this.f42830f = 0;
    }

    private static int N(int i6) {
        if (i6 == 0) {
            return 8388659;
        }
        return i6;
    }

    @Override // com.google.android.material.appbar.f
    protected void F(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        int bottom;
        android.view.View viewH = H(coordinatorLayout.r(view));
        if (viewH != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams();
            android.graphics.Rect rect = this.f42828d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((android.view.ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((android.view.ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            androidx.core.view.C2038y0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && androidx.core.view.X.w(coordinatorLayout) && !androidx.core.view.X.w(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            android.graphics.Rect rect2 = this.f42829e;
            androidx.core.view.AbstractC2025s.a(N(fVar.f21342c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i6);
            int I10 = I(viewH);
            view.layout(rect2.left, rect2.top - I10, rect2.right, rect2.bottom - I10);
            bottom = rect2.top - viewH.getBottom();
        } else {
            super.F(coordinatorLayout, view, i6);
            bottom = 0;
        }
        this.f42830f = bottom;
    }

    abstract android.view.View H(java.util.List list);

    final int I(android.view.View view) {
        if (this.f42831g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i6 = this.f42831g;
        return p222w1.a.b((int) (fJ * i6), 0, i6);
    }

    abstract float J(android.view.View view);

    public final int K() {
        return this.f42831g;
    }

    int L(android.view.View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f42830f;
    }

    public final void O(int i6) {
        this.f42831g = i6;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, int i11, int i12) {
        android.view.View viewH;
        androidx.core.view.C2038y0 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 != -1 && i13 != -2) || (viewH = H(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = android.view.View.MeasureSpec.getSize(i11);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (androidx.core.view.X.w(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iL -= measuredHeight;
        }
        coordinatorLayout.J(view, i6, i10, android.view.View.MeasureSpec.makeMeasureSpec(iL, i13 == -1 ? 1073741824 : Integer.MIN_VALUE), i12);
        return true;
    }
}
