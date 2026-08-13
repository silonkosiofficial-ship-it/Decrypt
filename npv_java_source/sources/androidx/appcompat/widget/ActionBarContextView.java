package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbstractC1895a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.lang.CharSequence f17996K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.lang.CharSequence f17997L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private android.view.View f17998M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.view.View f17999N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private android.view.View f18000O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private android.widget.LinearLayout f18001P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private android.widget.TextView f18002Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private android.widget.TextView f18003R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f18004S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f18005T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f18006U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f18007V;

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f18008C;

        a(androidx.appcompat.view.b bVar) {
            this.f18008C = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.f18008C.c();
        }
    }

    public ActionBarContextView(android.content.Context context) {
        this(context, null);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48630g);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(context, attributeSet, p090j.j.f49021y, i6, 0);
        androidx.core.view.X.r0(this, c0VarV.g(p090j.j.f49026z));
        this.f18004S = c0VarV.n(p090j.j.f48809D, 0);
        this.f18005T = c0VarV.n(p090j.j.f48804C, 0);
        this.f18412G = c0VarV.m(p090j.j.f48799B, 0);
        this.f18007V = c0VarV.n(p090j.j.f48794A, p090j.g.f48762d);
        c0VarV.w();
    }

    private void i() {
        if (this.f18001P == null) {
            android.view.LayoutInflater.from(getContext()).inflate(p090j.g.f48759a, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.f18001P = linearLayout;
            this.f18002Q = (android.widget.TextView) linearLayout.findViewById(p090j.f.f48737e);
            this.f18003R = (android.widget.TextView) this.f18001P.findViewById(p090j.f.f48736d);
            if (this.f18004S != 0) {
                this.f18002Q.setTextAppearance(getContext(), this.f18004S);
            }
            if (this.f18005T != 0) {
                this.f18003R.setTextAppearance(getContext(), this.f18005T);
            }
        }
        this.f18002Q.setText(this.f17996K);
        this.f18003R.setText(this.f17997L);
        boolean z6 = !android.text.TextUtils.isEmpty(this.f17996K);
        boolean z10 = !android.text.TextUtils.isEmpty(this.f17997L);
        this.f18003R.setVisibility(z10 ? 0 : 8);
        this.f18001P.setVisibility((z6 || z10) ? 0 : 8);
        if (this.f18001P.getParent() == null) {
            addView(this.f18001P);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1895a
    public /* bridge */ /* synthetic */ androidx.core.view.C2003g0 f(int i6, long j6) {
        return super.f(i6, j6);
    }

    public void g() {
        if (this.f17998M == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1895a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1895a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f17997L;
    }

    public java.lang.CharSequence getTitle() {
        return this.f17996K;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    public void h(androidx.appcompat.view.b bVar) {
        android.view.View viewInflate;
        androidx.appcompat.widget.C1897c c1897c;
        android.view.View view = this.f17998M;
        if (view != null) {
            if (view.getParent() == null) {
                viewInflate = this.f17998M;
            }
            android.view.View viewFindViewById = this.f17998M.findViewById(p090j.f.f48741i);
            this.f17999N = viewFindViewById;
            viewFindViewById.setOnClickListener(new androidx.appcompat.widget.ActionBarContextView.a(bVar));
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
            c1897c = this.f18411F;
            if (c1897c != null) {
                c1897c.y();
            }
            androidx.appcompat.widget.C1897c c1897c2 = new androidx.appcompat.widget.C1897c(getContext());
            this.f18411F = c1897c2;
            c1897c2.J(true);
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
            gVar.c(this.f18411F, this.f18409D);
            androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) this.f18411F.o(this);
            this.f18410E = actionMenuView;
            androidx.core.view.X.r0(actionMenuView, null);
            addView(this.f18410E, layoutParams);
        }
        viewInflate = android.view.LayoutInflater.from(getContext()).inflate(this.f18007V, (android.view.ViewGroup) this, false);
        this.f17998M = viewInflate;
        addView(viewInflate);
        android.view.View viewFindViewById2 = this.f17998M.findViewById(p090j.f.f48741i);
        this.f17999N = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new androidx.appcompat.widget.ActionBarContextView.a(bVar));
        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) bVar.e();
        c1897c = this.f18411F;
        if (c1897c != null) {
            c1897c.y();
        }
        androidx.appcompat.widget.C1897c c1897c3 = new androidx.appcompat.widget.C1897c(getContext());
        this.f18411F = c1897c3;
        c1897c3.J(true);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(-2, -1);
        gVar2.c(this.f18411F, this.f18409D);
        androidx.appcompat.widget.ActionMenuView actionMenuView2 = (androidx.appcompat.widget.ActionMenuView) this.f18411F.o(this);
        this.f18410E = actionMenuView2;
        androidx.core.view.X.r0(actionMenuView2, null);
        addView(this.f18410E, layoutParams2);
    }

    public boolean j() {
        return this.f18006U;
    }

    public void k() {
        removeAllViews();
        this.f18000O = null;
        this.f18410E = null;
        this.f18411F = null;
        android.view.View view = this.f17999N;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        androidx.appcompat.widget.C1897c c1897c = this.f18411F;
        if (c1897c != null) {
            return c1897c.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.C1897c c1897c = this.f18411F;
        if (c1897c != null) {
            c1897c.B();
            this.f18411F.C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1895a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        boolean zB = androidx.appcompat.widget.n0.b(this);
        int paddingRight = zB ? (i11 - i6) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.f17998M;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f17998M.getLayoutParams();
            int i13 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.AbstractC1895a.d(paddingRight, i13, zB);
            paddingRight = androidx.appcompat.widget.AbstractC1895a.d(iD + e(this.f17998M, iD, paddingTop, paddingTop2, zB), i14, zB);
        }
        int iE = paddingRight;
        android.widget.LinearLayout linearLayout = this.f18001P;
        if (linearLayout != null && this.f18000O == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f18001P, iE, paddingTop, paddingTop2, zB);
        }
        int i15 = iE;
        android.view.View view2 = this.f18000O;
        if (view2 != null) {
            e(view2, i15, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i11 - i6) - getPaddingRight();
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18410E;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        if (android.view.View.MeasureSpec.getMode(i6) != 1073741824) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (android.view.View.MeasureSpec.getMode(i10) == 0) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = android.view.View.MeasureSpec.getSize(i6);
        int size2 = this.f18412G;
        if (size2 <= 0) {
            size2 = android.view.View.MeasureSpec.getSize(i10);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        android.view.View view = this.f17998M;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f17998M.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f18410E;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f18410E, paddingLeft, iMakeMeasureSpec, 0);
        }
        android.widget.LinearLayout linearLayout = this.f18001P;
        if (linearLayout != null && this.f18000O == null) {
            if (this.f18006U) {
                this.f18001P.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f18001P.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f18001P.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        android.view.View view2 = this.f18000O;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = java.lang.Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = java.lang.Math.min(i13, iMin);
            }
            this.f18000O.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), android.view.View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f18412G > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // androidx.appcompat.widget.AbstractC1895a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1895a
    public void setContentHeight(int i6) {
        this.f18412G = i6;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.f18000O;
        if (view2 != null) {
            removeView(view2);
        }
        this.f18000O = view;
        if (view != null && (linearLayout = this.f18001P) != null) {
            removeView(linearLayout);
            this.f18001P = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f17997L = charSequence;
        i();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f17996K = charSequence;
        i();
        androidx.core.view.X.q0(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f18006U) {
            requestLayout();
        }
        this.f18006U = z6;
    }

    @Override // androidx.appcompat.widget.AbstractC1895a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
