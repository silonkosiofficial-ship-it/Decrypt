package R;

/* JADX INFO: loaded from: classes.dex */
public final class n extends android.view.View {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final R.n.a f9224H = new R.n.a(null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f9225I = 8;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int[] f9226J = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final int[] f9227K = new int[0];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private R.v f9228C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Boolean f9229D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Long f9230E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Runnable f9231F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p237x7.a f9232G;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public n(android.content.Context context) {
        super(context);
    }

    private final void c(boolean z6) {
        R.v vVar = new R.v(z6);
        setBackground(vVar);
        this.f9228C = vVar;
    }

    private final void setRippleState(boolean z6) {
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        java.lang.Runnable runnable = this.f9231F;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        java.lang.Long l6 = this.f9230E;
        long jLongValue = jCurrentAnimationTimeMillis - (l6 != null ? l6.longValue() : 0L);
        if (z6 || jLongValue >= 5) {
            int[] iArr = z6 ? f9226J : f9227K;
            R.v vVar = this.f9228C;
            if (vVar != null) {
                vVar.setState(iArr);
            }
        } else {
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: R.m
                @Override // java.lang.Runnable
                public final void run() {
                    R.n.setRippleState$lambda$2(this.f9223C);
                }
            };
            this.f9231F = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f9230E = java.lang.Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(R.n nVar) {
        R.v vVar = nVar.f9228C;
        if (vVar != null) {
            vVar.setState(f9227K);
        }
        nVar.f9231F = null;
    }

    public final void b(z.n.b bVar, boolean z6, long j6, int i6, long j10, float f6, p237x7.a aVar) {
        float fCenterX;
        float fCenterY;
        if (this.f9228C == null || !p247y7.AbstractC7350t.b(java.lang.Boolean.valueOf(z6), this.f9229D)) {
            c(z6);
            this.f9229D = java.lang.Boolean.valueOf(z6);
        }
        R.v vVar = this.f9228C;
        p247y7.AbstractC7350t.c(vVar);
        this.f9232G = aVar;
        vVar.c(i6);
        f(j6, j10, f6);
        if (z6) {
            fCenterX = p131n0.g.m(bVar.a());
            fCenterY = p131n0.g.n(bVar.a());
        } else {
            fCenterX = vVar.getBounds().centerX();
            fCenterY = vVar.getBounds().centerY();
        }
        vVar.setHotspot(fCenterX, fCenterY);
        setRippleState(true);
    }

    public final void d() {
        this.f9232G = null;
        java.lang.Runnable runnable = this.f9231F;
        if (runnable != null) {
            removeCallbacks(runnable);
            java.lang.Runnable runnable2 = this.f9231F;
            p247y7.AbstractC7350t.c(runnable2);
            runnable2.run();
        } else {
            R.v vVar = this.f9228C;
            if (vVar != null) {
                vVar.setState(f9227K);
            }
        }
        R.v vVar2 = this.f9228C;
        if (vVar2 == null) {
            return;
        }
        vVar2.setVisible(false, false);
        unscheduleDrawable(vVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j6, long j10, float f6) {
        R.v vVar = this.f9228C;
        if (vVar == null) {
            return;
        }
        vVar.b(j10, f6);
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, A7.a.d(p131n0.m.i(j6)), A7.a.d(p131n0.m.g(j6)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        vVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        p237x7.a aVar = this.f9232G;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
