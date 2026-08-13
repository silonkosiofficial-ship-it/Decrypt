package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1895a extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final androidx.appcompat.widget.AbstractC1895a.C0341a f18408C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final android.content.Context f18409D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected androidx.appcompat.widget.ActionMenuView f18410E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected androidx.appcompat.widget.C1897c f18411F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected int f18412G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected androidx.core.view.C2003g0 f18413H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f18414I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f18415J;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0341a implements androidx.core.view.InterfaceC2005h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18416a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18417b;

        protected C0341a() {
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void a(android.view.View view) {
            this.f18416a = true;
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void b(android.view.View view) {
            if (this.f18416a) {
                return;
            }
            androidx.appcompat.widget.AbstractC1895a abstractC1895a = androidx.appcompat.widget.AbstractC1895a.this;
            abstractC1895a.f18413H = null;
            androidx.appcompat.widget.AbstractC1895a.super.setVisibility(this.f18417b);
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void c(android.view.View view) {
            androidx.appcompat.widget.AbstractC1895a.super.setVisibility(0);
            this.f18416a = false;
        }

        public androidx.appcompat.widget.AbstractC1895a.C0341a d(androidx.core.view.C2003g0 c2003g0, int i6) {
            androidx.appcompat.widget.AbstractC1895a.this.f18413H = c2003g0;
            this.f18417b = i6;
            return this;
        }
    }

    AbstractC1895a(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f18408C = new androidx.appcompat.widget.AbstractC1895a.C0341a();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(p090j.a.f48624a, typedValue, true) || typedValue.resourceId == 0) {
            this.f18409D = context;
        } else {
            this.f18409D = new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i6, int i10, boolean z6) {
        return z6 ? i6 - i10 : i6 + i10;
    }

    protected int c(android.view.View view, int i6, int i10, int i11) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i10);
        return java.lang.Math.max(0, (i6 - view.getMeasuredWidth()) - i11);
    }

    protected int e(android.view.View view, int i6, int i10, int i11, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i10 + ((i11 - measuredHeight) / 2);
        if (z6) {
            view.layout(i6 - measuredWidth, i12, i6, measuredHeight + i12);
        } else {
            view.layout(i6, i12, i6 + measuredWidth, measuredHeight + i12);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.C2003g0 f(int i6, long j6) {
        androidx.core.view.C2003g0 c2003g0B;
        androidx.core.view.C2003g0 c2003g0 = this.f18413H;
        if (c2003g0 != null) {
            c2003g0.c();
        }
        if (i6 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            c2003g0B = androidx.core.view.X.e(this).b(1.0f);
        } else {
            c2003g0B = androidx.core.view.X.e(this).b(0.0f);
        }
        c2003g0B.f(j6);
        c2003g0B.h(this.f18408C.d(c2003g0B, i6));
        return c2003g0B;
    }

    public int getAnimatedVisibility() {
        return this.f18413H != null ? this.f18408C.f18417b : getVisibility();
    }

    public int getContentHeight() {
        return this.f18412G;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p090j.j.f48901a, p090j.a.f48626c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(p090j.j.f48946j, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.C1897c c1897c = this.f18411F;
        if (c1897c != null) {
            c1897c.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f18415J = false;
        }
        if (!this.f18415J) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f18415J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f18415J = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f18414I = false;
        }
        if (!this.f18414I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f18414I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f18414I = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i6);

    @Override // android.view.View
    public void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            androidx.core.view.C2003g0 c2003g0 = this.f18413H;
            if (c2003g0 != null) {
                c2003g0.c();
            }
            super.setVisibility(i6);
        }
    }
}
