package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class E extends androidx.appcompat.app.AbstractC1890a implements androidx.appcompat.widget.ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final android.view.animation.Interpolator f17478D = new android.view.animation.AccelerateInterpolator();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final android.view.animation.Interpolator f17479E = new android.view.animation.DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.content.Context f17483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f17484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.app.Activity f17485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.appcompat.widget.ActionBarOverlayLayout f17486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.appcompat.widget.ActionBarContainer f17487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.appcompat.widget.J f17488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.appcompat.widget.ActionBarContextView f17489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    android.view.View f17490h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    androidx.appcompat.app.E.d f17494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f17495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b.a f17496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17497o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17499q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f17502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f17503u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f17504v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f17506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f17508z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f17491i = new java.util.ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17492j = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.util.ArrayList f17498p = new java.util.ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17500r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f17501s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17505w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final androidx.core.view.InterfaceC2005h0 f17480A = new androidx.appcompat.app.E.a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final androidx.core.view.InterfaceC2005h0 f17481B = new androidx.appcompat.app.E.b();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final androidx.core.view.InterfaceC2009j0 f17482C = new androidx.appcompat.app.E.c();

    class a extends androidx.core.view.AbstractC2007i0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void b(android.view.View view) {
            android.view.View view2;
            androidx.appcompat.app.E e6 = androidx.appcompat.app.E.this;
            if (e6.f17501s && (view2 = e6.f17490h) != null) {
                view2.setTranslationY(0.0f);
                androidx.appcompat.app.E.this.f17487e.setTranslationY(0.0f);
            }
            androidx.appcompat.app.E.this.f17487e.setVisibility(8);
            androidx.appcompat.app.E.this.f17487e.setTransitioning(false);
            androidx.appcompat.app.E e10 = androidx.appcompat.app.E.this;
            e10.f17506x = null;
            e10.r();
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = androidx.appcompat.app.E.this.f17486d;
            if (actionBarOverlayLayout != null) {
                androidx.core.view.X.k0(actionBarOverlayLayout);
            }
        }
    }

    class b extends androidx.core.view.AbstractC2007i0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void b(android.view.View view) {
            androidx.appcompat.app.E e6 = androidx.appcompat.app.E.this;
            e6.f17506x = null;
            e6.f17487e.requestLayout();
        }
    }

    class c implements androidx.core.view.InterfaceC2009j0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC2009j0
        public void a(android.view.View view) {
            ((android.view.View) androidx.appcompat.app.E.this.f17487e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements androidx.appcompat.view.menu.g.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final android.content.Context f17512E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f17513F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private androidx.appcompat.view.b.a f17514G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private java.lang.ref.WeakReference f17515H;

        public d(android.content.Context context, androidx.appcompat.view.b.a aVar) {
            this.f17512E = context;
            this.f17514G = aVar;
            androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(context).S(1);
            this.f17513F = gVarS;
            gVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
            androidx.appcompat.view.b.a aVar = this.f17514G;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f17514G == null) {
                return;
            }
            k();
            androidx.appcompat.app.E.this.f17489g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            androidx.appcompat.app.E e6 = androidx.appcompat.app.E.this;
            if (e6.f17494l != this) {
                return;
            }
            if (androidx.appcompat.app.E.q(e6.f17502t, e6.f17503u, false)) {
                this.f17514G.a(this);
            } else {
                androidx.appcompat.app.E e10 = androidx.appcompat.app.E.this;
                e10.f17495m = this;
                e10.f17496n = this.f17514G;
            }
            this.f17514G = null;
            androidx.appcompat.app.E.this.p(false);
            androidx.appcompat.app.E.this.f17489g.g();
            androidx.appcompat.app.E e11 = androidx.appcompat.app.E.this;
            e11.f17486d.setHideOnContentScrollEnabled(e11.f17508z);
            androidx.appcompat.app.E.this.f17494l = null;
        }

        @Override // androidx.appcompat.view.b
        public android.view.View d() {
            java.lang.ref.WeakReference weakReference = this.f17515H;
            if (weakReference != null) {
                return (android.view.View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public android.view.Menu e() {
            return this.f17513F;
        }

        @Override // androidx.appcompat.view.b
        public android.view.MenuInflater f() {
            return new androidx.appcompat.view.g(this.f17512E);
        }

        @Override // androidx.appcompat.view.b
        public java.lang.CharSequence g() {
            return androidx.appcompat.app.E.this.f17489g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public java.lang.CharSequence i() {
            return androidx.appcompat.app.E.this.f17489g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (androidx.appcompat.app.E.this.f17494l != this) {
                return;
            }
            this.f17513F.d0();
            try {
                this.f17514G.c(this, this.f17513F);
            } finally {
                this.f17513F.c0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return androidx.appcompat.app.E.this.f17489g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(android.view.View view) {
            androidx.appcompat.app.E.this.f17489g.setCustomView(view);
            this.f17515H = new java.lang.ref.WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i6) {
            o(androidx.appcompat.app.E.this.f17483a.getResources().getString(i6));
        }

        @Override // androidx.appcompat.view.b
        public void o(java.lang.CharSequence charSequence) {
            androidx.appcompat.app.E.this.f17489g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i6) {
            r(androidx.appcompat.app.E.this.f17483a.getResources().getString(i6));
        }

        @Override // androidx.appcompat.view.b
        public void r(java.lang.CharSequence charSequence) {
            androidx.appcompat.app.E.this.f17489g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z6) {
            super.s(z6);
            androidx.appcompat.app.E.this.f17489g.setTitleOptional(z6);
        }

        public boolean t() {
            this.f17513F.d0();
            try {
                return this.f17514G.b(this, this.f17513F);
            } finally {
                this.f17513F.c0();
            }
        }
    }

    public E(android.app.Activity activity, boolean z6) {
        this.f17485c = activity;
        android.view.View decorView = activity.getWindow().getDecorView();
        x(decorView);
        if (z6) {
            return;
        }
        this.f17490h = decorView.findViewById(android.R.id.content);
    }

    public E(android.app.Dialog dialog) {
        x(dialog.getWindow().getDecorView());
    }

    private void B(boolean z6) {
        this.f17499q = z6;
        if (z6) {
            this.f17487e.setTabContainer(null);
            this.f17488f.i(null);
        } else {
            this.f17488f.i(null);
            this.f17487e.setTabContainer(null);
        }
        boolean z10 = false;
        boolean z11 = v() == 2;
        this.f17488f.t(!this.f17499q && z11);
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f17486d;
        if (!this.f17499q && z11) {
            z10 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z10);
    }

    private boolean E() {
        return androidx.core.view.X.R(this.f17487e);
    }

    private void F() {
        if (this.f17504v) {
            return;
        }
        this.f17504v = true;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f17486d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        G(false);
    }

    private void G(boolean z6) {
        if (q(this.f17502t, this.f17503u, this.f17504v)) {
            if (this.f17505w) {
                return;
            }
            this.f17505w = true;
            t(z6);
            return;
        }
        if (this.f17505w) {
            this.f17505w = false;
            s(z6);
        }
    }

    static boolean q(boolean z6, boolean z10, boolean z11) {
        if (z11) {
            return true;
        }
        return (z6 || z10) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.appcompat.widget.J u(android.view.View view) {
        if (view instanceof androidx.appcompat.widget.J) {
            return (androidx.appcompat.widget.J) view;
        }
        if (view instanceof androidx.appcompat.widget.Toolbar) {
            return ((androidx.appcompat.widget.Toolbar) view).getWrapper();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private void w() {
        if (this.f17504v) {
            this.f17504v = false;
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f17486d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            G(false);
        }
    }

    private void x(android.view.View view) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) view.findViewById(p090j.f.f48748p);
        this.f17486d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f17488f = u(view.findViewById(p090j.f.f48733a));
        this.f17489g = (androidx.appcompat.widget.ActionBarContextView) view.findViewById(p090j.f.f48738f);
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) view.findViewById(p090j.f.f48735c);
        this.f17487e = actionBarContainer;
        androidx.appcompat.widget.J j6 = this.f17488f;
        if (j6 == null || this.f17489g == null || actionBarContainer == null) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f17483a = j6.getContext();
        boolean z6 = (this.f17488f.q() & 4) != 0;
        if (z6) {
            this.f17493k = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f17483a);
        D(aVarB.a() || z6);
        B(aVarB.e());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.f17483a.obtainStyledAttributes(null, p090j.j.f48901a, p090j.a.f48626c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48951k, false)) {
            C(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p090j.j.f48941i, 0);
        if (dimensionPixelSize != 0) {
            A(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(float f6) {
        androidx.core.view.X.v0(this.f17487e, f6);
    }

    public void C(boolean z6) {
        if (z6 && !this.f17486d.w()) {
            throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f17508z = z6;
        this.f17486d.setHideOnContentScrollEnabled(z6);
    }

    public void D(boolean z6) {
        this.f17488f.p(z6);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f17503u) {
            this.f17503u = false;
            G(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z6) {
        this.f17501s = z6;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f17503u) {
            return;
        }
        this.f17503u = true;
        G(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f17506x;
        if (hVar != null) {
            hVar.a();
            this.f17506x = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public boolean f() {
        androidx.appcompat.widget.J j6 = this.f17488f;
        if (j6 == null || !j6.j()) {
            return false;
        }
        this.f17488f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public void g(boolean z6) {
        if (z6 == this.f17497o) {
            return;
        }
        this.f17497o = z6;
        if (this.f17498p.size() <= 0) {
            return;
        }
        androidx.appcompat.app.D.a(this.f17498p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public android.content.Context h() {
        if (this.f17484b == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f17483a.getTheme().resolveAttribute(p090j.a.f48628e, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.f17484b = new android.view.ContextThemeWrapper(this.f17483a, i6);
            } else {
                this.f17484b = this.f17483a;
            }
        }
        return this.f17484b;
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public boolean k(int i6, android.view.KeyEvent keyEvent) {
        android.view.Menu menuE;
        androidx.appcompat.app.E.d dVar = this.f17494l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i6, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public void l(boolean z6) {
        if (this.f17493k) {
            return;
        }
        y(z6);
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public void m(boolean z6) {
        androidx.appcompat.view.h hVar;
        this.f17507y = z6;
        if (z6 || (hVar = this.f17506x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public void n(java.lang.CharSequence charSequence) {
        this.f17488f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1890a
    public androidx.appcompat.view.b o(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.app.E.d dVar = this.f17494l;
        if (dVar != null) {
            dVar.c();
        }
        this.f17486d.setHideOnContentScrollEnabled(false);
        this.f17489g.k();
        androidx.appcompat.app.E.d dVar2 = new androidx.appcompat.app.E.d(this.f17489g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f17494l = dVar2;
        dVar2.k();
        this.f17489g.h(dVar2);
        p(true);
        return dVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i6) {
        this.f17500r = i6;
    }

    public void p(boolean z6) {
        androidx.core.view.C2003g0 c2003g0N;
        androidx.core.view.C2003g0 c2003g0F;
        if (z6) {
            F();
        } else {
            w();
        }
        if (!E()) {
            if (z6) {
                this.f17488f.o(4);
                this.f17489g.setVisibility(0);
                return;
            } else {
                this.f17488f.o(0);
                this.f17489g.setVisibility(8);
                return;
            }
        }
        if (z6) {
            c2003g0F = this.f17488f.n(4, 100L);
            c2003g0N = this.f17489g.f(0, 200L);
        } else {
            c2003g0N = this.f17488f.n(0, 200L);
            c2003g0F = this.f17489g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c2003g0F, c2003g0N);
        hVar.h();
    }

    void r() {
        androidx.appcompat.view.b.a aVar = this.f17496n;
        if (aVar != null) {
            aVar.a(this.f17495m);
            this.f17495m = null;
            this.f17496n = null;
        }
    }

    public void s(boolean z6) {
        android.view.View view;
        androidx.appcompat.view.h hVar = this.f17506x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f17500r != 0 || (!this.f17507y && !z6)) {
            this.f17480A.b(null);
            return;
        }
        this.f17487e.setAlpha(1.0f);
        this.f17487e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f6 = -this.f17487e.getHeight();
        if (z6) {
            int[] iArr = {0, 0};
            this.f17487e.getLocationInWindow(iArr);
            f6 -= iArr[1];
        }
        androidx.core.view.C2003g0 c2003g0M = androidx.core.view.X.e(this.f17487e).m(f6);
        c2003g0M.k(this.f17482C);
        hVar2.c(c2003g0M);
        if (this.f17501s && (view = this.f17490h) != null) {
            hVar2.c(androidx.core.view.X.e(view).m(f6));
        }
        hVar2.f(f17478D);
        hVar2.e(250L);
        hVar2.g(this.f17480A);
        this.f17506x = hVar2;
        hVar2.h();
    }

    public void t(boolean z6) {
        android.view.View view;
        android.view.View view2;
        androidx.appcompat.view.h hVar = this.f17506x;
        if (hVar != null) {
            hVar.a();
        }
        this.f17487e.setVisibility(0);
        if (this.f17500r == 0 && (this.f17507y || z6)) {
            this.f17487e.setTranslationY(0.0f);
            float f6 = -this.f17487e.getHeight();
            if (z6) {
                int[] iArr = {0, 0};
                this.f17487e.getLocationInWindow(iArr);
                f6 -= iArr[1];
            }
            this.f17487e.setTranslationY(f6);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            androidx.core.view.C2003g0 c2003g0M = androidx.core.view.X.e(this.f17487e).m(0.0f);
            c2003g0M.k(this.f17482C);
            hVar2.c(c2003g0M);
            if (this.f17501s && (view2 = this.f17490h) != null) {
                view2.setTranslationY(f6);
                hVar2.c(androidx.core.view.X.e(this.f17490h).m(0.0f));
            }
            hVar2.f(f17479E);
            hVar2.e(250L);
            hVar2.g(this.f17481B);
            this.f17506x = hVar2;
            hVar2.h();
        } else {
            this.f17487e.setAlpha(1.0f);
            this.f17487e.setTranslationY(0.0f);
            if (this.f17501s && (view = this.f17490h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f17481B.b(null);
        }
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f17486d;
        if (actionBarOverlayLayout != null) {
            androidx.core.view.X.k0(actionBarOverlayLayout);
        }
    }

    public int v() {
        return this.f17488f.m();
    }

    public void y(boolean z6) {
        z(z6 ? 4 : 0, 4);
    }

    public void z(int i6, int i10) {
        int iQ = this.f17488f.q();
        if ((i10 & 4) != 0) {
            this.f17493k = true;
        }
        this.f17488f.k((i6 & i10) | ((~i10) & iQ));
    }
}
