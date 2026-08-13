package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6.d f9103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6.c f9104b;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f9105F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f9106G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f9108I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f9106G = obj;
            this.f9108I |= Integer.MIN_VALUE;
            return Q6.g.this.a(null, this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f9109F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f9110G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f9111H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f9113J;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f9111H = obj;
            this.f9113J |= Integer.MIN_VALUE;
            return Q6.g.this.c(this);
        }
    }

    public g(O6.d dVar, C6.c cVar) {
        p247y7.AbstractC7350t.f(dVar, "builder");
        p247y7.AbstractC7350t.f(cVar, "client");
        this.f9103a = dVar;
        this.f9104b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(Q6.c cVar, p127m7.e eVar) {
        Q6.g.a aVar;
        if (eVar instanceof Q6.g.a) {
            aVar = (Q6.g.a) eVar;
            int i6 = aVar.f9108I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f9108I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new Q6.g.a(eVar);
            }
        } else {
            aVar = new Q6.g.a(eVar);
        }
        java.lang.Object obj = aVar.f9106G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f9108I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            m7.i.b bVarI = cVar.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
            p247y7.AbstractC7350t.c(bVarI);
            W8.InterfaceC1819y interfaceC1819y = (W8.InterfaceC1819y) bVarI;
            interfaceC1819y.K0();
            try {
                io.ktor.utils.io.e.a(cVar.b());
            } catch (java.lang.Throwable unused) {
            }
            aVar.f9105F = interfaceC1819y;
            aVar.f9108I = 1;
            if (interfaceC1819y.g0(aVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
        }
        return p087i7.M.f46721a;
    }

    public final java.lang.Object b(p127m7.e eVar) {
        return c(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(p127m7.e eVar) throws java.lang.Throwable {
        Q6.g.b bVar;
        Q6.g gVar;
        D6.b bVar2;
        Q6.g gVar2;
        Q6.c cVarE;
        Q6.c cVarE2;
        if (eVar instanceof Q6.g.b) {
            bVar = (Q6.g.b) eVar;
            int i6 = bVar.f9113J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f9113J = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new Q6.g.b(eVar);
            }
        } else {
            bVar = new Q6.g.b(eVar);
        }
        java.lang.Object objI = bVar.f9111H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f9113J;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    gVar = (Q6.g) bVar.f9109F;
                    p087i7.x.b(objI);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q6.c cVar = (Q6.c) bVar.f9109F;
                        p087i7.x.b(objI);
                        return cVar;
                    }
                    bVar2 = (D6.b) bVar.f9110G;
                    gVar2 = (Q6.g) bVar.f9109F;
                    p087i7.x.b(objI);
                }
                cVarE = ((D6.b) objI).e();
                cVarE2 = bVar2.e();
                bVar.f9109F = cVarE;
                bVar.f9110G = null;
                bVar.f9113J = 3;
                if (gVar2.a(cVarE2, bVar) == objG) {
                    return objG;
                }
                return cVarE;
            }
            p087i7.x.b(objI);
            O6.d dVarR = new O6.d().r(this.f9103a);
            C6.c cVar2 = this.f9104b;
            bVar.f9109F = this;
            bVar.f9113J = 1;
            objI = cVar2.i(dVarR, bVar);
            if (objI == objG) {
                return objG;
            }
            gVar = this;
            D6.b bVar3 = (D6.b) objI;
            bVar.f9109F = gVar;
            bVar.f9110G = bVar3;
            bVar.f9113J = 2;
            java.lang.Object objA = D6.d.a(bVar3, bVar);
            if (objA == objG) {
                return objG;
            }
            Q6.g gVar3 = gVar;
            bVar2 = bVar3;
            objI = objA;
            gVar2 = gVar3;
            cVarE = ((D6.b) objI).e();
            cVarE2 = bVar2.e();
            bVar.f9109F = cVarE;
            bVar.f9110G = null;
            bVar.f9113J = 3;
            if (gVar2.a(cVarE2, bVar) == objG) {
                return objG;
            }
            return cVarE;
        } catch (java.util.concurrent.CancellationException e6) {
            throw R6.c.a(e6);
        }
    }

    public java.lang.String toString() {
        return "HttpStatement[" + this.f9103a.j() + ']';
    }
}
