package p175r4;

/* JADX INFO: loaded from: classes3.dex */
public class b extends androidx.appcompat.widget.C1901g {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f53928d0 = p125m4.i.f50706m;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int[] f53929e0 = {p125m4.a.f50500R};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int[] f53930f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int[][] f53931g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f53932h0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.LinkedHashSet f53933G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.LinkedHashSet f53934H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.content.res.ColorStateList f53935I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f53936J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f53937K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f53938L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.lang.CharSequence f53939M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.graphics.drawable.Drawable f53940N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private android.graphics.drawable.Drawable f53941O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f53942P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    android.content.res.ColorStateList f53943Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    android.content.res.ColorStateList f53944R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f53945S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f53946T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int[] f53947U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f53948V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private java.lang.CharSequence f53949W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private android.widget.CompoundButton.OnCheckedChangeListener f53950a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f53951b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f53952c0;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(android.graphics.drawable.Drawable drawable) {
            super.b(drawable);
            android.content.res.ColorStateList colorStateList = p175r4.b.this.f53943Q;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(android.graphics.drawable.Drawable drawable) {
            super.c(drawable);
            p175r4.b bVar = p175r4.b.this;
            android.content.res.ColorStateList colorStateList = bVar.f53943Q;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.n(drawable, colorStateList.getColorForState(bVar.f53947U, p175r4.b.this.f53943Q.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: renamed from: r4.b$b, reason: collision with other inner class name */
    static class C0701b extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<p175r4.b.C0701b> CREATOR = new p175r4.b.C0701b.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f53954C;

        /* JADX INFO: renamed from: r4.b$b$a */
        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p175r4.b.C0701b createFromParcel(android.os.Parcel parcel) {
                return new p175r4.b.C0701b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p175r4.b.C0701b[] newArray(int i6) {
                return new p175r4.b.C0701b[i6];
            }
        }

        private C0701b(android.os.Parcel parcel) {
            super(parcel);
            this.f53954C = ((java.lang.Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        /* synthetic */ C0701b(android.os.Parcel parcel, r4.b.a aVar) {
            this(parcel);
        }

        C0701b(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        private java.lang.String a() {
            int i6 = this.f53954C;
            if (i6 != 1) {
                return i6 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        public java.lang.String toString() {
            return "MaterialCheckBox.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(java.lang.Integer.valueOf(this.f53954C));
        }
    }

    static {
        int i6 = p125m4.a.f50499Q;
        f53930f0 = new int[]{i6};
        f53931g0 = new int[][]{new int[]{android.R.attr.state_enabled, i6}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f53932h0 = android.content.res.Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50511e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int i10 = f53928d0;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        this.f53933G = new java.util.LinkedHashSet();
        this.f53934H = new java.util.LinkedHashSet();
        this.f53951b0 = androidx.vectordrawable.graphics.drawable.c.a(getContext(), p125m4.d.f50603f);
        this.f53952c0 = new r4.b.a();
        android.content.Context context2 = getContext();
        this.f53940N = androidx.core.widget.c.a(this);
        this.f53943Q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        androidx.appcompat.widget.c0 c0VarJ = com.google.android.material.internal.k.j(context2, attributeSet, p125m4.j.f51121z3, i6, i10, new int[0]);
        this.f53941O = c0VarJ.g(p125m4.j.f50732C3);
        if (this.f53940N != null && com.google.android.material.internal.k.g(context2) && c(c0VarJ)) {
            super.setButtonDrawable((android.graphics.drawable.Drawable) null);
            this.f53940N = p100k.a.b(context2, p125m4.d.f50602e);
            this.f53942P = true;
            if (this.f53941O == null) {
                this.f53941O = p100k.a.b(context2, p125m4.d.f50604g);
            }
        }
        this.f53944R = B4.c.b(context2, c0VarJ, p125m4.j.f50740D3);
        this.f53945S = com.google.android.material.internal.n.i(c0VarJ.k(p125m4.j.f50748E3, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f53936J = c0VarJ.a(p125m4.j.f50788J3, false);
        this.f53937K = c0VarJ.a(p125m4.j.f50756F3, true);
        this.f53938L = c0VarJ.a(p125m4.j.f50780I3, false);
        this.f53939M = c0VarJ.p(p125m4.j.f50772H3);
        if (c0VarJ.s(p125m4.j.f50764G3)) {
            setCheckedState(c0VarJ.k(p125m4.j.f50764G3, 0));
        }
        c0VarJ.w();
        e();
    }

    private boolean c(androidx.appcompat.widget.c0 c0Var) {
        return c0Var.n(p125m4.j.f50718A3, 0) == f53932h0 && c0Var.n(p125m4.j.f50725B3, 0) == 0;
    }

    private void e() {
        this.f53940N = com.google.android.material.drawable.d.c(this.f53940N, this.f53943Q, androidx.core.widget.c.c(this));
        this.f53941O = com.google.android.material.drawable.d.c(this.f53941O, this.f53944R, this.f53945S);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.d.a(this.f53940N, this.f53941O));
        refreshDrawableState();
    }

    private void f() {
        if (android.os.Build.VERSION.SDK_INT < 30 || this.f53949W != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f53942P) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f53951b0;
            if (cVar2 != null) {
                cVar2.g(this.f53952c0);
                this.f53951b0.c(this.f53952c0);
            }
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                android.graphics.drawable.Drawable drawable = this.f53940N;
                if (!(drawable instanceof android.graphics.drawable.AnimatedStateListDrawable) || (cVar = this.f53951b0) == null) {
                    return;
                }
                ((android.graphics.drawable.AnimatedStateListDrawable) drawable).addTransition(p125m4.e.f50626b, p125m4.e.f50624P, cVar, false);
                ((android.graphics.drawable.AnimatedStateListDrawable) this.f53940N).addTransition(p125m4.e.f50632h, p125m4.e.f50624P, this.f53951b0, false);
            }
        }
    }

    private java.lang.String getButtonStateDescription() {
        android.content.res.Resources resources;
        int i6;
        int i10 = this.f53946T;
        if (i10 == 1) {
            resources = getResources();
            i6 = p125m4.h.f50678h;
        } else if (i10 == 0) {
            resources = getResources();
            i6 = p125m4.h.f50680j;
        } else {
            resources = getResources();
            i6 = p125m4.h.f50679i;
        }
        return resources.getString(i6);
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
        if (this.f53935I == null) {
            int[][] iArr = f53931g0;
            int[] iArr2 = new int[iArr.length];
            int iD = p195t4.a.d(this, p125m4.a.f50514h);
            int iD2 = p195t4.a.d(this, p125m4.a.f50516j);
            int iD3 = p195t4.a.d(this, p125m4.a.f50520n);
            int iD4 = p195t4.a.d(this, p125m4.a.f50517k);
            iArr2[0] = p195t4.a.j(iD3, iD2, 1.0f);
            iArr2[1] = p195t4.a.j(iD3, iD, 1.0f);
            iArr2[2] = p195t4.a.j(iD3, iD4, 0.54f);
            iArr2[3] = p195t4.a.j(iD3, iD4, 0.38f);
            iArr2[4] = p195t4.a.j(iD3, iD4, 0.38f);
            this.f53935I = new android.content.res.ColorStateList(iArr, iArr2);
        }
        return this.f53935I;
    }

    private android.content.res.ColorStateList getSuperButtonTintList() {
        android.content.res.ColorStateList colorStateList = this.f53943Q;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.graphics.drawable.Drawable drawable = this.f53940N;
        if (drawable != null && (colorStateList2 = this.f53943Q) != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList2);
        }
        android.graphics.drawable.Drawable drawable2 = this.f53941O;
        if (drawable2 == null || (colorStateList = this.f53944R) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.o(drawable2, colorStateList);
    }

    private void i() {
    }

    public boolean d() {
        return this.f53938L;
    }

    @Override // android.widget.CompoundButton
    public android.graphics.drawable.Drawable getButtonDrawable() {
        return this.f53940N;
    }

    public android.graphics.drawable.Drawable getButtonIconDrawable() {
        return this.f53941O;
    }

    public android.content.res.ColorStateList getButtonIconTintList() {
        return this.f53944R;
    }

    public android.graphics.PorterDuff.Mode getButtonIconTintMode() {
        return this.f53945S;
    }

    @Override // android.widget.CompoundButton
    public android.content.res.ColorStateList getButtonTintList() {
        return this.f53943Q;
    }

    public int getCheckedState() {
        return this.f53946T;
    }

    public java.lang.CharSequence getErrorAccessibilityLabel() {
        return this.f53939M;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f53946T == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f53936J && this.f53943Q == null && this.f53944R == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (getCheckedState() == 2) {
            android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, f53929e0);
        }
        if (d()) {
            android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, f53930f0);
        }
        this.f53947U = com.google.android.material.drawable.d.e(iArrOnCreateDrawableState);
        i();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawableA;
        if (!this.f53937K || !android.text.TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (com.google.android.material.internal.n.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            android.graphics.Rect bounds = drawableA.getBounds();
            androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((java.lang.Object) accessibilityNodeInfo.getText()) + ", " + ((java.lang.Object) this.f53939M));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof p175r4.b.C0701b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p175r4.b.C0701b c0701b = (p175r4.b.C0701b) parcelable;
        super.onRestoreInstanceState(c0701b.getSuperState());
        setCheckedState(c0701b.f53954C);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        p175r4.b.C0701b c0701b = new p175r4.b.C0701b(super.onSaveInstanceState());
        c0701b.f53954C = getCheckedState();
        return c0701b;
    }

    @Override // androidx.appcompat.widget.C1901g, android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(p100k.a.b(getContext(), i6));
    }

    @Override // androidx.appcompat.widget.C1901g, android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.f53940N = drawable;
        this.f53942P = false;
        e();
    }

    public void setButtonIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.f53941O = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i6) {
        setButtonIconDrawable(p100k.a.b(getContext(), i6));
    }

    public void setButtonIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f53944R == colorStateList) {
            return;
        }
        this.f53944R = colorStateList;
        e();
    }

    public void setButtonIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f53945S == mode) {
            return;
        }
        this.f53945S = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f53943Q == colorStateList) {
            return;
        }
        this.f53943Q = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.f53937K = z6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedState(z6 ? 1 : 0);
    }

