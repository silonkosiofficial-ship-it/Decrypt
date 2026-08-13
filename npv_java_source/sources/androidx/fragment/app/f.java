package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.Y, androidx.lifecycle.InterfaceC2077i, p233x2.f {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    static final java.lang.Object f22468E0 = new java.lang.Object();

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f22469A0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    android.os.Bundle f22473D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    android.util.SparseArray f22475E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    android.os.Bundle f22476F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.lang.Boolean f22477G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    android.os.Bundle f22479I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    androidx.fragment.app.f f22480J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f22482L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f22484N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f22485O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    boolean f22486P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    boolean f22487Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    boolean f22488R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    boolean f22489S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    boolean f22490T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f22491U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    androidx.fragment.app.n f22492V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    androidx.fragment.app.k f22493W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    androidx.fragment.app.f f22495Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f22496Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    int f22497a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    java.lang.String f22498b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f22499c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f22500d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    boolean f22501e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    boolean f22502f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    boolean f22503g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f22505i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    android.view.ViewGroup f22506j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    android.view.View f22507k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    boolean f22508l0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    androidx.fragment.app.f.g f22510n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    android.os.Handler f22511o0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    boolean f22513q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    android.view.LayoutInflater f22514r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    boolean f22515s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public java.lang.String f22516t0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    androidx.lifecycle.C2087t f22518v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    androidx.fragment.app.y f22519w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    androidx.lifecycle.V.c f22521y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    p233x2.e f22522z0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f22471C = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    java.lang.String f22478H = java.util.UUID.randomUUID().toString();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    java.lang.String f22481K = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.lang.Boolean f22483M = null;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    androidx.fragment.app.n f22494X = new androidx.fragment.app.o();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f22504h0 = true;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    boolean f22509m0 = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    java.lang.Runnable f22512p0 = new androidx.fragment.app.f.a();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    androidx.lifecycle.AbstractC2079k.b f22517u0 = androidx.lifecycle.AbstractC2079k.b.RESUMED;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    androidx.lifecycle.C2093z f22520x0 = new androidx.lifecycle.C2093z();

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f22470B0 = new java.util.concurrent.atomic.AtomicInteger();

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final java.util.ArrayList f22472C0 = new java.util.ArrayList();

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final androidx.fragment.app.f.j f22474D0 = new androidx.fragment.app.f.b();

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.f.this.C1();
        }
    }

    class b extends androidx.fragment.app.f.j {
        b() {
            super(null);
        }

        @Override // androidx.fragment.app.f.j
        void a() {
            androidx.fragment.app.f.this.f22522z0.c();
            androidx.lifecycle.L.c(androidx.fragment.app.f.this);
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.f.this.e(false);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A f22526C;

        d(androidx.fragment.app.A a6) {
            this.f22526C = a6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22526C.g();
        }
    }

    class e extends V1.e {
        e() {
        }

        @Override // V1.e
        public android.view.View h(int i6) {
            android.view.View view = androidx.fragment.app.f.this.f22507k0;
            if (view != null) {
                return view.findViewById(i6);
            }
            throw new java.lang.IllegalStateException("Fragment " + androidx.fragment.app.f.this + " does not have a view");
        }

        @Override // V1.e
        public boolean j() {
            return androidx.fragment.app.f.this.f22507k0 != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    class C0426f implements androidx.lifecycle.InterfaceC2083o {
        C0426f() {
        }

        @Override // androidx.lifecycle.InterfaceC2083o
        public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            android.view.View view;
            if (aVar != androidx.lifecycle.AbstractC2079k.a.ON_STOP || (view = androidx.fragment.app.f.this.f22507k0) == null) {
                return;
            }
            androidx.fragment.app.f.h.a(view);
        }
    }

    static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.view.View f22530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f22531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f22532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        java.util.ArrayList f22537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        java.util.ArrayList f22538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        java.lang.Object f22539j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        java.lang.Object f22540k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        java.lang.Object f22541l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        java.lang.Object f22542m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        java.lang.Object f22543n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        java.lang.Object f22544o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        java.lang.Boolean f22545p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        java.lang.Boolean f22546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        float f22547r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        android.view.View f22548s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f22549t;

        g() {
            java.lang.Object obj = androidx.fragment.app.f.f22468E0;
            this.f22540k = obj;
            this.f22541l = null;
            this.f22542m = obj;
            this.f22543n = null;
            this.f22544o = obj;
            this.f22547r = 1.0f;
            this.f22548s = null;
        }
    }

    static class h {
        static void a(android.view.View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class i extends java.lang.RuntimeException {
        public i(java.lang.String str, java.lang.Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class j {
        private j() {
        }

        /* synthetic */ j(androidx.fragment.app.f.a aVar) {
            this();
        }

        abstract void a();
    }

    public f() {
        X();
    }

    private int E() {
        androidx.lifecycle.AbstractC2079k.b bVar = this.f22517u0;
        return (bVar == androidx.lifecycle.AbstractC2079k.b.INITIALIZED || this.f22495Y == null) ? bVar.ordinal() : java.lang.Math.min(bVar.ordinal(), this.f22495Y.E());
    }

    private androidx.fragment.app.f U(boolean z6) {
        java.lang.String str;
        if (z6) {
            W1.c.h(this);
        }
        androidx.fragment.app.f fVar = this.f22480J;
        if (fVar != null) {
            return fVar;
        }
        androidx.fragment.app.n nVar = this.f22492V;
        if (nVar == null || (str = this.f22481K) == null) {
            return null;
        }
        return nVar.c0(str);
    }

    private void X() {
        this.f22518v0 = new androidx.lifecycle.C2087t(this);
        this.f22522z0 = p233x2.e.a(this);
        this.f22521y0 = null;
        if (this.f22472C0.contains(this.f22474D0)) {
            return;
        }
        n1(this.f22474D0);
    }

    public static androidx.fragment.app.f Z(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        try {
            androidx.fragment.app.f fVar = (androidx.fragment.app.f) androidx.fragment.app.j.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fVar.getClass().getClassLoader());
                fVar.v1(bundle);
            }
            return fVar;
        } catch (java.lang.IllegalAccessException e6) {
            throw new androidx.fragment.app.f.i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e6);
        } catch (java.lang.InstantiationException e10) {
            throw new androidx.fragment.app.f.i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (java.lang.NoSuchMethodException e11) {
            throw new androidx.fragment.app.f.i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e11);
        } catch (java.lang.reflect.InvocationTargetException e12) {
            throw new androidx.fragment.app.f.i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e12);
        }
    }

    private androidx.fragment.app.f.g h() {
        if (this.f22510n0 == null) {
            this.f22510n0 = new androidx.fragment.app.f.g();
        }
        return this.f22510n0;
    }

    private void n1(androidx.fragment.app.f.j jVar) {
        if (this.f22471C >= 0) {
            jVar.a();
        } else {
            this.f22472C0.add(jVar);
        }
    }

    private void s1() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "moveto RESTORE_VIEW_STATE: " + this;
        }
        if (this.f22507k0 != null) {
            t1(this.f22473D);
        }
        this.f22473D = null;
    }

    androidx.core.app.r A() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void A0(android.content.Context context, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.f22505i0 = true;
        androidx.fragment.app.k kVar = this.f22493W;
        android.app.Activity activityK = kVar == null ? null : kVar.k();
        if (activityK != null) {
            this.f22505i0 = false;
            z0(activityK, attributeSet, bundle);
        }
    }

    void A1(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        h();
        androidx.fragment.app.f.g gVar = this.f22510n0;
        gVar.f22537h = arrayList;
        gVar.f22538i = arrayList2;
    }

    android.view.View B() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        return gVar.f22548s;
    }

    public void B0(boolean z6) {
    }

    public void B1(android.content.Intent intent, int i6, android.os.Bundle bundle) {
        if (this.f22493W != null) {
            H().R0(this, intent, i6, bundle);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final java.lang.Object C() {
        androidx.fragment.app.k kVar = this.f22493W;
        if (kVar == null) {
            return null;
        }
        return kVar.x();
    }

    public boolean C0(android.view.MenuItem menuItem) {
        return false;
    }

    public void C1() {
        if (this.f22510n0 == null || !h().f22549t) {
            return;
        }
        if (this.f22493W == null) {
            h().f22549t = false;
        } else if (android.os.Looper.myLooper() != this.f22493W.r().getLooper()) {
            this.f22493W.r().postAtFrontOfQueue(new androidx.fragment.app.f.c());
        } else {
            e(true);
        }
    }

    public android.view.LayoutInflater D(android.os.Bundle bundle) {
        androidx.fragment.app.k kVar = this.f22493W;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        android.view.LayoutInflater layoutInflaterY = kVar.y();
        androidx.core.view.AbstractC2029u.a(layoutInflaterY, this.f22494X.s0());
        return layoutInflaterY;
    }

    public void D0(android.view.Menu menu) {
    }

    public void E0() {
        this.f22505i0 = true;
    }

    int F() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return 0;
        }
        return gVar.f22536g;
    }

    public void F0(boolean z6) {
    }

    public final androidx.fragment.app.f G() {
        return this.f22495Y;
    }

    public void G0(android.view.Menu menu) {
    }

    public final androidx.fragment.app.n H() {
        androidx.fragment.app.n nVar = this.f22492V;
        if (nVar != null) {
            return nVar;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void H0(boolean z6) {
    }

    boolean I() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return false;
        }
        return gVar.f22531b;
    }

    public void I0(int i6, java.lang.String[] strArr, int[] iArr) {
    }

    int J() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return 0;
        }
        return gVar.f22534e;
    }

    public void J0() {
        this.f22505i0 = true;
    }

    int K() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return 0;
        }
        return gVar.f22535f;
    }

    public void K0(android.os.Bundle bundle) {
    }

    float L() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f22547r;
    }

    public void L0() {
        this.f22505i0 = true;
    }

    public java.lang.Object M() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        java.lang.Object obj = gVar.f22542m;
        return obj == f22468E0 ? z() : obj;
    }

    public void M0() {
        this.f22505i0 = true;
    }

    public final android.content.res.Resources N() {
        return p1().getResources();
    }

    public void N0(android.view.View view, android.os.Bundle bundle) {
    }

    public java.lang.Object O() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        java.lang.Object obj = gVar.f22540k;
        return obj == f22468E0 ? w() : obj;
    }

    public void O0(android.os.Bundle bundle) {
        this.f22505i0 = true;
    }

    public java.lang.Object P() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        return gVar.f22543n;
    }

    void P0(android.os.Bundle bundle) {
        this.f22494X.T0();
        this.f22471C = 3;
        this.f22505i0 = false;
        i0(bundle);
        if (this.f22505i0) {
            s1();
            this.f22494X.v();
        } else {
            throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public java.lang.Object Q() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        java.lang.Object obj = gVar.f22544o;
        return obj == f22468E0 ? P() : obj;
    }

    void Q0() {
        java.util.Iterator it = this.f22472C0.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.f.j) it.next()).a();
        }
        this.f22472C0.clear();
        this.f22494X.k(this.f22493W, f(), this);
        this.f22471C = 0;
        this.f22505i0 = false;
        l0(this.f22493W.o());
        if (this.f22505i0) {
            this.f22492V.F(this);
            this.f22494X.w();
        } else {
            throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    java.util.ArrayList R() {
        java.util.ArrayList arrayList;
        androidx.fragment.app.f.g gVar = this.f22510n0;
        return (gVar == null || (arrayList = gVar.f22537h) == null) ? new java.util.ArrayList() : arrayList;
    }

    void R0(android.content.res.Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    java.util.ArrayList S() {
        java.util.ArrayList arrayList;
        androidx.fragment.app.f.g gVar = this.f22510n0;
        return (gVar == null || (arrayList = gVar.f22538i) == null) ? new java.util.ArrayList() : arrayList;
    }

    boolean S0(android.view.MenuItem menuItem) {
        if (this.f22499c0) {
            return false;
        }
        if (n0(menuItem)) {
            return true;
        }
        return this.f22494X.y(menuItem);
    }

    public final java.lang.String T(int i6) {
        return N().getString(i6);
    }

    void T0(android.os.Bundle bundle) {
        this.f22494X.T0();
        this.f22471C = 1;
        this.f22505i0 = false;
        this.f22518v0.a(new androidx.fragment.app.f.C0426f());
        this.f22522z0.d(bundle);
        o0(bundle);
        this.f22515s0 = true;
        if (this.f22505i0) {
            this.f22518v0.i(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
            return;
        }
        throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean U0(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        boolean z6 = false;
        if (this.f22499c0) {
            return false;
        }
        if (this.f22503g0 && this.f22504h0) {
            r0(menu, menuInflater);
            z6 = true;
        }
        return z6 | this.f22494X.A(menu, menuInflater);
    }

    public android.view.View V() {
        return this.f22507k0;
    }

    void V0(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.f22494X.T0();
        this.f22490T = true;
        this.f22519w0 = new androidx.fragment.app.y(this, n());
        android.view.View viewS0 = s0(layoutInflater, viewGroup, bundle);
        this.f22507k0 = viewS0;
        if (viewS0 == null) {
            if (this.f22519w0.d()) {
                throw new java.lang.IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f22519w0 = null;
        } else {
            this.f22519w0.c();
            androidx.lifecycle.Z.b(this.f22507k0, this.f22519w0);
            androidx.lifecycle.a0.b(this.f22507k0, this.f22519w0);
            p233x2.g.b(this.f22507k0, this.f22519w0);
            this.f22520x0.n(this.f22519w0);
        }
    }

    public androidx.lifecycle.AbstractC2091x W() {
        return this.f22520x0;
    }

    void W0() {
        this.f22494X.B();
        this.f22518v0.i(androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
        this.f22471C = 0;
        this.f22505i0 = false;
        this.f22515s0 = false;
        t0();
        if (this.f22505i0) {
            return;
        }
        throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void X0() {
        this.f22494X.C();
        if (this.f22507k0 != null && this.f22519w0.u().b().g(androidx.lifecycle.AbstractC2079k.b.CREATED)) {
            this.f22519w0.a(androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
        }
        this.f22471C = 1;
        this.f22505i0 = false;
        v0();
        if (this.f22505i0) {
            androidx.loader.app.a.b(this).d();
            this.f22490T = false;
        } else {
            throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void Y() {
        X();
        this.f22516t0 = this.f22478H;
        this.f22478H = java.util.UUID.randomUUID().toString();
        this.f22484N = false;
        this.f22485O = false;
        this.f22487Q = false;
        this.f22488R = false;
        this.f22489S = false;
        this.f22491U = 0;
        this.f22492V = null;
        this.f22494X = new androidx.fragment.app.o();
        this.f22493W = null;
        this.f22496Z = 0;
        this.f22497a0 = 0;
        this.f22498b0 = null;
        this.f22499c0 = false;
        this.f22500d0 = false;
    }

    void Y0() {
        this.f22471C = -1;
        this.f22505i0 = false;
        w0();
        this.f22514r0 = null;
        if (this.f22505i0) {
            if (this.f22494X.D0()) {
                return;
            }
            this.f22494X.B();
            this.f22494X = new androidx.fragment.app.o();
            return;
        }
        throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onDetach()");
    }

    android.view.LayoutInflater Z0(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterX0 = x0(bundle);
        this.f22514r0 = layoutInflaterX0;
        return layoutInflaterX0;
    }

    public final boolean a0() {
        return this.f22493W != null && this.f22484N;
    }

    void a1() {
        onLowMemory();
    }

    public final boolean b0() {
        androidx.fragment.app.n nVar;
        return this.f22499c0 || ((nVar = this.f22492V) != null && nVar.H0(this.f22495Y));
    }

    void b1(boolean z6) {
        B0(z6);
    }

    final boolean c0() {
        return this.f22491U > 0;
    }

    boolean c1(android.view.MenuItem menuItem) {
        if (this.f22499c0) {
            return false;
        }
        if (this.f22503g0 && this.f22504h0 && C0(menuItem)) {
            return true;
        }
        return this.f22494X.H(menuItem);
    }

    public final boolean d0() {
        androidx.fragment.app.n nVar;
        return this.f22504h0 && ((nVar = this.f22492V) == null || nVar.I0(this.f22495Y));
    }

    void d1(android.view.Menu menu) {
        if (this.f22499c0) {
            return;
        }
        if (this.f22503g0 && this.f22504h0) {
            D0(menu);
        }
        this.f22494X.I(menu);
    }

    void e(boolean z6) {
        android.view.ViewGroup viewGroup;
        androidx.fragment.app.n nVar;
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar != null) {
            gVar.f22549t = false;
        }
        if (this.f22507k0 == null || (viewGroup = this.f22506j0) == null || (nVar = this.f22492V) == null) {
            return;
        }
        androidx.fragment.app.A aN = androidx.fragment.app.A.n(viewGroup, nVar);
        aN.p();
        if (z6) {
            this.f22493W.r().post(new androidx.fragment.app.f.d(aN));
        } else {
            aN.g();
        }
        android.os.Handler handler = this.f22511o0;
        if (handler != null) {
            handler.removeCallbacks(this.f22512p0);
            this.f22511o0 = null;
        }
    }

    boolean e0() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return false;
        }
        return gVar.f22549t;
    }

    void e1() {
        this.f22494X.K();
        if (this.f22507k0 != null) {
            this.f22519w0.a(androidx.lifecycle.AbstractC2079k.a.ON_PAUSE);
        }
        this.f22518v0.i(androidx.lifecycle.AbstractC2079k.a.ON_PAUSE);
        this.f22471C = 6;
        this.f22505i0 = false;
        E0();
        if (this.f22505i0) {
            return;
        }
        throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    V1.e f() {
        return new androidx.fragment.app.f.e();
    }

    public final boolean f0() {
        return this.f22485O;
    }

    void f1(boolean z6) {
        F0(z6);
    }

    public void g(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.f22496Z));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.f22497a0));
        printWriter.print(" mTag=");
        printWriter.println(this.f22498b0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f22471C);
        printWriter.print(" mWho=");
        printWriter.print(this.f22478H);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f22491U);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f22484N);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f22485O);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f22487Q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f22488R);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f22499c0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f22500d0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f22504h0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f22503g0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f22501e0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f22509m0);
        if (this.f22492V != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f22492V);
        }
        if (this.f22493W != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f22493W);
        }
        if (this.f22495Y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f22495Y);
        }
        if (this.f22479I != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f22479I);
        }
        if (this.f22473D != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f22473D);
        }
        if (this.f22475E != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f22475E);
        }
        if (this.f22476F != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f22476F);
        }
        androidx.fragment.app.f fVarU = U(false);
        if (fVarU != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fVarU);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f22482L);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(I());
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(v());
        }
        if (y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(y());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(J());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(K());
        }
        if (this.f22506j0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f22506j0);
        }
        if (this.f22507k0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f22507k0);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (t() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f22494X + ":");
        this.f22494X.U(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean g0() {
        androidx.fragment.app.n nVar = this.f22492V;
        if (nVar == null) {
            return false;
        }
        return nVar.L0();
    }

    boolean g1(android.view.Menu menu) {
        boolean z6 = false;
        if (this.f22499c0) {
            return false;
        }
        if (this.f22503g0 && this.f22504h0) {
            G0(menu);
            z6 = true;
        }
        return z6 | this.f22494X.M(menu);
    }

    void h0() {
        this.f22494X.T0();
    }

    void h1() {
        boolean zJ0 = this.f22492V.J0(this);
        java.lang.Boolean bool = this.f22483M;
        if (bool == null || bool.booleanValue() != zJ0) {
            this.f22483M = java.lang.Boolean.valueOf(zJ0);
            H0(zJ0);
            this.f22494X.N();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    androidx.fragment.app.f i(java.lang.String str) {
        return str.equals(this.f22478H) ? this : this.f22494X.g0(str);
    }

    public void i0(android.os.Bundle bundle) {
        this.f22505i0 = true;
    }

    void i1() {
        this.f22494X.T0();
        this.f22494X.Y(true);
        this.f22471C = 7;
        this.f22505i0 = false;
        J0();
        if (!this.f22505i0) {
            throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.C2087t c2087t = this.f22518v0;
        androidx.lifecycle.AbstractC2079k.a aVar = androidx.lifecycle.AbstractC2079k.a.ON_RESUME;
        c2087t.i(aVar);
        if (this.f22507k0 != null) {
            this.f22519w0.a(aVar);
        }
        this.f22494X.O();
    }

    @Override // androidx.lifecycle.InterfaceC2077i
    public androidx.lifecycle.V.c j() {
        android.app.Application application;
        if (this.f22492V == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f22521y0 == null) {
            android.content.Context applicationContext = p1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && androidx.fragment.app.n.E0(3)) {
                java.lang.String str = "Could not find Application instance from Context " + p1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory";
            }
            this.f22521y0 = new androidx.lifecycle.O(application, this, r());
        }
        return this.f22521y0;
    }

    public void j0(int i6, int i10, android.content.Intent intent) {
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i10 + " data: " + intent;
        }
    }

    void j1(android.os.Bundle bundle) {
        K0(bundle);
        this.f22522z0.e(bundle);
        android.os.Bundle bundleG1 = this.f22494X.M0();
        if (bundleG1 != null) {
            bundle.putParcelable("android:support:fragments", bundleG1);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2077i
    public p023c2.a k() {
        android.app.Application application;
        android.content.Context applicationContext = p1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "Could not find Application instance from Context " + p1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory";
        }
        p023c2.d dVar = new p023c2.d();
        if (application != null) {
            dVar.c(androidx.lifecycle.V.a.f22795g, application);
        }
        dVar.c(androidx.lifecycle.L.f22766a, this);
        dVar.c(androidx.lifecycle.L.f22767b, this);
        if (r() != null) {
            dVar.c(androidx.lifecycle.L.f22768c, r());
        }
        return dVar;
    }

    public void k0(android.app.Activity activity) {
        this.f22505i0 = true;
    }

    void k1() {
        this.f22494X.T0();
        this.f22494X.Y(true);
        this.f22471C = 5;
        this.f22505i0 = false;
        L0();
        if (!this.f22505i0) {
            throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.C2087t c2087t = this.f22518v0;
        androidx.lifecycle.AbstractC2079k.a aVar = androidx.lifecycle.AbstractC2079k.a.ON_START;
        c2087t.i(aVar);
        if (this.f22507k0 != null) {
            this.f22519w0.a(aVar);
        }
        this.f22494X.P();
    }

    public final androidx.fragment.app.g l() {
        androidx.fragment.app.k kVar = this.f22493W;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.g) kVar.k();
    }

    public void l0(android.content.Context context) {
        this.f22505i0 = true;
        androidx.fragment.app.k kVar = this.f22493W;
        android.app.Activity activityK = kVar == null ? null : kVar.k();
        if (activityK != null) {
            this.f22505i0 = false;
            k0(activityK);
        }
    }

    void l1() {
        this.f22494X.R();
        if (this.f22507k0 != null) {
            this.f22519w0.a(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
        }
        this.f22518v0.i(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
        this.f22471C = 4;
        this.f22505i0 = false;
        M0();
        if (this.f22505i0) {
            return;
        }
        throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onStop()");
    }

    public boolean m() {
        java.lang.Boolean bool;
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null || (bool = gVar.f22546q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void m0(androidx.fragment.app.f fVar) {
    }

    void m1() {
        N0(this.f22507k0, this.f22473D);
        this.f22494X.S();
    }

    @Override // androidx.lifecycle.Y
    public androidx.lifecycle.X n() {
        if (this.f22492V == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (E() != androidx.lifecycle.AbstractC2079k.b.INITIALIZED.ordinal()) {
            return this.f22492V.z0(this);
        }
        throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public boolean n0(android.view.MenuItem menuItem) {
        return false;
    }

    public boolean o() {
        java.lang.Boolean bool;
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null || (bool = gVar.f22545p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void o0(android.os.Bundle bundle) {
        this.f22505i0 = true;
        r1(bundle);
        if (this.f22494X.K0(1)) {
            return;
        }
        this.f22494X.z();
    }

    public final androidx.fragment.app.g o1() {
        androidx.fragment.app.g gVarL = l();
        if (gVarL != null) {
            return gVarL;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.f22505i0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f22505i0 = true;
    }

    @Override // p233x2.f
    public final p233x2.d p() {
        return this.f22522z0.b();
    }

    public android.view.animation.Animation p0(int i6, boolean z6, int i10) {
        return null;
    }

    public final android.content.Context p1() {
        android.content.Context contextT = t();
        if (contextT != null) {
            return contextT;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    android.view.View q() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        return gVar.f22530a;
    }

    public android.animation.Animator q0(int i6, boolean z6, int i10) {
        return null;
    }

    public final android.view.View q1() {
        android.view.View viewV = V();
        if (viewV != null) {
            return viewV;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final android.os.Bundle r() {
        return this.f22479I;
    }

    public void r0(android.view.Menu menu, android.view.MenuInflater menuInflater) {
    }

    void r1(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f22494X.e1(parcelable);
        this.f22494X.z();
    }

    public final androidx.fragment.app.n s() {
        if (this.f22493W != null) {
            return this.f22494X;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public android.view.View s0(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i6 = this.f22469A0;
        if (i6 != 0) {
            return layoutInflater.inflate(i6, viewGroup, false);
        }
        return null;
    }

    public void startActivityForResult(android.content.Intent intent, int i6) {
        B1(intent, i6, null);
    }

    public android.content.Context t() {
        androidx.fragment.app.k kVar = this.f22493W;
        if (kVar == null) {
            return null;
        }
        return kVar.o();
    }

    public void t0() {
        this.f22505i0 = true;
    }

    final void t1(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseArray = this.f22475E;
        if (sparseArray != null) {
            this.f22507k0.restoreHierarchyState(sparseArray);
            this.f22475E = null;
        }
        if (this.f22507k0 != null) {
            this.f22519w0.e(this.f22476F);
            this.f22476F = null;
        }
        this.f22505i0 = false;
        O0(bundle);
        if (this.f22505i0) {
            if (this.f22507k0 != null) {
                this.f22519w0.a(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
            }
        } else {
            throw new androidx.fragment.app.C("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f22478H);
        if (this.f22496Z != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.f22496Z));
        }
        if (this.f22498b0 != null) {
            sb.append(" tag=");
            sb.append(this.f22498b0);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        return this.f22518v0;
    }

    public void u0() {
    }

    void u1(int i6, int i10, int i11, int i12) {
        if (this.f22510n0 == null && i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        h().f22532c = i6;
        h().f22533d = i10;
        h().f22534e = i11;
        h().f22535f = i12;
    }

    int v() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return 0;
        }
        return gVar.f22532c;
    }

    public void v0() {
        this.f22505i0 = true;
    }

    public void v1(android.os.Bundle bundle) {
        if (this.f22492V != null && g0()) {
            throw new java.lang.IllegalStateException("Fragment already added and state has been saved");
        }
        this.f22479I = bundle;
    }

    public java.lang.Object w() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        return gVar.f22539j;
    }

    public void w0() {
        this.f22505i0 = true;
    }

    void w1(android.view.View view) {
        h().f22548s = view;
    }

    androidx.core.app.r x() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public android.view.LayoutInflater x0(android.os.Bundle bundle) {
        return D(bundle);
    }

    void x1(int i6) {
        if (this.f22510n0 == null && i6 == 0) {
            return;
        }
        h();
        this.f22510n0.f22536g = i6;
    }

    int y() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return 0;
        }
        return gVar.f22533d;
    }

    public void y0(boolean z6) {
    }

    void y1(boolean z6) {
        if (this.f22510n0 == null) {
            return;
        }
        h().f22531b = z6;
    }

    public java.lang.Object z() {
        androidx.fragment.app.f.g gVar = this.f22510n0;
        if (gVar == null) {
            return null;
        }
        return gVar.f22541l;
    }

    public void z0(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.f22505i0 = true;
    }

    void z1(float f6) {
        h().f22547r = f6;
    }
}
