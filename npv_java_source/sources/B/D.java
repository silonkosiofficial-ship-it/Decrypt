package B;

/* JADX INFO: loaded from: classes.dex */
public final class D implements p230x.A {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final B.D.c f290y = new B.D.c(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final p041e0.j f291z = p041e0.a.a(B.D.a.f316D, B.D.b.f317D);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B.x f292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B.s f294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B.B f295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B.f f296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V.InterfaceC1753w0 f297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p250z.l f298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p230x.A f300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private D0.Z f303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D0.a0 f304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final D.C0865b f305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator f306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final D.C0873j f307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final B.v f309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final D.D f310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final V.InterfaceC1753w0 f311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final V.InterfaceC1753w0 f312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final V.InterfaceC1753w0 f313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final V.InterfaceC1753w0 f314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p200u.C7179l f315x;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final B.D.a f316D = new B.D.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List u(p041e0.l lVar, B.D d6) {
            return p097j7.AbstractC6879v.p(java.lang.Integer.valueOf(d6.r()), java.lang.Integer.valueOf(d6.s()));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final B.D.b f317D = new B.D.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B.D l(java.util.List list) {
            return new B.D(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a() {
            return B.D.f291z;
        }
    }

    public static final class d implements B.v {
        d() {
        }

        @Override // B.v
        public androidx.compose.foundation.lazy.layout.d.b a(int i6) {
            f0.k.a aVar = p051f0.k.f44821e;
            B.D d6 = B.D.this;
            p051f0.k kVarD = aVar.d();
            p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
            p051f0.k kVarF = aVar.f(kVarD);
            try {
                return B.D.this.C().e(i6, ((B.s) d6.f297f.getValue()).o());
            } finally {
                aVar.m(kVarD, kVarF, lVarH);
            }
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f320E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i6) {
            super(1);
            this.f320E = i6;
        }

        public final void a(D.K k6) {
            B.x xVar = B.D.this.f292a;
            int i6 = this.f320E;
            f0.k.a aVar = p051f0.k.f44821e;
            p051f0.k kVarD = aVar.d();
            aVar.m(kVarD, aVar.f(kVarD), kVarD != null ? kVarD.h() : null);
            xVar.a(k6, i6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D.K) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class f implements D0.a0 {
        f() {
        }

        @Override // D0.a0
        public void a(D0.Z z6) {
            B.D.this.f303l = z6;
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
            return p071h0.f.a(this, dVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
            return p071h0.g.b(this, obj, pVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ boolean d(p237x7.l lVar) {
            return p071h0.g.a(this, lVar);
        }
    }

    static final class g extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f322F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f323G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f324H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f325I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f327K;

        g(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f325I = obj;
            this.f327K |= Integer.MIN_VALUE;
            return B.D.this.d(null, null, this);
        }
    }

    static final class h extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f328G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f330I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f331J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i6, int i10, p127m7.e eVar) {
            super(2, eVar);
            this.f330I = i6;
            this.f331J = i10;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f328G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            B.D.this.N(this.f330I, this.f331J, true);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p230x.w wVar, p127m7.e eVar) {
            return ((B.D.h) x(wVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return B.D.this.new h(this.f330I, this.f331J, eVar);
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {
        i() {
            super(1);
        }

        public final java.lang.Float a(float f6) {
            return java.lang.Float.valueOf(-B.D.this.I(-f6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).floatValue());
        }
    }

    static final class j extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f333G;

        j(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f333G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7179l c7179l = B.D.this.f315x;
                java.lang.Float fB = p147o7.b.b(0.0f);
                p200u.C7180l0 c7180l0J = p200u.AbstractC7177k.j(0.0f, 400.0f, p147o7.b.b(0.5f), 1, null);
                this.f333G = 1;
                if (p200u.AbstractC7190q0.j(c7179l, fB, c7180l0J, true, null, this, 8, null) == objG) {
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
            return ((B.D.j) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return B.D.this.new j(eVar);
        }
    }

    static final class k extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f335G;

        k(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f335G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7179l c7179l = B.D.this.f315x;
                java.lang.Float fB = p147o7.b.b(0.0f);
                p200u.C7180l0 c7180l0J = p200u.AbstractC7177k.j(0.0f, 400.0f, p147o7.b.b(0.5f), 1, null);
                this.f335G = 1;
                if (p200u.AbstractC7190q0.j(c7179l, fB, c7180l0J, true, null, this, 8, null) == objG) {
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
            return ((B.D.k) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return B.D.this.new k(eVar);
        }
    }

    public D(int i6, int i10) {
        this(i6, i10, B.y.b(0, 1, null));
    }

    public D(int i6, int i10, B.x xVar) {
        this.f292a = xVar;
        B.B b6 = new B.B(i6, i10);
        this.f295d = b6;
        this.f296e = new B.f(this);
        this.f297f = V.v1.h(B.E.f338b, V.v1.j());
        this.f298g = p250z.k.a();
        this.f300i = p230x.B.a(new B.D.i());
        this.f302k = true;
        this.f304m = new B.D.f();
        this.f305n = new D.C0865b();
        this.f306o = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator();
        this.f307p = new D.C0873j();
        this.f308q = new androidx.compose.foundation.lazy.layout.d(xVar.b(), new B.D.e(i6));
        this.f309r = new B.D.d();
        this.f310s = new D.D();
        b6.b();
        this.f311t = D.L.c(null, 1, null);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f312u = V.A1.d(bool, null, 2, null);
        this.f313v = V.A1.d(bool, null, 2, null);
        this.f314w = D.L.c(null, 1, null);
        p200u.x0 x0VarI = p200u.z0.i(p247y7.C7344m.f57303a);
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        this.f315x = p200u.AbstractC7181m.b(x0VarI, fValueOf, fValueOf, (56 & 8) != 0 ? Long.MIN_VALUE : 0L, (56 & 16) != 0 ? Long.MIN_VALUE : 0L, (56 & 32) != 0 ? false : false);
    }

    private final void H(float f6, B.q qVar) {
        if (this.f302k) {
            this.f292a.d(this.f309r, f6, qVar);
        }
    }

    public static /* synthetic */ java.lang.Object K(B.D d6, int i6, int i10, p127m7.e eVar, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return d6.J(i6, i10, eVar);
    }

    private void L(boolean z6) {
        this.f313v.setValue(java.lang.Boolean.valueOf(z6));
    }

    private void M(boolean z6) {
        this.f312u.setValue(java.lang.Boolean.valueOf(z6));
    }

    private final void O(float f6, Y0.e eVar, W8.N n6) {
        if (f6 <= eVar.B0(B.E.f337a)) {
            return;
        }
        f0.k.a aVar = p051f0.k.f44821e;
        p051f0.k kVarD = aVar.d();
        p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
        p051f0.k kVarF = aVar.f(kVarD);
        try {
            float fFloatValue = ((java.lang.Number) this.f315x.getValue()).floatValue();
            if (this.f315x.r()) {
                this.f315x = p200u.AbstractC7181m.g(this.f315x, fFloatValue - f6, 0.0f, 0L, 0L, false, 30, null);
                W8.AbstractC1788i.d(n6, null, null, new B.D.j(null), 3, null);
            } else {
                this.f315x = new p200u.C7179l(p200u.z0.i(p247y7.C7344m.f57303a), java.lang.Float.valueOf(-f6), null, 0L, 0L, false, 60, null);
                W8.AbstractC1788i.d(n6, null, null, new B.D.k(null), 3, null);
            }
        } finally {
            aVar.m(kVarD, kVarF, lVarH);
        }
    }

    public static /* synthetic */ java.lang.Object l(B.D d6, int i6, int i10, p127m7.e eVar, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return d6.k(i6, i10, eVar);
    }

    public static /* synthetic */ void n(B.D d6, B.s sVar, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z10 = false;
        }
        d6.m(sVar, z6, z10);
    }

    public final V.InterfaceC1753w0 A() {
        return this.f314w;
    }

    public final B.s B() {
        return this.f294c;
    }

    public final androidx.compose.foundation.lazy.layout.d C() {
        return this.f308q;
    }

    public final D0.Z D() {
        return this.f303l;
    }

    public final D0.a0 E() {
        return this.f304m;
    }

    public final float F() {
        return ((java.lang.Number) this.f315x.getValue()).floatValue();
    }

    public final float G() {
        return this.f299h;
    }

    public final float I(float f6) {
        float f10;
        B.q qVarW;
        if ((f6 < 0.0f && !c()) || (f6 > 0.0f && !b())) {
            return 0.0f;
        }
        if (java.lang.Math.abs(this.f299h) > 0.5f) {
            throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + this.f299h).toString());
        }
        float f11 = this.f299h + f6;
        this.f299h = f11;
        if (java.lang.Math.abs(f11) > 0.5f) {
            B.s sVar = (B.s) this.f297f.getValue();
            float f12 = this.f299h;
            int iRound = java.lang.Math.round(f12);
            B.s sVar2 = this.f294c;
            boolean zV = sVar.v(iRound, !this.f293b);
            if (zV && sVar2 != null) {
                zV = sVar2.v(iRound, true);
            }
            if (zV) {
                m(sVar, this.f293b, true);
                D.L.d(this.f314w);
                f10 = f12 - this.f299h;
                qVarW = sVar;
            } else {
                D0.Z z6 = this.f303l;
                if (z6 != null) {
                    z6.j();
                }
                f10 = f12 - this.f299h;
                qVarW = w();
            }
            H(f10, qVarW);
        }
        if (java.lang.Math.abs(this.f299h) <= 0.5f) {
            return f6;
        }
        float f13 = f6 - this.f299h;
        this.f299h = 0.0f;
        return f13;
    }

    public final java.lang.Object J(int i6, int i10, p127m7.e eVar) {
        java.lang.Object objC = p230x.z.c(this, null, new B.D.h(i6, i10, null), eVar, 1, null);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }

    public final void N(int i6, int i10, boolean z6) {
        if (this.f295d.a() != i6 || this.f295d.c() != i10) {
            this.f306o.n();
        }
        this.f295d.d(i6, i10);
        if (!z6) {
            D.L.d(this.f311t);
            return;
        }
        D0.Z z10 = this.f303l;
        if (z10 != null) {
            z10.j();
        }
    }

    public final int P(B.m mVar, int i6) {
        return this.f295d.j(mVar, i6);
    }

    @Override // p230x.A
    public boolean a() {
        return this.f300i.a();
    }

    @Override // p230x.A
    public boolean b() {
        return ((java.lang.Boolean) this.f313v.getValue()).booleanValue();
    }

    @Override // p230x.A
    public boolean c() {
        return ((java.lang.Boolean) this.f312u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p230x.A
    public java.lang.Object d(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
        B.D.g gVar;
        B.D d6;
        if (eVar instanceof B.D.g) {
            gVar = (B.D.g) eVar;
            int i6 = gVar.f327K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.f327K = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new B.D.g(eVar);
            }
        } else {
            gVar = new B.D.g(eVar);
        }
        java.lang.Object obj = gVar.f325I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = gVar.f327K;
        if (i10 != 0) {
            if (i10 == 1) {
                pVar = (p237x7.p) gVar.f324H;
                l6 = (p210v.L) gVar.f323G;
                d6 = (B.D) gVar.f322F;
                p087i7.x.b(obj);
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }
        p087i7.x.b(obj);
        D.C0865b c0865b = this.f305n;
        gVar.f322F = this;
        gVar.f323G = l6;
        gVar.f324H = pVar;
        gVar.f327K = 1;
        if (c0865b.g(gVar) == objG) {
            return objG;
        }
        d6 = this;
        p230x.A a6 = d6.f300i;
        gVar.f322F = null;
        gVar.f323G = null;
        gVar.f324H = null;
        gVar.f327K = 2;
        if (a6.d(l6, pVar, gVar) == objG) {
            return objG;
        }
        return p087i7.M.f46721a;
    }

    @Override // p230x.A
    public float e(float f6) {
        return this.f300i.e(f6);
    }

    public final java.lang.Object k(int i6, int i10, p127m7.e eVar) {
        java.lang.Object objD = D.AbstractC0870g.d(this.f296e, i6, i10, 100, q(), eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    public final void m(B.s sVar, boolean z6, boolean z10) {
        if (!z6 && this.f293b) {
            this.f294c = sVar;
            return;
        }
        if (z6) {
            this.f293b = true;
        }
        L(sVar.m());
        M(sVar.n());
        this.f299h -= sVar.p();
        this.f297f.setValue(sVar);
        if (z10) {
            this.f295d.i(sVar.t());
        } else {
            this.f295d.h(sVar);
            if (this.f302k) {
                this.f292a.c(this.f309r, sVar);
            }
        }
        if (z6) {
            O(sVar.u(), sVar.r(), sVar.q());
        }
        this.f301j++;
    }

    public final D.C0865b o() {
        return this.f305n;
    }

    public final D.C0873j p() {
        return this.f307p;
    }

    public final Y0.e q() {
        return ((B.s) this.f297f.getValue()).r();
    }

    public final int r() {
        return this.f295d.a();
    }

    public final int s() {
        return this.f295d.c();
    }

    public final boolean t() {
        return this.f293b;
    }

    public final p250z.l u() {
        return this.f298g;
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator v() {
        return this.f306o;
    }

    public final B.q w() {
        return (B.q) this.f297f.getValue();
    }

    public final V.InterfaceC1753w0 x() {
        return this.f311t;
    }

    public final E7.i y() {
        return (E7.i) this.f295d.b().getValue();
    }

    public final D.D z() {
        return this.f310s;
    }
}
