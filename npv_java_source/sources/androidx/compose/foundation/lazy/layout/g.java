package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
final class g extends androidx.compose.ui.d.c implements F0.z0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.a f19396P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private D.E f19397Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p230x.s f19398R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f19399S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f19400T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private K0.i f19401U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p237x7.l f19402V = new androidx.compose.foundation.lazy.layout.g.b();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p237x7.l f19403W;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return java.lang.Float.valueOf(androidx.compose.foundation.lazy.layout.g.this.f19397Q.a() - androidx.compose.foundation.lazy.layout.g.this.f19397Q.c());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer l(java.lang.Object obj) {
            D.InterfaceC0881s interfaceC0881s = (D.InterfaceC0881s) androidx.compose.foundation.lazy.layout.g.this.f19396P.b();
            int iA = interfaceC0881s.a();
            int i6 = 0;
            while (i6 < iA) {
                if (p247y7.AbstractC7350t.b(interfaceC0881s.b(i6), obj)) {
                    return java.lang.Integer.valueOf(i6);
                }
                i6++;
            }
            i6 = -1;
            return java.lang.Integer.valueOf(i6);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return java.lang.Float.valueOf(androidx.compose.foundation.lazy.layout.g.this.f19397Q.b());
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return java.lang.Float.valueOf(androidx.compose.foundation.lazy.layout.g.this.f19397Q.d());
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19409G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.g f19410H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ int f19411I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.layout.g gVar, int i6, p127m7.e eVar) {
                super(2, eVar);
                this.f19410H = gVar;
                this.f19411I = i6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f19409G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    D.E e6 = this.f19410H.f19397Q;
                    int i10 = this.f19411I;
                    this.f19409G = 1;
                    if (e6.f(i10, this) == objG) {
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
                return ((androidx.compose.foundation.lazy.layout.g.e.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new androidx.compose.foundation.lazy.layout.g.e.a(this.f19410H, this.f19411I, eVar);
            }
        }

        e() {
            super(1);
        }

        public final java.lang.Boolean a(int i6) {
            D.InterfaceC0881s interfaceC0881s = (D.InterfaceC0881s) androidx.compose.foundation.lazy.layout.g.this.f19396P.b();
            if (i6 >= 0 && i6 < interfaceC0881s.a()) {
                W8.AbstractC1788i.d(androidx.compose.foundation.lazy.layout.g.this.t1(), null, null, new androidx.compose.foundation.lazy.layout.g.e.a(androidx.compose.foundation.lazy.layout.g.this, i6, null), 3, null);
                return java.lang.Boolean.TRUE;
            }
            throw new java.lang.IllegalArgumentException(("Can't scroll to index " + i6 + ", it is out of bounds [0, " + interfaceC0881s.a() + ')').toString());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    public g(p237x7.a aVar, D.E e6, p230x.s sVar, boolean z6, boolean z10) {
        this.f19396P = aVar;
        this.f19397Q = e6;
        this.f19398R = sVar;
        this.f19399S = z6;
        this.f19400T = z10;
        Y1();
    }

    private final K0.b V1() {
        return this.f19397Q.e();
    }

    private final boolean W1() {
        return this.f19398R == p230x.s.Vertical;
    }

    private final void Y1() {
        this.f19401U = new K0.i(new androidx.compose.foundation.lazy.layout.g.c(), new androidx.compose.foundation.lazy.layout.g.d(), this.f19400T);
        this.f19403W = this.f19399S ? new androidx.compose.foundation.lazy.layout.g.e() : null;
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        K0.u.k0(wVar, true);
        K0.u.r(wVar, this.f19402V);
        if (W1()) {
            K0.i iVar = this.f19401U;
            if (iVar == null) {
                p247y7.AbstractC7350t.p("scrollAxisRange");
                iVar = null;
            }
            K0.u.m0(wVar, iVar);
        } else {
            K0.i iVar2 = this.f19401U;
            if (iVar2 == null) {
                p247y7.AbstractC7350t.p("scrollAxisRange");
                iVar2 = null;
            }
            K0.u.T(wVar, iVar2);
        }
        p237x7.l lVar = this.f19403W;
        if (lVar != null) {
            K0.u.K(wVar, null, lVar, 1, null);
        }
        K0.u.o(wVar, null, new androidx.compose.foundation.lazy.layout.g.a(), 1, null);
        K0.u.M(wVar, V1());
    }

    public final void X1(p237x7.a aVar, D.E e6, p230x.s sVar, boolean z6, boolean z10) {
        this.f19396P = aVar;
        this.f19397Q = e6;
        if (this.f19398R != sVar) {
            this.f19398R = sVar;
            F0.A0.b(this);
        }
        if (this.f19399S == z6 && this.f19400T == z10) {
            return;
        }
        this.f19399S = z6;
        this.f19400T = z10;
        Y1();
        F0.A0.b(this);
    }

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    @Override // F0.z0
    public /* synthetic */ boolean k1() {
        return F0.y0.b(this);
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return false;
    }
}
