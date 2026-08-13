package A;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static boolean f26A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final A.T.a f27x = new A.T.a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f28y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final java.util.WeakHashMap f29z = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A.C0767a f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A.C0767a f31b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A.C0767a f32c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A.C0767a f33d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A.C0767a f34e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A.C0767a f35f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A.C0767a f36g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A.C0767a f37h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A.C0767a f38i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final A.Q f39j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final A.S f40k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final A.S f41l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final A.S f42m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final A.Q f43n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final A.Q f44o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final A.Q f45p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final A.Q f46q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final A.Q f47r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final A.Q f48s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final A.Q f49t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f50u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f51v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final A.RunnableC0785t f52w;

    public static final class a {

        /* JADX INFO: renamed from: A.T$a$a, reason: collision with other inner class name */
        static final class C0000a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ A.T f53D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ android.view.View f54E;

            /* JADX INFO: renamed from: A.T$a$a$a, reason: collision with other inner class name */
            public static final class C0001a implements V.M {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ A.T f55a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ android.view.View f56b;

                public C0001a(A.T t6, android.view.View view) {
                    this.f55a = t6;
                    this.f56b = view;
                }

                @Override // V.M
                public void e() {
                    this.f55a.b(this.f56b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0000a(A.T t6, android.view.View view) {
                super(1);
                this.f53D = t6;
                this.f54E = view;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final V.M l(V.N n6) {
                this.f53D.e(this.f54E);
                return new A.T.a.C0000a.C0001a(this.f53D, this.f54E);
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final A.T d(android.view.View view) {
            A.T t6;
            synchronized (A.T.f29z) {
                try {
                    java.util.WeakHashMap weakHashMap = A.T.f29z;
                    java.lang.Object obj = weakHashMap.get(view);
                    java.lang.Object obj2 = obj;
                    if (obj == null) {
                        A.T t10 = new A.T(null, view, false ? 1 : 0);
                        weakHashMap.put(view, t10);
                        obj2 = t10;
                    }
                    t6 = (A.T) obj2;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return t6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final A.C0767a e(androidx.core.view.C2038y0 c2038y0, int i6, java.lang.String str) {
            A.C0767a c0767a = new A.C0767a(i6, str);
            if (c2038y0 != null) {
                c0767a.h(c2038y0, i6);
            }
            return c0767a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final A.Q f(androidx.core.view.C2038y0 c2038y0, int i6, java.lang.String str) {
            androidx.core.graphics.f fVarG;
            if (c2038y0 == null || (fVarG = c2038y0.g(i6)) == null) {
                fVarG = androidx.core.graphics.f.f21549e;
            }
            return A.X.a(fVarG, str);
        }

        public final A.T c(V.InterfaceC1734n interfaceC1734n, int i6) {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1366542614, i6, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            android.view.View view = (android.view.View) interfaceC1734n.n(androidx.compose.ui.platform.T.i());
            A.T tD = d(view);
            boolean zL = interfaceC1734n.l(tD) | interfaceC1734n.l(view);
            java.lang.Object objG = interfaceC1734n.g();
            if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new A.T.a.C0000a(tD, view);
                interfaceC1734n.K(objG);
            }
            V.Q.b(tD, (p237x7.l) objG, interfaceC1734n, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            return tD;
        }
    }

    private T(androidx.core.view.C2038y0 c2038y0, android.view.View view) {
        androidx.core.view.r rVarE;
        androidx.core.graphics.f fVarE;
        A.T.a aVar = f27x;
        this.f30a = aVar.e(c2038y0, androidx.core.view.C2038y0.m.a(), "captionBar");
        A.C0767a c0767aE = aVar.e(c2038y0, androidx.core.view.C2038y0.m.b(), "displayCutout");
        this.f31b = c0767aE;
        A.C0767a c0767aE2 = aVar.e(c2038y0, androidx.core.view.C2038y0.m.c(), "ime");
        this.f32c = c0767aE2;
        A.C0767a c0767aE3 = aVar.e(c2038y0, androidx.core.view.C2038y0.m.e(), "mandatorySystemGestures");
        this.f33d = c0767aE3;
        this.f34e = aVar.e(c2038y0, androidx.core.view.C2038y0.m.f(), "navigationBars");
        this.f35f = aVar.e(c2038y0, androidx.core.view.C2038y0.m.g(), "statusBars");
        A.C0767a c0767aE4 = aVar.e(c2038y0, androidx.core.view.C2038y0.m.h(), "systemBars");
        this.f36g = c0767aE4;
        A.C0767a c0767aE5 = aVar.e(c2038y0, androidx.core.view.C2038y0.m.i(), "systemGestures");
        this.f37h = c0767aE5;
        A.C0767a c0767aE6 = aVar.e(c2038y0, androidx.core.view.C2038y0.m.j(), "tappableElement");
        this.f38i = c0767aE6;
        A.Q qA = A.X.a((c2038y0 == null || (rVarE = c2038y0.e()) == null || (fVarE = rVarE.e()) == null) ? androidx.core.graphics.f.f21549e : fVarE, "waterfall");
        this.f39j = qA;
        A.S sE = A.U.e(A.U.e(c0767aE4, c0767aE2), c0767aE);
        this.f40k = sE;
        A.S sE2 = A.U.e(A.U.e(A.U.e(c0767aE6, c0767aE3), c0767aE5), qA);
        this.f41l = sE2;
        this.f42m = A.U.e(sE, sE2);
        this.f43n = aVar.f(c2038y0, androidx.core.view.C2038y0.m.a(), "captionBarIgnoringVisibility");
        this.f44o = aVar.f(c2038y0, androidx.core.view.C2038y0.m.f(), "navigationBarsIgnoringVisibility");
        this.f45p = aVar.f(c2038y0, androidx.core.view.C2038y0.m.g(), "statusBarsIgnoringVisibility");
        this.f46q = aVar.f(c2038y0, androidx.core.view.C2038y0.m.h(), "systemBarsIgnoringVisibility");
        this.f47r = aVar.f(c2038y0, androidx.core.view.C2038y0.m.j(), "tappableElementIgnoringVisibility");
        this.f48s = aVar.f(c2038y0, androidx.core.view.C2038y0.m.c(), "imeAnimationTarget");
        this.f49t = aVar.f(c2038y0, androidx.core.view.C2038y0.m.c(), "imeAnimationSource");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.Object tag = view2 != null ? view2.getTag(p071h0.l.f45813I) : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        this.f50u = bool != null ? bool.booleanValue() : true;
        this.f52w = new A.RunnableC0785t(this);
    }

    public /* synthetic */ T(androidx.core.view.C2038y0 c2038y0, android.view.View view, p247y7.AbstractC7342k abstractC7342k) {
        this(c2038y0, view);
    }

    public static /* synthetic */ void g(A.T t6, androidx.core.view.C2038y0 c2038y0, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        t6.f(c2038y0, i6);
    }

    public final void b(android.view.View view) {
        int i6 = this.f51v - 1;
        this.f51v = i6;
        if (i6 == 0) {
            androidx.core.view.X.A0(view, null);
            androidx.core.view.X.G0(view, null);
            view.removeOnAttachStateChangeListener(this.f52w);
        }
    }

    public final boolean c() {
        return this.f50u;
    }

    public final A.C0767a d() {
        return this.f36g;
    }

    public final void e(android.view.View view) {
        if (this.f51v == 0) {
            androidx.core.view.X.A0(view, this.f52w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f52w);
            androidx.core.view.X.G0(view, this.f52w);
        }
        this.f51v++;
    }

    public final void f(androidx.core.view.C2038y0 c2038y0, int i6) {
        if (f26A) {
            android.view.WindowInsets windowInsetsV = c2038y0.v();
            p247y7.AbstractC7350t.c(windowInsetsV);
            c2038y0 = androidx.core.view.C2038y0.w(windowInsetsV);
        }
        this.f30a.h(c2038y0, i6);
        this.f32c.h(c2038y0, i6);
        this.f31b.h(c2038y0, i6);
        this.f34e.h(c2038y0, i6);
        this.f35f.h(c2038y0, i6);
        this.f36g.h(c2038y0, i6);
        this.f37h.h(c2038y0, i6);
        this.f38i.h(c2038y0, i6);
        this.f33d.h(c2038y0, i6);
        if (i6 == 0) {
            this.f43n.f(A.X.c(c2038y0.g(androidx.core.view.C2038y0.m.a())));
            this.f44o.f(A.X.c(c2038y0.g(androidx.core.view.C2038y0.m.f())));
            this.f45p.f(A.X.c(c2038y0.g(androidx.core.view.C2038y0.m.g())));
            this.f46q.f(A.X.c(c2038y0.g(androidx.core.view.C2038y0.m.h())));
            this.f47r.f(A.X.c(c2038y0.g(androidx.core.view.C2038y0.m.j())));
            androidx.core.view.r rVarE = c2038y0.e();
            if (rVarE != null) {
                this.f39j.f(A.X.c(rVarE.e()));
            }
        }
        p051f0.k.f44821e.n();
    }

    public final void h(androidx.core.view.C2038y0 c2038y0) {
        this.f49t.f(A.X.c(c2038y0.f(androidx.core.view.C2038y0.m.c())));
    }

    public final void i(androidx.core.view.C2038y0 c2038y0) {
        this.f48s.f(A.X.c(c2038y0.f(androidx.core.view.C2038y0.m.c())));
    }
}
