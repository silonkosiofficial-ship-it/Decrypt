package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
public final class j<S> extends com.google.android.material.datepicker.r {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    static final java.lang.Object f43220R0 = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    static final java.lang.Object f43221S0 = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    static final java.lang.Object f43222T0 = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    static final java.lang.Object f43223U0 = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f43224G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private com.google.android.material.datepicker.C6515a f43225H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private com.google.android.material.datepicker.n f43226I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private com.google.android.material.datepicker.j.l f43227J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private com.google.android.material.datepicker.c f43228K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f43229L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f43230M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private android.view.View f43231N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private android.view.View f43232O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private android.view.View f43233P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private android.view.View f43234Q0;

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.p f43235C;

        a(com.google.android.material.datepicker.p pVar) {
            this.f43235C = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            int iE2 = com.google.android.material.datepicker.j.this.S1().e2() - 1;
            if (iE2 >= 0) {
                com.google.android.material.datepicker.j.this.V1(this.f43235C.v(iE2));
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f43237C;

        b(int i6) {
            this.f43237C = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.material.datepicker.j.this.f43230M0.p1(this.f43237C);
        }
    }

    class c extends androidx.core.view.C1990a {
        c() {
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            b6.o0(null);
        }
    }

    class d extends com.google.android.material.datepicker.s {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f43240I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(android.content.Context context, int i6, boolean z6, int i10) {
            super(context, i6, z6);
            this.f43240I = i10;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(androidx.recyclerview.widget.RecyclerView.A a6, int[] iArr) {
            if (this.f43240I == 0) {
                iArr[0] = com.google.android.material.datepicker.j.this.f43230M0.getWidth();
                iArr[1] = com.google.android.material.datepicker.j.this.f43230M0.getWidth();
            } else {
                iArr[0] = com.google.android.material.datepicker.j.this.f43230M0.getHeight();
                iArr[1] = com.google.android.material.datepicker.j.this.f43230M0.getHeight();
            }
        }
    }

    class e implements com.google.android.material.datepicker.j.m {
        e() {
        }

        @Override // com.google.android.material.datepicker.j.m
        public void a(long j6) {
            if (com.google.android.material.datepicker.j.this.f43225H0.f().n(j6)) {
                com.google.android.material.datepicker.j.H1(com.google.android.material.datepicker.j.this);
                throw null;
            }
        }
    }

    class f extends androidx.core.view.C1990a {
        f() {
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            b6.N0(false);
        }
    }

    class g extends androidx.recyclerview.widget.RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Calendar f43244a = com.google.android.material.datepicker.z.k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.Calendar f43245b = com.google.android.material.datepicker.z.k();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6) {
            if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.A) && (recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.GridLayoutManager)) {
                com.google.android.material.datepicker.j.H1(com.google.android.material.datepicker.j.this);
                throw null;
            }
        }
    }

    class h extends androidx.core.view.C1990a {
        h() {
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            com.google.android.material.datepicker.j jVar;
            int i6;
            super.g(view, b6);
            if (com.google.android.material.datepicker.j.this.f43234Q0.getVisibility() == 0) {
                jVar = com.google.android.material.datepicker.j.this;
                i6 = p125m4.h.f50691u;
            } else {
                jVar = com.google.android.material.datepicker.j.this;
                i6 = p125m4.h.f50689s;
            }
            b6.y0(jVar.T(i6));
        }
    }

    class i extends androidx.recyclerview.widget.RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.p f43248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.button.MaterialButton f43249b;

        i(com.google.android.material.datepicker.p pVar, com.google.android.material.button.MaterialButton materialButton) {
            this.f43248a = pVar;
            this.f43249b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i6) {
            if (i6 == 0) {
                recyclerView.announceForAccessibility(this.f43249b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManagerS1 = com.google.android.material.datepicker.j.this.S1();
            int iC2 = i6 < 0 ? linearLayoutManagerS1.c2() : linearLayoutManagerS1.e2();
            com.google.android.material.datepicker.j.this.f43226I0 = this.f43248a.v(iC2);
            this.f43249b.setText(this.f43248a.w(iC2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    class ViewOnClickListenerC0475j implements android.view.View.OnClickListener {
        ViewOnClickListenerC0475j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.google.android.material.datepicker.j.this.Y1();
        }
    }

    class k implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.p f43252C;

        k(com.google.android.material.datepicker.p pVar) {
            this.f43252C = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            int iC2 = com.google.android.material.datepicker.j.this.S1().c2() + 1;
            if (iC2 < com.google.android.material.datepicker.j.this.f43230M0.getAdapter().d()) {
                com.google.android.material.datepicker.j.this.V1(this.f43252C.v(iC2));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j6);
    }

    static /* synthetic */ com.google.android.material.datepicker.d H1(com.google.android.material.datepicker.j jVar) {
        jVar.getClass();
        return null;
    }

    private void K1(android.view.View view, com.google.android.material.datepicker.p pVar) {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view.findViewById(p125m4.e.f50642r);
        materialButton.setTag(f43223U0);
        androidx.core.view.X.n0(materialButton, new com.google.android.material.datepicker.j.h());
        android.view.View viewFindViewById = view.findViewById(p125m4.e.f50644t);
        this.f43231N0 = viewFindViewById;
        viewFindViewById.setTag(f43221S0);
        android.view.View viewFindViewById2 = view.findViewById(p125m4.e.f50643s);
        this.f43232O0 = viewFindViewById2;
        viewFindViewById2.setTag(f43222T0);
        this.f43233P0 = view.findViewById(p125m4.e.f50609A);
        this.f43234Q0 = view.findViewById(p125m4.e.f50646v);
        W1(com.google.android.material.datepicker.j.l.DAY);
        materialButton.setText(this.f43226I0.u());
        this.f43230M0.k(new com.google.android.material.datepicker.j.i(pVar, materialButton));
        materialButton.setOnClickListener(new com.google.android.material.datepicker.j.ViewOnClickListenerC0475j());
        this.f43232O0.setOnClickListener(new com.google.android.material.datepicker.j.k(pVar));
        this.f43231N0.setOnClickListener(new com.google.android.material.datepicker.j.a(pVar));
    }

    private androidx.recyclerview.widget.RecyclerView.o L1() {
        return new com.google.android.material.datepicker.j.g();
    }

    static int Q1(android.content.Context context) {
        return context.getResources().getDimensionPixelSize(p125m4.c.f50551M);
    }

    private static int R1(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(p125m4.c.f50558T) + resources.getDimensionPixelOffset(p125m4.c.f50559U) + resources.getDimensionPixelOffset(p125m4.c.f50557S);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(p125m4.c.f50553O);
        int i6 = com.google.android.material.datepicker.o.f43304G;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(p125m4.c.f50551M) * i6) + ((i6 - 1) * resources.getDimensionPixelOffset(p125m4.c.f50556R)) + resources.getDimensionPixelOffset(p125m4.c.f50549K);
    }

    public static com.google.android.material.datepicker.j T1(com.google.android.material.datepicker.d dVar, int i6, com.google.android.material.datepicker.C6515a c6515a, com.google.android.material.datepicker.h hVar) {
        com.google.android.material.datepicker.j jVar = new com.google.android.material.datepicker.j();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i6);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6515a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", hVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", c6515a.k());
        jVar.v1(bundle);
        return jVar;
    }

    private void U1(int i6) {
        this.f43230M0.post(new com.google.android.material.datepicker.j.b(i6));
    }

    private void X1() {
        androidx.core.view.X.n0(this.f43230M0, new com.google.android.material.datepicker.j.f());
    }

    @Override // com.google.android.material.datepicker.r
    public boolean D1(com.google.android.material.datepicker.q qVar) {
        return super.D1(qVar);
    }

    @Override // androidx.fragment.app.f
    public void K0(android.os.Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f43224G0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f43225H0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f43226I0);
    }

    com.google.android.material.datepicker.C6515a M1() {
        return this.f43225H0;
    }

    com.google.android.material.datepicker.c N1() {
        return this.f43228K0;
    }

    com.google.android.material.datepicker.n O1() {
        return this.f43226I0;
    }

    public com.google.android.material.datepicker.d P1() {
        return null;
    }

    androidx.recyclerview.widget.LinearLayoutManager S1() {
        return (androidx.recyclerview.widget.LinearLayoutManager) this.f43230M0.getLayoutManager();
    }

    void V1(com.google.android.material.datepicker.n nVar) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int i6;
        com.google.android.material.datepicker.p pVar = (com.google.android.material.datepicker.p) this.f43230M0.getAdapter();
        int iX = pVar.x(nVar);
        int iX2 = iX - pVar.x(this.f43226I0);
        boolean z6 = java.lang.Math.abs(iX2) > 3;
        boolean z10 = iX2 > 0;
        this.f43226I0 = nVar;
        if (!z6 || !z10) {
            if (z6) {
                recyclerView = this.f43230M0;
                i6 = iX + 3;
            }
            U1(iX);
        }
        recyclerView = this.f43230M0;
        i6 = iX - 3;
        recyclerView.h1(i6);
        U1(iX);
    }

    void W1(com.google.android.material.datepicker.j.l lVar) {
        this.f43227J0 = lVar;
        if (lVar == com.google.android.material.datepicker.j.l.YEAR) {
            this.f43229L0.getLayoutManager().B1(((com.google.android.material.datepicker.A) this.f43229L0.getAdapter()).u(this.f43226I0.f43299E));
            this.f43233P0.setVisibility(0);
            this.f43234Q0.setVisibility(8);
            this.f43231N0.setVisibility(8);
            this.f43232O0.setVisibility(8);
            return;
        }
        if (lVar == com.google.android.material.datepicker.j.l.DAY) {
            this.f43233P0.setVisibility(8);
            this.f43234Q0.setVisibility(0);
            this.f43231N0.setVisibility(0);
            this.f43232O0.setVisibility(0);
            V1(this.f43226I0);
        }
    }

    void Y1() {
        com.google.android.material.datepicker.j.l lVar = this.f43227J0;
        com.google.android.material.datepicker.j.l lVar2 = com.google.android.material.datepicker.j.l.YEAR;
        if (lVar == lVar2) {
            W1(com.google.android.material.datepicker.j.l.DAY);
        } else if (lVar == com.google.android.material.datepicker.j.l.DAY) {
            W1(lVar2);
        }
    }

    @Override // androidx.fragment.app.f
    public void o0(android.os.Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.f43224G0 = bundle.getInt("THEME_RES_ID_KEY");
        androidx.appcompat.app.D.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f43225H0 = (com.google.android.material.datepicker.C6515a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        androidx.appcompat.app.D.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f43226I0 = (com.google.android.material.datepicker.n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.f
    public android.view.View s0(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i6;
        int i10;
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(t(), this.f43224G0);
        this.f43228K0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.n nVarL = this.f43225H0.l();
        if (com.google.android.material.datepicker.l.b2(contextThemeWrapper)) {
            i6 = p125m4.g.f50667o;
            i10 = 1;
        } else {
            i6 = p125m4.g.f50665m;
            i10 = 0;
        }
        android.view.View viewInflate = layoutInflaterCloneInContext.inflate(i6, viewGroup, false);
        viewInflate.setMinimumHeight(R1(p1()));
        android.widget.GridView gridView = (android.widget.GridView) viewInflate.findViewById(p125m4.e.f50647w);
        androidx.core.view.X.n0(gridView, new com.google.android.material.datepicker.j.c());
        int i11 = this.f43225H0.i();
        gridView.setAdapter((android.widget.ListAdapter) (i11 > 0 ? new com.google.android.material.datepicker.i(i11) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(nVarL.f43300F);
        gridView.setEnabled(false);
        this.f43230M0 = (androidx.recyclerview.widget.RecyclerView) viewInflate.findViewById(p125m4.e.f50650z);
        this.f43230M0.setLayoutManager(new com.google.android.material.datepicker.j.d(t(), i10, false, i10));
        this.f43230M0.setTag(f43220R0);
        com.google.android.material.datepicker.p pVar = new com.google.android.material.datepicker.p(contextThemeWrapper, null, this.f43225H0, null, new com.google.android.material.datepicker.j.e());
        this.f43230M0.setAdapter(pVar);
        int integer = contextThemeWrapper.getResources().getInteger(p125m4.f.f50652b);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) viewInflate.findViewById(p125m4.e.f50609A);
        this.f43229L0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f43229L0.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager((android.content.Context) contextThemeWrapper, integer, 1, false));
            this.f43229L0.setAdapter(new com.google.android.material.datepicker.A(this));
            this.f43229L0.h(L1());
        }
        if (viewInflate.findViewById(p125m4.e.f50642r) != null) {
            K1(viewInflate, pVar);
        }
        if (!com.google.android.material.datepicker.l.b2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f43230M0);
        }
        this.f43230M0.h1(pVar.x(this.f43226I0));
        X1();
        return viewInflate;
    }
}
