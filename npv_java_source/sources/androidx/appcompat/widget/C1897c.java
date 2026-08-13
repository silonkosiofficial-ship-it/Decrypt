package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1897c extends androidx.appcompat.view.menu.b implements androidx.core.view.AbstractC1992b.a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    androidx.appcompat.widget.C1897c.d f18425M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18426N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f18427O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f18428P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f18429Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f18430R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f18431S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f18432T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f18433U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f18434V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f18435W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f18436X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f18437Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final android.util.SparseBooleanArray f18438Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    androidx.appcompat.widget.C1897c.e f18439a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    androidx.appcompat.widget.C1897c.a f18440b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    androidx.appcompat.widget.C1897c.RunnableC0342c f18441c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private androidx.appcompat.widget.C1897c.b f18442d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    final androidx.appcompat.widget.C1897c.f f18443e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f18444f0;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.l {
        public a(android.content.Context context, androidx.appcompat.view.menu.r rVar, android.view.View view) {
            super(context, rVar, view, false, p090j.a.f48632i);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                android.view.View view2 = androidx.appcompat.widget.C1897c.this.f18425M;
                f(view2 == null ? (android.view.View) ((androidx.appcompat.view.menu.b) androidx.appcompat.widget.C1897c.this).f17784K : view2);
            }
            j(androidx.appcompat.widget.C1897c.this.f18443e0);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            androidx.appcompat.widget.C1897c c1897c = androidx.appcompat.widget.C1897c.this;
            c1897c.f18440b0 = null;
            c1897c.f18444f0 = 0;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    private class b extends androidx.appcompat.view.menu.ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            androidx.appcompat.widget.C1897c.a aVar = androidx.appcompat.widget.C1897c.this.f18440b0;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0342c implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private androidx.appcompat.widget.C1897c.e f18447C;

        public RunnableC0342c(androidx.appcompat.widget.C1897c.e eVar) {
            this.f18447C = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) androidx.appcompat.widget.C1897c.this).f17778E != null) {
                ((androidx.appcompat.view.menu.b) androidx.appcompat.widget.C1897c.this).f17778E.d();
            }
            android.view.View view = (android.view.View) ((androidx.appcompat.view.menu.b) androidx.appcompat.widget.C1897c.this).f17784K;
            if (view != null && view.getWindowToken() != null && this.f18447C.m()) {
                androidx.appcompat.widget.C1897c.this.f18439a0 = this.f18447C;
            }
            androidx.appcompat.widget.C1897c.this.f18441c0 = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    private class d extends androidx.appcompat.widget.r implements androidx.appcompat.widget.ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$d$a */
        class a extends androidx.appcompat.widget.N {

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.widget.C1897c f18450L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(android.view.View view, androidx.appcompat.widget.C1897c c1897c) {
                super(view);
                this.f18450L = c1897c;
            }

            @Override // androidx.appcompat.widget.N
            public androidx.appcompat.view.menu.p b() {
                androidx.appcompat.widget.C1897c.e eVar = androidx.appcompat.widget.C1897c.this.f18439a0;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.N
            public boolean c() {
                androidx.appcompat.widget.C1897c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.N
            public boolean d() {
                androidx.appcompat.widget.C1897c c1897c = androidx.appcompat.widget.C1897c.this;
                if (c1897c.f18441c0 != null) {
                    return false;
                }
                c1897c.B();
                return true;
            }
        }

        public d(android.content.Context context) {
            super(context, null, p090j.a.f48631h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            androidx.appcompat.widget.h0.a(this, getContentDescription());
            setOnTouchListener(new androidx.appcompat.widget.C1897c.d.a(this, androidx.appcompat.widget.C1897c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            androidx.appcompat.widget.C1897c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i6, int i10, int i11, int i12) {
            boolean frame = super.setFrame(i6, i10, i11, i12);
            android.graphics.drawable.Drawable drawable = getDrawable();
            android.graphics.drawable.Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = java.lang.Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.l {
        public e(android.content.Context context, androidx.appcompat.view.menu.g gVar, android.view.View view, boolean z6) {
            super(context, gVar, view, z6, p090j.a.f48632i);
            h(8388613);
            j(androidx.appcompat.widget.C1897c.this.f18443e0);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) androidx.appcompat.widget.C1897c.this).f17778E != null) {
                ((androidx.appcompat.view.menu.b) androidx.appcompat.widget.C1897c.this).f17778E.close();
            }
            androidx.appcompat.widget.C1897c.this.f18439a0 = null;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$f */
    private class f implements androidx.appcompat.view.menu.m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            androidx.appcompat.view.menu.m.a aVarM = androidx.appcompat.widget.C1897c.this.m();
            if (aVarM != null) {
                aVarM.c(gVar, z6);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) androidx.appcompat.widget.C1897c.this).f17778E) {
                return false;
            }
            androidx.appcompat.widget.C1897c.this.f18444f0 = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            androidx.appcompat.view.menu.m.a aVarM = androidx.appcompat.widget.C1897c.this.m();
            if (aVarM != null) {
                return aVarM.d(gVar);
            }
            return false;
        }
    }

    public C1897c(android.content.Context context) {
        super(context, p090j.g.f48761c, p090j.g.f48760b);
        this.f18438Z = new android.util.SparseBooleanArray();
        this.f18443e0 = new androidx.appcompat.widget.C1897c.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private android.view.View z(android.view.MenuItem menuItem) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f17784K;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = viewGroup.getChildAt(i6);
            if ((childAt instanceof androidx.appcompat.view.menu.n.a) && ((androidx.appcompat.view.menu.n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public android.graphics.drawable.Drawable A() {
        androidx.appcompat.widget.C1897c.d dVar = this.f18425M;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f18427O) {
            return this.f18426N;
        }
        return null;
    }

    public boolean B() {
        java.lang.Object obj;
        androidx.appcompat.widget.C1897c.RunnableC0342c runnableC0342c = this.f18441c0;
        if (runnableC0342c != null && (obj = this.f17784K) != null) {
            ((android.view.View) obj).removeCallbacks(runnableC0342c);
            this.f18441c0 = null;
            return true;
        }
        androidx.appcompat.widget.C1897c.e eVar = this.f18439a0;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        androidx.appcompat.widget.C1897c.a aVar = this.f18440b0;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f18441c0 != null || E();
    }

    public boolean E() {
        androidx.appcompat.widget.C1897c.e eVar = this.f18439a0;
        return eVar != null && eVar.d();
    }

    public void F(android.content.res.Configuration configuration) {
        if (!this.f18433U) {
            this.f18432T = androidx.appcompat.view.a.b(this.f17777D).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f17778E;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z6) {
        this.f18436X = z6;
    }

    public void H(androidx.appcompat.widget.ActionMenuView actionMenuView) {
        this.f17784K = actionMenuView;
        actionMenuView.b(this.f17778E);
    }

    public void I(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.C1897c.d dVar = this.f18425M;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f18427O = true;
            this.f18426N = drawable;
        }
    }

    public void J(boolean z6) {
        this.f18428P = z6;
        this.f18429Q = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f18428P || E() || (gVar = this.f17778E) == null || this.f17784K == null || this.f18441c0 != null || gVar.z().isEmpty()) {
            return false;
        }
        androidx.appcompat.widget.C1897c.RunnableC0342c runnableC0342c = new androidx.appcompat.widget.C1897c.RunnableC0342c(new androidx.appcompat.widget.C1897c.e(this.f17777D, this.f17778E, this.f18425M, true));
        this.f18441c0 = runnableC0342c;
        ((android.view.View) this.f17784K).post(runnableC0342c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public void b(androidx.appcompat.view.menu.i iVar, androidx.appcompat.view.menu.n.a aVar) {
        aVar.f(iVar, 0);
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((androidx.appcompat.widget.ActionMenuView) this.f17784K);
        if (this.f18442d0 == null) {
            this.f18442d0 = new androidx.appcompat.widget.C1897c.b();
        }
        actionMenuItemView.setPopupCallback(this.f18442d0);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        y();
        super.c(gVar, z6);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        super.d(z6);
        ((android.view.View) this.f17784K).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f17778E;
        boolean z10 = false;
        if (gVar != null) {
            java.util.ArrayList arrayListS = gVar.s();
            int size = arrayListS.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.core.view.AbstractC1992b abstractC1992bB = ((androidx.appcompat.view.menu.i) arrayListS.get(i6)).b();
                if (abstractC1992bB != null) {
                    abstractC1992bB.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f17778E;
        java.util.ArrayList arrayListZ = gVar2 != null ? gVar2.z() : null;
        if (this.f18428P && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z10 = !((androidx.appcompat.view.menu.i) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z10 = true;
            }
        }
        androidx.appcompat.widget.C1897c.d dVar = this.f18425M;
        if (z10) {
            if (dVar == null) {
                this.f18425M = new androidx.appcompat.widget.C1897c.d(this.f17776C);
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f18425M.getParent();
            if (viewGroup != this.f17784K) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f18425M);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) this.f17784K;
                actionMenuView.addView(this.f18425M, actionMenuView.F());
            }
        } else if (dVar != null) {
            java.lang.Object parent = dVar.getParent();
            java.lang.Object obj = this.f17784K;
            if (parent == obj) {
                ((android.view.ViewGroup) obj).removeView(this.f18425M);
            }
        }
        ((androidx.appcompat.widget.ActionMenuView) this.f17784K).setOverflowReserved(this.f18428P);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.i] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        java.util.ArrayList arrayListE;
        int size;
        int i6;
        int iL;
        ?? r6;
        androidx.appcompat.widget.C1897c c1897c = this;
        androidx.appcompat.view.menu.g gVar = c1897c.f17778E;
        android.view.View view = null;
        ?? r10 = 0;
        if (gVar != null) {
            arrayListE = gVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i10 = c1897c.f18432T;
        int i11 = c1897c.f18431S;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) c1897c.f17784K;
        boolean z6 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayListE.get(i14);
            if (iVar.o()) {
                i12++;
            } else if (iVar.n()) {
                i13++;
            } else {
                z6 = true;
            }
            if (c1897c.f18436X && iVar.isActionViewExpanded()) {
                i10 = 0;
            }
        }
        if (c1897c.f18428P && (z6 || i13 + i12 > i10)) {
            i10--;
        }
        int i15 = i10 - i12;
        android.util.SparseBooleanArray sparseBooleanArray = c1897c.f18438Z;
        sparseBooleanArray.clear();
        if (c1897c.f18434V) {
            int i16 = c1897c.f18437Y;
            iL = i11 / i16;
            i6 = i16 + ((i11 % i16) / iL);
        } else {
            i6 = 0;
            iL = 0;
        }
        int i17 = 0;
        int i18 = 0;
        ?? r11 = c1897c;
        while (i17 < size) {
            ?? r15 = (androidx.appcompat.view.menu.i) arrayListE.get(i17);
            if (r15.o()) {
                android.view.View viewN = r11.n(r15, view, viewGroup);
                if (r11.f18434V) {
                    iL -= androidx.appcompat.widget.ActionMenuView.L(viewN, i6, iL, iMakeMeasureSpec, r10);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r6 = r10;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z10 = sparseBooleanArray.get(groupId2);
                boolean z11 = (i15 > 0 || z10) && i11 > 0 && (!r11.f18434V || iL > 0);
                boolean z12 = z11;
                if (z11) {
                    android.view.View viewN2 = r11.n(r15, null, viewGroup);
                    if (r11.f18434V) {
                        int iL2 = androidx.appcompat.widget.ActionMenuView.L(viewN2, i6, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z12 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z13 = z12;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z11 = z13 & (!r11.f18434V ? i11 + i18 <= 0 : i11 < 0);
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z10) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i19 = 0; i19 < i17; i19++) {
                        androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) arrayListE.get(i19);
                        if (iVar2.getGroupId() == groupId2) {
                            if (iVar2.l()) {
                                i15++;
                            }
                            iVar2.u(false);
                        }
                    }
                }
                if (z11) {
                    i15--;
                }
                r15.u(z11);
                r6 = 0;
            } else {
                r6 = r10;
                r15.u(r6);
            }
            i17++;
            r10 = r6;
            size = size;
            view = null;
            r11 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void i(android.content.Context context, androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        android.content.res.Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f18429Q) {
            this.f18428P = aVarB.f();
        }
        if (!this.f18435W) {
            this.f18430R = aVarB.c();
        }
        if (!this.f18433U) {
            this.f18432T = aVarB.d();
        }
        int measuredWidth = this.f18430R;
        if (this.f18428P) {
            if (this.f18425M == null) {
                androidx.appcompat.widget.C1897c.d dVar = new androidx.appcompat.widget.C1897c.d(this.f17776C);
                this.f18425M = dVar;
                if (this.f18427O) {
                    dVar.setImageDrawable(this.f18426N);
                    this.f18426N = null;
                    this.f18427O = false;
                }
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f18425M.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f18425M.getMeasuredWidth();
        } else {
            this.f18425M = null;
        }
        this.f18431S = measuredWidth;
        this.f18437Y = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        boolean z6 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f17778E) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        android.view.View viewZ = z(rVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.f18444f0 = rVar.getItem().getItemId();
        int size = rVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.MenuItem item = rVar.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                z6 = true;
                break;
            }
        }
        androidx.appcompat.widget.C1897c.a aVar = new androidx.appcompat.widget.C1897c.a(this.f17777D, rVar, viewZ);
        this.f18440b0 = aVar;
        aVar.g(z6);
        this.f18440b0.k();
        super.k(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(android.view.ViewGroup viewGroup, int i6) {
        if (viewGroup.getChildAt(i6) == this.f18425M) {
            return false;
        }
        return super.l(viewGroup, i6);
    }

    @Override // androidx.appcompat.view.menu.b
    public android.view.View n(androidx.appcompat.view.menu.i iVar, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(android.view.ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f17784K;
        androidx.appcompat.view.menu.n nVarO = super.o(viewGroup);
        if (nVar != nVarO) {
            ((androidx.appcompat.widget.ActionMenuView) nVarO).setPresenter(this);
        }
        return nVarO;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i6, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
