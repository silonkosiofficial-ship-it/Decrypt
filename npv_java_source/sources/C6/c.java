package C6;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements W8.N, java.io.Closeable {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1333P = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(C6.c.class, "closed");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final F6.b f1334C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final C6.j f1335D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f1336E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final W8.InterfaceC1819y f1337F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p127m7.i f1338G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final O6.g f1339H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Q6.f f1340I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final O6.i f1341J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Q6.b f1342K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final W6.InterfaceC1768b f1343L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final F6.j f1344M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final S6.b f1345N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C6.j f1346O;
    private volatile /* synthetic */ int closed;

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1347G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f1348H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1349I;

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object obj2;
            p007a7.e eVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f1347G;
            if (i6 != 0) {
                if (i6 == 1) {
                    obj2 = this.f1349I;
                    eVar = (p007a7.e) this.f1348H;
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            p007a7.e eVar2 = (p007a7.e) this.f1348H;
            obj2 = this.f1349I;
            if (!(obj2 instanceof D6.b)) {
                throw new java.lang.IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + p247y7.P.b(obj2.getClass()) + ").").toString());
            }
            Q6.b bVarY = C6.c.this.y();
            p087i7.M m6 = p087i7.M.f46721a;
            Q6.c cVarE = ((D6.b) obj2).e();
            this.f1348H = eVar2;
            this.f1349I = obj2;
            this.f1347G = 1;
            java.lang.Object objD = bVarY.d(m6, cVarE, this);
            if (objD == objG) {
                return objG;
            }
            eVar = eVar2;
            obj = objD;
            ((D6.b) obj2).j((Q6.c) obj);
            this.f1348H = null;
            this.f1349I = null;
            this.f1347G = 2;
            if (eVar.e(obj2, this) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
            C6.c.a aVar = C6.c.this.new a(eVar2);
            aVar.f1348H = eVar;
            aVar.f1349I = obj;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1351G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f1352H;

        b(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            p007a7.e eVar;
            java.lang.Throwable th;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f1351G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p007a7.e eVar2 = (p007a7.e) this.f1352H;
                try {
                    this.f1352H = eVar2;
                    this.f1351G = 1;
                    java.lang.Object objD = eVar2.d(this);
                    if (objD == objG) {
                        return objG;
                    }
                    eVar = eVar2;
                    obj = objD;
                } catch (java.lang.Throwable th2) {
                    eVar = eVar2;
                    th = th2;
                    C6.c.this.s().a(R6.a.d(), new R6.e(((D6.b) eVar.b()).e(), th));
                    throw th;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (p007a7.e) this.f1352H;
                try {
                    p087i7.x.b(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    C6.c.this.s().a(R6.a.d(), new R6.e(((D6.b) eVar.b()).e(), th));
                    throw th;
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, Q6.d dVar, p127m7.e eVar2) {
            C6.c.b bVar = C6.c.this.new b(eVar2);
            bVar.f1352H = eVar;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: C6.c$c, reason: collision with other inner class name */
    static final class C0022c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1354F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f1356H;

        C0022c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f1354F = obj;
            this.f1356H |= Integer.MIN_VALUE;
            return C6.c.this.i(null, this);
        }
    }

    public c(F6.b bVar, C6.j jVar) {
        p247y7.AbstractC7350t.f(bVar, "engine");
        p247y7.AbstractC7350t.f(jVar, "userConfig");
        this.f1334C = bVar;
        this.f1335D = jVar;
        boolean z6 = false;
        this.closed = 0;
        W8.InterfaceC1819y interfaceC1819yA = W8.C0.a((W8.InterfaceC1822z0) bVar.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h));
        this.f1337F = interfaceC1819yA;
        this.f1338G = bVar.getCoroutineContext().o0(interfaceC1819yA);
        int i6 = 1;
        p247y7.AbstractC7342k abstractC7342k = null;
        this.f1339H = new O6.g(z6, i6, abstractC7342k);
        Q6.f fVar = new Q6.f(z6, i6, abstractC7342k);
        this.f1340I = fVar;
        O6.i iVar = new O6.i(z6, i6, abstractC7342k);
        this.f1341J = iVar;
        this.f1342K = new Q6.b(z6, i6, abstractC7342k);
        this.f1343L = W6.AbstractC1770d.a(true);
        this.f1344M = bVar.Q();
        this.f1345N = new S6.b();
        C6.j jVar2 = new C6.j();
        this.f1346O = jVar2;
        if (this.f1336E) {
            interfaceC1819yA.e1(new p237x7.l() { // from class: C6.a
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return C6.c.g(this.f1332C, (java.lang.Throwable) obj);
                }
            });
        }
        bVar.A0(this);
        iVar.l(O6.i.f8098g.b(), new C6.c.a(null));
        C6.j.q(jVar2, I6.C.i(), null, 2, null);
        C6.j.q(jVar2, I6.AbstractC1248d.e(), null, 2, null);
        C6.j.q(jVar2, I6.AbstractC1256l.e(), null, 2, null);
        if (jVar.m()) {
            jVar2.p("DefaultTransformers", new p237x7.l() { // from class: C6.b
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return C6.c.R((C6.c) obj);
                }
            });
        }
        C6.j.q(jVar2, I6.E.f5103c, null, 2, null);
        C6.j.q(jVar2, I6.AbstractC1260p.k(), null, 2, null);
        if (jVar.l()) {
            C6.j.q(jVar2, I6.y.f(), null, 2, null);
        }
        jVar2.v(jVar);
        if (jVar.m()) {
            C6.j.q(jVar2, I6.v.i(), null, 2, null);
        }
        I6.AbstractC1251g.d(jVar2);
        jVar2.n(this);
        fVar.l(Q6.f.f9096g.b(), new C6.c.b(null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(F6.b bVar, C6.j jVar, boolean z6) {
        this(bVar, jVar);
        p247y7.AbstractC7350t.f(bVar, "engine");
        p247y7.AbstractC7350t.f(jVar, "userConfig");
        this.f1336E = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M R(C6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "$this$install");
        I6.AbstractC1252h.d(cVar);
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M g(C6.c cVar, java.lang.Throwable th) {
        if (th != null) {
            W8.O.e(cVar.f1334C, null, 1, null);
        }
        return p087i7.M.f46721a;
    }

    public final O6.g D() {
        return this.f1339H;
    }

    public final Q6.f H() {
        return this.f1340I;
    }

    public final O6.i N() {
        return this.f1341J;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (f1333P.compareAndSet(this, 0, 1)) {
            W6.InterfaceC1768b interfaceC1768b = (W6.InterfaceC1768b) this.f1343L.b(I6.AbstractC1262s.a());
            for (W6.C1767a c1767a : interfaceC1768b.a()) {
                p247y7.AbstractC7350t.d(c1767a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                java.lang.Object objB = interfaceC1768b.b(c1767a);
                if (objB instanceof java.io.Closeable) {
                    ((java.io.Closeable) objB).close();
                }
            }
            this.f1337F.K0();
            if (this.f1336E) {
                this.f1334C.close();
            }
        }
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f1338G;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(O6.d dVar, p127m7.e eVar) {
        C6.c.C0022c c0022c;
        if (eVar instanceof C6.c.C0022c) {
            c0022c = (C6.c.C0022c) eVar;
            int i6 = c0022c.f1356H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0022c.f1356H = i6 - Integer.MIN_VALUE;
            } else {
                c0022c = new C6.c.C0022c(eVar);
            }
        } else {
            c0022c = new C6.c.C0022c(eVar);
        }
        java.lang.Object objD = c0022c.f1354F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = c0022c.f1356H;
        if (i10 == 0) {
            p087i7.x.b(objD);
            this.f1345N.a(R6.a.a(), dVar);
            O6.g gVar = this.f1339H;
            java.lang.Object objE = dVar.e();
            c0022c.f1356H = 1;
            objD = gVar.d(dVar, objE, c0022c);
            if (objD == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(objD);
        }
        p247y7.AbstractC7350t.d(objD, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (D6.b) objD;
    }

    public final C6.j o() {
        return this.f1346O;
    }

    public final S6.b s() {
        return this.f1345N;
    }

    public java.lang.String toString() {
        return "HttpClient[" + this.f1334C + ']';
    }

    public final W6.InterfaceC1768b x0() {
        return this.f1343L;
    }

    public final Q6.b y() {
        return this.f1342K;
    }
}
