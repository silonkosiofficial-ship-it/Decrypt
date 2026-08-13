package G6;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends F6.f {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final G6.h.b f3049L = new G6.h.b(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f3050M = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: G6.e
        @Override // p237x7.a
        public final java.lang.Object b() {
            return G6.h.Y0();
        }
    });

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final G6.d f3051G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.Set f3052H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p127m7.i f3053I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p127m7.i f3054J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final java.util.Map f3055K;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f3056G;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f3056G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    m7.i.b bVarI = G6.h.this.f3053I.i(W8.InterfaceC1822z0.f15544h);
                    p247y7.AbstractC7350t.c(bVarI);
                    this.f3056G = 1;
                    if (((W8.InterfaceC1822z0) bVarI).g0(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                java.util.Iterator it = G6.h.this.f3055K.entrySet().iterator();
                while (it.hasNext()) {
                    H9.x xVar = (H9.x) ((java.util.Map.Entry) it.next()).getValue();
                    xVar.n().a();
                    xVar.r().b().shutdown();
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                java.util.Iterator it2 = G6.h.this.f3055K.entrySet().iterator();
                while (it2.hasNext()) {
                    H9.x xVar2 = (H9.x) ((java.util.Map.Entry) it2.next()).getValue();
                    xVar2.n().a();
                    xVar2.r().b().shutdown();
                }
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((G6.h.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return G6.h.this.new a(eVar);
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final H9.x a() {
            return (H9.x) G6.h.f3050M.getValue();
        }
    }

    /* synthetic */ class c extends p247y7.C7348q implements p237x7.l {
        c(java.lang.Object obj) {
            super(1, obj, G6.h.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final H9.x l(I6.G g6) {
            return ((G6.h) this.f57287D).y0(g6);
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f3058F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f3059G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f3060H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f3062J;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f3060H = obj;
            this.f3062J |= Integer.MIN_VALUE;
            return G6.h.this.W0(null, this);
        }
    }

    static final class e extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f3063F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f3064G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f3065H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f3066I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f3067J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f3069L;

        e(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f3067J = obj;
            this.f3069L |= Integer.MIN_VALUE;
            return G6.h.this.z0(null, null, null, null, this);
        }
    }

    static final class f extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f3070F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f3071G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f3072H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f3073I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f3074J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f3076L;

        f(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f3074J = obj;
            this.f3076L |= Integer.MIN_VALUE;
            return G6.h.this.K0(null, null, null, this);
        }
    }

    static final class g extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f3077F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f3078G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f3079H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f3080I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f3081J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f3083L;

        g(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f3081J = obj;
            this.f3083L |= Integer.MIN_VALUE;
            return G6.h.this.P0(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(G6.d dVar) {
        super("ktor-okhttp");
        p247y7.AbstractC7350t.f(dVar, "config");
        this.f3051G = dVar;
        this.f3052H = p097j7.Z.g(I6.F.f5123a, N6.a.f7815a, M6.a.f7035a);
        this.f3055K = W6.f.a(new G6.h.c(this), new p237x7.l() { // from class: G6.f
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return G6.h.r0((H9.x) obj);
            }
        }, Q().f());
        m7.i.b bVarI = super.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
        p247y7.AbstractC7350t.c(bVarI);
        p127m7.i iVarA = W6.q.a((W8.InterfaceC1822z0) bVarI);
        this.f3053I = iVarA;
        this.f3054J = super.getCoroutineContext().o0(iVarA);
        W8.AbstractC1784g.c(W8.C1810t0.f15533C, super.getCoroutineContext(), W8.P.ATOMIC, new G6.h.a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M E0(H9.C c6, java.lang.Throwable th) {
        if (c6 != null) {
            c6.close();
        }
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object K0(H9.x xVar, H9.z zVar, p127m7.i iVar, p127m7.e eVar) {
        G6.h.f fVar;
        G6.h hVar;
        Y6.b bVar;
        G6.n nVar;
        if (eVar instanceof G6.h.f) {
            fVar = (G6.h.f) eVar;
            int i6 = fVar.f3076L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f3076L = i6 - Integer.MIN_VALUE;
            } else {
                fVar = new G6.h.f(eVar);
            }
        } else {
            fVar = new G6.h.f(eVar);
        }
        java.lang.Object obj = fVar.f3074J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = fVar.f3076L;
        if (i10 == 0) {
            p087i7.x.b(obj);
            Y6.b bVarB = Y6.a.b(null, 1, null);
            G6.n nVar2 = new G6.n(xVar, zVar, iVar);
            W8.InterfaceC1813v interfaceC1813vE = nVar2.e();
            fVar.f3070F = this;
            fVar.f3071G = iVar;
            fVar.f3072H = bVarB;
            fVar.f3073I = nVar2;
            fVar.f3076L = 1;
            java.lang.Object objD1 = interfaceC1813vE.d1(fVar);
            if (objD1 == objG) {
                return objG;
            }
            hVar = this;
            bVar = bVarB;
            obj = objD1;
            nVar = nVar2;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (G6.n) fVar.f3073I;
            bVar = (Y6.b) fVar.f3072H;
            iVar = (p127m7.i) fVar.f3071G;
            hVar = (G6.h) fVar.f3070F;
            p087i7.x.b(obj);
        }
        return hVar.q0((H9.B) obj, bVar, nVar, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object P0(H9.x xVar, H9.z zVar, p127m7.i iVar, p127m7.e eVar) {
        G6.h.g gVar;
        G6.h hVar;
        Y6.b bVar;
        G6.o oVar;
        if (eVar instanceof G6.h.g) {
            gVar = (G6.h.g) eVar;
            int i6 = gVar.f3083L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.f3083L = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new G6.h.g(eVar);
            }
        } else {
            gVar = new G6.h.g(eVar);
        }
        java.lang.Object obj = gVar.f3081J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = gVar.f3083L;
        if (i10 == 0) {
            p087i7.x.b(obj);
            Y6.b bVarB = Y6.a.b(null, 1, null);
            H9.F.a aVarI = Q().i();
            if (aVarI == null) {
                aVarI = xVar;
            }
            G6.o oVar2 = new G6.o(xVar, aVarI, zVar, iVar);
            oVar2.k();
            W8.InterfaceC1813v interfaceC1813vI = oVar2.i();
            gVar.f3077F = this;
            gVar.f3078G = iVar;
            gVar.f3079H = bVarB;
            gVar.f3080I = oVar2;
            gVar.f3083L = 1;
            java.lang.Object objD1 = interfaceC1813vI.d1(gVar);
            if (objD1 == objG) {
                return objG;
            }
            hVar = this;
            bVar = bVarB;
            obj = objD1;
            oVar = oVar2;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (G6.o) gVar.f3080I;
            bVar = (Y6.b) gVar.f3079H;
            iVar = (p127m7.i) gVar.f3078G;
            hVar = (G6.h) gVar.f3077F;
            p087i7.x.b(obj);
        }
        return hVar.q0((H9.B) obj, bVar, oVar, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.x Y0() {
        return new H9.x.a().a();
    }

    private final O6.h q0(H9.B b6, Y6.b bVar, java.lang.Object obj, p127m7.i iVar) {
        return new O6.h(new T6.C(b6.o(), b6.R()), bVar, G6.q.c(b6.H()), G6.q.d(b6.o0()), obj, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M r0(H9.x xVar) {
        p247y7.AbstractC7350t.f(xVar, "it");
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H9.x y0(I6.G g6) {
        H9.x xVarH = Q().h();
        if (xVarH == null) {
            xVarH = f3049L.a();
        }
        H9.x.a aVarC = xVarH.C();
        aVarC.c(new H9.p());
        Q().g().l(aVarC);
        java.net.Proxy proxyB = Q().b();
        if (proxyB != null) {
            aVarC.L(proxyB);
        }
        if (g6 != null) {
            G6.l.n(aVarC, g6);
        }
        return aVarC.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object z0(H9.x xVar, H9.z zVar, p127m7.i iVar, O6.e eVar, p127m7.e eVar2) {
        G6.h.e eVar3;
        G6.h hVar;
        Y6.b bVar;
        io.ktor.utils.io.d dVarA;
        X9.InterfaceC1838f interfaceC1838fG;
        if (eVar2 instanceof G6.h.e) {
            eVar3 = (G6.h.e) eVar2;
            int i6 = eVar3.f3069L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar3.f3069L = i6 - Integer.MIN_VALUE;
            } else {
                eVar3 = new G6.h.e(eVar2);
            }
        } else {
            eVar3 = new G6.h.e(eVar2);
        }
        java.lang.Object obj = eVar3.f3067J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = eVar3.f3069L;
        if (i10 == 0) {
            p087i7.x.b(obj);
            Y6.b bVarB = Y6.a.b(null, 1, null);
            eVar3.f3063F = this;
            eVar3.f3064G = iVar;
            eVar3.f3065H = eVar;
            eVar3.f3066I = bVarB;
            eVar3.f3069L = 1;
            java.lang.Object objB = G6.q.b(xVar, zVar, eVar, iVar, eVar3);
            if (objB == objG) {
                return objG;
            }
            hVar = this;
            obj = objB;
            bVar = bVarB;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (Y6.b) eVar3.f3066I;
            eVar = (O6.e) eVar3.f3065H;
            iVar = (p127m7.i) eVar3.f3064G;
            hVar = (G6.h) eVar3.f3063F;
            p087i7.x.b(obj);
        }
        H9.B b6 = (H9.B) obj;
        final H9.C cA = b6.a();
        m7.i.b bVarI = iVar.i(W8.InterfaceC1822z0.f15544h);
        p247y7.AbstractC7350t.c(bVarI);
        ((W8.InterfaceC1822z0) bVarI).e1(new p237x7.l() { // from class: G6.g
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj2) {
                return G6.h.E0(cA, (java.lang.Throwable) obj2);
            }
        });
        if (cA == null || (interfaceC1838fG = cA.g()) == null || (dVarA = G6.l.o(interfaceC1838fG, iVar, eVar)) == null) {
            dVarA = io.ktor.utils.io.d.f47628a.a();
        }
        return hVar.q0(b6, bVar, dVarA, iVar);
    }

    @Override // F6.b
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public G6.d Q() {
        return this.f3051G;
    }

    @Override // F6.f, F6.b
    public java.util.Set W() {
        return this.f3052H;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // F6.b
    public java.lang.Object W0(O6.e eVar, p127m7.e eVar2) {
        G6.h.d dVar;
        G6.h hVar;
        if (eVar2 instanceof G6.h.d) {
            dVar = (G6.h.d) eVar2;
            int i6 = dVar.f3062J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f3062J = i6 - Integer.MIN_VALUE;
            } else {
                dVar = new G6.h.d(eVar2);
            }
        } else {
            dVar = new G6.h.d(eVar2);
        }
        G6.h.d dVar2 = dVar;
        java.lang.Object objC = dVar2.f3060H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar2.f3062J;
        if (i10 == 0) {
            p087i7.x.b(objC);
            dVar2.f3058F = this;
            dVar2.f3059G = eVar;
            dVar2.f3062J = 1;
            objC = F6.t.c(dVar2);
            if (objC == objG) {
                return objG;
            }
            hVar = this;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    p087i7.x.b(objC);
                }
                if (i10 == 3) {
                    p087i7.x.b(objC);
                }
                if (i10 == 4) {
                    p087i7.x.b(objC);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (O6.e) dVar2.f3059G;
            hVar = (G6.h) dVar2.f3058F;
            p087i7.x.b(objC);
        }
        O6.e eVar3 = eVar;
        p127m7.i iVar = (p127m7.i) objC;
        H9.z zVarK = G6.l.k(eVar3, iVar);
        H9.x xVar = (H9.x) hVar.f3055K.get(eVar3.c(I6.F.f5123a));
        if (xVar == null) {
            throw new java.lang.IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed".toString());
        }
        if (O6.f.c(eVar3)) {
            dVar2.f3058F = null;
            dVar2.f3059G = null;
            dVar2.f3062J = 2;
            objC = hVar.P0(xVar, zVarK, iVar, dVar2);
            return objC == objG ? objG : objC;
        }
        boolean zB = O6.f.b(eVar3);
        dVar2.f3058F = null;
        dVar2.f3059G = null;
        if (zB) {
            dVar2.f3062J = 3;
            objC = hVar.K0(xVar, zVarK, iVar, dVar2);
            return objC == objG ? objG : objC;
        }
        dVar2.f3062J = 4;
        objC = hVar.z0(xVar, zVarK, iVar, eVar3, dVar2);
        return objC == objG ? objG : objC;
    }

    @Override // F6.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        m7.i.b bVarI = this.f3053I.i(W8.InterfaceC1822z0.f15544h);
        p247y7.AbstractC7350t.d(bVarI, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((W8.InterfaceC1819y) bVarI).K0();
    }

    @Override // F6.f, W8.N
    public p127m7.i getCoroutineContext() {
        return this.f3054J;
    }
}
