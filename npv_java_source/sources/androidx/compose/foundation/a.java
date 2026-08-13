package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends F0.AbstractC0927m implements F0.v0, p231x0.e, p121m0.b, F0.z0, F0.E0 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final androidx.compose.foundation.a.C0355a f18859j0 = new androidx.compose.foundation.a.C0355a(null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f18860k0 = 8;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p250z.l f18861R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p210v.I f18862S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private java.lang.String f18863T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private K0.h f18864U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f18865V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p237x7.a f18866W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final boolean f18867X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final p210v.C7229x f18868Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final p210v.C7231z f18869Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p251z0.W f18870a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private F0.InterfaceC0924j f18871b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private z.n.b f18872c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private p250z.g f18873d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final java.util.Map f18874e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private long f18875f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private p250z.l f18876g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f18877h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final java.lang.Object f18878i0;

    /* JADX INFO: renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name */
    public static final class C0355a {
        private C0355a() {
        }

        public /* synthetic */ C0355a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            androidx.compose.foundation.a.this.m2().b();
            return java.lang.Boolean.TRUE;
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18880G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p250z.l f18881H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.g f18882I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p250z.l lVar, p250z.g gVar, p127m7.e eVar) {
            super(2, eVar);
            this.f18881H = lVar;
            this.f18882I = gVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18880G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p250z.l lVar = this.f18881H;
                p250z.g gVar = this.f18882I;
                this.f18880G = 1;
                if (lVar.c(gVar, this) == objG) {
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
            return ((androidx.compose.foundation.a.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new androidx.compose.foundation.a.c(this.f18881H, this.f18882I, eVar);
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18883G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p250z.l f18884H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.h f18885I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p250z.l lVar, p250z.h hVar, p127m7.e eVar) {
            super(2, eVar);
            this.f18884H = lVar;
            this.f18885I = hVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18883G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p250z.l lVar = this.f18884H;
                p250z.h hVar = this.f18885I;
                this.f18883G = 1;
                if (lVar.c(hVar, this) == objG) {
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
            return ((androidx.compose.foundation.a.d) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new androidx.compose.foundation.a.d(this.f18884H, this.f18885I, eVar);
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        boolean f18886G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f18887H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f18888I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p230x.t f18889J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ long f18890K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p250z.l f18891L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a f18892M;

        /* JADX INFO: renamed from: androidx.compose.foundation.a$e$a, reason: collision with other inner class name */
        static final class C0356a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f18893G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f18894H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.a f18895I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ long f18896J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p250z.l f18897K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0356a(androidx.compose.foundation.a aVar, long j6, p250z.l lVar, p127m7.e eVar) {
                super(2, eVar);
                this.f18895I = aVar;
                this.f18896J = j6;
                this.f18897K = lVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                z.n.b bVar;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f18894H;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (z.n.b) this.f18893G;
                        p087i7.x.b(obj);
                    }
                    this.f18895I.f18872c0 = bVar;
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                if (this.f18895I.h2()) {
                    long jA = p210v.AbstractC7217k.a();
                    this.f18894H = 1;
                    if (W8.Y.a(jA, this) == objG) {
                        return objG;
                    }
                }
                z.n.b bVar2 = new z.n.b(this.f18896J, null);
                p250z.l lVar = this.f18897K;
                this.f18893G = bVar2;
                this.f18894H = 2;
                if (lVar.c(bVar2, this) == objG) {
                    return objG;
                }
                bVar = bVar2;
                this.f18895I.f18872c0 = bVar;
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((androidx.compose.foundation.a.e.C0356a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new androidx.compose.foundation.a.e.C0356a(this.f18895I, this.f18896J, this.f18897K, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p230x.t tVar, long j6, p250z.l lVar, androidx.compose.foundation.a aVar, p127m7.e eVar) {
            super(2, eVar);
            this.f18889J = tVar;
            this.f18890K = j6;
            this.f18891L = lVar;
            this.f18892M = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0088  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ae A[RETURN] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            W8.InterfaceC1822z0 interfaceC1822z0D;
            java.lang.Object objJ0;
            boolean z6;
            z.n.b bVar;
            z.n.c cVar;
            p250z.l lVar;
            z.n.c cVar2;
            p250z.l lVar2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18887H;
            if (i6 != 0) {
                if (i6 == 1) {
                    interfaceC1822z0D = (W8.InterfaceC1822z0) this.f18888I;
                    p087i7.x.b(obj);
                    objJ0 = obj;
                } else if (i6 == 2) {
                    z6 = this.f18886G;
                    p087i7.x.b(obj);
                    if (z6) {
                        bVar = new z.n.b(this.f18890K, null);
                        cVar = new z.n.c(bVar);
                        lVar = this.f18891L;
                        this.f18888I = cVar;
                        this.f18887H = 3;
                        if (lVar.c(bVar, this) == objG) {
                            return objG;
                        }
                        cVar2 = cVar;
                        lVar2 = this.f18891L;
                        this.f18888I = null;
                        this.f18887H = 4;
                        if (lVar2.c(cVar2, this) == objG) {
                            return objG;
                        }
                    }
                } else if (i6 == 3) {
                    cVar2 = (z.n.c) this.f18888I;
                    p087i7.x.b(obj);
                    lVar2 = this.f18891L;
                    this.f18888I = null;
                    this.f18887H = 4;
                    if (lVar2.c(cVar2, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 4 && i6 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                this.f18892M.f18872c0 = null;
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            interfaceC1822z0D = W8.AbstractC1788i.d((W8.N) this.f18888I, null, null, new androidx.compose.foundation.a.e.C0356a(this.f18892M, this.f18890K, this.f18891L, null), 3, null);
            p230x.t tVar = this.f18889J;
            this.f18888I = interfaceC1822z0D;
            this.f18887H = 1;
            objJ0 = tVar.j0(this);
            if (objJ0 == objG) {
                return objG;
            }
            boolean zBooleanValue = ((java.lang.Boolean) objJ0).booleanValue();
            if (interfaceC1822z0D.f()) {
                this.f18888I = null;
                this.f18886G = zBooleanValue;
                this.f18887H = 2;
                if (W8.C0.g(interfaceC1822z0D, this) == objG) {
                    return objG;
                }
                z6 = zBooleanValue;
                if (z6) {
                    bVar = new z.n.b(this.f18890K, null);
                    cVar = new z.n.c(bVar);
                    lVar = this.f18891L;
                    this.f18888I = cVar;
                    this.f18887H = 3;
                    if (lVar.c(bVar, this) == objG) {
                        return objG;
                    }
                    cVar2 = cVar;
                    lVar2 = this.f18891L;
                    this.f18888I = null;
                    this.f18887H = 4;
                    if (lVar2.c(cVar2, this) == objG) {
                        return objG;
                    }
                }
            } else {
                z.n.b bVar2 = this.f18892M.f18872c0;
                if (bVar2 != null) {
                    p250z.l lVar3 = this.f18891L;
                    p250z.i cVar3 = zBooleanValue ? new z.n.c(bVar2) : new z.n.a(bVar2);
                    this.f18888I = null;
                    this.f18887H = 5;
                    if (lVar3.c(cVar3, this) == objG) {
                        return objG;
                    }
                }
            }
            this.f18892M.f18872c0 = null;
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.foundation.a.e) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.a.e eVar2 = new androidx.compose.foundation.a.e(this.f18889J, this.f18890K, this.f18891L, this.f18892M, eVar);
            eVar2.f18888I = obj;
            return eVar2;
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18898G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ z.n.b f18900I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z.n.b bVar, p127m7.e eVar) {
            super(2, eVar);
            this.f18900I = bVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18898G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p250z.l lVar = androidx.compose.foundation.a.this.f18861R;
                if (lVar != null) {
                    z.n.b bVar = this.f18900I;
                    this.f18898G = 1;
                    if (lVar.c(bVar, this) == objG) {
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
            return ((androidx.compose.foundation.a.f) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.foundation.a.this.new f(this.f18900I, eVar);
        }
    }

    static final class g extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18901G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ z.n.b f18903I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(z.n.b bVar, p127m7.e eVar) {
            super(2, eVar);
            this.f18903I = bVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18901G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p250z.l lVar = androidx.compose.foundation.a.this.f18861R;
                if (lVar != null) {
                    z.n.c cVar = new z.n.c(this.f18903I);
                    this.f18901G = 1;
                    if (lVar.c(cVar, this) == objG) {
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
            return ((androidx.compose.foundation.a.g) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.foundation.a.this.new g(this.f18903I, eVar);
        }
    }

    static final class h extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18904G;

        h(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f18904G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            androidx.compose.foundation.a.this.j2();
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.foundation.a.h) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.foundation.a.this.new h(eVar);
        }
    }

    static final class i extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18906G;

        i(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f18906G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            androidx.compose.foundation.a.this.k2();
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.foundation.a.i) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.foundation.a.this.new i(eVar);
        }
    }

    static final class j extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18908G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f18909H;

        j(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18908G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f18909H;
                androidx.compose.foundation.a aVar = androidx.compose.foundation.a.this;
                this.f18908G = 1;
                if (aVar.g2(k6, this) == objG) {
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
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((androidx.compose.foundation.a.j) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.a.j jVar = androidx.compose.foundation.a.this.new j(eVar);
            jVar.f18909H = obj;
            return jVar;
        }
    }

    private a(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
        this.f18861R = lVar;
        this.f18862S = i6;
        this.f18863T = str;
        this.f18864U = hVar;
        this.f18865V = z6;
        this.f18866W = aVar;
        this.f18868Y = new p210v.C7229x();
        this.f18869Z = new p210v.C7231z(this.f18861R);
        this.f18874e0 = new java.util.LinkedHashMap();
        this.f18875f0 = p131n0.g.f51312b.c();
        this.f18876g0 = this.f18861R;
        this.f18877h0 = q2();
        this.f18878i0 = f18859j0;
    }

    public /* synthetic */ a(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(lVar, i6, z6, str, hVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h2() {
        return androidx.compose.foundation.d.h(this) || p210v.AbstractC7217k.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2() {
        if (this.f18873d0 == null) {
            p250z.g gVar = new p250z.g();
            p250z.l lVar = this.f18861R;
            if (lVar != null) {
                W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.a.c(lVar, gVar, null), 3, null);
            }
            this.f18873d0 = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2() {
        p250z.g gVar = this.f18873d0;
        if (gVar != null) {
            p250z.h hVar = new p250z.h(gVar);
            p250z.l lVar = this.f18861R;
            if (lVar != null) {
                W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.a.d(lVar, hVar, null), 3, null);
            }
            this.f18873d0 = null;
        }
    }

    private final void o2() {
        p210v.I i6;
        if (this.f18871b0 == null && (i6 = this.f18862S) != null) {
            if (this.f18861R == null) {
                this.f18861R = p250z.k.a();
            }
            this.f18869Z.Z1(this.f18861R);
            p250z.l lVar = this.f18861R;
            p247y7.AbstractC7350t.c(lVar);
            F0.InterfaceC0924j interfaceC0924jA = i6.a(lVar);
            T1(interfaceC0924jA);
            this.f18871b0 = interfaceC0924jA;
        }
    }

    private final boolean q2() {
        return this.f18876g0 == null && this.f18862S != null;
    }

    @Override // androidx.compose.ui.d.c
    public final void D1() {
        if (!this.f18877h0) {
            o2();
        }
        if (this.f18865V) {
            T1(this.f18868Y);
            T1(this.f18869Z);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void E1() {
        i2();
        if (this.f18876g0 == null) {
            this.f18861R = null;
        }
        F0.InterfaceC0924j interfaceC0924j = this.f18871b0;
        if (interfaceC0924j != null) {
            W1(interfaceC0924j);
        }
        this.f18871b0 = null;
    }

    @Override // p231x0.e
    public final boolean H(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // F0.E0
    public java.lang.Object K() {
        return this.f18878i0;
    }

    @Override // F0.z0
    public final void M0(K0.w wVar) {
        K0.h hVar = this.f18864U;
        if (hVar != null) {
            p247y7.AbstractC7350t.c(hVar);
            K0.u.X(wVar, hVar.n());
        }
        K0.u.u(wVar, this.f18863T, new androidx.compose.foundation.a.b());
        if (this.f18865V) {
            this.f18869Z.M0(wVar);
        } else {
            K0.u.j(wVar);
        }
        f2(wVar);
    }

    @Override // p121m0.b
    public final void R0(p121m0.n nVar) {
        if (nVar.g()) {
            o2();
        }
        if (this.f18865V) {
            this.f18869Z.R0(nVar);
        }
    }

    @Override // F0.v0
    public /* synthetic */ boolean Y0() {
        return F0.u0.d(this);
    }

    @Override // p231x0.e
    public final boolean b0(android.view.KeyEvent keyEvent) {
        o2();
        if (this.f18865V && p210v.AbstractC7217k.f(keyEvent)) {
            if (this.f18874e0.containsKey(p231x0.a.m(p231x0.d.a(keyEvent)))) {
                return false;
            }
            z.n.b bVar = new z.n.b(this.f18875f0, null);
            this.f18874e0.put(p231x0.a.m(p231x0.d.a(keyEvent)), bVar);
            if (this.f18861R != null) {
                W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.a.f(bVar, null), 3, null);
            }
        } else {
            if (!this.f18865V || !p210v.AbstractC7217k.b(keyEvent)) {
                return false;
            }
            z.n.b bVar2 = (z.n.b) this.f18874e0.remove(p231x0.a.m(p231x0.d.a(keyEvent)));
            if (bVar2 != null && this.f18861R != null) {
                W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.a.g(bVar2, null), 3, null);
            }
            this.f18866W.b();
        }
        return true;
    }

    @Override // F0.v0
    public /* synthetic */ void f1() {
        F0.u0.c(this);
    }

    public void f2(K0.w wVar) {
    }

    @Override // F0.v0
    public final void g0() {
        p250z.g gVar;
        p250z.l lVar = this.f18861R;
        if (lVar != null && (gVar = this.f18873d0) != null) {
            lVar.a(new p250z.h(gVar));
        }
        this.f18873d0 = null;
        p251z0.W w6 = this.f18870a0;
        if (w6 != null) {
            w6.g0();
        }
    }

    public abstract java.lang.Object g2(p251z0.K k6, p127m7.e eVar);

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    protected final void i2() {
        p250z.l lVar = this.f18861R;
        if (lVar != null) {
            z.n.b bVar = this.f18872c0;
            if (bVar != null) {
                lVar.a(new z.n.a(bVar));
            }
            p250z.g gVar = this.f18873d0;
            if (gVar != null) {
                lVar.a(new p250z.h(gVar));
            }
            java.util.Iterator it = this.f18874e0.values().iterator();
            while (it.hasNext()) {
                lVar.a(new z.n.a((z.n.b) it.next()));
            }
        }
        this.f18872c0 = null;
        this.f18873d0 = null;
        this.f18874e0.clear();
    }

    @Override // F0.z0
    public final boolean k1() {
        return true;
    }

    protected final boolean l2() {
        return this.f18865V;
    }

    protected final p237x7.a m2() {
        return this.f18866W;
    }

    @Override // F0.v0
    public /* synthetic */ boolean n0() {
        return F0.u0.a(this);
    }

    protected final java.lang.Object n2(p230x.t tVar, long j6, p127m7.e eVar) {
        java.lang.Object objF;
        p250z.l lVar = this.f18861R;
        return (lVar == null || (objF = W8.O.f(new androidx.compose.foundation.a.e(tVar, j6, lVar, this, null), eVar)) != p137n7.b.g()) ? p087i7.M.f46721a : objF;
    }

    protected final p087i7.M p2() {
        p251z0.W w6 = this.f18870a0;
        if (w6 == null) {
            return null;
        }
        w6.o1();
        return p087i7.M.f46721a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    protected final void r2(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
        boolean z10;
        boolean z11;
        F0.InterfaceC0924j interfaceC0924j;
        if (p247y7.AbstractC7350t.b(this.f18876g0, lVar)) {
            z10 = false;
        } else {
            i2();
            this.f18876g0 = lVar;
            this.f18861R = lVar;
            z10 = true;
        }
        if (!p247y7.AbstractC7350t.b(this.f18862S, i6)) {
            this.f18862S = i6;
            z10 = true;
        }
        if (this.f18865V != z6) {
            p210v.C7229x c7229x = this.f18868Y;
            if (z6) {
                T1(c7229x);
                T1(this.f18869Z);
            } else {
                W1(c7229x);
                W1(this.f18869Z);
                i2();
            }
            F0.A0.b(this);
            this.f18865V = z6;
        }
        if (!p247y7.AbstractC7350t.b(this.f18863T, str)) {
            this.f18863T = str;
            F0.A0.b(this);
        }
        if (!p247y7.AbstractC7350t.b(this.f18864U, hVar)) {
            this.f18864U = hVar;
            F0.A0.b(this);
        }
        this.f18866W = aVar;
        if (this.f18877h0 != q2()) {
            boolean zQ2 = q2();
            this.f18877h0 = zQ2;
            z11 = (zQ2 || this.f18871b0 != null) ? z10 : true;
        }
        if (z11 && ((interfaceC0924j = this.f18871b0) != null || !this.f18877h0)) {
            if (interfaceC0924j != null) {
                W1(interfaceC0924j);
            }
            this.f18871b0 = null;
            o2();
        }
        this.f18869Z.Z1(this.f18861R);
    }

    @Override // F0.v0
    public /* synthetic */ void t0() {
        F0.u0.b(this);
    }

    @Override // F0.v0
    public final void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        long jB = Y0.u.b(j6);
        this.f18875f0 = p131n0.h.a(Y0.p.h(jB), Y0.p.i(jB));
        o2();
        if (this.f18865V && rVar == p251z0.r.Main) {
            int iF = c7380p.f();
            p251z0.AbstractC7383t.a aVar = p251z0.AbstractC7383t.f57591a;
            if (p251z0.AbstractC7383t.i(iF, aVar.a())) {
                W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.a.h(null), 3, null);
            } else if (p251z0.AbstractC7383t.i(iF, aVar.b())) {
                W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.a.i(null), 3, null);
            }
        }
        if (this.f18870a0 == null) {
            this.f18870a0 = (p251z0.W) T1(p251z0.U.a(new androidx.compose.foundation.a.j(null)));
        }
        p251z0.W w6 = this.f18870a0;
        if (w6 != null) {
            w6.w0(c7380p, rVar, j6);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean y1() {
        return this.f18867X;
    }
}
