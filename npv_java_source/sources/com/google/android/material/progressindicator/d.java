package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
final class d extends com.google.android.material.progressindicator.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f43503k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f43504l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f43505m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final android.util.Property f43506n = new com.google.android.material.progressindicator.d.c(java.lang.Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final android.util.Property f43507o = new com.google.android.material.progressindicator.d.C0478d(java.lang.Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.animation.ObjectAnimator f43508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.animation.ObjectAnimator f43509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y1.b f43510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f43511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f43515j;

    class a extends android.animation.AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            super.onAnimationRepeat(animator);
            com.google.android.material.progressindicator.d dVar = com.google.android.material.progressindicator.d.this;
            dVar.f43512g = (dVar.f43512g + 4) % com.google.android.material.progressindicator.d.this.f43511f.f43493c.length;
        }
    }

    class b extends android.animation.AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            super.onAnimationEnd(animator);
            com.google.android.material.progressindicator.d.this.a();
            com.google.android.material.progressindicator.d dVar = com.google.android.material.progressindicator.d.this;
            androidx.vectordrawable.graphics.drawable.b bVar = dVar.f43515j;
            if (bVar != null) {
                bVar.b(dVar.f43549a);
            }
        }
    }

    class c extends android.util.Property {
        c(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(com.google.android.material.progressindicator.d dVar) {
            return java.lang.Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(com.google.android.material.progressindicator.d dVar, java.lang.Float f6) {
            dVar.t(f6.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.d$d, reason: collision with other inner class name */
    class C0478d extends android.util.Property {
        C0478d(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(com.google.android.material.progressindicator.d dVar) {
            return java.lang.Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(com.google.android.material.progressindicator.d dVar, java.lang.Float f6) {
            dVar.u(f6.floatValue());
        }
    }

    public d(com.google.android.material.progressindicator.e eVar) {
        super(1);
        this.f43512g = 0;
        this.f43515j = null;
        this.f43511f = eVar;
        this.f43510e = new Y1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f43513h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f43514i;
    }

    private void q() {
        if (this.f43508c == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.google.android.material.progressindicator.d, java.lang.Float>) f43506n, 0.0f, 1.0f);
            this.f43508c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f43508c.setInterpolator(null);
            this.f43508c.setRepeatCount(-1);
            this.f43508c.addListener(new com.google.android.material.progressindicator.d.a());
        }
        if (this.f43509d == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.google.android.material.progressindicator.d, java.lang.Float>) f43507o, 0.0f, 1.0f);
            this.f43509d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f43509d.setInterpolator(this.f43510e);
            this.f43509d.addListener(new com.google.android.material.progressindicator.d.b());
        }
    }

    private void r(int i6) {
        for (int i10 = 0; i10 < 4; i10++) {
            float fB = b(i6, f43505m[i10], 333);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i11 = i10 + this.f43512g;
                int[] iArr = this.f43511f.f43493c;
                int length = i11 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i12 = iArr[length];
                int i13 = iArr[length2];
                ((com.google.android.material.progressindicator.h.a) this.f43550b.get(0)).f43547c = p135n4.c.b().evaluate(this.f43510e.getInterpolation(fB), java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(i13)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f6) {
        this.f43514i = f6;
    }

    private void v(int i6) {
        com.google.android.material.progressindicator.h.a aVar = (com.google.android.material.progressindicator.h.a) this.f43550b.get(0);
        float f6 = this.f43513h;
        aVar.f43545a = (f6 * 1520.0f) - 20.0f;
        aVar.f43546b = f6 * 1520.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            aVar.f43546b += this.f43510e.getInterpolation(b(i6, f43503k[i10], 667)) * 250.0f;
            aVar.f43545a += this.f43510e.getInterpolation(b(i6, f43504l[i10], 667)) * 250.0f;
        }
        float f10 = aVar.f43545a;
        float f11 = aVar.f43546b;
        aVar.f43545a = (f10 + ((f11 - f10) * this.f43514i)) / 360.0f;
        aVar.f43546b = f11 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        android.animation.ObjectAnimator objectAnimator = this.f43508c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f43515j = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        android.animation.ObjectAnimator objectAnimator = this.f43509d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f43549a.isVisible()) {
            this.f43509d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f43508c.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f43515j = null;
    }

    void s() {
        this.f43512g = 0;
        ((com.google.android.material.progressindicator.h.a) this.f43550b.get(0)).f43547c = this.f43511f.f43493c[0];
        this.f43514i = 0.0f;
    }

    void t(float f6) {
        this.f43513h = f6;
        int i6 = (int) (f6 * 5400.0f);
        v(i6);
        r(i6);
        this.f43549a.invalidateSelf();
    }
}
