package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f55613a = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p059f9.a f55614b = p059f9.g.b(false, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p210v.L f55615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final W8.InterfaceC1822z0 f55616b;

        public a(p210v.L l6, W8.InterfaceC1822z0 interfaceC1822z0) {
            this.f55615a = l6;
            this.f55616b = interfaceC1822z0;
        }

        public final boolean a(v.N.a aVar) {
            return this.f55615a.compareTo(aVar.f55615a) >= 0;
        }

        public final void b() {
            this.f55616b.o(new p210v.M());
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f55617G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f55618H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f55619I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f55620J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f55621K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p210v.L f55622L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p210v.N f55623M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ p237x7.l f55624N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p210v.L l6, p210v.N n6, p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f55622L = l6;
            this.f55623M = n6;
            this.f55624N = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [f9.a, int] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p059f9.a aVar;
            p237x7.l lVar;
            v.N.a aVar2;
            p210v.N n6;
            v.N.a aVar3;
            java.lang.Throwable th;
            p210v.N n10;
            p059f9.a aVar4;
            java.lang.Object objG = p137n7.b.g();
            ?? r6 = this.f55620J;
            try {
                try {
                    if (r6 == 0) {
                        p087i7.x.b(obj);
                        W8.N n11 = (W8.N) this.f55621K;
                        p210v.L l6 = this.f55622L;
                        m7.i.b bVarI = n11.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
                        p247y7.AbstractC7350t.c(bVarI);
                        v.N.a aVar5 = new v.N.a(l6, (W8.InterfaceC1822z0) bVarI);
                        this.f55623M.f(aVar5);
                        aVar = this.f55623M.f55614b;
                        p237x7.l lVar2 = this.f55624N;
                        p210v.N n12 = this.f55623M;
                        this.f55621K = aVar5;
                        this.f55617G = aVar;
                        this.f55618H = lVar2;
                        this.f55619I = n12;
                        this.f55620J = 1;
                        if (aVar.c(null, this) == objG) {
                            return objG;
                        }
                        lVar = lVar2;
                        aVar2 = aVar5;
                        n6 = n12;
                    } else {
                        if (r6 != 1) {
                            if (r6 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n10 = (p210v.N) this.f55618H;
                            aVar4 = (p059f9.a) this.f55617G;
                            aVar3 = (v.N.a) this.f55621K;
                            try {
                                p087i7.x.b(obj);
                                p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
                                aVar4.d(null);
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
                                throw th;
                            }
                        }
                        n6 = (p210v.N) this.f55619I;
                        lVar = (p237x7.l) this.f55618H;
                        p059f9.a aVar6 = (p059f9.a) this.f55617G;
                        aVar2 = (v.N.a) this.f55621K;
                        p087i7.x.b(obj);
                        aVar = aVar6;
                    }
                    this.f55621K = aVar2;
                    this.f55617G = aVar;
                    this.f55618H = n6;
                    this.f55619I = null;
                    this.f55620J = 2;
                    java.lang.Object objL = lVar.l(this);
                    if (objL == objG) {
                        return objG;
                    }
                    n10 = n6;
                    aVar4 = aVar;
                    obj = objL;
                    aVar3 = aVar2;
                    p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (java.lang.Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    n10 = n6;
                    p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
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
            return ((v.N.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            v.N.b bVar = new v.N.b(this.f55622L, this.f55623M, this.f55624N, eVar);
            bVar.f55621K = obj;
            return bVar;
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f55625G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f55626H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f55627I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f55628J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f55629K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f55630L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p210v.L f55631M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ p210v.N f55632N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ p237x7.p f55633O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f55634P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p210v.L l6, p210v.N n6, p237x7.p pVar, java.lang.Object obj, p127m7.e eVar) {
            super(2, eVar);
            this.f55631M = l6;
            this.f55632N = n6;
            this.f55633O = pVar;
            this.f55634P = obj;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [f9.a, int] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p059f9.a aVar;
            p237x7.p pVar;
            java.lang.Object obj2;
            v.N.a aVar2;
            p210v.N n6;
            v.N.a aVar3;
            java.lang.Throwable th;
            p210v.N n10;
            p059f9.a aVar4;
            java.lang.Object objG = p137n7.b.g();
            ?? r6 = this.f55629K;
            try {
                try {
                    if (r6 == 0) {
                        p087i7.x.b(obj);
                        W8.N n11 = (W8.N) this.f55630L;
                        p210v.L l6 = this.f55631M;
                        m7.i.b bVarI = n11.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
                        p247y7.AbstractC7350t.c(bVarI);
                        v.N.a aVar5 = new v.N.a(l6, (W8.InterfaceC1822z0) bVarI);
                        this.f55632N.f(aVar5);
                        aVar = this.f55632N.f55614b;
                        pVar = this.f55633O;
                        java.lang.Object obj3 = this.f55634P;
                        p210v.N n12 = this.f55632N;
                        this.f55630L = aVar5;
                        this.f55625G = aVar;
                        this.f55626H = pVar;
                        this.f55627I = obj3;
                        this.f55628J = n12;
                        this.f55629K = 1;
                        if (aVar.c(null, this) == objG) {
                            return objG;
                        }
                        obj2 = obj3;
                        aVar2 = aVar5;
                        n6 = n12;
                    } else {
                        if (r6 != 1) {
                            if (r6 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n10 = (p210v.N) this.f55626H;
                            aVar4 = (p059f9.a) this.f55625G;
                            aVar3 = (v.N.a) this.f55630L;
                            try {
                                p087i7.x.b(obj);
                                p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
                                aVar4.d(null);
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
                                throw th;
                            }
                        }
                        n6 = (p210v.N) this.f55628J;
                        obj2 = this.f55627I;
                        pVar = (p237x7.p) this.f55626H;
                        p059f9.a aVar6 = (p059f9.a) this.f55625G;
                        aVar2 = (v.N.a) this.f55630L;
                        p087i7.x.b(obj);
                        aVar = aVar6;
                    }
                    this.f55630L = aVar2;
                    this.f55625G = aVar;
                    this.f55626H = n6;
                    this.f55627I = null;
                    this.f55628J = null;
                    this.f55629K = 2;
                    java.lang.Object objU = pVar.u(obj2, this);
                    if (objU == objG) {
                        return objG;
                    }
                    n10 = n6;
                    aVar4 = aVar;
                    obj = objU;
                    aVar3 = aVar2;
                    p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (java.lang.Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    n10 = n6;
                    p200u.AbstractC7162c0.a(n10.f55613a, aVar3, null);
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
            return ((v.N.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            v.N.c cVar = new v.N.c(this.f55631M, this.f55632N, this.f55633O, this.f55634P, eVar);
            cVar.f55630L = obj;
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(v.N.a aVar) {
        v.N.a aVar2;
        do {
            aVar2 = (v.N.a) this.f55613a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
            }
        } while (!p200u.AbstractC7162c0.a(this.f55613a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final java.lang.Object d(p210v.L l6, p237x7.l lVar, p127m7.e eVar) {
        return W8.O.f(new v.N.b(l6, this, lVar, null), eVar);
    }

    public final java.lang.Object e(java.lang.Object obj, p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
        return W8.O.f(new v.N.c(l6, this, pVar, obj, null), eVar);
    }
}
