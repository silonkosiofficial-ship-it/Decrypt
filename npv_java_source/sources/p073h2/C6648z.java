package p073h2;

/* JADX INFO: renamed from: h2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6648z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f46368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p073h2.L f46369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.E f46370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Z8.InterfaceC1869f f46371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p073h2.Q f46372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p073h2.M f46373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.a f46374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p073h2.C6636m f46375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f46376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Y8.j f46377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h2.B.a f46378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final W8.InterfaceC1819y f46379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Z8.InterfaceC1869f f46380m;

    /* JADX INFO: renamed from: h2.z$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46381a;

        static {
            int[] iArr = new int[p073h2.EnumC6642t.values().length];
            try {
                iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f46381a = iArr;
        }
    }

    /* JADX INFO: renamed from: h2.z$b */
    public static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46382G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46383H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46384I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p073h2.C6648z f46385J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p073h2.EnumC6642t f46386K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        java.lang.Object f46387L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f46388M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p127m7.e eVar, p073h2.C6648z c6648z, p073h2.EnumC6642t enumC6642t) {
            super(3, eVar);
            this.f46385J = c6648z;
            this.f46386K = enumC6642t;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1870g interfaceC1870g;
            int iIntValue;
            h2.B.a aVar;
            p059f9.a aVar2;
            Z8.InterfaceC1869f eVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46382G;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        iIntValue = this.f46388M;
                        aVar2 = (p059f9.a) this.f46387L;
                        aVar = (h2.B.a) this.f46384I;
                        interfaceC1870g = (Z8.InterfaceC1870g) this.f46383H;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                interfaceC1870g = (Z8.InterfaceC1870g) this.f46383H;
                iIntValue = ((java.lang.Number) this.f46384I).intValue();
                aVar = this.f46385J.f46378k;
                aVar2 = aVar.f45891b;
                this.f46383H = interfaceC1870g;
                this.f46384I = aVar;
                this.f46387L = aVar2;
                this.f46388M = iIntValue;
                this.f46382G = 1;
                if (aVar2.c(null, this) == objG) {
                    return objG;
                }
                p073h2.B b6 = aVar.f45892c;
                p073h2.r rVarA = b6.p().a(this.f46386K);
                h2.r.c.a aVar3 = h2.r.c.f46235b;
                if (p247y7.AbstractC7350t.b(rVarA, aVar3.a())) {
                    eVar = Z8.AbstractC1871h.A(new p073h2.C6635l[0]);
                    aVar2.d(null);
                } else {
                    if (!(b6.p().a(this.f46386K) instanceof h2.r.a)) {
                        b6.p().c(this.f46386K, aVar3.b());
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                    aVar2.d(null);
                    eVar = new p073h2.C6648z.e(Z8.AbstractC1871h.o(this.f46385J.f46375h.c(this.f46386K), iIntValue == 0 ? 0 : 1), iIntValue);
                }
                this.f46383H = null;
                this.f46384I = null;
                this.f46387L = null;
                this.f46382G = 2;
                if (Z8.AbstractC1871h.r(interfaceC1870g, eVar, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                aVar2.d(null);
                throw th;
            }
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Object obj, p127m7.e eVar) {
            p073h2.C6648z.b bVar = new p073h2.C6648z.b(eVar, this.f46385J, this.f46386K);
            bVar.f46383H = interfaceC1870g;
            bVar.f46384I = obj;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: h2.z$c */
    static final class c extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46389G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46390H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46391I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p073h2.EnumC6642t f46392J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p073h2.EnumC6642t enumC6642t, p127m7.e eVar) {
            super(3, eVar);
            this.f46392J = enumC6642t;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f46389G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            p073h2.C6635l c6635l = (p073h2.C6635l) this.f46390H;
            p073h2.C6635l c6635l2 = (p073h2.C6635l) this.f46391I;
            return p073h2.A.a(c6635l2, c6635l, this.f46392J) ? c6635l2 : c6635l;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p073h2.C6635l c6635l, p073h2.C6635l c6635l2, p127m7.e eVar) {
            p073h2.C6648z.c cVar = new p073h2.C6648z.c(this.f46392J, eVar);
            cVar.f46390H = c6635l;
            cVar.f46391I = c6635l2;
            return cVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: h2.z$d */
    static final class d implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p073h2.EnumC6642t f46394D;

        d(p073h2.EnumC6642t enumC6642t) {
            this.f46394D = enumC6642t;
        }

        @Override // Z8.InterfaceC1870g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object a(p073h2.C6635l c6635l, p127m7.e eVar) throws java.lang.Throwable {
            java.lang.Object objT = p073h2.C6648z.this.t(this.f46394D, c6635l, eVar);
            return objT == p137n7.b.g() ? objT : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: h2.z$e */
    public static final class e implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f46395C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f46396D;

        /* JADX INFO: renamed from: h2.z$e$a */
        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f46397C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f46398D;

            /* JADX INFO: renamed from: h2.z$e$a$a, reason: collision with other inner class name */
            public static final class C0556a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46399F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f46400G;

                public C0556a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f46399F = obj;
                    this.f46400G |= Integer.MIN_VALUE;
                    return p073h2.C6648z.e.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g, int i6) {
                this.f46397C = interfaceC1870g;
                this.f46398D = i6;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6648z.e.a.C0556a c0556a;
                if (eVar instanceof p073h2.C6648z.e.a.C0556a) {
                    c0556a = (p073h2.C6648z.e.a.C0556a) eVar;
                    int i6 = c0556a.f46400G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0556a.f46400G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0556a = new p073h2.C6648z.e.a.C0556a(eVar);
                    }
                } else {
                    c0556a = new p073h2.C6648z.e.a.C0556a(eVar);
                }
                java.lang.Object obj2 = c0556a.f46399F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0556a.f46400G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f46397C;
                    p073h2.C6635l c6635l = new p073h2.C6635l(this.f46398D, (p073h2.Z) obj);
                    c0556a.f46400G = 1;
                    if (interfaceC1870g.a(c6635l, c0556a) == objG) {
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

        public e(Z8.InterfaceC1869f interfaceC1869f, int i6) {
            this.f46395C = interfaceC1869f;
            this.f46396D = i6;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f46395C.b(new p073h2.C6648z.e.a(interfaceC1870g, this.f46396D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: h2.z$f */
    static final class f extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46402F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46403G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46404H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46405I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f46407K;

        f(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46405I = obj;
            this.f46407K |= Integer.MIN_VALUE;
            return p073h2.C6648z.this.r(this);
        }
    }

    /* JADX INFO: renamed from: h2.z$g */
    static final class g extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46408F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46409G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46410H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f46411I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46412J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f46414L;

        g(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46412J = obj;
            this.f46414L |= Integer.MIN_VALUE;
            return p073h2.C6648z.this.s(this);
        }
    }

    /* JADX INFO: renamed from: h2.z$h */
    static final class h extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46415F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46416G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46417H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f46418I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f46419J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.Object f46420K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        java.lang.Object f46421L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        java.lang.Object f46422M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        java.lang.Object f46423N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        java.lang.Object f46424O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        java.lang.Object f46425P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        int f46426Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        int f46427R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46428S;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        int f46430U;

        h(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46428S = obj;
            this.f46430U |= Integer.MIN_VALUE;
            return p073h2.C6648z.this.t(null, null, this);
        }
    }

    /* JADX INFO: renamed from: h2.z$i */
    static final class i extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46431G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46432H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f46433I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f46434J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46435K;

        /* JADX INFO: renamed from: h2.z$i$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46437G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p073h2.C6648z f46438H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p073h2.T f46439I;

            /* JADX INFO: renamed from: h2.z$i$a$a, reason: collision with other inner class name */
            static final class C0557a implements Z8.InterfaceC1870g {

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ p073h2.T f46440C;

                /* JADX INFO: renamed from: h2.z$i$a$a$a, reason: collision with other inner class name */
                static final class C0558a extends p147o7.d {

                    /* JADX INFO: renamed from: F, reason: collision with root package name */
                    /* synthetic */ java.lang.Object f46441F;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    int f46443H;

                    C0558a(p127m7.e eVar) {
                        super(eVar);
                    }

                    @Override // p147o7.a
                    public final java.lang.Object B(java.lang.Object obj) {
                        this.f46441F = obj;
                        this.f46443H |= Integer.MIN_VALUE;
                        return p073h2.C6648z.i.a.C0557a.this.a(null, this);
                    }
                }

                C0557a(p073h2.T t6) {
                    this.f46440C = t6;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // Z8.InterfaceC1870g
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object a(p073h2.AbstractC6646x abstractC6646x, p127m7.e eVar) {
                    p073h2.C6648z.i.a.C0557a.C0558a c0558a;
                    if (eVar instanceof p073h2.C6648z.i.a.C0557a.C0558a) {
                        c0558a = (p073h2.C6648z.i.a.C0557a.C0558a) eVar;
                        int i6 = c0558a.f46443H;
                        if ((i6 & Integer.MIN_VALUE) != 0) {
                            c0558a.f46443H = i6 - Integer.MIN_VALUE;
                        } else {
                            c0558a = new p073h2.C6648z.i.a.C0557a.C0558a(eVar);
                        }
                    } else {
                        c0558a = new p073h2.C6648z.i.a.C0557a.C0558a(eVar);
                    }
                    java.lang.Object obj = c0558a.f46441F;
                    java.lang.Object objG = p137n7.b.g();
                    int i10 = c0558a.f46443H;
                    try {
                        if (i10 == 0) {
                            p087i7.x.b(obj);
                            p073h2.T t6 = this.f46440C;
                            c0558a.f46443H = 1;
                            if (t6.h(abstractC6646x, c0558a) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p087i7.x.b(obj);
                        }
                    } catch (Y8.u unused) {
                    }
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p073h2.C6648z c6648z, p073h2.T t6, p127m7.e eVar) {
                super(2, eVar);
                this.f46438H = c6648z;
                this.f46439I = t6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f46437G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    Z8.InterfaceC1869f interfaceC1869fM = Z8.AbstractC1871h.m(this.f46438H.f46377j);
                    p073h2.C6648z.i.a.C0557a c0557a = new p073h2.C6648z.i.a.C0557a(this.f46439I);
                    this.f46437G = 1;
                    if (interfaceC1869fM.b(c0557a, this) == objG) {
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
                return ((p073h2.C6648z.i.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new p073h2.C6648z.i.a(this.f46438H, this.f46439I, eVar);
            }
        }

        /* JADX INFO: renamed from: h2.z$i$b */
        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46444G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p073h2.C6648z f46445H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ Y8.j f46446I;

            /* JADX INFO: renamed from: h2.z$i$b$a */
            static final class a implements Z8.InterfaceC1870g {

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ Y8.j f46447C;

                a(Y8.j jVar) {
                    this.f46447C = jVar;
                }

                @Override // Z8.InterfaceC1870g
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object a(p087i7.M m6, p127m7.e eVar) {
                    this.f46447C.j(m6);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p073h2.C6648z c6648z, Y8.j jVar, p127m7.e eVar) {
                super(2, eVar);
                this.f46445H = c6648z;
                this.f46446I = jVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f46444G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    Z8.InterfaceC1869f interfaceC1869f = this.f46445H.f46371d;
                    p073h2.C6648z.i.b.a aVar = new p073h2.C6648z.i.b.a(this.f46446I);
                    this.f46444G = 1;
                    if (interfaceC1869f.b(aVar, this) == objG) {
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
                return ((p073h2.C6648z.i.b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new p073h2.C6648z.i.b(this.f46445H, this.f46446I, eVar);
            }
        }

        /* JADX INFO: renamed from: h2.z$i$c */
        static final class c extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46448G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f46449H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ Y8.j f46450I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p073h2.C6648z f46451J;

            /* JADX INFO: renamed from: h2.z$i$c$a */
            static final class a implements Z8.InterfaceC1870g {

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ p073h2.C6648z f46452C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ W8.N f46453D;

                /* JADX INFO: renamed from: h2.z$i$c$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0559a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f46454a;

                    static {
                        int[] iArr = new int[p073h2.EnumC6642t.values().length];
                        try {
                            iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 1;
                        } catch (java.lang.NoSuchFieldError unused) {
                        }
                        f46454a = iArr;
                    }
                }

                /* JADX INFO: renamed from: h2.z$i$c$a$b */
                static final class b extends p147o7.d {

                    /* JADX INFO: renamed from: F, reason: collision with root package name */
                    java.lang.Object f46455F;

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    java.lang.Object f46456G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    java.lang.Object f46457H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    java.lang.Object f46458I;

                    /* JADX INFO: renamed from: J, reason: collision with root package name */
                    java.lang.Object f46459J;

                    /* JADX INFO: renamed from: K, reason: collision with root package name */
                    java.lang.Object f46460K;

                    /* JADX INFO: renamed from: L, reason: collision with root package name */
                    java.lang.Object f46461L;

                    /* JADX INFO: renamed from: M, reason: collision with root package name */
                    java.lang.Object f46462M;

                    /* JADX INFO: renamed from: N, reason: collision with root package name */
                    /* synthetic */ java.lang.Object f46463N;

                    /* JADX INFO: renamed from: P, reason: collision with root package name */
                    int f46465P;

                    b(p127m7.e eVar) {
                        super(eVar);
                    }

                    @Override // p147o7.a
                    public final java.lang.Object B(java.lang.Object obj) {
                        this.f46463N = obj;
                        this.f46465P |= Integer.MIN_VALUE;
                        return p073h2.C6648z.i.c.a.this.a(null, this);
                    }
                }

                a(p073h2.C6648z c6648z, W8.N n6) {
                    this.f46452C = c6648z;
                    this.f46453D = n6;
                }

                /* JADX WARN: Code duplicated, block: B:104:0x0378  */
                /* JADX WARN: Code duplicated, block: B:107:0x0386  */
                /* JADX WARN: Code duplicated, block: B:108:0x038a  */
                /* JADX WARN: Code duplicated, block: B:110:0x03ac A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:111:0x03ad  */
                /* JADX WARN: Code duplicated, block: B:116:0x03de A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:117:0x03df  */
                /* JADX WARN: Code duplicated, block: B:120:0x03e7  */
                /* JADX WARN: Code duplicated, block: B:122:0x0403 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:126:0x0419  */
                /* JADX WARN: Code duplicated, block: B:134:0x042a A[PHI: r1 r4 r15
  0x042a: PHI (r1v53 h2.s) = (r1v28 h2.s), (r1v60 h2.s) binds: [B:89:0x0323, B:127:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x042a: PHI (r4v52 W8.N) = (r4v26 W8.N), (r4v55 W8.N) binds: [B:89:0x0323, B:127:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x042a: PHI (r15v51 h2.z) = (r15v28 h2.z), (r15v52 h2.z) binds: [B:89:0x0323, B:127:0x041c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:136:0x0434  */
                /* JADX WARN: Code duplicated, block: B:138:0x0438  */
                /* JADX WARN: Code duplicated, block: B:140:0x0454 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:141:0x0455  */
                /* JADX WARN: Code duplicated, block: B:144:0x0471 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:145:0x0472  */
                /* JADX WARN: Code duplicated, block: B:150:0x0481  */
                /* JADX WARN: Code duplicated, block: B:153:0x048e  */
                /* JADX WARN: Code duplicated, block: B:154:0x0492  */
                /* JADX WARN: Code duplicated, block: B:156:0x04b2 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:157:0x04b3  */
                /* JADX WARN: Code duplicated, block: B:162:0x04e4 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:163:0x04e5  */
                /* JADX WARN: Code duplicated, block: B:166:0x04ea  */
                /* JADX WARN: Code duplicated, block: B:168:0x0504 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:169:0x0505  */
                /* JADX WARN: Code duplicated, block: B:173:0x051d  */
                /* JADX WARN: Code duplicated, block: B:55:0x0259  */
                /* JADX WARN: Code duplicated, block: B:58:0x026c  */
                /* JADX WARN: Code duplicated, block: B:61:0x027a  */
                /* JADX WARN: Code duplicated, block: B:62:0x027e  */
                /* JADX WARN: Code duplicated, block: B:64:0x029f A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:65:0x02a0  */
                /* JADX WARN: Code duplicated, block: B:70:0x02d0 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:71:0x02d1  */
                /* JADX WARN: Code duplicated, block: B:74:0x02d9  */
                /* JADX WARN: Code duplicated, block: B:76:0x02f4 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code duplicated, block: B:80:0x030a  */
                /* JADX WARN: Code duplicated, block: B:88:0x031b A[PHI: r1 r4 r15
  0x031b: PHI (r1v28 h2.s) = (r1v7 h2.s), (r1v31 h2.s) binds: [B:57:0x026a, B:81:0x030d] A[DONT_GENERATE, DONT_INLINE]
  0x031b: PHI (r4v26 W8.N) = (r4v6 W8.N), (r4v29 W8.N) binds: [B:57:0x026a, B:81:0x030d] A[DONT_GENERATE, DONT_INLINE]
  0x031b: PHI (r15v28 h2.z) = (r15v9 h2.z), (r15v29 h2.z) binds: [B:57:0x026a, B:81:0x030d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:90:0x0325  */
                /* JADX WARN: Code duplicated, block: B:92:0x0329  */
                /* JADX WARN: Code duplicated, block: B:94:0x0346 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:95:0x0347  */
                /* JADX WARN: Code duplicated, block: B:98:0x0367 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:99:0x0368  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1, types: [f9.a] */
                /* JADX WARN: Type inference failed for: r1v14, types: [f9.a] */
                /* JADX WARN: Type inference failed for: r1v2, types: [f9.a] */
                /* JADX WARN: Type inference failed for: r1v3, types: [f9.a] */
                /* JADX WARN: Type inference failed for: r1v39, types: [f9.a] */
                /* JADX WARN: Type inference failed for: r1v68, types: [f9.a] */
                /* JADX WARN: Type inference failed for: r1v86 */
                /* JADX WARN: Type inference failed for: r1v87 */
                /* JADX WARN: Type inference failed for: r1v89 */
                /* JADX WARN: Type inference failed for: r1v90 */
                /* JADX WARN: Type inference failed for: r1v92 */
                /* JADX WARN: Type inference failed for: r1v93 */
                @Override // Z8.InterfaceC1870g
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object a(p087i7.M m6, p127m7.e eVar) {
                    p073h2.C6648z.i.c.a.b bVar;
                    h2.B.a aVar;
                    p073h2.C6648z c6648z;
                    p059f9.a aVar2;
                    p073h2.C6648z.i.c.a aVar3;
                    p073h2.C6641s c6641s;
                    p073h2.M m10;
                    p073h2.Q qW;
                    p073h2.C6648z c6648z2;
                    W8.N n6;
                    p073h2.EnumC6642t enumC6642t;
                    p073h2.C6641s c6641s2;
                    W8.N n10;
                    p073h2.EnumC6642t enumC6642t2;
                    p073h2.C6648z c6648z3;
                    W8.N n11;
                    p073h2.C6648z c6648z4;
                    p073h2.C6641s c6641s3;
                    h2.B.a aVar4;
                    p059f9.a aVar5;
                    p073h2.C6648z c6648z5;
                    p073h2.EnumC6642t enumC6642t3;
                    p073h2.C6648z c6648z6;
                    p073h2.Z z6;
                    p073h2.EnumC6642t enumC6642t4;
                    p073h2.C6648z c6648z7;
                    p073h2.EnumC6642t enumC6642t5;
                    W8.N n12;
                    p073h2.C6641s c6641s4;
                    h2.B.a aVar6;
                    p059f9.a aVar7;
                    p073h2.EnumC6642t enumC6642t6;
                    p073h2.C6641s c6641s5;
                    W8.N n13;
                    p073h2.EnumC6642t enumC6642t7;
                    p073h2.C6648z c6648z8;
                    h2.B.a aVar8;
                    p059f9.a aVar9;
                    p073h2.C6641s c6641s6;
                    p059f9.a aVar10;
                    W8.N n14;
                    h2.B.a aVar11;
                    p073h2.r rVarA;
                    p073h2.B b6;
                    W8.N n15;
                    p073h2.C6648z c6648z9;
                    h2.B.a aVar12;
                    p059f9.a aVar13;
                    p073h2.C6648z c6648z10;
                    p073h2.EnumC6642t enumC6642t8;
                    p073h2.C6648z c6648z11;
                    p073h2.Z z10;
                    p073h2.EnumC6642t enumC6642t9;
                    p073h2.C6648z c6648z12;
                    p073h2.EnumC6642t enumC6642t10;
                    W8.N n16;
                    p073h2.C6641s c6641s7;
                    h2.B.a aVar14;
                    p059f9.a aVar15;
                    p073h2.EnumC6642t enumC6642t11;
                    p073h2.C6648z c6648z13;
                    W8.N n17;
                    p073h2.EnumC6642t enumC6642t12;
                    h2.B.a aVar16;
                    p059f9.a aVar17;
                    h2.B.a aVar18;
                    p059f9.a aVar19;
                    W8.N n18;
                    p073h2.r rVarA2;
                    p073h2.B b10;
                    W8.N n19;
                    p073h2.C6648z c6648z14;
                    h2.B.a aVar20;
                    p059f9.a aVar21;
                    p073h2.C6648z c6648z15;
                    p073h2.EnumC6642t enumC6642t13;
                    p073h2.EnumC6642t enumC6642t14;
                    p059f9.a aVar22;
                    p073h2.C6648z c6648z16;
                    p073h2.Z z11;
                    p073h2.EnumC6642t enumC6642t15;
                    W8.N n20;
                    h2.B.a aVar23;
                    p059f9.a aVar24;
                    p073h2.C6648z c6648z17;
                    p059f9.a aVar25;
                    h2.B.a aVar26;
                    p073h2.r rVarA3;
                    if (eVar instanceof p073h2.C6648z.i.c.a.b) {
                        bVar = (p073h2.C6648z.i.c.a.b) eVar;
                        int i6 = bVar.f46465P;
                        if ((i6 & Integer.MIN_VALUE) != 0) {
                            bVar.f46465P = i6 - Integer.MIN_VALUE;
                        } else {
                            bVar = new p073h2.C6648z.i.c.a.b(eVar);
                        }
                    } else {
                        bVar = new p073h2.C6648z.i.c.a.b(eVar);
                    }
                    java.lang.Object obj = bVar.f46463N;
                    java.lang.Object objG = p137n7.b.g();
                    ?? r6 = bVar.f46465P;
                    try {
                        try {
                            try {
                                switch (r6) {
                                    case 0:
                                        p087i7.x.b(obj);
                                        aVar = this.f46452C.f46378k;
                                        c6648z = this.f46452C;
                                        aVar2 = aVar.f45891b;
                                        bVar.f46455F = this;
                                        bVar.f46456G = aVar;
                                        bVar.f46457H = c6648z;
                                        bVar.f46458I = aVar2;
                                        bVar.f46465P = 1;
                                        if (aVar2.c(null, bVar) == objG) {
                                            return objG;
                                        }
                                        aVar3 = this;
                                        try {
                                            p073h2.B b11 = aVar.f45892c;
                                            p087i7.u uVarA = p087i7.B.a(b11.p().d(), b11.g(c6648z.f46375h.b()));
                                            aVar2.d(null);
                                            c6641s = (p073h2.C6641s) uVarA.a();
                                            m10 = (p073h2.M) uVarA.b();
                                            qW = aVar3.f46452C.w();
                                            if (qW != null) {
                                                qW.a(m10);
                                                p087i7.M m11 = p087i7.M.f46721a;
                                            }
                                            c6648z2 = aVar3.f46452C;
                                            n6 = aVar3.f46453D;
                                            enumC6642t = p073h2.EnumC6642t.REFRESH;
                                            if (c6641s.f() instanceof h2.r.a) {
                                                enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                                if (c6641s.e() instanceof h2.r.a) {
                                                    if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                        aVar8 = c6648z2.f46378k;
                                                        aVar9 = aVar8.f45891b;
                                                        bVar.f46455F = c6641s;
                                                        bVar.f46456G = c6648z2;
                                                        bVar.f46457H = n6;
                                                        bVar.f46458I = enumC6642t6;
                                                        bVar.f46459J = aVar8;
                                                        bVar.f46460K = aVar9;
                                                        bVar.f46465P = 7;
                                                        if (aVar9.c(null, bVar) == objG) {
                                                            return objG;
                                                        }
                                                        c6641s6 = c6641s;
                                                        aVar10 = aVar9;
                                                        n14 = n6;
                                                        aVar11 = aVar8;
                                                        b6 = aVar11.f45892c;
                                                        bVar.f46455F = c6641s6;
                                                        bVar.f46456G = c6648z2;
                                                        bVar.f46457H = n14;
                                                        bVar.f46458I = enumC6642t6;
                                                        bVar.f46459J = aVar10;
                                                        bVar.f46460K = null;
                                                        bVar.f46465P = 8;
                                                        if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                            return objG;
                                                        }
                                                        enumC6642t7 = enumC6642t6;
                                                        n15 = n14;
                                                        c6648z9 = c6648z2;
                                                        r6 = aVar10;
                                                        p087i7.M m12 = p087i7.M.f46721a;
                                                        r6.d(null);
                                                        n13 = n15;
                                                        c6648z8 = c6648z9;
                                                        c6641s5 = c6641s6;
                                                    } else {
                                                        c6641s5 = c6641s;
                                                        n13 = n6;
                                                        enumC6642t7 = enumC6642t6;
                                                        c6648z8 = c6648z2;
                                                    }
                                                    if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                        c6648z11 = c6648z8;
                                                        z10 = null;
                                                        enumC6642t9 = enumC6642t7;
                                                    } else {
                                                        aVar12 = c6648z8.f46378k;
                                                        aVar13 = aVar12.f45891b;
                                                        bVar.f46455F = c6641s5;
                                                        bVar.f46456G = c6648z8;
                                                        bVar.f46457H = n13;
                                                        bVar.f46458I = enumC6642t7;
                                                        bVar.f46459J = aVar12;
                                                        bVar.f46460K = aVar13;
                                                        bVar.f46461L = enumC6642t7;
                                                        bVar.f46462M = c6648z8;
                                                        bVar.f46465P = 9;
                                                        if (aVar13.c(null, bVar) == objG) {
                                                            return objG;
                                                        }
                                                        c6648z10 = c6648z8;
                                                        enumC6642t8 = enumC6642t7;
                                                        z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                        aVar13.d(null);
                                                        c6648z11 = c6648z8;
                                                        enumC6642t9 = enumC6642t7;
                                                        enumC6642t7 = enumC6642t8;
                                                        c6648z8 = c6648z10;
                                                    }
                                                    bVar.f46455F = c6641s5;
                                                    bVar.f46456G = c6648z8;
                                                    bVar.f46457H = n13;
                                                    bVar.f46458I = enumC6642t7;
                                                    bVar.f46459J = null;
                                                    bVar.f46460K = null;
                                                    bVar.f46461L = null;
                                                    bVar.f46462M = null;
                                                    bVar.f46465P = 10;
                                                    if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z12 = c6648z8;
                                                    enumC6642t10 = enumC6642t7;
                                                    n16 = n13;
                                                    c6641s7 = c6641s5;
                                                    if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                        aVar14 = c6648z12.f46378k;
                                                        aVar15 = aVar14.f45891b;
                                                        bVar.f46455F = c6641s7;
                                                        bVar.f46456G = c6648z12;
                                                        bVar.f46457H = n16;
                                                        bVar.f46458I = aVar14;
                                                        bVar.f46459J = aVar15;
                                                        bVar.f46465P = 11;
                                                        if (aVar15.c(null, bVar) == objG) {
                                                            return objG;
                                                        }
                                                        rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                        aVar15.d(null);
                                                        if (!(rVarA2 instanceof h2.r.a)) {
                                                            c6648z12.E(n16);
                                                        }
                                                    }
                                                    n6 = n16;
                                                    c6648z2 = c6648z12;
                                                    c6641s = c6641s7;
                                                }
                                                return p087i7.M.f46721a;
                                            }
                                            c6641s2 = c6641s;
                                            n10 = n6;
                                            enumC6642t2 = enumC6642t;
                                            c6648z3 = c6648z2;
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t2.ordinal()] == 1) {
                                                c6648z6 = c6648z3;
                                                z6 = null;
                                                enumC6642t4 = enumC6642t2;
                                            } else {
                                                aVar4 = c6648z3.f46378k;
                                                aVar5 = aVar4.f45891b;
                                                bVar.f46455F = c6641s2;
                                                bVar.f46456G = c6648z3;
                                                bVar.f46457H = n10;
                                                bVar.f46458I = enumC6642t2;
                                                bVar.f46459J = aVar4;
                                                bVar.f46460K = aVar5;
                                                bVar.f46461L = enumC6642t2;
                                                bVar.f46462M = c6648z3;
                                                bVar.f46465P = 4;
                                                if (aVar5.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z5 = c6648z3;
                                                enumC6642t3 = enumC6642t2;
                                                try {
                                                    z6 = (p073h2.Z) aVar4.f45892c.k().get(enumC6642t3);
                                                    aVar5.d(null);
                                                    c6648z6 = c6648z3;
                                                    enumC6642t4 = enumC6642t2;
                                                    enumC6642t2 = enumC6642t3;
                                                    c6648z3 = c6648z5;
                                                } catch (java.lang.Throwable th) {
                                                    aVar5.d(null);
                                                    throw th;
                                                }
                                            }
                                            bVar.f46455F = c6641s2;
                                            bVar.f46456G = c6648z3;
                                            bVar.f46457H = n10;
                                            bVar.f46458I = enumC6642t2;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46462M = null;
                                            bVar.f46465P = 5;
                                            if (c6648z6.B(enumC6642t4, z6, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z7 = c6648z3;
                                            enumC6642t5 = enumC6642t2;
                                            n12 = n10;
                                            c6641s4 = c6641s2;
                                            if (enumC6642t5 == p073h2.EnumC6642t.REFRESH) {
                                                aVar6 = c6648z7.f46378k;
                                                aVar7 = aVar6.f45891b;
                                                bVar.f46455F = c6641s4;
                                                bVar.f46456G = c6648z7;
                                                bVar.f46457H = n12;
                                                bVar.f46458I = aVar6;
                                                bVar.f46459J = aVar7;
                                                bVar.f46465P = 6;
                                                if (aVar7.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                try {
                                                    rVarA = aVar6.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar7.d(null);
                                                    if (!(rVarA instanceof h2.r.a)) {
                                                        c6648z7.E(n12);
                                                    }
                                                } catch (java.lang.Throwable th2) {
                                                    aVar7.d(null);
                                                    throw th2;
                                                }
                                            }
                                            n6 = n12;
                                            c6648z2 = c6648z7;
                                            c6641s = c6641s4;
                                            enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                            if (c6641s.e() instanceof h2.r.a) {
                                                if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar8 = c6648z2.f46378k;
                                                    aVar9 = aVar8.f45891b;
                                                    bVar.f46455F = c6641s;
                                                    bVar.f46456G = c6648z2;
                                                    bVar.f46457H = n6;
                                                    bVar.f46458I = enumC6642t6;
                                                    bVar.f46459J = aVar8;
                                                    bVar.f46460K = aVar9;
                                                    bVar.f46465P = 7;
                                                    if (aVar9.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6641s6 = c6641s;
                                                    aVar10 = aVar9;
                                                    n14 = n6;
                                                    aVar11 = aVar8;
                                                    b6 = aVar11.f45892c;
                                                    bVar.f46455F = c6641s6;
                                                    bVar.f46456G = c6648z2;
                                                    bVar.f46457H = n14;
                                                    bVar.f46458I = enumC6642t6;
                                                    bVar.f46459J = aVar10;
                                                    bVar.f46460K = null;
                                                    bVar.f46465P = 8;
                                                    if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t7 = enumC6642t6;
                                                    n15 = n14;
                                                    c6648z9 = c6648z2;
                                                    r6 = aVar10;
                                                    p087i7.M m13 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n13 = n15;
                                                    c6648z8 = c6648z9;
                                                    c6641s5 = c6641s6;
                                                } else {
                                                    c6641s5 = c6641s;
                                                    n13 = n6;
                                                    enumC6642t7 = enumC6642t6;
                                                    c6648z8 = c6648z2;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                    c6648z11 = c6648z8;
                                                    z10 = null;
                                                    enumC6642t9 = enumC6642t7;
                                                } else {
                                                    aVar12 = c6648z8.f46378k;
                                                    aVar13 = aVar12.f45891b;
                                                    bVar.f46455F = c6641s5;
                                                    bVar.f46456G = c6648z8;
                                                    bVar.f46457H = n13;
                                                    bVar.f46458I = enumC6642t7;
                                                    bVar.f46459J = aVar12;
                                                    bVar.f46460K = aVar13;
                                                    bVar.f46461L = enumC6642t7;
                                                    bVar.f46462M = c6648z8;
                                                    bVar.f46465P = 9;
                                                    if (aVar13.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z10 = c6648z8;
                                                    enumC6642t8 = enumC6642t7;
                                                    try {
                                                        z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                        aVar13.d(null);
                                                        c6648z11 = c6648z8;
                                                        enumC6642t9 = enumC6642t7;
                                                        enumC6642t7 = enumC6642t8;
                                                        c6648z8 = c6648z10;
                                                    } catch (java.lang.Throwable th3) {
                                                        aVar13.d(null);
                                                        throw th3;
                                                    }
                                                }
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46462M = null;
                                                bVar.f46465P = 10;
                                                if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z12 = c6648z8;
                                                enumC6642t10 = enumC6642t7;
                                                n16 = n13;
                                                c6641s7 = c6641s5;
                                                if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar14 = c6648z12.f46378k;
                                                    aVar15 = aVar14.f45891b;
                                                    bVar.f46455F = c6641s7;
                                                    bVar.f46456G = c6648z12;
                                                    bVar.f46457H = n16;
                                                    bVar.f46458I = aVar14;
                                                    bVar.f46459J = aVar15;
                                                    bVar.f46465P = 11;
                                                    if (aVar15.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    try {
                                                        rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                        aVar15.d(null);
                                                        if (!(rVarA2 instanceof h2.r.a)) {
                                                            c6648z12.E(n16);
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        aVar15.d(null);
                                                        throw th4;
                                                    }
                                                }
                                                n6 = n16;
                                                c6648z2 = c6648z12;
                                                c6641s = c6641s7;
                                            }
                                            return p087i7.M.f46721a;
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n21 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n21;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m14 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    try {
                                                        z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                        aVar22.d(null);
                                                        enumC6642t15 = enumC6642t13;
                                                        enumC6642t12 = enumC6642t14;
                                                        c6648z16 = c6648z13;
                                                        c6648z13 = c6648z15;
                                                    } catch (java.lang.Throwable th5) {
                                                        aVar22.d(null);
                                                        throw th5;
                                                    }
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    try {
                                                        rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                        aVar25.d(null);
                                                        if (!(rVarA3 instanceof h2.r.a)) {
                                                            c6648z17.E(n20);
                                                        }
                                                    } catch (java.lang.Throwable th6) {
                                                        aVar25.d(null);
                                                        throw th6;
                                                    }
                                                }
                                            }
                                            return p087i7.M.f46721a;
                                        } catch (java.lang.Throwable th7) {
                                            aVar2.d(null);
                                            throw th7;
                                        }
                                    case 1:
                                        aVar2 = (p059f9.a) bVar.f46458I;
                                        c6648z = (p073h2.C6648z) bVar.f46457H;
                                        aVar = (h2.B.a) bVar.f46456G;
                                        aVar3 = (p073h2.C6648z.i.c.a) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        p073h2.B b12 = aVar.f45892c;
                                        p087i7.u uVarA2 = p087i7.B.a(b12.p().d(), b12.g(c6648z.f46375h.b()));
                                        aVar2.d(null);
                                        c6641s = (p073h2.C6641s) uVarA2.a();
                                        m10 = (p073h2.M) uVarA2.b();
                                        qW = aVar3.f46452C.w();
                                        if (qW != null) {
                                            qW.a(m10);
                                            p087i7.M m15 = p087i7.M.f46721a;
                                        }
                                        c6648z2 = aVar3.f46452C;
                                        n6 = aVar3.f46453D;
                                        enumC6642t = p073h2.EnumC6642t.REFRESH;
                                        if (c6641s.f() instanceof h2.r.a) {
                                            enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                            if (c6641s.e() instanceof h2.r.a) {
                                                if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar8 = c6648z2.f46378k;
                                                    aVar9 = aVar8.f45891b;
                                                    bVar.f46455F = c6641s;
                                                    bVar.f46456G = c6648z2;
                                                    bVar.f46457H = n6;
                                                    bVar.f46458I = enumC6642t6;
                                                    bVar.f46459J = aVar8;
                                                    bVar.f46460K = aVar9;
                                                    bVar.f46465P = 7;
                                                    if (aVar9.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6641s6 = c6641s;
                                                    aVar10 = aVar9;
                                                    n14 = n6;
                                                    aVar11 = aVar8;
                                                    b6 = aVar11.f45892c;
                                                    bVar.f46455F = c6641s6;
                                                    bVar.f46456G = c6648z2;
                                                    bVar.f46457H = n14;
                                                    bVar.f46458I = enumC6642t6;
                                                    bVar.f46459J = aVar10;
                                                    bVar.f46460K = null;
                                                    bVar.f46465P = 8;
                                                    if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t7 = enumC6642t6;
                                                    n15 = n14;
                                                    c6648z9 = c6648z2;
                                                    r6 = aVar10;
                                                    p087i7.M m16 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n13 = n15;
                                                    c6648z8 = c6648z9;
                                                    c6641s5 = c6641s6;
                                                } else {
                                                    c6641s5 = c6641s;
                                                    n13 = n6;
                                                    enumC6642t7 = enumC6642t6;
                                                    c6648z8 = c6648z2;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                    c6648z11 = c6648z8;
                                                    z10 = null;
                                                    enumC6642t9 = enumC6642t7;
                                                } else {
                                                    aVar12 = c6648z8.f46378k;
                                                    aVar13 = aVar12.f45891b;
                                                    bVar.f46455F = c6641s5;
                                                    bVar.f46456G = c6648z8;
                                                    bVar.f46457H = n13;
                                                    bVar.f46458I = enumC6642t7;
                                                    bVar.f46459J = aVar12;
                                                    bVar.f46460K = aVar13;
                                                    bVar.f46461L = enumC6642t7;
                                                    bVar.f46462M = c6648z8;
                                                    bVar.f46465P = 9;
                                                    if (aVar13.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z10 = c6648z8;
                                                    enumC6642t8 = enumC6642t7;
                                                    z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                    aVar13.d(null);
                                                    c6648z11 = c6648z8;
                                                    enumC6642t9 = enumC6642t7;
                                                    enumC6642t7 = enumC6642t8;
                                                    c6648z8 = c6648z10;
                                                }
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46462M = null;
                                                bVar.f46465P = 10;
                                                if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z12 = c6648z8;
                                                enumC6642t10 = enumC6642t7;
                                                n16 = n13;
                                                c6641s7 = c6641s5;
                                                if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar14 = c6648z12.f46378k;
                                                    aVar15 = aVar14.f45891b;
                                                    bVar.f46455F = c6641s7;
                                                    bVar.f46456G = c6648z12;
                                                    bVar.f46457H = n16;
                                                    bVar.f46458I = aVar14;
                                                    bVar.f46459J = aVar15;
                                                    bVar.f46465P = 11;
                                                    if (aVar15.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar15.d(null);
                                                    if (!(rVarA2 instanceof h2.r.a)) {
                                                        c6648z12.E(n16);
                                                    }
                                                }
                                                n6 = n16;
                                                c6648z2 = c6648z12;
                                                c6641s = c6641s7;
                                            }
                                            return p087i7.M.f46721a;
                                        }
                                        c6641s2 = c6641s;
                                        n10 = n6;
                                        enumC6642t2 = enumC6642t;
                                        c6648z3 = c6648z2;
                                        if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t2.ordinal()] == 1) {
                                            c6648z6 = c6648z3;
                                            z6 = null;
                                            enumC6642t4 = enumC6642t2;
                                        } else {
                                            aVar4 = c6648z3.f46378k;
                                            aVar5 = aVar4.f45891b;
                                            bVar.f46455F = c6641s2;
                                            bVar.f46456G = c6648z3;
                                            bVar.f46457H = n10;
                                            bVar.f46458I = enumC6642t2;
                                            bVar.f46459J = aVar4;
                                            bVar.f46460K = aVar5;
                                            bVar.f46461L = enumC6642t2;
                                            bVar.f46462M = c6648z3;
                                            bVar.f46465P = 4;
                                            if (aVar5.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z5 = c6648z3;
                                            enumC6642t3 = enumC6642t2;
                                            z6 = (p073h2.Z) aVar4.f45892c.k().get(enumC6642t3);
                                            aVar5.d(null);
                                            c6648z6 = c6648z3;
                                            enumC6642t4 = enumC6642t2;
                                            enumC6642t2 = enumC6642t3;
                                            c6648z3 = c6648z5;
                                        }
                                        bVar.f46455F = c6641s2;
                                        bVar.f46456G = c6648z3;
                                        bVar.f46457H = n10;
                                        bVar.f46458I = enumC6642t2;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46462M = null;
                                        bVar.f46465P = 5;
                                        if (c6648z6.B(enumC6642t4, z6, bVar) == objG) {
                                            return objG;
                                        }
                                        c6648z7 = c6648z3;
                                        enumC6642t5 = enumC6642t2;
                                        n12 = n10;
                                        c6641s4 = c6641s2;
                                        if (enumC6642t5 == p073h2.EnumC6642t.REFRESH) {
                                            aVar6 = c6648z7.f46378k;
                                            aVar7 = aVar6.f45891b;
                                            bVar.f46455F = c6641s4;
                                            bVar.f46456G = c6648z7;
                                            bVar.f46457H = n12;
                                            bVar.f46458I = aVar6;
                                            bVar.f46459J = aVar7;
                                            bVar.f46465P = 6;
                                            if (aVar7.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA = aVar6.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar7.d(null);
                                            if (!(rVarA instanceof h2.r.a)) {
                                                c6648z7.E(n12);
                                            }
                                        }
                                        n6 = n12;
                                        c6648z2 = c6648z7;
                                        c6641s = c6641s4;
                                        enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                        if (c6641s.e() instanceof h2.r.a) {
                                            if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                aVar8 = c6648z2.f46378k;
                                                aVar9 = aVar8.f45891b;
                                                bVar.f46455F = c6641s;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n6;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar8;
                                                bVar.f46460K = aVar9;
                                                bVar.f46465P = 7;
                                                if (aVar9.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6641s6 = c6641s;
                                                aVar10 = aVar9;
                                                n14 = n6;
                                                aVar11 = aVar8;
                                                b6 = aVar11.f45892c;
                                                bVar.f46455F = c6641s6;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n14;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar10;
                                                bVar.f46460K = null;
                                                bVar.f46465P = 8;
                                                if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t7 = enumC6642t6;
                                                n15 = n14;
                                                c6648z9 = c6648z2;
                                                r6 = aVar10;
                                                p087i7.M m17 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n13 = n15;
                                                c6648z8 = c6648z9;
                                                c6641s5 = c6641s6;
                                            } else {
                                                c6641s5 = c6641s;
                                                n13 = n6;
                                                enumC6642t7 = enumC6642t6;
                                                c6648z8 = c6648z2;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                c6648z11 = c6648z8;
                                                z10 = null;
                                                enumC6642t9 = enumC6642t7;
                                            } else {
                                                aVar12 = c6648z8.f46378k;
                                                aVar13 = aVar12.f45891b;
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = aVar12;
                                                bVar.f46460K = aVar13;
                                                bVar.f46461L = enumC6642t7;
                                                bVar.f46462M = c6648z8;
                                                bVar.f46465P = 9;
                                                if (aVar13.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z10 = c6648z8;
                                                enumC6642t8 = enumC6642t7;
                                                z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                aVar13.d(null);
                                                c6648z11 = c6648z8;
                                                enumC6642t9 = enumC6642t7;
                                                enumC6642t7 = enumC6642t8;
                                                c6648z8 = c6648z10;
                                            }
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46462M = null;
                                            bVar.f46465P = 10;
                                            if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z12 = c6648z8;
                                            enumC6642t10 = enumC6642t7;
                                            n16 = n13;
                                            c6641s7 = c6641s5;
                                            if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                aVar14 = c6648z12.f46378k;
                                                aVar15 = aVar14.f45891b;
                                                bVar.f46455F = c6641s7;
                                                bVar.f46456G = c6648z12;
                                                bVar.f46457H = n16;
                                                bVar.f46458I = aVar14;
                                                bVar.f46459J = aVar15;
                                                bVar.f46465P = 11;
                                                if (aVar15.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar15.d(null);
                                                if (!(rVarA2 instanceof h2.r.a)) {
                                                    c6648z12.E(n16);
                                                }
                                            }
                                            n6 = n16;
                                            c6648z2 = c6648z12;
                                            c6641s = c6641s7;
                                        }
                                        return p087i7.M.f46721a;
                                        enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                        if (c6641s.d() instanceof h2.r.a) {
                                            if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                aVar16 = c6648z2.f46378k;
                                                aVar17 = aVar16.f45891b;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n6;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar16;
                                                bVar.f46459J = aVar17;
                                                bVar.f46465P = 12;
                                                if (aVar17.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                W8.N n22 = n6;
                                                aVar18 = aVar16;
                                                aVar19 = aVar17;
                                                n18 = n22;
                                                b10 = aVar18.f45892c;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n18;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar19;
                                                bVar.f46459J = null;
                                                bVar.f46465P = 13;
                                                if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t12 = enumC6642t11;
                                                n19 = n18;
                                                c6648z14 = c6648z2;
                                                r6 = aVar19;
                                                p087i7.M m18 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n17 = n19;
                                                c6648z13 = c6648z14;
                                            } else {
                                                c6648z13 = c6648z2;
                                                n17 = n6;
                                                enumC6642t12 = enumC6642t11;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                c6648z16 = c6648z13;
                                                z11 = null;
                                                enumC6642t15 = enumC6642t12;
                                            } else {
                                                aVar20 = c6648z13.f46378k;
                                                aVar21 = aVar20.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = aVar20;
                                                bVar.f46459J = aVar21;
                                                bVar.f46460K = enumC6642t12;
                                                bVar.f46461L = c6648z13;
                                                bVar.f46465P = 14;
                                                if (aVar21.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z15 = c6648z13;
                                                enumC6642t13 = enumC6642t12;
                                                enumC6642t14 = enumC6642t13;
                                                aVar22 = aVar21;
                                                z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                aVar22.d(null);
                                                enumC6642t15 = enumC6642t13;
                                                enumC6642t12 = enumC6642t14;
                                                c6648z16 = c6648z13;
                                                c6648z13 = c6648z15;
                                            }
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = null;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46465P = 15;
                                            if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                return objG;
                                            }
                                            n20 = n17;
                                            if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                aVar23 = c6648z13.f46378k;
                                                aVar24 = aVar23.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n20;
                                                bVar.f46457H = aVar23;
                                                bVar.f46458I = aVar24;
                                                bVar.f46465P = 16;
                                                if (aVar24.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z17 = c6648z13;
                                                aVar25 = aVar24;
                                                aVar26 = aVar23;
                                                rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar25.d(null);
                                                if (!(rVarA3 instanceof h2.r.a)) {
                                                    c6648z17.E(n20);
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 2:
                                        p059f9.a aVar27 = (p059f9.a) bVar.f46460K;
                                        h2.B.a aVar28 = (h2.B.a) bVar.f46459J;
                                        p073h2.EnumC6642t enumC6642t16 = (p073h2.EnumC6642t) bVar.f46458I;
                                        W8.N n23 = (W8.N) bVar.f46457H;
                                        p073h2.C6648z c6648z18 = (p073h2.C6648z) bVar.f46456G;
                                        p073h2.C6641s c6641s8 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        p073h2.B b13 = aVar28.f45892c;
                                        bVar.f46455F = c6641s8;
                                        bVar.f46456G = c6648z18;
                                        bVar.f46457H = n23;
                                        bVar.f46458I = enumC6642t16;
                                        bVar.f46459J = aVar27;
                                        bVar.f46460K = null;
                                        bVar.f46465P = 3;
                                        if (c6648z18.D(b13, enumC6642t16, bVar) == objG) {
                                            return objG;
                                        }
                                        enumC6642t2 = enumC6642t16;
                                        n11 = n23;
                                        c6648z4 = c6648z18;
                                        c6641s3 = c6641s8;
                                        r6 = aVar27;
                                        p087i7.M m19 = p087i7.M.f46721a;
                                        r6.d(null);
                                        n10 = n11;
                                        c6648z3 = c6648z4;
                                        c6641s2 = c6641s3;
                                        if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t2.ordinal()] == 1) {
                                            c6648z6 = c6648z3;
                                            z6 = null;
                                            enumC6642t4 = enumC6642t2;
                                        } else {
                                            aVar4 = c6648z3.f46378k;
                                            aVar5 = aVar4.f45891b;
                                            bVar.f46455F = c6641s2;
                                            bVar.f46456G = c6648z3;
                                            bVar.f46457H = n10;
                                            bVar.f46458I = enumC6642t2;
                                            bVar.f46459J = aVar4;
                                            bVar.f46460K = aVar5;
                                            bVar.f46461L = enumC6642t2;
                                            bVar.f46462M = c6648z3;
                                            bVar.f46465P = 4;
                                            if (aVar5.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z5 = c6648z3;
                                            enumC6642t3 = enumC6642t2;
                                            z6 = (p073h2.Z) aVar4.f45892c.k().get(enumC6642t3);
                                            aVar5.d(null);
                                            c6648z6 = c6648z3;
                                            enumC6642t4 = enumC6642t2;
                                            enumC6642t2 = enumC6642t3;
                                            c6648z3 = c6648z5;
                                        }
                                        bVar.f46455F = c6641s2;
                                        bVar.f46456G = c6648z3;
                                        bVar.f46457H = n10;
                                        bVar.f46458I = enumC6642t2;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46462M = null;
                                        bVar.f46465P = 5;
                                        if (c6648z6.B(enumC6642t4, z6, bVar) == objG) {
                                            return objG;
                                        }
                                        c6648z7 = c6648z3;
                                        enumC6642t5 = enumC6642t2;
                                        n12 = n10;
                                        c6641s4 = c6641s2;
                                        if (enumC6642t5 == p073h2.EnumC6642t.REFRESH) {
                                            aVar6 = c6648z7.f46378k;
                                            aVar7 = aVar6.f45891b;
                                            bVar.f46455F = c6641s4;
                                            bVar.f46456G = c6648z7;
                                            bVar.f46457H = n12;
                                            bVar.f46458I = aVar6;
                                            bVar.f46459J = aVar7;
                                            bVar.f46465P = 6;
                                            if (aVar7.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA = aVar6.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar7.d(null);
                                            if (!(rVarA instanceof h2.r.a)) {
                                                c6648z7.E(n12);
                                            }
                                        }
                                        n6 = n12;
                                        c6648z2 = c6648z7;
                                        c6641s = c6641s4;
                                        enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                        if (c6641s.e() instanceof h2.r.a) {
                                            if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                aVar8 = c6648z2.f46378k;
                                                aVar9 = aVar8.f45891b;
                                                bVar.f46455F = c6641s;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n6;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar8;
                                                bVar.f46460K = aVar9;
                                                bVar.f46465P = 7;
                                                if (aVar9.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6641s6 = c6641s;
                                                aVar10 = aVar9;
                                                n14 = n6;
                                                aVar11 = aVar8;
                                                b6 = aVar11.f45892c;
                                                bVar.f46455F = c6641s6;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n14;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar10;
                                                bVar.f46460K = null;
                                                bVar.f46465P = 8;
                                                if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t7 = enumC6642t6;
                                                n15 = n14;
                                                c6648z9 = c6648z2;
                                                r6 = aVar10;
                                                p087i7.M m110 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n13 = n15;
                                                c6648z8 = c6648z9;
                                                c6641s5 = c6641s6;
                                            } else {
                                                c6641s5 = c6641s;
                                                n13 = n6;
                                                enumC6642t7 = enumC6642t6;
                                                c6648z8 = c6648z2;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                c6648z11 = c6648z8;
                                                z10 = null;
                                                enumC6642t9 = enumC6642t7;
                                            } else {
                                                aVar12 = c6648z8.f46378k;
                                                aVar13 = aVar12.f45891b;
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = aVar12;
                                                bVar.f46460K = aVar13;
                                                bVar.f46461L = enumC6642t7;
                                                bVar.f46462M = c6648z8;
                                                bVar.f46465P = 9;
                                                if (aVar13.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z10 = c6648z8;
                                                enumC6642t8 = enumC6642t7;
                                                z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                aVar13.d(null);
                                                c6648z11 = c6648z8;
                                                enumC6642t9 = enumC6642t7;
                                                enumC6642t7 = enumC6642t8;
                                                c6648z8 = c6648z10;
                                            }
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46462M = null;
                                            bVar.f46465P = 10;
                                            if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z12 = c6648z8;
                                            enumC6642t10 = enumC6642t7;
                                            n16 = n13;
                                            c6641s7 = c6641s5;
                                            if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                aVar14 = c6648z12.f46378k;
                                                aVar15 = aVar14.f45891b;
                                                bVar.f46455F = c6641s7;
                                                bVar.f46456G = c6648z12;
                                                bVar.f46457H = n16;
                                                bVar.f46458I = aVar14;
                                                bVar.f46459J = aVar15;
                                                bVar.f46465P = 11;
                                                if (aVar15.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar15.d(null);
                                                if (!(rVarA2 instanceof h2.r.a)) {
                                                    c6648z12.E(n16);
                                                }
                                            }
                                            n6 = n16;
                                            c6648z2 = c6648z12;
                                            c6641s = c6641s7;
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n24 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n24;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m111 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        } else {
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n25 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n25;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m112 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 3:
                                        p059f9.a aVar29 = (p059f9.a) bVar.f46459J;
                                        enumC6642t2 = (p073h2.EnumC6642t) bVar.f46458I;
                                        n11 = (W8.N) bVar.f46457H;
                                        c6648z4 = (p073h2.C6648z) bVar.f46456G;
                                        c6641s3 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        r6 = aVar29;
                                        p087i7.M m113 = p087i7.M.f46721a;
                                        r6.d(null);
                                        n10 = n11;
                                        c6648z3 = c6648z4;
                                        c6641s2 = c6641s3;
                                        if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t2.ordinal()] == 1) {
                                            c6648z6 = c6648z3;
                                            z6 = null;
                                            enumC6642t4 = enumC6642t2;
                                        } else {
                                            aVar4 = c6648z3.f46378k;
                                            aVar5 = aVar4.f45891b;
                                            bVar.f46455F = c6641s2;
                                            bVar.f46456G = c6648z3;
                                            bVar.f46457H = n10;
                                            bVar.f46458I = enumC6642t2;
                                            bVar.f46459J = aVar4;
                                            bVar.f46460K = aVar5;
                                            bVar.f46461L = enumC6642t2;
                                            bVar.f46462M = c6648z3;
                                            bVar.f46465P = 4;
                                            if (aVar5.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z5 = c6648z3;
                                            enumC6642t3 = enumC6642t2;
                                            z6 = (p073h2.Z) aVar4.f45892c.k().get(enumC6642t3);
                                            aVar5.d(null);
                                            c6648z6 = c6648z3;
                                            enumC6642t4 = enumC6642t2;
                                            enumC6642t2 = enumC6642t3;
                                            c6648z3 = c6648z5;
                                        }
                                        bVar.f46455F = c6641s2;
                                        bVar.f46456G = c6648z3;
                                        bVar.f46457H = n10;
                                        bVar.f46458I = enumC6642t2;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46462M = null;
                                        bVar.f46465P = 5;
                                        if (c6648z6.B(enumC6642t4, z6, bVar) == objG) {
                                            return objG;
                                        }
                                        c6648z7 = c6648z3;
                                        enumC6642t5 = enumC6642t2;
                                        n12 = n10;
                                        c6641s4 = c6641s2;
                                        if (enumC6642t5 == p073h2.EnumC6642t.REFRESH) {
                                            aVar6 = c6648z7.f46378k;
                                            aVar7 = aVar6.f45891b;
                                            bVar.f46455F = c6641s4;
                                            bVar.f46456G = c6648z7;
                                            bVar.f46457H = n12;
                                            bVar.f46458I = aVar6;
                                            bVar.f46459J = aVar7;
                                            bVar.f46465P = 6;
                                            if (aVar7.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA = aVar6.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar7.d(null);
                                            if (!(rVarA instanceof h2.r.a)) {
                                                c6648z7.E(n12);
                                            }
                                        }
                                        n6 = n12;
                                        c6648z2 = c6648z7;
                                        c6641s = c6641s4;
                                        enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                        if (c6641s.e() instanceof h2.r.a) {
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n26 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n26;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m114 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                aVar8 = c6648z2.f46378k;
                                                aVar9 = aVar8.f45891b;
                                                bVar.f46455F = c6641s;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n6;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar8;
                                                bVar.f46460K = aVar9;
                                                bVar.f46465P = 7;
                                                if (aVar9.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6641s6 = c6641s;
                                                aVar10 = aVar9;
                                                n14 = n6;
                                                aVar11 = aVar8;
                                                b6 = aVar11.f45892c;
                                                bVar.f46455F = c6641s6;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n14;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar10;
                                                bVar.f46460K = null;
                                                bVar.f46465P = 8;
                                                if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t7 = enumC6642t6;
                                                n15 = n14;
                                                c6648z9 = c6648z2;
                                                r6 = aVar10;
                                                p087i7.M m115 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n13 = n15;
                                                c6648z8 = c6648z9;
                                                c6641s5 = c6641s6;
                                            } else {
                                                c6641s5 = c6641s;
                                                n13 = n6;
                                                enumC6642t7 = enumC6642t6;
                                                c6648z8 = c6648z2;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                c6648z11 = c6648z8;
                                                z10 = null;
                                                enumC6642t9 = enumC6642t7;
                                            } else {
                                                aVar12 = c6648z8.f46378k;
                                                aVar13 = aVar12.f45891b;
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = aVar12;
                                                bVar.f46460K = aVar13;
                                                bVar.f46461L = enumC6642t7;
                                                bVar.f46462M = c6648z8;
                                                bVar.f46465P = 9;
                                                if (aVar13.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z10 = c6648z8;
                                                enumC6642t8 = enumC6642t7;
                                                z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                aVar13.d(null);
                                                c6648z11 = c6648z8;
                                                enumC6642t9 = enumC6642t7;
                                                enumC6642t7 = enumC6642t8;
                                                c6648z8 = c6648z10;
                                            }
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46462M = null;
                                            bVar.f46465P = 10;
                                            if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z12 = c6648z8;
                                            enumC6642t10 = enumC6642t7;
                                            n16 = n13;
                                            c6641s7 = c6641s5;
                                            if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                aVar14 = c6648z12.f46378k;
                                                aVar15 = aVar14.f45891b;
                                                bVar.f46455F = c6641s7;
                                                bVar.f46456G = c6648z12;
                                                bVar.f46457H = n16;
                                                bVar.f46458I = aVar14;
                                                bVar.f46459J = aVar15;
                                                bVar.f46465P = 11;
                                                if (aVar15.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar15.d(null);
                                                if (!(rVarA2 instanceof h2.r.a)) {
                                                    c6648z12.E(n16);
                                                }
                                            }
                                            n6 = n16;
                                            c6648z2 = c6648z12;
                                            c6641s = c6641s7;
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n27 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n27;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m116 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 4:
                                        c6648z3 = (p073h2.C6648z) bVar.f46462M;
                                        enumC6642t2 = (p073h2.EnumC6642t) bVar.f46461L;
                                        aVar5 = (p059f9.a) bVar.f46460K;
                                        aVar4 = (h2.B.a) bVar.f46459J;
                                        enumC6642t3 = (p073h2.EnumC6642t) bVar.f46458I;
                                        n10 = (W8.N) bVar.f46457H;
                                        c6648z5 = (p073h2.C6648z) bVar.f46456G;
                                        c6641s2 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        z6 = (p073h2.Z) aVar4.f45892c.k().get(enumC6642t3);
                                        aVar5.d(null);
                                        c6648z6 = c6648z3;
                                        enumC6642t4 = enumC6642t2;
                                        enumC6642t2 = enumC6642t3;
                                        c6648z3 = c6648z5;
                                        bVar.f46455F = c6641s2;
                                        bVar.f46456G = c6648z3;
                                        bVar.f46457H = n10;
                                        bVar.f46458I = enumC6642t2;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46462M = null;
                                        bVar.f46465P = 5;
                                        if (c6648z6.B(enumC6642t4, z6, bVar) == objG) {
                                            return objG;
                                        }
                                        c6648z7 = c6648z3;
                                        enumC6642t5 = enumC6642t2;
                                        n12 = n10;
                                        c6641s4 = c6641s2;
                                        if (enumC6642t5 == p073h2.EnumC6642t.REFRESH) {
                                            aVar6 = c6648z7.f46378k;
                                            aVar7 = aVar6.f45891b;
                                            bVar.f46455F = c6641s4;
                                            bVar.f46456G = c6648z7;
                                            bVar.f46457H = n12;
                                            bVar.f46458I = aVar6;
                                            bVar.f46459J = aVar7;
                                            bVar.f46465P = 6;
                                            if (aVar7.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA = aVar6.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar7.d(null);
                                            if (!(rVarA instanceof h2.r.a)) {
                                                c6648z7.E(n12);
                                            }
                                        }
                                        n6 = n12;
                                        c6648z2 = c6648z7;
                                        c6641s = c6641s4;
                                        enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                        if (c6641s.e() instanceof h2.r.a) {
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n28 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n28;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m117 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                aVar8 = c6648z2.f46378k;
                                                aVar9 = aVar8.f45891b;
                                                bVar.f46455F = c6641s;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n6;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar8;
                                                bVar.f46460K = aVar9;
                                                bVar.f46465P = 7;
                                                if (aVar9.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6641s6 = c6641s;
                                                aVar10 = aVar9;
                                                n14 = n6;
                                                aVar11 = aVar8;
                                                b6 = aVar11.f45892c;
                                                bVar.f46455F = c6641s6;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n14;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar10;
                                                bVar.f46460K = null;
                                                bVar.f46465P = 8;
                                                if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t7 = enumC6642t6;
                                                n15 = n14;
                                                c6648z9 = c6648z2;
                                                r6 = aVar10;
                                                p087i7.M m118 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n13 = n15;
                                                c6648z8 = c6648z9;
                                                c6641s5 = c6641s6;
                                            } else {
                                                c6641s5 = c6641s;
                                                n13 = n6;
                                                enumC6642t7 = enumC6642t6;
                                                c6648z8 = c6648z2;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                c6648z11 = c6648z8;
                                                z10 = null;
                                                enumC6642t9 = enumC6642t7;
                                            } else {
                                                aVar12 = c6648z8.f46378k;
                                                aVar13 = aVar12.f45891b;
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = aVar12;
                                                bVar.f46460K = aVar13;
                                                bVar.f46461L = enumC6642t7;
                                                bVar.f46462M = c6648z8;
                                                bVar.f46465P = 9;
                                                if (aVar13.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z10 = c6648z8;
                                                enumC6642t8 = enumC6642t7;
                                                z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                aVar13.d(null);
                                                c6648z11 = c6648z8;
                                                enumC6642t9 = enumC6642t7;
                                                enumC6642t7 = enumC6642t8;
                                                c6648z8 = c6648z10;
                                            }
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46462M = null;
                                            bVar.f46465P = 10;
                                            if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z12 = c6648z8;
                                            enumC6642t10 = enumC6642t7;
                                            n16 = n13;
                                            c6641s7 = c6641s5;
                                            if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                aVar14 = c6648z12.f46378k;
                                                aVar15 = aVar14.f45891b;
                                                bVar.f46455F = c6641s7;
                                                bVar.f46456G = c6648z12;
                                                bVar.f46457H = n16;
                                                bVar.f46458I = aVar14;
                                                bVar.f46459J = aVar15;
                                                bVar.f46465P = 11;
                                                if (aVar15.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar15.d(null);
                                                if (!(rVarA2 instanceof h2.r.a)) {
                                                    c6648z12.E(n16);
                                                }
                                            }
                                            n6 = n16;
                                            c6648z2 = c6648z12;
                                            c6641s = c6641s7;
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n29 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n29;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m119 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 5:
                                        enumC6642t5 = (p073h2.EnumC6642t) bVar.f46458I;
                                        W8.N n30 = (W8.N) bVar.f46457H;
                                        p073h2.C6648z c6648z19 = (p073h2.C6648z) bVar.f46456G;
                                        p073h2.C6641s c6641s9 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        c6641s4 = c6641s9;
                                        c6648z7 = c6648z19;
                                        n12 = n30;
                                        if (enumC6642t5 == p073h2.EnumC6642t.REFRESH) {
                                            aVar6 = c6648z7.f46378k;
                                            aVar7 = aVar6.f45891b;
                                            bVar.f46455F = c6641s4;
                                            bVar.f46456G = c6648z7;
                                            bVar.f46457H = n12;
                                            bVar.f46458I = aVar6;
                                            bVar.f46459J = aVar7;
                                            bVar.f46465P = 6;
                                            if (aVar7.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA = aVar6.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar7.d(null);
                                            if (!(rVarA instanceof h2.r.a)) {
                                                c6648z7.E(n12);
                                            }
                                        }
                                        n6 = n12;
                                        c6648z2 = c6648z7;
                                        c6641s = c6641s4;
                                        enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                        if (c6641s.e() instanceof h2.r.a) {
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n210 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n210;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m1110 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                aVar8 = c6648z2.f46378k;
                                                aVar9 = aVar8.f45891b;
                                                bVar.f46455F = c6641s;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n6;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar8;
                                                bVar.f46460K = aVar9;
                                                bVar.f46465P = 7;
                                                if (aVar9.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6641s6 = c6641s;
                                                aVar10 = aVar9;
                                                n14 = n6;
                                                aVar11 = aVar8;
                                                b6 = aVar11.f45892c;
                                                bVar.f46455F = c6641s6;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n14;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar10;
                                                bVar.f46460K = null;
                                                bVar.f46465P = 8;
                                                if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t7 = enumC6642t6;
                                                n15 = n14;
                                                c6648z9 = c6648z2;
                                                r6 = aVar10;
                                                p087i7.M m1111 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n13 = n15;
                                                c6648z8 = c6648z9;
                                                c6641s5 = c6641s6;
                                            } else {
                                                c6641s5 = c6641s;
                                                n13 = n6;
                                                enumC6642t7 = enumC6642t6;
                                                c6648z8 = c6648z2;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                c6648z11 = c6648z8;
                                                z10 = null;
                                                enumC6642t9 = enumC6642t7;
                                            } else {
                                                aVar12 = c6648z8.f46378k;
                                                aVar13 = aVar12.f45891b;
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = aVar12;
                                                bVar.f46460K = aVar13;
                                                bVar.f46461L = enumC6642t7;
                                                bVar.f46462M = c6648z8;
                                                bVar.f46465P = 9;
                                                if (aVar13.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z10 = c6648z8;
                                                enumC6642t8 = enumC6642t7;
                                                z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                aVar13.d(null);
                                                c6648z11 = c6648z8;
                                                enumC6642t9 = enumC6642t7;
                                                enumC6642t7 = enumC6642t8;
                                                c6648z8 = c6648z10;
                                            }
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46462M = null;
                                            bVar.f46465P = 10;
                                            if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z12 = c6648z8;
                                            enumC6642t10 = enumC6642t7;
                                            n16 = n13;
                                            c6641s7 = c6641s5;
                                            if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                aVar14 = c6648z12.f46378k;
                                                aVar15 = aVar14.f45891b;
                                                bVar.f46455F = c6641s7;
                                                bVar.f46456G = c6648z12;
                                                bVar.f46457H = n16;
                                                bVar.f46458I = aVar14;
                                                bVar.f46459J = aVar15;
                                                bVar.f46465P = 11;
                                                if (aVar15.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar15.d(null);
                                                if (!(rVarA2 instanceof h2.r.a)) {
                                                    c6648z12.E(n16);
                                                }
                                            }
                                            n6 = n16;
                                            c6648z2 = c6648z12;
                                            c6641s = c6641s7;
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n211 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n211;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m1112 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 6:
                                        aVar7 = (p059f9.a) bVar.f46459J;
                                        aVar6 = (h2.B.a) bVar.f46458I;
                                        n12 = (W8.N) bVar.f46457H;
                                        c6648z7 = (p073h2.C6648z) bVar.f46456G;
                                        c6641s4 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        rVarA = aVar6.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                        aVar7.d(null);
                                        if (!(rVarA instanceof h2.r.a)) {
                                            c6648z7.E(n12);
                                        }
                                        n6 = n12;
                                        c6648z2 = c6648z7;
                                        c6641s = c6641s4;
                                        enumC6642t6 = p073h2.EnumC6642t.PREPEND;
                                        if (c6641s.e() instanceof h2.r.a) {
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n212 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n212;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m1113 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (enumC6642t6 != p073h2.EnumC6642t.REFRESH) {
                                                aVar8 = c6648z2.f46378k;
                                                aVar9 = aVar8.f45891b;
                                                bVar.f46455F = c6641s;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n6;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar8;
                                                bVar.f46460K = aVar9;
                                                bVar.f46465P = 7;
                                                if (aVar9.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6641s6 = c6641s;
                                                aVar10 = aVar9;
                                                n14 = n6;
                                                aVar11 = aVar8;
                                                b6 = aVar11.f45892c;
                                                bVar.f46455F = c6641s6;
                                                bVar.f46456G = c6648z2;
                                                bVar.f46457H = n14;
                                                bVar.f46458I = enumC6642t6;
                                                bVar.f46459J = aVar10;
                                                bVar.f46460K = null;
                                                bVar.f46465P = 8;
                                                if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t7 = enumC6642t6;
                                                n15 = n14;
                                                c6648z9 = c6648z2;
                                                r6 = aVar10;
                                                p087i7.M m1114 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n13 = n15;
                                                c6648z8 = c6648z9;
                                                c6641s5 = c6641s6;
                                            } else {
                                                c6641s5 = c6641s;
                                                n13 = n6;
                                                enumC6642t7 = enumC6642t6;
                                                c6648z8 = c6648z2;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                                c6648z11 = c6648z8;
                                                z10 = null;
                                                enumC6642t9 = enumC6642t7;
                                            } else {
                                                aVar12 = c6648z8.f46378k;
                                                aVar13 = aVar12.f45891b;
                                                bVar.f46455F = c6641s5;
                                                bVar.f46456G = c6648z8;
                                                bVar.f46457H = n13;
                                                bVar.f46458I = enumC6642t7;
                                                bVar.f46459J = aVar12;
                                                bVar.f46460K = aVar13;
                                                bVar.f46461L = enumC6642t7;
                                                bVar.f46462M = c6648z8;
                                                bVar.f46465P = 9;
                                                if (aVar13.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z10 = c6648z8;
                                                enumC6642t8 = enumC6642t7;
                                                z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                                aVar13.d(null);
                                                c6648z11 = c6648z8;
                                                enumC6642t9 = enumC6642t7;
                                                enumC6642t7 = enumC6642t8;
                                                c6648z8 = c6648z10;
                                            }
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46462M = null;
                                            bVar.f46465P = 10;
                                            if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z12 = c6648z8;
                                            enumC6642t10 = enumC6642t7;
                                            n16 = n13;
                                            c6641s7 = c6641s5;
                                            if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                                aVar14 = c6648z12.f46378k;
                                                aVar15 = aVar14.f45891b;
                                                bVar.f46455F = c6641s7;
                                                bVar.f46456G = c6648z12;
                                                bVar.f46457H = n16;
                                                bVar.f46458I = aVar14;
                                                bVar.f46459J = aVar15;
                                                bVar.f46465P = 11;
                                                if (aVar15.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar15.d(null);
                                                if (!(rVarA2 instanceof h2.r.a)) {
                                                    c6648z12.E(n16);
                                                }
                                            }
                                            n6 = n16;
                                            c6648z2 = c6648z12;
                                            c6641s = c6641s7;
                                            enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                            if (c6641s.d() instanceof h2.r.a) {
                                                if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                    aVar16 = c6648z2.f46378k;
                                                    aVar17 = aVar16.f45891b;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n6;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar16;
                                                    bVar.f46459J = aVar17;
                                                    bVar.f46465P = 12;
                                                    if (aVar17.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    W8.N n213 = n6;
                                                    aVar18 = aVar16;
                                                    aVar19 = aVar17;
                                                    n18 = n213;
                                                    b10 = aVar18.f45892c;
                                                    bVar.f46455F = c6648z2;
                                                    bVar.f46456G = n18;
                                                    bVar.f46457H = enumC6642t11;
                                                    bVar.f46458I = aVar19;
                                                    bVar.f46459J = null;
                                                    bVar.f46465P = 13;
                                                    if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    enumC6642t12 = enumC6642t11;
                                                    n19 = n18;
                                                    c6648z14 = c6648z2;
                                                    r6 = aVar19;
                                                    p087i7.M m1115 = p087i7.M.f46721a;
                                                    r6.d(null);
                                                    n17 = n19;
                                                    c6648z13 = c6648z14;
                                                } else {
                                                    c6648z13 = c6648z2;
                                                    n17 = n6;
                                                    enumC6642t12 = enumC6642t11;
                                                }
                                                if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                    c6648z16 = c6648z13;
                                                    z11 = null;
                                                    enumC6642t15 = enumC6642t12;
                                                } else {
                                                    aVar20 = c6648z13.f46378k;
                                                    aVar21 = aVar20.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n17;
                                                    bVar.f46457H = enumC6642t12;
                                                    bVar.f46458I = aVar20;
                                                    bVar.f46459J = aVar21;
                                                    bVar.f46460K = enumC6642t12;
                                                    bVar.f46461L = c6648z13;
                                                    bVar.f46465P = 14;
                                                    if (aVar21.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z15 = c6648z13;
                                                    enumC6642t13 = enumC6642t12;
                                                    enumC6642t14 = enumC6642t13;
                                                    aVar22 = aVar21;
                                                    z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                    aVar22.d(null);
                                                    enumC6642t15 = enumC6642t13;
                                                    enumC6642t12 = enumC6642t14;
                                                    c6648z16 = c6648z13;
                                                    c6648z13 = c6648z15;
                                                }
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = null;
                                                bVar.f46459J = null;
                                                bVar.f46460K = null;
                                                bVar.f46461L = null;
                                                bVar.f46465P = 15;
                                                if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                    return objG;
                                                }
                                                n20 = n17;
                                                if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                    aVar23 = c6648z13.f46378k;
                                                    aVar24 = aVar23.f45891b;
                                                    bVar.f46455F = c6648z13;
                                                    bVar.f46456G = n20;
                                                    bVar.f46457H = aVar23;
                                                    bVar.f46458I = aVar24;
                                                    bVar.f46465P = 16;
                                                    if (aVar24.c(null, bVar) == objG) {
                                                        return objG;
                                                    }
                                                    c6648z17 = c6648z13;
                                                    aVar25 = aVar24;
                                                    aVar26 = aVar23;
                                                    rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                    aVar25.d(null);
                                                    if (!(rVarA3 instanceof h2.r.a)) {
                                                        c6648z17.E(n20);
                                                    }
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 7:
                                        p059f9.a aVar30 = (p059f9.a) bVar.f46460K;
                                        aVar11 = (h2.B.a) bVar.f46459J;
                                        enumC6642t6 = (p073h2.EnumC6642t) bVar.f46458I;
                                        n14 = (W8.N) bVar.f46457H;
                                        p073h2.C6648z c6648z20 = (p073h2.C6648z) bVar.f46456G;
                                        p073h2.C6641s c6641s10 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        c6648z2 = c6648z20;
                                        c6641s6 = c6641s10;
                                        aVar10 = aVar30;
                                        b6 = aVar11.f45892c;
                                        bVar.f46455F = c6641s6;
                                        bVar.f46456G = c6648z2;
                                        bVar.f46457H = n14;
                                        bVar.f46458I = enumC6642t6;
                                        bVar.f46459J = aVar10;
                                        bVar.f46460K = null;
                                        bVar.f46465P = 8;
                                        if (c6648z2.D(b6, enumC6642t6, bVar) == objG) {
                                            return objG;
                                        }
                                        enumC6642t7 = enumC6642t6;
                                        n15 = n14;
                                        c6648z9 = c6648z2;
                                        r6 = aVar10;
                                        p087i7.M m1116 = p087i7.M.f46721a;
                                        r6.d(null);
                                        n13 = n15;
                                        c6648z8 = c6648z9;
                                        c6641s5 = c6641s6;
                                        if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                            c6648z11 = c6648z8;
                                            z10 = null;
                                            enumC6642t9 = enumC6642t7;
                                        } else {
                                            aVar12 = c6648z8.f46378k;
                                            aVar13 = aVar12.f45891b;
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = aVar12;
                                            bVar.f46460K = aVar13;
                                            bVar.f46461L = enumC6642t7;
                                            bVar.f46462M = c6648z8;
                                            bVar.f46465P = 9;
                                            if (aVar13.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z10 = c6648z8;
                                            enumC6642t8 = enumC6642t7;
                                            z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                            aVar13.d(null);
                                            c6648z11 = c6648z8;
                                            enumC6642t9 = enumC6642t7;
                                            enumC6642t7 = enumC6642t8;
                                            c6648z8 = c6648z10;
                                        }
                                        bVar.f46455F = c6641s5;
                                        bVar.f46456G = c6648z8;
                                        bVar.f46457H = n13;
                                        bVar.f46458I = enumC6642t7;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46462M = null;
                                        bVar.f46465P = 10;
                                        if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                            return objG;
                                        }
                                        c6648z12 = c6648z8;
                                        enumC6642t10 = enumC6642t7;
                                        n16 = n13;
                                        c6641s7 = c6641s5;
                                        if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                            aVar14 = c6648z12.f46378k;
                                            aVar15 = aVar14.f45891b;
                                            bVar.f46455F = c6641s7;
                                            bVar.f46456G = c6648z12;
                                            bVar.f46457H = n16;
                                            bVar.f46458I = aVar14;
                                            bVar.f46459J = aVar15;
                                            bVar.f46465P = 11;
                                            if (aVar15.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar15.d(null);
                                            if (!(rVarA2 instanceof h2.r.a)) {
                                                c6648z12.E(n16);
                                            }
                                        }
                                        n6 = n16;
                                        c6648z2 = c6648z12;
                                        c6641s = c6641s7;
                                        enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                        if (c6641s.d() instanceof h2.r.a) {
                                            if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                aVar16 = c6648z2.f46378k;
                                                aVar17 = aVar16.f45891b;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n6;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar16;
                                                bVar.f46459J = aVar17;
                                                bVar.f46465P = 12;
                                                if (aVar17.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                W8.N n214 = n6;
                                                aVar18 = aVar16;
                                                aVar19 = aVar17;
                                                n18 = n214;
                                                b10 = aVar18.f45892c;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n18;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar19;
                                                bVar.f46459J = null;
                                                bVar.f46465P = 13;
                                                if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t12 = enumC6642t11;
                                                n19 = n18;
                                                c6648z14 = c6648z2;
                                                r6 = aVar19;
                                                p087i7.M m1117 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n17 = n19;
                                                c6648z13 = c6648z14;
                                            } else {
                                                c6648z13 = c6648z2;
                                                n17 = n6;
                                                enumC6642t12 = enumC6642t11;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                c6648z16 = c6648z13;
                                                z11 = null;
                                                enumC6642t15 = enumC6642t12;
                                            } else {
                                                aVar20 = c6648z13.f46378k;
                                                aVar21 = aVar20.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = aVar20;
                                                bVar.f46459J = aVar21;
                                                bVar.f46460K = enumC6642t12;
                                                bVar.f46461L = c6648z13;
                                                bVar.f46465P = 14;
                                                if (aVar21.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z15 = c6648z13;
                                                enumC6642t13 = enumC6642t12;
                                                enumC6642t14 = enumC6642t13;
                                                aVar22 = aVar21;
                                                z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                aVar22.d(null);
                                                enumC6642t15 = enumC6642t13;
                                                enumC6642t12 = enumC6642t14;
                                                c6648z16 = c6648z13;
                                                c6648z13 = c6648z15;
                                            }
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = null;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46465P = 15;
                                            if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                return objG;
                                            }
                                            n20 = n17;
                                            if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                aVar23 = c6648z13.f46378k;
                                                aVar24 = aVar23.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n20;
                                                bVar.f46457H = aVar23;
                                                bVar.f46458I = aVar24;
                                                bVar.f46465P = 16;
                                                if (aVar24.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z17 = c6648z13;
                                                aVar25 = aVar24;
                                                aVar26 = aVar23;
                                                rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar25.d(null);
                                                if (!(rVarA3 instanceof h2.r.a)) {
                                                    c6648z17.E(n20);
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 8:
                                        p059f9.a aVar31 = (p059f9.a) bVar.f46459J;
                                        enumC6642t7 = (p073h2.EnumC6642t) bVar.f46458I;
                                        n15 = (W8.N) bVar.f46457H;
                                        c6648z9 = (p073h2.C6648z) bVar.f46456G;
                                        c6641s6 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        r6 = aVar31;
                                        p087i7.M m1118 = p087i7.M.f46721a;
                                        r6.d(null);
                                        n13 = n15;
                                        c6648z8 = c6648z9;
                                        c6641s5 = c6641s6;
                                        if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t7.ordinal()] == 1) {
                                            c6648z11 = c6648z8;
                                            z10 = null;
                                            enumC6642t9 = enumC6642t7;
                                        } else {
                                            aVar12 = c6648z8.f46378k;
                                            aVar13 = aVar12.f45891b;
                                            bVar.f46455F = c6641s5;
                                            bVar.f46456G = c6648z8;
                                            bVar.f46457H = n13;
                                            bVar.f46458I = enumC6642t7;
                                            bVar.f46459J = aVar12;
                                            bVar.f46460K = aVar13;
                                            bVar.f46461L = enumC6642t7;
                                            bVar.f46462M = c6648z8;
                                            bVar.f46465P = 9;
                                            if (aVar13.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z10 = c6648z8;
                                            enumC6642t8 = enumC6642t7;
                                            z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                            aVar13.d(null);
                                            c6648z11 = c6648z8;
                                            enumC6642t9 = enumC6642t7;
                                            enumC6642t7 = enumC6642t8;
                                            c6648z8 = c6648z10;
                                        }
                                        bVar.f46455F = c6641s5;
                                        bVar.f46456G = c6648z8;
                                        bVar.f46457H = n13;
                                        bVar.f46458I = enumC6642t7;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46462M = null;
                                        bVar.f46465P = 10;
                                        if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                            return objG;
                                        }
                                        c6648z12 = c6648z8;
                                        enumC6642t10 = enumC6642t7;
                                        n16 = n13;
                                        c6641s7 = c6641s5;
                                        if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                            aVar14 = c6648z12.f46378k;
                                            aVar15 = aVar14.f45891b;
                                            bVar.f46455F = c6641s7;
                                            bVar.f46456G = c6648z12;
                                            bVar.f46457H = n16;
                                            bVar.f46458I = aVar14;
                                            bVar.f46459J = aVar15;
                                            bVar.f46465P = 11;
                                            if (aVar15.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar15.d(null);
                                            if (!(rVarA2 instanceof h2.r.a)) {
                                                c6648z12.E(n16);
                                            }
                                        }
                                        n6 = n16;
                                        c6648z2 = c6648z12;
                                        c6641s = c6641s7;
                                        enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                        if (c6641s.d() instanceof h2.r.a) {
                                            if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                aVar16 = c6648z2.f46378k;
                                                aVar17 = aVar16.f45891b;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n6;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar16;
                                                bVar.f46459J = aVar17;
                                                bVar.f46465P = 12;
                                                if (aVar17.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                W8.N n215 = n6;
                                                aVar18 = aVar16;
                                                aVar19 = aVar17;
                                                n18 = n215;
                                                b10 = aVar18.f45892c;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n18;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar19;
                                                bVar.f46459J = null;
                                                bVar.f46465P = 13;
                                                if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t12 = enumC6642t11;
                                                n19 = n18;
                                                c6648z14 = c6648z2;
                                                r6 = aVar19;
                                                p087i7.M m1119 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n17 = n19;
                                                c6648z13 = c6648z14;
                                            } else {
                                                c6648z13 = c6648z2;
                                                n17 = n6;
                                                enumC6642t12 = enumC6642t11;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                c6648z16 = c6648z13;
                                                z11 = null;
                                                enumC6642t15 = enumC6642t12;
                                            } else {
                                                aVar20 = c6648z13.f46378k;
                                                aVar21 = aVar20.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = aVar20;
                                                bVar.f46459J = aVar21;
                                                bVar.f46460K = enumC6642t12;
                                                bVar.f46461L = c6648z13;
                                                bVar.f46465P = 14;
                                                if (aVar21.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z15 = c6648z13;
                                                enumC6642t13 = enumC6642t12;
                                                enumC6642t14 = enumC6642t13;
                                                aVar22 = aVar21;
                                                z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                aVar22.d(null);
                                                enumC6642t15 = enumC6642t13;
                                                enumC6642t12 = enumC6642t14;
                                                c6648z16 = c6648z13;
                                                c6648z13 = c6648z15;
                                            }
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = null;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46465P = 15;
                                            if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                return objG;
                                            }
                                            n20 = n17;
                                            if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                aVar23 = c6648z13.f46378k;
                                                aVar24 = aVar23.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n20;
                                                bVar.f46457H = aVar23;
                                                bVar.f46458I = aVar24;
                                                bVar.f46465P = 16;
                                                if (aVar24.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z17 = c6648z13;
                                                aVar25 = aVar24;
                                                aVar26 = aVar23;
                                                rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar25.d(null);
                                                if (!(rVarA3 instanceof h2.r.a)) {
                                                    c6648z17.E(n20);
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 9:
                                        c6648z8 = (p073h2.C6648z) bVar.f46462M;
                                        enumC6642t7 = (p073h2.EnumC6642t) bVar.f46461L;
                                        aVar13 = (p059f9.a) bVar.f46460K;
                                        aVar12 = (h2.B.a) bVar.f46459J;
                                        enumC6642t8 = (p073h2.EnumC6642t) bVar.f46458I;
                                        n13 = (W8.N) bVar.f46457H;
                                        c6648z10 = (p073h2.C6648z) bVar.f46456G;
                                        c6641s5 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        z10 = (p073h2.Z) aVar12.f45892c.k().get(enumC6642t8);
                                        aVar13.d(null);
                                        c6648z11 = c6648z8;
                                        enumC6642t9 = enumC6642t7;
                                        enumC6642t7 = enumC6642t8;
                                        c6648z8 = c6648z10;
                                        bVar.f46455F = c6641s5;
                                        bVar.f46456G = c6648z8;
                                        bVar.f46457H = n13;
                                        bVar.f46458I = enumC6642t7;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46462M = null;
                                        bVar.f46465P = 10;
                                        if (c6648z11.B(enumC6642t9, z10, bVar) == objG) {
                                            return objG;
                                        }
                                        c6648z12 = c6648z8;
                                        enumC6642t10 = enumC6642t7;
                                        n16 = n13;
                                        c6641s7 = c6641s5;
                                        if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                            aVar14 = c6648z12.f46378k;
                                            aVar15 = aVar14.f45891b;
                                            bVar.f46455F = c6641s7;
                                            bVar.f46456G = c6648z12;
                                            bVar.f46457H = n16;
                                            bVar.f46458I = aVar14;
                                            bVar.f46459J = aVar15;
                                            bVar.f46465P = 11;
                                            if (aVar15.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar15.d(null);
                                            if (!(rVarA2 instanceof h2.r.a)) {
                                                c6648z12.E(n16);
                                            }
                                        }
                                        n6 = n16;
                                        c6648z2 = c6648z12;
                                        c6641s = c6641s7;
                                        enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                        if (c6641s.d() instanceof h2.r.a) {
                                            if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                aVar16 = c6648z2.f46378k;
                                                aVar17 = aVar16.f45891b;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n6;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar16;
                                                bVar.f46459J = aVar17;
                                                bVar.f46465P = 12;
                                                if (aVar17.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                W8.N n216 = n6;
                                                aVar18 = aVar16;
                                                aVar19 = aVar17;
                                                n18 = n216;
                                                b10 = aVar18.f45892c;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n18;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar19;
                                                bVar.f46459J = null;
                                                bVar.f46465P = 13;
                                                if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t12 = enumC6642t11;
                                                n19 = n18;
                                                c6648z14 = c6648z2;
                                                r6 = aVar19;
                                                p087i7.M m11110 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n17 = n19;
                                                c6648z13 = c6648z14;
                                            } else {
                                                c6648z13 = c6648z2;
                                                n17 = n6;
                                                enumC6642t12 = enumC6642t11;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                c6648z16 = c6648z13;
                                                z11 = null;
                                                enumC6642t15 = enumC6642t12;
                                            } else {
                                                aVar20 = c6648z13.f46378k;
                                                aVar21 = aVar20.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = aVar20;
                                                bVar.f46459J = aVar21;
                                                bVar.f46460K = enumC6642t12;
                                                bVar.f46461L = c6648z13;
                                                bVar.f46465P = 14;
                                                if (aVar21.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z15 = c6648z13;
                                                enumC6642t13 = enumC6642t12;
                                                enumC6642t14 = enumC6642t13;
                                                aVar22 = aVar21;
                                                z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                aVar22.d(null);
                                                enumC6642t15 = enumC6642t13;
                                                enumC6642t12 = enumC6642t14;
                                                c6648z16 = c6648z13;
                                                c6648z13 = c6648z15;
                                            }
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = null;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46465P = 15;
                                            if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                return objG;
                                            }
                                            n20 = n17;
                                            if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                aVar23 = c6648z13.f46378k;
                                                aVar24 = aVar23.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n20;
                                                bVar.f46457H = aVar23;
                                                bVar.f46458I = aVar24;
                                                bVar.f46465P = 16;
                                                if (aVar24.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z17 = c6648z13;
                                                aVar25 = aVar24;
                                                aVar26 = aVar23;
                                                rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar25.d(null);
                                                if (!(rVarA3 instanceof h2.r.a)) {
                                                    c6648z17.E(n20);
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 10:
                                        enumC6642t10 = (p073h2.EnumC6642t) bVar.f46458I;
                                        W8.N n31 = (W8.N) bVar.f46457H;
                                        p073h2.C6648z c6648z21 = (p073h2.C6648z) bVar.f46456G;
                                        p073h2.C6641s c6641s11 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        c6641s7 = c6641s11;
                                        c6648z12 = c6648z21;
                                        n16 = n31;
                                        if (enumC6642t10 == p073h2.EnumC6642t.REFRESH) {
                                            aVar14 = c6648z12.f46378k;
                                            aVar15 = aVar14.f45891b;
                                            bVar.f46455F = c6641s7;
                                            bVar.f46456G = c6648z12;
                                            bVar.f46457H = n16;
                                            bVar.f46458I = aVar14;
                                            bVar.f46459J = aVar15;
                                            bVar.f46465P = 11;
                                            if (aVar15.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar15.d(null);
                                            if (!(rVarA2 instanceof h2.r.a)) {
                                                c6648z12.E(n16);
                                            }
                                        }
                                        n6 = n16;
                                        c6648z2 = c6648z12;
                                        c6641s = c6641s7;
                                        enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                        if (c6641s.d() instanceof h2.r.a) {
                                            if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                aVar16 = c6648z2.f46378k;
                                                aVar17 = aVar16.f45891b;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n6;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar16;
                                                bVar.f46459J = aVar17;
                                                bVar.f46465P = 12;
                                                if (aVar17.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                W8.N n217 = n6;
                                                aVar18 = aVar16;
                                                aVar19 = aVar17;
                                                n18 = n217;
                                                b10 = aVar18.f45892c;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n18;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar19;
                                                bVar.f46459J = null;
                                                bVar.f46465P = 13;
                                                if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t12 = enumC6642t11;
                                                n19 = n18;
                                                c6648z14 = c6648z2;
                                                r6 = aVar19;
                                                p087i7.M m11111 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n17 = n19;
                                                c6648z13 = c6648z14;
                                            } else {
                                                c6648z13 = c6648z2;
                                                n17 = n6;
                                                enumC6642t12 = enumC6642t11;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                c6648z16 = c6648z13;
                                                z11 = null;
                                                enumC6642t15 = enumC6642t12;
                                            } else {
                                                aVar20 = c6648z13.f46378k;
                                                aVar21 = aVar20.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = aVar20;
                                                bVar.f46459J = aVar21;
                                                bVar.f46460K = enumC6642t12;
                                                bVar.f46461L = c6648z13;
                                                bVar.f46465P = 14;
                                                if (aVar21.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z15 = c6648z13;
                                                enumC6642t13 = enumC6642t12;
                                                enumC6642t14 = enumC6642t13;
                                                aVar22 = aVar21;
                                                z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                aVar22.d(null);
                                                enumC6642t15 = enumC6642t13;
                                                enumC6642t12 = enumC6642t14;
                                                c6648z16 = c6648z13;
                                                c6648z13 = c6648z15;
                                            }
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = null;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46465P = 15;
                                            if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                return objG;
                                            }
                                            n20 = n17;
                                            if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                aVar23 = c6648z13.f46378k;
                                                aVar24 = aVar23.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n20;
                                                bVar.f46457H = aVar23;
                                                bVar.f46458I = aVar24;
                                                bVar.f46465P = 16;
                                                if (aVar24.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z17 = c6648z13;
                                                aVar25 = aVar24;
                                                aVar26 = aVar23;
                                                rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar25.d(null);
                                                if (!(rVarA3 instanceof h2.r.a)) {
                                                    c6648z17.E(n20);
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 11:
                                        aVar15 = (p059f9.a) bVar.f46459J;
                                        aVar14 = (h2.B.a) bVar.f46458I;
                                        n16 = (W8.N) bVar.f46457H;
                                        c6648z12 = (p073h2.C6648z) bVar.f46456G;
                                        c6641s7 = (p073h2.C6641s) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        rVarA2 = aVar14.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                        aVar15.d(null);
                                        if (!(rVarA2 instanceof h2.r.a)) {
                                            c6648z12.E(n16);
                                        }
                                        n6 = n16;
                                        c6648z2 = c6648z12;
                                        c6641s = c6641s7;
                                        enumC6642t11 = p073h2.EnumC6642t.APPEND;
                                        if (c6641s.d() instanceof h2.r.a) {
                                            if (enumC6642t11 != p073h2.EnumC6642t.REFRESH) {
                                                aVar16 = c6648z2.f46378k;
                                                aVar17 = aVar16.f45891b;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n6;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar16;
                                                bVar.f46459J = aVar17;
                                                bVar.f46465P = 12;
                                                if (aVar17.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                W8.N n218 = n6;
                                                aVar18 = aVar16;
                                                aVar19 = aVar17;
                                                n18 = n218;
                                                b10 = aVar18.f45892c;
                                                bVar.f46455F = c6648z2;
                                                bVar.f46456G = n18;
                                                bVar.f46457H = enumC6642t11;
                                                bVar.f46458I = aVar19;
                                                bVar.f46459J = null;
                                                bVar.f46465P = 13;
                                                if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                                    return objG;
                                                }
                                                enumC6642t12 = enumC6642t11;
                                                n19 = n18;
                                                c6648z14 = c6648z2;
                                                r6 = aVar19;
                                                p087i7.M m11112 = p087i7.M.f46721a;
                                                r6.d(null);
                                                n17 = n19;
                                                c6648z13 = c6648z14;
                                            } else {
                                                c6648z13 = c6648z2;
                                                n17 = n6;
                                                enumC6642t12 = enumC6642t11;
                                            }
                                            if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                                c6648z16 = c6648z13;
                                                z11 = null;
                                                enumC6642t15 = enumC6642t12;
                                            } else {
                                                aVar20 = c6648z13.f46378k;
                                                aVar21 = aVar20.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n17;
                                                bVar.f46457H = enumC6642t12;
                                                bVar.f46458I = aVar20;
                                                bVar.f46459J = aVar21;
                                                bVar.f46460K = enumC6642t12;
                                                bVar.f46461L = c6648z13;
                                                bVar.f46465P = 14;
                                                if (aVar21.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z15 = c6648z13;
                                                enumC6642t13 = enumC6642t12;
                                                enumC6642t14 = enumC6642t13;
                                                aVar22 = aVar21;
                                                z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                                aVar22.d(null);
                                                enumC6642t15 = enumC6642t13;
                                                enumC6642t12 = enumC6642t14;
                                                c6648z16 = c6648z13;
                                                c6648z13 = c6648z15;
                                            }
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = null;
                                            bVar.f46459J = null;
                                            bVar.f46460K = null;
                                            bVar.f46461L = null;
                                            bVar.f46465P = 15;
                                            if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                                return objG;
                                            }
                                            n20 = n17;
                                            if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                                aVar23 = c6648z13.f46378k;
                                                aVar24 = aVar23.f45891b;
                                                bVar.f46455F = c6648z13;
                                                bVar.f46456G = n20;
                                                bVar.f46457H = aVar23;
                                                bVar.f46458I = aVar24;
                                                bVar.f46465P = 16;
                                                if (aVar24.c(null, bVar) == objG) {
                                                    return objG;
                                                }
                                                c6648z17 = c6648z13;
                                                aVar25 = aVar24;
                                                aVar26 = aVar23;
                                                rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                                aVar25.d(null);
                                                if (!(rVarA3 instanceof h2.r.a)) {
                                                    c6648z17.E(n20);
                                                }
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 12:
                                        p059f9.a aVar32 = (p059f9.a) bVar.f46459J;
                                        aVar18 = (h2.B.a) bVar.f46458I;
                                        enumC6642t11 = (p073h2.EnumC6642t) bVar.f46457H;
                                        n18 = (W8.N) bVar.f46456G;
                                        p073h2.C6648z c6648z22 = (p073h2.C6648z) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        c6648z2 = c6648z22;
                                        aVar19 = aVar32;
                                        b10 = aVar18.f45892c;
                                        bVar.f46455F = c6648z2;
                                        bVar.f46456G = n18;
                                        bVar.f46457H = enumC6642t11;
                                        bVar.f46458I = aVar19;
                                        bVar.f46459J = null;
                                        bVar.f46465P = 13;
                                        if (c6648z2.D(b10, enumC6642t11, bVar) == objG) {
                                            return objG;
                                        }
                                        enumC6642t12 = enumC6642t11;
                                        n19 = n18;
                                        c6648z14 = c6648z2;
                                        r6 = aVar19;
                                        p087i7.M m11113 = p087i7.M.f46721a;
                                        r6.d(null);
                                        n17 = n19;
                                        c6648z13 = c6648z14;
                                        if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                            c6648z16 = c6648z13;
                                            z11 = null;
                                            enumC6642t15 = enumC6642t12;
                                        } else {
                                            aVar20 = c6648z13.f46378k;
                                            aVar21 = aVar20.f45891b;
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = aVar20;
                                            bVar.f46459J = aVar21;
                                            bVar.f46460K = enumC6642t12;
                                            bVar.f46461L = c6648z13;
                                            bVar.f46465P = 14;
                                            if (aVar21.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z15 = c6648z13;
                                            enumC6642t13 = enumC6642t12;
                                            enumC6642t14 = enumC6642t13;
                                            aVar22 = aVar21;
                                            z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                            aVar22.d(null);
                                            enumC6642t15 = enumC6642t13;
                                            enumC6642t12 = enumC6642t14;
                                            c6648z16 = c6648z13;
                                            c6648z13 = c6648z15;
                                        }
                                        bVar.f46455F = c6648z13;
                                        bVar.f46456G = n17;
                                        bVar.f46457H = enumC6642t12;
                                        bVar.f46458I = null;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46465P = 15;
                                        if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                            return objG;
                                        }
                                        n20 = n17;
                                        if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                            aVar23 = c6648z13.f46378k;
                                            aVar24 = aVar23.f45891b;
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n20;
                                            bVar.f46457H = aVar23;
                                            bVar.f46458I = aVar24;
                                            bVar.f46465P = 16;
                                            if (aVar24.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z17 = c6648z13;
                                            aVar25 = aVar24;
                                            aVar26 = aVar23;
                                            rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar25.d(null);
                                            if (!(rVarA3 instanceof h2.r.a)) {
                                                c6648z17.E(n20);
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 13:
                                        p059f9.a aVar33 = (p059f9.a) bVar.f46458I;
                                        enumC6642t12 = (p073h2.EnumC6642t) bVar.f46457H;
                                        n19 = (W8.N) bVar.f46456G;
                                        c6648z14 = (p073h2.C6648z) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        r6 = aVar33;
                                        p087i7.M m11114 = p087i7.M.f46721a;
                                        r6.d(null);
                                        n17 = n19;
                                        c6648z13 = c6648z14;
                                        if (p073h2.C6648z.i.c.a.C0559a.f46454a[enumC6642t12.ordinal()] == 1) {
                                            c6648z16 = c6648z13;
                                            z11 = null;
                                            enumC6642t15 = enumC6642t12;
                                        } else {
                                            aVar20 = c6648z13.f46378k;
                                            aVar21 = aVar20.f45891b;
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n17;
                                            bVar.f46457H = enumC6642t12;
                                            bVar.f46458I = aVar20;
                                            bVar.f46459J = aVar21;
                                            bVar.f46460K = enumC6642t12;
                                            bVar.f46461L = c6648z13;
                                            bVar.f46465P = 14;
                                            if (aVar21.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z15 = c6648z13;
                                            enumC6642t13 = enumC6642t12;
                                            enumC6642t14 = enumC6642t13;
                                            aVar22 = aVar21;
                                            z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                            aVar22.d(null);
                                            enumC6642t15 = enumC6642t13;
                                            enumC6642t12 = enumC6642t14;
                                            c6648z16 = c6648z13;
                                            c6648z13 = c6648z15;
                                        }
                                        bVar.f46455F = c6648z13;
                                        bVar.f46456G = n17;
                                        bVar.f46457H = enumC6642t12;
                                        bVar.f46458I = null;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46465P = 15;
                                        if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                            return objG;
                                        }
                                        n20 = n17;
                                        if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                            aVar23 = c6648z13.f46378k;
                                            aVar24 = aVar23.f45891b;
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n20;
                                            bVar.f46457H = aVar23;
                                            bVar.f46458I = aVar24;
                                            bVar.f46465P = 16;
                                            if (aVar24.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z17 = c6648z13;
                                            aVar25 = aVar24;
                                            aVar26 = aVar23;
                                            rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar25.d(null);
                                            if (!(rVarA3 instanceof h2.r.a)) {
                                                c6648z17.E(n20);
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 14:
                                        c6648z13 = (p073h2.C6648z) bVar.f46461L;
                                        enumC6642t13 = (p073h2.EnumC6642t) bVar.f46460K;
                                        aVar22 = (p059f9.a) bVar.f46459J;
                                        aVar20 = (h2.B.a) bVar.f46458I;
                                        enumC6642t14 = (p073h2.EnumC6642t) bVar.f46457H;
                                        n17 = (W8.N) bVar.f46456G;
                                        c6648z15 = (p073h2.C6648z) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        z11 = (p073h2.Z) aVar20.f45892c.k().get(enumC6642t14);
                                        aVar22.d(null);
                                        enumC6642t15 = enumC6642t13;
                                        enumC6642t12 = enumC6642t14;
                                        c6648z16 = c6648z13;
                                        c6648z13 = c6648z15;
                                        bVar.f46455F = c6648z13;
                                        bVar.f46456G = n17;
                                        bVar.f46457H = enumC6642t12;
                                        bVar.f46458I = null;
                                        bVar.f46459J = null;
                                        bVar.f46460K = null;
                                        bVar.f46461L = null;
                                        bVar.f46465P = 15;
                                        if (c6648z16.B(enumC6642t15, z11, bVar) == objG) {
                                            return objG;
                                        }
                                        n20 = n17;
                                        if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                            aVar23 = c6648z13.f46378k;
                                            aVar24 = aVar23.f45891b;
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n20;
                                            bVar.f46457H = aVar23;
                                            bVar.f46458I = aVar24;
                                            bVar.f46465P = 16;
                                            if (aVar24.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z17 = c6648z13;
                                            aVar25 = aVar24;
                                            aVar26 = aVar23;
                                            rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar25.d(null);
                                            if (!(rVarA3 instanceof h2.r.a)) {
                                                c6648z17.E(n20);
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 15:
                                        p073h2.EnumC6642t enumC6642t17 = (p073h2.EnumC6642t) bVar.f46457H;
                                        n20 = (W8.N) bVar.f46456G;
                                        p073h2.C6648z c6648z23 = (p073h2.C6648z) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        enumC6642t12 = enumC6642t17;
                                        c6648z13 = c6648z23;
                                        if (enumC6642t12 == p073h2.EnumC6642t.REFRESH) {
                                            aVar23 = c6648z13.f46378k;
                                            aVar24 = aVar23.f45891b;
                                            bVar.f46455F = c6648z13;
                                            bVar.f46456G = n20;
                                            bVar.f46457H = aVar23;
                                            bVar.f46458I = aVar24;
                                            bVar.f46465P = 16;
                                            if (aVar24.c(null, bVar) == objG) {
                                                return objG;
                                            }
                                            c6648z17 = c6648z13;
                                            aVar25 = aVar24;
                                            aVar26 = aVar23;
                                            rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                            aVar25.d(null);
                                            if (!(rVarA3 instanceof h2.r.a)) {
                                                c6648z17.E(n20);
                                            }
                                        }
                                        return p087i7.M.f46721a;
                                    case 16:
                                        aVar25 = (p059f9.a) bVar.f46458I;
                                        aVar26 = (h2.B.a) bVar.f46457H;
                                        n20 = (W8.N) bVar.f46456G;
                                        c6648z17 = (p073h2.C6648z) bVar.f46455F;
                                        p087i7.x.b(obj);
                                        rVarA3 = aVar26.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                                        aVar25.d(null);
                                        if (!(rVarA3 instanceof h2.r.a)) {
                                            c6648z17.E(n20);
                                        }
                                        return p087i7.M.f46721a;
                                    default:
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } catch (java.lang.Throwable th8) {
                                r6.d(null);
                                throw th8;
                            }
                        } catch (java.lang.Throwable th9) {
                            r6.d(null);
                            throw th9;
                        }
                    } catch (java.lang.Throwable th10) {
                        r6.d(null);
                        throw th10;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Y8.j jVar, p073h2.C6648z c6648z, p127m7.e eVar) {
                super(2, eVar);
                this.f46450I = jVar;
                this.f46451J = c6648z;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f46448G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    W8.N n6 = (W8.N) this.f46449H;
                    Z8.InterfaceC1869f interfaceC1869fM = Z8.AbstractC1871h.m(this.f46450I);
                    p073h2.C6648z.i.c.a aVar = new p073h2.C6648z.i.c.a(this.f46451J, n6);
                    this.f46448G = 1;
                    if (interfaceC1869fM.b(aVar, this) == objG) {
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
                return ((p073h2.C6648z.i.c) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6648z.i.c cVar = new p073h2.C6648z.i.c(this.f46450I, this.f46451J, eVar);
                cVar.f46449H = obj;
                return cVar;
            }
        }

        i(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00dc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:38:0x010d  */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p073h2.T t6;
            p073h2.Q qW;
            p073h2.M m6;
            h2.B.a aVar;
            p059f9.a aVar2;
            p073h2.T t10;
            p073h2.C6648z c6648z;
            h2.B.a aVar3;
            p059f9.a aVar4;
            p073h2.T t11;
            p059f9.a aVar5;
            p073h2.r rVarA;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46434J;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        aVar2 = (p059f9.a) this.f46433I;
                        aVar = (h2.B.a) this.f46432H;
                        qW = (p073h2.Q) this.f46431G;
                        t10 = (p073h2.T) this.f46435K;
                        p087i7.x.b(obj);
                    } else if (i6 == 2) {
                        p073h2.T t12 = (p073h2.T) this.f46435K;
                        p087i7.x.b(obj);
                        t6 = t12;
                        aVar3 = p073h2.C6648z.this.f46378k;
                        aVar4 = aVar3.f45891b;
                        this.f46435K = t6;
                        this.f46431G = aVar3;
                        this.f46432H = aVar4;
                        this.f46434J = 3;
                        if (aVar4.c(null, this) == objG) {
                            return objG;
                        }
                        t11 = t6;
                        aVar5 = aVar4;
                    } else {
                        if (i6 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar5 = (p059f9.a) this.f46432H;
                        aVar3 = (h2.B.a) this.f46431G;
                        t11 = (p073h2.T) this.f46435K;
                        p087i7.x.b(obj);
                    }
                    try {
                        rVarA = aVar3.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                        aVar5.d(null);
                        if (!(rVarA instanceof h2.r.a)) {
                            p073h2.C6648z.this.E(t11);
                        }
                        return p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        aVar5.d(null);
                        throw th;
                    }
                }
                p087i7.x.b(obj);
                t6 = (p073h2.T) this.f46435K;
                if (!p073h2.C6648z.this.f46376i.compareAndSet(false, true)) {
                    throw new java.lang.IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString());
                }
                W8.AbstractC1788i.d(t6, null, null, new p073h2.C6648z.i.a(p073h2.C6648z.this, t6, null), 3, null);
                Y8.j jVarB = Y8.m.b(0, null, null, 6, null);
                W8.AbstractC1788i.d(t6, null, null, new p073h2.C6648z.i.b(p073h2.C6648z.this, jVarB, null), 3, null);
                W8.AbstractC1788i.d(t6, null, null, new p073h2.C6648z.i.c(jVarB, p073h2.C6648z.this, null), 3, null);
                qW = p073h2.C6648z.this.w();
                if (qW != null) {
                    p073h2.C6648z c6648z2 = p073h2.C6648z.this;
                    m6 = c6648z2.f46373f;
                    if (m6 == null) {
                        h2.B.a aVar6 = c6648z2.f46378k;
                        p059f9.a aVar7 = aVar6.f45891b;
                        this.f46435K = t6;
                        this.f46431G = qW;
                        this.f46432H = aVar6;
                        this.f46433I = aVar7;
                        this.f46434J = 1;
                        if (aVar7.c(null, this) == objG) {
                            return objG;
                        }
                        aVar = aVar6;
                        aVar2 = aVar7;
                        t10 = t6;
                    }
                    qW.d(m6);
                }
                c6648z = p073h2.C6648z.this;
                this.f46435K = t6;
                this.f46431G = null;
                this.f46432H = null;
                this.f46433I = null;
                this.f46434J = 2;
                if (c6648z.s(this) == objG) {
                    return objG;
                }
                aVar3 = p073h2.C6648z.this.f46378k;
                aVar4 = aVar3.f45891b;
                this.f46435K = t6;
                this.f46431G = aVar3;
                this.f46432H = aVar4;
                this.f46434J = 3;
                if (aVar4.c(null, this) == objG) {
                    return objG;
                }
                t11 = t6;
                aVar5 = aVar4;
                rVarA = aVar3.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                aVar5.d(null);
                if (!(rVarA instanceof h2.r.a)) {
                    p073h2.C6648z.this.E(t11);
                }
                return p087i7.M.f46721a;
                p073h2.M mG = aVar.f45892c.g(null);
                aVar2.d(null);
                p073h2.T t13 = t10;
                m6 = mG;
                t6 = t13;
                qW.d(m6);
                c6648z = p073h2.C6648z.this;
                this.f46435K = t6;
                this.f46431G = null;
                this.f46432H = null;
                this.f46433I = null;
                this.f46434J = 2;
                if (c6648z.s(this) == objG) {
                    return objG;
                }
                aVar3 = p073h2.C6648z.this.f46378k;
                aVar4 = aVar3.f45891b;
                this.f46435K = t6;
                this.f46431G = aVar3;
                this.f46432H = aVar4;
                this.f46434J = 3;
                if (aVar4.c(null, this) == objG) {
                    return objG;
                }
                t11 = t6;
                aVar5 = aVar4;
                rVarA = aVar3.f45892c.p().a(p073h2.EnumC6642t.REFRESH);
                aVar5.d(null);
                if (!(rVarA instanceof h2.r.a)) {
                    p073h2.C6648z.this.E(t11);
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th2) {
                aVar2.d(null);
                throw th2;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p073h2.T t6, p127m7.e eVar) {
            return ((p073h2.C6648z.i) x(t6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.C6648z.i iVar = p073h2.C6648z.this.new i(eVar);
            iVar.f46435K = obj;
            return iVar;
        }
    }

    /* JADX INFO: renamed from: h2.z$j */
    static final class j extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46466G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46467H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f46468I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46469J;

        j(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1870g interfaceC1870g;
            h2.B.a aVar;
            p059f9.a aVar2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46468I;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        interfaceC1870g = (Z8.InterfaceC1870g) this.f46467H;
                        aVar2 = (p059f9.a) this.f46466G;
                        aVar = (h2.B.a) this.f46469J;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                interfaceC1870g = (Z8.InterfaceC1870g) this.f46469J;
                aVar = p073h2.C6648z.this.f46378k;
                p059f9.a aVar3 = aVar.f45891b;
                this.f46469J = aVar;
                this.f46466G = aVar3;
                this.f46467H = interfaceC1870g;
                this.f46468I = 1;
                if (aVar3.c(null, this) == objG) {
                    return objG;
                }
                aVar2 = aVar3;
                p073h2.C6641s c6641sD = aVar.f45892c.p().d();
                aVar2.d(null);
                p073h2.AbstractC6646x.c cVar = new p073h2.AbstractC6646x.c(c6641sD, null, 2, null);
                this.f46469J = null;
                this.f46466G = null;
                this.f46467H = null;
                this.f46468I = 2;
                if (interfaceC1870g.a(cVar, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                aVar2.d(null);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((p073h2.C6648z.j) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.C6648z.j jVar = p073h2.C6648z.this.new j(eVar);
            jVar.f46469J = obj;
            return jVar;
        }
    }

    /* JADX INFO: renamed from: h2.z$k */
    static final class k extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46471G;

        /* JADX INFO: renamed from: h2.z$k$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46473G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46474H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p073h2.C6648z f46475I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p073h2.C6648z c6648z, p127m7.e eVar) {
                super(2, eVar);
                this.f46475I = c6648z;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f46473G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                p073h2.Z z6 = (p073h2.Z) this.f46474H;
                return p147o7.b.a(z6.d() * (-1) > this.f46475I.f46370c.f45914f || z6.c() * (-1) > this.f46475I.f46370c.f45914f);
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p073h2.Z z6, p127m7.e eVar) {
                return ((p073h2.C6648z.k.a) x(z6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6648z.k.a aVar = new p073h2.C6648z.k.a(this.f46475I, eVar);
                aVar.f46474H = obj;
                return aVar;
            }
        }

        k(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46471G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869fE = Z8.AbstractC1871h.E(p073h2.C6648z.this.f46375h.c(p073h2.EnumC6642t.APPEND), p073h2.C6648z.this.f46375h.c(p073h2.EnumC6642t.PREPEND));
                p073h2.C6648z.k.a aVar = new p073h2.C6648z.k.a(p073h2.C6648z.this, null);
                this.f46471G = 1;
                obj = Z8.AbstractC1871h.w(interfaceC1869fE, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            p073h2.Z z6 = (p073h2.Z) obj;
            if (z6 != null) {
                p073h2.C6648z c6648z = p073h2.C6648z.this;
                p073h2.K k6 = p073h2.K.f45981a;
                if (k6.a(3)) {
                    k6.b(3, "Jump triggered on PagingSource " + c6648z.v() + " by " + z6, null);
                }
                p073h2.C6648z.this.f46374g.b();
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p073h2.C6648z.k) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p073h2.C6648z.this.new k(eVar);
        }
    }

    /* JADX INFO: renamed from: h2.z$l */
    static final class l extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46476G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46477H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f46478I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f46479J;

        l(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p073h2.C6648z c6648z;
            h2.B.a aVar;
            p059f9.a aVar2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46479J;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        c6648z = (p073h2.C6648z) this.f46478I;
                        aVar2 = (p059f9.a) this.f46477H;
                        aVar = (h2.B.a) this.f46476G;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                c6648z = p073h2.C6648z.this;
                aVar = c6648z.f46378k;
                p059f9.a aVar3 = aVar.f45891b;
                this.f46476G = aVar;
                this.f46477H = aVar3;
                this.f46478I = c6648z;
                this.f46479J = 1;
                if (aVar3.c(null, this) == objG) {
                    return objG;
                }
                aVar2 = aVar3;
                Z8.InterfaceC1869f interfaceC1869fF = aVar.f45892c.f();
                aVar2.d(null);
                p073h2.EnumC6642t enumC6642t = p073h2.EnumC6642t.PREPEND;
                this.f46476G = null;
                this.f46477H = null;
                this.f46478I = null;
                this.f46479J = 2;
                if (c6648z.q(interfaceC1869fF, enumC6642t, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                aVar2.d(null);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p073h2.C6648z.l) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p073h2.C6648z.this.new l(eVar);
        }
    }

    /* JADX INFO: renamed from: h2.z$m */
    static final class m extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46481G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46482H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f46483I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f46484J;

        m(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p073h2.C6648z c6648z;
            h2.B.a aVar;
            p059f9.a aVar2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46484J;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        c6648z = (p073h2.C6648z) this.f46483I;
                        aVar2 = (p059f9.a) this.f46482H;
                        aVar = (h2.B.a) this.f46481G;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                c6648z = p073h2.C6648z.this;
                aVar = c6648z.f46378k;
                p059f9.a aVar3 = aVar.f45891b;
                this.f46481G = aVar;
                this.f46482H = aVar3;
                this.f46483I = c6648z;
                this.f46484J = 1;
                if (aVar3.c(null, this) == objG) {
                    return objG;
                }
                aVar2 = aVar3;
                Z8.InterfaceC1869f interfaceC1869fE = aVar.f45892c.e();
                aVar2.d(null);
                p073h2.EnumC6642t enumC6642t = p073h2.EnumC6642t.APPEND;
                this.f46481G = null;
                this.f46482H = null;
                this.f46483I = null;
                this.f46484J = 2;
                if (c6648z.q(interfaceC1869fE, enumC6642t, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                aVar2.d(null);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p073h2.C6648z.m) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p073h2.C6648z.this.new m(eVar);
        }
    }

    public C6648z(java.lang.Object obj, p073h2.L l6, p073h2.E e6, Z8.InterfaceC1869f interfaceC1869f, p073h2.Q q6, p073h2.M m6, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(l6, "pagingSource");
        p247y7.AbstractC7350t.f(e6, "config");
        p247y7.AbstractC7350t.f(interfaceC1869f, "retryFlow");
        p247y7.AbstractC7350t.f(aVar, "jumpCallback");
        this.f46368a = obj;
        this.f46369b = l6;
        this.f46370c = e6;
        this.f46371d = interfaceC1869f;
        this.f46373f = m6;
        this.f46374g = aVar;
        if (e6.f45914f != Integer.MIN_VALUE && !l6.b()) {
            throw new java.lang.IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.f46375h = new p073h2.C6636m();
        this.f46376i = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f46377j = Y8.m.b(-2, null, null, 6, null);
        this.f46378k = new h2.B.a(e6);
        W8.InterfaceC1819y interfaceC1819yB = W8.D0.b(null, 1, null);
        this.f46379l = interfaceC1819yB;
        this.f46380m = Z8.AbstractC1871h.H(p073h2.AbstractC6627d.a(interfaceC1819yB, new p073h2.C6648z.i(null)), new p073h2.C6648z.j(null));
    }

    private final void A() {
        p();
        this.f46369b.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object B(p073h2.EnumC6642t enumC6642t, p073h2.Z z6, p127m7.e eVar) throws java.lang.Throwable {
        if (p073h2.C6648z.a.f46381a[enumC6642t.ordinal()] == 1) {
            java.lang.Object objS = s(eVar);
            return objS == p137n7.b.g() ? objS : p087i7.M.f46721a;
        }
        if (z6 == null) {
            throw new java.lang.IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        this.f46375h.a(enumC6642t, z6);
        return p087i7.M.f46721a;
    }

    private final java.lang.Object C(p073h2.B b6, p073h2.EnumC6642t enumC6642t, h2.r.a aVar, p127m7.e eVar) {
        if (p247y7.AbstractC7350t.b(b6.p().a(enumC6642t), aVar)) {
            return p087i7.M.f46721a;
        }
        b6.p().c(enumC6642t, aVar);
        java.lang.Object objH = this.f46377j.h(new p073h2.AbstractC6646x.c(b6.p().d(), null), eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object D(p073h2.B b6, p073h2.EnumC6642t enumC6642t, p127m7.e eVar) {
        p073h2.r rVarA = b6.p().a(enumC6642t);
        h2.r.b bVar = h2.r.b.f46234b;
        if (p247y7.AbstractC7350t.b(rVarA, bVar)) {
            return p087i7.M.f46721a;
        }
        b6.p().c(enumC6642t, bVar);
        java.lang.Object objH = this.f46377j.h(new p073h2.AbstractC6646x.c(b6.p().d(), null), eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(W8.N n6) {
        if (this.f46370c.f45914f != Integer.MIN_VALUE) {
            W8.AbstractC1788i.d(n6, null, null, new p073h2.C6648z.k(null), 3, null);
        }
        W8.AbstractC1788i.d(n6, null, null, new p073h2.C6648z.l(null), 3, null);
        W8.AbstractC1788i.d(n6, null, null, new p073h2.C6648z.m(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object q(Z8.InterfaceC1869f interfaceC1869f, p073h2.EnumC6642t enumC6642t, p127m7.e eVar) {
        java.lang.Object objB = Z8.AbstractC1871h.l(p073h2.AbstractC6634k.b(p073h2.AbstractC6634k.d(interfaceC1869f, new p073h2.C6648z.b(null, this, enumC6642t)), new p073h2.C6648z.c(enumC6642t, null))).b(new p073h2.C6648z.d(enumC6642t), eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x0285  */
    /* JADX WARN: Code duplicated, block: B:109:0x028d  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:52:0x015d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0186 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:54:0x0162, B:56:0x0186, B:59:0x0197, B:61:0x01a0), top: B:135:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0 A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #0 {all -> 0x0194, blocks: (B:54:0x0162, B:56:0x0186, B:59:0x0197, B:61:0x01a0), top: B:135:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x020b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0211  */
    /* JADX WARN: Code duplicated, block: B:85:0x0220  */
    /* JADX WARN: Code duplicated, block: B:87:0x0229  */
    /* JADX WARN: Code duplicated, block: B:91:0x0246 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0247  */
    /* JADX WARN: Code duplicated, block: B:96:0x0262  */
    /* JADX WARN: Code duplicated, block: B:99:0x026f  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0111, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r2v41, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v9, types: [f9.a] */
    public final java.lang.Object s(p127m7.e eVar) throws java.lang.Throwable {
        p073h2.C6648z.g gVar;
        h2.B.a aVar;
        p073h2.C6648z c6648z;
        p059f9.a aVar2;
        p073h2.B b6;
        p073h2.EnumC6642t enumC6642t;
        p073h2.C6648z c6648z2;
        p073h2.K k6;
        h2.L.b bVar;
        p073h2.K k10;
        p073h2.K k11;
        h2.B.a aVar3;
        p059f9.a aVar4;
        h2.L.b bVar2;
        h2.B.a aVar5;
        p059f9.a aVar6;
        p073h2.C6648z c6648z3;
        h2.B.a aVar7;
        p059f9.a aVar8;
        h2.L.b bVar3;
        p073h2.B b10;
        p073h2.EnumC6642t enumC6642t2;
        boolean zR;
        h2.r.c.a aVar9;
        p073h2.K k12;
        h2.L.b bVar4;
        p073h2.C6648z c6648z4;
        h2.B.a aVar10;
        p059f9.a aVar11;
        p059f9.a aVar12;
        h2.L.b bVar5;
        p073h2.C6648z c6648z5;
        Y8.j jVar;
        p073h2.AbstractC6646x abstractC6646xU;
        h2.L.b.c cVar;
        h2.B.a aVar13;
        p059f9.a aVar14;
        p059f9.a aVar15;
        p073h2.C6648z c6648z6;
        p073h2.M mG;
        h2.L.b.c cVar2;
        p059f9.a aVar16;
        p073h2.B b11;
        h2.r.a aVar17;
        p073h2.EnumC6642t enumC6642t3;
        if (eVar instanceof p073h2.C6648z.g) {
            gVar = (p073h2.C6648z.g) eVar;
            int i6 = gVar.f46414L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.f46414L = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new p073h2.C6648z.g(eVar);
            }
        } else {
            gVar = new p073h2.C6648z.g(eVar);
        }
        java.lang.Object objF = gVar.f46412J;
        java.lang.Object objG = p137n7.b.g();
        ?? r6 = gVar.f46414L;
        try {
            try {
                switch (r6) {
                    case 0:
                        p087i7.x.b(objF);
                        aVar = this.f46378k;
                        p059f9.a aVar18 = aVar.f45891b;
                        gVar.f46408F = this;
                        gVar.f46409G = aVar;
                        gVar.f46410H = aVar18;
                        gVar.f46414L = 1;
                        if (aVar18.c(null, gVar) == objG) {
                            return objG;
                        }
                        c6648z = this;
                        aVar2 = aVar18;
                        b6 = aVar.f45892c;
                        enumC6642t = p073h2.EnumC6642t.REFRESH;
                        gVar.f46408F = c6648z;
                        gVar.f46409G = aVar2;
                        gVar.f46410H = null;
                        gVar.f46414L = 2;
                        if (c6648z.D(b6, enumC6642t, gVar) == objG) {
                            return objG;
                        }
                        c6648z2 = c6648z;
                        r6 = aVar2;
                        p087i7.M m6 = p087i7.M.f46721a;
                        r6.d(null);
                        h2.L.a aVarX = c6648z2.x(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a);
                        k6 = p073h2.K.f45981a;
                        if (k6.a(3)) {
                            k6.b(3, "Start REFRESH with loadKey " + c6648z2.f46368a + " on " + c6648z2.f46369b, null);
                        }
                        p073h2.L l6 = c6648z2.f46369b;
                        gVar.f46408F = c6648z2;
                        gVar.f46409G = null;
                        gVar.f46414L = 3;
                        objF = l6.f(aVarX, gVar);
                        if (objF == objG) {
                            return objG;
                        }
                        bVar = (h2.L.b) objF;
                        if (bVar instanceof h2.L.b.c) {
                            aVar5 = c6648z2.f46378k;
                            aVar6 = aVar5.f45891b;
                            gVar.f46408F = c6648z2;
                            gVar.f46409G = bVar;
                            gVar.f46410H = aVar5;
                            gVar.f46411I = aVar6;
                            gVar.f46414L = 4;
                            if (aVar6.c(null, gVar) == objG) {
                                return objG;
                            }
                            c6648z3 = c6648z2;
                            aVar7 = aVar5;
                            aVar8 = aVar6;
                            bVar3 = bVar;
                            try {
                                b10 = aVar7.f45892c;
                                enumC6642t2 = p073h2.EnumC6642t.REFRESH;
                                zR = b10.r(0, enumC6642t2, (h2.L.b.c) bVar3);
                                p073h2.C6645w c6645wP = b10.p();
                                aVar9 = h2.r.c.f46235b;
                                c6645wP.c(enumC6642t2, aVar9.b());
                                if (((h2.L.b.c) bVar3).o() == null) {
                                    b10.p().c(p073h2.EnumC6642t.PREPEND, aVar9.a());
                                }
                                if (((h2.L.b.c) bVar3).g() == null) {
                                    b10.p().c(p073h2.EnumC6642t.APPEND, aVar9.a());
                                }
                                aVar8.d(null);
                                k12 = p073h2.K.f45981a;
                                if (zR) {
                                    if (k12.a(3)) {
                                        k12.b(3, c6648z3.y(enumC6642t2, c6648z3.f46368a, bVar3), null);
                                    }
                                    aVar10 = c6648z3.f46378k;
                                    aVar11 = aVar10.f45891b;
                                    gVar.f46408F = c6648z3;
                                    gVar.f46409G = bVar3;
                                    gVar.f46410H = aVar10;
                                    gVar.f46411I = aVar11;
                                    gVar.f46414L = 5;
                                    if (aVar11.c(null, gVar) == objG) {
                                        return objG;
                                    }
                                    aVar12 = aVar11;
                                    bVar5 = bVar3;
                                    c6648z5 = c6648z3;
                                    p073h2.B b12 = aVar10.f45892c;
                                    jVar = c6648z5.f46377j;
                                    abstractC6646xU = b12.u((h2.L.b.c) bVar5, p073h2.EnumC6642t.REFRESH);
                                    gVar.f46408F = c6648z5;
                                    gVar.f46409G = bVar5;
                                    gVar.f46410H = aVar12;
                                    gVar.f46411I = null;
                                    gVar.f46414L = 6;
                                    if (jVar.h(abstractC6646xU, gVar) == objG) {
                                        return objG;
                                    }
                                    bVar4 = bVar5;
                                    c6648z4 = c6648z5;
                                    r6 = aVar12;
                                    p087i7.M m10 = p087i7.M.f46721a;
                                    r6.d(null);
                                } else {
                                    if (k12.a(2)) {
                                        k12.b(2, c6648z3.y(enumC6642t2, c6648z3.f46368a, null), null);
                                    }
                                    bVar4 = bVar3;
                                    c6648z4 = c6648z3;
                                }
                                if (c6648z4.f46372e != null) {
                                    cVar = (h2.L.b.c) bVar4;
                                    if (cVar.o() != null || cVar.g() == null) {
                                        aVar13 = c6648z4.f46378k;
                                        aVar14 = aVar13.f45891b;
                                        gVar.f46408F = c6648z4;
                                        gVar.f46409G = bVar4;
                                        gVar.f46410H = aVar13;
                                        gVar.f46411I = aVar14;
                                        gVar.f46414L = 7;
                                        if (aVar14.c(null, gVar) == objG) {
                                            return objG;
                                        }
                                        aVar15 = aVar14;
                                        c6648z6 = c6648z4;
                                        try {
                                            mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                                            aVar15.d(null);
                                            cVar2 = (h2.L.b.c) bVar4;
                                            if (cVar2.o() == null) {
                                                c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                                            }
                                            if (cVar2.g() == null) {
                                                c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                                            }
                                        } catch (java.lang.Throwable th) {
                                            aVar15.d(null);
                                            throw th;
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                aVar8.d(null);
                                throw th2;
                            }
                            break;
                        } else {
                            if (bVar instanceof h2.L.b.a) {
                                k11 = p073h2.K.f45981a;
                                if (k11.a(2)) {
                                    k11.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                aVar3 = c6648z2.f46378k;
                                aVar4 = aVar3.f45891b;
                                gVar.f46408F = c6648z2;
                                gVar.f46409G = bVar;
                                gVar.f46410H = aVar3;
                                gVar.f46411I = aVar4;
                                gVar.f46414L = 8;
                                if (aVar4.c(null, gVar) == objG) {
                                    return objG;
                                }
                                bVar2 = bVar;
                                try {
                                    b11 = aVar3.f45892c;
                                    aVar17 = new h2.r.a(((h2.L.b.a) bVar2).d());
                                    enumC6642t3 = p073h2.EnumC6642t.REFRESH;
                                    gVar.f46408F = aVar4;
                                    gVar.f46409G = null;
                                    gVar.f46410H = null;
                                    gVar.f46411I = null;
                                    gVar.f46414L = 9;
                                    if (c6648z2.C(b11, enumC6642t3, aVar17, gVar) == objG) {
                                        return objG;
                                    }
                                    aVar16 = aVar4;
                                    p087i7.M m11 = p087i7.M.f46721a;
                                    aVar16.d(null);
                                    return p087i7.M.f46721a;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    aVar16 = aVar4;
                                    aVar16.d(null);
                                    throw th;
                                }
                            }
                            if (bVar instanceof h2.L.b.C0533b) {
                                k10 = p073h2.K.f45981a;
                                if (k10.a(2)) {
                                    k10.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                c6648z2.A();
                            }
                        }
                        return p087i7.M.f46721a;
                    case 1:
                        p059f9.a aVar19 = (p059f9.a) gVar.f46410H;
                        aVar = (h2.B.a) gVar.f46409G;
                        c6648z = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        aVar2 = aVar19;
                        b6 = aVar.f45892c;
                        enumC6642t = p073h2.EnumC6642t.REFRESH;
                        gVar.f46408F = c6648z;
                        gVar.f46409G = aVar2;
                        gVar.f46410H = null;
                        gVar.f46414L = 2;
                        if (c6648z.D(b6, enumC6642t, gVar) == objG) {
                            return objG;
                        }
                        c6648z2 = c6648z;
                        r6 = aVar2;
                        p087i7.M m12 = p087i7.M.f46721a;
                        r6.d(null);
                        h2.L.a aVarX2 = c6648z2.x(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a);
                        k6 = p073h2.K.f45981a;
                        if (k6.a(3)) {
                            k6.b(3, "Start REFRESH with loadKey " + c6648z2.f46368a + " on " + c6648z2.f46369b, null);
                        }
                        p073h2.L l10 = c6648z2.f46369b;
                        gVar.f46408F = c6648z2;
                        gVar.f46409G = null;
                        gVar.f46414L = 3;
                        objF = l10.f(aVarX2, gVar);
                        if (objF == objG) {
                            return objG;
                        }
                        bVar = (h2.L.b) objF;
                        if (bVar instanceof h2.L.b.c) {
                            aVar5 = c6648z2.f46378k;
                            aVar6 = aVar5.f45891b;
                            gVar.f46408F = c6648z2;
                            gVar.f46409G = bVar;
                            gVar.f46410H = aVar5;
                            gVar.f46411I = aVar6;
                            gVar.f46414L = 4;
                            if (aVar6.c(null, gVar) == objG) {
                                return objG;
                            }
                            c6648z3 = c6648z2;
                            aVar7 = aVar5;
                            aVar8 = aVar6;
                            bVar3 = bVar;
                            b10 = aVar7.f45892c;
                            enumC6642t2 = p073h2.EnumC6642t.REFRESH;
                            zR = b10.r(0, enumC6642t2, (h2.L.b.c) bVar3);
                            p073h2.C6645w c6645wP2 = b10.p();
                            aVar9 = h2.r.c.f46235b;
                            c6645wP2.c(enumC6642t2, aVar9.b());
                            if (((h2.L.b.c) bVar3).o() == null) {
                                b10.p().c(p073h2.EnumC6642t.PREPEND, aVar9.a());
                            }
                            if (((h2.L.b.c) bVar3).g() == null) {
                                b10.p().c(p073h2.EnumC6642t.APPEND, aVar9.a());
                            }
                            aVar8.d(null);
                            k12 = p073h2.K.f45981a;
                            if (zR) {
                                if (k12.a(3)) {
                                    k12.b(3, c6648z3.y(enumC6642t2, c6648z3.f46368a, bVar3), null);
                                }
                                aVar10 = c6648z3.f46378k;
                                aVar11 = aVar10.f45891b;
                                gVar.f46408F = c6648z3;
                                gVar.f46409G = bVar3;
                                gVar.f46410H = aVar10;
                                gVar.f46411I = aVar11;
                                gVar.f46414L = 5;
                                if (aVar11.c(null, gVar) == objG) {
                                    return objG;
                                }
                                aVar12 = aVar11;
                                bVar5 = bVar3;
                                c6648z5 = c6648z3;
                                p073h2.B b13 = aVar10.f45892c;
                                jVar = c6648z5.f46377j;
                                abstractC6646xU = b13.u((h2.L.b.c) bVar5, p073h2.EnumC6642t.REFRESH);
                                gVar.f46408F = c6648z5;
                                gVar.f46409G = bVar5;
                                gVar.f46410H = aVar12;
                                gVar.f46411I = null;
                                gVar.f46414L = 6;
                                if (jVar.h(abstractC6646xU, gVar) == objG) {
                                    return objG;
                                }
                                bVar4 = bVar5;
                                c6648z4 = c6648z5;
                                r6 = aVar12;
                                p087i7.M m13 = p087i7.M.f46721a;
                                r6.d(null);
                            } else {
                                if (k12.a(2)) {
                                    k12.b(2, c6648z3.y(enumC6642t2, c6648z3.f46368a, null), null);
                                }
                                bVar4 = bVar3;
                                c6648z4 = c6648z3;
                            }
                            if (c6648z4.f46372e != null) {
                                cVar = (h2.L.b.c) bVar4;
                                if (cVar.o() != null) {
                                }
                                aVar13 = c6648z4.f46378k;
                                aVar14 = aVar13.f45891b;
                                gVar.f46408F = c6648z4;
                                gVar.f46409G = bVar4;
                                gVar.f46410H = aVar13;
                                gVar.f46411I = aVar14;
                                gVar.f46414L = 7;
                                if (aVar14.c(null, gVar) == objG) {
                                    return objG;
                                }
                                aVar15 = aVar14;
                                c6648z6 = c6648z4;
                                mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                                aVar15.d(null);
                                cVar2 = (h2.L.b.c) bVar4;
                                if (cVar2.o() == null) {
                                    c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                                }
                                if (cVar2.g() == null) {
                                    c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                                }
                            }
                            break;
                        } else {
                            if (bVar instanceof h2.L.b.a) {
                                k11 = p073h2.K.f45981a;
                                if (k11.a(2)) {
                                    k11.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                aVar3 = c6648z2.f46378k;
                                aVar4 = aVar3.f45891b;
                                gVar.f46408F = c6648z2;
                                gVar.f46409G = bVar;
                                gVar.f46410H = aVar3;
                                gVar.f46411I = aVar4;
                                gVar.f46414L = 8;
                                if (aVar4.c(null, gVar) == objG) {
                                    return objG;
                                }
                                bVar2 = bVar;
                                b11 = aVar3.f45892c;
                                aVar17 = new h2.r.a(((h2.L.b.a) bVar2).d());
                                enumC6642t3 = p073h2.EnumC6642t.REFRESH;
                                gVar.f46408F = aVar4;
                                gVar.f46409G = null;
                                gVar.f46410H = null;
                                gVar.f46411I = null;
                                gVar.f46414L = 9;
                                if (c6648z2.C(b11, enumC6642t3, aVar17, gVar) == objG) {
                                    return objG;
                                }
                                aVar16 = aVar4;
                                p087i7.M m14 = p087i7.M.f46721a;
                                aVar16.d(null);
                                return p087i7.M.f46721a;
                            }
                            if (bVar instanceof h2.L.b.C0533b) {
                                k10 = p073h2.K.f45981a;
                                if (k10.a(2)) {
                                    k10.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                c6648z2.A();
                            }
                        }
                        return p087i7.M.f46721a;
                    case 2:
                        p059f9.a aVar20 = (p059f9.a) gVar.f46409G;
                        c6648z2 = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        r6 = aVar20;
                        p087i7.M m15 = p087i7.M.f46721a;
                        r6.d(null);
                        h2.L.a aVarX3 = c6648z2.x(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a);
                        k6 = p073h2.K.f45981a;
                        if (k6.a(3)) {
                            k6.b(3, "Start REFRESH with loadKey " + c6648z2.f46368a + " on " + c6648z2.f46369b, null);
                        }
                        p073h2.L l11 = c6648z2.f46369b;
                        gVar.f46408F = c6648z2;
                        gVar.f46409G = null;
                        gVar.f46414L = 3;
                        objF = l11.f(aVarX3, gVar);
                        if (objF == objG) {
                            return objG;
                        }
                        bVar = (h2.L.b) objF;
                        if (bVar instanceof h2.L.b.c) {
                            aVar5 = c6648z2.f46378k;
                            aVar6 = aVar5.f45891b;
                            gVar.f46408F = c6648z2;
                            gVar.f46409G = bVar;
                            gVar.f46410H = aVar5;
                            gVar.f46411I = aVar6;
                            gVar.f46414L = 4;
                            if (aVar6.c(null, gVar) == objG) {
                                return objG;
                            }
                            c6648z3 = c6648z2;
                            aVar7 = aVar5;
                            aVar8 = aVar6;
                            bVar3 = bVar;
                            b10 = aVar7.f45892c;
                            enumC6642t2 = p073h2.EnumC6642t.REFRESH;
                            zR = b10.r(0, enumC6642t2, (h2.L.b.c) bVar3);
                            p073h2.C6645w c6645wP3 = b10.p();
                            aVar9 = h2.r.c.f46235b;
                            c6645wP3.c(enumC6642t2, aVar9.b());
                            if (((h2.L.b.c) bVar3).o() == null) {
                                b10.p().c(p073h2.EnumC6642t.PREPEND, aVar9.a());
                            }
                            if (((h2.L.b.c) bVar3).g() == null) {
                                b10.p().c(p073h2.EnumC6642t.APPEND, aVar9.a());
                            }
                            aVar8.d(null);
                            k12 = p073h2.K.f45981a;
                            if (zR) {
                                if (k12.a(3)) {
                                    k12.b(3, c6648z3.y(enumC6642t2, c6648z3.f46368a, bVar3), null);
                                }
                                aVar10 = c6648z3.f46378k;
                                aVar11 = aVar10.f45891b;
                                gVar.f46408F = c6648z3;
                                gVar.f46409G = bVar3;
                                gVar.f46410H = aVar10;
                                gVar.f46411I = aVar11;
                                gVar.f46414L = 5;
                                if (aVar11.c(null, gVar) == objG) {
                                    return objG;
                                }
                                aVar12 = aVar11;
                                bVar5 = bVar3;
                                c6648z5 = c6648z3;
                                p073h2.B b14 = aVar10.f45892c;
                                jVar = c6648z5.f46377j;
                                abstractC6646xU = b14.u((h2.L.b.c) bVar5, p073h2.EnumC6642t.REFRESH);
                                gVar.f46408F = c6648z5;
                                gVar.f46409G = bVar5;
                                gVar.f46410H = aVar12;
                                gVar.f46411I = null;
                                gVar.f46414L = 6;
                                if (jVar.h(abstractC6646xU, gVar) == objG) {
                                    return objG;
                                }
                                bVar4 = bVar5;
                                c6648z4 = c6648z5;
                                r6 = aVar12;
                                p087i7.M m16 = p087i7.M.f46721a;
                                r6.d(null);
                            } else {
                                if (k12.a(2)) {
                                    k12.b(2, c6648z3.y(enumC6642t2, c6648z3.f46368a, null), null);
                                }
                                bVar4 = bVar3;
                                c6648z4 = c6648z3;
                            }
                            if (c6648z4.f46372e != null) {
                                cVar = (h2.L.b.c) bVar4;
                                if (cVar.o() != null) {
                                }
                                aVar13 = c6648z4.f46378k;
                                aVar14 = aVar13.f45891b;
                                gVar.f46408F = c6648z4;
                                gVar.f46409G = bVar4;
                                gVar.f46410H = aVar13;
                                gVar.f46411I = aVar14;
                                gVar.f46414L = 7;
                                if (aVar14.c(null, gVar) == objG) {
                                    return objG;
                                }
                                aVar15 = aVar14;
                                c6648z6 = c6648z4;
                                mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                                aVar15.d(null);
                                cVar2 = (h2.L.b.c) bVar4;
                                if (cVar2.o() == null) {
                                    c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                                }
                                if (cVar2.g() == null) {
                                    c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                                }
                            }
                            break;
                        } else {
                            if (bVar instanceof h2.L.b.a) {
                                k11 = p073h2.K.f45981a;
                                if (k11.a(2)) {
                                    k11.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                aVar3 = c6648z2.f46378k;
                                aVar4 = aVar3.f45891b;
                                gVar.f46408F = c6648z2;
                                gVar.f46409G = bVar;
                                gVar.f46410H = aVar3;
                                gVar.f46411I = aVar4;
                                gVar.f46414L = 8;
                                if (aVar4.c(null, gVar) == objG) {
                                    return objG;
                                }
                                bVar2 = bVar;
                                b11 = aVar3.f45892c;
                                aVar17 = new h2.r.a(((h2.L.b.a) bVar2).d());
                                enumC6642t3 = p073h2.EnumC6642t.REFRESH;
                                gVar.f46408F = aVar4;
                                gVar.f46409G = null;
                                gVar.f46410H = null;
                                gVar.f46411I = null;
                                gVar.f46414L = 9;
                                if (c6648z2.C(b11, enumC6642t3, aVar17, gVar) == objG) {
                                    return objG;
                                }
                                aVar16 = aVar4;
                                p087i7.M m17 = p087i7.M.f46721a;
                                aVar16.d(null);
                                return p087i7.M.f46721a;
                            }
                            if (bVar instanceof h2.L.b.C0533b) {
                                k10 = p073h2.K.f45981a;
                                if (k10.a(2)) {
                                    k10.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                c6648z2.A();
                            }
                        }
                        return p087i7.M.f46721a;
                    case 3:
                        p073h2.C6648z c6648z7 = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        c6648z2 = c6648z7;
                        bVar = (h2.L.b) objF;
                        if (bVar instanceof h2.L.b.c) {
                            aVar5 = c6648z2.f46378k;
                            aVar6 = aVar5.f45891b;
                            gVar.f46408F = c6648z2;
                            gVar.f46409G = bVar;
                            gVar.f46410H = aVar5;
                            gVar.f46411I = aVar6;
                            gVar.f46414L = 4;
                            if (aVar6.c(null, gVar) == objG) {
                                return objG;
                            }
                            c6648z3 = c6648z2;
                            aVar7 = aVar5;
                            aVar8 = aVar6;
                            bVar3 = bVar;
                            b10 = aVar7.f45892c;
                            enumC6642t2 = p073h2.EnumC6642t.REFRESH;
                            zR = b10.r(0, enumC6642t2, (h2.L.b.c) bVar3);
                            p073h2.C6645w c6645wP4 = b10.p();
                            aVar9 = h2.r.c.f46235b;
                            c6645wP4.c(enumC6642t2, aVar9.b());
                            if (((h2.L.b.c) bVar3).o() == null) {
                                b10.p().c(p073h2.EnumC6642t.PREPEND, aVar9.a());
                            }
                            if (((h2.L.b.c) bVar3).g() == null) {
                                b10.p().c(p073h2.EnumC6642t.APPEND, aVar9.a());
                            }
                            aVar8.d(null);
                            k12 = p073h2.K.f45981a;
                            if (zR) {
                                if (k12.a(3)) {
                                    k12.b(3, c6648z3.y(enumC6642t2, c6648z3.f46368a, bVar3), null);
                                }
                                aVar10 = c6648z3.f46378k;
                                aVar11 = aVar10.f45891b;
                                gVar.f46408F = c6648z3;
                                gVar.f46409G = bVar3;
                                gVar.f46410H = aVar10;
                                gVar.f46411I = aVar11;
                                gVar.f46414L = 5;
                                if (aVar11.c(null, gVar) == objG) {
                                    return objG;
                                }
                                aVar12 = aVar11;
                                bVar5 = bVar3;
                                c6648z5 = c6648z3;
                                p073h2.B b15 = aVar10.f45892c;
                                jVar = c6648z5.f46377j;
                                abstractC6646xU = b15.u((h2.L.b.c) bVar5, p073h2.EnumC6642t.REFRESH);
                                gVar.f46408F = c6648z5;
                                gVar.f46409G = bVar5;
                                gVar.f46410H = aVar12;
                                gVar.f46411I = null;
                                gVar.f46414L = 6;
                                if (jVar.h(abstractC6646xU, gVar) == objG) {
                                    return objG;
                                }
                                bVar4 = bVar5;
                                c6648z4 = c6648z5;
                                r6 = aVar12;
                                p087i7.M m18 = p087i7.M.f46721a;
                                r6.d(null);
                            } else {
                                if (k12.a(2)) {
                                    k12.b(2, c6648z3.y(enumC6642t2, c6648z3.f46368a, null), null);
                                }
                                bVar4 = bVar3;
                                c6648z4 = c6648z3;
                            }
                            if (c6648z4.f46372e != null) {
                                cVar = (h2.L.b.c) bVar4;
                                if (cVar.o() != null) {
                                }
                                aVar13 = c6648z4.f46378k;
                                aVar14 = aVar13.f45891b;
                                gVar.f46408F = c6648z4;
                                gVar.f46409G = bVar4;
                                gVar.f46410H = aVar13;
                                gVar.f46411I = aVar14;
                                gVar.f46414L = 7;
                                if (aVar14.c(null, gVar) == objG) {
                                    return objG;
                                }
                                aVar15 = aVar14;
                                c6648z6 = c6648z4;
                                mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                                aVar15.d(null);
                                cVar2 = (h2.L.b.c) bVar4;
                                if (cVar2.o() == null) {
                                    c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                                }
                                if (cVar2.g() == null) {
                                    c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                                }
                            }
                            break;
                        } else {
                            if (bVar instanceof h2.L.b.a) {
                                k11 = p073h2.K.f45981a;
                                if (k11.a(2)) {
                                    k11.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                aVar3 = c6648z2.f46378k;
                                aVar4 = aVar3.f45891b;
                                gVar.f46408F = c6648z2;
                                gVar.f46409G = bVar;
                                gVar.f46410H = aVar3;
                                gVar.f46411I = aVar4;
                                gVar.f46414L = 8;
                                if (aVar4.c(null, gVar) == objG) {
                                    return objG;
                                }
                                bVar2 = bVar;
                                b11 = aVar3.f45892c;
                                aVar17 = new h2.r.a(((h2.L.b.a) bVar2).d());
                                enumC6642t3 = p073h2.EnumC6642t.REFRESH;
                                gVar.f46408F = aVar4;
                                gVar.f46409G = null;
                                gVar.f46410H = null;
                                gVar.f46411I = null;
                                gVar.f46414L = 9;
                                if (c6648z2.C(b11, enumC6642t3, aVar17, gVar) == objG) {
                                    return objG;
                                }
                                aVar16 = aVar4;
                                p087i7.M m19 = p087i7.M.f46721a;
                                aVar16.d(null);
                                return p087i7.M.f46721a;
                            }
                            if (bVar instanceof h2.L.b.C0533b) {
                                k10 = p073h2.K.f45981a;
                                if (k10.a(2)) {
                                    k10.b(2, c6648z2.y(p073h2.EnumC6642t.REFRESH, c6648z2.f46368a, bVar), null);
                                }
                                c6648z2.A();
                            }
                        }
                        return p087i7.M.f46721a;
                    case 4:
                        aVar8 = (p059f9.a) gVar.f46411I;
                        aVar7 = (h2.B.a) gVar.f46410H;
                        bVar3 = (h2.L.b) gVar.f46409G;
                        c6648z3 = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        b10 = aVar7.f45892c;
                        enumC6642t2 = p073h2.EnumC6642t.REFRESH;
                        zR = b10.r(0, enumC6642t2, (h2.L.b.c) bVar3);
                        p073h2.C6645w c6645wP5 = b10.p();
                        aVar9 = h2.r.c.f46235b;
                        c6645wP5.c(enumC6642t2, aVar9.b());
                        if (((h2.L.b.c) bVar3).o() == null) {
                            b10.p().c(p073h2.EnumC6642t.PREPEND, aVar9.a());
                        }
                        if (((h2.L.b.c) bVar3).g() == null) {
                            b10.p().c(p073h2.EnumC6642t.APPEND, aVar9.a());
                            break;
                        }
                        aVar8.d(null);
                        k12 = p073h2.K.f45981a;
                        if (zR) {
                            if (k12.a(3)) {
                                k12.b(3, c6648z3.y(enumC6642t2, c6648z3.f46368a, bVar3), null);
                            }
                            aVar10 = c6648z3.f46378k;
                            aVar11 = aVar10.f45891b;
                            gVar.f46408F = c6648z3;
                            gVar.f46409G = bVar3;
                            gVar.f46410H = aVar10;
                            gVar.f46411I = aVar11;
                            gVar.f46414L = 5;
                            if (aVar11.c(null, gVar) == objG) {
                                return objG;
                            }
                            aVar12 = aVar11;
                            bVar5 = bVar3;
                            c6648z5 = c6648z3;
                            p073h2.B b16 = aVar10.f45892c;
                            jVar = c6648z5.f46377j;
                            abstractC6646xU = b16.u((h2.L.b.c) bVar5, p073h2.EnumC6642t.REFRESH);
                            gVar.f46408F = c6648z5;
                            gVar.f46409G = bVar5;
                            gVar.f46410H = aVar12;
                            gVar.f46411I = null;
                            gVar.f46414L = 6;
                            if (jVar.h(abstractC6646xU, gVar) == objG) {
                                return objG;
                            }
                            bVar4 = bVar5;
                            c6648z4 = c6648z5;
                            r6 = aVar12;
                            p087i7.M m110 = p087i7.M.f46721a;
                            r6.d(null);
                        } else {
                            if (k12.a(2)) {
                                k12.b(2, c6648z3.y(enumC6642t2, c6648z3.f46368a, null), null);
                            }
                            bVar4 = bVar3;
                            c6648z4 = c6648z3;
                        }
                        if (c6648z4.f46372e != null) {
                            cVar = (h2.L.b.c) bVar4;
                            if (cVar.o() != null) {
                            }
                            aVar13 = c6648z4.f46378k;
                            aVar14 = aVar13.f45891b;
                            gVar.f46408F = c6648z4;
                            gVar.f46409G = bVar4;
                            gVar.f46410H = aVar13;
                            gVar.f46411I = aVar14;
                            gVar.f46414L = 7;
                            if (aVar14.c(null, gVar) == objG) {
                                return objG;
                            }
                            aVar15 = aVar14;
                            c6648z6 = c6648z4;
                            mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                            aVar15.d(null);
                            cVar2 = (h2.L.b.c) bVar4;
                            if (cVar2.o() == null) {
                                c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                            }
                            if (cVar2.g() == null) {
                                c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                            }
                            break;
                        }
                        return p087i7.M.f46721a;
                    case 5:
                        p059f9.a aVar21 = (p059f9.a) gVar.f46411I;
                        aVar10 = (h2.B.a) gVar.f46410H;
                        bVar5 = (h2.L.b) gVar.f46409G;
                        c6648z5 = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        aVar12 = aVar21;
                        p073h2.B b17 = aVar10.f45892c;
                        jVar = c6648z5.f46377j;
                        abstractC6646xU = b17.u((h2.L.b.c) bVar5, p073h2.EnumC6642t.REFRESH);
                        gVar.f46408F = c6648z5;
                        gVar.f46409G = bVar5;
                        gVar.f46410H = aVar12;
                        gVar.f46411I = null;
                        gVar.f46414L = 6;
                        if (jVar.h(abstractC6646xU, gVar) == objG) {
                            return objG;
                        }
                        bVar4 = bVar5;
                        c6648z4 = c6648z5;
                        r6 = aVar12;
                        p087i7.M m111 = p087i7.M.f46721a;
                        r6.d(null);
                        if (c6648z4.f46372e != null) {
                            cVar = (h2.L.b.c) bVar4;
                            if (cVar.o() != null) {
                            }
                            aVar13 = c6648z4.f46378k;
                            aVar14 = aVar13.f45891b;
                            gVar.f46408F = c6648z4;
                            gVar.f46409G = bVar4;
                            gVar.f46410H = aVar13;
                            gVar.f46411I = aVar14;
                            gVar.f46414L = 7;
                            if (aVar14.c(null, gVar) == objG) {
                                return objG;
                            }
                            aVar15 = aVar14;
                            c6648z6 = c6648z4;
                            mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                            aVar15.d(null);
                            cVar2 = (h2.L.b.c) bVar4;
                            if (cVar2.o() == null) {
                                c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                            }
                            if (cVar2.g() == null) {
                                c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                            }
                            break;
                        }
                        return p087i7.M.f46721a;
                    case 6:
                        p059f9.a aVar22 = (p059f9.a) gVar.f46410H;
                        bVar4 = (h2.L.b) gVar.f46409G;
                        c6648z4 = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        r6 = aVar22;
                        p087i7.M m112 = p087i7.M.f46721a;
                        r6.d(null);
                        if (c6648z4.f46372e != null) {
                            cVar = (h2.L.b.c) bVar4;
                            if (cVar.o() != null) {
                            }
                            aVar13 = c6648z4.f46378k;
                            aVar14 = aVar13.f45891b;
                            gVar.f46408F = c6648z4;
                            gVar.f46409G = bVar4;
                            gVar.f46410H = aVar13;
                            gVar.f46411I = aVar14;
                            gVar.f46414L = 7;
                            if (aVar14.c(null, gVar) == objG) {
                                return objG;
                            }
                            aVar15 = aVar14;
                            c6648z6 = c6648z4;
                            mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                            aVar15.d(null);
                            cVar2 = (h2.L.b.c) bVar4;
                            if (cVar2.o() == null) {
                                c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                            }
                            if (cVar2.g() == null) {
                                c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                            }
                            break;
                        }
                        return p087i7.M.f46721a;
                    case 7:
                        aVar15 = (p059f9.a) gVar.f46411I;
                        aVar13 = (h2.B.a) gVar.f46410H;
                        bVar4 = (h2.L.b) gVar.f46409G;
                        c6648z6 = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        mG = aVar13.f45892c.g(c6648z6.f46375h.b());
                        aVar15.d(null);
                        cVar2 = (h2.L.b.c) bVar4;
                        if (cVar2.o() == null) {
                            c6648z6.f46372e.b(p073h2.EnumC6642t.PREPEND, mG);
                        }
                        if (cVar2.g() == null) {
                            c6648z6.f46372e.b(p073h2.EnumC6642t.APPEND, mG);
                        }
                        return p087i7.M.f46721a;
                    case 8:
                        aVar4 = (p059f9.a) gVar.f46411I;
                        aVar3 = (h2.B.a) gVar.f46410H;
                        bVar2 = (h2.L.b) gVar.f46409G;
                        c6648z2 = (p073h2.C6648z) gVar.f46408F;
                        p087i7.x.b(objF);
                        b11 = aVar3.f45892c;
                        aVar17 = new h2.r.a(((h2.L.b.a) bVar2).d());
                        enumC6642t3 = p073h2.EnumC6642t.REFRESH;
                        gVar.f46408F = aVar4;
                        gVar.f46409G = null;
                        gVar.f46410H = null;
                        gVar.f46411I = null;
                        gVar.f46414L = 9;
                        if (c6648z2.C(b11, enumC6642t3, aVar17, gVar) == objG) {
                            return objG;
                        }
                        aVar16 = aVar4;
                        p087i7.M m113 = p087i7.M.f46721a;
                        aVar16.d(null);
                        return p087i7.M.f46721a;
                    case 9:
                        aVar16 = (p059f9.a) gVar.f46408F;
                        try {
                            p087i7.x.b(objF);
                            p087i7.M m114 = p087i7.M.f46721a;
                            aVar16.d(null);
                            return p087i7.M.f46721a;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            aVar16.d(null);
                            throw th;
                        }
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (java.lang.Throwable th5) {
                r6.d(null);
                throw th5;
            }
        } catch (java.lang.Throwable th6) {
            r6.d(null);
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:102:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:104:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0451 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x0452  */
    /* JADX WARN: Code duplicated, block: B:123:0x0469  */
    /* JADX WARN: Code duplicated, block: B:125:0x0472  */
    /* JADX WARN: Code duplicated, block: B:126:0x047d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0486  */
    /* JADX WARN: Code duplicated, block: B:131:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:147:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:151:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:154:0x04fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:158:0x0525 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:159:0x0526  */
    /* JADX WARN: Code duplicated, block: B:167:0x0545  */
    /* JADX WARN: Code duplicated, block: B:169:0x054a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0553  */
    /* JADX WARN: Code duplicated, block: B:176:0x056c  */
    /* JADX WARN: Code duplicated, block: B:177:0x056f  */
    /* JADX WARN: Code duplicated, block: B:180:0x059a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:181:0x059b  */
    /* JADX WARN: Code duplicated, block: B:184:0x05b7 A[Catch: all -> 0x05f2, TRY_LEAVE, TryCatch #3 {all -> 0x05f2, blocks: (B:182:0x05a9, B:184:0x05b7), top: B:255:0x05a9 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x05dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:187:0x05de  */
    /* JADX WARN: Code duplicated, block: B:194:0x0610 A[Catch: all -> 0x0096, TryCatch #4 {all -> 0x0096, blocks: (B:188:0x05e8, B:192:0x05f9, B:194:0x0610, B:196:0x061c, B:198:0x0624, B:200:0x0631, B:199:0x062b, B:201:0x0634, B:205:0x0665, B:14:0x0087, B:19:0x00c2), top: B:257:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0624 A[Catch: all -> 0x0096, TryCatch #4 {all -> 0x0096, blocks: (B:188:0x05e8, B:192:0x05f9, B:194:0x0610, B:196:0x061c, B:198:0x0624, B:200:0x0631, B:199:0x062b, B:201:0x0634, B:205:0x0665, B:14:0x0087, B:19:0x00c2), top: B:257:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x062b A[Catch: all -> 0x0096, TryCatch #4 {all -> 0x0096, blocks: (B:188:0x05e8, B:192:0x05f9, B:194:0x0610, B:196:0x061c, B:198:0x0624, B:200:0x0631, B:199:0x062b, B:201:0x0634, B:205:0x0665, B:14:0x0087, B:19:0x00c2), top: B:257:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x065e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:204:0x065f  */
    /* JADX WARN: Code duplicated, block: B:208:0x066f  */
    /* JADX WARN: Code duplicated, block: B:211:0x067a  */
    /* JADX WARN: Code duplicated, block: B:214:0x067f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0689  */
    /* JADX WARN: Code duplicated, block: B:220:0x068e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:236:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x035b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0368  */
    /* JADX WARN: Code duplicated, block: B:90:0x0393  */
    /* JADX WARN: Code duplicated, block: B:93:0x03b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:97:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:99:0x03cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r6v37, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x06ba -> B:262:0x06bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object t(p073h2.EnumC6642t r20, p073h2.C6635l r21, p127m7.e r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073h2.C6648z.t(h2.t, h2.l, m7.e):java.lang.Object");
    }

    private final h2.L.a x(p073h2.EnumC6642t enumC6642t, java.lang.Object obj) {
        return h2.L.a.f45983c.a(enumC6642t, obj, enumC6642t == p073h2.EnumC6642t.REFRESH ? this.f46370c.f45912d : this.f46370c.f45909a, this.f46370c.f45911c);
    }

    private final java.lang.String y(p073h2.EnumC6642t enumC6642t, java.lang.Object obj, h2.L.b bVar) {
        if (bVar == null) {
            return "End " + enumC6642t + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + enumC6642t + " with loadKey " + obj + ". Returned " + bVar;
    }

    private final java.lang.Object z(p073h2.B b6, p073h2.EnumC6642t enumC6642t, int i6, int i10) {
        if (i6 != b6.j(enumC6642t) || (b6.p().a(enumC6642t) instanceof h2.r.a) || i10 >= this.f46370c.f45910b) {
            return null;
        }
        p073h2.EnumC6642t enumC6642t2 = p073h2.EnumC6642t.PREPEND;
        java.util.List listM = b6.m();
        return enumC6642t == enumC6642t2 ? ((h2.L.b.c) p097j7.AbstractC6879v.i0(listM)).o() : ((h2.L.b.c) p097j7.AbstractC6879v.t0(listM)).g();
    }

    public final void o(p073h2.Z z6) {
        p247y7.AbstractC7350t.f(z6, "viewportHint");
        this.f46375h.d(z6);
    }

    public final void p() {
        W8.InterfaceC1822z0.a.a(this.f46379l, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(p127m7.e eVar) {
        p073h2.C6648z.f fVar;
        h2.B.a aVar;
        p073h2.C6648z c6648z;
        p059f9.a aVar2;
        if (eVar instanceof p073h2.C6648z.f) {
            fVar = (p073h2.C6648z.f) eVar;
            int i6 = fVar.f46407K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f46407K = i6 - Integer.MIN_VALUE;
            } else {
                fVar = new p073h2.C6648z.f(eVar);
            }
        } else {
            fVar = new p073h2.C6648z.f(eVar);
        }
        java.lang.Object obj = fVar.f46405I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = fVar.f46407K;
        if (i10 == 0) {
            p087i7.x.b(obj);
            aVar = this.f46378k;
            p059f9.a aVar3 = aVar.f45891b;
            fVar.f46402F = this;
            fVar.f46403G = aVar;
            fVar.f46404H = aVar3;
            fVar.f46407K = 1;
            if (aVar3.c(null, fVar) == objG) {
                return objG;
            }
            c6648z = this;
            aVar2 = aVar3;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (p059f9.a) fVar.f46404H;
            aVar = (h2.B.a) fVar.f46403G;
            c6648z = (p073h2.C6648z) fVar.f46402F;
            p087i7.x.b(obj);
        }
        try {
            return aVar.f45892c.g(c6648z.f46375h.b());
        } finally {
            aVar2.d(null);
        }
    }

    public final Z8.InterfaceC1869f u() {
        return this.f46380m;
    }

    public final p073h2.L v() {
        return this.f46369b;
    }

    public final p073h2.Q w() {
        return this.f46372e;
    }
}
