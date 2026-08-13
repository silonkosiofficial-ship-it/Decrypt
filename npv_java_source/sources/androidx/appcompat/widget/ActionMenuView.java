package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.O implements androidx.appcompat.view.menu.g.b, androidx.appcompat.view.menu.n {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f18045R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private android.content.Context f18046S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f18047T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f18048U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private androidx.appcompat.widget.C1897c f18049V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f18050W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    androidx.appcompat.view.menu.g.a f18051a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f18052b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f18053c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f18054d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f18055e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    androidx.appcompat.widget.ActionMenuView.e f18056f0;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements androidx.appcompat.view.menu.m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    public static class c extends androidx.appcompat.widget.O.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f18062f;

        public c(int i6, int i10) {
            super(i6, i10);
            this.f18057a = false;
        }

        public c(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(androidx.appcompat.widget.ActionMenuView.c cVar) {
            super(cVar);
            this.f18057a = cVar.f18057a;
        }
    }

    private class d implements androidx.appcompat.view.menu.g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
            androidx.appcompat.widget.ActionMenuView.e eVar = androidx.appcompat.widget.ActionMenuView.this.f18056f0;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.g.a aVar = androidx.appcompat.widget.ActionMenuView.this.f18051a0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(android.view.MenuItem menuItem);
    }

    public ActionMenuView(android.content.Context context) {
        this(context, null);
    }

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f18054d0 = (int) (56.0f * f6);
        this.f18055e0 = (int) (f6 * 4.0f);
        this.f18046S = context;
        this.f18047T = 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int L(android.view.View view, int i6, int i10, int i11, int i12) {
        int i13;
        androidx.appcompat.widget.ActionMenuView.c cVar = (androidx.appcompat.widget.ActionMenuView.c) view.getLayoutParams();
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i11) - i12, android.view.View.MeasureSpec.getMode(i11));
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = view instanceof androidx.appcompat.view.menu.ActionMenuItemView ? (androidx.appcompat.view.menu.ActionMenuItemView) view : null;
        boolean z6 = false;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.B();
        if (i10 > 0) {
            i13 = 2;
            if (!z10 || i10 >= 2) {
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i10 * i6, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i14 = measuredWidth / i6;
                if (measuredWidth % i6 != 0) {
                    i14++;
                }
                if (!z10 || i14 >= 2) {
                    i13 = i14;
                }
            } else {
                i13 = 0;
            }
        } else {
            i13 = 0;
        }
        if (!cVar.f18057a && z10) {
            z6 = true;
        }
        cVar.f18060d = z6;
        cVar.f18058b = i13;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i6 * i13, 1073741824), iMakeMeasureSpec);
        return i13;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i6, int i10) {
        boolean z6;
        int i11;
        int i12;
        boolean z10;
        ?? r14;
        int mode = android.view.View.MeasureSpec.getMode(i10);
        int size = android.view.View.MeasureSpec.getSize(i6);
        int size2 = android.view.View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i10, paddingTop, -2);
        int i13 = size - paddingLeft;
        int i14 = this.f18054d0;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = i14 + (i16 / i15);
        int childCount = getChildCount();
        int iMax = 0;
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        int iMax2 = 0;
        int i20 = 0;
        long j6 = 0;
        while (i18 < childCount) {
            android.view.View childAt = getChildAt(i18);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z12 = childAt instanceof androidx.appcompat.view.menu.ActionMenuItemView;
                int i22 = i19 + 1;
                if (z12) {
                    int i23 = this.f18055e0;
                    r14 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    r14 = 0;
                }
                androidx.appcompat.widget.ActionMenuView.c cVar = (androidx.appcompat.widget.ActionMenuView.c) childAt.getLayoutParams();
                cVar.f18062f = r14;
                cVar.f18059c = r14;
                cVar.f18058b = r14;
                cVar.f18060d = r14;
                ((android.widget.LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((android.widget.LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f18061e = z12 && ((androidx.appcompat.view.menu.ActionMenuItemView) childAt).B();
                int iL = L(childAt, i17, cVar.f18057a ? 1 : i15, childMeasureSpec, paddingTop);
                iMax2 = java.lang.Math.max(iMax2, iL);
                if (cVar.f18060d) {
                    i20++;
                }
                if (cVar.f18057a) {
                    z11 = true;
                }
                i15 -= iL;
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j6 |= (long) (1 << i18);
                    iMax = iMax;
                }
                i19 = i22;
            }
            i18++;
            size2 = i21;
        }
        int i24 = size2;
        boolean z13 = z11 && i19 == 2;
        boolean z14 = false;
        while (true) {
            if (i20 <= 0 || i15 <= 0) {
                z6 = z14;
                i11 = iMax;
                break;
            }
            int i25 = Integer.MAX_VALUE;
            int i26 = 0;
            int i27 = 0;
            long j10 = 0;
            while (i27 < childCount) {
                boolean z15 = z14;
                androidx.appcompat.widget.ActionMenuView.c cVar2 = (androidx.appcompat.widget.ActionMenuView.c) getChildAt(i27).getLayoutParams();
                int i28 = iMax;
                if (cVar2.f18060d) {
                    int i29 = cVar2.f18058b;
                    if (i29 < i25) {
                        j10 = 1 << i27;
                        i25 = i29;
                        i26 = 1;
                    } else if (i29 == i25) {
                        i26++;
                        j10 |= 1 << i27;
                    }
                }
                i27++;
                iMax = i28;
                z14 = z15;
            }
            z6 = z14;
            i11 = iMax;
            j6 |= j10;
            if (i26 > i15) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                android.view.View childAt2 = getChildAt(i31);
                androidx.appcompat.widget.ActionMenuView.c cVar3 = (androidx.appcompat.widget.ActionMenuView.c) childAt2.getLayoutParams();
                int i32 = i13;
                int i33 = mode;
                long j11 = 1 << i31;
                if ((j10 & j11) == 0) {
                    if (cVar3.f18058b == i30) {
                        j6 |= j11;
                    }
                    z13 = z13;
                } else {
                    if (z13 && cVar3.f18061e && i15 == 1) {
                        int i34 = this.f18055e0;
                        childAt2.setPadding(i34 + i17, 0, i34, 0);
                    }
                    cVar3.f18058b++;
                    cVar3.f18062f = true;
                    i15--;
                }
                i31++;
                mode = i33;
                i13 = i32;
                z13 = z13;
            }
            iMax = i11;
            z14 = true;
        }
        boolean z16 = !z11 && i19 == 1;
        if (i15 <= 0 || j6 == 0 || (i15 >= i19 - 1 && !z16 && iMax2 <= 1)) {
            i12 = 0;
            z10 = z6;
        } else {
            float fBitCount = java.lang.Long.bitCount(j6);
            if (z16) {
                i12 = 0;
            } else {
                i12 = 0;
                if ((j6 & 1) != 0 && !((androidx.appcompat.widget.ActionMenuView.c) getChildAt(0).getLayoutParams()).f18061e) {
                    fBitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j6 & ((long) (1 << i35))) != 0 && !((androidx.appcompat.widget.ActionMenuView.c) getChildAt(i35).getLayoutParams()).f18061e) {
                    fBitCount -= 0.5f;
                }
            }
            int i36 = fBitCount > 0.0f ? (int) ((i15 * i17) / fBitCount) : i12;
            z10 = z6;
            for (int i37 = i12; i37 < childCount; i37++) {
                if ((j6 & ((long) (1 << i37))) != 0) {
                    android.view.View childAt3 = getChildAt(i37);
                    androidx.appcompat.widget.ActionMenuView.c cVar4 = (androidx.appcompat.widget.ActionMenuView.c) childAt3.getLayoutParams();
                    if (childAt3 instanceof androidx.appcompat.view.menu.ActionMenuItemView) {
                        cVar4.f18059c = i36;
                        cVar4.f18062f = true;
                        if (i37 == 0 && !cVar4.f18061e) {
                            ((android.widget.LinearLayout.LayoutParams) cVar4).leftMargin = (-i36) / 2;
                        }
                        z10 = true;
                    } else if (cVar4.f18057a) {
                        cVar4.f18059c = i36;
                        cVar4.f18062f = true;
                        ((android.widget.LinearLayout.LayoutParams) cVar4).rightMargin = (-i36) / 2;
                        z10 = true;
                    } else {
                        if (i37 != 0) {
                            ((android.widget.LinearLayout.LayoutParams) cVar4).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount - 1) {
                            ((android.widget.LinearLayout.LayoutParams) cVar4).rightMargin = i36 / 2;
                        }
                    }
                }
            }
        }
        if (z10) {
            for (int i38 = i12; i38 < childCount; i38++) {
                android.view.View childAt4 = getChildAt(i38);
                androidx.appcompat.widget.ActionMenuView.c cVar5 = (androidx.appcompat.widget.ActionMenuView.c) childAt4.getLayoutParams();
                if (cVar5.f18062f) {
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((cVar5.f18058b * i17) + cVar5.f18059c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, mode != 1073741824 ? i11 : i24);
    }

    public void B() {
        androidx.appcompat.widget.C1897c c1897c = this.f18049V;
        if (c1897c != null) {
            c1897c.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.O
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.ActionMenuView.c generateDefaultLayoutParams() {
        androidx.appcompat.widget.ActionMenuView.c cVar = new androidx.appcompat.widget.ActionMenuView.c(-2, -2);
        ((android.widget.LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.O
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.ActionMenuView.c generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ActionMenuView.c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.O
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.ActionMenuView.c generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        androidx.appcompat.widget.ActionMenuView.c cVar = layoutParams instanceof androidx.appcompat.widget.ActionMenuView.c ? new androidx.appcompat.widget.ActionMenuView.c((androidx.appcompat.widget.ActionMenuView.c) layoutParams) : new androidx.appcompat.widget.ActionMenuView.c(layoutParams);
        if (((android.widget.LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((android.widget.LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public androidx.appcompat.widget.ActionMenuView.c F() {
        androidx.appcompat.widget.ActionMenuView.c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f18057a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean G(int i6) {
        boolean zA = false;
        if (i6 == 0) {
            return false;
        }
        android.view.KeyEvent.Callback childAt = getChildAt(i6 - 1);
        android.view.KeyEvent.Callback childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof androidx.appcompat.widget.ActionMenuView.a)) {
            zA = ((androidx.appcompat.widget.ActionMenuView.a) childAt).a();
        }
        return (i6 <= 0 || !(childAt2 instanceof androidx.appcompat.widget.ActionMenuView.a)) ? zA : zA | ((androidx.appcompat.widget.ActionMenuView.a) childAt2).b();
    }

    public boolean H() {
        androidx.appcompat.widget.C1897c c1897c = this.f18049V;
        return c1897c != null && c1897c.B();
    }

    public boolean I() {
        androidx.appcompat.widget.C1897c c1897c = this.f18049V;
        return c1897c != null && c1897c.D();
    }

    public boolean J() {
        androidx.appcompat.widget.C1897c c1897c = this.f18049V;
        return c1897c != null && c1897c.E();
    }

    public boolean K() {
        return this.f18048U;
    }

    public androidx.appcompat.view.menu.g N() {
        return this.f18045R;
    }

    public void O(androidx.appcompat.view.menu.m.a aVar, androidx.appcompat.view.menu.g.a aVar2) {
        this.f18050W = aVar;
        this.f18051a0 = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.C1897c c1897c = this.f18049V;
        return c1897c != null && c1897c.K();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(androidx.appcompat.view.menu.i iVar) {
        return this.f18045R.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar) {
        this.f18045R = gVar;
    }

    @Override // androidx.appcompat.widget.O, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.ActionMenuView.c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public android.view.Menu getMenu() {
        if (this.f18045R == null) {
            android.content.Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f18045R = gVar;
            gVar.R(new androidx.appcompat.widget.ActionMenuView.d());
            androidx.appcompat.widget.C1897c c1897c = new androidx.appcompat.widget.C1897c(context);
            this.f18049V = c1897c;
            c1897c.J(true);
            androidx.appcompat.widget.C1897c c1897c2 = this.f18049V;
            androidx.appcompat.view.menu.m.a bVar = this.f18050W;
            if (bVar == null) {
                bVar = new androidx.appcompat.widget.ActionMenuView.b();
            }
            c1897c2.h(bVar);
            this.f18045R.c(this.f18049V, this.f18046S);
            this.f18049V.H(this);
        }
        return this.f18045R;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        getMenu();
        return this.f18049V.A();
    }

    public int getPopupTheme() {
        return this.f18047T;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.C1897c c1897c = this.f18049V;
        if (c1897c != null) {
            c1897c.d(false);
            if (this.f18049V.E()) {
                this.f18049V.B();
                this.f18049V.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.O, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f18052b0) {
            super.onLayout(z6, i6, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i6;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean zB = androidx.appcompat.widget.n0.b(this);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                androidx.appcompat.widget.ActionMenuView.c cVar = (androidx.appcompat.widget.ActionMenuView.c) childAt.getLayoutParams();
                if (cVar.f18057a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((android.widget.LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((android.widget.LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((android.widget.LinearLayout.LayoutParams) cVar).leftMargin) + ((android.widget.LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            android.view.View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = java.lang.Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                android.view.View childAt3 = getChildAt(i22);
                androidx.appcompat.widget.ActionMenuView.c cVar2 = (androidx.appcompat.widget.ActionMenuView.c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f18057a) {
                    int i23 = width2 - ((android.widget.LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((android.widget.LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            android.view.View childAt4 = getChildAt(i25);
            androidx.appcompat.widget.ActionMenuView.c cVar3 = (androidx.appcompat.widget.ActionMenuView.c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f18057a) {
                int i26 = paddingLeft2 + ((android.widget.LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = i26 + measuredWidth4 + ((android.widget.LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.O, android.view.View
    protected void onMeasure(int i6, int i10) {
        androidx.appcompat.view.menu.g gVar;
        boolean z6 = this.f18052b0;
        boolean z10 = android.view.View.MeasureSpec.getMode(i6) == 1073741824;
        this.f18052b0 = z10;
        if (z6 != z10) {
            this.f18053c0 = 0;
        }
        int size = android.view.View.MeasureSpec.getSize(i6);
        if (this.f18052b0 && (gVar = this.f18045R) != null && size != this.f18053c0) {
            this.f18053c0 = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f18052b0 && childCount > 0) {
            M(i6, i10);
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            androidx.appcompat.widget.ActionMenuView.c cVar = (androidx.appcompat.widget.ActionMenuView.c) getChildAt(i11).getLayoutParams();
            ((android.widget.LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((android.widget.LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i6, i10);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f18049V.G(z6);
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.ActionMenuView.e eVar) {
        this.f18056f0 = eVar;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        getMenu();
        this.f18049V.I(drawable);
    }

    public void setOverflowReserved(boolean z6) {
        this.f18048U = z6;
    }

    public void setPopupTheme(int i6) {
        if (this.f18047T != i6) {
            this.f18047T = i6;
            if (i6 == 0) {
                this.f18046S = getContext();
            } else {
                this.f18046S = new android.view.ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.C1897c c1897c) {
        this.f18049V = c1897c;
        c1897c.H(this);
    }
}
