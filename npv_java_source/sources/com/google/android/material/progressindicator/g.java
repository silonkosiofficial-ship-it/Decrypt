package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
abstract class g extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final android.util.Property f43527Q = new com.google.android.material.progressindicator.g.c(java.lang.Float.class, "growFraction");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final android.content.Context f43528C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.material.progressindicator.b f43529D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.animation.ValueAnimator f43531F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.animation.ValueAnimator f43532G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f43533H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f43534I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f43535J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.List f43536K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b f43537L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f43538M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f43539N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f43541P;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final android.graphics.Paint f43540O = new android.graphics.Paint();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    p255z4.a f43530E = new p255z4.a();

    class a extends android.animation.AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            super.onAnimationStart(animator);
            com.google.android.material.progressindicator.g.this.f();
        }
    }

    class b extends android.animation.AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            super.onAnimationEnd(animator);
            com.google.android.material.progressindicator.g.super.setVisible(false, false);
            com.google.android.material.progressindicator.g.this.e();
        }
    }

    class c extends android.util.Property {
        c(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(com.google.android.material.progressindicator.g gVar) {
            return java.lang.Float.valueOf(gVar.h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(com.google.android.material.progressindicator.g gVar, java.lang.Float f6) {
            gVar.n(f6.floatValue());
        }
    }

    g(android.content.Context context, com.google.android.material.progressindicator.b bVar) {
        this.f43528C = context;
        this.f43529D = bVar;
        setAlpha(255);
    }

    private void d(android.animation.ValueAnimator... valueAnimatorArr) {
        boolean z6 = this.f43538M;
        this.f43538M = true;
        for (android.animation.ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f43538M = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f43537L;
        if (bVar != null) {
            bVar.b(this);
        }
        java.util.List list = this.f43536K;
        if (list == null || this.f43538M) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.vectordrawable.graphics.drawable.b) it.next()).b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f43537L;
        if (bVar != null) {
            bVar.c(this);
        }
        java.util.List list = this.f43536K;
        if (list == null || this.f43538M) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.vectordrawable.graphics.drawable.b) it.next()).c(this);
        }
    }

    private void g(android.animation.ValueAnimator... valueAnimatorArr) {
        boolean z6 = this.f43538M;
        this.f43538M = true;
        for (android.animation.ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f43538M = z6;
    }

    private void l() {
        if (this.f43531F == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.google.android.material.progressindicator.g, java.lang.Float>) f43527Q, 0.0f, 1.0f);
            this.f43531F = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f43531F.setInterpolator(p135n4.a.f51491b);
            p(this.f43531F);
        }
        if (this.f43532G == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.google.android.material.progressindicator.g, java.lang.Float>) f43527Q, 1.0f, 0.0f);
            this.f43532G = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f43532G.setInterpolator(p135n4.a.f51491b);
            o(this.f43532G);
        }
    }

    private void o(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.f43532G;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new java.lang.IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f43532G = valueAnimator;
        valueAnimator.addListener(new com.google.android.material.progressindicator.g.b());
    }

    private void p(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.f43531F;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new java.lang.IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f43531F = valueAnimator;
        valueAnimator.addListener(new com.google.android.material.progressindicator.g.a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f43541P;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float h() {
        if (this.f43529D.b() || this.f43529D.a()) {
            return (this.f43534I || this.f43533H) ? this.f43535J : this.f43539N;
        }
        return 1.0f;
    }

    public boolean i() {
        return q(false, false, false);
    }

    public boolean isRunning() {
        return k() || j();
    }

    public boolean j() {
        android.animation.ValueAnimator valueAnimator = this.f43532G;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f43534I;
    }

    public boolean k() {
        android.animation.ValueAnimator valueAnimator = this.f43531F;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f43533H;
    }

    public void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f43536K == null) {
            this.f43536K = new java.util.ArrayList();
        }
        if (this.f43536K.contains(bVar)) {
            return;
        }
        this.f43536K.add(bVar);
    }

    void n(float f6) {
        if (this.f43539N != f6) {
            this.f43539N = f6;
            invalidateSelf();
        }
    }

    public boolean q(boolean z6, boolean z10, boolean z11) {
        return r(z6, z10, z11 && this.f43530E.a(this.f43528C.getContentResolver()) > 0.0f);
    }

    boolean r(boolean z6, boolean z10, boolean z11) {
        l();
        if (!isVisible() && !z6) {
            return false;
        }
        android.animation.ValueAnimator valueAnimator = z6 ? this.f43531F : this.f43532G;
        android.animation.ValueAnimator valueAnimator2 = z6 ? this.f43532G : this.f43531F;
        if (!z11) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z6, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z12 = !z6 || super.setVisible(z6, false);
        if (!(z6 ? this.f43529D.b() : this.f43529D.a())) {
            g(valueAnimator);
            return z12;
        }
        if (z10 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z12;
    }

    public boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        java.util.List list = this.f43536K;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f43536K.remove(bVar);
        if (!this.f43536K.isEmpty()) {
            return true;
        }
        this.f43536K = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        this.f43541P = i6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f43540O.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z10) {
        return q(z6, z10, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }
}
