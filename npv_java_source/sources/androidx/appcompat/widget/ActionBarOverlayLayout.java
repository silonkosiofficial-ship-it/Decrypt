package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ì"})
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.I, androidx.core.view.D, androidx.core.view.E {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final int[] f18010k0 = {p090j.a.f48625b, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f18011C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f18012D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.appcompat.widget.ContentFrameLayout f18013E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    androidx.appcompat.widget.ActionBarContainer f18014F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private androidx.appcompat.widget.J f18015G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18016H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f18017I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f18018J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f18019K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f18020L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    boolean f18021M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f18022N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f18023O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.graphics.Rect f18024P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final android.graphics.Rect f18025Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final android.graphics.Rect f18026R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final android.graphics.Rect f18027S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final android.graphics.Rect f18028T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final android.graphics.Rect f18029U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final android.graphics.Rect f18030V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private androidx.core.view.C2038y0 f18031W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private androidx.core.view.C2038y0 f18032a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private androidx.core.view.C2038y0 f18033b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private androidx.core.view.C2038y0 f18034c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private androidx.appcompat.widget.ActionBarOverlayLayout.d f18035d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private android.widget.OverScroller f18036e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    android.view.ViewPropertyAnimator f18037f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final android.animation.AnimatorListenerAdapter f18038g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final java.lang.Runnable f18039h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final java.lang.Runnable f18040i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final androidx.core.view.F f18041j0;

    class a extends android.animation.AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = androidx.appcompat.widget.ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f18037f0 = null;
            actionBarOverlayLayout.f18021M = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = androidx.appcompat.widget.ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f18037f0 = null;
            actionBarOverlayLayout.f18021M = false;
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.ActionBarOverlayLayout.this.u();
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = androidx.appcompat.widget.ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f18037f0 = actionBarOverlayLayout.f18014F.animate().translationY(0.0f).setListener(androidx.appcompat.widget.ActionBarOverlayLayout.this.f18038g0);
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.ActionBarOverlayLayout.this.u();
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = androidx.appcompat.widget.ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f18037f0 = actionBarOverlayLayout.f18014F.animate().translationY(-androidx.appcompat.widget.ActionBarOverlayLayout.this.f18014F.getHeight()).setListener(androidx.appcompat.widget.ActionBarOverlayLayout.this.f18038g0);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z6);

        void d();

        void e();

        void onWindowVisibilityChanged(int i6);
    }

    public static class e extends android.view.ViewGroup.MarginLayoutParams {
        public e(int i6, int i10) {
            super(i6, i10);
        }

        public e(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18012D = 0;
        this.f18024P = new android.graphics.Rect();
        this.f18025Q = new android.graphics.Rect();
        this.f18026R = new android.graphics.Rect();
        this.f18027S = new android.graphics.Rect();
        this.f18028T = new android.graphics.Rect();
        this.f18029U = new android.graphics.Rect();
        this.f18030V = new android.graphics.Rect();
        androidx.core.view.C2038y0 c2038y0 = androidx.core.view.C2038y0.f21777b;
        this.f18031W = c2038y0;
        this.f18032a0 = c2038y0;
        this.f18033b0 = c2038y0;
        this.f18034c0 = c2038y0;
        this.f18038g0 = new androidx.appcompat.widget.ActionBarOverlayLayout.a();
        this.f18039h0 = new androidx.appcompat.widget.ActionBarOverlayLayout.b();
        this.f18040i0 = new androidx.appcompat.widget.ActionBarOverlayLayout.c();
        v(context);
        this.f18041j0 = new androidx.core.view.F(this);
    }

    private void A() {
        u();
        this.f18039h0.run();
    }

    private boolean B(float f6) {
        this.f18036e0.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f18036e0.getFinalY() > this.f18014F.getHeight();
    }

    private void p() {
        u();
        this.f18040i0.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean q(android.view.View view, android.graphics.Rect rect, boolean z6, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        androidx.appcompat.widget.ActionBarOverlayLayout.e eVar = (androidx.appcompat.widget.ActionBarOverlayLayout.e) view.getLayoutParams();
        if (z6) {
            int i6 = ((android.view.ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i10 = rect.left;
            if (i6 != i10) {
                ((android.view.ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        if (z10) {
            int i11 = ((android.view.ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i12 = rect.top;
            if (i11 != i12) {
                ((android.view.ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
                z13 = true;
            }
        }
        if (z12) {
            int i13 = ((android.view.ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i14 = rect.right;
            if (i13 != i14) {
                ((android.view.ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
                z13 = true;
            }
        }
        if (z11) {
            int i15 = ((android.view.ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((android.view.ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.appcompat.widget.J t(android.view.View view) {
        if (view instanceof androidx.appcompat.widget.J) {
            return (androidx.appcompat.widget.J) view;
        }
        if (view instanceof androidx.appcompat.widget.Toolbar) {
            return ((androidx.appcompat.widget.Toolbar) view).getWrapper();
        }
        throw new java.lang.IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f18010k0);
        this.f18011C = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f18016H = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f18017I = context.getApplicationInfo().targetSdkVersion < 19;
        this.f18036e0 = new android.widget.OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.f18040i0, 600L);
    }

    private void y() {
        u();
        postDelayed(this.f18039h0, 600L);
    }

    @Override // androidx.appcompat.widget.I
    public void a(android.view.Menu menu, androidx.appcompat.view.menu.m.a aVar) {
        z();
        this.f18015G.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.I
    public boolean b() {
        z();
        return this.f18015G.b();
    }

    @Override // androidx.appcompat.widget.I
    public void c() {
        z();
        this.f18015G.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.ActionBarOverlayLayout.e;
    }

    @Override // androidx.appcompat.widget.I
    public boolean d() {
        z();
        return this.f18015G.d();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.f18016H == null || this.f18017I) {
            return;
        }
        int bottom = this.f18014F.getVisibility() == 0 ? (int) (this.f18014F.getBottom() + this.f18014F.getTranslationY() + 0.5f) : 0;
        this.f18016H.setBounds(0, bottom, getWidth(), this.f18016H.getIntrinsicHeight() + bottom);
        this.f18016H.draw(canvas);
    }

    @Override // androidx.appcompat.widget.I
    public boolean e() {
        z();
        return this.f18015G.e();
    }

    @Override // androidx.appcompat.widget.I
    public boolean f() {
        z();
        return this.f18015G.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.I
    public boolean g() {
        z();
        return this.f18015G.g();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.e(layoutParams);
    }

    public int getActionBarHideOffset() {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f18014F;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f18041j0.a();
    }

    public java.lang.CharSequence getTitle() {
        z();
        return this.f18015G.getTitle();
    }

    @Override // androidx.appcompat.widget.I
    public void h(int i6) {
        z();
        if (i6 == 2) {
            this.f18015G.r();
        } else if (i6 == 5) {
            this.f18015G.s();
        } else {
            if (i6 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.I
    public void i() {
        z();
        this.f18015G.h();
    }

    @Override // androidx.core.view.E
    public void j(android.view.View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        k(view, i6, i10, i11, i12, i13);
    }

    @Override // androidx.core.view.D
    public void k(android.view.View view, int i6, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i6, i10, i11, i12);
        }
    }

    @Override // androidx.core.view.D
    public boolean l(android.view.View view, android.view.View view2, int i6, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i6);
    }

    @Override // androidx.core.view.D
    public void m(android.view.View view, android.view.View view2, int i6, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // androidx.core.view.D
    public void n(android.view.View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.D
    public void o(android.view.View view, int i6, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i6, i10, iArr);
        }
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        z();
        androidx.core.view.C2038y0 c2038y0X = androidx.core.view.C2038y0.x(windowInsets, this);
        boolean zQ = q(this.f18014F, new android.graphics.Rect(c2038y0X.j(), c2038y0X.l(), c2038y0X.k(), c2038y0X.i()), true, true, false, true);
        androidx.core.view.X.f(this, c2038y0X, this.f18024P);
        android.graphics.Rect rect = this.f18024P;
        androidx.core.view.C2038y0 c2038y0M = c2038y0X.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f18031W = c2038y0M;
        boolean z6 = true;
        if (!this.f18032a0.equals(c2038y0M)) {
            this.f18032a0 = this.f18031W;
            zQ = true;
        }
        if (this.f18025Q.equals(this.f18024P)) {
            z6 = zQ;
        } else {
            this.f18025Q.set(this.f18024P);
        }
        if (z6) {
            requestLayout();
        }
        return c2038y0X.a().c().b().v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.X.k0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                androidx.appcompat.widget.ActionBarOverlayLayout.e eVar = (androidx.appcompat.widget.ActionBarOverlayLayout.e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((android.view.ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((android.view.ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        int measuredHeight;
        androidx.core.view.C2038y0 c2038y0A;
        z();
        measureChildWithMargins(this.f18014F, i6, 0, i10, 0);
        androidx.appcompat.widget.ActionBarOverlayLayout.e eVar = (androidx.appcompat.widget.ActionBarOverlayLayout.e) this.f18014F.getLayoutParams();
        int iMax = java.lang.Math.max(0, this.f18014F.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) eVar).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = java.lang.Math.max(0, this.f18014F.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) eVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, this.f18014F.getMeasuredState());
        boolean z6 = (androidx.core.view.X.K(this) & 256) != 0;
        if (z6) {
            measuredHeight = this.f18011C;
            if (this.f18019K && this.f18014F.getTabContainer() != null) {
                measuredHeight += this.f18011C;
            }
        } else {
            measuredHeight = this.f18014F.getVisibility() != 8 ? this.f18014F.getMeasuredHeight() : 0;
        }
        this.f18026R.set(this.f18024P);
        androidx.core.view.C2038y0 c2038y0 = this.f18031W;
        this.f18033b0 = c2038y0;
        if (this.f18018J || z6) {
            c2038y0A = new androidx.core.view.C2038y0.b(this.f18033b0).d(androidx.core.graphics.f.b(c2038y0.j(), this.f18033b0.l() + measuredHeight, this.f18033b0.k(), this.f18033b0.i())).a();
        } else {
            android.graphics.Rect rect = this.f18026R;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            c2038y0A = c2038y0.m(0, measuredHeight, 0, 0);
        }
        this.f18033b0 = c2038y0A;
        q(this.f18013E, this.f18026R, true, true, true, true);
        if (!this.f18034c0.equals(this.f18033b0)) {
            androidx.core.view.C2038y0 c2038y1 = this.f18033b0;
            this.f18034c0 = c2038y1;
            androidx.core.view.X.g(this.f18013E, c2038y1);
        }
        measureChildWithMargins(this.f18013E, i6, 0, i10, 0);
        androidx.appcompat.widget.ActionBarOverlayLayout.e eVar2 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) this.f18013E.getLayoutParams();
        int iMax3 = java.lang.Math.max(iMax, this.f18013E.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = java.lang.Math.max(iMax2, this.f18013E.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) eVar2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.f18013E.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, iCombineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f6, float f10, boolean z6) {
        if (!this.f18020L || !z6) {
            return false;
        }
        if (B(f10)) {
            p();
        } else {
            A();
        }
        this.f18021M = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f6, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View view, int i6, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i6, int i10, int i11, int i12) {
        int i13 = this.f18022N + i10;
        this.f18022N = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i6) {
        this.f18041j0.b(view, view2, i6);
        this.f18022N = getActionBarHideOffset();
        u();
        androidx.appcompat.widget.ActionBarOverlayLayout.d dVar = this.f18035d0;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i6) {
        if ((i6 & 2) == 0 || this.f18014F.getVisibility() != 0) {
            return false;
        }
        return this.f18020L;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        if (this.f18020L && !this.f18021M) {
            if (this.f18022N <= this.f18014F.getHeight()) {
                y();
            } else {
                x();
            }
        }
        androidx.appcompat.widget.ActionBarOverlayLayout.d dVar = this.f18035d0;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i6) {
        super.onWindowSystemUiVisibilityChanged(i6);
        z();
        int i10 = this.f18023O ^ i6;
        this.f18023O = i6;
        boolean z6 = (i6 & 4) == 0;
        boolean z10 = (i6 & 256) != 0;
        androidx.appcompat.widget.ActionBarOverlayLayout.d dVar = this.f18035d0;
        if (dVar != null) {
            dVar.c(!z10);
            if (z6 || !z10) {
                this.f18035d0.a();
            } else {
                this.f18035d0.d();
            }
        }
        if ((i10 & 256) == 0 || this.f18035d0 == null) {
            return;
        }
        androidx.core.view.X.k0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f18012D = i6;
        androidx.appcompat.widget.ActionBarOverlayLayout.d dVar = this.f18035d0;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.ActionBarOverlayLayout.e generateDefaultLayoutParams() {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.ActionBarOverlayLayout.e generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i6) {
        u();
        this.f18014F.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i6, this.f18014F.getHeight())));
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.d dVar) {
        this.f18035d0 = dVar;
        if (getWindowToken() != null) {
            this.f18035d0.onWindowVisibilityChanged(this.f18012D);
            int i6 = this.f18023O;
            if (i6 != 0) {
                onWindowSystemUiVisibilityChanged(i6);
                androidx.core.view.X.k0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f18019K = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f18020L) {
            this.f18020L = z6;
            if (z6) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i6) {
        z();
        this.f18015G.setIcon(i6);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        z();
        this.f18015G.setIcon(drawable);
    }

    public void setLogo(int i6) {
        z();
        this.f18015G.l(i6);
    }

    public void setOverlayMode(boolean z6) {
        this.f18018J = z6;
        this.f18017I = z6 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i6) {
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowCallback(android.view.Window.Callback callback) {
        z();
        this.f18015G.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        z();
        this.f18015G.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.f18039h0);
        removeCallbacks(this.f18040i0);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f18037f0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f18018J;
    }

    void z() {
        if (this.f18013E == null) {
            this.f18013E = (androidx.appcompat.widget.ContentFrameLayout) findViewById(p090j.f.f48734b);
            this.f18014F = (androidx.appcompat.widget.ActionBarContainer) findViewById(p090j.f.f48735c);
            this.f18015G = t(findViewById(p090j.f.f48733a));
        }
    }
}
