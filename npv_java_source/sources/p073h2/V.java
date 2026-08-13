package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2.V.b f46029b = new h2.V.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2.V.c f46030a;

    private static final class a extends java.util.concurrent.CancellationException {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p073h2.V f46031C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p073h2.V v6) {
            super("Cancelled isolated runner");
            p247y7.AbstractC7350t.f(v6, "runner");
            this.f46031C = v6;
        }

        public final p073h2.V a() {
            return this.f46031C;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.V f46032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f46033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p059f9.a f46034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private W8.InterfaceC1822z0 f46035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f46036e;

        static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f46037F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f46038G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            java.lang.Object f46039H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46040I;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            int f46042K;

            a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f46040I = obj;
                this.f46042K |= Integer.MIN_VALUE;
                return h2.V.c.this.a(null, this);
            }
        }

        static final class b extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f46043F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f46044G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            java.lang.Object f46045H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            int f46046I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46047J;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            int f46049L;

            b(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f46047J = obj;
                this.f46049L |= Integer.MIN_VALUE;
                return h2.V.c.this.b(0, null, this);
            }
        }

        public c(p073h2.V v6, boolean z6) {
            p247y7.AbstractC7350t.f(v6, "singleRunner");
            this.f46032a = v6;
            this.f46033b = z6;
            this.f46034c = p059f9.g.b(false, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final java.lang.Object a(W8.InterfaceC1822z0 interfaceC1822z0, p127m7.e eVar) {
            h2.V.c.a aVar;
            p059f9.a aVar2;
            h2.V.c cVar;
            if (eVar instanceof h2.V.c.a) {
                aVar = (h2.V.c.a) eVar;
                int i6 = aVar.f46042K;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f46042K = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new h2.V.c.a(eVar);
                }
            } else {
                aVar = new h2.V.c.a(eVar);
            }
            java.lang.Object obj = aVar.f46040I;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f46042K;
            if (i10 == 0) {
                p087i7.x.b(obj);
                aVar2 = this.f46034c;
                aVar.f46037F = this;
                aVar.f46038G = interfaceC1822z0;
                aVar.f46039H = aVar2;
                aVar.f46042K = 1;
                if (aVar2.c(null, aVar) == objG) {
                    return objG;
                }
                cVar = this;
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p059f9.a aVar3 = (p059f9.a) aVar.f46039H;
                W8.InterfaceC1822z0 interfaceC1822z1 = (W8.InterfaceC1822z0) aVar.f46038G;
                cVar = (h2.V.c) aVar.f46037F;
                p087i7.x.b(obj);
                aVar2 = aVar3;
                interfaceC1822z0 = interfaceC1822z1;
            }
            try {
                if (interfaceC1822z0 == cVar.f46035d) {
                    cVar.f46035d = null;
                }
                p087i7.M m6 = p087i7.M.f46721a;
                return p087i7.M.f46721a;
            } finally {
                aVar2.d(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [W8.z0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v1, types: [f9.a] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [f9.a] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v4, types: [W8.z0] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final java.lang.Object b(int i6, W8.InterfaceC1822z0 interfaceC1822z0, p127m7.e eVar) {
            h2.V.c.b bVar;
            h2.V.c cVar;
            ?? r6;
            p059f9.a aVar;
            ?? r10;
            h2.V.c cVar2;
            int i10;
            if (eVar instanceof h2.V.c.b) {
                bVar = (h2.V.c.b) eVar;
                int i11 = bVar.f46049L;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f46049L = i11 - Integer.MIN_VALUE;
                } else {
                    bVar = new h2.V.c.b(eVar);
                }
            } else {
                bVar = new h2.V.c.b(eVar);
            }
            java.lang.Object obj = bVar.f46047J;
            java.lang.Object objG = p137n7.b.g();
            int i12 = bVar.f46049L;
            boolean z6 = true;
            try {
                if (i12 != 0) {
                    if (i12 == 1) {
                        i6 = bVar.f46046I;
                        p059f9.a aVar2 = (p059f9.a) bVar.f46045H;
                        W8.InterfaceC1822z0 interfaceC1822z1 = (W8.InterfaceC1822z0) bVar.f46044G;
                        cVar = (h2.V.c) bVar.f46043F;
                        p087i7.x.b(obj);
                        r6 = interfaceC1822z1;
                        aVar = aVar2;
                    } else {
                        if (i12 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i6 = bVar.f46046I;
                        p059f9.a aVar3 = (p059f9.a) bVar.f46045H;
                        W8.InterfaceC1822z0 interfaceC1822z2 = (W8.InterfaceC1822z0) bVar.f46044G;
                        cVar2 = (h2.V.c) bVar.f46043F;
                        p087i7.x.b(obj);
                        r10 = interfaceC1822z2;
                        aVar = aVar3;
                    }
                    cVar = cVar2;
                    r6 = r10;
                    cVar.f46035d = r6;
                    cVar.f46036e = i6;
                    interfaceC1822z0 = aVar;
                    java.lang.Boolean boolA = p147o7.b.a(z6);
                    interfaceC1822z0.d(null);
                    return boolA;
                }
                p087i7.x.b(obj);
                p059f9.a aVar4 = this.f46034c;
                bVar.f46043F = this;
                bVar.f46044G = interfaceC1822z0;
                bVar.f46045H = aVar4;
                bVar.f46046I = i6;
                bVar.f46049L = 1;
                if (aVar4.c(null, bVar) == objG) {
                    return objG;
                }
                cVar = this;
                r6 = interfaceC1822z0;
                aVar = aVar4;
                W8.InterfaceC1822z0 interfaceC1822z3 = cVar.f46035d;
                if (interfaceC1822z3 == null || !interfaceC1822z3.f() || (i10 = cVar.f46036e) < i6 || (i10 == i6 && cVar.f46033b)) {
                    if (interfaceC1822z3 != null) {
                        interfaceC1822z3.o(new h2.V.a(cVar.f46032a));
                    }
                    if (interfaceC1822z3 != null) {
                        bVar.f46043F = cVar;
                        bVar.f46044G = r6;
                        bVar.f46045H = aVar;
                        bVar.f46046I = i6;
                        bVar.f46049L = 2;
                        if (interfaceC1822z3.g0(bVar) == objG) {
                            return objG;
                        }
                        r10 = r6;
                        cVar2 = cVar;
                        aVar = aVar;
                        cVar = cVar2;
                        r6 = r10;
                    }
                    cVar.f46035d = r6;
                    cVar.f46036e = i6;
                    interfaceC1822z0 = aVar;
                } else {
                    z6 = false;
                    interfaceC1822z0 = aVar;
                }
                java.lang.Boolean boolA2 = p147o7.b.a(z6);
                interfaceC1822z0.d(null);
                return boolA2;
            } catch (java.lang.Throwable th) {
                interfaceC1822z0.d(null);
                throw th;
            }
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46050F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46051G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f46053I;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46051G = obj;
            this.f46053I |= Integer.MIN_VALUE;
            return p073h2.V.this.b(0, null, this);
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46054G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46055H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f46057J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.l f46058K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i6, p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f46057J = i6;
            this.f46058K = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [W8.z0] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [W8.z0] */
        /* JADX WARN: Type inference failed for: r3v2, types: [h2.V$c] */
        /* JADX WARN: Type inference failed for: r9v15, types: [h2.V$c] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            W8.InterfaceC1822z0 interfaceC1822z0;
            ?? r10;
            java.lang.Object objG = p137n7.b.g();
            ?? r6 = this.f46054G;
            int i6 = 4;
            try {
                if (r6 != 0) {
                    if (r6 == 1) {
                        W8.InterfaceC1822z0 interfaceC1822z1 = (W8.InterfaceC1822z0) this.f46055H;
                        p087i7.x.b(obj);
                        interfaceC1822z0 = interfaceC1822z1;
                    } else if (r6 == 2) {
                        W8.InterfaceC1822z0 interfaceC1822z2 = (W8.InterfaceC1822z0) this.f46055H;
                        p087i7.x.b(obj);
                        r6 = interfaceC1822z2;
                        r6 = interfaceC1822z0;
                        r10 = p073h2.V.this.f46030a;
                        i6 = 0;
                        this.f46055H = null;
                        this.f46054G = 3;
                        if (r10.a(r6, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (r6 != 3) {
                            if (r6 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Throwable th = (java.lang.Throwable) this.f46055H;
                            p087i7.x.b(obj);
                            throw th;
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                m7.i.b bVarI = ((W8.N) this.f46055H).getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
                if (bVarI == null) {
                    throw new java.lang.IllegalStateException("Internal error. coroutineScope should've created a job.".toString());
                }
                W8.InterfaceC1822z0 interfaceC1822z3 = (W8.InterfaceC1822z0) bVarI;
                h2.V.c cVar = p073h2.V.this.f46030a;
                int i10 = this.f46057J;
                this.f46055H = interfaceC1822z3;
                this.f46054G = 1;
                java.lang.Object objB = cVar.b(i10, interfaceC1822z3, this);
                if (objB == objG) {
                    return objG;
                }
                interfaceC1822z0 = interfaceC1822z3;
                obj = objB;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    p237x7.l lVar = this.f46058K;
                    this.f46055H = interfaceC1822z0;
                    this.f46054G = 2;
                    if (lVar.l(this) == objG) {
                        r6 = interfaceC1822z0;
                        return objG;
                    }
                    r6 = interfaceC1822z0;
                    r10 = p073h2.V.this.f46030a;
                    i6 = 0;
                    this.f46055H = null;
                    this.f46054G = 3;
                    if (r10.a(r6, this) == objG) {
                        return objG;
                    }
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th2) {
                ?? r11 = p073h2.V.this.f46030a;
                this.f46055H = th2;
                this.f46054G = i6;
                if (r11.a(r6, this) == objG) {
                    return objG;
                }
                throw th2;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((h2.V.e) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            h2.V.e eVar2 = p073h2.V.this.new e(this.f46057J, this.f46058K, eVar);
            eVar2.f46055H = obj;
            return eVar2;
        }
    }

    public V(boolean z6) {
        this.f46030a = new h2.V.c(this, z6);
    }

    public /* synthetic */ V(boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? true : z6);
    }

    public static /* synthetic */ java.lang.Object c(p073h2.V v6, int i6, p237x7.l lVar, p127m7.e eVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        return v6.b(i6, lVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(int i6, p237x7.l lVar, p127m7.e eVar) {
        h2.V.d dVar;
        p073h2.V v6;
        if (eVar instanceof h2.V.d) {
            dVar = (h2.V.d) eVar;
            int i10 = dVar.f46053I;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f46053I = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new h2.V.d(eVar);
            }
        } else {
            dVar = new h2.V.d(eVar);
        }
        java.lang.Object obj = dVar.f46051G;
        java.lang.Object objG = p137n7.b.g();
        int i11 = dVar.f46053I;
        if (i11 == 0) {
            p087i7.x.b(obj);
            try {
                h2.V.e eVar2 = new h2.V.e(i6, lVar, null);
                dVar.f46050F = this;
                dVar.f46053I = 1;
                if (W8.O.f(eVar2, dVar) == objG) {
                    return objG;
                }
            } catch (h2.V.a e6) {
                e = e6;
                v6 = this;
                if (e.a() != v6) {
                    throw e;
                }
            }
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6 = (p073h2.V) dVar.f46050F;
            try {
                p087i7.x.b(obj);
            } catch (h2.V.a e10) {
                e = e10;
                if (e.a() != v6) {
                    throw e;
                }
            }
        }
        return p087i7.M.f46721a;
    }
}
