package p200u;

/* JADX INFO: renamed from: u.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7164d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f54841a = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p059f9.a f54842b = p059f9.g.b(false, 1, null);

    /* JADX INFO: renamed from: u.d0$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p200u.EnumC7158a0 f54843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final W8.InterfaceC1822z0 f54844b;

        public a(p200u.EnumC7158a0 enumC7158a0, W8.InterfaceC1822z0 interfaceC1822z0) {
            this.f54843a = enumC7158a0;
            this.f54844b = interfaceC1822z0;
        }

        public final boolean a(p200u.C7164d0.a aVar) {
            return this.f54843a.compareTo(aVar.f54843a) >= 0;
        }

        public final void b() {
            this.f54844b.o(new p200u.C7160b0());
        }
    }

    /* JADX INFO: renamed from: u.d0$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f54845G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f54846H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f54847I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f54848J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f54849K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p200u.EnumC7158a0 f54850L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p200u.C7164d0 f54851M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ p237x7.l f54852N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p200u.EnumC7158a0 enumC7158a0, p200u.C7164d0 c7164d0, p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f54850L = enumC7158a0;
            this.f54851M = c7164d0;
            this.f54852N = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [f9.a, int] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p059f9.a aVar;
            p237x7.l lVar;
            p200u.C7164d0.a aVar2;
            p200u.C7164d0 c7164d0;
            p200u.C7164d0.a aVar3;
            java.lang.Throwable th;
            p200u.C7164d0 c7164d1;
            p059f9.a aVar4;
            java.lang.Object objG = p137n7.b.g();
            ?? r6 = this.f54848J;
            try {
                try {
                    if (r6 == 0) {
                        p087i7.x.b(obj);
                        W8.N n6 = (W8.N) this.f54849K;
                        p200u.EnumC7158a0 enumC7158a0 = this.f54850L;
                        m7.i.b bVarI = n6.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
                        p247y7.AbstractC7350t.c(bVarI);
                        p200u.C7164d0.a aVar5 = new p200u.C7164d0.a(enumC7158a0, (W8.InterfaceC1822z0) bVarI);
                        this.f54851M.f(aVar5);
                        aVar = this.f54851M.f54842b;
                        p237x7.l lVar2 = this.f54852N;
                        p200u.C7164d0 c7164d2 = this.f54851M;
                        this.f54849K = aVar5;
                        this.f54845G = aVar;
                        this.f54846H = lVar2;
                        this.f54847I = c7164d2;
                        this.f54848J = 1;
                        if (aVar.c(null, this) == objG) {
                            return objG;
                        }
                        lVar = lVar2;
                        aVar2 = aVar5;
                        c7164d0 = c7164d2;
                    } else {
                        if (r6 != 1) {
                            if (r6 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c7164d1 = (p200u.C7164d0) this.f54846H;
                            aVar4 = (p059f9.a) this.f54845G;
                            aVar3 = (p200u.C7164d0.a) this.f54849K;
                            try {
                                p087i7.x.b(obj);
                                p200u.AbstractC7162c0.a(c7164d1.f54841a, aVar3, null);
                                aVar4.d(null);
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                p200u.AbstractC7162c0.a(c7164d1.f54841a, aVar3, null);
                                throw th;
                            }
                        }
                        c7164d0 = (p200u.C7164d0) this.f54847I;
                        lVar = (p237x7.l) this.f54846H;
                        p059f9.a aVar6 = (p059f9.a) this.f54845G;
                        aVar2 = (p200u.C7164d0.a) this.f54849K;
                        p087i7.x.b(obj);
                        aVar = aVar6;
                    }
                    this.f54849K = aVar2;
                    this.f54845G = aVar;
                    this.f54846H = c7164d0;
                    this.f54847I = null;
                    this.f54848J = 2;
                    java.lang.Object objL = lVar.l(this);
                    if (objL == objG) {
                        return objG;
                    }
                    c7164d1 = c7164d0;
                    aVar4 = aVar;
                    obj = objL;
                    aVar3 = aVar2;
                    p200u.AbstractC7162c0.a(c7164d1.f54841a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (java.lang.Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    c7164d1 = c7164d0;
                    p200u.AbstractC7162c0.a(c7164d1.f54841a, aVar3, null);
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                r6.d(null);
                throw th4;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p200u.C7164d0.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p200u.C7164d0.b bVar = new p200u.C7164d0.b(this.f54850L, this.f54851M, this.f54852N, eVar);
            bVar.f54849K = obj;
            return bVar;
        }
    }

    public static /* synthetic */ java.lang.Object e(p200u.C7164d0 c7164d0, p200u.EnumC7158a0 enumC7158a0, p237x7.l lVar, p127m7.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            enumC7158a0 = p200u.EnumC7158a0.Default;
        }
        return c7164d0.d(enumC7158a0, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(p200u.C7164d0.a aVar) {
        p200u.C7164d0.a aVar2;
        do {
            aVar2 = (p200u.C7164d0.a) this.f54841a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
            }
        } while (!p200u.AbstractC7162c0.a(this.f54841a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final java.lang.Object d(p200u.EnumC7158a0 enumC7158a0, p237x7.l lVar, p127m7.e eVar) {
        return W8.O.f(new p200u.C7164d0.b(enumC7158a0, this, lVar, null), eVar);
    }
}
