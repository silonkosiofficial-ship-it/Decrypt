package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class V implements androidx.compose.ui.platform.T0, W8.N {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.view.View f20024C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final S0.X f20025D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final W8.N f20026E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f20027F = p071h0.o.a();

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f20028F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f20030H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f20028F = obj;
            this.f20030H |= Integer.MIN_VALUE;
            return androidx.compose.ui.platform.V.this.b(null, this);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.Q0 f20031D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.V f20032E;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.V f20033D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.V v6) {
                super(0);
                this.f20033D = v6;
            }

            public final void a() {
                W8.O.e(this.f20033D.f20026E, null, 1, null);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.platform.Q0 q6, androidx.compose.ui.platform.V v6) {
            super(1);
            this.f20031D = q6;
            this.f20032E = v6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.C0 l(W8.N n6) {
            return new androidx.compose.ui.platform.C0(this.f20031D, new androidx.compose.ui.platform.V.b.a(this.f20032E));
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f20034G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f20035H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f20036I;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.C0 f20038D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.V f20039E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.C0 c6, androidx.compose.ui.platform.V v6) {
                super(1);
                this.f20038D = c6;
                this.f20039E = v6;
            }

            public final void a(java.lang.Throwable th) {
                this.f20038D.d();
                this.f20039E.f20025D.f();
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((java.lang.Throwable) obj);
                return p087i7.M.f46721a;
            }
        }

        c(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f20035H;
            if (i6 == 0) {
                p087i7.x.b(obj);
                androidx.compose.ui.platform.C0 c6 = (androidx.compose.ui.platform.C0) this.f20036I;
                androidx.compose.ui.platform.V v6 = androidx.compose.ui.platform.V.this;
                this.f20036I = c6;
                this.f20034G = v6;
                this.f20035H = 1;
                W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(this), 1);
                c1798n.E();
                v6.f20025D.e();
                c1798n.G(new androidx.compose.ui.platform.V.c.a(c6, v6));
                java.lang.Object objX = c1798n.x();
                if (objX == p137n7.b.g()) {
                    p147o7.h.c(this);
                }
                if (objX == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            throw new p087i7.C6665k();
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(androidx.compose.ui.platform.C0 c6, p127m7.e eVar) {
            return ((androidx.compose.ui.platform.V.c) x(c6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.ui.platform.V.c cVar = androidx.compose.ui.platform.V.this.new c(eVar);
            cVar.f20036I = obj;
            return cVar;
        }
    }

    public V(android.view.View view, S0.X x6, W8.N n6) {
        this.f20024C = view;
        this.f20025D = x6;
        this.f20026E = n6;
    }

    @Override // androidx.compose.ui.platform.T0
    public android.view.View a() {
        return this.f20024C;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.T0
    public java.lang.Object b(androidx.compose.ui.platform.Q0 q6, p127m7.e eVar) {
        androidx.compose.ui.platform.V.a aVar;
        if (eVar instanceof androidx.compose.ui.platform.V.a) {
            aVar = (androidx.compose.ui.platform.V.a) eVar;
            int i6 = aVar.f20030H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f20030H = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new androidx.compose.ui.platform.V.a(eVar);
            }
        } else {
            aVar = new androidx.compose.ui.platform.V.a(eVar);
        }
        java.lang.Object obj = aVar.f20028F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f20030H;
        if (i10 == 0) {
            p087i7.x.b(obj);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f20027F;
            androidx.compose.ui.platform.V.b bVar = new androidx.compose.ui.platform.V.b(q6, this);
            androidx.compose.ui.platform.V.c cVar = new androidx.compose.ui.platform.V.c(null);
            aVar.f20030H = 1;
            if (p071h0.o.d(atomicReference, bVar, cVar, aVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
        }
        throw new p087i7.C6665k();
    }

    public final android.view.inputmethod.InputConnection e(android.view.inputmethod.EditorInfo editorInfo) {
        androidx.compose.ui.platform.C0 c6 = (androidx.compose.ui.platform.C0) p071h0.o.c(this.f20027F);
        if (c6 != null) {
            return c6.c(editorInfo);
        }
        return null;
    }

    public final boolean f() {
        androidx.compose.ui.platform.C0 c6 = (androidx.compose.ui.platform.C0) p071h0.o.c(this.f20027F);
        return c6 != null && c6.e();
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f20026E.getCoroutineContext();
    }
}
