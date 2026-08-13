package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements androidx.appcompat.widget.J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.appcompat.widget.Toolbar f18477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.View f18479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.view.View f18480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    java.lang.CharSequence f18485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.CharSequence f18486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.lang.CharSequence f18487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    android.view.Window.Callback f18488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f18489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.appcompat.widget.C1897c f18490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.graphics.drawable.Drawable f18493q;

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f18494C;

        a() {
            this.f18494C = new androidx.appcompat.view.menu.a(androidx.appcompat.widget.g0.this.f18477a.getContext(), 0, android.R.id.home, 0, 0, androidx.appcompat.widget.g0.this.f18485i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.appcompat.widget.g0 g0Var = androidx.appcompat.widget.g0.this;
            android.view.Window.Callback callback = g0Var.f18488l;
            if (callback == null || !g0Var.f18489m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f18494C);
        }
    }

    class b extends androidx.core.view.AbstractC2007i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18496a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18497b;

        b(int i6) {
            this.f18497b = i6;
        }

        @Override // androidx.core.view.AbstractC2007i0, androidx.core.view.InterfaceC2005h0
        public void a(android.view.View view) {
            this.f18496a = true;
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void b(android.view.View view) {
            if (this.f18496a) {
                return;
            }
            androidx.appcompat.widget.g0.this.f18477a.setVisibility(this.f18497b);
        }

        @Override // androidx.core.view.AbstractC2007i0, androidx.core.view.InterfaceC2005h0
        public void c(android.view.View view) {
            androidx.appcompat.widget.g0.this.f18477a.setVisibility(0);
        }
    }

    public g0(androidx.appcompat.widget.Toolbar toolbar, boolean z6) {
        this(toolbar, z6, p090j.h.f48779a, p090j.e.f48704n);
    }

    public g0(androidx.appcompat.widget.Toolbar toolbar, boolean z6, int i6, int i10) {
        android.graphics.drawable.Drawable drawable;
        this.f18491o = 0;
        this.f18492p = 0;
        this.f18477a = toolbar;
        this.f18485i = toolbar.getTitle();
        this.f18486j = toolbar.getSubtitle();
        this.f18484h = this.f18485i != null;
        this.f18483g = toolbar.getNavigationIcon();
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(toolbar.getContext(), null, p090j.j.f48901a, p090j.a.f48626c, 0);
        this.f18493q = c0VarV.g(p090j.j.f48956l);
        if (z6) {
            java.lang.CharSequence charSequenceP = c0VarV.p(p090j.j.f48986r);
            if (!android.text.TextUtils.isEmpty(charSequenceP)) {
                C(charSequenceP);
            }
            java.lang.CharSequence charSequenceP2 = c0VarV.p(p090j.j.f48976p);
            if (!android.text.TextUtils.isEmpty(charSequenceP2)) {
                B(charSequenceP2);
            }
            android.graphics.drawable.Drawable drawableG = c0VarV.g(p090j.j.f48966n);
            if (drawableG != null) {
                x(drawableG);
            }
            android.graphics.drawable.Drawable drawableG2 = c0VarV.g(p090j.j.f48961m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f18483g == null && (drawable = this.f18493q) != null) {
                A(drawable);
            }
            k(c0VarV.k(p090j.j.f48936h, 0));
            int iN = c0VarV.n(p090j.j.f48931g, 0);
            if (iN != 0) {
                v(android.view.LayoutInflater.from(this.f18477a.getContext()).inflate(iN, (android.view.ViewGroup) this.f18477a, false));
                k(this.f18478b | 16);
            }
            int iM = c0VarV.m(p090j.j.f48946j, 0);
            if (iM > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = this.f18477a.getLayoutParams();
                layoutParams.height = iM;
                this.f18477a.setLayoutParams(layoutParams);
            }
            int iE = c0VarV.e(p090j.j.f48926f, -1);
            int iE2 = c0VarV.e(p090j.j.f48921e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f18477a.L(java.lang.Math.max(iE, 0), java.lang.Math.max(iE2, 0));
            }
            int iN2 = c0VarV.n(p090j.j.f48991s, 0);
            if (iN2 != 0) {
                androidx.appcompat.widget.Toolbar toolbar2 = this.f18477a;
                toolbar2.O(toolbar2.getContext(), iN2);
            }
            int iN3 = c0VarV.n(p090j.j.f48981q, 0);
            if (iN3 != 0) {
                androidx.appcompat.widget.Toolbar toolbar3 = this.f18477a;
                toolbar3.N(toolbar3.getContext(), iN3);
            }
            int iN4 = c0VarV.n(p090j.j.f48971o, 0);
            if (iN4 != 0) {
                this.f18477a.setPopupTheme(iN4);
            }
        } else {
            this.f18478b = u();
        }
        c0VarV.w();
        w(i6);
        this.f18487k = this.f18477a.getNavigationContentDescription();
        this.f18477a.setNavigationOnClickListener(new androidx.appcompat.widget.g0.a());
    }

    private void D(java.lang.CharSequence charSequence) {
        this.f18485i = charSequence;
        if ((this.f18478b & 8) != 0) {
            this.f18477a.setTitle(charSequence);
            if (this.f18484h) {
                androidx.core.view.X.q0(this.f18477a.getRootView(), charSequence);
            }
        }
    }

    private void E() {
        if ((this.f18478b & 4) != 0) {
            if (android.text.TextUtils.isEmpty(this.f18487k)) {
                this.f18477a.setNavigationContentDescription(this.f18492p);
            } else {
                this.f18477a.setNavigationContentDescription(this.f18487k);
            }
        }
    }

    private void F() {
        androidx.appcompat.widget.Toolbar toolbar;
        android.graphics.drawable.Drawable drawable;
        if ((this.f18478b & 4) != 0) {
            toolbar = this.f18477a;
            drawable = this.f18483g;
            if (drawable == null) {
                drawable = this.f18493q;
            }
        } else {
            toolbar = this.f18477a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void G() {
        android.graphics.drawable.Drawable drawable;
        int i6 = this.f18478b;
        if ((i6 & 2) == 0) {
            drawable = null;
        } else if ((i6 & 1) == 0 || (drawable = this.f18482f) == null) {
            drawable = this.f18481e;
        }
        this.f18477a.setLogo(drawable);
    }

    private int u() {
        if (this.f18477a.getNavigationIcon() == null) {
            return 11;
        }
        this.f18493q = this.f18477a.getNavigationIcon();
        return 15;
    }

    public void A(android.graphics.drawable.Drawable drawable) {
        this.f18483g = drawable;
        F();
    }

    public void B(java.lang.CharSequence charSequence) {
        this.f18486j = charSequence;
        if ((this.f18478b & 8) != 0) {
            this.f18477a.setSubtitle(charSequence);
        }
    }

    public void C(java.lang.CharSequence charSequence) {
        this.f18484h = true;
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void a(android.view.Menu menu, androidx.appcompat.view.menu.m.a aVar) {
        if (this.f18490n == null) {
            androidx.appcompat.widget.C1897c c1897c = new androidx.appcompat.widget.C1897c(this.f18477a.getContext());
            this.f18490n = c1897c;
            c1897c.p(p090j.f.f48739g);
        }
        this.f18490n.h(aVar);
        this.f18477a.M((androidx.appcompat.view.menu.g) menu, this.f18490n);
    }

    @Override // androidx.appcompat.widget.J
    public boolean b() {
        return this.f18477a.D();
    }

    @Override // androidx.appcompat.widget.J
    public void c() {
        this.f18489m = true;
    }

    @Override // androidx.appcompat.widget.J
    public void collapseActionView() {
        this.f18477a.f();
    }

    @Override // androidx.appcompat.widget.J
    public boolean d() {
        return this.f18477a.e();
    }

    @Override // androidx.appcompat.widget.J
    public boolean e() {
        return this.f18477a.C();
    }

    @Override // androidx.appcompat.widget.J
    public boolean f() {
        return this.f18477a.y();
    }

    @Override // androidx.appcompat.widget.J
    public boolean g() {
        return this.f18477a.R();
    }

    @Override // androidx.appcompat.widget.J
    public android.content.Context getContext() {
        return this.f18477a.getContext();
    }

    @Override // androidx.appcompat.widget.J
    public java.lang.CharSequence getTitle() {
        return this.f18477a.getTitle();
    }

    @Override // androidx.appcompat.widget.J
    public void h() {
        this.f18477a.g();
    }

    @Override // androidx.appcompat.widget.J
    public void i(androidx.appcompat.widget.W w6) {
        android.view.View view = this.f18479c;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            androidx.appcompat.widget.Toolbar toolbar = this.f18477a;
            if (parent == toolbar) {
                toolbar.removeView(this.f18479c);
            }
        }
        this.f18479c = w6;
    }

    @Override // androidx.appcompat.widget.J
    public boolean j() {
        return this.f18477a.x();
    }

    @Override // androidx.appcompat.widget.J
    public void k(int i6) {
        android.view.View view;
        java.lang.CharSequence charSequence;
        androidx.appcompat.widget.Toolbar toolbar;
        int i10 = this.f18478b ^ i6;
        this.f18478b = i6;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i6 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i10 & 3) != 0) {
                G();
            }
            if ((i10 & 8) != 0) {
                if ((i6 & 8) != 0) {
                    this.f18477a.setTitle(this.f18485i);
                    toolbar = this.f18477a;
                    charSequence = this.f18486j;
                } else {
                    charSequence = null;
                    this.f18477a.setTitle((java.lang.CharSequence) null);
                    toolbar = this.f18477a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i10 & 16) == 0 || (view = this.f18480d) == null) {
                return;
            }
            if ((i6 & 16) != 0) {
                this.f18477a.addView(view);
            } else {
                this.f18477a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.J
    public void l(int i6) {
        x(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
    }

    @Override // androidx.appcompat.widget.J
    public int m() {
        return this.f18491o;
    }

    @Override // androidx.appcompat.widget.J
    public androidx.core.view.C2003g0 n(int i6, long j6) {
        return androidx.core.view.X.e(this.f18477a).b(i6 == 0 ? 1.0f : 0.0f).f(j6).h(new androidx.appcompat.widget.g0.b(i6));
    }

    @Override // androidx.appcompat.widget.J
    public void o(int i6) {
        this.f18477a.setVisibility(i6);
    }

    @Override // androidx.appcompat.widget.J
    public void p(boolean z6) {
    }

    @Override // androidx.appcompat.widget.J
    public int q() {
        return this.f18478b;
    }

    @Override // androidx.appcompat.widget.J
    public void r() {
    }

    @Override // androidx.appcompat.widget.J
    public void s() {
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(int i6) {
        setIcon(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f18481e = drawable;
        G();
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowCallback(android.view.Window.Callback callback) {
        this.f18488l = callback;
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        if (this.f18484h) {
            return;
        }
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void t(boolean z6) {
        this.f18477a.setCollapsible(z6);
    }

    public void v(android.view.View view) {
        android.view.View view2 = this.f18480d;
        if (view2 != null && (this.f18478b & 16) != 0) {
            this.f18477a.removeView(view2);
        }
        this.f18480d = view;
        if (view == null || (this.f18478b & 16) == 0) {
            return;
        }
        this.f18477a.addView(view);
    }

    public void w(int i6) {
        if (i6 == this.f18492p) {
            return;
        }
        this.f18492p = i6;
        if (android.text.TextUtils.isEmpty(this.f18477a.getNavigationContentDescription())) {
            y(this.f18492p);
        }
    }

    public void x(android.graphics.drawable.Drawable drawable) {
        this.f18482f = drawable;
        G();
    }

    public void y(int i6) {
        z(i6 == 0 ? null : getContext().getString(i6));
    }

    public void z(java.lang.CharSequence charSequence) {
        this.f18487k = charSequence;
        E();
    }
}
