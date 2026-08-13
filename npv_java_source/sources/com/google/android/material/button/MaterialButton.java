package com.google.android.material.button;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends androidx.appcompat.widget.C1900f implements android.widget.Checkable, E4.n {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final int[] f42966T = {android.R.attr.state_checkable};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final int[] f42967U = {android.R.attr.state_checked};

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final int f42968V = p125m4.i.f50703j;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.material.button.a f42969F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.LinkedHashSet f42970G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.material.button.MaterialButton.a f42971H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f42972I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private android.content.res.ColorStateList f42973J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.graphics.drawable.Drawable f42974K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.lang.String f42975L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f42976M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f42977N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f42978O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f42979P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f42980Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f42981R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f42982S;

    interface a {
        void a(com.google.android.material.button.MaterialButton materialButton, boolean z6);
    }

    static class b extends I1.a {
        public static final android.os.Parcelable.Creator<com.google.android.material.button.MaterialButton.b> CREATOR = new com.google.android.material.button.MaterialButton.b.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f42983E;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.button.MaterialButton.b createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.button.MaterialButton.b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.button.MaterialButton.b createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.button.MaterialButton.b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.button.MaterialButton.b[] newArray(int i6) {
                return new com.google.android.material.button.MaterialButton.b[i6];
            }
        }

        public b(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        public b(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        private void b(android.os.Parcel parcel) {
            this.f42983E = parcel.readInt() == 1;
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f42983E ? 1 : 0);
        }
    }

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50528v);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int i10 = f42968V;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        this.f42970G = new java.util.LinkedHashSet();
        this.f42980Q = false;
        this.f42981R = false;
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p125m4.j.f50739D2, i6, i10, new int[0]);
        this.f42979P = typedArrayI.getDimensionPixelSize(p125m4.j.f50843Q2, 0);
        this.f42972I = com.google.android.material.internal.n.i(typedArrayI.getInt(p125m4.j.f50867T2, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f42973J = B4.c.a(getContext(), typedArrayI, p125m4.j.f50859S2);
        this.f42974K = B4.c.d(getContext(), typedArrayI, p125m4.j.f50827O2);
        this.f42982S = typedArrayI.getInteger(p125m4.j.f50835P2, 1);
        this.f42976M = typedArrayI.getDimensionPixelSize(p125m4.j.f50851R2, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, E4.k.e(context2, attributeSet, i6, i10).m());
        this.f42969F = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f42979P);
        h(this.f42974K != null);
    }

    private boolean b() {
        int i6 = this.f42982S;
        return i6 == 3 || i6 == 4;
    }

    private boolean c() {
        int i6 = this.f42982S;
        return i6 == 1 || i6 == 2;
    }

    private boolean d() {
        int i6 = this.f42982S;
        return i6 == 16 || i6 == 32;
    }

    private boolean e() {
        return androidx.core.view.X.z(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f42969F;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            androidx.core.widget.h.i(this, this.f42974K, null, null, null);
        } else if (b()) {
            androidx.core.widget.h.i(this, null, null, this.f42974K, null);
        } else if (d()) {
            androidx.core.widget.h.i(this, null, this.f42974K, null, null);
        }
    }

    private android.text.Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_CENTER;
    }

    private android.text.Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        return android.text.Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        android.text.TextPaint paint = getPaint();
        java.lang.String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return java.lang.Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i6 = 0; i6 < lineCount; i6++) {
            fMax = java.lang.Math.max(fMax, getLayout().getLineWidth(i6));
        }
        return (int) java.lang.Math.ceil(fMax);
    }

    private void h(boolean z6) {
        android.graphics.drawable.Drawable drawable = this.f42974K;
        if (drawable != null) {
            android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f42974K = drawableMutate;
            androidx.core.graphics.drawable.a.o(drawableMutate, this.f42973J);
            android.graphics.PorterDuff.Mode mode = this.f42972I;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f42974K, mode);
            }
            int intrinsicWidth = this.f42976M;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f42974K.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f42976M;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f42974K.getIntrinsicHeight();
            }
            android.graphics.drawable.Drawable drawable2 = this.f42974K;
            int i6 = this.f42977N;
            int i10 = this.f42978O;
            drawable2.setBounds(i6, i10, intrinsicWidth + i6, intrinsicHeight + i10);
            this.f42974K.setVisible(true, z6);
        }
        if (z6) {
            g();
            return;
        }
        android.graphics.drawable.Drawable[] drawableArrA = androidx.core.widget.h.a(this);
        android.graphics.drawable.Drawable drawable3 = drawableArrA[0];
        android.graphics.drawable.Drawable drawable4 = drawableArrA[1];
        android.graphics.drawable.Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f42974K) && ((!b() || drawable5 == this.f42974K) && (!d() || drawable4 == this.f42974K))) {
            return;
        }
        g();
    }

    private void i(int i6, int i10) {
        if (this.f42974K == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f42977N = 0;
                if (this.f42982S == 16) {
                    this.f42978O = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f42976M;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f42974K.getIntrinsicHeight();
                }
                int iMax = java.lang.Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f42979P) - getPaddingBottom()) / 2);
                if (this.f42978O != iMax) {
                    this.f42978O = iMax;
                    h(false);
                }
                return;
            }
            return;
        }
        this.f42978O = 0;
        android.text.Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.f42982S;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == android.text.Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == android.text.Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f42977N = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f42976M;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f42974K.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i6 - getTextLayoutWidth()) - androidx.core.view.X.D(this)) - intrinsicWidth) - this.f42979P) - androidx.core.view.X.E(this);
        if (actualTextAlignment == android.text.Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f42982S == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f42977N != textLayoutWidth) {
            this.f42977N = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f42969F;
        return aVar != null && aVar.p();
    }

    java.lang.String getA11yClassName() {
        if (android.text.TextUtils.isEmpty(this.f42975L)) {
            return (a() ? android.widget.CompoundButton.class : android.widget.Button.class).getName();
        }
        return this.f42975L;
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f42969F.b();
        }
        return 0;
    }

    public android.graphics.drawable.Drawable getIcon() {
        return this.f42974K;
    }

    public int getIconGravity() {
        return this.f42982S;
    }

    public int getIconPadding() {
        return this.f42979P;
    }

    public int getIconSize() {
        return this.f42976M;
    }

    public android.content.res.ColorStateList getIconTint() {
        return this.f42973J;
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f42972I;
    }

    public int getInsetBottom() {
        return this.f42969F.c();
    }

    public int getInsetTop() {
        return this.f42969F.d();
    }

    public android.content.res.ColorStateList getRippleColor() {
        if (f()) {
            return this.f42969F.h();
        }
        return null;
    }

    public E4.k getShapeAppearanceModel() {
        if (f()) {
            return this.f42969F.i();
        }
        throw new java.lang.IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public android.content.res.ColorStateList getStrokeColor() {
        if (f()) {
            return this.f42969F.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f42969F.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C1900f
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f42969F.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C1900f
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f42969F.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f42980Q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            E4.h.f(this, this.f42969F.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (a()) {
            android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, f42966T);
        }
        if (isChecked()) {
            android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, f42967U);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C1900f, android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C1900f, android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C1900f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.button.MaterialButton.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.button.MaterialButton.b bVar = (com.google.android.material.button.MaterialButton.b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f42983E);
    }

    @Override // android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.button.MaterialButton.b bVar = new com.google.android.material.button.MaterialButton.b(super.onSaveInstanceState());
        bVar.f42983E = this.f42980Q;
        return bVar;
    }

    @Override // androidx.appcompat.widget.C1900f, android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        super.onTextChanged(charSequence, i6, i10, i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f42969F.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f42974K != null) {
            if (this.f42974K.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(java.lang.String str) {
        this.f42975L = str;
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (f()) {
            this.f42969F.s(i6);
        } else {
            super.setBackgroundColor(i6);
        }
    }

    @Override // androidx.appcompat.widget.C1900f, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (f()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            this.f42969F.t();
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C1900f, android.view.View
    public void setBackgroundResource(int i6) {
        setBackgroundDrawable(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (f()) {
            this.f42969F.u(z6);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (a() && isEnabled() && this.f42980Q != z6) {
            this.f42980Q = z6;
            refreshDrawableState();
            if (getParent() instanceof com.google.android.material.button.MaterialButtonToggleGroup) {
                ((com.google.android.material.button.MaterialButtonToggleGroup) getParent()).m(this, this.f42980Q);
            }
            if (this.f42981R) {
                return;
            }
            this.f42981R = true;
            java.util.Iterator it = this.f42970G.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                throw null;
            }
            this.f42981R = false;
        }
    }

    public void setCornerRadius(int i6) {
        if (f()) {
            this.f42969F.v(i6);
        }
    }

    public void setCornerRadiusResource(int i6) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (f()) {
            this.f42969F.f().U(f6);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (this.f42974K != drawable) {
            this.f42974K = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i6) {
        if (this.f42982S != i6) {
            this.f42982S = i6;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i6) {
        if (this.f42979P != i6) {
            this.f42979P = i6;
            setCompoundDrawablePadding(i6);
        }
    }

    public void setIconResource(int i6) {
        setIcon(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
    }

    public void setIconSize(int i6) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f42976M != i6) {
            this.f42976M = i6;
            h(true);
        }
    }

    public void setIconTint(android.content.res.ColorStateList colorStateList) {
        if (this.f42973J != colorStateList) {
            this.f42973J = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f42972I != mode) {
            this.f42972I = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i6) {
        setIconTint(p100k.a.a(getContext(), i6));
    }

    public void setInsetBottom(int i6) {
        this.f42969F.w(i6);
    }

    public void setInsetTop(int i6) {
        this.f42969F.x(i6);
    }

    void setInternalBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(com.google.android.material.button.MaterialButton.a aVar) {
        this.f42971H = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        com.google.android.material.button.MaterialButton.a aVar = this.f42971H;
        if (aVar != null) {
            aVar.a(this, z6);
        }
        super.setPressed(z6);
    }

    public void setRippleColor(android.content.res.ColorStateList colorStateList) {
        if (f()) {
            this.f42969F.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i6) {
        if (f()) {
            setRippleColor(p100k.a.a(getContext(), i6));
        }
    }

    @Override // E4.n
    public void setShapeAppearanceModel(E4.k kVar) {
        if (!f()) {
            throw new java.lang.IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f42969F.z(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (f()) {
            this.f42969F.A(z6);
        }
    }

    public void setStrokeColor(android.content.res.ColorStateList colorStateList) {
        if (f()) {
            this.f42969F.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i6) {
        if (f()) {
            setStrokeColor(p100k.a.a(getContext(), i6));
        }
    }

    public void setStrokeWidth(int i6) {
        if (f()) {
            this.f42969F.C(i6);
        }
    }

    public void setStrokeWidthResource(int i6) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // androidx.appcompat.widget.C1900f
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        if (f()) {
            this.f42969F.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C1900f
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        if (f()) {
            this.f42969F.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i6) {
        super.setTextAlignment(i6);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z6) {
        this.f42969F.F(z6);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f42980Q);
    }
}