    public void setCheckedState(int i6) {
        android.view.autofill.AutofillManager autofillManagerA;
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f53946T != i6) {
            this.f53946T = i6;
            super.setChecked(i6 == 1);
            refreshDrawableState();
            f();
            if (this.f53948V) {
                return;
            }
            this.f53948V = true;
            java.util.LinkedHashSet linkedHashSet = this.f53934H;
            if (linkedHashSet != null) {
                java.util.Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.D.a(it.next());
                    throw null;
                }
            }
            if (this.f53946T != 2 && (onCheckedChangeListener = this.f53950a0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (android.os.Build.VERSION.SDK_INT >= 26 && (autofillManagerA = p081i0.b.a(getContext().getSystemService(p081i0.a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f53948V = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        i();
    }

    public void setErrorAccessibilityLabel(java.lang.CharSequence charSequence) {
        this.f53939M = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i6) {
        setErrorAccessibilityLabel(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setErrorShown(boolean z6) {
        if (this.f53938L == z6) {
            return;
        }
        this.f53938L = z6;
        refreshDrawableState();
        java.util.Iterator it = this.f53933G.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f53950a0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(java.lang.CharSequence charSequence) {
        this.f53949W = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f53936J = z6;
        androidx.core.widget.c.d(this, z6 ? getMaterialThemeColorsTintList() : null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
