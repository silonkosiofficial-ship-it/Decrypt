package androidx.compose.ui.viewinterop;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends android.view.ViewGroup implements androidx.core.view.E, V.InterfaceC1728l, F0.p0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final androidx.compose.ui.viewinterop.c.b f20466c0 = new androidx.compose.ui.viewinterop.c.b(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f20467d0 = 8;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final p237x7.l f20468e0 = androidx.compose.ui.viewinterop.c.a.f20492D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f20469C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p241y0.c f20470D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.view.View f20471E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final F0.o0 f20472F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p237x7.a f20473G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f20474H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p237x7.a f20475I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p237x7.a f20476J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private androidx.compose.ui.d f20477K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private p237x7.l f20478L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Y0.e f20479M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p237x7.l f20480N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private androidx.lifecycle.r f20481O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p233x2.f f20482P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p237x7.a f20483Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final p237x7.a f20484R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p237x7.l f20485S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int[] f20486T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f20487U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f20488V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final androidx.core.view.F f20489W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f20490a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final F0.J f20491b0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.viewinterop.c.a f20492D = new androidx.compose.ui.viewinterop.c.a();

        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(p237x7.a aVar) {
            aVar.b();
        }

        public final void e(androidx.compose.ui.viewinterop.c cVar) {
            android.os.Handler handler = cVar.getHandler();
            final p237x7.a aVar = cVar.f20483Q;
            handler.post(new java.lang.Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.ui.viewinterop.c.a.f(aVar);
                }
            });
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            e((androidx.compose.ui.viewinterop.c) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.c$c, reason: collision with other inner class name */
    static final class C0386c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F0.J f20493D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f20494E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0386c(F0.J j6, androidx.compose.ui.d dVar) {
            super(1);
            this.f20493D = j6;
            this.f20494E = dVar;
        }

        public final void a(androidx.compose.ui.d dVar) {
            this.f20493D.g(dVar.b(this.f20494E));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.d) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F0.J f20495D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(F0.J j6) {
            super(1);
            this.f20495D = j6;
        }

        public final void a(Y0.e eVar) {
            this.f20495D.a(eVar);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((Y0.e) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ F0.J f20497E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(F0.J j6) {
            super(1);
            this.f20497E = j6;
        }

        public final void a(F0.o0 o0Var) {
            androidx.compose.ui.platform.r rVar = o0Var instanceof androidx.compose.ui.platform.r ? (androidx.compose.ui.platform.r) o0Var : null;
            if (rVar != null) {
                rVar.Y(androidx.compose.ui.viewinterop.c.this, this.f20497E);
            }
            android.view.ViewParent parent = androidx.compose.ui.viewinterop.c.this.getView().getParent();
            androidx.compose.ui.viewinterop.c cVar = androidx.compose.ui.viewinterop.c.this;
            if (parent != cVar) {
                cVar.addView(cVar.getView());
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.o0) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {
        f() {
            super(1);
        }

        public final void a(F0.o0 o0Var) {
            androidx.compose.ui.platform.r rVar = o0Var instanceof androidx.compose.ui.platform.r ? (androidx.compose.ui.platform.r) o0Var : null;
            if (rVar != null) {
                rVar.H0(androidx.compose.ui.viewinterop.c.this);
            }
            androidx.compose.ui.viewinterop.c.this.removeAllViewsInLayout();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.o0) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class g implements D0.I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ F0.J f20500b;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final androidx.compose.ui.viewinterop.c.g.a f20501D = new androidx.compose.ui.viewinterop.c.g.a();

            a() {
                super(1);
            }

            public final void a(D0.X.a aVar) {
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.viewinterop.c f20502D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ F0.J f20503E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.viewinterop.c cVar, F0.J j6) {
                super(1);
                this.f20502D = cVar;
                this.f20503E = j6;
            }

            public final void a(D0.X.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f20502D, this.f20503E);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        g(F0.J j6) {
            this.f20500b = j6;
        }

        private final int d(int i6) {
            androidx.compose.ui.viewinterop.c cVar = androidx.compose.ui.viewinterop.c.this;
            android.view.ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            p247y7.AbstractC7350t.c(layoutParams);
            cVar.measure(cVar.u(0, i6, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            return androidx.compose.ui.viewinterop.c.this.getMeasuredHeight();
        }

        private final int f(int i6) {
            androidx.compose.ui.viewinterop.c cVar = androidx.compose.ui.viewinterop.c.this;
            int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            androidx.compose.ui.viewinterop.c cVar2 = androidx.compose.ui.viewinterop.c.this;
            android.view.ViewGroup.LayoutParams layoutParams = cVar2.getLayoutParams();
            p247y7.AbstractC7350t.c(layoutParams);
            cVar.measure(iMakeMeasureSpec, cVar2.u(0, i6, layoutParams.height));
            return androidx.compose.ui.viewinterop.c.this.getMeasuredWidth();
        }

        @Override // D0.I
        public int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return f(i6);
        }

        @Override // D0.I
        public D0.K b(D0.M m6, java.util.List list, long j6) {
            int measuredWidth;
            int measuredHeight;
            p237x7.l bVar;
            if (androidx.compose.ui.viewinterop.c.this.getChildCount() == 0) {
                measuredWidth = Y0.C1859b.n(j6);
                measuredHeight = Y0.C1859b.m(j6);
                bVar = androidx.compose.ui.viewinterop.c.g.a.f20501D;
            } else {
                if (Y0.C1859b.n(j6) != 0) {
                    androidx.compose.ui.viewinterop.c.this.getChildAt(0).setMinimumWidth(Y0.C1859b.n(j6));
                }
                if (Y0.C1859b.m(j6) != 0) {
                    androidx.compose.ui.viewinterop.c.this.getChildAt(0).setMinimumHeight(Y0.C1859b.m(j6));
                }
                androidx.compose.ui.viewinterop.c cVar = androidx.compose.ui.viewinterop.c.this;
                int iN = Y0.C1859b.n(j6);
                int iL = Y0.C1859b.l(j6);
                android.view.ViewGroup.LayoutParams layoutParams = androidx.compose.ui.viewinterop.c.this.getLayoutParams();
                p247y7.AbstractC7350t.c(layoutParams);
                int iU = cVar.u(iN, iL, layoutParams.width);
                androidx.compose.ui.viewinterop.c cVar2 = androidx.compose.ui.viewinterop.c.this;
                int iM = Y0.C1859b.m(j6);
                int iK = Y0.C1859b.k(j6);
                android.view.ViewGroup.LayoutParams layoutParams2 = androidx.compose.ui.viewinterop.c.this.getLayoutParams();
                p247y7.AbstractC7350t.c(layoutParams2);
                cVar.measure(iU, cVar2.u(iM, iK, layoutParams2.height));
                measuredWidth = androidx.compose.ui.viewinterop.c.this.getMeasuredWidth();
                measuredHeight = androidx.compose.ui.viewinterop.c.this.getMeasuredHeight();
                bVar = new androidx.compose.ui.viewinterop.c.g.b(androidx.compose.ui.viewinterop.c.this, this.f20500b);
            }
            return D0.L.b(m6, measuredWidth, measuredHeight, null, bVar, 4, null);
        }

        @Override // D0.I
        public int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return f(i6);
        }

        @Override // D0.I
        public int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return d(i6);
        }

        @Override // D0.I
        public int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
            return d(i6);
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.viewinterop.c.h f20504D = new androidx.compose.ui.viewinterop.c.h();

        h() {
            super(1);
        }

        public final void a(K0.w wVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ F0.J f20506E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f20507F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(F0.J j6, androidx.compose.ui.viewinterop.c cVar) {
            super(1);
            this.f20506E = j6;
            this.f20507F = cVar;
        }

        public final void a(p161q0.g gVar) {
            androidx.compose.ui.viewinterop.c cVar = androidx.compose.ui.viewinterop.c.this;
            F0.J j6 = this.f20506E;
            androidx.compose.ui.viewinterop.c cVar2 = this.f20507F;
            p141o0.InterfaceC6993q0 interfaceC6993q0H = gVar.F0().h();
            if (cVar.getView().getVisibility() != 8) {
                cVar.f20490a0 = true;
                F0.o0 o0VarN0 = j6.n0();
                androidx.compose.ui.platform.r rVar = o0VarN0 instanceof androidx.compose.ui.platform.r ? (androidx.compose.ui.platform.r) o0VarN0 : null;
                if (rVar != null) {
                    rVar.h0(cVar2, p141o0.H.d(interfaceC6993q0H));
                }
                cVar.f20490a0 = false;
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ F0.J f20509E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(F0.J j6) {
            super(1);
            this.f20509E = j6;
        }

        public final void a(D0.InterfaceC0900t interfaceC0900t) {
            androidx.compose.ui.viewinterop.d.f(androidx.compose.ui.viewinterop.c.this, this.f20509E);
            androidx.compose.ui.viewinterop.c.this.f20472F.e(androidx.compose.ui.viewinterop.c.this);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.InterfaceC0900t) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class k extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f20510G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f20511H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f20512I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f20513J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z6, androidx.compose.ui.viewinterop.c cVar, long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f20511H = z6;
            this.f20512I = cVar;
            this.f20513J = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f20510G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                if (this.f20511H) {
                    p241y0.c cVar = this.f20512I.f20470D;
                    long j6 = this.f20513J;
                    long jA = Y0.A.f16198b.a();
                    this.f20510G = 2;
                    if (cVar.a(j6, jA, this) == objG) {
                        return objG;
                    }
                } else {
                    p241y0.c cVar2 = this.f20512I.f20470D;
                    long jA2 = Y0.A.f16198b.a();
                    long j10 = this.f20513J;
                    this.f20510G = 1;
                    if (cVar2.a(jA2, j10, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i6 != 1 && i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.ui.viewinterop.c.k) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new androidx.compose.ui.viewinterop.c.k(this.f20511H, this.f20512I, this.f20513J, eVar);
        }
    }

    static final class l extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f20514G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f20516I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f20516I = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f20514G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p241y0.c cVar = androidx.compose.ui.viewinterop.c.this.f20470D;
                long j6 = this.f20516I;
                this.f20514G = 1;
                if (cVar.c(j6, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.ui.viewinterop.c.l) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.ui.viewinterop.c.this.new l(this.f20516I, eVar);
        }
    }

    static final class m extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.viewinterop.c.m f20517D = new androidx.compose.ui.viewinterop.c.m();

        m() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class n extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.viewinterop.c.n f20518D = new androidx.compose.ui.viewinterop.c.n();

        n() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class o extends p247y7.AbstractC7352v implements p237x7.a {
        o() {
            super(0);
        }

        public final void a() {
            androidx.compose.ui.viewinterop.c.this.getLayoutNode().D0();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class p extends p247y7.AbstractC7352v implements p237x7.a {
        p() {
            super(0);
        }

        public final void a() {
            if (androidx.compose.ui.viewinterop.c.this.f20474H && androidx.compose.ui.viewinterop.c.this.isAttachedToWindow()) {
                android.view.ViewParent parent = androidx.compose.ui.viewinterop.c.this.getView().getParent();
                androidx.compose.ui.viewinterop.c cVar = androidx.compose.ui.viewinterop.c.this;
                if (parent == cVar) {
                    cVar.getSnapshotObserver().i(androidx.compose.ui.viewinterop.c.this, androidx.compose.ui.viewinterop.c.f20468e0, androidx.compose.ui.viewinterop.c.this.getUpdate());
                }
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class q extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.viewinterop.c.q f20521D = new androidx.compose.ui.viewinterop.c.q();

        q() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public c(android.content.Context context, V.AbstractC1744s abstractC1744s, int i6, p241y0.c cVar, android.view.View view, F0.o0 o0Var) {
        super(context);
        this.f20469C = i6;
        this.f20470D = cVar;
        this.f20471E = view;
        this.f20472F = o0Var;
        if (abstractC1744s != null) {
            androidx.compose.ui.platform.O1.i(this, abstractC1744s);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f20473G = androidx.compose.ui.viewinterop.c.q.f20521D;
        this.f20475I = androidx.compose.ui.viewinterop.c.n.f20518D;
        this.f20476J = androidx.compose.ui.viewinterop.c.m.f20517D;
        androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
        this.f20477K = aVar;
        this.f20479M = Y0.g.b(1.0f, 0.0f, 2, null);
        this.f20483Q = new androidx.compose.ui.viewinterop.c.p();
        this.f20484R = new androidx.compose.ui.viewinterop.c.o();
        this.f20486T = new int[2];
        this.f20487U = Integer.MIN_VALUE;
        this.f20488V = Integer.MIN_VALUE;
        this.f20489W = new androidx.core.view.F(this);
        F0.J j6 = new F0.J(false, 0, 3, null);
        j6.C1(this);
        androidx.compose.ui.d dVarA = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.b.b(p251z0.M.a(K0.n.c(androidx.compose.ui.input.nestedscroll.a.a(aVar, androidx.compose.ui.viewinterop.d.f20522a, cVar), true, androidx.compose.ui.viewinterop.c.h.f20504D), this), new androidx.compose.ui.viewinterop.c.i(j6, this)), new androidx.compose.ui.viewinterop.c.j(j6));
        j6.d(i6);
        j6.g(this.f20477K.b(dVarA));
        this.f20478L = new androidx.compose.ui.viewinterop.c.C0386c(j6, dVarA);
        j6.a(this.f20479M);
        this.f20480N = new androidx.compose.ui.viewinterop.c.d(j6);
        j6.G1(new androidx.compose.ui.viewinterop.c.e(j6));
        j6.H1(new androidx.compose.ui.viewinterop.c.f());
        j6.e(new androidx.compose.ui.viewinterop.c.g(j6));
        this.f20491b0 = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F0.q0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            C0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f20472F.getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(p237x7.a aVar) {
        aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int u(int i6, int i10, int i11) {
        if (i11 >= 0 || i6 == i10) {
            return android.view.View.MeasureSpec.makeMeasureSpec(E7.j.k(i11, i6, i10), 1073741824);
        }
        if (i11 != -2 || i10 == Integer.MAX_VALUE) {
            return (i11 != -1 || i10 == Integer.MAX_VALUE) ? android.view.View.MeasureSpec.makeMeasureSpec(0, 0) : android.view.View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    @Override // F0.p0
    public boolean R() {
        return isAttachedToWindow();
    }

    @Override // V.InterfaceC1728l
    public void f() {
        this.f20476J.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f20486T);
        int[] iArr = this.f20486T;
        int i6 = iArr[0];
        region.op(i6, iArr[1], i6 + getWidth(), this.f20486T[1] + getHeight(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Y0.e getDensity() {
        return this.f20479M;
    }

    public final android.view.View getInteropView() {
        return this.f20471E;
    }

    public final F0.J getLayoutNode() {
        return this.f20491b0;
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f20471E.getLayoutParams();
        return layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.r getLifecycleOwner() {
        return this.f20481O;
    }

    public final androidx.compose.ui.d getModifier() {
        return this.f20477K;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f20489W.a();
    }

    public final p237x7.l getOnDensityChanged$ui_release() {
        return this.f20480N;
    }

    public final p237x7.l getOnModifierChanged$ui_release() {
        return this.f20478L;
    }

    public final p237x7.l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f20485S;
    }

    public final p237x7.a getRelease() {
        return this.f20476J;
    }

    public final p237x7.a getReset() {
        return this.f20475I;
    }

    public final p233x2.f getSavedStateRegistryOwner() {
        return this.f20482P;
    }

    public final p237x7.a getUpdate() {
        return this.f20473G;
    }

    public final android.view.View getView() {
        return this.f20471E;
    }

    @Override // V.InterfaceC1728l
    public void i() {
        this.f20475I.b();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        s();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f20471E.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.E
    public void j(android.view.View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long jB = this.f20470D.b(p131n0.h.a(androidx.compose.ui.viewinterop.d.g(i6), androidx.compose.ui.viewinterop.d.g(i10)), p131n0.h.a(androidx.compose.ui.viewinterop.d.g(i11), androidx.compose.ui.viewinterop.d.g(i12)), androidx.compose.ui.viewinterop.d.i(i13));
            iArr[0] = androidx.compose.ui.platform.O0.b(p131n0.g.m(jB));
            iArr[1] = androidx.compose.ui.platform.O0.b(p131n0.g.n(jB));
        }
    }

    @Override // androidx.core.view.D
    public void k(android.view.View view, int i6, int i10, int i11, int i12, int i13) {
        if (isNestedScrollingEnabled()) {
            this.f20470D.b(p131n0.h.a(androidx.compose.ui.viewinterop.d.g(i6), androidx.compose.ui.viewinterop.d.g(i10)), p131n0.h.a(androidx.compose.ui.viewinterop.d.g(i11), androidx.compose.ui.viewinterop.d.g(i12)), androidx.compose.ui.viewinterop.d.i(i13));
        }
    }

    @Override // androidx.core.view.D
    public boolean l(android.view.View view, android.view.View view2, int i6, int i10) {
        return ((i6 & 2) == 0 && (i6 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.D
    public void m(android.view.View view, android.view.View view2, int i6, int i10) {
        this.f20489W.c(view, view2, i6, i10);
    }

    @Override // androidx.core.view.D
    public void n(android.view.View view, int i6) {
        this.f20489W.d(view, i6);
    }

    @Override // androidx.core.view.D
    public void o(android.view.View view, int i6, int i10, int[] iArr, int i11) {
        if (isNestedScrollingEnabled()) {
            long jD = this.f20470D.d(p131n0.h.a(androidx.compose.ui.viewinterop.d.g(i6), androidx.compose.ui.viewinterop.d.g(i10)), androidx.compose.ui.viewinterop.d.i(i11));
            iArr[0] = androidx.compose.ui.platform.O0.b(p131n0.g.m(jD));
            iArr[1] = androidx.compose.ui.platform.O0.b(p131n0.g.n(jD));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20483Q.b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        this.f20471E.layout(0, 0, i11 - i6, i12 - i10);
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        if (this.f20471E.getParent() != this) {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i6), android.view.View.MeasureSpec.getSize(i10));
            return;
        }
        if (this.f20471E.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f20471E.measure(i6, i10);
        setMeasuredDimension(this.f20471E.getMeasuredWidth(), this.f20471E.getMeasuredHeight());
        this.f20487U = i6;
        this.f20488V = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f6, float f10, boolean z6) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        W8.AbstractC1788i.d(this.f20470D.e(), null, null, new androidx.compose.ui.viewinterop.c.k(z6, this, Y0.B.a(androidx.compose.ui.viewinterop.d.h(f6), androidx.compose.ui.viewinterop.d.h(f10)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f6, float f10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        W8.AbstractC1788i.d(this.f20470D.e(), null, null, new androidx.compose.ui.viewinterop.c.l(Y0.B.a(androidx.compose.ui.viewinterop.d.h(f6), androidx.compose.ui.viewinterop.d.h(f10)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
    }

    @Override // V.InterfaceC1728l
    public void p() {
        if (this.f20471E.getParent() != this) {
            addView(this.f20471E);
        } else {
            this.f20475I.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        p237x7.l lVar = this.f20485S;
        if (lVar != null) {
            lVar.l(java.lang.Boolean.valueOf(z6));
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    public final void s() {
        if (!this.f20490a0) {
            this.f20491b0.D0();
            return;
        }
        android.view.View view = this.f20471E;
        final p237x7.a aVar = this.f20484R;
        view.postOnAnimation(new java.lang.Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.viewinterop.c.t(aVar);
            }
        });
    }

    public final void setDensity(Y0.e eVar) {
        if (eVar != this.f20479M) {
            this.f20479M = eVar;
            p237x7.l lVar = this.f20480N;
            if (lVar != null) {
                lVar.l(eVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.r rVar) {
        if (rVar != this.f20481O) {
            this.f20481O = rVar;
            androidx.lifecycle.Z.b(this, rVar);
        }
    }

    public final void setModifier(androidx.compose.ui.d dVar) {
        if (dVar != this.f20477K) {
            this.f20477K = dVar;
            p237x7.l lVar = this.f20478L;
            if (lVar != null) {
                lVar.l(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(p237x7.l lVar) {
        this.f20480N = lVar;
    }

    public final void setOnModifierChanged$ui_release(p237x7.l lVar) {
        this.f20478L = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(p237x7.l lVar) {
        this.f20485S = lVar;
    }

    protected final void setRelease(p237x7.a aVar) {
        this.f20476J = aVar;
    }

    protected final void setReset(p237x7.a aVar) {
        this.f20475I = aVar;
    }

    public final void setSavedStateRegistryOwner(p233x2.f fVar) {
        if (fVar != this.f20482P) {
            this.f20482P = fVar;
            p233x2.g.b(this, fVar);
        }
    }

    protected final void setUpdate(p237x7.a aVar) {
        this.f20473G = aVar;
        this.f20474H = true;
        this.f20483Q.b();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void v() {
        int i6;
        int i10 = this.f20487U;
        if (i10 == Integer.MIN_VALUE || (i6 = this.f20488V) == Integer.MIN_VALUE) {
            return;
        }
        measure(i10, i6);
    }
}
