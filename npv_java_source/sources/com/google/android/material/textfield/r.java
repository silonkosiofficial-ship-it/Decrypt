package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
class r extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.android.material.textfield.TextInputLayout f43749C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.widget.FrameLayout f43750D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.material.internal.CheckableImageButton f43751E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.content.res.ColorStateList f43752F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f43753G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.view.View.OnLongClickListener f43754H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.material.internal.CheckableImageButton f43755I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.material.textfield.r.d f43756J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f43757K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.LinkedHashSet f43758L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private android.content.res.ColorStateList f43759M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f43760N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f43761O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private android.widget.ImageView.ScaleType f43762P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private android.view.View.OnLongClickListener f43763Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.lang.CharSequence f43764R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final android.widget.TextView f43765S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f43766T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private android.widget.EditText f43767U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final android.view.accessibility.AccessibilityManager f43768V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private C1.AbstractC0842c.a f43769W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final android.text.TextWatcher f43770a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final com.google.android.material.textfield.TextInputLayout.f f43771b0;

    class a extends com.google.android.material.internal.j {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            com.google.android.material.textfield.r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.j, android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
            com.google.android.material.textfield.r.this.m().b(charSequence, i6, i10, i11);
        }
    }

    class b implements com.google.android.material.textfield.TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(com.google.android.material.textfield.TextInputLayout textInputLayout) {
            if (com.google.android.material.textfield.r.this.f43767U == textInputLayout.getEditText()) {
                return;
            }
            if (com.google.android.material.textfield.r.this.f43767U != null) {
                com.google.android.material.textfield.r.this.f43767U.removeTextChangedListener(com.google.android.material.textfield.r.this.f43770a0);
                if (com.google.android.material.textfield.r.this.f43767U.getOnFocusChangeListener() == com.google.android.material.textfield.r.this.m().e()) {
                    com.google.android.material.textfield.r.this.f43767U.setOnFocusChangeListener(null);
                }
            }
            com.google.android.material.textfield.r.this.f43767U = textInputLayout.getEditText();
            if (com.google.android.material.textfield.r.this.f43767U != null) {
                com.google.android.material.textfield.r.this.f43767U.addTextChangedListener(com.google.android.material.textfield.r.this.f43770a0);
            }
            com.google.android.material.textfield.r.this.m().n(com.google.android.material.textfield.r.this.f43767U);
            com.google.android.material.textfield.r rVar = com.google.android.material.textfield.r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements android.view.View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            com.google.android.material.textfield.r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            com.google.android.material.textfield.r.this.M();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.util.SparseArray f43775a = new android.util.SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.material.textfield.r f43776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f43777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f43778d;

        d(com.google.android.material.textfield.r rVar, androidx.appcompat.widget.c0 c0Var) {
            this.f43776b = rVar;
            this.f43777c = c0Var.n(p125m4.j.s6, 0);
            this.f43778d = c0Var.n(p125m4.j.f50847Q6, 0);
        }

        private com.google.android.material.textfield.s b(int i6) {
            if (i6 == -1) {
                return new com.google.android.material.textfield.C6522g(this.f43776b);
            }
            if (i6 == 0) {
                return new com.google.android.material.textfield.w(this.f43776b);
            }
            if (i6 == 1) {
                return new com.google.android.material.textfield.y(this.f43776b, this.f43778d);
            }
            if (i6 == 2) {
                return new com.google.android.material.textfield.C6521f(this.f43776b);
            }
            if (i6 == 3) {
                return new com.google.android.material.textfield.p(this.f43776b);
            }
            throw new java.lang.IllegalArgumentException("Invalid end icon mode: " + i6);
        }

        com.google.android.material.textfield.s c(int i6) {
            com.google.android.material.textfield.s sVar = (com.google.android.material.textfield.s) this.f43775a.get(i6);
            if (sVar != null) {
                return sVar;
            }
            com.google.android.material.textfield.s sVarB = b(i6);
            this.f43775a.append(i6, sVarB);
            return sVarB;
        }
    }

    r(com.google.android.material.textfield.TextInputLayout textInputLayout, androidx.appcompat.widget.c0 c0Var) {
        super(textInputLayout.getContext());
        this.f43757K = 0;
        this.f43758L = new java.util.LinkedHashSet();
        this.f43770a0 = new com.google.android.material.textfield.r.a();
        com.google.android.material.textfield.r.b bVar = new com.google.android.material.textfield.r.b();
        this.f43771b0 = bVar;
        this.f43768V = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        this.f43749C = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, 8388613));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f43750D = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        com.google.android.material.internal.CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, p125m4.e.f50617I);
        this.f43751E = checkableImageButtonI;
        com.google.android.material.internal.CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, p125m4.e.f50616H);
        this.f43755I = checkableImageButtonI2;
        this.f43756J = new com.google.android.material.textfield.r.d(this, c0Var);
        androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(getContext());
        this.f43765S = d6;
        C(c0Var);
        B(c0Var);
        D(c0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(d6);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new com.google.android.material.textfield.r.c());
    }

    private void B(androidx.appcompat.widget.c0 c0Var) {
        if (!c0Var.s(p125m4.j.f50855R6)) {
            if (c0Var.s(p125m4.j.w6)) {
                this.f43759M = B4.c.b(getContext(), c0Var, p125m4.j.w6);
            }
            if (c0Var.s(p125m4.j.x6)) {
                this.f43760N = com.google.android.material.internal.n.i(c0Var.k(p125m4.j.x6, -1), null);
            }
        }
        if (c0Var.s(p125m4.j.u6)) {
            U(c0Var.k(p125m4.j.u6, 0));
            if (c0Var.s(p125m4.j.r6)) {
                Q(c0Var.p(p125m4.j.r6));
            }
            O(c0Var.a(p125m4.j.q6, true));
        } else if (c0Var.s(p125m4.j.f50855R6)) {
            if (c0Var.s(p125m4.j.f50863S6)) {
                this.f43759M = B4.c.b(getContext(), c0Var, p125m4.j.f50863S6);
            }
            if (c0Var.s(p125m4.j.f50871T6)) {
                this.f43760N = com.google.android.material.internal.n.i(c0Var.k(p125m4.j.f50871T6, -1), null);
            }
            U(c0Var.a(p125m4.j.f50855R6, false) ? 1 : 0);
            Q(c0Var.p(p125m4.j.f50839P6));
        }
        T(c0Var.f(p125m4.j.t6, getResources().getDimensionPixelSize(p125m4.c.f50562X)));
        if (c0Var.s(p125m4.j.v6)) {
            X(com.google.android.material.textfield.t.b(c0Var.k(p125m4.j.v6, -1)));
        }
    }

    private void C(androidx.appcompat.widget.c0 c0Var) {
        if (c0Var.s(p125m4.j.f50735C6)) {
            this.f43752F = B4.c.b(getContext(), c0Var, p125m4.j.f50735C6);
        }
        if (c0Var.s(p125m4.j.f50743D6)) {
            this.f43753G = com.google.android.material.internal.n.i(c0Var.k(p125m4.j.f50743D6, -1), null);
        }
        if (c0Var.s(p125m4.j.B6)) {
            c0(c0Var.g(p125m4.j.B6));
        }
        this.f43751E.setContentDescription(getResources().getText(p125m4.h.f50676f));
        androidx.core.view.X.w0(this.f43751E, 2);
        this.f43751E.setClickable(false);
        this.f43751E.setPressable(false);
        this.f43751E.setFocusable(false);
    }

    private void D(androidx.appcompat.widget.c0 c0Var) {
        this.f43765S.setVisibility(8);
        this.f43765S.setId(p125m4.e.f50623O);
        this.f43765S.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 80.0f));
        androidx.core.view.X.p0(this.f43765S, 1);
        q0(c0Var.n(p125m4.j.f50990i7, 0));
        if (c0Var.s(p125m4.j.f50998j7)) {
            r0(c0Var.c(p125m4.j.f50998j7));
        }
        p0(c0Var.p(p125m4.j.f50982h7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        C1.AbstractC0842c.a aVar = this.f43769W;
        if (aVar == null || (accessibilityManager = this.f43768V) == null) {
            return;
        }
        C1.AbstractC0842c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f43769W == null || this.f43768V == null || !androidx.core.view.X.Q(this)) {
            return;
        }
        C1.AbstractC0842c.a(this.f43768V, this.f43769W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(com.google.android.material.textfield.s sVar) {
        if (this.f43767U == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f43767U.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f43755I.setOnFocusChangeListener(sVar.g());
        }
    }

    private com.google.android.material.internal.CheckableImageButton i(android.view.ViewGroup viewGroup, android.view.LayoutInflater layoutInflater, int i6) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) layoutInflater.inflate(p125m4.g.f50654b, viewGroup, false);
        checkableImageButton.setId(i6);
        com.google.android.material.textfield.t.e(checkableImageButton);
        if (B4.c.g(getContext())) {
            androidx.core.view.AbstractC2031v.d((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i6) {
        java.util.Iterator it = this.f43758L.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
    }

    private void s0(com.google.android.material.textfield.s sVar) {
        sVar.s();
        this.f43769W = sVar.h();
        g();
    }

    private int t(com.google.android.material.textfield.s sVar) {
        int i6 = this.f43756J.f43777c;
        return i6 == 0 ? sVar.d() : i6;
    }

    private void t0(com.google.android.material.textfield.s sVar) {
        M();
        this.f43769W = null;
        sVar.u();
    }

    private void u0(boolean z6) {
        if (!z6 || n() == null) {
            com.google.android.material.textfield.t.a(this.f43749C, this.f43755I, this.f43759M, this.f43760N);
            return;
        }
        android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.a.r(n()).mutate();
        androidx.core.graphics.drawable.a.n(drawableMutate, this.f43749C.getErrorCurrentTextColors());
        this.f43755I.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f43750D.setVisibility((this.f43755I.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f43764R == null || this.f43766T) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f43751E.setVisibility(s() != null && this.f43749C.N() && this.f43749C.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f43749C.o0();
    }

    private void y0() {
        int visibility = this.f43765S.getVisibility();
        int i6 = (this.f43764R == null || this.f43766T) ? 8 : 0;
        if (visibility != i6) {
            m().q(i6 == 0);
        }
        v0();
        this.f43765S.setVisibility(i6);
        this.f43749C.o0();
    }

    boolean A() {
        return this.f43757K != 0;
    }

    boolean E() {
        return A() && this.f43755I.isChecked();
    }

    boolean F() {
        return this.f43750D.getVisibility() == 0 && this.f43755I.getVisibility() == 0;
    }

    boolean G() {
        return this.f43751E.getVisibility() == 0;
    }

    void H(boolean z6) {
        this.f43766T = z6;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f43749C.d0());
        }
    }

    void J() {
        com.google.android.material.textfield.t.d(this.f43749C, this.f43755I, this.f43759M);
    }

    void K() {
        com.google.android.material.textfield.t.d(this.f43749C, this.f43751E, this.f43752F);
    }

    void L(boolean z6) {
        boolean z10;
        boolean zIsActivated;
        boolean zIsChecked;
        com.google.android.material.textfield.s sVarM = m();
        boolean z11 = true;
        if (!sVarM.l() || (zIsChecked = this.f43755I.isChecked()) == sVarM.m()) {
            z10 = false;
        } else {
            this.f43755I.setChecked(!zIsChecked);
            z10 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f43755I.isActivated()) == sVarM.k()) {
            z11 = z10;
        } else {
            N(!zIsActivated);
        }
        if (z6 || z11) {
            J();
        }
    }

    void N(boolean z6) {
        this.f43755I.setActivated(z6);
    }

    void O(boolean z6) {
        this.f43755I.setCheckable(z6);
    }

    void P(int i6) {
        Q(i6 != 0 ? getResources().getText(i6) : null);
    }

    void Q(java.lang.CharSequence charSequence) {
        if (l() != charSequence) {
            this.f43755I.setContentDescription(charSequence);
        }
    }

    void R(int i6) {
        S(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
    }

    void S(android.graphics.drawable.Drawable drawable) {
        this.f43755I.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.t.a(this.f43749C, this.f43755I, this.f43759M, this.f43760N);
            J();
        }
    }

    void T(int i6) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i6 != this.f43761O) {
            this.f43761O = i6;
            com.google.android.material.textfield.t.g(this.f43755I, i6);
            com.google.android.material.textfield.t.g(this.f43751E, i6);
        }
    }

    void U(int i6) {
        if (this.f43757K == i6) {
            return;
        }
        t0(m());
        int i10 = this.f43757K;
        this.f43757K = i6;
        j(i10);
        a0(i6 != 0);
        com.google.android.material.textfield.s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f43749C.getBoxBackgroundMode())) {
            throw new java.lang.IllegalStateException("The current box background mode " + this.f43749C.getBoxBackgroundMode() + " is not supported by the end icon mode " + i6);
        }
        s0(sVarM);
        V(sVarM.f());
        android.widget.EditText editText = this.f43767U;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        com.google.android.material.textfield.t.a(this.f43749C, this.f43755I, this.f43759M, this.f43760N);
        L(true);
    }

    void V(android.view.View.OnClickListener onClickListener) {
        com.google.android.material.textfield.t.h(this.f43755I, onClickListener, this.f43763Q);
    }

    void W(android.view.View.OnLongClickListener onLongClickListener) {
        this.f43763Q = onLongClickListener;
        com.google.android.material.textfield.t.i(this.f43755I, onLongClickListener);
    }

    void X(android.widget.ImageView.ScaleType scaleType) {
        this.f43762P = scaleType;
        com.google.android.material.textfield.t.j(this.f43755I, scaleType);
        com.google.android.material.textfield.t.j(this.f43751E, scaleType);
    }

    void Y(android.content.res.ColorStateList colorStateList) {
        if (this.f43759M != colorStateList) {
            this.f43759M = colorStateList;
            com.google.android.material.textfield.t.a(this.f43749C, this.f43755I, colorStateList, this.f43760N);
        }
    }

    void Z(android.graphics.PorterDuff.Mode mode) {
        if (this.f43760N != mode) {
            this.f43760N = mode;
            com.google.android.material.textfield.t.a(this.f43749C, this.f43755I, this.f43759M, mode);
        }
    }

    void a0(boolean z6) {
        if (F() != z6) {
            this.f43755I.setVisibility(z6 ? 0 : 8);
            v0();
            x0();
            this.f43749C.o0();
        }
    }

    void b0(int i6) {
        c0(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
        K();
    }

    void c0(android.graphics.drawable.Drawable drawable) {
        this.f43751E.setImageDrawable(drawable);
        w0();
        com.google.android.material.textfield.t.a(this.f43749C, this.f43751E, this.f43752F, this.f43753G);
    }

    void d0(android.view.View.OnClickListener onClickListener) {
        com.google.android.material.textfield.t.h(this.f43751E, onClickListener, this.f43754H);
    }

    void e0(android.view.View.OnLongClickListener onLongClickListener) {
        this.f43754H = onLongClickListener;
        com.google.android.material.textfield.t.i(this.f43751E, onLongClickListener);
    }

    void f0(android.content.res.ColorStateList colorStateList) {
        if (this.f43752F != colorStateList) {
            this.f43752F = colorStateList;
            com.google.android.material.textfield.t.a(this.f43749C, this.f43751E, colorStateList, this.f43753G);
        }
    }

    void g0(android.graphics.PorterDuff.Mode mode) {
        if (this.f43753G != mode) {
            this.f43753G = mode;
            com.google.android.material.textfield.t.a(this.f43749C, this.f43751E, this.f43752F, mode);
        }
    }

    void h() {
        this.f43755I.performClick();
        this.f43755I.jumpDrawablesToCurrentState();
    }

    void i0(int i6) {
        j0(i6 != 0 ? getResources().getText(i6) : null);
    }

    void j0(java.lang.CharSequence charSequence) {
        this.f43755I.setContentDescription(charSequence);
    }

    com.google.android.material.internal.CheckableImageButton k() {
        if (G()) {
            return this.f43751E;
        }
        if (A() && F()) {
            return this.f43755I;
        }
        return null;
    }

    void k0(int i6) {
        l0(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
    }

    java.lang.CharSequence l() {
        return this.f43755I.getContentDescription();
    }

    void l0(android.graphics.drawable.Drawable drawable) {
        this.f43755I.setImageDrawable(drawable);
    }

    com.google.android.material.textfield.s m() {
        return this.f43756J.c(this.f43757K);
    }

    void m0(boolean z6) {
        if (z6 && this.f43757K != 1) {
            U(1);
        } else {
            if (z6) {
                return;
            }
            U(0);
        }
    }

    android.graphics.drawable.Drawable n() {
        return this.f43755I.getDrawable();
    }

    void n0(android.content.res.ColorStateList colorStateList) {
        this.f43759M = colorStateList;
        com.google.android.material.textfield.t.a(this.f43749C, this.f43755I, colorStateList, this.f43760N);
    }

    int o() {
        return this.f43761O;
    }

    void o0(android.graphics.PorterDuff.Mode mode) {
        this.f43760N = mode;
        com.google.android.material.textfield.t.a(this.f43749C, this.f43755I, this.f43759M, mode);
    }

    int p() {
        return this.f43757K;
    }

    void p0(java.lang.CharSequence charSequence) {
        this.f43764R = android.text.TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f43765S.setText(charSequence);
        y0();
    }

    android.widget.ImageView.ScaleType q() {
        return this.f43762P;
    }

    void q0(int i6) {
        androidx.core.widget.h.n(this.f43765S, i6);
    }

    com.google.android.material.internal.CheckableImageButton r() {
        return this.f43755I;
    }

    void r0(android.content.res.ColorStateList colorStateList) {
        this.f43765S.setTextColor(colorStateList);
    }

    android.graphics.drawable.Drawable s() {
        return this.f43751E.getDrawable();
    }

    java.lang.CharSequence u() {
        return this.f43755I.getContentDescription();
    }

    android.graphics.drawable.Drawable v() {
        return this.f43755I.getDrawable();
    }

    java.lang.CharSequence w() {
        return this.f43764R;
    }

    android.content.res.ColorStateList x() {
        return this.f43765S.getTextColors();
    }

    void x0() {
        if (this.f43749C.f43631F == null) {
            return;
        }
        androidx.core.view.X.B0(this.f43765S, getContext().getResources().getDimensionPixelSize(p125m4.c.f50542D), this.f43749C.f43631F.getPaddingTop(), (F() || G()) ? 0 : androidx.core.view.X.D(this.f43749C.f43631F), this.f43749C.f43631F.getPaddingBottom());
    }

    int y() {
        return androidx.core.view.X.D(this) + androidx.core.view.X.D(this.f43765S) + ((F() || G()) ? this.f43755I.getMeasuredWidth() + androidx.core.view.AbstractC2031v.b((android.view.ViewGroup.MarginLayoutParams) this.f43755I.getLayoutParams()) : 0);
    }

    android.widget.TextView z() {
        return this.f43765S;
    }
}
