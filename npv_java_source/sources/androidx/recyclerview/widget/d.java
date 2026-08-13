package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class d extends androidx.recyclerview.widget.RecyclerView.o implements androidx.recyclerview.widget.RecyclerView.s {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f23356D = {android.R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f23357E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f23358A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final java.lang.Runnable f23359B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.recyclerview.widget.RecyclerView.t f23360C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final android.graphics.drawable.StateListDrawable f23363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final android.graphics.drawable.Drawable f23364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.graphics.drawable.StateListDrawable f23367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.graphics.drawable.Drawable f23368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f23371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f23372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f23373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f23375o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f23376p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f23379s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final android.animation.ValueAnimator f23386z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23377q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23378r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23380t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23381u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23382v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23383w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f23384x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f23385y = new int[2];

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.recyclerview.widget.d.this.q(500);
        }
    }

    class b extends androidx.recyclerview.widget.RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
            androidx.recyclerview.widget.d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23389a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.f23389a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (this.f23389a) {
                this.f23389a = false;
                return;
            }
            if (((java.lang.Float) androidx.recyclerview.widget.d.this.f23386z.getAnimatedValue()).floatValue() == 0.0f) {
                androidx.recyclerview.widget.d dVar = androidx.recyclerview.widget.d.this;
                dVar.f23358A = 0;
                dVar.y(0);
            } else {
                androidx.recyclerview.widget.d dVar2 = androidx.recyclerview.widget.d.this;
                dVar2.f23358A = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0439d implements android.animation.ValueAnimator.AnimatorUpdateListener {
        C0439d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            androidx.recyclerview.widget.d.this.f23363c.setAlpha(iFloatValue);
            androidx.recyclerview.widget.d.this.f23364d.setAlpha(iFloatValue);
            androidx.recyclerview.widget.d.this.v();
        }
    }

    d(androidx.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i6, int i10, int i11) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23386z = valueAnimatorOfFloat;
        this.f23358A = 0;
        this.f23359B = new androidx.recyclerview.widget.d.a();
        this.f23360C = new androidx.recyclerview.widget.d.b();
        this.f23363c = stateListDrawable;
        this.f23364d = drawable;
        this.f23367g = stateListDrawable2;
        this.f23368h = drawable2;
        this.f23365e = java.lang.Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f23366f = java.lang.Math.max(i6, drawable.getIntrinsicWidth());
        this.f23369i = java.lang.Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.f23370j = java.lang.Math.max(i6, drawable2.getIntrinsicWidth());
        this.f23361a = i10;
        this.f23362b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new androidx.recyclerview.widget.d.c());
        valueAnimatorOfFloat.addUpdateListener(new androidx.recyclerview.widget.d.C0439d());
        j(recyclerView);
    }

    private void C(float f6) {
        int[] iArrP = p();
        float fMax = java.lang.Math.max(iArrP[0], java.lang.Math.min(iArrP[1], f6));
        if (java.lang.Math.abs(this.f23372l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f23373m, fMax, iArrP, this.f23379s.computeVerticalScrollRange(), this.f23379s.computeVerticalScrollOffset(), this.f23378r);
        if (iX != 0) {
            this.f23379s.scrollBy(0, iX);
        }
        this.f23373m = fMax;
    }

    private void k() {
        this.f23379s.removeCallbacks(this.f23359B);
    }

    private void l() {
        this.f23379s.W0(this);
        this.f23379s.X0(this);
        this.f23379s.Y0(this.f23360C);
        k();
    }

    private void m(android.graphics.Canvas canvas) {
        int i6 = this.f23378r;
        int i10 = this.f23369i;
        int i11 = i6 - i10;
        int i12 = this.f23375o;
        int i13 = this.f23374n;
        int i14 = i12 - (i13 / 2);
        this.f23367g.setBounds(0, 0, i13, i10);
        this.f23368h.setBounds(0, 0, this.f23377q, this.f23370j);
        canvas.translate(0.0f, i11);
        this.f23368h.draw(canvas);
        canvas.translate(i14, 0.0f);
        this.f23367g.draw(canvas);
        canvas.translate(-i14, -i11);
    }

    private void n(android.graphics.Canvas canvas) {
        int i6 = this.f23377q;
        int i10 = this.f23365e;
        int i11 = i6 - i10;
        int i12 = this.f23372l;
        int i13 = this.f23371k;
        int i14 = i12 - (i13 / 2);
        this.f23363c.setBounds(0, 0, i10, i13);
        this.f23364d.setBounds(0, 0, this.f23366f, this.f23378r);
        if (s()) {
            this.f23364d.draw(canvas);
            canvas.translate(this.f23365e, i14);
            canvas.scale(-1.0f, 1.0f);
            this.f23363c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i11 = this.f23365e;
        } else {
            canvas.translate(i11, 0.0f);
            this.f23364d.draw(canvas);
            canvas.translate(0.0f, i14);
            this.f23363c.draw(canvas);
        }
        canvas.translate(-i11, -i14);
    }

    private int[] o() {
        int[] iArr = this.f23385y;
        int i6 = this.f23362b;
        iArr[0] = i6;
        iArr[1] = this.f23377q - i6;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f23384x;
        int i6 = this.f23362b;
        iArr[0] = i6;
        iArr[1] = this.f23378r - i6;
        return iArr;
    }

    private void r(float f6) {
        int[] iArrO = o();
        float fMax = java.lang.Math.max(iArrO[0], java.lang.Math.min(iArrO[1], f6));
        if (java.lang.Math.abs(this.f23375o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f23376p, fMax, iArrO, this.f23379s.computeHorizontalScrollRange(), this.f23379s.computeHorizontalScrollOffset(), this.f23377q);
        if (iX != 0) {
            this.f23379s.scrollBy(iX, 0);
        }
        this.f23376p = fMax;
    }

    private boolean s() {
        return androidx.core.view.X.z(this.f23379s) == 1;
    }

    private void w(int i6) {
        k();
        this.f23379s.postDelayed(this.f23359B, i6);
    }

    private int x(float f6, float f10, int[] iArr, int i6, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 == 0) {
            return 0;
        }
        int i13 = i6 - i11;
        int i14 = (int) (((f10 - f6) / i12) * i13);
        int i15 = i10 + i14;
        if (i15 >= i13 || i15 < 0) {
            return 0;
        }
        return i14;
    }

    private void z() {
        this.f23379s.h(this);
        this.f23379s.j(this);
        this.f23379s.k(this.f23360C);
    }

    public void A() {
        int i6 = this.f23358A;
        if (i6 != 0) {
            if (i6 != 3) {
                return;
            } else {
                this.f23386z.cancel();
            }
        }
        this.f23358A = 1;
        android.animation.ValueAnimator valueAnimator = this.f23386z;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f23386z.setDuration(500L);
        this.f23386z.setStartDelay(0L);
        this.f23386z.start();
    }

    void B(int i6, int i10) {
        int iComputeVerticalScrollRange = this.f23379s.computeVerticalScrollRange();
        int i11 = this.f23378r;
        this.f23380t = iComputeVerticalScrollRange - i11 > 0 && i11 >= this.f23361a;
        int iComputeHorizontalScrollRange = this.f23379s.computeHorizontalScrollRange();
        int i12 = this.f23377q;
        boolean z6 = iComputeHorizontalScrollRange - i12 > 0 && i12 >= this.f23361a;
        this.f23381u = z6;
        boolean z10 = this.f23380t;
        if (!z10 && !z6) {
            if (this.f23382v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z10) {
            float f6 = i11;
            this.f23372l = (int) ((f6 * (i10 + (f6 / 2.0f))) / iComputeVerticalScrollRange);
            this.f23371k = java.lang.Math.min(i11, (i11 * i11) / iComputeVerticalScrollRange);
        }
        if (this.f23381u) {
            float f10 = i12;
            this.f23375o = (int) ((f10 * (i6 + (f10 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f23374n = java.lang.Math.min(i12, (i12 * i12) / iComputeHorizontalScrollRange);
        }
        int i13 = this.f23382v;
        if (i13 == 0 || i13 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        if (this.f23382v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f23383w = 1;
                    this.f23376p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f23383w = 2;
                    this.f23373m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f23382v == 2) {
            this.f23373m = 0.0f;
            this.f23376p = 0.0f;
            y(1);
            this.f23383w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f23382v == 2) {
            A();
            if (this.f23383w == 1) {
                r(motionEvent.getX());
            }
            if (this.f23383w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        int i6 = this.f23382v;
        if (i6 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f23383w = 1;
                this.f23376p = (int) motionEvent.getX();
            } else if (zU) {
                this.f23383w = 2;
                this.f23373m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i6 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (this.f23377q != this.f23379s.getWidth() || this.f23378r != this.f23379s.getHeight()) {
            this.f23377q = this.f23379s.getWidth();
            this.f23378r = this.f23379s.getHeight();
            y(0);
        } else if (this.f23358A != 0) {
            if (this.f23380t) {
                n(canvas);
            }
            if (this.f23381u) {
                m(canvas);
            }
        }
    }

    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f23379s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f23379s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i6) {
        int i10 = this.f23358A;
        if (i10 == 1) {
            this.f23386z.cancel();
        } else if (i10 != 2) {
            return;
        }
        this.f23358A = 3;
        android.animation.ValueAnimator valueAnimator = this.f23386z;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f23386z.setDuration(i6);
        this.f23386z.start();
    }

    boolean t(float f6, float f10) {
        if (f10 >= this.f23378r - this.f23369i) {
            int i6 = this.f23375o;
            int i10 = this.f23374n;
            if (f6 >= i6 - (i10 / 2) && f6 <= i6 + (i10 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f6, float f10) {
        if (!s() ? f6 >= this.f23377q - this.f23365e : f6 <= this.f23365e) {
            int i6 = this.f23372l;
            int i10 = this.f23371k;
            if (f10 >= i6 - (i10 / 2) && f10 <= i6 + (i10 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f23379s.invalidate();
    }

    void y(int i6) {
        int i10;
        if (i6 == 2 && this.f23382v != 2) {
            this.f23363c.setState(f23356D);
            k();
        }
        if (i6 == 0) {
            v();
        } else {
            A();
        }
        if (this.f23382v != 2 || i6 == 2) {
            i10 = i6 == 1 ? 1500 : 1200;
            this.f23382v = i6;
        }
        this.f23363c.setState(f23357E);
        w(i10);
        this.f23382v = i6;
    }
}
