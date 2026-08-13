package com.google.android.material.textfield;

/* JADX INFO: renamed from: com.google.android.material.textfield.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6521f extends com.google.android.material.textfield.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f43713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f43714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.widget.EditText f43717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.view.View.OnClickListener f43718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final android.view.View.OnFocusChangeListener f43719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.animation.AnimatorSet f43720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private android.animation.ValueAnimator f43721m;

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$a */
    class a extends android.animation.AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            com.google.android.material.textfield.C6521f.this.f43780b.a0(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$b */
    class b extends android.animation.AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            com.google.android.material.textfield.C6521f.this.f43780b.a0(false);
        }
    }

    C6521f(com.google.android.material.textfield.r rVar) {
        super(rVar);
        this.f43718j = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f43708C.G(view);
            }
        };
        this.f43719k = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z6) {
                this.f43709a.H(view, z6);
            }
        };
        this.f43713e = p245y4.d.f(rVar.getContext(), p125m4.a.f50487E, 100);
        this.f43714f = p245y4.d.f(rVar.getContext(), p125m4.a.f50487E, 150);
        this.f43715g = p245y4.d.g(rVar.getContext(), p125m4.a.f50491I, p135n4.a.f51490a);
        this.f43716h = p245y4.d.g(rVar.getContext(), p125m4.a.f50490H, p135n4.a.f51493d);
    }

    private void A(boolean z6) {
        boolean z10 = this.f43780b.F() == z6;
        if (z6 && !this.f43720l.isRunning()) {
            this.f43721m.cancel();
            this.f43720l.start();
            if (z10) {
                this.f43720l.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f43720l.cancel();
        this.f43721m.start();
        if (z10) {
            this.f43721m.end();
        }
    }

    private android.animation.ValueAnimator B(float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f43715g);
        valueAnimatorOfFloat.setDuration(this.f43713e);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f43710a.E(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private android.animation.ValueAnimator C() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f43716h);
        valueAnimatorOfFloat.setDuration(this.f43714f);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f43712a.F(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        android.animation.ValueAnimator valueAnimatorC = C();
        android.animation.ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f43720l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f43720l.addListener(new com.google.android.material.textfield.C6521f.a());
        android.animation.ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f43721m = valueAnimatorB2;
        valueAnimatorB2.addListener(new com.google.android.material.textfield.C6521f.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(android.animation.ValueAnimator valueAnimator) {
        this.f43782d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f43782d.setScaleX(fFloatValue);
        this.f43782d.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(android.view.View view) {
        android.widget.EditText editText = this.f43717i;
        if (editText == null) {
            return;
        }
        android.text.Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(android.view.View view, boolean z6) {
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        android.widget.EditText editText = this.f43717i;
        return editText != null && (editText.hasFocus() || this.f43782d.hasFocus()) && this.f43717i.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.s
    void a(android.text.Editable editable) {
        if (this.f43780b.w() != null) {
            return;
        }
        A(J());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return p125m4.h.f50675e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return p125m4.d.f50607j;
    }

    @Override // com.google.android.material.textfield.s
    android.view.View.OnFocusChangeListener e() {
        return this.f43719k;
    }

    @Override // com.google.android.material.textfield.s
    android.view.View.OnClickListener f() {
        return this.f43718j;
    }

    @Override // com.google.android.material.textfield.s
    android.view.View.OnFocusChangeListener g() {
        return this.f43719k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(android.widget.EditText editText) {
        this.f43717i = editText;
        this.f43779a.setEndIconVisible(J());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z6) {
        if (this.f43780b.w() == null) {
            return;
        }
        A(z6);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        android.widget.EditText editText = this.f43717i;
        if (editText != null) {
            editText.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43711C.I();
                }
            });
        }
    }
}
