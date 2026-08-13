package G6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f3088G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f3089H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ U6.b f3090I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U6.b bVar, p127m7.e eVar) {
            super(2, eVar);
            this.f3090I = bVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f3088G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) this.f3089H;
                U6.b.d dVar = (U6.b.d) this.f3090I;
                io.ktor.utils.io.g gVarA = tVar.a();
                this.f3088G = 1;
                if (dVar.d(gVarA, this) == objG) {
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
        public final java.lang.Object u(io.ktor.utils.io.t tVar, p127m7.e eVar) {
            return ((G6.l.a) x(tVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            G6.l.a aVar = new G6.l.a(this.f3090I, eVar);
            aVar.f3089H = obj;
            return aVar;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f3091G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f3092H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f3093I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f3094J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.Object f3095K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f3096L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f3097M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ X9.InterfaceC1838f f3098N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ p127m7.i f3099O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ O6.e f3100P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X9.InterfaceC1838f interfaceC1838f, p127m7.i iVar, O6.e eVar, p127m7.e eVar2) {
            super(2, eVar2);
            this.f3098N = interfaceC1838f;
            this.f3099O = iVar;
            this.f3100P = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p087i7.M K(p247y7.M m6, X9.InterfaceC1838f interfaceC1838f, O6.e eVar, p127m7.i iVar, java.nio.ByteBuffer byteBuffer) throws java.lang.Throwable {
            java.lang.Object objB;
            try {
                m6.f57252C = interfaceC1838f.read(byteBuffer);
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    i7.w.a aVar = p087i7.w.f46751D;
                    objB = p087i7.w.b(W8.C0.m(iVar).e0());
                } catch (java.lang.Throwable th2) {
                    i7.w.a aVar2 = p087i7.w.f46751D;
                    objB = p087i7.w.b(p087i7.x.a(th2));
                }
                if (p087i7.w.g(objB)) {
                    objB = null;
                }
                java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) objB;
                if (cancellationException != null) {
                    th = cancellationException;
                }
                throw G6.l.m(th, eVar);
            }
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:51:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c1 -> B:8:0x002b). Please report as a decompilation issue!!! */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            java.lang.Throwable th;
            java.io.Closeable closeable;
            java.lang.Throwable th2;
            io.ktor.utils.io.t tVar;
            final p127m7.i iVar;
            final O6.e eVar;
            final p247y7.M m6;
            final X9.InterfaceC1838f interfaceC1838f;
            java.io.Closeable closeable2;
            io.ktor.utils.io.t tVar2;
            p127m7.i iVar2;
            O6.e eVar2;
            X9.InterfaceC1838f interfaceC1838f2;
            p247y7.M m10;
            io.ktor.utils.io.g gVarA;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f3096L;
            try {
                try {
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        io.ktor.utils.io.t tVar3 = (io.ktor.utils.io.t) this.f3097M;
                        X9.InterfaceC1838f interfaceC1838f3 = this.f3098N;
                        p127m7.i iVar3 = this.f3099O;
                        tVar = tVar3;
                        iVar = iVar3;
                        eVar = this.f3100P;
                        m6 = new p247y7.M();
                        interfaceC1838f = interfaceC1838f3;
                        closeable2 = interfaceC1838f;
                        if (interfaceC1838f.isOpen() || !W8.C0.p(iVar) || m6.f57252C < 0) {
                            p087i7.M m11 = p087i7.M.f46721a;
                            if (closeable2 != null) {
                                try {
                                    closeable2.close();
                                } catch (java.lang.Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            th2 = null;
                        } else {
                            io.ktor.utils.io.g gVarA2 = tVar.a();
                            p237x7.l lVar = new p237x7.l() { // from class: G6.m
                                @Override // p237x7.l
                                public final java.lang.Object l(java.lang.Object obj2) {
                                    return G6.l.b.K(m6, interfaceC1838f, eVar, iVar, (java.nio.ByteBuffer) obj2);
                                }
                            };
                            this.f3097M = tVar;
                            this.f3091G = closeable2;
                            this.f3092H = iVar;
                            this.f3093I = eVar;
                            this.f3094J = interfaceC1838f;
                            this.f3095K = m6;
                            this.f3096L = 1;
                            if (io.ktor.utils.io.l.b(gVarA2, 0, lVar, this, 1, null) == objG) {
                                return objG;
                            }
                            tVar2 = tVar;
                            iVar2 = iVar;
                            eVar2 = eVar;
                            m10 = m6;
                            interfaceC1838f2 = interfaceC1838f;
                            closeable = closeable2;
                            gVarA = tVar2.a();
                            this.f3097M = tVar2;
                            this.f3091G = closeable;
                            this.f3092H = iVar2;
                            this.f3093I = eVar2;
                            this.f3094J = interfaceC1838f2;
                            this.f3095K = m10;
                            this.f3096L = 2;
                            if (gVarA.g(this) == objG) {
                                return objG;
                            }
                        }
                        if (th2 == null) {
                            return p087i7.M.f46721a;
                        }
                        throw th2;
                    }
                    if (i6 == 1) {
                        m10 = (p247y7.M) this.f3095K;
                        interfaceC1838f2 = (X9.InterfaceC1838f) this.f3094J;
                        eVar2 = (O6.e) this.f3093I;
                        iVar2 = (p127m7.i) this.f3092H;
                        closeable = (java.io.Closeable) this.f3091G;
                        tVar2 = (io.ktor.utils.io.t) this.f3097M;
                        p087i7.x.b(obj);
                        gVarA = tVar2.a();
                        this.f3097M = tVar2;
                        this.f3091G = closeable;
                        this.f3092H = iVar2;
                        this.f3093I = eVar2;
                        this.f3094J = interfaceC1838f2;
                        this.f3095K = m10;
                        this.f3096L = 2;
                        if (gVarA.g(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m10 = (p247y7.M) this.f3095K;
                        interfaceC1838f2 = (X9.InterfaceC1838f) this.f3094J;
                        eVar2 = (O6.e) this.f3093I;
                        iVar2 = (p127m7.i) this.f3092H;
                        closeable = (java.io.Closeable) this.f3091G;
                        tVar2 = (io.ktor.utils.io.t) this.f3097M;
                        p087i7.x.b(obj);
                    }
                    m6 = m10;
                    interfaceC1838f = interfaceC1838f2;
                    eVar = eVar2;
                    iVar = iVar2;
                    closeable2 = closeable;
                    tVar = tVar2;
                    if (interfaceC1838f.isOpen()) {
                    }
                    p087i7.M m12 = p087i7.M.f46721a;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    th2 = null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    closeable = closeable2;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (java.lang.Throwable th5) {
                            p087i7.AbstractC6661g.a(th, th5);
                        }
                    }
                    th2 = th;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            if (th2 == null) {
                return p087i7.M.f46721a;
            }
            throw th2;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(io.ktor.utils.io.t tVar, p127m7.e eVar) {
            return ((G6.l.b) x(tVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            G6.l.b bVar = new G6.l.b(this.f3098N, this.f3099O, this.f3100P, eVar);
            bVar.f3097M = obj;
            return bVar;
        }
    }

    public static final H9.A h(final U6.b bVar, final p127m7.i iVar) {
        p247y7.AbstractC7350t.f(bVar, "<this>");
        p247y7.AbstractC7350t.f(iVar, "callContext");
        if (bVar instanceof U6.b.a) {
            byte[] bArrD = ((U6.b.a) bVar).d();
            return H9.A.f4535a.a(bArrD, H9.w.f4831e.b(java.lang.String.valueOf(bVar.b())), 0, bArrD.length);
        }
        if (bVar instanceof U6.b.c) {
            return new G6.s(bVar.a(), new p237x7.a() { // from class: G6.j
                @Override // p237x7.a
                public final java.lang.Object b() {
                    return G6.l.i(bVar);
                }
            });
        }
        if (bVar instanceof U6.b.d) {
            return new G6.s(bVar.a(), new p237x7.a() { // from class: G6.k
                @Override // p237x7.a
                public final java.lang.Object b() {
                    return G6.l.j(iVar, bVar);
                }
            });
        }
        if (bVar instanceof U6.b.AbstractC0282b) {
            return H9.A.f4535a.a(new byte[0], null, 0, 0);
        }
        throw new p087i7.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.d i(U6.b bVar) {
        return ((U6.b.c) bVar).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.d j(p127m7.i iVar, U6.b bVar) {
        return io.ktor.utils.io.k.m(W8.C1810t0.f15533C, iVar, false, new G6.l.a(bVar, null), 2, null).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.z k(O6.e eVar, p127m7.i iVar) {
        final H9.z.a aVar = new H9.z.a();
        aVar.h(eVar.h().toString());
        F6.t.d(eVar.e(), eVar.b(), new p237x7.p() { // from class: G6.i
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return G6.l.l(aVar, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        aVar.e(eVar.f().d(), N9.f.a(eVar.f().d()) ? h(eVar.b(), iVar) : null);
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M l(H9.z.a aVar, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(str2, "value");
        if (p247y7.AbstractC7350t.b(str, T6.C1673v.f13241a.g())) {
            return p087i7.M.f46721a;
        }
        aVar.a(str, str2);
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable m(java.lang.Throwable th, O6.e eVar) {
        return th instanceof java.net.SocketTimeoutException ? I6.I.e(eVar, th) : th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.x.a n(H9.x.a aVar, I6.G g6) {
        java.lang.Long lB = g6.b();
        if (lB != null) {
            aVar.b(I6.I.h(lB.longValue()), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        java.lang.Long lD = g6.d();
        if (lD != null) {
            long jLongValue = lD.longValue();
            long jH = I6.I.h(jLongValue);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            aVar.M(jH, timeUnit);
            aVar.O(I6.I.h(jLongValue), timeUnit);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.d o(X9.InterfaceC1838f interfaceC1838f, p127m7.i iVar, O6.e eVar) {
        return io.ktor.utils.io.k.m(W8.C1810t0.f15533C, iVar, false, new G6.l.b(interfaceC1838f, iVar, eVar, null), 2, null).b();
    }
}
