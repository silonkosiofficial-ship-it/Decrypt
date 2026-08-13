package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
public class v extends androidx.appcompat.widget.C1898d {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final androidx.appcompat.widget.P f43817G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager f43818H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final android.graphics.Rect f43819I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f43820J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final float f43821K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private android.content.res.ColorStateList f43822L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f43823M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.content.res.ColorStateList f43824N;

    class a implements android.widget.AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
            com.google.android.material.textfield.v vVar = com.google.android.material.textfield.v.this;
            com.google.android.material.textfield.v.this.l(i6 < 0 ? vVar.f43817G.v() : vVar.getAdapter().getItem(i6));
            android.widget.AdapterView.OnItemClickListener onItemClickListener = com.google.android.material.textfield.v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i6 < 0) {
                    view = com.google.android.material.textfield.v.this.f43817G.y();
                    i6 = com.google.android.material.textfield.v.this.f43817G.x();
                    j6 = com.google.android.material.textfield.v.this.f43817G.w();
                }
                onItemClickListener.onItemClick(com.google.android.material.textfield.v.this.f43817G.j(), view, i6, j6);
            }
            com.google.android.material.textfield.v.this.f43817G.dismiss();
        }
    }

    private class b extends android.widget.ArrayAdapter {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private android.content.res.ColorStateList f43826C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private android.content.res.ColorStateList f43827D;

        b(android.content.Context context, int i6, java.lang.String[] strArr) {
            super(context, i6, strArr);
            f();
        }

        private android.content.res.ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {android.R.attr.state_hovered, -16842919};
            int[] iArr2 = {android.R.attr.state_selected, -16842919};
            return new android.content.res.ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{p195t4.a.i(com.google.android.material.textfield.v.this.f43823M, com.google.android.material.textfield.v.this.f43824N.getColorForState(iArr2, 0)), p195t4.a.i(com.google.android.material.textfield.v.this.f43823M, com.google.android.material.textfield.v.this.f43824N.getColorForState(iArr, 0)), com.google.android.material.textfield.v.this.f43823M});
        }

        private android.graphics.drawable.Drawable b() {
            if (!c()) {
                return null;
            }
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(com.google.android.material.textfield.v.this.f43823M);
            if (this.f43827D == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.a.o(colorDrawable, this.f43826C);
            return new android.graphics.drawable.RippleDrawable(this.f43827D, colorDrawable, null);
        }

        private boolean c() {
            return com.google.android.material.textfield.v.this.f43823M != 0;
        }

        private boolean d() {
            return com.google.android.material.textfield.v.this.f43824N != null;
        }

        private android.content.res.ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {android.R.attr.state_pressed};
            return new android.content.res.ColorStateList(new int[][]{iArr, new int[0]}, new int[]{com.google.android.material.textfield.v.this.f43824N.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f43827D = e();
            this.f43826C = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
            android.view.View view2 = super.getView(i6, view, viewGroup);
            if (view2 instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) view2;
                androidx.core.view.X.r0(textView, com.google.android.material.textfield.v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50509c);
    }

    public v(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(H4.a.c(context, attributeSet, i6, 0), attributeSet, i6);
        this.f43819I = new android.graphics.Rect();
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p125m4.j.f51090v2, i6, p125m4.i.f50696c, new int[0]);
        if (typedArrayI.hasValue(p125m4.j.f51098w2) && typedArrayI.getInt(p125m4.j.f51098w2, 0) == 0) {
            setKeyListener(null);
        }
        this.f43820J = typedArrayI.getResourceId(p125m4.j.f51120z2, p125m4.g.f50662j);
        this.f43821K = typedArrayI.getDimensionPixelOffset(p125m4.j.f51106x2, p125m4.c.f50560V);
        if (typedArrayI.hasValue(p125m4.j.f51113y2)) {
            this.f43822L = android.content.res.ColorStateList.valueOf(typedArrayI.getColor(p125m4.j.f51113y2, 0));
        }
        this.f43823M = typedArrayI.getColor(p125m4.j.f50717A2, 0);
        this.f43824N = B4.c.a(context2, typedArrayI, p125m4.j.f50724B2);
        this.f43818H = (android.view.accessibility.AccessibilityManager) context2.getSystemService("accessibility");
        androidx.appcompat.widget.P p6 = new androidx.appcompat.widget.P(context2);
        this.f43817G = p6;
        p6.J(true);
        p6.D(this);
        p6.I(2);
        p6.p(getAdapter());
        p6.L(new com.google.android.material.textfield.v.a());
        if (typedArrayI.hasValue(p125m4.j.f50731C2)) {
            setSimpleItems(typedArrayI.getResourceId(p125m4.j.f50731C2, 0));
        }
        typedArrayI.recycle();
    }

    private com.google.android.material.textfield.TextInputLayout f() {
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f43818H;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f43818H.getEnabledAccessibilityServiceList(16)) != null) {
            for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f43818H;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        android.widget.ListAdapter adapter = getAdapter();
        com.google.android.material.textfield.TextInputLayout textInputLayoutF = f();
        int i6 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = java.lang.Math.min(adapter.getCount(), java.lang.Math.max(0, this.f43817G.x()) + 15);
        android.view.View view = null;
        int iMax = 0;
        for (int iMax2 = java.lang.Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = java.lang.Math.max(iMax, view.getMeasuredWidth());
        }
        android.graphics.drawable.Drawable drawableH = this.f43817G.h();
        if (drawableH != null) {
            drawableH.getPadding(this.f43819I);
            android.graphics.Rect rect = this.f43819I;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        com.google.android.material.textfield.TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(java.lang.Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f43817G.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public android.content.res.ColorStateList getDropDownBackgroundTintList() {
        return this.f43822L;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.R()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f43821K;
    }

    public int getSimpleItemSelectedColor() {
        return this.f43823M;
    }

    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f43824N;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.R() && super.getHint() == null && com.google.android.material.internal.e.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43817G.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (android.view.View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), j()), android.view.View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z6) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z6);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T t6) {
        super.setAdapter(t6);
        this.f43817G.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        androidx.appcompat.widget.P p6 = this.f43817G;
        if (p6 != null) {
            p6.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i6) {
        setDropDownBackgroundTintList(android.content.res.ColorStateList.valueOf(i6));
    }

    public void setDropDownBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        this.f43822L = colorStateList;
        android.graphics.drawable.Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof E4.g) {
            ((E4.g) dropDownBackground).V(this.f43822L);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f43817G.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i6) {
        super.setRawInputType(i6);
        k();
    }

    public void setSimpleItemSelectedColor(int i6) {
        this.f43823M = i6;
        if (getAdapter() instanceof com.google.android.material.textfield.v.b) {
            ((com.google.android.material.textfield.v.b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList colorStateList) {
        this.f43824N = colorStateList;
        if (getAdapter() instanceof com.google.android.material.textfield.v.b) {
            ((com.google.android.material.textfield.v.b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i6) {
        setSimpleItems(getResources().getStringArray(i6));
    }

    public void setSimpleItems(java.lang.String[] strArr) {
        setAdapter(new com.google.android.material.textfield.v.b(getContext(), this.f43820J, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f43817G.b();
        } else {
            super.showDropDown();
        }
    }
}
