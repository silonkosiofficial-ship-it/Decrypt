package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
class p extends com.google.android.material.textfield.s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f43733s = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f43734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f43735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.widget.AutoCompleteTextView f43737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.view.View.OnClickListener f43738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.view.View.OnFocusChangeListener f43739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1.AbstractC0842c.a f43740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f43741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f43742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f43743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f43744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private android.view.accessibility.AccessibilityManager f43745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.animation.ValueAnimator f43746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private android.animation.ValueAnimator f43747r;

    class a extends android.animation.AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            com.google.android.material.textfield.p.this.r();
            com.google.android.material.textfield.p.this.f43747r.start();
        }
    }

    p(com.google.android.material.textfield.r rVar) {
        super(rVar);
        this.f43738i = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f43729C.J(view);
            }
        };
        this.f43739j = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z6) {
                this.f43730a.K(view, z6);
            }
        };
        this.f43740k = new C1.AbstractC0842c.a() { // from class: com.google.android.material.textfield.n
            @Override // C1.AbstractC0842c.a
            public final void onTouchExplorationStateChanged(boolean z6) {
                this.f43731a.L(z6);
            }
        };
        this.f43744o = Long.MAX_VALUE;
        this.f43735f = p245y4.d.f(rVar.getContext(), p125m4.a.f50487E, 67);
        this.f43734e = p245y4.d.f(rVar.getContext(), p125m4.a.f50487E, 50);
        this.f43736g = p245y4.d.g(rVar.getContext(), p125m4.a.f50491I, p135n4.a.f51490a);
    }

    private static android.widget.AutoCompleteTextView D(android.widget.EditText editText) {
        if (editText instanceof android.widget.AutoCompleteTextView) {
            return (android.widget.AutoCompleteTextView) editText;
        }
        throw new java.lang.RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private android.animation.ValueAnimator E(int i6, float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f43736g);
        valueAnimatorOfFloat.setDuration(i6);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f43726a.I(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f43747r = E(this.f43735f, 0.0f, 1.0f);
        android.animation.ValueAnimator valueAnimatorE = E(this.f43734e, 1.0f, 0.0f);
        this.f43746q = valueAnimatorE;
        valueAnimatorE.addListener(new com.google.android.material.textfield.p.a());
    }

    private boolean G() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.f43744o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean zIsPopupShowing = this.f43737h.isPopupShowing();
        O(zIsPopupShowing);
        this.f43742m = zIsPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(android.animation.ValueAnimator valueAnimator) {
        this.f43782d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(android.view.View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(android.view.View view, boolean z6) {
        this.f43741l = z6;
        r();
        if (z6) {
            return;
        }
        O(false);
        this.f43742m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z6) {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f43737h;
        if (autoCompleteTextView == null || com.google.android.material.textfield.q.a(autoCompleteTextView)) {
            return;
        }
        androidx.core.view.X.w0(this.f43782d, z6 ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f43742m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z6) {
        if (this.f43743n != z6) {
            this.f43743n = z6;
            this.f43747r.cancel();
            this.f43746q.start();
        }
    }

    private void P() {
        this.f43737h.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return this.f43727C.M(view, motionEvent);
            }
        });
        if (f43733s) {
            this.f43737h.setOnDismissListener(new android.widget.AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f43728a.N();
                }
            });
        }
        this.f43737h.setThreshold(0);
    }

    private void Q() {
        if (this.f43737h == null) {
            return;
        }
        if (G()) {
            this.f43742m = false;
        }
        if (this.f43742m) {
            this.f43742m = false;
            return;
        }
        if (f43733s) {
            O(!this.f43743n);
        } else {
            this.f43743n = !this.f43743n;
            r();
        }
        if (!this.f43743n) {
            this.f43737h.dismissDropDown();
        } else {
            this.f43737h.requestFocus();
            this.f43737h.showDropDown();
        }
    }

    private void R() {
        this.f43742m = true;
        this.f43744o = java.lang.System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.s
    public void a(android.text.Editable editable) {
        if (this.f43745p.isTouchExplorationEnabled() && com.google.android.material.textfield.q.a(this.f43737h) && !this.f43782d.hasFocus()) {
            this.f43737h.dismissDropDown();
        }
        this.f43737h.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f43732C.H();
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return p125m4.h.f50677g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return f43733s ? p125m4.d.f50605h : p125m4.d.f50606i;
    }

    @Override // com.google.android.material.textfield.s
    android.view.View.OnFocusChangeListener e() {
        return this.f43739j;
    }

    @Override // com.google.android.material.textfield.s
    android.view.View.OnClickListener f() {
        return this.f43738i;
    }

    @Override // com.google.android.material.textfield.s
    public C1.AbstractC0842c.a h() {
        return this.f43740k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i6) {
        return i6 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f43741l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f43743n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(android.widget.EditText editText) {
        this.f43737h = D(editText);
        P();
        this.f43779a.setErrorIconDrawable((android.graphics.drawable.Drawable) null);
        if (!com.google.android.material.textfield.q.a(editText) && this.f43745p.isTouchExplorationEnabled()) {
            androidx.core.view.X.w0(this.f43782d, 2);
        }
        this.f43779a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(android.view.View view, C1.B b6) {
        if (!com.google.android.material.textfield.q.a(this.f43737h)) {
            b6.m0(android.widget.Spinner.class.getName());
        }
        if (b6.W()) {
            b6.y0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    public void p(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.f43745p.isEnabled() || com.google.android.material.textfield.q.a(this.f43737h)) {
            return;
        }
        boolean z6 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f43743n && !this.f43737h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z6) {
            Q();
            R();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f43745p = (android.view.accessibility.AccessibilityManager) this.f43781c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f43737h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f43733s) {
                this.f43737h.setOnDismissListener(null);
            }
        }
    }
}
