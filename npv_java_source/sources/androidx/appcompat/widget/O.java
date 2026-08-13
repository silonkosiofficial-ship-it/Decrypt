package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class O extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f18161C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f18162D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f18163E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f18164F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f18165G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f18166H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f18167I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f18168J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int[] f18169K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int[] f18170L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18171M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f18172N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f18173O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f18174P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f18175Q;

    public static class a extends android.widget.LinearLayout.LayoutParams {
        public a(int i6, int i10) {
            super(i6, i10);
        }

        public a(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public O(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public O(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f18161C = true;
        this.f18162D = -1;
        this.f18163E = 0;
        this.f18165G = 8388659;
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(context, attributeSet, p090j.j.f48903a1, i6, 0);
        androidx.core.view.X.l0(this, context, p090j.j.f48903a1, attributeSet, c0VarV.r(), i6, 0);
        int iK = c0VarV.k(p090j.j.f48913c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = c0VarV.k(p090j.j.f48908b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = c0VarV.a(p090j.j.f48918d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f18167I = c0VarV.i(p090j.j.f48928f1, -1.0f);
        this.f18162D = c0VarV.k(p090j.j.f48923e1, -1);
        this.f18168J = c0VarV.a(p090j.j.f48943i1, false);
        setDividerDrawable(c0VarV.g(p090j.j.f48933g1));
        this.f18174P = c0VarV.k(p090j.j.f48948j1, 0);
        this.f18175Q = c0VarV.f(p090j.j.f48938h1, 0);
        c0VarV.w();
    }

    private void A(android.view.View view, int i6, int i10, int i11, int i12) {
        view.layout(i6, i10, i11 + i6, i12 + i10);
    }

    private void k(int i6, int i10) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i11 = 0; i11 < i6; i11++) {
            android.view.View viewS = s(i11);
            if (viewS.getVisibility() != 8) {
                androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) viewS.getLayoutParams();
                if (((android.widget.LinearLayout.LayoutParams) aVar).height == -1) {
                    int i12 = ((android.widget.LinearLayout.LayoutParams) aVar).width;
                    ((android.widget.LinearLayout.LayoutParams) aVar).width = viewS.getMeasuredWidth();
                    measureChildWithMargins(viewS, i10, 0, iMakeMeasureSpec, 0);
                    ((android.widget.LinearLayout.LayoutParams) aVar).width = i12;
                }
            }
        }
    }

    private void l(int i6, int i10) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i11 = 0; i11 < i6; i11++) {
            android.view.View viewS = s(i11);
            if (viewS.getVisibility() != 8) {
                androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) viewS.getLayoutParams();
                if (((android.widget.LinearLayout.LayoutParams) aVar).width == -1) {
                    int i12 = ((android.widget.LinearLayout.LayoutParams) aVar).height;
                    ((android.widget.LinearLayout.LayoutParams) aVar).height = viewS.getMeasuredHeight();
                    measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i10, 0);
                    ((android.widget.LinearLayout.LayoutParams) aVar).height = i12;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.O.a;
    }

    void g(android.graphics.Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = androidx.appcompat.widget.n0.b(this);
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            android.view.View viewS = s(i6);
            if (viewS != null && viewS.getVisibility() != 8 && t(i6)) {
                androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin : (viewS.getLeft() - ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin) - this.f18172N);
            }
        }
        if (t(virtualChildCount)) {
            android.view.View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                androidx.appcompat.widget.O.a aVar2 = (androidx.appcompat.widget.O.a) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft();
                    paddingRight = ((android.widget.LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f18172N;
                } else {
                    right = viewS2.getRight() + ((android.widget.LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f18172N;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f18162D < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f18162D;
        if (childCount <= i10) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f18162D == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f18163E;
        if (this.f18164F == 1 && (i6 = this.f18165G & 112) != 48) {
            if (i6 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f18166H) / 2;
            } else if (i6 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f18166H;
            }
        }
        return bottom + ((android.widget.LinearLayout.LayoutParams) ((androidx.appcompat.widget.O.a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f18162D;
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
        return this.f18171M;
    }

    public int getDividerPadding() {
        return this.f18175Q;
    }

    public int getDividerWidth() {
        return this.f18172N;
    }

    public int getGravity() {
        return this.f18165G;
    }

    public int getOrientation() {
        return this.f18164F;
    }

    public int getShowDividers() {
        return this.f18174P;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f18167I;
    }

    void h(android.graphics.Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            android.view.View viewS = s(i6);
            if (viewS != null && viewS.getVisibility() != 8 && t(i6)) {
                i(canvas, (viewS.getTop() - ((android.widget.LinearLayout.LayoutParams) ((androidx.appcompat.widget.O.a) viewS.getLayoutParams())).topMargin) - this.f18173O);
            }
        }
        if (t(virtualChildCount)) {
            android.view.View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.f18173O : viewS2.getBottom() + ((android.widget.LinearLayout.LayoutParams) ((androidx.appcompat.widget.O.a) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    void i(android.graphics.Canvas canvas, int i6) {
        this.f18171M.setBounds(getPaddingLeft() + this.f18175Q, i6, (getWidth() - getPaddingRight()) - this.f18175Q, this.f18173O + i6);
        this.f18171M.draw(canvas);
    }

    void j(android.graphics.Canvas canvas, int i6) {
        this.f18171M.setBounds(i6, getPaddingTop() + this.f18175Q, this.f18172N + i6, (getHeight() - getPaddingBottom()) - this.f18175Q);
        this.f18171M.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.O.a generateDefaultLayoutParams() {
        int i6 = this.f18164F;
        if (i6 == 0) {
            return new androidx.appcompat.widget.O.a(-2, -2);
        }
        if (i6 == 1) {
            return new androidx.appcompat.widget.O.a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.O.a generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.O.a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.O.a generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.appcompat.widget.O.a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.f18171M == null) {
            return;
        }
        if (this.f18164F == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        if (this.f18164F == 1) {
            v(i6, i10, i11, i12);
        } else {
            u(i6, i10, i11, i12);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        if (this.f18164F == 1) {
            z(i6, i10);
        } else {
            x(i6, i10);
        }
    }

    int p(android.view.View view, int i6) {
        return 0;
    }

    int q(android.view.View view) {
        return 0;
    }

    int r(android.view.View view) {
        return 0;
    }

    android.view.View s(int i6) {
        return getChildAt(i6);
    }

    public void setBaselineAligned(boolean z6) {
        this.f18161C = z6;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f18162D = i6;
            return;
        }
        throw new java.lang.IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f18171M) {
            return;
        }
        this.f18171M = drawable;
        if (drawable != null) {
            this.f18172N = drawable.getIntrinsicWidth();
            this.f18173O = drawable.getIntrinsicHeight();
        } else {
            this.f18172N = 0;
            this.f18173O = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.f18175Q = i6;
    }

    public void setGravity(int i6) {
        if (this.f18165G != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f18165G = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i10 = i6 & 8388615;
        int i11 = this.f18165G;
        if ((8388615 & i11) != i10) {
            this.f18165G = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f18168J = z6;
    }

    public void setOrientation(int i6) {
        if (this.f18164F != i6) {
            this.f18164F = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.f18174P) {
            requestLayout();
        }
        this.f18174P = i6;
    }

    public void setVerticalGravity(int i6) {
        int i10 = i6 & 112;
        int i11 = this.f18165G;
        if ((i11 & 112) != i10) {
            this.f18165G = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f18167I = java.lang.Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i6) {
        if (i6 == 0) {
            return (this.f18174P & 1) != 0;
        }
        if (i6 == getChildCount()) {
            return (this.f18174P & 4) != 0;
        }
        if ((this.f18174P & 2) == 0) {
            return false;
        }
        for (int i10 = i6 - 1; i10 >= 0; i10--) {
            if (getChildAt(i10).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    void u(int i6, int i10, int i11, int i12) {
        int paddingLeft;
        int i13;
        int i14;
        boolean z6;
        int baseline;
        int i15;
        int i16;
        int measuredHeight;
        boolean zB = androidx.appcompat.widget.n0.b(this);
        int paddingTop = getPaddingTop();
        int i17 = i12 - i10;
        int paddingBottom = i17 - getPaddingBottom();
        int paddingBottom2 = (i17 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f18165G;
        int i19 = i18 & 112;
        boolean z10 = this.f18161C;
        int[] iArr = this.f18169K;
        int[] iArr2 = this.f18170L;
        int iB = androidx.core.view.AbstractC2025s.b(8388615 & i18, androidx.core.view.X.z(this));
        boolean z11 = true;
        if (iB != 1) {
            paddingLeft = iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i6) - this.f18166H;
        } else {
            paddingLeft = getPaddingLeft() + (((i11 - i6) - this.f18166H) / 2);
        }
        if (zB) {
            i13 = virtualChildCount - 1;
            i14 = -1;
        } else {
            i13 = 0;
            i14 = 1;
        }
        int iP = 0;
        while (iP < virtualChildCount) {
            int i20 = i13 + (i14 * iP);
            android.view.View viewS = s(i20);
            if (viewS == null) {
                paddingLeft += y(i20);
                z6 = z11;
            } else {
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight2 = viewS.getMeasuredHeight();
                    androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) viewS.getLayoutParams();
                    int i21 = iP;
                    if (z10) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((android.widget.LinearLayout.LayoutParams) aVar).height != -1 ? viewS.getBaseline() : -1;
                        i15 = ((android.widget.LinearLayout.LayoutParams) aVar).gravity;
                        if (i15 < 0) {
                            i15 = i19;
                        }
                        i16 = i15 & 112;
                        i19 = i19;
                        if (i16 != 16) {
                            if (i16 != 48) {
                                measuredHeight = ((android.widget.LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z6 = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i16 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (viewS.getMeasuredHeight() - baseline);
                                }
                            }
                            z6 = true;
                        } else {
                            z6 = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((android.widget.LinearLayout.LayoutParams) aVar).topMargin) - ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        if (t(i20)) {
                            paddingLeft += this.f18172N;
                        }
                        int i22 = ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        A(viewS, i22 + q(viewS), measuredHeight, measuredWidth, measuredHeight2);
                        int iR = i22 + measuredWidth + ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin + r(viewS);
                        iP = i21 + p(viewS, i20);
                        paddingLeft = iR;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i15 = ((android.widget.LinearLayout.LayoutParams) aVar).gravity;
                    if (i15 < 0) {
                        i15 = i19;
                    }
                    i16 = i15 & 112;
                    i19 = i19;
                    if (i16 != 16) {
                        if (i16 != 48) {
                            measuredHeight = ((android.widget.LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z6 = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i16 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewS.getMeasuredHeight() - baseline);
                            }
                        }
                        z6 = true;
                    } else {
                        z6 = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((android.widget.LinearLayout.LayoutParams) aVar).topMargin) - ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    if (t(i20)) {
                        paddingLeft += this.f18172N;
                    }
                    int i23 = ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    A(viewS, i23 + q(viewS), measuredHeight, measuredWidth, measuredHeight2);
                    int iR2 = i23 + measuredWidth + ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin + r(viewS);
                    iP = i21 + p(viewS, i20);
                    paddingLeft = iR2;
                } else {
                    z6 = true;
                }
                iP++;
                virtualChildCount = virtualChildCount;
                i19 = i19;
                z11 = z6;
                paddingTop = paddingTop;
            }
            iP++;
            virtualChildCount = virtualChildCount;
            i19 = i19;
            z11 = z6;
            paddingTop = paddingTop;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    void v(int i6, int i10, int i11, int i12) {
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int paddingLeft = getPaddingLeft();
        int i16 = i11 - i6;
        int paddingRight = i16 - getPaddingRight();
        int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i17 = this.f18165G;
        int i18 = i17 & 112;
        int i19 = i17 & 8388615;
        if (i18 != 16) {
            paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f18166H;
        } else {
            paddingTop = getPaddingTop() + (((i12 - i10) - this.f18166H) / 2);
        }
        int iP = 0;
        while (iP < virtualChildCount) {
            android.view.View viewS = s(iP);
            if (viewS == null) {
                paddingTop += y(iP);
            } else {
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight = viewS.getMeasuredHeight();
                    androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) viewS.getLayoutParams();
                    int i20 = ((android.widget.LinearLayout.LayoutParams) aVar).gravity;
                    if (i20 < 0) {
                        i20 = i19;
                    }
                    int iB = androidx.core.view.AbstractC2025s.b(i20, androidx.core.view.X.z(this)) & 7;
                    if (iB != 1) {
                        if (iB != 5) {
                            i14 = ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i13 = paddingRight - measuredWidth;
                        }
                        int i21 = i14;
                        if (t(iP)) {
                            paddingTop += this.f18173O;
                        }
                        int i22 = paddingTop + ((android.widget.LinearLayout.LayoutParams) aVar).topMargin;
                        A(viewS, i21, i22 + q(viewS), measuredWidth, measuredHeight);
                        int iR = i22 + measuredHeight + ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS);
                        iP += p(viewS, iP);
                        paddingTop = iR;
                        i15 = 1;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin;
                    }
                    i14 = i13 - ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin;
                    int i23 = i14;
                    if (t(iP)) {
                        paddingTop += this.f18173O;
                    }
                    int i24 = paddingTop + ((android.widget.LinearLayout.LayoutParams) aVar).topMargin;
                    A(viewS, i23, i24 + q(viewS), measuredWidth, measuredHeight);
                    int iR2 = i24 + measuredHeight + ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS);
                    iP += p(viewS, iP);
                    paddingTop = iR2;
                    i15 = 1;
                }
                iP += i15;
            }
            i15 = 1;
            iP += i15;
        }
    }

    void w(android.view.View view, int i6, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03b1 A[PHI: r3
  0x03b1: PHI (r3v31 int) = (r3v27 int), (r3v32 int) binds: [B:173:0x03c2, B:167:0x03ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x044c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    void x(int i6, int i10) {
        int[] iArr;
        int iCombineMeasuredStates;
        int i11;
        int iMax;
        int i12;
        int i13;
        int baseline;
        int i14;
        int i15;
        byte b6;
        int i16;
        int i17;
        boolean z6;
        boolean z10;
        android.view.View view;
        int iMax2;
        int i18;
        boolean z11;
        int i19;
        int measuredHeight;
        int iP;
        int baseline2;
        int i20;
        this.f18166H = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = android.view.View.MeasureSpec.getMode(i6);
        int mode2 = android.view.View.MeasureSpec.getMode(i10);
        if (this.f18169K == null || this.f18170L == null) {
            this.f18169K = new int[4];
            this.f18170L = new int[4];
        }
        int[] iArr2 = this.f18169K;
        int[] iArr3 = this.f18170L;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z12 = this.f18161C;
        boolean z13 = this.f18168J;
        int i21 = 1073741824;
        boolean z14 = mode == 1073741824;
        int iP2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        boolean z15 = false;
        int iCombineMeasuredStates2 = 0;
        boolean z16 = false;
        boolean z17 = true;
        float f6 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iP2 >= virtualChildCount) {
                break;
            }
            android.view.View viewS = s(iP2);
            if (viewS == null) {
                this.f18166H += y(iP2);
            } else {
                if (viewS.getVisibility() == 8) {
                    iP2 += p(viewS, iP2);
                } else {
                    if (t(iP2)) {
                        this.f18166H += this.f18172N;
                    }
                    androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) viewS.getLayoutParams();
                    float f10 = ((android.widget.LinearLayout.LayoutParams) aVar).weight;
                    float f11 = f6 + f10;
                    if (mode == i21 && ((android.widget.LinearLayout.LayoutParams) aVar).width == 0 && f10 > 0.0f) {
                        int i22 = this.f18166H;
                        this.f18166H = z14 ? i22 + ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin : java.lang.Math.max(i22, ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + i22 + ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin);
                        if (z12) {
                            int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewS.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i17 = iP2;
                            z6 = z13;
                            z10 = z12;
                            view = viewS;
                        } else {
                            i17 = iP2;
                            z6 = z13;
                            z10 = z12;
                            view = viewS;
                            z15 = true;
                            i18 = 1073741824;
                        }
                        if (mode2 == i18 && ((android.widget.LinearLayout.LayoutParams) aVar).height == -1) {
                            z11 = true;
                            z16 = true;
                        } else {
                            z11 = false;
                        }
                        i19 = ((android.widget.LinearLayout.LayoutParams) aVar).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i19;
                        iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                        if (z10 && (baseline2 = view.getBaseline()) != -1) {
                            i20 = ((android.widget.LinearLayout.LayoutParams) aVar).gravity;
                            if (i20 < 0) {
                                i20 = this.f18165G;
                            }
                            int i23 = (((i20 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i23] = java.lang.Math.max(iArr2[i23], baseline2);
                            iArr[i23] = java.lang.Math.max(iArr[i23], measuredHeight - baseline2);
                        }
                        iMax4 = java.lang.Math.max(iMax4, measuredHeight);
                        if (z17 || ((android.widget.LinearLayout.LayoutParams) aVar).height != -1) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (((android.widget.LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                            if (!z11) {
                                i19 = measuredHeight;
                            }
                            iMax6 = java.lang.Math.max(iMax6, i19);
                        } else {
                            int i24 = iMax6;
                            if (!z11) {
                                i19 = measuredHeight;
                            }
                            iMax5 = java.lang.Math.max(iMax5, i19);
                            iMax6 = i24;
                        }
                        int i25 = i17;
                        iP = p(view, i25) + i25;
                        f6 = f11;
                    } else {
                        if (((android.widget.LinearLayout.LayoutParams) aVar).width != 0 || f10 <= 0.0f) {
                            b6 = -2;
                            i16 = Integer.MIN_VALUE;
                        } else {
                            b6 = -2;
                            ((android.widget.LinearLayout.LayoutParams) aVar).width = -2;
                            i16 = 0;
                        }
                        i17 = iP2;
                        int i26 = i16;
                        z6 = z13;
                        z10 = z12;
                        w(viewS, i17, i6, f11 == 0.0f ? this.f18166H : 0, i10, 0);
                        if (i26 != Integer.MIN_VALUE) {
                            ((android.widget.LinearLayout.LayoutParams) aVar).width = i26;
                        }
                        int measuredWidth = viewS.getMeasuredWidth();
                        if (z14) {
                            view = viewS;
                            iMax2 = this.f18166H + ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin + r(view);
                        } else {
                            view = viewS;
                            int i27 = this.f18166H;
                            iMax2 = java.lang.Math.max(i27, i27 + measuredWidth + ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin + r(view));
                        }
                        this.f18166H = iMax2;
                        if (z6) {
                            iMax3 = java.lang.Math.max(measuredWidth, iMax3);
                        }
                    }
                    i18 = 1073741824;
                    if (mode2 == i18) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    i19 = ((android.widget.LinearLayout.LayoutParams) aVar).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i19;
                    iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                    if (z10) {
                        i20 = ((android.widget.LinearLayout.LayoutParams) aVar).gravity;
                        if (i20 < 0) {
                            i20 = this.f18165G;
                        }
                        int i28 = (((i20 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i28] = java.lang.Math.max(iArr2[i28], baseline2);
                        iArr[i28] = java.lang.Math.max(iArr[i28], measuredHeight - baseline2);
                    }
                    iMax4 = java.lang.Math.max(iMax4, measuredHeight);
                    if (z17) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (((android.widget.LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z11) {
                            i19 = measuredHeight;
                        }
                        iMax6 = java.lang.Math.max(iMax6, i19);
                    } else {
                        int i29 = iMax6;
                        if (!z11) {
                            i19 = measuredHeight;
                        }
                        iMax5 = java.lang.Math.max(iMax5, i19);
                        iMax6 = i29;
                    }
                    int i210 = i17;
                    iP = p(view, i210) + i210;
                    f6 = f11;
                }
                int i30 = iP + 1;
                iArr3 = iArr;
                z13 = z6;
                z12 = z10;
                i21 = i18;
                iP2 = i30;
            }
            z6 = z13;
            z10 = z12;
            int i31 = i21;
            iP = iP2;
            i18 = i31;
            int i32 = iP + 1;
            iArr3 = iArr;
            z13 = z6;
            z12 = z10;
            i21 = i18;
            iP2 = i32;
        }
        boolean z18 = z13;
        boolean z19 = z12;
        int i33 = iMax4;
        int i34 = iMax5;
        int i35 = iMax6;
        int i36 = iCombineMeasuredStates2;
        if (this.f18166H > 0 && t(virtualChildCount)) {
            this.f18166H += this.f18172N;
        }
        int i37 = iArr2[1];
        int iMax7 = (i37 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i33 : java.lang.Math.max(i33, java.lang.Math.max(iArr2[3], java.lang.Math.max(iArr2[0], java.lang.Math.max(i37, iArr2[2]))) + java.lang.Math.max(iArr[3], java.lang.Math.max(iArr[0], java.lang.Math.max(iArr[1], iArr[2]))));
        if (z18 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f18166H = 0;
            int iP3 = 0;
            while (iP3 < virtualChildCount) {
                android.view.View viewS2 = s(iP3);
                if (viewS2 == null) {
                    this.f18166H += y(iP3);
                } else if (viewS2.getVisibility() == 8) {
                    iP3 += p(viewS2, iP3);
                } else {
                    androidx.appcompat.widget.O.a aVar2 = (androidx.appcompat.widget.O.a) viewS2.getLayoutParams();
                    int i38 = this.f18166H;
                    if (z14) {
                        this.f18166H = i38 + ((android.widget.LinearLayout.LayoutParams) aVar2).leftMargin + iMax3 + ((android.widget.LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2);
                    } else {
                        this.f18166H = java.lang.Math.max(i38, i38 + iMax3 + ((android.widget.LinearLayout.LayoutParams) aVar2).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2));
                    }
                    iP3++;
                    iMax7 = iMax7;
                }
                iP3++;
                iMax7 = iMax7;
            }
        }
        int iMax8 = iMax7;
        int paddingLeft = this.f18166H + getPaddingLeft() + getPaddingRight();
        this.f18166H = paddingLeft;
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingLeft, getSuggestedMinimumWidth()), i6, 0);
        int i39 = (16777215 & iResolveSizeAndState) - this.f18166H;
        if (z15 || (i39 != 0 && f6 > 0.0f)) {
            float f12 = this.f18167I;
            if (f12 > 0.0f) {
                f6 = f12;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f18166H = 0;
            int i40 = i34;
            int iMax9 = -1;
            iCombineMeasuredStates = i36;
            int i41 = 0;
            while (i41 < virtualChildCount) {
                android.view.View viewS3 = s(i41);
                if (viewS3 == null || viewS3.getVisibility() == 8) {
                    i12 = i39;
                    virtualChildCount = virtualChildCount;
                } else {
                    androidx.appcompat.widget.O.a aVar3 = (androidx.appcompat.widget.O.a) viewS3.getLayoutParams();
                    float f13 = ((android.widget.LinearLayout.LayoutParams) aVar3).weight;
                    if (f13 > 0.0f) {
                        int measuredWidth2 = (int) ((i39 * f13) / f6);
                        float f14 = f6 - f13;
                        int i42 = i39 - measuredWidth2;
                        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + ((android.widget.LinearLayout.LayoutParams) aVar3).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar3).bottomMargin, ((android.widget.LinearLayout.LayoutParams) aVar3).height);
                        if (((android.widget.LinearLayout.LayoutParams) aVar3).width == 0) {
                            i15 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                            }
                            viewS3.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, i15), childMeasureSpec);
                            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewS3.getMeasuredState() & (-16777216));
                            f6 = f14;
                            i12 = i42;
                        } else {
                            i15 = 1073741824;
                        }
                        measuredWidth2 = viewS3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewS3.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, i15), childMeasureSpec);
                        iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewS3.getMeasuredState() & (-16777216));
                        f6 = f14;
                        i12 = i42;
                    } else {
                        i12 = i39;
                    }
                    int i43 = this.f18166H;
                    if (z14) {
                        this.f18166H = i43 + viewS3.getMeasuredWidth() + ((android.widget.LinearLayout.LayoutParams) aVar3).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3);
                    } else {
                        this.f18166H = java.lang.Math.max(i43, viewS3.getMeasuredWidth() + i43 + ((android.widget.LinearLayout.LayoutParams) aVar3).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3));
                    }
                    boolean z20 = mode2 != 1073741824 && ((android.widget.LinearLayout.LayoutParams) aVar3).height == -1;
                    int i44 = ((android.widget.LinearLayout.LayoutParams) aVar3).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewS3.getMeasuredHeight() + i44;
                    iMax9 = java.lang.Math.max(iMax9, measuredHeight2);
                    if (!z20) {
                        i44 = measuredHeight2;
                    }
                    int iMax10 = java.lang.Math.max(i40, i44);
                    if (z17) {
                        i13 = -1;
                        boolean z21 = ((android.widget.LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z19 && (baseline = viewS3.getBaseline()) != i13) {
                            i14 = ((android.widget.LinearLayout.LayoutParams) aVar3).gravity;
                            if (i14 < 0) {
                                i14 = this.f18165G;
                            }
                            int i45 = (((i14 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i45] = java.lang.Math.max(iArr2[i45], baseline);
                            iArr[i45] = java.lang.Math.max(iArr[i45], measuredHeight2 - baseline);
                        }
                        z17 = z21;
                        i40 = iMax10;
                        f6 = f6;
                    } else {
                        i13 = -1;
                    }
                    if (z19) {
                        i14 = ((android.widget.LinearLayout.LayoutParams) aVar3).gravity;
                        if (i14 < 0) {
                            i14 = this.f18165G;
                        }
                        int i46 = (((i14 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i46] = java.lang.Math.max(iArr2[i46], baseline);
                        iArr[i46] = java.lang.Math.max(iArr[i46], measuredHeight2 - baseline);
                    }
                    z17 = z21;
                    i40 = iMax10;
                    f6 = f6;
                }
                i41++;
                i39 = i12;
                virtualChildCount = virtualChildCount;
            }
            i11 = virtualChildCount;
            this.f18166H += getPaddingLeft() + getPaddingRight();
            int i47 = iArr2[1];
            iMax8 = (i47 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax9 : java.lang.Math.max(iMax9, java.lang.Math.max(iArr2[3], java.lang.Math.max(iArr2[0], java.lang.Math.max(i47, iArr2[2]))) + java.lang.Math.max(iArr[3], java.lang.Math.max(iArr[0], java.lang.Math.max(iArr[1], iArr[2]))));
            iMax = i40;
        } else {
            iMax = java.lang.Math.max(i34, i35);
            if (z18 && mode != 1073741824) {
                for (int i48 = 0; i48 < virtualChildCount; i48++) {
                    android.view.View viewS4 = s(i48);
                    if (viewS4 != null && viewS4.getVisibility() != 8 && ((android.widget.LinearLayout.LayoutParams) ((androidx.appcompat.widget.O.a) viewS4.getLayoutParams())).weight > 0.0f) {
                        viewS4.measure(android.view.View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(viewS4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i11 = virtualChildCount;
            iCombineMeasuredStates = i36;
        }
        if (z17 || mode2 == 1073741824) {
            iMax = iMax8;
        }
        setMeasuredDimension(iResolveSizeAndState | ((-16777216) & iCombineMeasuredStates), android.view.View.resolveSizeAndState(java.lang.Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i10, iCombineMeasuredStates << 16));
        if (z16) {
            k(i11, i6);
        }
    }

    int y(int i6) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02d4 A[PHI: r10
  0x02d4: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:136:0x02e5, B:130:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x0327  */
    void z(int i6, int i10) {
        int i11;
        int iCombineMeasuredStates;
        int iMax;
        int i12;
        int i13;
        int i14;
        boolean z6;
        int i15;
        int iMax2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax3;
        int i22;
        android.view.View view;
        int iMax4;
        boolean z10;
        this.f18166H = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = android.view.View.MeasureSpec.getMode(i6);
        int mode2 = android.view.View.MeasureSpec.getMode(i10);
        int i23 = this.f18162D;
        boolean z11 = this.f18168J;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int iMax5 = 0;
        int i27 = 0;
        int iP = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        float f6 = 0.0f;
        while (true) {
            int i28 = 8;
            int i29 = iMax5;
            if (iP >= virtualChildCount) {
                int i30 = i24;
                int i31 = i26;
                int i32 = i27;
                int i33 = mode2;
                int iMax6 = i25;
                int i34 = virtualChildCount;
                if (this.f18166H > 0) {
                    i11 = i34;
                    if (t(i11)) {
                        this.f18166H += this.f18173O;
                    }
                } else {
                    i11 = i34;
                }
                if (z11 && (i33 == Integer.MIN_VALUE || i33 == 0)) {
                    this.f18166H = 0;
                    int iP2 = 0;
                    while (iP2 < i11) {
                        android.view.View viewS = s(iP2);
                        if (viewS == null) {
                            iMax2 = this.f18166H + y(iP2);
                        } else {
                            if (viewS.getVisibility() == i28) {
                                iP2 += p(viewS, iP2);
                            } else {
                                androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) viewS.getLayoutParams();
                                int i35 = this.f18166H;
                                iMax2 = java.lang.Math.max(i35, i35 + i31 + ((android.widget.LinearLayout.LayoutParams) aVar).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS));
                            }
                            iP2++;
                            i28 = 8;
                        }
                        this.f18166H = iMax2;
                        iP2++;
                        i28 = 8;
                    }
                }
                int paddingTop = this.f18166H + getPaddingTop() + getPaddingBottom();
                this.f18166H = paddingTop;
                int iResolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingTop, getSuggestedMinimumHeight()), i10, 0);
                int i36 = (16777215 & iResolveSizeAndState) - this.f18166H;
                if (z12 || (i36 != 0 && f6 > 0.0f)) {
                    float f10 = this.f18167I;
                    if (f10 > 0.0f) {
                        f6 = f10;
                    }
                    this.f18166H = 0;
                    int i37 = i36;
                    int i38 = i32;
                    iCombineMeasuredStates = i30;
                    int i39 = 0;
                    while (i39 < i11) {
                        android.view.View viewS2 = s(i39);
                        if (viewS2.getVisibility() == 8) {
                            i12 = i37;
                        } else {
                            androidx.appcompat.widget.O.a aVar2 = (androidx.appcompat.widget.O.a) viewS2.getLayoutParams();
                            float f11 = ((android.widget.LinearLayout.LayoutParams) aVar2).weight;
                            if (f11 > 0.0f) {
                                int measuredHeight = (int) ((i37 * f11) / f6);
                                float f12 = f6 - f11;
                                i12 = i37 - measuredHeight;
                                int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + ((android.widget.LinearLayout.LayoutParams) aVar2).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar2).rightMargin, ((android.widget.LinearLayout.LayoutParams) aVar2).width);
                                if (((android.widget.LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i15 = 1073741824;
                                    if (i33 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                    }
                                    viewS2.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, i15));
                                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                    f6 = f12;
                                } else {
                                    i15 = 1073741824;
                                }
                                measuredHeight = viewS2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewS2.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, i15));
                                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                f6 = f12;
                            } else {
                                i12 = i37;
                            }
                            int i40 = ((android.widget.LinearLayout.LayoutParams) aVar2).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewS2.getMeasuredWidth() + i40;
                            iMax6 = java.lang.Math.max(iMax6, measuredWidth);
                            float f13 = f6;
                            if (mode != 1073741824) {
                                i13 = iCombineMeasuredStates;
                                i14 = -1;
                                if (((android.widget.LinearLayout.LayoutParams) aVar2).width != -1) {
                                }
                                int iMax7 = java.lang.Math.max(i38, i40);
                                if (z14 || ((android.widget.LinearLayout.LayoutParams) aVar2).width != i14) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                int i41 = this.f18166H;
                                this.f18166H = java.lang.Math.max(i41, viewS2.getMeasuredHeight() + i41 + ((android.widget.LinearLayout.LayoutParams) aVar2).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar2).bottomMargin + r(viewS2));
                                z14 = z6;
                                iCombineMeasuredStates = i13;
                                i38 = iMax7;
                                f6 = f13;
                            } else {
                                i13 = iCombineMeasuredStates;
                                i14 = -1;
                            }
                            i40 = measuredWidth;
                            int iMax8 = java.lang.Math.max(i38, i40);
                            if (z14) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            int i42 = this.f18166H;
                            this.f18166H = java.lang.Math.max(i42, viewS2.getMeasuredHeight() + i42 + ((android.widget.LinearLayout.LayoutParams) aVar2).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar2).bottomMargin + r(viewS2));
                            z14 = z6;
                            iCombineMeasuredStates = i13;
                            i38 = iMax8;
                            f6 = f13;
                        }
                        i39++;
                        i37 = i12;
                    }
                    this.f18166H += getPaddingTop() + getPaddingBottom();
                    iMax = i38;
                } else {
                    iMax = java.lang.Math.max(i32, i29);
                    if (z11 && i33 != 1073741824) {
                        for (int i43 = 0; i43 < i11; i43++) {
                            android.view.View viewS3 = s(i43);
                            if (viewS3 != null && viewS3.getVisibility() != 8 && ((android.widget.LinearLayout.LayoutParams) ((androidx.appcompat.widget.O.a) viewS3.getLayoutParams())).weight > 0.0f) {
                                viewS3.measure(android.view.View.MeasureSpec.makeMeasureSpec(viewS3.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i31, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i30;
                }
                if (z14 || mode == 1073741824) {
                    iMax = iMax6;
                }
                setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, iCombineMeasuredStates), iResolveSizeAndState);
                if (z13) {
                    l(i11, i10);
                    return;
                }
                return;
            }
            android.view.View viewS4 = s(iP);
            if (viewS4 == null) {
                this.f18166H += y(iP);
                i19 = mode2;
                iMax5 = i29;
                i21 = virtualChildCount;
            } else {
                int i44 = i24;
                if (viewS4.getVisibility() == 8) {
                    iP += p(viewS4, iP);
                    iMax5 = i29;
                    i24 = i44;
                    i21 = virtualChildCount;
                    i19 = mode2;
                } else {
                    if (t(iP)) {
                        this.f18166H += this.f18173O;
                    }
                    androidx.appcompat.widget.O.a aVar3 = (androidx.appcompat.widget.O.a) viewS4.getLayoutParams();
                    float f14 = ((android.widget.LinearLayout.LayoutParams) aVar3).weight;
                    float f15 = f6 + f14;
                    if (mode2 == 1073741824 && ((android.widget.LinearLayout.LayoutParams) aVar3).height == 0 && f14 > 0.0f) {
                        int i45 = this.f18166H;
                        this.f18166H = java.lang.Math.max(i45, ((android.widget.LinearLayout.LayoutParams) aVar3).topMargin + i45 + ((android.widget.LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax4 = i26;
                        view = viewS4;
                        iMax3 = i27;
                        z12 = true;
                        i17 = i44;
                        i18 = i25;
                        i19 = mode2;
                        i20 = i29;
                        i21 = virtualChildCount;
                        i22 = iP;
                    } else {
                        int i46 = i25;
                        if (((android.widget.LinearLayout.LayoutParams) aVar3).height != 0 || f14 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((android.widget.LinearLayout.LayoutParams) aVar3).height = -2;
                            i16 = 0;
                        }
                        i17 = i44;
                        int i47 = i16;
                        i18 = i46;
                        int i48 = i26;
                        i19 = mode2;
                        i20 = i29;
                        i21 = virtualChildCount;
                        iMax3 = i27;
                        i22 = iP;
                        w(viewS4, iP, i6, 0, i10, f15 == 0.0f ? this.f18166H : 0);
                        if (i47 != Integer.MIN_VALUE) {
                            ((android.widget.LinearLayout.LayoutParams) aVar3).height = i47;
                        }
                        int measuredHeight2 = viewS4.getMeasuredHeight();
                        int i49 = this.f18166H;
                        view = viewS4;
                        this.f18166H = java.lang.Math.max(i49, i49 + measuredHeight2 + ((android.widget.LinearLayout.LayoutParams) aVar3).topMargin + ((android.widget.LinearLayout.LayoutParams) aVar3).bottomMargin + r(view));
                        iMax4 = z11 ? java.lang.Math.max(measuredHeight2, i48) : i48;
                    }
                    if (i23 >= 0 && i23 == i22 + 1) {
                        this.f18163E = this.f18166H;
                    }
                    if (i22 < i23 && ((android.widget.LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new java.lang.RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((android.widget.LinearLayout.LayoutParams) aVar3).width != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                        z13 = true;
                    }
                    int i50 = ((android.widget.LinearLayout.LayoutParams) aVar3).leftMargin + ((android.widget.LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i50;
                    int iMax9 = java.lang.Math.max(i18, measuredWidth2);
                    int iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(i17, view.getMeasuredState());
                    z14 = z14 && ((android.widget.LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((android.widget.LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z10) {
                            i50 = measuredWidth2;
                        }
                        iMax5 = java.lang.Math.max(i20, i50);
                    } else {
                        if (!z10) {
                            i50 = measuredWidth2;
                        }
                        iMax3 = java.lang.Math.max(iMax3, i50);
                        iMax5 = i20;
                    }
                    int iP3 = p(view, i22) + i22;
                    i26 = iMax4;
                    i25 = iMax9;
                    f6 = f15;
                    i27 = iMax3;
                    iP = iP3;
                    i24 = iCombineMeasuredStates2;
                }
            }
            iP++;
            virtualChildCount = i21;
            mode2 = i19;
        }
    }
}
