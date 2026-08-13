package androidx.compose.foundation.relocation;

/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.compose.ui.d.c implements E.a, F0.C, F0.E0 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final androidx.compose.foundation.relocation.f.a f19459S = new androidx.compose.foundation.relocation.f.a(null);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f19460T = 8;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private E.c f19461P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f19462Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f19463R;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19464G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19465H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ D0.InterfaceC0900t f19467J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.a f19468K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p237x7.a f19469L;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19470G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.relocation.f f19471H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ D0.InterfaceC0900t f19472I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p237x7.a f19473J;

            /* JADX INFO: renamed from: androidx.compose.foundation.relocation.f$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0371a extends p247y7.C7348q implements p237x7.a {

                /* JADX INFO: renamed from: L, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.relocation.f f19474L;

                /* JADX INFO: renamed from: M, reason: collision with root package name */
                final /* synthetic */ D0.InterfaceC0900t f19475M;

                /* JADX INFO: renamed from: N, reason: collision with root package name */
                final /* synthetic */ p237x7.a f19476N;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0371a(androidx.compose.foundation.relocation.f fVar, D0.InterfaceC0900t interfaceC0900t, p237x7.a aVar) {
                    super(0, p247y7.AbstractC7350t.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f19474L = fVar;
                    this.f19475M = interfaceC0900t;
                    this.f19476N = aVar;
                }

                @Override // p237x7.a
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final p131n0.i b() {
                    return androidx.compose.foundation.relocation.f.U1(this.f19474L, this.f19475M, this.f19476N);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.relocation.f fVar, D0.InterfaceC0900t interfaceC0900t, p237x7.a aVar, p127m7.e eVar) {
                super(2, eVar);
                this.f19471H = fVar;
                this.f19472I = interfaceC0900t;
                this.f19473J = aVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f19470G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    E.c cVarV1 = this.f19471H.V1();
                    androidx.compose.foundation.relocation.f.b.a.C0371a c0371a = new androidx.compose.foundation.relocation.f.b.a.C0371a(this.f19471H, this.f19472I, this.f19473J);
                    this.f19470G = 1;
                    if (cVarV1.Z(c0371a, this) == objG) {
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
                return ((androidx.compose.foundation.relocation.f.b.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new androidx.compose.foundation.relocation.f.b.a(this.f19471H, this.f19472I, this.f19473J, eVar);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.f$b$b, reason: collision with other inner class name */
        static final class C0372b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19477G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.relocation.f f19478H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p237x7.a f19479I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0372b(androidx.compose.foundation.relocation.f fVar, p237x7.a aVar, p127m7.e eVar) {
                super(2, eVar);
                this.f19478H = fVar;
                this.f19479I = aVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                E.a aVarC;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f19477G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    if (this.f19478H.A1() && (aVarC = androidx.compose.foundation.relocation.b.c(this.f19478H)) != null) {
                        D0.InterfaceC0900t interfaceC0900tK = F0.AbstractC0925k.k(this.f19478H);
                        p237x7.a aVar = this.f19479I;
                        this.f19477G = 1;
                        if (aVarC.j1(interfaceC0900tK, aVar, this) == objG) {
                            return objG;
                        }
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
                return ((androidx.compose.foundation.relocation.f.b.C0372b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new androidx.compose.foundation.relocation.f.b.C0372b(this.f19478H, this.f19479I, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D0.InterfaceC0900t interfaceC0900t, p237x7.a aVar, p237x7.a aVar2, p127m7.e eVar) {
            super(2, eVar);
            this.f19467J = interfaceC0900t;
            this.f19468K = aVar;
            this.f19469L = aVar2;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f19464G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            W8.N n6 = (W8.N) this.f19465H;
            W8.AbstractC1788i.d(n6, null, null, new androidx.compose.foundation.relocation.f.b.a(androidx.compose.foundation.relocation.f.this, this.f19467J, this.f19468K, null), 3, null);
            return W8.AbstractC1788i.d(n6, null, null, new androidx.compose.foundation.relocation.f.b.C0372b(androidx.compose.foundation.relocation.f.this, this.f19469L, null), 3, null);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.foundation.relocation.f.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.relocation.f.b bVar = androidx.compose.foundation.relocation.f.this.new b(this.f19467J, this.f19468K, this.f19469L, eVar);
            bVar.f19465H = obj;
            return bVar;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.InterfaceC0900t f19481E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.a f19482F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D0.InterfaceC0900t interfaceC0900t, p237x7.a aVar) {
            super(0);
            this.f19481E = interfaceC0900t;
            this.f19482F = aVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p131n0.i b() {
            p131n0.i iVarU1 = androidx.compose.foundation.relocation.f.U1(androidx.compose.foundation.relocation.f.this, this.f19481E, this.f19482F);
            if (iVarU1 != null) {
                return androidx.compose.foundation.relocation.f.this.V1().T(iVarU1);
            }
            return null;
        }
    }

    public f(E.c cVar) {
        this.f19461P = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p131n0.i U1(androidx.compose.foundation.relocation.f fVar, D0.InterfaceC0900t interfaceC0900t, p237x7.a aVar) {
        p131n0.i iVar;
        if (!fVar.A1() || !fVar.f19463R) {
            return null;
        }
        D0.InterfaceC0900t interfaceC0900tK = F0.AbstractC0925k.k(fVar);
        if (!interfaceC0900t.K()) {
            interfaceC0900t = null;
        }
        if (interfaceC0900t == null || (iVar = (p131n0.i) aVar.b()) == null) {
            return null;
        }
        return androidx.compose.foundation.relocation.d.c(interfaceC0900tK, interfaceC0900t, iVar);
    }

    @Override // F0.E0
    public java.lang.Object K() {
        return f19459S;
    }

    @Override // F0.C
    public /* synthetic */ void M(long j6) {
        F0.B.b(this, j6);
    }

    public final E.c V1() {
        return this.f19461P;
    }

    @Override // E.a
    public java.lang.Object j1(D0.InterfaceC0900t interfaceC0900t, p237x7.a aVar, p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new androidx.compose.foundation.relocation.f.b(interfaceC0900t, aVar, new androidx.compose.foundation.relocation.f.c(interfaceC0900t, aVar), null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }

    @Override // F0.C
    public void m1(D0.InterfaceC0900t interfaceC0900t) {
        this.f19463R = true;
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f19462Q;
    }
}
