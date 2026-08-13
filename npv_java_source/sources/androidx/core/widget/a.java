package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final int f21844T = android.view.ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final android.view.View f21847E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Runnable f21848F;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f21851I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f21852J;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f21856N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f21857O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    boolean f21858P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    boolean f21859Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f21860R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f21861S;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final androidx.core.widget.a.C0416a f21845C = new androidx.core.widget.a.C0416a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.view.animation.Interpolator f21846D = new android.view.animation.AccelerateInterpolator();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float[] f21849G = {0.0f, 0.0f};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float[] f21850H = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float[] f21853K = {0.0f, 0.0f};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float[] f21854L = {0.0f, 0.0f};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float[] f21855M = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0416a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f21864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f21865d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f21871j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f21872k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f21866e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f21870i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f21867f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21868g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f21869h = 0;

        C0416a() {
        }

        private float e(long j6) {
            long j10 = this.f21866e;
            if (j6 < j10) {
                return 0.0f;
            }
            long j11 = this.f21870i;
            if (j11 < 0 || j6 < j11) {
                return androidx.core.widget.a.f((j6 - j10) / this.f21862a, 0.0f, 1.0f) * 0.5f;
            }
            float f6 = this.f21871j;
            return (1.0f - f6) + (f6 * androidx.core.widget.a.f((j6 - j11) / this.f21872k, 0.0f, 1.0f));
        }

        private float g(float f6) {
            return ((-4.0f) * f6 * f6) + (f6 * 4.0f);
        }

        public void a() {
            if (this.f21867f == 0) {
                throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j6 = jCurrentAnimationTimeMillis - this.f21867f;
            this.f21867f = jCurrentAnimationTimeMillis;
            float f6 = j6 * fG;
            this.f21868g = (int) (this.f21864c * f6);
            this.f21869h = (int) (f6 * this.f21865d);
        }

        public int b() {
            return this.f21868g;
        }

        public int c() {
            return this.f21869h;
        }

        public int d() {
            float f6 = this.f21864c;
            return (int) (f6 / java.lang.Math.abs(f6));
        }

        public int f() {
            float f6 = this.f21865d;
            return (int) (f6 / java.lang.Math.abs(f6));
        }

        public boolean h() {
            return this.f21870i > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > this.f21870i + ((long) this.f21872k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            this.f21872k = androidx.core.widget.a.i((int) (jCurrentAnimationTimeMillis - this.f21866e), 0, this.f21863b);
            this.f21871j = e(jCurrentAnimationTimeMillis);
            this.f21870i = jCurrentAnimationTimeMillis;
        }

        public void j(int i6) {
            this.f21863b = i6;
        }

        public void k(int i6) {
            this.f21862a = i6;
        }

        public void l(float f6, float f10) {
            this.f21864c = f6;
            this.f21865d = f10;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            this.f21866e = jCurrentAnimationTimeMillis;
            this.f21870i = -1L;
            this.f21867f = jCurrentAnimationTimeMillis;
            this.f21871j = 0.5f;
            this.f21868g = 0;
            this.f21869h = 0;
        }
    }

    private class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.core.widget.a aVar = androidx.core.widget.a.this;
            if (aVar.f21859Q) {
                if (aVar.f21857O) {
                    aVar.f21857O = false;
                    aVar.f21845C.m();
                }
                androidx.core.widget.a.C0416a c0416a = androidx.core.widget.a.this.f21845C;
                if (c0416a.h() || !androidx.core.widget.a.this.E()) {
                    androidx.core.widget.a.this.f21859Q = false;
                    return;
                }
                androidx.core.widget.a aVar2 = androidx.core.widget.a.this;
                if (aVar2.f21858P) {
                    aVar2.f21858P = false;
                    aVar2.c();
                }
                c0416a.a();
                androidx.core.widget.a.this.t(c0416a.b(), c0416a.c());
                androidx.core.view.X.f0(androidx.core.widget.a.this.f21847E, this);
            }
        }
    }

    public a(android.view.View view) {
        this.f21847E = view;
        float f6 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        float f10 = (int) ((1575.0f * f6) + 0.5f);
        y(f10, f10);
        float f11 = (int) ((f6 * 315.0f) + 0.5f);
        z(f11, f11);
        v(1);
        x(Float.MAX_VALUE, Float.MAX_VALUE);
        C(0.2f, 0.2f);
        D(1.0f, 1.0f);
        u(f21844T);
        B(500);
        A(500);
    }

    private void F() {
        int i6;
        if (this.f21848F == null) {
            this.f21848F = new androidx.core.widget.a.b();
        }
        this.f21859Q = true;
        this.f21857O = true;
        if (this.f21856N || (i6 = this.f21852J) <= 0) {
            this.f21848F.run();
        } else {
            androidx.core.view.X.g0(this.f21847E, this.f21848F, i6);
        }
        this.f21856N = true;
    }

    private float d(int i6, float f6, float f10, float f11) {
        float fR = r(this.f21849G[i6], f10, this.f21850H[i6], f6);
        if (fR == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f21853K[i6];
        float f13 = this.f21854L[i6];
        float f14 = this.f21855M[i6];
        float f15 = f12 * f11;
        return fR > 0.0f ? f(fR * f15, f13, f14) : -f((-fR) * f15, f13, f14);
    }

    static float f(float f6, float f10, float f11) {
        if (f6 > f11) {
            return f11;
        }
        return f6 < f10 ? f10 : f6;
    }

    static int i(int i6, int i10, int i11) {
        if (i6 > i11) {
            return i11;
        }
        return i6 < i10 ? i10 : i6;
    }

    private float o(float f6, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i6 = this.f21851I;
        if (i6 == 0 || i6 == 1) {
            if (f6 < f10) {
                if (f6 >= 0.0f) {
                    return 1.0f - (f6 / f10);
                }
                if (this.f21859Q && i6 == 1) {
                    return 1.0f;
                }
            }
        } else if (i6 == 2 && f6 < 0.0f) {
            return f6 / (-f10);
        }
        return 0.0f;
    }

    private float r(float f6, float f10, float f11, float f12) {
        float interpolation;
        float f13 = f(f6 * f10, 0.0f, f11);
        float fO = o(f10 - f12, f13) - o(f12, f13);
        if (fO < 0.0f) {
            interpolation = -this.f21846D.getInterpolation(-fO);
        } else {
            if (fO <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f21846D.getInterpolation(fO);
        }
        return f(interpolation, -1.0f, 1.0f);
    }

    private void s() {
        if (this.f21857O) {
            this.f21859Q = false;
        } else {
            this.f21845C.i();
        }
    }

    public androidx.core.widget.a A(int i6) {
        this.f21845C.j(i6);
        return this;
    }

    public androidx.core.widget.a B(int i6) {
        this.f21845C.k(i6);
        return this;
    }

    public androidx.core.widget.a C(float f6, float f10) {
        float[] fArr = this.f21849G;
        fArr[0] = f6;
        fArr[1] = f10;
        return this;
    }

    public androidx.core.widget.a D(float f6, float f10) {
        float[] fArr = this.f21853K;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    boolean E() {
        androidx.core.widget.a.C0416a c0416a = this.f21845C;
        int iF = c0416a.f();
        int iD = c0416a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public abstract boolean a(int i6);

    public abstract boolean b(int i6);

    void c() {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f21847E.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!this.f21860R) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                s();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    s();
                }
            }
            return this.f21861S && this.f21859Q;
        }
        this.f21858P = true;
        this.f21856N = false;
        this.f21845C.l(d(0, motionEvent.getX(), view.getWidth(), this.f21847E.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f21847E.getHeight()));
        if (!this.f21859Q && E()) {
            F();
        }
        if (this.f21861S) {
            return false;
        }
    }

    public abstract void t(int i6, int i10);

    public androidx.core.widget.a u(int i6) {
        this.f21852J = i6;
        return this;
    }

    public androidx.core.widget.a v(int i6) {
        this.f21851I = i6;
        return this;
    }

    public androidx.core.widget.a w(boolean z6) {
        if (this.f21860R && !z6) {
            s();
        }
        this.f21860R = z6;
        return this;
    }

    public androidx.core.widget.a x(float f6, float f10) {
        float[] fArr = this.f21850H;
        fArr[0] = f6;
        fArr[1] = f10;
        return this;
    }

    public androidx.core.widget.a y(float f6, float f10) {
        float[] fArr = this.f21855M;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    public androidx.core.widget.a z(float f6, float f10) {
        float[] fArr = this.f21854L;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }
}
