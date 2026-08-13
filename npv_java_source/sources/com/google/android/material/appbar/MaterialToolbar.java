package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private static final int f42804D0 = p125m4.i.f50713t;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private static final android.widget.ImageView.ScaleType[] f42805E0 = {android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private boolean f42806A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private android.widget.ImageView.ScaleType f42807B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private java.lang.Boolean f42808C0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private java.lang.Integer f42809y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f42810z0;

    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50506X);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int i10 = f42804D0;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p125m4.j.f50940c4, i6, i10, new int[0]);
        if (typedArrayI.hasValue(p125m4.j.f50964f4)) {
            setNavigationIconTint(typedArrayI.getColor(p125m4.j.f50964f4, -1));
        }
        this.f42810z0 = typedArrayI.getBoolean(p125m4.j.f50980h4, false);
        this.f42806A0 = typedArrayI.getBoolean(p125m4.j.f50972g4, false);
        int i11 = typedArrayI.getInt(p125m4.j.f50956e4, -1);
        if (i11 >= 0) {
            android.widget.ImageView.ScaleType[] scaleTypeArr = f42805E0;
            if (i11 < scaleTypeArr.length) {
                this.f42807B0 = scaleTypeArr[i11];
            }
        }
        if (typedArrayI.hasValue(p125m4.j.f50948d4)) {
            this.f42808C0 = java.lang.Boolean.valueOf(typedArrayI.getBoolean(p125m4.j.f50948d4, false));
        }
        typedArrayI.recycle();
        U(context2);
    }

    private android.util.Pair T(android.widget.TextView textView, android.widget.TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i6 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            android.view.View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new android.util.Pair(java.lang.Integer.valueOf(paddingLeft), java.lang.Integer.valueOf(paddingRight));
    }

    private void U(android.content.Context context) {
        android.graphics.drawable.Drawable background = getBackground();
        android.content.res.ColorStateList colorStateListValueOf = background == null ? android.content.res.ColorStateList.valueOf(0) : com.google.android.material.drawable.d.f(background);
        if (colorStateListValueOf != null) {
            E4.g gVar = new E4.g();
            gVar.V(colorStateListValueOf);
            gVar.K(context);
            gVar.U(androidx.core.view.X.u(this));
            androidx.core.view.X.r0(this, gVar);
        }
    }

    private void V(android.view.View view, android.util.Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i6 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i6;
        int iMax = java.lang.Math.max(java.lang.Math.max(((java.lang.Integer) pair.first).intValue() - i6, 0), java.lang.Math.max(i10 - ((java.lang.Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i6 += iMax;
            i10 -= iMax;
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i10 - i6, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i6, view.getTop(), i10, view.getBottom());
    }

    private void W() {
        if (this.f42810z0 || this.f42806A0) {
            android.widget.TextView textViewE = com.google.android.material.internal.l.e(this);
            android.widget.TextView textViewC = com.google.android.material.internal.l.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            android.util.Pair pairT = T(textViewE, textViewC);
            if (this.f42810z0 && textViewE != null) {
                V(textViewE, pairT);
            }
            if (!this.f42806A0 || textViewC == null) {
                return;
            }
            V(textViewC, pairT);
        }
    }

    private android.graphics.drawable.Drawable X(android.graphics.drawable.Drawable drawable) {
        if (drawable == null || this.f42809y0 == null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable.mutate());
        androidx.core.graphics.drawable.a.n(drawableR, this.f42809y0.intValue());
        return drawableR;
    }

    private void Y() {
        android.widget.ImageView imageViewB = com.google.android.material.internal.l.b(this);
        if (imageViewB != null) {
            java.lang.Boolean bool = this.f42808C0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            android.widget.ImageView.ScaleType scaleType = this.f42807B0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public android.widget.ImageView.ScaleType getLogoScaleType() {
        return this.f42807B0;
    }

    public java.lang.Integer getNavigationIconTint() {
        return this.f42809y0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        E4.h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        W();
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        E4.h.d(this, f6);
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        java.lang.Boolean bool = this.f42808C0;
        if (bool == null || bool.booleanValue() != z6) {
            this.f42808C0 = java.lang.Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (this.f42807B0 != scaleType) {
            this.f42807B0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        super.setNavigationIcon(X(drawable));
    }

    public void setNavigationIconTint(int i6) {
        this.f42809y0 = java.lang.Integer.valueOf(i6);
        android.graphics.drawable.Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f42806A0 != z6) {
            this.f42806A0 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f42810z0 != z6) {
            this.f42810z0 = z6;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void z(int i6) {
        android.view.Menu menu = getMenu();
        boolean z6 = menu instanceof androidx.appcompat.view.menu.g;
        if (z6) {
            ((androidx.appcompat.view.menu.g) menu).d0();
        }
        super.z(i6);
        if (z6) {
            ((androidx.appcompat.view.menu.g) menu).c0();
        }
    }
}
