package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements androidx.core.view.E, androidx.core.view.B {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final float f21810i0 = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final androidx.core.widget.NestedScrollView.a f21811j0 = new androidx.core.widget.NestedScrollView.a();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int[] f21812k0 = {android.R.attr.fillViewport};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float f21813C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f21814D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.graphics.Rect f21815E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.widget.OverScroller f21816F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public android.widget.EdgeEffect f21817G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public android.widget.EdgeEffect f21818H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f21819I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f21820J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f21821K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private android.view.View f21822L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f21823M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.view.VelocityTracker f21824N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f21825O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f21826P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f21827Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f21828R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f21829S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f21830T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final int[] f21831U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final int[] f21832V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f21833W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f21834a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private androidx.core.widget.NestedScrollView.e f21835b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final androidx.core.view.F f21836c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final androidx.core.view.C f21837d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f21838e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private androidx.core.widget.NestedScrollView.d f21839f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final androidx.core.widget.NestedScrollView.c f21840g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    androidx.core.view.C2018o f21841h0;

    static class a extends androidx.core.view.C1990a {
        a() {
        }

        @Override // androidx.core.view.C1990a
        public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
            accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C1.F.a(accessibilityEvent, nestedScrollView.getScrollX());
            C1.F.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            int scrollRange;
            super.g(view, b6);
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
            b6.m0(android.widget.ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            b6.N0(true);
            if (nestedScrollView.getScrollY() > 0) {
                b6.b(C1.B.a.f1252r);
                b6.b(C1.B.a.f1219C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                b6.b(C1.B.a.f1251q);
                b6.b(C1.B.a.f1221E);
            }
        }

        @Override // androidx.core.view.C1990a
        public boolean j(android.view.View view, int i6, android.os.Bundle bundle) {
            if (super.j(view, i6, bundle)) {
                return true;
            }
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i6 != 4096) {
                if (i6 == 8192 || i6 == 16908344) {
                    int iMax = java.lang.Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, iMax, true);
                    return true;
                }
                if (i6 != 16908346) {
                    return false;
                }
            }
            int iMin = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(android.view.ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    class c implements androidx.core.view.InterfaceC2020p {
        c() {
        }

        @Override // androidx.core.view.InterfaceC2020p
        public boolean a(float f6) {
            if (f6 == 0.0f) {
                return false;
            }
            c();
            androidx.core.widget.NestedScrollView.this.v((int) f6);
            return true;
        }

        @Override // androidx.core.view.InterfaceC2020p
        public float b() {
            return -androidx.core.widget.NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC2020p
        public void c() {
            androidx.core.widget.NestedScrollView.this.f21816F.abortAnimation();
        }
    }

    public interface d {
        void a(androidx.core.widget.NestedScrollView nestedScrollView, int i6, int i10, int i11, int i12);
    }

    static class e extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.e> CREATOR = new androidx.core.widget.NestedScrollView.e.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f21843C;

        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.core.widget.NestedScrollView.e createFromParcel(android.os.Parcel parcel) {
                return new androidx.core.widget.NestedScrollView.e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.core.widget.NestedScrollView.e[] newArray(int i6) {
                return new androidx.core.widget.NestedScrollView.e[i6];
            }
        }

        e(android.os.Parcel parcel) {
            super(parcel);
            this.f21843C = parcel.readInt();
        }

        e(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public java.lang.String toString() {
            return "HorizontalScrollView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " scrollPosition=" + this.f21843C + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f21843C);
        }
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p202u1.a.f55369c);
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f21815E = new android.graphics.Rect();
        this.f21820J = true;
        this.f21821K = false;
        this.f21822L = null;
        this.f21823M = false;
        this.f21826P = true;
        this.f21830T = -1;
        this.f21831U = new int[2];
        this.f21832V = new int[2];
        androidx.core.widget.NestedScrollView.c cVar = new androidx.core.widget.NestedScrollView.c();
        this.f21840g0 = cVar;
        this.f21841h0 = new androidx.core.view.C2018o(getContext(), cVar);
        this.f21817G = androidx.core.widget.d.a(context, attributeSet);
        this.f21818H = androidx.core.widget.d.a(context, attributeSet);
        this.f21813C = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f21812k0, i6, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f21836c0 = new androidx.core.view.F(this);
        this.f21837d0 = new androidx.core.view.C(this);
        setNestedScrollingEnabled(true);
        androidx.core.view.X.n0(this, f21811j0);
    }

    private void A() {
        android.view.VelocityTracker velocityTracker = this.f21824N;
        if (velocityTracker == null) {
            this.f21824N = android.view.VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f21816F = new android.widget.OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f21827Q = viewConfiguration.getScaledTouchSlop();
        this.f21828R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21829S = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f21824N == null) {
            this.f21824N = android.view.VelocityTracker.obtain();
        }
    }

    private void D(int i6, int i10) {
        this.f21819I = i6;
        this.f21830T = i10;
        X(2, 0);
    }

    private boolean E(android.view.View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(android.view.View view, android.view.View view2) {
        if (view == view2) {
            return true;
        }
        java.lang.Object parent = view.getParent();
        return (parent instanceof android.view.ViewGroup) && F((android.view.View) parent, view2);
    }

    private boolean G(android.view.View view, int i6, int i10) {
        view.getDrawingRect(this.f21815E);
        offsetDescendantRectToMyCoords(view, this.f21815E);
        return this.f21815E.bottom + i6 >= getScrollY() && this.f21815E.top - i6 <= getScrollY() + i10;
    }

    private void H(int i6, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i6);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f21837d0.e(0, scrollY2, 0, i6 - scrollY2, null, i10, iArr);
    }

    private void I(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f21830T) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f21819I = (int) motionEvent.getY(i6);
            this.f21830T = motionEvent.getPointerId(i6);
            android.view.VelocityTracker velocityTracker = this.f21824N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        android.view.VelocityTracker velocityTracker = this.f21824N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21824N = null;
        }
    }

    private int M(int i6, float f6) {
        float fD;
        android.widget.EdgeEffect edgeEffect;
        float width = f6 / getWidth();
        float height = i6 / getHeight();
        float f10 = 0.0f;
        if (androidx.core.widget.d.b(this.f21817G) != 0.0f) {
            fD = -androidx.core.widget.d.d(this.f21817G, -height, width);
            if (androidx.core.widget.d.b(this.f21817G) == 0.0f) {
                edgeEffect = this.f21817G;
                edgeEffect.onRelease();
            }
            f10 = fD;
        } else if (androidx.core.widget.d.b(this.f21818H) != 0.0f) {
            fD = androidx.core.widget.d.d(this.f21818H, height, 1.0f - width);
            if (androidx.core.widget.d.b(this.f21818H) == 0.0f) {
                edgeEffect = this.f21818H;
                edgeEffect.onRelease();
            }
            f10 = fD;
        }
        int iRound = java.lang.Math.round(f10 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void N(boolean z6) {
        if (z6) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f21834a0 = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i6, int i10, int i11) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z6 = false;
        boolean z10 = i6 == 33;
        android.view.View viewU = u(z10, i10, i11);
        if (viewU == null) {
            viewU = this;
        }
        if (i10 < scrollY || i11 > i12) {
            P(z10 ? i10 - scrollY : i11 - i12, 0, 1, true);
            z6 = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i6);
        }
        return z6;
    }

    private int P(int i6, int i10, int i11, boolean z6) {
        int i12;
        int i13;
        android.widget.EdgeEffect edgeEffect;
        android.view.VelocityTracker velocityTracker;
        if (i11 == 1) {
            X(2, i11);
        }
        boolean z10 = false;
        if (i(0, i6, this.f21832V, this.f21831U, i11)) {
            i12 = i6 - this.f21832V[1];
            i13 = this.f21831U[1];
        } else {
            i12 = i6;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z11 = d() && !z6;
        boolean z12 = J(0, i12, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i11);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f21832V;
        iArr[1] = 0;
        p(0, scrollY2, 0, i12 - scrollY2, this.f21831U, i11, iArr);
        int i14 = i13 + this.f21831U[1];
        int i15 = i12 - this.f21832V[1];
        int i16 = scrollY + i15;
        if (i16 < 0) {
            if (z11) {
                androidx.core.widget.d.d(this.f21817G, (-i15) / getHeight(), i10 / getWidth());
                if (!this.f21818H.isFinished()) {
                    edgeEffect = this.f21818H;
                    edgeEffect.onRelease();
                }
            }
        } else if (i16 > scrollRange && z11) {
            androidx.core.widget.d.d(this.f21818H, i15 / getHeight(), 1.0f - (i10 / getWidth()));
            if (!this.f21817G.isFinished()) {
                edgeEffect = this.f21817G;
                edgeEffect.onRelease();
            }
        }
        if (this.f21817G.isFinished() && this.f21818H.isFinished()) {
            z10 = z12;
        } else {
            postInvalidateOnAnimation();
        }
        if (z10 && i11 == 0 && (velocityTracker = this.f21824N) != null) {
            velocityTracker.clear();
        }
        if (i11 == 1) {
            Z(i11);
            this.f21817G.onRelease();
            this.f21818H.onRelease();
        }
        return i14;
    }

    private void Q(android.view.View view) {
        view.getDrawingRect(this.f21815E);
        offsetDescendantRectToMyCoords(view, this.f21815E);
        int iG = g(this.f21815E);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean R(android.graphics.Rect rect, boolean z6) {
        int iG = g(rect);
        boolean z10 = iG != 0;
        if (z10) {
            if (z6) {
                scrollBy(0, iG);
            } else {
                T(0, iG);
            }
        }
        return z10;
    }

    private boolean S(android.widget.EdgeEffect edgeEffect, int i6) {
        if (i6 > 0) {
            return true;
        }
        return x(-i6) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void U(int i6, int i10, int i11, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.f21814D > 250) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f21816F.startScroll(getScrollX(), scrollY, 0, java.lang.Math.max(0, java.lang.Math.min(i10 + scrollY, java.lang.Math.max(0, height - height2))) - scrollY, i11);
            N(z6);
        } else {
            if (!this.f21816F.isFinished()) {
                a();
            }
            scrollBy(i6, i10);
        }
        this.f21814D = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean Y(android.view.MotionEvent motionEvent) {
        boolean z6;
        if (androidx.core.widget.d.b(this.f21817G) != 0.0f) {
            androidx.core.widget.d.d(this.f21817G, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        if (androidx.core.widget.d.b(this.f21818H) == 0.0f) {
            return z6;
        }
        androidx.core.widget.d.d(this.f21818H, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f21816F.abortAnimation();
        Z(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i6, int i10, int i11) {
        if (i10 >= i11 || i6 < 0) {
            return 0;
        }
        return i10 + i6 > i11 ? i11 - i10 : i6;
    }

    private void q(int i6) {
        if (i6 != 0) {
            if (this.f21826P) {
                T(0, i6);
            } else {
                scrollBy(0, i6);
            }
        }
    }

    private boolean r(int i6) {
        android.widget.EdgeEffect edgeEffect;
        if (androidx.core.widget.d.b(this.f21817G) != 0.0f) {
            if (S(this.f21817G, i6)) {
                edgeEffect = this.f21817G;
                edgeEffect.onAbsorb(i6);
            } else {
                i6 = -i6;
                v(i6);
            }
        } else {
            if (androidx.core.widget.d.b(this.f21818H) == 0.0f) {
                return false;
            }
            i6 = -i6;
            if (S(this.f21818H, i6)) {
                edgeEffect = this.f21818H;
                edgeEffect.onAbsorb(i6);
            } else {
                v(i6);
            }
        }
        return true;
    }

    private void s() {
        this.f21830T = -1;
        this.f21823M = false;
        L();
        Z(0);
        this.f21817G.onRelease();
        this.f21818H.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private android.view.View u(boolean z6, int i6, int i10) {
        java.util.ArrayList<android.view.View> focusables = getFocusables(2);
        int size = focusables.size();
        android.view.View view = null;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            android.view.View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i10) {
                boolean z11 = i6 < top && bottom < i10;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z10) {
                        if (z11 && z12) {
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else if (z12) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float x(int i6) {
        double dLog = java.lang.Math.log((java.lang.Math.abs(i6) * 0.35f) / (this.f21813C * 0.015f));
        float f6 = f21810i0;
        return (float) (((double) (this.f21813C * 0.015f)) * java.lang.Math.exp((((double) f6) / (((double) f6) - 1.0d)) * dLog));
    }

    private boolean z(int i6, int i10) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        android.view.View childAt = getChildAt(0);
        return i10 >= childAt.getTop() - scrollY && i10 < childAt.getBottom() - scrollY && i6 >= childAt.getLeft() && i6 < childAt.getRight();
    }

    boolean J(int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z6) {
        boolean z10;
        boolean z11;
        int overScrollMode = getOverScrollMode();
        boolean z12 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z13 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z14 = overScrollMode == 0 || (overScrollMode == 1 && z12);
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        int i17 = i11 + i6;
        int i18 = !z14 ? 0 : i15;
        int i19 = i12 + i10;
        int i20 = !z15 ? 0 : i16;
        int i21 = -i18;
        int i22 = i18 + i13;
        int i23 = -i20;
        int i24 = i20 + i14;
        if (i17 > i22) {
            i17 = i22;
            z10 = true;
        } else if (i17 < i21) {
            z10 = true;
            i17 = i21;
        } else {
            z10 = false;
        }
        if (i19 > i24) {
            i19 = i24;
            z11 = true;
        } else if (i19 < i23) {
            z11 = true;
            i19 = i23;
        } else {
            z11 = false;
        }
        if (z11 && !y(1)) {
            this.f21816F.springBack(i17, i19, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i17, i19, z10, z11);
        return z10 || z11;
    }

    public boolean K(int i6) {
        boolean z6 = i6 == 130;
        int height = getHeight();
        if (z6) {
            this.f21815E.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                android.view.View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                android.graphics.Rect rect = this.f21815E;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f21815E.top = getScrollY() - height;
            android.graphics.Rect rect2 = this.f21815E;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        android.graphics.Rect rect3 = this.f21815E;
        int i10 = rect3.top;
        int i11 = height + i10;
        rect3.bottom = i11;
        return O(i6, i10, i11);
    }

    public final void T(int i6, int i10) {
        U(i6, i10, 250, false);
    }

    void V(int i6, int i10, int i11, boolean z6) {
        U(i6 - getScrollX(), i10 - getScrollY(), i11, z6);
    }

    void W(int i6, int i10, boolean z6) {
        V(i6, i10, 250, z6);
    }

    public boolean X(int i6, int i10) {
        return this.f21837d0.p(i6, i10);
    }

    public void Z(int i6) {
        this.f21837d0.r(i6);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean c(int i6) {
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i6);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i6 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i6 == 130 && getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                maxScrollAmount = java.lang.Math.min((childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i6 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f21815E);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f21815E);
            P(g(this.f21815E), 0, 1, true);
            viewFindNextFocus.requestFocus(i6);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.EdgeEffect edgeEffect;
        if (this.f21816F.isFinished()) {
            return;
        }
        this.f21816F.computeScrollOffset();
        int currY = this.f21816F.getCurrY();
        int iH = h(currY - this.f21834a0);
        this.f21834a0 = currY;
        int[] iArr = this.f21832V;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i6 = iH - this.f21832V[1];
        int scrollRange = getScrollRange();
        if (i6 != 0) {
            int scrollY = getScrollY();
            J(0, i6, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i10 = i6 - scrollY2;
            int[] iArr2 = this.f21832V;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i10, this.f21831U, 1, iArr2);
            i6 = i10 - this.f21832V[1];
        }
        if (i6 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i6 < 0) {
                    if (this.f21817G.isFinished()) {
                        edgeEffect = this.f21817G;
                        edgeEffect.onAbsorb((int) this.f21816F.getCurrVelocity());
                    }
                } else if (this.f21818H.isFinished()) {
                    edgeEffect = this.f21818H;
                    edgeEffect.onAbsorb((int) this.f21816F.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f21816F.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return java.lang.Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        android.view.View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = java.lang.Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f10, boolean z6) {
        return this.f21837d0.a(f6, f10, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f10) {
        return this.f21837d0.b(f6, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i10, int[] iArr, int[] iArr2) {
        return i(i6, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i10, int i11, int i12, int[] iArr) {
        return this.f21837d0.f(i6, i10, i11, i12, iArr);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f21817G.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = java.lang.Math.min(0, scrollY);
            if (androidx.core.widget.NestedScrollView.b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (androidx.core.widget.NestedScrollView.b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f21817G.setSize(width, height);
            if (this.f21817G.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f21818H.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = java.lang.Math.max(getScrollRange(), scrollY) + height2;
        if (androidx.core.widget.NestedScrollView.b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (androidx.core.widget.NestedScrollView.b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f21818H.setSize(width2, height2);
        if (this.f21818H.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(android.graphics.Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i6 - verticalFadingEdgeLength : i6;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return java.lang.Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return java.lang.Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f21836c0.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        return java.lang.Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f21838e0 == 0.0f) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.Context context = getContext();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new java.lang.IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f21838e0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f21838e0;
    }

    int h(int i6) {
        int height = getHeight();
        if (i6 > 0 && androidx.core.widget.d.b(this.f21817G) != 0.0f) {
            int iRound = java.lang.Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f21817G, ((-i6) * 4.0f) / height, 0.5f));
            if (iRound != i6) {
                this.f21817G.finish();
            }
            return i6 - iRound;
        }
        if (i6 >= 0 || androidx.core.widget.d.b(this.f21818H) == 0.0f) {
            return i6;
        }
        float f6 = height;
        int iRound2 = java.lang.Math.round((f6 / 4.0f) * androidx.core.widget.d.d(this.f21818H, (i6 * 4.0f) / f6, 0.5f));
        if (iRound2 != i6) {
            this.f21818H.finish();
        }
        return i6 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i6, int i10, int[] iArr, int[] iArr2, int i11) {
        return this.f21837d0.d(i6, i10, iArr, iArr2, i11);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f21837d0.l();
    }

    @Override // androidx.core.view.E
    public void j(android.view.View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        H(i12, i13, iArr);
    }

    @Override // androidx.core.view.D
    public void k(android.view.View view, int i6, int i10, int i11, int i12, int i13) {
        H(i12, i13, null);
    }

    @Override // androidx.core.view.D
    public boolean l(android.view.View view, android.view.View view2, int i6, int i10) {
        return (i6 & 2) != 0;
    }

    @Override // androidx.core.view.D
    public void m(android.view.View view, android.view.View view2, int i6, int i10) {
        this.f21836c0.c(view, view2, i6, i10);
        X(2, i10);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(android.view.View view, int i6, int i10) {
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(android.view.View view, int i6, int i10, int i11, int i12) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.D
    public void n(android.view.View view, int i6) {
        this.f21836c0.d(view, i6);
        Z(i6);
    }

    @Override // androidx.core.view.D
    public void o(android.view.View view, int i6, int i10, int[] iArr, int i11) {
        i(i6, i10, iArr, null, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21821K = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        int i6;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f21823M) {
            if (androidx.core.view.A.a(motionEvent, 2)) {
                i6 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (androidx.core.view.A.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i6 = 26;
                axisValue = axisValue2;
            } else {
                i6 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                P(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, androidx.core.view.A.a(motionEvent, 8194));
                if (i6 != 0) {
                    this.f21841h0.g(motionEvent, i6);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f21823M) {
            return true;
        }
        int i6 = action & 255;
        if (i6 == 0) {
            int y6 = (int) motionEvent.getY();
            if (z((int) motionEvent.getX(), y6)) {
                this.f21819I = y6;
                this.f21830T = motionEvent.getPointerId(0);
                A();
                this.f21824N.addMovement(motionEvent);
                this.f21816F.computeScrollOffset();
                if (!Y(motionEvent) && this.f21816F.isFinished()) {
                    z6 = false;
                }
                this.f21823M = z6;
                X(2, 0);
            } else {
                if (!Y(motionEvent) && this.f21816F.isFinished()) {
                    z6 = false;
                }
                this.f21823M = z6;
                L();
            }
        } else if (i6 == 1) {
            this.f21823M = false;
            this.f21830T = -1;
            L();
            if (this.f21816F.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else if (i6 == 2) {
            int i10 = this.f21830T;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                if (iFindPointerIndex == -1) {
                    java.lang.String str = "Invalid pointerId=" + i10 + " in onInterceptTouchEvent";
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    if (java.lang.Math.abs(y10 - this.f21819I) > this.f21827Q && (2 & getNestedScrollAxes()) == 0) {
                        this.f21823M = true;
                        this.f21819I = y10;
                        C();
                        this.f21824N.addMovement(motionEvent);
                        this.f21833W = 0;
                        android.view.ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i6 == 3) {
            this.f21823M = false;
            this.f21830T = -1;
            L();
            if (this.f21816F.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else if (i6 == 6) {
            I(motionEvent);
        }
        return this.f21823M;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        int measuredHeight = 0;
        this.f21820J = false;
        android.view.View view = this.f21822L;
        if (view != null && F(view, this)) {
            Q(this.f21822L);
        }
        this.f21822L = null;
        if (!this.f21821K) {
            if (this.f21835b0 != null) {
                scrollTo(getScrollX(), this.f21835b0.f21843C);
                this.f21835b0 = null;
            }
            if (getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f21821K = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (this.f21825O && android.view.View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f6, float f10, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        v((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f6, float f10) {
        return dispatchNestedPreFling(f6, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View view, int i6, int i10, int[] iArr) {
        o(view, i6, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i6, int i10, int i11, int i12) {
        H(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i6) {
        m(view, view2, i6, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i6, int i10, boolean z6, boolean z10) {
        super.scrollTo(i6, i10);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i6, android.graphics.Rect rect) {
        if (i6 == 2) {
            i6 = 130;
        } else if (i6 == 1) {
            i6 = 33;
        }
        android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
        android.view.View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i6) : focusFinder.findNextFocusFromRect(this, rect, i6);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i6, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.core.widget.NestedScrollView.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.core.widget.NestedScrollView.e eVar = (androidx.core.widget.NestedScrollView.e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f21835b0 = eVar;
        requestLayout();
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.core.widget.NestedScrollView.e eVar = new androidx.core.widget.NestedScrollView.e(super.onSaveInstanceState());
        eVar.f21843C = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i6, int i10, int i11, int i12) {
        super.onScrollChanged(i6, i10, i11, i12);
        androidx.core.widget.NestedScrollView.d dVar = this.f21839f0;
        if (dVar != null) {
            dVar.a(this, i6, i10, i11, i12);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i12)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f21815E);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f21815E);
        q(g(this.f21815E));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i6) {
        return l(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        n(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21833W = 0;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f21833W);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                android.view.VelocityTracker velocityTracker = this.f21824N;
                velocityTracker.computeCurrentVelocity(1000, this.f21829S);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f21830T);
                if (java.lang.Math.abs(yVelocity) >= this.f21828R) {
                    if (!r(yVelocity)) {
                        int i6 = -yVelocity;
                        float f6 = i6;
                        if (!dispatchNestedPreFling(0.0f, f6)) {
                            dispatchNestedFling(0.0f, f6, true);
                            v(i6);
                        }
                    }
                } else if (this.f21816F.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f21830T);
                if (iFindPointerIndex == -1) {
                    java.lang.String str = "Invalid pointerId=" + this.f21830T + " in onTouchEvent";
                } else {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    int i10 = this.f21819I - y6;
                    int iM = i10 - M(i10, motionEvent.getX(iFindPointerIndex));
                    if (!this.f21823M && java.lang.Math.abs(iM) > this.f21827Q) {
                        android.view.ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f21823M = true;
                        int i11 = this.f21827Q;
                        iM = iM > 0 ? iM - i11 : iM + i11;
                    }
                    if (this.f21823M) {
                        int iP = P(iM, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f21819I = y6 - iP;
                        this.f21833W += iP;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f21823M && getChildCount() > 0 && this.f21816F.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f21819I = (int) motionEvent.getY(actionIndex);
                this.f21830T = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f21819I = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f21830T));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f21823M && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f21816F.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        android.view.VelocityTracker velocityTracker2 = this.f21824N;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i6, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        this.f21837d0.e(i6, i10, i11, i12, iArr, i13, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (this.f21820J) {
            this.f21822L = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        if (z6) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f21820J = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i6, int i10) {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i6, width, width2);
            int iF2 = f(i10, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f21825O) {
            this.f21825O = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        this.f21837d0.m(z6);
    }

    public void setOnScrollChangeListener(androidx.core.widget.NestedScrollView.d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f21826P = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return X(i6, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(android.view.KeyEvent keyEvent) {
        this.f21815E.setEmpty();
        int i6 = 130;
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            android.view.View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    if (keyCode != 92) {
                        if (keyCode != 93) {
                            if (keyCode == 122) {
                                K(33);
                                return false;
                            }
                            if (keyCode != 123) {
                                return false;
                            }
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    i6 = 33;
                }
                K(i6);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return c(130);
            }
            return w(130);
        }
        if (!keyEvent.isAltPressed()) {
            return c(33);
        }
        return w(33);
    }

    public void v(int i6) {
        if (getChildCount() > 0) {
            this.f21816F.fling(getScrollX(), getScrollY(), 0, i6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i6) {
        int childCount;
        boolean z6 = i6 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.f21815E;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            android.view.View childAt = getChildAt(childCount - 1);
            this.f21815E.bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            android.graphics.Rect rect2 = this.f21815E;
            rect2.top = rect2.bottom - height;
        }
        android.graphics.Rect rect3 = this.f21815E;
        return O(i6, rect3.top, rect3.bottom);
    }

    public boolean y(int i6) {
        return this.f21837d0.k(i6);
    }
}
