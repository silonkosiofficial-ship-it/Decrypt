package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
class z extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.material.textfield.TextInputLayout f43833C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.widget.TextView f43834D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.CharSequence f43835E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.material.internal.CheckableImageButton f43836F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.content.res.ColorStateList f43837G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f43838H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f43839I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private android.widget.ImageView.ScaleType f43840J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.view.View.OnLongClickListener f43841K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f43842L;

    z(com.google.android.material.textfield.TextInputLayout textInputLayout, androidx.appcompat.widget.c0 c0Var) {
        super(textInputLayout.getContext());
        this.f43833C = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, 8388611));
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(getContext()).inflate(p125m4.g.f50655c, (android.view.ViewGroup) this, false);
        this.f43836F = checkableImageButton;
        com.google.android.material.textfield.t.e(checkableImageButton);
        androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(getContext());
        this.f43834D = d6;
        j(c0Var);
        i(c0Var);
        addView(checkableImageButton);
        addView(d6);
    }

    private void C() {
        int i6 = (this.f43835E == null || this.f43842L) ? 8 : 0;
        setVisibility((this.f43836F.getVisibility() == 0 || i6 == 0) ? 0 : 8);
        this.f43834D.setVisibility(i6);
        this.f43833C.o0();
    }

    private void i(androidx.appcompat.widget.c0 c0Var) {
        this.f43834D.setVisibility(8);
        this.f43834D.setId(p125m4.e.f50622N);
        this.f43834D.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        androidx.core.view.X.p0(this.f43834D, 1);
        o(c0Var.n(p125m4.j.f50911Y6, 0));
        if (c0Var.s(p125m4.j.f50918Z6)) {
            p(c0Var.c(p125m4.j.f50918Z6));
        }
        n(c0Var.p(p125m4.j.f50903X6));
    }

    private void j(androidx.appcompat.widget.c0 c0Var) {
        if (B4.c.g(getContext())) {
            androidx.core.view.AbstractC2031v.c((android.view.ViewGroup.MarginLayoutParams) this.f43836F.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (c0Var.s(p125m4.j.f50966f7)) {
            this.f43837G = B4.c.b(getContext(), c0Var, p125m4.j.f50966f7);
        }
        if (c0Var.s(p125m4.j.f50974g7)) {
            this.f43838H = com.google.android.material.internal.n.i(c0Var.k(p125m4.j.f50974g7, -1), null);
        }
        if (c0Var.s(p125m4.j.f50942c7)) {
            s(c0Var.g(p125m4.j.f50942c7));
            if (c0Var.s(p125m4.j.f50934b7)) {
                r(c0Var.p(p125m4.j.f50934b7));
            }
            q(c0Var.a(p125m4.j.f50926a7, true));
        }
        t(c0Var.f(p125m4.j.f50950d7, getResources().getDimensionPixelSize(p125m4.c.f50562X)));
        if (c0Var.s(p125m4.j.f50958e7)) {
            w(com.google.android.material.textfield.t.b(c0Var.k(p125m4.j.f50958e7, -1)));
        }
    }

    void A(C1.B b6) {
        android.view.View view;
        if (this.f43834D.getVisibility() == 0) {
            b6.A0(this.f43834D);
            view = this.f43834D;
        } else {
            view = this.f43836F;
        }
        b6.U0(view);
    }

    void B() {
        android.widget.EditText editText = this.f43833C.f43631F;
        if (editText == null) {
            return;
        }
        androidx.core.view.X.B0(this.f43834D, k() ? 0 : androidx.core.view.X.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(p125m4.c.f50542D), editText.getCompoundPaddingBottom());
    }

    java.lang.CharSequence a() {
        return this.f43835E;
    }

    android.content.res.ColorStateList b() {
        return this.f43834D.getTextColors();
    }

    int c() {
        return androidx.core.view.X.E(this) + androidx.core.view.X.E(this.f43834D) + (k() ? this.f43836F.getMeasuredWidth() + androidx.core.view.AbstractC2031v.a((android.view.ViewGroup.MarginLayoutParams) this.f43836F.getLayoutParams()) : 0);
    }

    android.widget.TextView d() {
        return this.f43834D;
    }

    java.lang.CharSequence e() {
        return this.f43836F.getContentDescription();
    }

    android.graphics.drawable.Drawable f() {
        return this.f43836F.getDrawable();
    }

    int g() {
        return this.f43839I;
    }

    android.widget.ImageView.ScaleType h() {
        return this.f43840J;
    }

    boolean k() {
        return this.f43836F.getVisibility() == 0;
    }

    void l(boolean z6) {
        this.f43842L = z6;
        C();
    }

    void m() {
        com.google.android.material.textfield.t.d(this.f43833C, this.f43836F, this.f43837G);
    }

    void n(java.lang.CharSequence charSequence) {
        this.f43835E = android.text.TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f43834D.setText(charSequence);
        C();
    }

    void o(int i6) {
        androidx.core.widget.h.n(this.f43834D, i6);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        B();
    }

    void p(android.content.res.ColorStateList colorStateList) {
        this.f43834D.setTextColor(colorStateList);
    }

    void q(boolean z6) {
        this.f43836F.setCheckable(z6);
    }

    void r(java.lang.CharSequence charSequence) {
        if (e() != charSequence) {
            this.f43836F.setContentDescription(charSequence);
        }
    }

    void s(android.graphics.drawable.Drawable drawable) {
        this.f43836F.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.t.a(this.f43833C, this.f43836F, this.f43837G, this.f43838H);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i6) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i6 != this.f43839I) {
            this.f43839I = i6;
            com.google.android.material.textfield.t.g(this.f43836F, i6);
        }
    }

    void u(android.view.View.OnClickListener onClickListener) {
        com.google.android.material.textfield.t.h(this.f43836F, onClickListener, this.f43841K);
    }

    void v(android.view.View.OnLongClickListener onLongClickListener) {
        this.f43841K = onLongClickListener;
        com.google.android.material.textfield.t.i(this.f43836F, onLongClickListener);
    }

    void w(android.widget.ImageView.ScaleType scaleType) {
        this.f43840J = scaleType;
        com.google.android.material.textfield.t.j(this.f43836F, scaleType);
    }

    void x(android.content.res.ColorStateList colorStateList) {
        if (this.f43837G != colorStateList) {
            this.f43837G = colorStateList;
            com.google.android.material.textfield.t.a(this.f43833C, this.f43836F, colorStateList, this.f43838H);
        }
    }

    void y(android.graphics.PorterDuff.Mode mode) {
        if (this.f43838H != mode) {
            this.f43838H = mode;
            com.google.android.material.textfield.t.a(this.f43833C, this.f43836F, this.f43837G, mode);
        }
    }

    void z(boolean z6) {
        if (k() != z6) {
            this.f43836F.setVisibility(z6 ? 0 : 8);
            B();
            C();
        }
    }
}
