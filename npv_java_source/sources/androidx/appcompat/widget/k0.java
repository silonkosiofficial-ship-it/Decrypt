package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class k0 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static androidx.appcompat.widget.k0 f18526M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static androidx.appcompat.widget.k0 f18527N;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.view.View f18528C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.CharSequence f18529D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f18530E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Runnable f18531F = new java.lang.Runnable() { // from class: androidx.appcompat.widget.i0
        @Override // java.lang.Runnable
        public final void run() {
            this.f18509C.e();
        }
    };

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.Runnable f18532G = new java.lang.Runnable() { // from class: androidx.appcompat.widget.j0
        @Override // java.lang.Runnable
        public final void run() {
            this.f18516C.d();
        }
    };

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f18533H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f18534I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private androidx.appcompat.widget.l0 f18535J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f18536K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f18537L;

    private k0(android.view.View view, java.lang.CharSequence charSequence) {
        this.f18528C = view;
        this.f18529D = charSequence;
        this.f18530E = androidx.core.view.AbstractC1993b0.g(android.view.ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f18528C.removeCallbacks(this.f18531F);
    }

    private void c() {
        this.f18537L = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f18528C.postDelayed(this.f18531F, android.view.ViewConfiguration.getLongPressTimeout());
    }

    private static void g(androidx.appcompat.widget.k0 k0Var) {
        androidx.appcompat.widget.k0 k0Var2 = f18526M;
        if (k0Var2 != null) {
            k0Var2.b();
        }
        f18526M = k0Var;
        if (k0Var != null) {
            k0Var.f();
        }
    }

    public static void h(android.view.View view, java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.k0 k0Var = f18526M;
        if (k0Var != null && k0Var.f18528C == view) {
            g(null);
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            new androidx.appcompat.widget.k0(view, charSequence);
            return;
        }
        androidx.appcompat.widget.k0 k0Var2 = f18527N;
        if (k0Var2 != null && k0Var2.f18528C == view) {
            k0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(android.view.MotionEvent motionEvent) {
        int x6 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        if (!this.f18537L && java.lang.Math.abs(x6 - this.f18533H) <= this.f18530E && java.lang.Math.abs(y6 - this.f18534I) <= this.f18530E) {
            return false;
        }
        this.f18533H = x6;
        this.f18534I = y6;
        this.f18537L = false;
        return true;
    }

    void d() {
        if (f18527N == this) {
            f18527N = null;
            androidx.appcompat.widget.l0 l0Var = this.f18535J;
            if (l0Var != null) {
                l0Var.c();
                this.f18535J = null;
                c();
                this.f18528C.removeOnAttachStateChangeListener(this);
            }
        }
        if (f18526M == this) {
            g(null);
        }
        this.f18528C.removeCallbacks(this.f18532G);
    }

    void i(boolean z6) {
        long longPressTimeout;
        long j6;
        long j10;
        if (androidx.core.view.X.Q(this.f18528C)) {
            g(null);
            androidx.appcompat.widget.k0 k0Var = f18527N;
            if (k0Var != null) {
                k0Var.d();
            }
            f18527N = this;
            this.f18536K = z6;
            androidx.appcompat.widget.l0 l0Var = new androidx.appcompat.widget.l0(this.f18528C.getContext());
            this.f18535J = l0Var;
            l0Var.e(this.f18528C, this.f18533H, this.f18534I, this.f18536K, this.f18529D);
            this.f18528C.addOnAttachStateChangeListener(this);
            if (this.f18536K) {
                j10 = 2500;
            } else {
                if ((androidx.core.view.X.K(this.f18528C) & 1) == 1) {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j6 = 3000;
                } else {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j10 = j6 - longPressTimeout;
            }
            this.f18528C.removeCallbacks(this.f18532G);
            this.f18528C.postDelayed(this.f18532G, j10);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f18535J != null && this.f18536K) {
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.f18528C.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f18528C.isEnabled() && this.f18535J == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        this.f18533H = view.getWidth() / 2;
        this.f18534I = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        d();
    }
}
