package com.google.android.material.chip;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends androidx.appcompat.widget.C1901g implements com.google.android.material.chip.a.InterfaceC0473a, E4.n, android.widget.Checkable {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f43093b0 = p125m4.i.f50704k;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final android.graphics.Rect f43094c0 = new android.graphics.Rect();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int[] f43095d0 = {android.R.attr.state_selected};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int[] f43096e0 = {android.R.attr.state_checkable};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.material.chip.a f43097G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.graphics.drawable.InsetDrawable f43098H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.graphics.drawable.RippleDrawable f43099I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private android.view.View.OnClickListener f43100J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.widget.CompoundButton.OnCheckedChangeListener f43101K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f43102L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f43103M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f43104N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f43105O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f43106P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f43107Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f43108R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private java.lang.CharSequence f43109S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final com.google.android.material.chip.Chip.c f43110T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f43111U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final android.graphics.Rect f43112V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final android.graphics.RectF f43113W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final B4.f f43114a0;

    class a extends B4.f {
        a() {
        }

        @Override // B4.f
        public void a(int i6) {
        }

        @Override // B4.f
        public void b(android.graphics.Typeface typeface, boolean z6) {
            com.google.android.material.chip.Chip chip = com.google.android.material.chip.Chip.this;
            chip.setText(chip.f43097G.I2() ? com.google.android.material.chip.Chip.this.f43097G.d1() : com.google.android.material.chip.Chip.this.getText());
            com.google.android.material.chip.Chip.this.requestLayout();
            com.google.android.material.chip.Chip.this.invalidate();
        }
    }

    class b extends android.view.ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, android.graphics.Outline outline) {
            if (com.google.android.material.chip.Chip.this.f43097G != null) {
                com.google.android.material.chip.Chip.this.f43097G.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends J1.a {
        c(com.google.android.material.chip.Chip chip) {
            super(chip);
        }

        @Override // J1.a
        protected int B(float f6, float f10) {
            return (com.google.android.material.chip.Chip.this.n() && com.google.android.material.chip.Chip.this.getCloseIconTouchBounds().contains(f6, f10)) ? 1 : 0;
        }

        @Override // J1.a
        protected void C(java.util.List list) {
            list.add(0);
            if (com.google.android.material.chip.Chip.this.n() && com.google.android.material.chip.Chip.this.s() && com.google.android.material.chip.Chip.this.f43100J != null) {
                list.add(1);
            }
        }

        @Override // J1.a
        protected boolean J(int i6, int i10, android.os.Bundle bundle) {
            if (i10 != 16) {
                return false;
            }
            if (i6 == 0) {
                return com.google.android.material.chip.Chip.this.performClick();
            }
            if (i6 == 1) {
                return com.google.android.material.chip.Chip.this.u();
            }
            return false;
        }

        @Override // J1.a
        protected void M(C1.B b6) {
            b6.k0(com.google.android.material.chip.Chip.this.r());
            b6.n0(com.google.android.material.chip.Chip.this.isClickable());
            b6.m0(com.google.android.material.chip.Chip.this.getAccessibilityClassName());
            b6.S0(com.google.android.material.chip.Chip.this.getText());
        }

        @Override // J1.a
        protected void N(int i6, C1.B b6) {
            if (i6 != 1) {
                b6.q0("");
                b6.i0(com.google.android.material.chip.Chip.f43094c0);
                return;
            }
            java.lang.CharSequence closeIconContentDescription = com.google.android.material.chip.Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                java.lang.CharSequence text = com.google.android.material.chip.Chip.this.getText();
                closeIconContentDescription = com.google.android.material.chip.Chip.this.getContext().getString(p125m4.h.f50681k, android.text.TextUtils.isEmpty(text) ? "" : text).trim();
            }
            b6.q0(closeIconContentDescription);
            b6.i0(com.google.android.material.chip.Chip.this.getCloseIconTouchBoundsInt());
            b6.b(C1.B.a.f1243i);
            b6.t0(com.google.android.material.chip.Chip.this.isEnabled());
        }

        @Override // J1.a
        protected void O(int i6, boolean z6) {
            if (i6 == 1) {
                com.google.android.material.chip.Chip.this.f43105O = z6;
                com.google.android.material.chip.Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50512f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int i10 = f43093b0;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        this.f43112V = new android.graphics.Rect();
        this.f43113W = new android.graphics.RectF();
        this.f43114a0 = new com.google.android.material.chip.Chip.a();
        android.content.Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarR0 = com.google.android.material.chip.a.r0(context2, attributeSet, i6, i10);
        o(context2, attributeSet, i6);
        setChipDrawable(aVarR0);
        aVarR0.U(androidx.core.view.X.u(this));
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p125m4.j.f51096w0, i6, i10, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(p125m4.j.f50977h1);
        typedArrayI.recycle();
        this.f43110T = new com.google.android.material.chip.Chip.c(this);
        y();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f43102L);
        setText(aVarR0.d1());
        setEllipsize(aVarR0.X0());
        C();
        if (!this.f43097G.I2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f43108R);
        }
        this.f43107Q = androidx.core.view.X.z(this);
        super.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: s4.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z6) {
                this.f54356a.t(compoundButton, z6);
            }
        });
    }

    private void A() {
        this.f43099I = new android.graphics.drawable.RippleDrawable(C4.b.a(this.f43097G.b1()), getBackgroundDrawable(), null);
        this.f43097G.H2(false);
        androidx.core.view.X.r0(this, this.f43099I);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (android.text.TextUtils.isEmpty(getText()) || (aVar = this.f43097G) == null) {
            return;
        }
        int iF0 = (int) (aVar.F0() + this.f43097G.f1() + this.f43097G.m0());
        int iK0 = (int) (this.f43097G.K0() + this.f43097G.g1() + this.f43097G.i0());
        if (this.f43098H != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.f43098H.getPadding(rect);
            iK0 += rect.left;
            iF0 += rect.right;
        }
        androidx.core.view.X.B0(this, iK0, getPaddingTop(), iF0, getPaddingBottom());
    }

    private void C() {
        android.text.TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        B4.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f43114a0);
        }
    }

    private void D(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new java.lang.UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.RectF getCloseIconTouchBounds() {
        this.f43113W.setEmpty();
        if (n() && this.f43100J != null) {
            this.f43097G.U0(this.f43113W);
        }
        return this.f43113W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.Rect getCloseIconTouchBoundsInt() {
        android.graphics.RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f43112V.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f43112V;
    }

    private B4.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.l2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i6 = IsEnabled;
        if (this.f43105O) {
            i6 = IsEnabled + 1;
        }
        int i10 = i6;
        if (this.f43104N) {
            i10 = i6 + 1;
        }
        int i11 = i10;
        if (this.f43103M) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (isChecked()) {
            i12 = i11 + 1;
        }
        int[] iArr = new int[i12];
        int i13 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i13 = 1;
        }
        if (this.f43105O) {
            iArr[i13] = 16842908;
            i13++;
        }
        if (this.f43104N) {
            iArr[i13] = 16843623;
            i13++;
        }
        if (this.f43103M) {
            iArr[i13] = 16842919;
            i13++;
        }
        if (isChecked()) {
            iArr[i13] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f43098H && this.f43097G.getCallback() == null) {
            this.f43097G.setCallback(this.f43098H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f43097G;
        return (aVar == null || aVar.N0() == null) ? false : true;
    }

    private void o(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context, attributeSet, p125m4.j.f51096w0, i6, f43093b0, new int[0]);
        this.f43106P = typedArrayI.getBoolean(p125m4.j.f50937c1, false);
        this.f43108R = (int) java.lang.Math.ceil(typedArrayI.getDimension(p125m4.j.f50841Q0, (float) java.lang.Math.ceil(com.google.android.material.internal.n.c(getContext(), 48))));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new com.google.android.material.chip.Chip.b());
    }

    private void q(int i6, int i10, int i11, int i12) {
        this.f43098H = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) this.f43097G, i6, i10, i11, i12);
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f43104N != z6) {
            this.f43104N = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f43103M != z6) {
            this.f43103M = z6;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(android.widget.CompoundButton compoundButton, boolean z6) {
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f43101K;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z6);
        }
    }

    private void v() {
        if (this.f43098H != null) {
            this.f43098H = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.l2(null);
        }
    }

    private void y() {
        boolean z6;
        if (n() && s() && this.f43100J != null) {
            androidx.core.view.X.n0(this, this.f43110T);
            z6 = true;
        } else {
            androidx.core.view.X.n0(this, null);
            z6 = false;
        }
        this.f43111U = z6;
    }

    private void z() {
        if (C4.b.f1290a) {
            A();
            return;
        }
        this.f43097G.H2(true);
        androidx.core.view.X.r0(this, getBackgroundDrawable());
        B();
        m();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0473a
    public void a() {
        l(this.f43108R);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        if (this.f43111U) {
            return this.f43110T.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (!this.f43111U) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f43110T.w(keyEvent) || this.f43110T.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C1901g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f43097G;
        if ((aVar == null || !aVar.l1()) ? false : this.f43097G.h2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        if (!android.text.TextUtils.isEmpty(this.f43109S)) {
            return this.f43109S;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable() {
        android.graphics.drawable.InsetDrawable insetDrawable = this.f43098H;
        return insetDrawable == null ? this.f43097G : insetDrawable;
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return java.lang.Math.max(0.0f, aVar.E0());
        }
        return 0.0f;
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
        return this.f43097G;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public android.graphics.drawable.Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getChipText() {
        return getText();
    }

    public android.graphics.drawable.Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.f43111U && (this.f43110T.A() == 1 || this.f43110T.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public p135n4.d getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public E4.k getShapeAppearanceModel() {
        return this.f43097G.B();
    }

    public p135n4.d getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public boolean l(int i6) {
        this.f43108R = i6;
        if (!w()) {
            if (this.f43098H != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = java.lang.Math.max(0, i6 - this.f43097G.getIntrinsicHeight());
        int iMax2 = java.lang.Math.max(0, i6 - this.f43097G.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f43098H != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f43098H != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.f43098H.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i6) {
            setMinHeight(i6);
        }
        if (getMinWidth() != i6) {
            setMinWidth(i6);
        }
        q(i10, i11, i10, i11);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        E4.h.f(this, this.f43097G);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (isChecked()) {
            android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, f43095d0);
        }
        if (r()) {
            android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, f43096e0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z6, int i6, android.graphics.Rect rect) {
        super.onFocusChanged(z6, i6, rect);
        if (this.f43111U) {
            this.f43110T.I(z6, i6, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i6) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? android.view.PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i6);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.f43107Q != i6) {
            this.f43107Q = i6;
            B();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f43103M) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z6 = true;
                }
                z6 = false;
            } else {
                if (this.f43103M) {
                    u();
                    z6 = true;
                }
                setCloseIconPressed(false);
            }
            z6 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f43097G;
        return aVar != null && aVar.k1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f43097G;
        return aVar != null && aVar.m1();
    }

    public void setAccessibilityClassName(java.lang.CharSequence charSequence) {
        this.f43109S = charSequence;
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f43099I) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
    }

    @Override // androidx.appcompat.widget.C1901g, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f43099I) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C1901g, android.view.View
    public void setBackgroundResource(int i6) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.t1(z6);
        }
    }

    public void setCheckableResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.u1(i6);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar == null) {
            this.f43102L = z6;
        } else if (aVar.k1()) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.v1(drawable);
        }
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(int i6) {
        setCheckedIconVisible(i6);
    }

    public void setCheckedIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.w1(i6);
        }
    }

    public void setCheckedIconTint(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.x1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.y1(i6);
        }
    }

    public void setCheckedIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.z1(i6);
        }
    }

    public void setCheckedIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.A1(z6);
        }
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.B1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.C1(i6);
        }
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.D1(f6);
        }
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.E1(i6);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f43097G;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f43097G = aVar;
            aVar.w2(false);
            j(this.f43097G);
            l(this.f43108R);
        }
    }

    public void setChipEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.F1(f6);
        }
    }

    public void setChipEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.G1(i6);
        }
    }

    public void setChipIcon(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.H1(drawable);
        }
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(int i6) {
        setChipIconVisible(i6);
    }

    public void setChipIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.I1(i6);
        }
    }

    public void setChipIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.J1(f6);
        }
    }

    public void setChipIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.K1(i6);
        }
    }

    public void setChipIconTint(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.L1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.M1(i6);
        }
    }

    public void setChipIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.N1(i6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.O1(z6);
        }
    }

    public void setChipMinHeight(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.P1(f6);
        }
    }

    public void setChipMinHeightResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.Q1(i6);
        }
    }

    public void setChipStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.R1(f6);
        }
    }

    public void setChipStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.S1(i6);
        }
    }

    public void setChipStrokeColor(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.T1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.U1(i6);
        }
    }

    public void setChipStrokeWidth(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.V1(f6);
        }
    }

    public void setChipStrokeWidthResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.W1(i6);
        }
    }

    @java.lang.Deprecated
    public void setChipText(java.lang.CharSequence charSequence) {
        setText(charSequence);
    }

    @java.lang.Deprecated
    public void setChipTextResource(int i6) {
        setText(getResources().getString(i6));
    }

    public void setCloseIcon(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.Y1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(java.lang.CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.Z1(charSequence);
        }
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(int i6) {
        setCloseIconVisible(i6);
    }

    public void setCloseIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.a2(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.b2(i6);
        }
    }

    public void setCloseIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.c2(i6);
        }
        y();
    }

    public void setCloseIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.d2(f6);
        }
    }

    public void setCloseIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.e2(i6);
        }
    }

    public void setCloseIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.f2(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.g2(i6);
        }
    }

    public void setCloseIconTint(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.i2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.j2(i6);
        }
    }

    public void setCloseIconVisible(int i6) {
        setCloseIconVisible(getResources().getBoolean(i6));
    }

    public void setCloseIconVisible(boolean z6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.k2(z6);
        }
        y();
    }

    @Override // androidx.appcompat.widget.C1901g, android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C1901g, android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        if (i6 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i6, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        if (i6 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i6, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.U(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        if (this.f43097G == null) {
            return;
        }
        if (truncateAt == android.text.TextUtils.TruncateAt.MARQUEE) {
            throw new java.lang.UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.m2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f43106P = z6;
        l(this.f43108R);
    }

    @Override // android.widget.TextView
    public void setGravity(int i6) {
        if (i6 != 8388627) {
            return;
        }
        super.setGravity(i6);
    }

    public void setHideMotionSpec(p135n4.d dVar) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.n2(dVar);
        }
    }

    public void setHideMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.o2(i6);
        }
    }

    public void setIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.p2(f6);
        }
    }

    public void setIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.q2(i6);
        }
    }

    public void setIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.r2(f6);
        }
    }

    public void setIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.s2(i6);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        if (this.f43097G == null) {
            return;
        }
        super.setLayoutDirection(i6);
    }

    @Override // android.widget.TextView
    public void setLines(int i6) {
        if (i6 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i6) {
        if (i6 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i6) {
        super.setMaxWidth(i6);
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.t2(i6);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i6) {
        if (i6 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i6);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f43101K = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(android.view.View.OnClickListener onClickListener) {
        this.f43100J = onClickListener;
        y();
    }

    public void setRippleColor(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.u2(colorStateList);
        }
        if (this.f43097G.i1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.v2(i6);
            if (this.f43097G.i1()) {
                return;
            }
            A();
        }
    }

    @Override // E4.n
    public void setShapeAppearanceModel(E4.k kVar) {
        this.f43097G.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(p135n4.d dVar) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.x2(dVar);
        }
    }

    public void setShowMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.y2(i6);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.I2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f43097G;
        if (aVar2 != null) {
            aVar2.z2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i6) {
        super.setTextAppearance(i6);
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.B2(i6);
        }
        C();
    }

    public void setTextAppearance(B4.d dVar) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.A2(dVar);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i6) {
        super.setTextAppearance(context, i6);
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.B2(i6);
        }
        C();
    }

    public void setTextAppearanceResource(int i6) {
        setTextAppearance(getContext(), i6);
    }

    public void setTextEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.C2(f6);
        }
    }

    public void setTextEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.D2(i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        super.setTextSize(i6, f6);
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.E2(android.util.TypedValue.applyDimension(i6, f6, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.F2(f6);
        }
    }

    public void setTextStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f43097G;
        if (aVar != null) {
            aVar.G2(i6);
        }
    }

    public boolean u() {
        boolean z6 = false;
        playSoundEffect(0);
        android.view.View.OnClickListener onClickListener = this.f43100J;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z6 = true;
        }
        if (this.f43111U) {
            this.f43110T.U(1, 1);
        }
        return z6;
    }

    public boolean w() {
        return this.f43106P;
    }
}
