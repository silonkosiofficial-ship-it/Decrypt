package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final io.ktor.utils.io.k.a f47661a = new io.ktor.utils.io.k.a();

    public static final class a implements p127m7.e {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p127m7.i f47662C = p127m7.j.f51198C;

        a() {
        }

        @Override // p127m7.e
        public p127m7.i getContext() {
            return this.f47662C;
        }

        @Override // p127m7.e
        public void t(java.lang.Object obj) {
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {
        b(java.lang.Object obj) {
            super(1, obj, io.ktor.utils.io.g.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((io.ktor.utils.io.g) this.f57287D).e(eVar);
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f47663G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f47664H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f47665I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f47666J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.a f47667K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.p pVar, io.ktor.utils.io.a aVar, p127m7.e eVar) {
            super(2, eVar);
            this.f47666J = pVar;
            this.f47667K = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x009d A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:29:0x008c, B:31:0x009d, B:26:0x006d), top: B:70:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00bb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00cb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x0103 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [W8.z0] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v9, types: [W8.y, W8.z0] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            io.ktor.utils.io.a aVar;
            java.lang.Throwable th;
            java.lang.Throwable th2;
            W8.N n6;
            io.ktor.utils.io.a aVar2;
            java.lang.Object objG = p137n7.b.g();
            ?? r6 = this.f47664H;
            try {
                try {
                    switch (r6) {
                        case 0:
                            p087i7.x.b(obj);
                            n6 = (W8.N) this.f47665I;
                            W8.InterfaceC1819y interfaceC1819yA = W8.C0.a(W8.C0.m(n6.getCoroutineContext()));
                            p237x7.p pVar = this.f47666J;
                            io.ktor.utils.io.t tVar = new io.ktor.utils.io.t(this.f47667K, n6.getCoroutineContext().o0(interfaceC1819yA));
                            this.f47665I = n6;
                            this.f47663G = interfaceC1819yA;
                            this.f47664H = 1;
                            r6 = interfaceC1819yA;
                            if (pVar.u(tVar, this) == objG) {
                                return objG;
                            }
                            r6.K0();
                            if (W8.C0.m(n6.getCoroutineContext()).isCancelled()) {
                                this.f47667K.k(W8.C0.m(n6.getCoroutineContext()).e0());
                                break;
                            }
                            this.f47665I = n6;
                            this.f47663G = null;
                            this.f47664H = 2;
                            if (r6.g0(this) == objG) {
                                return objG;
                            }
                            aVar2 = this.f47667K;
                            i7.w.a aVar3 = p087i7.w.f46751D;
                            this.f47665I = null;
                            this.f47664H = 3;
                            if (aVar2.e(this) == objG) {
                                return objG;
                            }
                            p087i7.w.b(p087i7.M.f46721a);
                            return p087i7.M.f46721a;
                        case 1:
                            W8.InterfaceC1819y interfaceC1819y = (W8.InterfaceC1819y) this.f47663G;
                            n6 = (W8.N) this.f47665I;
                            p087i7.x.b(obj);
                            r6 = interfaceC1819y;
                            r6.K0();
                            if (W8.C0.m(n6.getCoroutineContext()).isCancelled()) {
                                this.f47667K.k(W8.C0.m(n6.getCoroutineContext()).e0());
                                break;
                            }
                            this.f47665I = n6;
                            this.f47663G = null;
                            this.f47664H = 2;
                            if (r6.g0(this) == objG) {
                                return objG;
                            }
                            aVar2 = this.f47667K;
                            i7.w.a aVar4 = p087i7.w.f46751D;
                            this.f47665I = null;
                            this.f47664H = 3;
                            if (aVar2.e(this) == objG) {
                                return objG;
                            }
                            p087i7.w.b(p087i7.M.f46721a);
                            return p087i7.M.f46721a;
                        case 2:
                            p087i7.x.b(obj);
                            aVar2 = this.f47667K;
                            i7.w.a aVar5 = p087i7.w.f46751D;
                            this.f47665I = null;
                            this.f47664H = 3;
                            if (aVar2.e(this) == objG) {
                                return objG;
                            }
                            p087i7.w.b(p087i7.M.f46721a);
                            return p087i7.M.f46721a;
                        case 3:
                            p087i7.x.b(obj);
                            p087i7.w.b(p087i7.M.f46721a);
                            return p087i7.M.f46721a;
                        case 4:
                            p087i7.x.b(obj);
                            aVar = this.f47667K;
                            i7.w.a aVar6 = p087i7.w.f46751D;
                            this.f47665I = null;
                            this.f47664H = 5;
                            if (aVar.e(this) == objG) {
                                return objG;
                            }
                            p087i7.w.b(p087i7.M.f46721a);
                            return p087i7.M.f46721a;
                        case 5:
                            p087i7.x.b(obj);
                            p087i7.w.b(p087i7.M.f46721a);
                            return p087i7.M.f46721a;
                        case 6:
                            java.lang.Throwable th3 = (java.lang.Throwable) this.f47663G;
                            p087i7.x.b(obj);
                            th = th3;
                            io.ktor.utils.io.a aVar7 = this.f47667K;
                            try {
                                i7.w.a aVar8 = p087i7.w.f46751D;
                                this.f47665I = th;
                                this.f47663G = null;
                                this.f47664H = 7;
                                if (aVar7.e(this) == objG) {
                                    return objG;
                                }
                                th = th;
                                p087i7.w.b(p087i7.M.f46721a);
                                throw th;
                            } catch (java.lang.Throwable th4) {
                                th = th;
                                th2 = th4;
                                i7.w.a aVar9 = p087i7.w.f46751D;
                                p087i7.w.b(p087i7.x.a(th2));
                                throw th;
                            }
                        case 7:
                            th = (java.lang.Throwable) this.f47665I;
                            try {
                                p087i7.x.b(obj);
                                p087i7.w.b(p087i7.M.f46721a);
                                throw th;
                            } catch (java.lang.Throwable th5) {
                                th2 = th5;
                                i7.w.a aVar10 = p087i7.w.f46751D;
                                p087i7.w.b(p087i7.x.a(th2));
                                throw th;
                            }
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        W8.C0.c(r6, "Exception thrown while writing to channel", th6);
                        this.f47667K.k(th6);
                        this.f47665I = n6;
                        this.f47663G = null;
                        this.f47664H = 4;
                        if (r6.g0(this) == objG) {
                            return objG;
                        }
                        aVar = this.f47667K;
                        i7.w.a aVar11 = p087i7.w.f46751D;
                        this.f47665I = null;
                        this.f47664H = 5;
                        if (aVar.e(this) == objG) {
                            return objG;
                        }
                        p087i7.w.b(p087i7.M.f46721a);
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        this.f47665I = n6;
                        this.f47663G = th;
                        this.f47664H = 6;
                        if (r6.g0(this) == objG) {
                            return objG;
                        }
                    }
                }
            } catch (java.lang.Throwable th8) {
                i7.w.a aVar12 = p087i7.w.f46751D;
                p087i7.w.b(p087i7.x.a(th8));
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((io.ktor.utils.io.k.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            io.ktor.utils.io.k.c cVar = new io.ktor.utils.io.k.c(this.f47666J, this.f47667K, eVar);
            cVar.f47665I = obj;
            return cVar;
        }
    }

    public static final void c(io.ktor.utils.io.g gVar, java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        if (th == null) {
            d(new io.ktor.utils.io.k.b(gVar));
        } else {
            gVar.k(th);
        }
    }

    public static final void d(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "<this>");
        p029c9.a.c(lVar, f47661a);
    }

    public static final void e(io.ktor.utils.io.m mVar, final p237x7.a aVar) {
        p247y7.AbstractC7350t.f(mVar, "<this>");
        p247y7.AbstractC7350t.f(aVar, "block");
        mVar.a().e1(new p237x7.l() { // from class: io.ktor.utils.io.j
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return io.ktor.utils.io.k.f(aVar, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M f(p237x7.a aVar, java.lang.Throwable th) {
        aVar.b();
        return p087i7.M.f46721a;
    }

    public static final boolean g(io.ktor.utils.io.m mVar) {
        p247y7.AbstractC7350t.f(mVar, "<this>");
        return mVar.a().f1();
    }

    public static final java.lang.Object h(io.ktor.utils.io.g gVar, byte[] bArr, int i6, int i10, p127m7.e eVar) {
        gVar.c().write(bArr, i6, i10);
        java.lang.Object objA = io.ktor.utils.io.h.a(gVar, eVar);
        return objA == p137n7.b.g() ? objA : p087i7.M.f46721a;
    }

    public static /* synthetic */ java.lang.Object i(io.ktor.utils.io.g gVar, byte[] bArr, int i6, int i10, p127m7.e eVar, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return h(gVar, bArr, i6, i10, eVar);
    }

    public static final java.lang.Object j(io.ktor.utils.io.g gVar, p149o9.q qVar, p127m7.e eVar) {
        gVar.c().X(qVar);
        java.lang.Object objA = io.ktor.utils.io.h.a(gVar, eVar);
        return objA == p137n7.b.g() ? objA : p087i7.M.f46721a;
    }

    public static final io.ktor.utils.io.s k(W8.N n6, p127m7.i iVar, final io.ktor.utils.io.a aVar, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(n6, "<this>");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        p247y7.AbstractC7350t.f(aVar, "channel");
        p247y7.AbstractC7350t.f(pVar, "block");
        W8.InterfaceC1822z0 interfaceC1822z0D = W8.AbstractC1788i.d(n6, iVar, null, new io.ktor.utils.io.k.c(pVar, aVar, null), 2, null);
        interfaceC1822z0D.e1(new p237x7.l() { // from class: io.ktor.utils.io.i
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return io.ktor.utils.io.k.n(aVar, (java.lang.Throwable) obj);
            }
        });
        return new io.ktor.utils.io.s(aVar, interfaceC1822z0D);
    }

    public static final io.ktor.utils.io.s l(W8.N n6, p127m7.i iVar, boolean z6, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(n6, "<this>");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        p247y7.AbstractC7350t.f(pVar, "block");
        return k(n6, iVar, new io.ktor.utils.io.a(false, 1, null), pVar);
    }

    public static /* synthetic */ io.ktor.utils.io.s m(W8.N n6, p127m7.i iVar, boolean z6, p237x7.p pVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return l(n6, iVar, z6, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M n(io.ktor.utils.io.a aVar, java.lang.Throwable th) {
        if (th != null && !aVar.b()) {
            aVar.k(th);
        }
        return p087i7.M.f46721a;
    }
}
