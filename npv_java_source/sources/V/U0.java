package V;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends V.AbstractC1744s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.C1719i f14733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f14734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private W8.InterfaceC1822z0 f14735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Throwable f14736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f14737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.util.List f14738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p170r.L f14739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final X.b f14740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f14741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.List f14742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.Map f14743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.Map f14744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.util.List f14745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private java.util.Set f14746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private W8.InterfaceC1794l f14747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private V.U0.b f14750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Z8.y f14752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final W8.InterfaceC1819y f14753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p127m7.i f14754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final V.U0.c f14755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final V.U0.a f14730y = new V.U0.a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f14731z = 8;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Z8.y f14728A = Z8.P.a(Y.a.b());

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f14729B = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(V.U0.c cVar) {
            Y.g gVar;
            Y.g gVarAdd;
            do {
                gVar = (Y.g) V.U0.f14728A.getValue();
                gVarAdd = gVar.add((java.lang.Object) cVar);
                if (gVar == gVarAdd) {
                    return;
                }
            } while (!V.U0.f14728A.g(gVar, gVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(V.U0.c cVar) {
            Y.g gVar;
            Y.g gVarRemove;
            do {
                gVar = (Y.g) V.U0.f14728A.getValue();
                gVarRemove = gVar.remove((java.lang.Object) cVar);
                if (gVar == gVarRemove) {
                    return;
                }
            } while (!V.U0.f14728A.g(gVar, gVarRemove));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f14756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Exception f14757b;

        public b(boolean z6, java.lang.Exception exc) {
            this.f14756a = z6;
            this.f14757b = exc;
        }

        public java.lang.Exception a() {
            return this.f14757b;
        }
    }

    private final class c {
        public c() {
        }
    }

    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        public final void a() {
            W8.InterfaceC1794l interfaceC1794lA0;
            java.lang.Object obj = V.U0.this.f14734c;
            V.U0 u6 = V.U0.this;
            synchronized (obj) {
                interfaceC1794lA0 = u6.a0();
                if (((V.U0.d) u6.f14752u.getValue()).compareTo(V.U0.d.ShuttingDown) <= 0) {
                    throw W8.AbstractC1801o0.a("Recomposer shutdown; frame clock awaiter will never resume", u6.f14736e);
                }
            }
            if (interfaceC1794lA0 != null) {
                i7.w.a aVar = p087i7.w.f46751D;
                interfaceC1794lA0.t(p087i7.w.b(p087i7.M.f46721a));
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.U0 f14768D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ java.lang.Throwable f14769E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.U0 u6, java.lang.Throwable th) {
                super(1);
                this.f14768D = u6;
                this.f14769E = th;
            }

            public final void a(java.lang.Throwable th) {
                java.lang.Object obj = this.f14768D.f14734c;
                V.U0 u6 = this.f14768D;
                java.lang.Throwable th2 = this.f14769E;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof java.util.concurrent.CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                p087i7.AbstractC6661g.a(th2, th);
                            }
                        } catch (java.lang.Throwable th3) {
                            throw th3;
                        }
                    }
                    u6.f14736e = th2;
                    u6.f14752u.setValue(V.U0.d.ShutDown);
                    p087i7.M m6 = p087i7.M.f46721a;
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((java.lang.Throwable) obj);
                return p087i7.M.f46721a;
            }
        }

        f() {
            super(1);
        }

        public final void a(java.lang.Throwable th) {
            W8.InterfaceC1794l interfaceC1794l;
            W8.InterfaceC1794l interfaceC1794l2;
            java.util.concurrent.CancellationException cancellationExceptionA = W8.AbstractC1801o0.a("Recomposer effect job completed", th);
            java.lang.Object obj = V.U0.this.f14734c;
            V.U0 u6 = V.U0.this;
            synchronized (obj) {
                try {
                    W8.InterfaceC1822z0 interfaceC1822z0 = u6.f14735d;
                    interfaceC1794l = null;
                    if (interfaceC1822z0 != null) {
                        u6.f14752u.setValue(V.U0.d.ShuttingDown);
                        if (u6.f14749r) {
                            if (u6.f14747p != null) {
                                interfaceC1794l2 = u6.f14747p;
                            }
                            u6.f14747p = null;
                            interfaceC1822z0.e1(new V.U0.f.a(u6, th));
                            interfaceC1794l = interfaceC1794l2;
                        } else {
                            interfaceC1822z0.o(cancellationExceptionA);
                        }
                        interfaceC1794l2 = null;
                        u6.f14747p = null;
                        interfaceC1822z0.e1(new V.U0.f.a(u6, th));
                        interfaceC1794l = interfaceC1794l2;
                    } else {
                        u6.f14736e = cancellationExceptionA;
                        u6.f14752u.setValue(V.U0.d.ShutDown);
                        p087i7.M m6 = p087i7.M.f46721a;
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC1794l != null) {
                i7.w.a aVar = p087i7.w.f46751D;
                interfaceC1794l.t(p087i7.w.b(p087i7.M.f46721a));
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f14770G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14771H;

        g(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f14770G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p147o7.b.a(((V.U0.d) this.f14771H) == V.U0.d.ShutDown);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(V.U0.d dVar, p127m7.e eVar) {
            return ((V.U0.g) x(dVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            V.U0.g gVar = new V.U0.g(eVar);
            gVar.f14771H = obj;
            return gVar;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p170r.L f14772D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.G f14773E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p170r.L l6, V.G g6) {
            super(0);
            this.f14772D = l6;
            this.f14773E = g6;
        }

        public final void a() {
            p170r.L l6 = this.f14772D;
            V.G g6 = this.f14773E;
            java.lang.Object[] objArr = l6.f53341b;
            long[] jArr = l6.f53340a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            g6.r(objArr[(i6 << 3) + i11]);
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i6 == length) {
                    return;
                } else {
                    i6++;
                }
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G f14774D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(V.G g6) {
            super(1);
            this.f14774D = g6;
        }

        public final void a(java.lang.Object obj) {
            this.f14774D.a(obj);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    static final class j extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f14775G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f14776H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f14777I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.q f14779K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1723j0 f14780L;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f14781G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f14782H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p237x7.q f14783I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1723j0 f14784J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p237x7.q qVar, V.InterfaceC1723j0 interfaceC1723j0, p127m7.e eVar) {
                super(2, eVar);
                this.f14783I = qVar;
                this.f14784J = interfaceC1723j0;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f14781G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    W8.N n6 = (W8.N) this.f14782H;
                    p237x7.q qVar = this.f14783I;
                    V.InterfaceC1723j0 interfaceC1723j0 = this.f14784J;
                    this.f14781G = 1;
                    if (qVar.j(n6, interfaceC1723j0, this) == objG) {
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
                return ((V.U0.j.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                V.U0.j.a aVar = new V.U0.j.a(this.f14783I, this.f14784J, eVar);
                aVar.f14782H = obj;
                return aVar;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.U0 f14785D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(V.U0 u6) {
                super(2);
                this.f14785D = u6;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0084 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:31:0x0086 A[Catch: all -> 0x0074, LOOP:0: B:11:0x0038->B:31:0x0086, LOOP_END, TryCatch #0 {all -> 0x0074, blocks: (B:4:0x000e, B:6:0x0020, B:8:0x0028, B:11:0x0038, B:13:0x0048, B:15:0x0054, B:17:0x005d, B:19:0x0066, B:27:0x007d, B:24:0x0076, B:31:0x0086, B:41:0x00ae, B:32:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009c, B:40:0x00aa), top: B:50:0x000e }] */
            /* JADX WARN: Code duplicated, block: B:53:0x00ae A[EDGE_INSN: B:53:0x00ae->B:41:0x00ae BREAK  A[LOOP:0: B:11:0x0038->B:31:0x0086], SYNTHETIC] */
            public final void a(java.util.Set set, p051f0.k kVar) {
                W8.InterfaceC1794l interfaceC1794lA0;
                int i6;
                java.lang.Object obj = this.f14785D.f14734c;
                V.U0 u6 = this.f14785D;
                synchronized (obj) {
                    try {
                        if (((V.U0.d) u6.f14752u.getValue()).compareTo(V.U0.d.Idle) >= 0) {
                            p170r.L l6 = u6.f14739h;
                            if (set instanceof X.d) {
                                p170r.W wD = ((X.d) set).d();
                                java.lang.Object[] objArr = wD.f53341b;
                                long[] jArr = wD.f53340a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j6 = jArr[i10];
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i10 != length) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            int i11 = 8;
                                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((255 & j6) < 128) {
                                                    java.lang.Object obj2 = objArr[(i10 << 3) + i13];
                                                    if (!(obj2 instanceof p051f0.z) || ((p051f0.z) obj2).q(p051f0.g.a(1))) {
                                                        l6.h(obj2);
                                                    }
                                                    i6 = 8;
                                                } else {
                                                    i6 = i11;
                                                }
                                                j6 >>= i6;
                                                i13++;
                                                i11 = i6;
                                            }
                                            if (i12 != i11) {
                                                break;
                                            } else if (i10 != length) {
                                                break;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (java.lang.Object obj3 : set) {
                                    if (!(obj3 instanceof p051f0.z) || ((p051f0.z) obj3).q(p051f0.g.a(1))) {
                                        l6.h(obj3);
                                    }
                                }
                            }
                            interfaceC1794lA0 = u6.a0();
                        } else {
                            interfaceC1794lA0 = null;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC1794lA0 != null) {
                    i7.w.a aVar = p087i7.w.f46751D;
                    interfaceC1794lA0.t(p087i7.w.b(p087i7.M.f46721a));
                }
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                a((java.util.Set) obj, (p051f0.k) obj2);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p237x7.q qVar, V.InterfaceC1723j0 interfaceC1723j0, p127m7.e eVar) {
            super(2, eVar);
            this.f14779K = qVar;
            this.f14780L = interfaceC1723j0;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:28:0x0099, B:30:0x009f, B:33:0x00a5), top: B:58:0x0099 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00ce A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:44:0x00c8, B:46:0x00ce, B:49:0x00d4), top: B:56:0x00c8 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            W8.InterfaceC1822z0 interfaceC1822z0M;
            p051f0.f fVar;
            java.lang.Throwable th;
            java.util.List listI0;
            java.lang.Object obj2;
            V.U0 u6;
            java.lang.Object obj3;
            V.U0 u10;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f14776H;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (p051f0.f) this.f14775G;
                interfaceC1822z0M = (W8.InterfaceC1822z0) this.f14777I;
                try {
                    p087i7.x.b(obj);
                    fVar.e();
                    obj3 = V.U0.this.f14734c;
                    u10 = V.U0.this;
                    synchronized (obj3) {
                        try {
                            if (u10.f14735d == interfaceC1822z0M) {
                                u10.f14735d = null;
                            }
                            u10.a0();
                        } catch (java.lang.Throwable th2) {
                            throw th2;
                        }
                    }
                    V.U0.f14730y.d(V.U0.this.f14755x);
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    fVar.e();
                    obj2 = V.U0.this.f14734c;
                    u6 = V.U0.this;
                    synchronized (obj2) {
                        try {
                            if (u6.f14735d == interfaceC1822z0M) {
                                u6.f14735d = null;
                            }
                            u6.a0();
                            V.U0.f14730y.d(V.U0.this.f14755x);
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            p087i7.x.b(obj);
            interfaceC1822z0M = W8.C0.m(((W8.N) this.f14777I).getCoroutineContext());
            V.U0.this.w0(interfaceC1822z0M);
            p051f0.f fVarI = p051f0.k.f44821e.i(new V.U0.j.b(V.U0.this));
            V.U0.f14730y.c(V.U0.this.f14755x);
            try {
                java.lang.Object obj4 = V.U0.this.f14734c;
                V.U0 u11 = V.U0.this;
                synchronized (obj4) {
                    listI0 = u11.i0();
                }
                int size = listI0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((V.G) listI0.get(i10)).x();
                }
                V.U0.j.a aVar = new V.U0.j.a(this.f14779K, this.f14780L, null);
                this.f14777I = interfaceC1822z0M;
                this.f14775G = fVarI;
                this.f14776H = 1;
                if (W8.O.f(aVar, this) == objG) {
                    return objG;
                }
                fVar = fVarI;
                fVar.e();
                obj3 = V.U0.this.f14734c;
                u10 = V.U0.this;
                synchronized (obj3) {
                    if (u10.f14735d == interfaceC1822z0M) {
                        u10.f14735d = null;
                    }
                    u10.a0();
                    V.U0.f14730y.d(V.U0.this.f14755x);
                    return p087i7.M.f46721a;
                }
            } catch (java.lang.Throwable th5) {
                fVar = fVarI;
                th = th5;
                fVar.e();
                obj2 = V.U0.this.f14734c;
                u6 = V.U0.this;
                synchronized (obj2) {
                    if (u6.f14735d == interfaceC1822z0M) {
                        u6.f14735d = null;
                    }
                    u6.a0();
                }
                V.U0.f14730y.d(V.U0.this.f14755x);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((V.U0.j) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            V.U0.j jVar = V.U0.this.new j(this.f14779K, this.f14780L, eVar);
            jVar.f14777I = obj;
            return jVar;
        }
    }

    static final class k extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f14786G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f14787H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f14788I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f14789J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.Object f14790K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        java.lang.Object f14791L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        java.lang.Object f14792M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        java.lang.Object f14793N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f14794O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14795P;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.U0 f14797D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p170r.L f14798E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p170r.L f14799F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ java.util.List f14800G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ java.util.List f14801H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p170r.L f14802I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ java.util.List f14803J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p170r.L f14804K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ java.util.Set f14805L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.U0 u6, p170r.L l6, p170r.L l10, java.util.List list, java.util.List list2, p170r.L l11, java.util.List list3, p170r.L l12, java.util.Set set) {
                super(1);
                this.f14797D = u6;
                this.f14798E = l6;
                this.f14799F = l10;
                this.f14800G = list;
                this.f14801H = list2;
                this.f14802I = l11;
                this.f14803J = list3;
                this.f14804K = l12;
                this.f14805L = set;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x01b9  */
            /* JADX WARN: Code duplicated, block: B:103:0x01c8 A[Catch: all -> 0x01ee, Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:98:0x01b0, B:101:0x01ba, B:103:0x01c8, B:105:0x01d4, B:107:0x01de), top: B:204:0x01b0, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:105:0x01d4 A[Catch: all -> 0x01ee, Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:98:0x01b0, B:101:0x01ba, B:103:0x01c8, B:105:0x01d4, B:107:0x01de), top: B:204:0x01b0, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:107:0x01de A[Catch: all -> 0x01ee, Exception -> 0x01f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01f0, blocks: (B:98:0x01b0, B:101:0x01ba, B:103:0x01c8, B:105:0x01d4, B:107:0x01de), top: B:204:0x01b0, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:117:0x0204  */
            /* JADX WARN: Code duplicated, block: B:119:0x020e A[LOOP:4: B:101:0x01ba->B:119:0x020e, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:204:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:217:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:225:0x023a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:237:0x0213 A[EDGE_INSN: B:237:0x0213->B:120:0x0213 BREAK  A[LOOP:4: B:101:0x01ba->B:119:0x020e], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:238:0x0213 A[EDGE_INSN: B:238:0x0213->B:120:0x0213 BREAK  A[LOOP:4: B:101:0x01ba->B:119:0x020e], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:240:0x0186 A[EDGE_INSN: B:240:0x0186->B:88:0x0186 BREAK  A[LOOP:6: B:64:0x012c->B:84:0x0179], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:241:0x0186 A[EDGE_INSN: B:241:0x0186->B:88:0x0186 BREAK  A[LOOP:6: B:64:0x012c->B:84:0x0179], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:63:0x012b  */
            /* JADX WARN: Code duplicated, block: B:67:0x013d  */
            /* JADX WARN: Code duplicated, block: B:69:0x0149  */
            /* JADX WARN: Code duplicated, block: B:71:0x0153  */
            /* JADX WARN: Code duplicated, block: B:82:0x0175  */
            /* JADX WARN: Code duplicated, block: B:84:0x0179 A[LOOP:6: B:64:0x012c->B:84:0x0179, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:87:0x0184  */
            /* JADX WARN: Code duplicated, block: B:95:0x01a8  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v32, types: [V.K1] */
            /* JADX WARN: Type inference failed for: r0v68, types: [V.K1] */
            /* JADX WARN: Type inference failed for: r1v0, types: [V.U0$k$a] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [V.K1] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void a(long j6) throws java.lang.Throwable {
                java.util.Set set;
                java.util.Set set2;
                ?? r6;
                V.U0 u6;
                java.lang.Object[] objArr;
                long[] jArr;
                int length;
                int i6;
                long j10;
                java.lang.Object[] objArr2;
                int i10;
                int i11;
                java.lang.Object[] objArr3;
                long[] jArr2;
                int length2;
                int i12;
                long j11;
                java.lang.Object[] objArr4;
                int i13;
                int i14;
                ?? r10 = this;
                if (r10.f14797D.e0()) {
                    V.U0 u10 = r10.f14797D;
                    V.K1 k6 = V.K1.f14689a;
                    java.lang.Object objA = k6.a("Recomposer:animation");
                    try {
                        u10.f14733b.l(j6);
                        p051f0.k.f44821e.n();
                        p087i7.M m6 = p087i7.M.f46721a;
                        k6.b(objA);
                    } catch (java.lang.Throwable th) {
                        V.K1.f14689a.b(objA);
                        throw th;
                    }
                }
                V.U0 u11 = r10.f14797D;
                p170r.L l6 = r10.f14798E;
                p170r.L l10 = r10.f14799F;
                java.util.List list = r10.f14800G;
                java.util.List list2 = r10.f14801H;
                p170r.L l11 = r10.f14802I;
                java.util.List list3 = r10.f14803J;
                p170r.L l12 = r10.f14804K;
                java.util.Set set3 = r10.f14805L;
                ?? A6 = V.K1.f14689a.a("Recomposer:recompose");
                try {
                    u11.u0();
                    synchronized (u11.f14734c) {
                        try {
                            try {
                                X.b bVar = u11.f14740i;
                                int iT = bVar.t();
                                if (iT > 0) {
                                    java.lang.Object[] objArrS = bVar.s();
                                    int i15 = 0;
                                    while (true) {
                                        java.lang.Object[] objArr5 = objArrS;
                                        list.add((V.G) objArrS[i15]);
                                        i15++;
                                        if (i15 >= iT) {
                                            break;
                                        } else {
                                            objArrS = objArr5;
                                        }
                                    }
                                }
                                u11.f14740i.j();
                                p087i7.M m10 = p087i7.M.f46721a;
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            V.K1.f14689a.b(r10);
                            throw th;
                        }
                    }
                    l6.m();
                    l10.m();
                    r10 = r10;
                    A6 = A6;
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        r10 = A6;
                        try {
                            try {
                                int size = list.size();
                                for (int i16 = 0; i16 < size; i16++) {
                                    V.G g6 = (V.G) list.get(i16);
                                    V.G gP0 = u11.p0(g6, l6);
                                    if (gP0 != null) {
                                        list3.add(gP0);
                                        p087i7.M m11 = p087i7.M.f46721a;
                                    }
                                    l10.h(g6);
                                }
                                list.clear();
                                if (l6.e() || u11.f14740i.x()) {
                                    synchronized (u11.f14734c) {
                                        try {
                                            java.util.List listI0 = u11.i0();
                                            int size2 = listI0.size();
                                            for (int i17 = 0; i17 < size2; i17++) {
                                                V.G g10 = (V.G) listI0.get(i17);
                                                if (!l10.a(g10) && g10.c(set3)) {
                                                    list.add(g10);
                                                }
                                            }
                                            X.b bVar2 = u11.f14740i;
                                            int iT2 = bVar2.t();
                                            int i18 = 0;
                                            int i19 = 0;
                                            while (i18 < iT2) {
                                                V.G g11 = (V.G) bVar2.s()[i18];
                                                if (l10.a(g11) || list.contains(g11)) {
                                                    set2 = set3;
                                                    if (i19 > 0) {
                                                        bVar2.s()[i18 - i19] = bVar2.s()[i18];
                                                    }
                                                } else {
                                                    set2 = set3;
                                                    list.add(g11);
                                                    i19++;
                                                }
                                                i18++;
                                                set3 = set2;
                                            }
                                            set = set3;
                                            int i20 = iT2 - i19;
                                            p097j7.AbstractC6872n.w(bVar2.s(), null, i20, iT2);
                                            bVar2.M(i20);
                                            p087i7.M m12 = p087i7.M.f46721a;
                                        } catch (java.lang.Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                } else {
                                    set = set3;
                                }
                                if (list.isEmpty()) {
                                    while (true) {
                                        try {
                                            V.U0.k.M(list2, u11);
                                            if (!list2.isEmpty()) {
                                                l11.u(u11.o0(list2, l6));
                                            }
                                        } catch (java.lang.Exception e6) {
                                            V.U0.r0(u11, e6, null, true, 2, null);
                                            V.U0.k.L(u11, list, list2, list3, l11, l12, l6, l10);
                                            r6 = r10;
                                        }
                                    }
                                }
                                A6 = r10;
                                set3 = set;
                                r10 = this;
                            } catch (java.lang.Exception e10) {
                                V.U0.r0(u11, e10, null, true, 2, null);
                                V.U0.k.L(u11, list, list2, list3, l11, l12, l6, l10);
                                list.clear();
                                r6 = r10;
                            }
                        } catch (java.lang.Throwable th5) {
                            list.clear();
                            throw th5;
                        }
                        V.K1.f14689a.b(r6);
                    }
                    if (!(!list3.isEmpty())) {
                        r10 = A6;
                        if (l11.e()) {
                            l12.w(l11);
                            objArr = l11.f53341b;
                            jArr = l11.f53340a;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i6 = 0;
                                while (true) {
                                    j10 = jArr[i6];
                                    u6 = u11;
                                    if ((j10 & ((~j10) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i10 = 8 - ((~(i6 - length)) >>> 31);
                                        i11 = 0;
                                        while (i11 < i10) {
                                            if ((j10 & 255) < 128) {
                                                ((V.G) objArr[(i6 << 3) + i11]).k();
                                            }
                                            j10 >>= 8;
                                            i11++;
                                            objArr = objArr;
                                        }
                                        objArr2 = objArr;
                                        if (i10 == 8) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        objArr2 = objArr;
                                    }
                                    if (i6 != length) {
                                        break;
                                        break;
                                    } else {
                                        i6++;
                                        u11 = u6;
                                        objArr = objArr2;
                                    }
                                }
                            } else {
                                u6 = u11;
                            }
                            l11.m();
                        } else {
                            u6 = u11;
                        }
                        if (l12.e()) {
                            objArr3 = l12.f53341b;
                            jArr2 = l12.f53340a;
                            length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                i12 = 0;
                                while (true) {
                                    j11 = jArr2[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        i14 = 0;
                                        while (i14 < i13) {
                                            if ((j11 & 255) < 128) {
                                                ((V.G) objArr3[(i12 << 3) + i14]).v();
                                            }
                                            j11 >>= 8;
                                            i14++;
                                            objArr3 = objArr3;
                                        }
                                        objArr4 = objArr3;
                                        if (i13 == 8) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        objArr4 = objArr3;
                                    }
                                    if (i12 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i12++;
                                        objArr3 = objArr4;
                                    }
                                }
                            }
                            l12.m();
                        }
                        synchronized (u6.f14734c) {
                            u6.a0();
                            p051f0.k.f44821e.g();
                            l10.m();
                            l6.m();
                            u6.f14746o = null;
                            p087i7.M m13 = p087i7.M.f46721a;
                            V.K1.f14689a.b(r10);
                            return;
                        }
                    }
                    u11.f14732a = u11.c0() + 1;
                    try {
                        int size3 = list3.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            l12.h((V.G) list3.get(i21));
                        }
                        int size4 = list3.size();
                        for (int i22 = 0; i22 < size4; i22++) {
                            ((V.G) list3.get(i22)).n();
                        }
                        list3.clear();
                        r10 = A6;
                        try {
                            if (l11.e()) {
                                try {
                                    l12.w(l11);
                                    objArr = l11.f53341b;
                                    jArr = l11.f53340a;
                                    length = jArr.length - 2;
                                    if (length >= 0) {
                                        i6 = 0;
                                        while (true) {
                                            j10 = jArr[i6];
                                            u6 = u11;
                                            if ((j10 & ((~j10) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                                i10 = 8 - ((~(i6 - length)) >>> 31);
                                                i11 = 0;
                                                while (i11 < i10) {
                                                    if ((j10 & 255) < 128) {
                                                        try {
                                                            ((V.G) objArr[(i6 << 3) + i11]).k();
                                                        } catch (java.lang.Exception e11) {
                                                            e = e11;
                                                            V.U0.r0(u6, e, null, false, 6, null);
                                                            V.U0.k.L(u6, list, list2, list3, l11, l12, l6, l10);
                                                            l11.m();
                                                            r6 = r10;
                                                            V.K1.f14689a.b(r6);
                                                        }
                                                    }
                                                    j10 >>= 8;
                                                    i11++;
                                                    objArr = objArr;
                                                }
                                                objArr2 = objArr;
                                                if (i10 == 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr2 = objArr;
                                            }
                                            if (i6 != length) {
                                                break;
                                            }
                                            i6++;
                                            u11 = u6;
                                            objArr = objArr2;
                                        }
                                    } else {
                                        u6 = u11;
                                    }
                                    l11.m();
                                } catch (java.lang.Exception e12) {
                                    e = e12;
                                    u6 = u11;
                                }
                            } else {
                                u6 = u11;
                            }
                            if (l12.e()) {
                                try {
                                    try {
                                        objArr3 = l12.f53341b;
                                        jArr2 = l12.f53340a;
                                        length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            i12 = 0;
                                            while (true) {
                                                j11 = jArr2[i12];
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    i14 = 0;
                                                    while (i14 < i13) {
                                                        if ((j11 & 255) < 128) {
                                                            ((V.G) objArr3[(i12 << 3) + i14]).v();
                                                        }
                                                        j11 >>= 8;
                                                        i14++;
                                                        objArr3 = objArr3;
                                                    }
                                                    objArr4 = objArr3;
                                                    if (i13 == 8) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr4 = objArr3;
                                                }
                                                if (i12 != length2) {
                                                    break;
                                                }
                                                i12++;
                                                objArr3 = objArr4;
                                            }
                                        }
                                        l12.m();
                                    } catch (java.lang.Exception e13) {
                                        V.U0.r0(u6, e13, null, false, 6, null);
                                        V.U0.k.L(u6, list, list2, list3, l11, l12, l6, l10);
                                        l12.m();
                                        r6 = r10;
                                        V.K1.f14689a.b(r6);
                                    }
                                } catch (java.lang.Throwable th6) {
                                    l12.m();
                                    throw th6;
                                }
                            }
                            synchronized (u6.f14734c) {
                                u6.a0();
                            }
                            p051f0.k.f44821e.g();
                            l10.m();
                            l6.m();
                            u6.f14746o = null;
                            p087i7.M m14 = p087i7.M.f46721a;
                            V.K1.f14689a.b(r10);
                            return;
                        } catch (java.lang.Throwable th7) {
                            l11.m();
                            throw th7;
                        }
                    } catch (java.lang.Exception e14) {
                        r6 = A6;
                        try {
                            V.U0.r0(u11, e14, null, false, 6, null);
                            V.U0.k.L(u11, list, list2, list3, l11, l12, l6, l10);
                            list3.clear();
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            list3.clear();
                            throw th;
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        list3.clear();
                        throw th;
                    }
                    V.K1.f14689a.b(r6);
                } catch (java.lang.Throwable th10) {
                    th = th10;
                    r10 = A6;
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) throws java.lang.Throwable {
                a(((java.lang.Number) obj).longValue());
                return p087i7.M.f46721a;
            }
        }

        k(p127m7.e eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:23:0x0081 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0083 A[Catch: all -> 0x002b, LOOP:1: B:13:0x0041->B:24:0x0083, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:7:0x001c, B:10:0x002e, B:13:0x0041, B:15:0x004c, B:17:0x0058, B:19:0x0062, B:20:0x0072, B:24:0x0083, B:25:0x008c, B:28:0x0099, B:30:0x00a8, B:32:0x00b4, B:34:0x00be, B:35:0x00c8, B:39:0x00d4, B:40:0x00d7, B:43:0x00e7, B:45:0x00f6, B:47:0x0102, B:49:0x010c, B:50:0x011c, B:56:0x0138, B:57:0x013b), top: B:62:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[Catch: all -> 0x002b, LOOP:3: B:28:0x0099->B:39:0x00d4, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:7:0x001c, B:10:0x002e, B:13:0x0041, B:15:0x004c, B:17:0x0058, B:19:0x0062, B:20:0x0072, B:24:0x0083, B:25:0x008c, B:28:0x0099, B:30:0x00a8, B:32:0x00b4, B:34:0x00be, B:35:0x00c8, B:39:0x00d4, B:40:0x00d7, B:43:0x00e7, B:45:0x00f6, B:47:0x0102, B:49:0x010c, B:50:0x011c, B:56:0x0138, B:57:0x013b), top: B:62:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:66:0x008c A[EDGE_INSN: B:66:0x008c->B:25:0x008c BREAK  A[LOOP:1: B:13:0x0041->B:24:0x0083], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x00d7 A[EDGE_INSN: B:71:0x00d7->B:40:0x00d7 BREAK  A[LOOP:3: B:28:0x0099->B:39:0x00d4], SYNTHETIC] */
        public static final void L(V.U0 u6, java.util.List list, java.util.List list2, java.util.List list3, p170r.L l6, p170r.L l10, p170r.L l11, p170r.L l12) {
            synchronized (u6.f14734c) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        V.G g6 = (V.G) list3.get(i6);
                        g6.u();
                        u6.v0(g6);
                    }
                    list3.clear();
                    java.lang.Object[] objArr = l6.f53341b;
                    long[] jArr = l6.f53340a;
                    int length = jArr.length - 2;
                    long j6 = -9187201950435737472L;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j10 = jArr[i10];
                            long[] jArr2 = jArr;
                            if ((((~j10) << 7) & j10 & j6) != j6) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j10 & 255) < 128) {
                                        V.G g10 = (V.G) objArr[(i10 << 3) + i12];
                                        g10.u();
                                        u6.v0(g10);
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                                if (i10 != length) {
                                    break;
                                }
                                i10++;
                                jArr = jArr2;
                                j6 = -9187201950435737472L;
                            } else if (i10 != length) {
                                break;
                                break;
                            } else {
                                i10++;
                                jArr = jArr2;
                                j6 = -9187201950435737472L;
                            }
                        }
                    }
                    l6.m();
                    java.lang.Object[] objArr2 = l10.f53341b;
                    long[] jArr3 = l10.f53340a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j11 = jArr3[i13];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i13 != length2) {
                                    break;
                                    break;
                                }
                                i13++;
                            } else {
                                int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if ((j11 & 255) < 128) {
                                        ((V.G) objArr2[(i13 << 3) + i15]).v();
                                    }
                                    j11 >>= 8;
                                }
                                if (i14 != 8) {
                                    break;
                                } else if (i13 != length2) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    l10.m();
                    l11.m();
                    java.lang.Object[] objArr3 = l12.f53341b;
                    long[] jArr4 = l12.f53340a;
                    int length3 = jArr4.length - 2;
                    if (length3 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j12 = jArr4[i16];
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((j12 & 255) < 128) {
                                        V.G g11 = (V.G) objArr3[(i16 << 3) + i18];
                                        g11.u();
                                        u6.v0(g11);
                                    }
                                    j12 >>= 8;
                                }
                                if (i17 != 8) {
                                    break;
                                }
                            }
                            if (i16 == length3) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                    }
                    l12.m();
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void M(java.util.List list, V.U0 u6) {
            list.clear();
            synchronized (u6.f14734c) {
                try {
                    java.util.List list2 = u6.f14742k;
                    int size = list2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        list.add((V.C1738o0) list2.get(i6));
                    }
                    u6.f14742k.clear();
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x00be  */
        /* JADX WARN: Code duplicated, block: B:15:0x00da A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x00db  */
        /* JADX WARN: Code duplicated, block: B:19:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:21:0x0138 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0139  */
        /* JADX WARN: Code duplicated, block: B:25:0x0151  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0139 -> B:23:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0151 -> B:24:0x014d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: V.U0.k.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(W8.N n6, V.InterfaceC1723j0 interfaceC1723j0, p127m7.e eVar) {
            V.U0.k kVar = V.U0.this.new k(eVar);
            kVar.f14795P = interfaceC1723j0;
            return kVar.B(p087i7.M.f46721a);
        }
    }

    static final class l extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G f14806D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p170r.L f14807E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(V.G g6, p170r.L l6) {
            super(1);
            this.f14806D = g6;
            this.f14807E = l6;
        }

        public final void a(java.lang.Object obj) {
            this.f14806D.r(obj);
            p170r.L l6 = this.f14807E;
            if (l6 != null) {
                l6.h(obj);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    public U0(p127m7.i iVar) {
        V.C1719i c1719i = new V.C1719i(new V.U0.e());
        this.f14733b = c1719i;
        this.f14734c = new java.lang.Object();
        this.f14737f = new java.util.ArrayList();
        this.f14739h = new p170r.L(0, 1, null);
        this.f14740i = new X.b(new V.G[16], 0);
        this.f14741j = new java.util.ArrayList();
        this.f14742k = new java.util.ArrayList();
        this.f14743l = new java.util.LinkedHashMap();
        this.f14744m = new java.util.LinkedHashMap();
        this.f14752u = Z8.P.a(V.U0.d.Inactive);
        W8.InterfaceC1819y interfaceC1819yA = W8.C0.a((W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h));
        interfaceC1819yA.e1(new V.U0.f());
        this.f14753v = interfaceC1819yA;
        this.f14754w = iVar.o0(c1719i).o0(interfaceC1819yA);
        this.f14755x = new V.U0.c();
    }

    private final p237x7.l A0(V.G g6, p170r.L l6) {
        return new V.U0.l(g6, l6);
    }

    private final void V(V.G g6) {
        this.f14737f.add(g6);
        this.f14738g = null;
    }

    private final void W(p051f0.C6541c c6541c) {
        try {
            if (c6541c.C() instanceof f0.l.a) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            c6541c.d();
        } catch (java.lang.Throwable th) {
            c6541c.d();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object X(p127m7.e eVar) {
        W8.C1798n c1798n;
        if (h0()) {
            return p087i7.M.f46721a;
        }
        W8.C1798n c1798n2 = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n2.E();
        synchronized (this.f14734c) {
            if (h0()) {
                c1798n = c1798n2;
            } else {
                this.f14747p = c1798n2;
                c1798n = null;
            }
        }
        if (c1798n != null) {
            i7.w.a aVar = p087i7.w.f46751D;
            c1798n.t(p087i7.w.b(p087i7.M.f46721a));
        }
        java.lang.Object objX = c1798n2.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    private final void Z() {
        this.f14737f.clear();
        this.f14738g = p097j7.AbstractC6879v.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    public final W8.InterfaceC1794l a0() {
        V.U0.d dVar;
        int i6 = 0;
        int i10 = 1;
        p247y7.AbstractC7342k abstractC7342k = null;
        if (((V.U0.d) this.f14752u.getValue()).compareTo(V.U0.d.ShuttingDown) <= 0) {
            Z();
            this.f14739h = new p170r.L(i6, i10, abstractC7342k);
            this.f14740i.j();
            this.f14741j.clear();
            this.f14742k.clear();
            this.f14745n = null;
            W8.InterfaceC1794l interfaceC1794l = this.f14747p;
            if (interfaceC1794l != null) {
                W8.InterfaceC1794l.a.a(interfaceC1794l, null, 1, null);
            }
            this.f14747p = null;
            this.f14750s = null;
            return null;
        }
        if (this.f14750s != null) {
            dVar = V.U0.d.Inactive;
        } else if (this.f14735d == null) {
            this.f14739h = new p170r.L(i6, i10, abstractC7342k);
            this.f14740i.j();
            if (f0()) {
                dVar = V.U0.d.InactivePendingWork;
            } else {
                dVar = V.U0.d.Inactive;
            }
        } else {
            dVar = (this.f14740i.x() || this.f14739h.e() || (this.f14741j.isEmpty() ^ true) || (this.f14742k.isEmpty() ^ true) || this.f14748q > 0 || f0()) ? V.U0.d.PendingWork : V.U0.d.Idle;
        }
        this.f14752u.setValue(dVar);
        if (dVar != V.U0.d.PendingWork) {
            return null;
        }
        W8.InterfaceC1794l interfaceC1794l2 = this.f14747p;
        this.f14747p = null;
        return interfaceC1794l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        int i6;
        java.util.List listM;
        synchronized (this.f14734c) {
            try {
                if (!this.f14743l.isEmpty()) {
                    java.util.List listZ = p097j7.AbstractC6879v.z(this.f14743l.values());
                    this.f14743l.clear();
                    listM = new java.util.ArrayList(listZ.size());
                    int size = listZ.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        V.C1738o0 c1738o0 = (V.C1738o0) listZ.get(i10);
                        listM.add(p087i7.B.a(c1738o0, this.f14744m.get(c1738o0)));
                    }
                    this.f14744m.clear();
                } else {
                    listM = p097j7.AbstractC6879v.m();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        int size2 = listM.size();
        for (i6 = 0; i6 < size2; i6++) {
            p087i7.u uVar = (p087i7.u) listM.get(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        boolean zF0;
        synchronized (this.f14734c) {
            zF0 = f0();
        }
        return zF0;
    }

    private final boolean f0() {
        return !this.f14751t && this.f14733b.k();
    }

    private final boolean g0() {
        return this.f14740i.x() || f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        boolean z6;
        synchronized (this.f14734c) {
            z6 = this.f14739h.e() || this.f14740i.x() || f0();
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List i0() {
        java.util.List listM = this.f14738g;
        if (listM == null) {
            java.util.List list = this.f14737f;
            listM = list.isEmpty() ? p097j7.AbstractC6879v.m() : new java.util.ArrayList(list);
            this.f14738g = listM;
        }
        return listM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j0() {
        boolean z6;
        synchronized (this.f14734c) {
            z6 = !this.f14749r;
        }
        if (z6) {
            return true;
        }
        java.util.Iterator it = this.f14753v.N().iterator();
        while (it.hasNext()) {
            if (((W8.InterfaceC1822z0) it.next()).f()) {
                return true;
            }
        }
        return false;
    }

    private final void m0(V.G g6) {
        synchronized (this.f14734c) {
            java.util.List list = this.f14742k;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (p247y7.AbstractC7350t.b(((V.C1738o0) list.get(i6)).b(), g6)) {
                    p087i7.M m6 = p087i7.M.f46721a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (true) {
                        n0(arrayList, this, g6);
                        if (!(!arrayList.isEmpty())) {
                            return;
                        } else {
                            o0(arrayList, null);
                        }
                    }
                }
            }
        }
    }

    private static final void n0(java.util.List list, V.U0 u6, V.G g6) {
        list.clear();
        synchronized (u6.f14734c) {
            try {
                java.util.Iterator it = u6.f14742k.iterator();
                while (it.hasNext()) {
                    V.C1738o0 c1738o0 = (V.C1738o0) it.next();
                    if (p247y7.AbstractC7350t.b(c1738o0.b(), g6)) {
                        list.add(c1738o0);
                        it.remove();
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List o0(java.util.List list, p170r.L l6) {
        java.util.ArrayList arrayList;
        java.util.HashMap map = new java.util.HashMap(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = list.get(i6);
            V.G gB = ((V.C1738o0) obj).b();
            java.lang.Object arrayList2 = map.get(gB);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                map.put(gB, arrayList2);
            }
            ((java.util.ArrayList) arrayList2).add(obj);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            V.G g6 = (V.G) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            V.AbstractC1741q.O(!g6.p());
            p051f0.C6541c c6541cO = p051f0.k.f44821e.o(s0(g6), A0(g6, l6));
            try {
                p051f0.k kVarL = c6541cO.l();
                try {
                    synchronized (this.f14734c) {
                        arrayList = new java.util.ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            V.C1738o0 c1738o0 = (V.C1738o0) list2.get(i10);
                            java.util.Map map2 = this.f14743l;
                            c1738o0.c();
                            arrayList.add(p087i7.B.a(c1738o0, V.V0.a(map2, null)));
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        if (((p087i7.u) arrayList.get(i11)).d() != null) {
                            int size4 = arrayList.size();
                            for (int i12 = 0; i12 < size4; i12++) {
                                if (((p087i7.u) arrayList.get(i12)).d() == null) {
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
                                    int size5 = arrayList.size();
                                    for (int i13 = 0; i13 < size5; i13++) {
                                        p087i7.u uVar = (p087i7.u) arrayList.get(i13);
                                        V.C1738o0 c1738o1 = uVar.d() == null ? (V.C1738o0) uVar.c() : null;
                                        if (c1738o1 != null) {
                                            arrayList3.add(c1738o1);
                                        }
                                    }
                                    synchronized (this.f14734c) {
                                        p097j7.AbstractC6879v.C(this.f14742k, arrayList3);
                                        p087i7.M m6 = p087i7.M.f46721a;
                                    }
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i14 = 0; i14 < size6; i14++) {
                                        java.lang.Object obj2 = arrayList.get(i14);
                                        if (((p087i7.u) obj2).d() != null) {
                                            arrayList4.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList4;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    g6.q(arrayList);
                    p087i7.M m10 = p087i7.M.f46721a;
                    c6541cO.s(kVarL);
                    W(c6541cO);
                } catch (java.lang.Throwable th) {
                    c6541cO.s(kVarL);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                W(c6541cO);
                throw th2;
            }
        }
        return p097j7.AbstractC6879v.T0(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V.G p0(V.G g6, p170r.L l6) {
        java.util.Set set;
        if (g6.p() || g6.l() || ((set = this.f14746o) != null && set.contains(g6))) {
            return null;
        }
        p051f0.C6541c c6541cO = p051f0.k.f44821e.o(s0(g6), A0(g6, l6));
        try {
            p051f0.k kVarL = c6541cO.l();
            if (l6 != null) {
                try {
                    if (l6.e()) {
                        g6.b(new V.U0.h(l6, g6));
                    }
                } catch (java.lang.Throwable th) {
                    c6541cO.s(kVarL);
                    throw th;
                }
            }
            boolean zW = g6.w();
            c6541cO.s(kVarL);
            W(c6541cO);
            if (zW) {
                return g6;
            }
            return null;
        } catch (java.lang.Throwable th2) {
            W(c6541cO);
            throw th2;
        }
    }

    private final void q0(java.lang.Exception exc, V.G g6, boolean z6) throws java.lang.Exception {
        int i6 = 0;
        if (!((java.lang.Boolean) f14729B.get()).booleanValue() || (exc instanceof V.C1731m)) {
            synchronized (this.f14734c) {
                V.U0.b bVar = this.f14750s;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.f14750s = new V.U0.b(false, exc);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            throw exc;
        }
        synchronized (this.f14734c) {
            try {
                V.AbstractC1698b.f("Error was captured in composition while live edit was enabled.", exc);
                this.f14741j.clear();
                this.f14740i.j();
                this.f14739h = new p170r.L(i6, 1, null);
                this.f14742k.clear();
                this.f14743l.clear();
                this.f14744m.clear();
                this.f14750s = new V.U0.b(z6, exc);
                if (g6 != null) {
                    v0(g6);
                }
                a0();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void r0(V.U0 u6, java.lang.Exception exc, V.G g6, boolean z6, int i6, java.lang.Object obj) throws java.lang.Exception {
        if ((i6 & 2) != 0) {
            g6 = null;
        }
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        u6.q0(exc, g6, z6);
    }

    private final p237x7.l s0(V.G g6) {
        return new V.U0.i(g6);
    }

    private final java.lang.Object t0(p237x7.q qVar, p127m7.e eVar) {
        java.lang.Object objG = W8.AbstractC1784g.g(this.f14733b, new V.U0.j(qVar, V.AbstractC1729l0.a(eVar.getContext()), null), eVar);
        return objG == p137n7.b.g() ? objG : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u0() {
        java.util.List listI0;
        boolean zG0;
        int i6 = 1;
        synchronized (this.f14734c) {
            if (this.f14739h.d()) {
                return g0();
            }
            java.util.Set setA = X.e.a(this.f14739h);
            p247y7.AbstractC7342k abstractC7342k = null;
            int i10 = 0;
            this.f14739h = new p170r.L(i10, i6, abstractC7342k);
            synchronized (this.f14734c) {
                listI0 = i0();
            }
            try {
                int size = listI0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((V.G) listI0.get(i11)).m(setA);
                    if (((V.U0.d) this.f14752u.getValue()).compareTo(V.U0.d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f14734c) {
                    this.f14739h = new p170r.L(i10, i6, abstractC7342k);
                    p087i7.M m6 = p087i7.M.f46721a;
                }
                synchronized (this.f14734c) {
                    if (a0() != null) {
                        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    zG0 = g0();
                }
                return zG0;
            } catch (java.lang.Throwable th) {
                synchronized (this.f14734c) {
                    this.f14739h.i(setA);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(V.G g6) {
        java.util.List arrayList = this.f14745n;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f14745n = arrayList;
        }
        if (!arrayList.contains(g6)) {
            arrayList.add(g6);
        }
        x0(g6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(W8.InterfaceC1822z0 interfaceC1822z0) {
        synchronized (this.f14734c) {
            java.lang.Throwable th = this.f14736e;
            if (th != null) {
                throw th;
            }
            if (((V.U0.d) this.f14752u.getValue()).compareTo(V.U0.d.ShuttingDown) <= 0) {
                throw new java.lang.IllegalStateException("Recomposer shut down".toString());
            }
            if (this.f14735d != null) {
                throw new java.lang.IllegalStateException("Recomposer already running".toString());
            }
            this.f14735d = interfaceC1822z0;
            a0();
        }
    }

    private final void x0(V.G g6) {
        this.f14737f.remove(g6);
        this.f14738g = null;
    }

    public final void Y() {
        synchronized (this.f14734c) {
            try {
                if (((V.U0.d) this.f14752u.getValue()).compareTo(V.U0.d.Idle) >= 0) {
                    this.f14752u.setValue(V.U0.d.ShuttingDown);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        W8.InterfaceC1822z0.a.a(this.f14753v, null, 1, null);
    }

    @Override // V.AbstractC1744s
    public void a(V.G g6, p237x7.p pVar) throws java.lang.Exception {
        boolean zP = g6.p();
        try {
            f0.k.a aVar = p051f0.k.f44821e;
            p051f0.C6541c c6541cO = aVar.o(s0(g6), A0(g6, null));
            try {
                p051f0.k kVarL = c6541cO.l();
                try {
                    g6.j(pVar);
                    p087i7.M m6 = p087i7.M.f46721a;
                    c6541cO.s(kVarL);
                    W(c6541cO);
                    if (!zP) {
                        aVar.g();
                    }
                    synchronized (this.f14734c) {
                        if (((V.U0.d) this.f14752u.getValue()).compareTo(V.U0.d.ShuttingDown) > 0 && !i0().contains(g6)) {
                            V(g6);
                        }
                    }
                    try {
                        m0(g6);
                        try {
                            g6.n();
                            g6.k();
                            if (zP) {
                                return;
                            }
                            aVar.g();
                        } catch (java.lang.Exception e6) {
                            r0(this, e6, null, false, 6, null);
                        }
                    } catch (java.lang.Exception e10) {
                        q0(e10, g6, true);
                    }
                } catch (java.lang.Throwable th) {
                    c6541cO.s(kVarL);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                W(c6541cO);
                throw th2;
            }
        } catch (java.lang.Exception e11) {
            q0(e11, g6, true);
        }
    }

    @Override // V.AbstractC1744s
    public boolean c() {
        return ((java.lang.Boolean) f14729B.get()).booleanValue();
    }

    public final long c0() {
        return this.f14732a;
    }

    @Override // V.AbstractC1744s
    public boolean d() {
        return false;
    }

    public final Z8.N d0() {
        return this.f14752u;
    }

    @Override // V.AbstractC1744s
    public boolean e() {
        return false;
    }

    @Override // V.AbstractC1744s
    public int g() {
        return 1000;
    }

    @Override // V.AbstractC1744s
    public p127m7.i h() {
        return this.f14754w;
    }

    @Override // V.AbstractC1744s
    public void j(V.C1738o0 c1738o0) {
        W8.InterfaceC1794l interfaceC1794lA0;
        synchronized (this.f14734c) {
            this.f14742k.add(c1738o0);
            interfaceC1794lA0 = a0();
        }
        if (interfaceC1794lA0 != null) {
            i7.w.a aVar = p087i7.w.f46751D;
            interfaceC1794lA0.t(p087i7.w.b(p087i7.M.f46721a));
        }
    }

    @Override // V.AbstractC1744s
    public void k(V.G g6) {
        W8.InterfaceC1794l interfaceC1794lA0;
        synchronized (this.f14734c) {
            if (this.f14740i.l(g6)) {
                interfaceC1794lA0 = null;
            } else {
                this.f14740i.d(g6);
                interfaceC1794lA0 = a0();
            }
        }
        if (interfaceC1794lA0 != null) {
            i7.w.a aVar = p087i7.w.f46751D;
            interfaceC1794lA0.t(p087i7.w.b(p087i7.M.f46721a));
        }
    }

    public final java.lang.Object k0(p127m7.e eVar) {
        java.lang.Object objV = Z8.AbstractC1871h.v(d0(), new V.U0.g(null), eVar);
        return objV == p137n7.b.g() ? objV : p087i7.M.f46721a;
    }

    @Override // V.AbstractC1744s
    public V.AbstractC1735n0 l(V.C1738o0 c1738o0) {
        V.AbstractC1735n0 abstractC1735n0;
        synchronized (this.f14734c) {
            abstractC1735n0 = (V.AbstractC1735n0) this.f14744m.remove(c1738o0);
        }
        return abstractC1735n0;
    }

    public final void l0() {
        synchronized (this.f14734c) {
            this.f14751t = true;
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    @Override // V.AbstractC1744s
    public void m(java.util.Set set) {
    }

    @Override // V.AbstractC1744s
    public void o(V.G g6) {
        synchronized (this.f14734c) {
            try {
                java.util.Set linkedHashSet = this.f14746o;
                if (linkedHashSet == null) {
                    linkedHashSet = new java.util.LinkedHashSet();
                    this.f14746o = linkedHashSet;
                }
                linkedHashSet.add(g6);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // V.AbstractC1744s
    public void r(V.G g6) {
        synchronized (this.f14734c) {
            x0(g6);
            this.f14740i.A(g6);
            this.f14741j.remove(g6);
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public final void y0() {
        W8.InterfaceC1794l interfaceC1794lA0;
        synchronized (this.f14734c) {
            if (this.f14751t) {
                this.f14751t = false;
                interfaceC1794lA0 = a0();
            } else {
                interfaceC1794lA0 = null;
            }
        }
        if (interfaceC1794lA0 != null) {
            i7.w.a aVar = p087i7.w.f46751D;
            interfaceC1794lA0.t(p087i7.w.b(p087i7.M.f46721a));
        }
    }

    public final java.lang.Object z0(p127m7.e eVar) {
        java.lang.Object objT0 = t0(new V.U0.k(null), eVar);
        return objT0 == p137n7.b.g() ? objT0 : p087i7.M.f46721a;
    }
}
