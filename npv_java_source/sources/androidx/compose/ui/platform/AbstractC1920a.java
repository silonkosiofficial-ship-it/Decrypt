package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1920a extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.ref.WeakReference f20071C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.os.IBinder f20072D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private V.r f20073E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private V.AbstractC1744s f20074F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p237x7.a f20075G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f20076H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f20077I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f20078J;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    static final class C0383a extends p247y7.AbstractC7352v implements p237x7.p {
        C0383a() {
            super(2);
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-656146368, i6, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
            }
            androidx.compose.ui.platform.AbstractC1920a.this.b(interfaceC1734n, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public AbstractC1920a(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        setClipChildren(false);
        setClipToPadding(false);
        this.f20075G = androidx.compose.ui.platform.x1.f20417a.a().a(this);
    }

    public /* synthetic */ AbstractC1920a(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i6);
    }

    private final V.AbstractC1744s c(V.AbstractC1744s abstractC1744s) {
        V.AbstractC1744s abstractC1744s2 = j(abstractC1744s) ? abstractC1744s : null;
        if (abstractC1744s2 != null) {
            this.f20071C = new java.lang.ref.WeakReference(abstractC1744s2);
        }
        return abstractC1744s;
    }

    private final void d() {
        if (this.f20077I) {
            return;
        }
        throw new java.lang.UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void g() {
        if (this.f20073E == null) {
            try {
                this.f20077I = true;
                this.f20073E = androidx.compose.ui.platform.S1.c(this, k(), p031d0.c.c(-656146368, true, new androidx.compose.ui.platform.AbstractC1920a.C0383a()));
            } finally {
                this.f20077I = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean j(V.AbstractC1744s abstractC1744s) {
        return !(abstractC1744s instanceof V.U0) || ((V.U0.d) ((V.U0) abstractC1744s).d0().getValue()).compareTo(V.U0.d.ShuttingDown) > 0;
    }

    private final V.AbstractC1744s k() {
        V.AbstractC1744s abstractC1744s;
        V.AbstractC1744s abstractC1744s2 = this.f20074F;
        if (abstractC1744s2 != null) {
            return abstractC1744s2;
        }
        V.AbstractC1744s abstractC1744sD = androidx.compose.ui.platform.O1.d(this);
        V.AbstractC1744s abstractC1744s3 = null;
        V.AbstractC1744s abstractC1744sC = abstractC1744sD != null ? c(abstractC1744sD) : null;
        if (abstractC1744sC != null) {
            return abstractC1744sC;
        }
        java.lang.ref.WeakReference weakReference = this.f20071C;
        if (weakReference != null && (abstractC1744s = (V.AbstractC1744s) weakReference.get()) != null && j(abstractC1744s)) {
            abstractC1744s3 = abstractC1744s;
        }
        V.AbstractC1744s abstractC1744s4 = abstractC1744s3;
        return abstractC1744s4 == null ? c(androidx.compose.ui.platform.O1.h(this)) : abstractC1744s4;
    }

    private final void setParentContext(V.AbstractC1744s abstractC1744s) {
        if (this.f20074F != abstractC1744s) {
            this.f20074F = abstractC1744s;
            if (abstractC1744s != null) {
                this.f20071C = null;
            }
            V.r rVar = this.f20073E;
            if (rVar != null) {
                rVar.e();
                this.f20073E = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(android.os.IBinder iBinder) {
        if (this.f20072D != iBinder) {
            this.f20072D = iBinder;
            this.f20071C = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6) {
        d();
        super.addView(view, i6);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, int i10) {
        d();
        super.addView(view, i6, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i6, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i6, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams, boolean z6) {
        d();
        return super.addViewInLayout(view, i6, layoutParams, z6);
    }

    public abstract void b(V.InterfaceC1734n interfaceC1734n, int i6);

    public final void e() {
        if (this.f20074F == null && !isAttachedToWindow()) {
            throw new java.lang.IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        g();
    }

    public final void f() {
        V.r rVar = this.f20073E;
        if (rVar != null) {
            rVar.e();
        }
        this.f20073E = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.f20073E != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f20076H;
    }

    public void h(boolean z6, int i6, int i10, int i11, int i12) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i6) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    public void i(int i6, int i10) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i6, i10);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i6) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(i6)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f20078J || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        h(z6, i6, i10, i11, i12);
    }

    @Override // android.view.View
    protected final void onMeasure(int i6, int i10) {
        g();
        i(i6, i10);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i6) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i6);
    }

    public final void setParentCompositionContext(V.AbstractC1744s abstractC1744s) {
        setParentContext(abstractC1744s);
    }

    public final void setShowLayoutBounds(boolean z6) {
        this.f20076H = z6;
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((F0.o0) childAt).setShowLayoutBounds(z6);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z6) {
        super.setTransitionGroup(z6);
        this.f20078J = true;
    }

    public final void setViewCompositionStrategy(androidx.compose.ui.platform.x1 x1Var) {
        p237x7.a aVar = this.f20075G;
        if (aVar != null) {
            aVar.b();
        }
        this.f20075G = x1Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
