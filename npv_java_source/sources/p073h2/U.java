package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class U implements p073h2.T, W8.N, Y8.C {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Y8.C f46021C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ W8.N f46022D;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46023F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46024G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46025H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f46027J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46025H = obj;
            this.f46027J |= Integer.MIN_VALUE;
            return p073h2.U.this.m1(null, this);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1794l f46028D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(W8.InterfaceC1794l interfaceC1794l) {
            super(1);
            this.f46028D = interfaceC1794l;
        }

        public final void a(java.lang.Throwable th) {
            W8.InterfaceC1794l interfaceC1794l = this.f46028D;
            i7.w.a aVar = p087i7.w.f46751D;
            interfaceC1794l.t(p087i7.w.b(p087i7.M.f46721a));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public U(W8.N n6, Y8.C c6) {
        p247y7.AbstractC7350t.f(n6, "scope");
        p247y7.AbstractC7350t.f(c6, "channel");
        this.f46021C = c6;
        this.f46022D = n6;
    }

    @Override // Y8.C
    public boolean c(java.lang.Throwable th) {
        return this.f46021C.c(th);
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f46022D.getCoroutineContext();
    }

    @Override // Y8.C
    public java.lang.Object h(java.lang.Object obj, p127m7.e eVar) {
        return this.f46021C.h(obj, eVar);
    }

    @Override // Y8.C
    public java.lang.Object j(java.lang.Object obj) {
        return this.f46021C.j(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p073h2.T
    public java.lang.Object m1(p237x7.a aVar, p127m7.e eVar) {
        h2.U.a aVar2;
        if (eVar instanceof h2.U.a) {
            aVar2 = (h2.U.a) eVar;
            int i6 = aVar2.f46027J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar2.f46027J = i6 - Integer.MIN_VALUE;
            } else {
                aVar2 = new h2.U.a(eVar);
            }
        } else {
            aVar2 = new h2.U.a(eVar);
        }
        java.lang.Object obj = aVar2.f46025H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar2.f46027J;
        try {
            if (i10 == 0) {
                p087i7.x.b(obj);
                m7.i.b bVarI = getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
                if (bVarI == null) {
                    throw new java.lang.IllegalStateException("Internal error, context should have a job.".toString());
                }
                W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) bVarI;
                aVar2.f46023F = aVar;
                aVar2.f46024G = interfaceC1822z0;
                aVar2.f46027J = 1;
                W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(aVar2), 1);
                c1798n.E();
                interfaceC1822z0.e1(new h2.U.b(c1798n));
                java.lang.Object objX = c1798n.x();
                if (objX == p137n7.b.g()) {
                    p147o7.h.c(aVar2);
                }
                if (objX == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p237x7.a) aVar2.f46023F;
                p087i7.x.b(obj);
            }
            aVar.b();
            return p087i7.M.f46721a;
        } catch (java.lang.Throwable th) {
            aVar.b();
            throw th;
        }
    }
}
