package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements com.google.firebase.sessions.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final S5.x.c f12577f = new S5.x.c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final B7.c f12578g = P1.a.b(S5.w.f12573a.a(), new N1.b(S5.x.b.f12586D), null, null, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f12579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p127m7.i f12580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f12581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z8.InterfaceC1869f f12582e;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12583G;

        /* JADX INFO: renamed from: S5.x$a$a, reason: collision with other inner class name */
        static final class C0267a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ S5.x f12585C;

            C0267a(S5.x xVar) {
                this.f12585C = xVar;
            }

            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(S5.l lVar, p127m7.e eVar) {
                this.f12585C.f12581d.set(lVar);
                return p087i7.M.f46721a;
            }
        }

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12583G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869f = S5.x.this.f12582e;
                S5.x.a.C0267a c0267a = new S5.x.a.C0267a(S5.x.this);
                this.f12583G = 1;
                if (interfaceC1869f.b(c0267a, this) == objG) {
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
            return ((S5.x.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return S5.x.this.new a(eVar);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S5.x.b f12586D = new S5.x.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q1.f l(M1.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "ex");
            java.lang.String str = "CorruptionException in sessions DataStore in " + S5.v.f12572a.e() + '.';
            return Q1.g.a();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ F7.k[] f12587a = {p247y7.P.k(new p247y7.I(S5.x.c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final M1.h b(android.content.Context context) {
            return (M1.h) S5.x.f12578g.a(context, f12587a[0]);
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final S5.x.d f12588a = new S5.x.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Q1.f.a f12589b = Q1.h.g("session_id");

        private d() {
        }

        public final Q1.f.a a() {
            return f12589b;
        }
    }

    static final class e extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12590G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f12591H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f12592I;

        e(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12590G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1870g interfaceC1870g = (Z8.InterfaceC1870g) this.f12591H;
                Q1.f fVarA = Q1.g.a();
                this.f12591H = null;
                this.f12590G = 1;
                if (interfaceC1870g.a(fVarA, this) == objG) {
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

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Throwable th, p127m7.e eVar) {
            S5.x.e eVar2 = new S5.x.e(eVar);
            eVar2.f12591H = interfaceC1870g;
            eVar2.f12592I = th;
            return eVar2.B(p087i7.M.f46721a);
        }
    }

    public static final class f implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f12593C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S5.x f12594D;

        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f12595C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S5.x f12596D;

            /* JADX INFO: renamed from: S5.x$f$a$a, reason: collision with other inner class name */
            public static final class C0268a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f12597F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f12598G;

                public C0268a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f12597F = obj;
                    this.f12598G |= Integer.MIN_VALUE;
                    return S5.x.f.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g, S5.x xVar) {
                this.f12595C = interfaceC1870g;
                this.f12596D = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                S5.x.f.a.C0268a c0268a;
                if (eVar instanceof S5.x.f.a.C0268a) {
                    c0268a = (S5.x.f.a.C0268a) eVar;
                    int i6 = c0268a.f12598G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0268a.f12598G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0268a = new S5.x.f.a.C0268a(eVar);
                    }
                } else {
                    c0268a = new S5.x.f.a.C0268a(eVar);
                }
                java.lang.Object obj2 = c0268a.f12597F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0268a.f12598G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f12595C;
                    S5.l lVarI = this.f12596D.i((Q1.f) obj);
                    c0268a.f12598G = 1;
                    if (interfaceC1870g.a(lVarI, c0268a) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj2);
                }
                return p087i7.M.f46721a;
            }
        }

        public f(Z8.InterfaceC1869f interfaceC1869f, S5.x xVar) {
            this.f12593C = interfaceC1869f;
            this.f12594D = xVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f12593C.b(new S5.x.f.a(interfaceC1870g, this.f12594D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    static final class g extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12600G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.String f12602I;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f12603G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f12604H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ java.lang.String f12605I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(java.lang.String str, p127m7.e eVar) {
                super(2, eVar);
                this.f12605I = str;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f12603G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                ((Q1.c) this.f12604H).i(S5.x.d.f12588a.a(), this.f12605I);
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(Q1.c cVar, p127m7.e eVar) {
                return ((S5.x.g.a) x(cVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                S5.x.g.a aVar = new S5.x.g.a(this.f12605I, eVar);
                aVar.f12604H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(java.lang.String str, p127m7.e eVar) {
            super(2, eVar);
            this.f12602I = str;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12600G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    M1.h hVarB = S5.x.f12577f.b(S5.x.this.f12579b);
                    S5.x.g.a aVar = new S5.x.g.a(this.f12602I, null);
                    this.f12600G = 1;
                    if (Q1.i.a(hVarB, aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
            } catch (java.io.IOException e6) {
                java.lang.String str = "Failed to update session Id: " + e6;
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S5.x.g) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return S5.x.this.new g(this.f12602I, eVar);
        }
    }

    public x(android.content.Context context, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(iVar, "backgroundDispatcher");
        this.f12579b = context;
        this.f12580c = iVar;
        this.f12581d = new java.util.concurrent.atomic.AtomicReference();
        this.f12582e = new S5.x.f(Z8.AbstractC1871h.f(f12577f.b(context).getData(), new S5.x.e(null)), this);
        W8.AbstractC1788i.d(W8.O.a(iVar), null, null, new S5.x.a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S5.l i(Q1.f fVar) {
        return new S5.l((java.lang.String) fVar.b(S5.x.d.f12588a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public java.lang.String a() {
        S5.l lVar = (S5.l) this.f12581d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "sessionId");
        W8.AbstractC1788i.d(W8.O.a(this.f12580c), null, null, new S5.x.g(str, null), 3, null);
    }
}
