package S;

/* JADX INFO: renamed from: S.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1589y extends F0.AbstractC0927m implements F0.v0, F0.InterfaceC0921h, F0.C {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private S.C1537c f11993R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f11994S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f11995T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f11996U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f11997V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private long f11998W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final p251z0.W f11999X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final p251z0.W f12000Y;

    /* JADX INFO: renamed from: S.y$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12001G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f12002H;

        /* JADX INFO: renamed from: S.y$a$a, reason: collision with other inner class name */
        static final class C0257a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S.C1589y f12004D;

            /* JADX INFO: renamed from: S.y$a$a$a, reason: collision with other inner class name */
            static final class C0258a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f12005G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ S.C1589y f12006H;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0258a(S.C1589y c1589y, p127m7.e eVar) {
                    super(2, eVar);
                    this.f12006H = c1589y;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f12005G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        if (this.f12006H.f11994S) {
                            this.f12006H.f11993R.f(S.s1.f11748b.b());
                        }
                        S.C1537c c1537c = this.f12006H.f11993R;
                        this.f12005G = 1;
                        if (c1537c.A(this) == objG) {
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
                    return ((S.C1589y.a.C0257a.C0258a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new S.C1589y.a.C0257a.C0258a(this.f12006H, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0257a(S.C1589y c1589y) {
                super(0);
                this.f12004D = c1589y;
            }

            public final void a() {
                W8.AbstractC1788i.d(this.f12004D.t1(), null, null, new S.C1589y.a.C0257a.C0258a(this.f12004D, null), 3, null);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: S.y$a$b */
        static final class b extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S.C1589y f12007D;

            /* JADX INFO: renamed from: S.y$a$b$a, reason: collision with other inner class name */
            static final class C0259a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f12008G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ S.C1589y f12009H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ long f12010I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0259a(S.C1589y c1589y, long j6, p127m7.e eVar) {
                    super(2, eVar);
                    this.f12009H = c1589y;
                    this.f12010I = j6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f12008G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        this.f12009H.f11996U += p131n0.g.m(this.f12010I);
                        this.f12009H.f11997V += p131n0.g.n(this.f12010I);
                        S.C1537c c1537c = this.f12009H.f11993R;
                        float fT = S.q1.T(this.f12009H.f11997V - Y0.p.i(this.f12009H.f11998W), this.f12009H.f11996U - Y0.p.h(this.f12009H.f11998W));
                        this.f12008G = 1;
                        if (S.C1537c.C(c1537c, fT, false, this, 2, null) == objG) {
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
                    return ((S.C1589y.a.b.C0259a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new S.C1589y.a.b.C0259a(this.f12009H, this.f12010I, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S.C1589y c1589y) {
                super(2);
                this.f12007D = c1589y;
            }

            public final void a(p251z0.B b6, long j6) {
                W8.AbstractC1788i.d(this.f12007D.t1(), null, null, new S.C1589y.a.b.C0259a(this.f12007D, j6, null), 3, null);
                S.q1.Y(this.f12007D.f11993R, this.f12007D.f11996U, this.f12007D.f11997V, this.f12007D.h2(), this.f12007D.f11998W);
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                a((p251z0.B) obj, ((p131n0.g) obj2).v());
                return p087i7.M.f46721a;
            }
        }

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12001G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f12002H;
                S.C1589y.a.C0257a c0257a = new S.C1589y.a.C0257a(S.C1589y.this);
                S.C1589y.a.b bVar = new S.C1589y.a.b(S.C1589y.this);
                this.f12001G = 1;
                if (p230x.l.f(k6, null, c0257a, null, bVar, this, 5, null) == objG) {
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
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((S.C1589y.a) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            S.C1589y.a aVar = S.C1589y.this.new a(eVar);
            aVar.f12002H = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: S.y$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12011G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f12012H;

        /* JADX INFO: renamed from: S.y$b$a */
        static final class a extends p147o7.l implements p237x7.q {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f12014G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ long f12015H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ S.C1589y f12016I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(S.C1589y c1589y, p127m7.e eVar) {
                super(3, eVar);
                this.f12016I = c1589y;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f12014G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                long j6 = this.f12015H;
                this.f12016I.f11996U = p131n0.g.m(j6);
                this.f12016I.f11997V = p131n0.g.n(j6);
                return p087i7.M.f46721a;
            }

            public final java.lang.Object H(p230x.t tVar, long j6, p127m7.e eVar) {
                S.C1589y.b.a aVar = new S.C1589y.b.a(this.f12016I, eVar);
                aVar.f12015H = j6;
                return aVar.B(p087i7.M.f46721a);
            }

            @Override // p237x7.q
            public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return H((p230x.t) obj, ((p131n0.g) obj2).v(), (p127m7.e) obj3);
            }
        }

        /* JADX INFO: renamed from: S.y$b$b, reason: collision with other inner class name */
        static final class C0260b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S.C1589y f12017D;

            /* JADX INFO: renamed from: S.y$b$b$a */
            static final class a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f12018G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ S.C1589y f12019H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ long f12020I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(S.C1589y c1589y, long j6, p127m7.e eVar) {
                    super(2, eVar);
                    this.f12019H = c1589y;
                    this.f12020I = j6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f12018G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        S.C1537c c1537c = this.f12019H.f11993R;
                        float fM = p131n0.g.m(this.f12020I);
                        float fN = p131n0.g.n(this.f12020I);
                        float fH2 = this.f12019H.h2();
                        boolean z6 = this.f12019H.f11994S;
                        long j6 = this.f12019H.f11998W;
                        this.f12018G = 1;
                        if (S.q1.a0(c1537c, fM, fN, fH2, z6, j6, this) == objG) {
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
                    return ((S.C1589y.b.C0260b.a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new S.C1589y.b.C0260b.a(this.f12019H, this.f12020I, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0260b(S.C1589y c1589y) {
                super(1);
                this.f12017D = c1589y;
            }

            public final void a(long j6) {
                W8.AbstractC1788i.d(this.f12017D.t1(), null, null, new S.C1589y.b.C0260b.a(this.f12017D, j6, null), 3, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(((p131n0.g) obj).v());
                return p087i7.M.f46721a;
            }
        }

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12011G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f12012H;
                S.C1589y.b.a aVar = new S.C1589y.b.a(S.C1589y.this, null);
                S.C1589y.b.C0260b c0260b = new S.C1589y.b.C0260b(S.C1589y.this);
                this.f12011G = 1;
                if (p230x.D.j(k6, null, null, aVar, c0260b, this, 3, null) == objG) {
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
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((S.C1589y.b) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            S.C1589y.b bVar = S.C1589y.this.new b(eVar);
            bVar.f12012H = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: S.y$c */
    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12021G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ S.C1537c f12022H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(S.C1537c c1537c, p127m7.e eVar) {
            super(2, eVar);
            this.f12022H = c1537c;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12021G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                S.C1537c c1537c = this.f12022H;
                this.f12021G = 1;
                if (c1537c.s(this) == objG) {
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
            return ((S.C1589y.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.C1589y.c(this.f12022H, eVar);
        }
    }

    private C1589y(S.C1537c c1537c, boolean z6, int i6) {
        this.f11993R = c1537c;
        this.f11994S = z6;
        this.f11995T = i6;
        this.f11998W = Y0.p.f16221b.a();
        this.f11999X = (p251z0.W) T1(p251z0.U.a(new S.C1589y.b(null)));
        this.f12000Y = (p251z0.W) T1(p251z0.U.a(new S.C1589y.a(null)));
    }

    public /* synthetic */ C1589y(S.C1537c c1537c, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1537c, z6, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h2() {
        return F0.AbstractC0925k.i(this).B0(S.q1.f11521h);
    }

    @Override // F0.C
    public void M(long j6) {
        this.f11998W = Y0.u.b(j6);
    }

    @Override // F0.v0
    public /* synthetic */ boolean Y0() {
        return F0.u0.d(this);
    }

    @Override // F0.v0
    public /* synthetic */ void f1() {
        F0.u0.c(this);
    }

    @Override // F0.v0
    public void g0() {
        this.f11999X.g0();
        this.f12000Y.g0();
    }

    public final void i2(S.C1537c c1537c, boolean z6, int i6) {
        this.f11993R = c1537c;
        this.f11994S = z6;
        if (S.s1.f(this.f11995T, i6)) {
            return;
        }
        this.f11995T = i6;
        W8.AbstractC1788i.d(t1(), null, null, new S.C1589y.c(c1537c, null), 3, null);
    }

    @Override // F0.C
    public /* synthetic */ void m1(D0.InterfaceC0900t interfaceC0900t) {
        F0.B.a(this, interfaceC0900t);
    }

    @Override // F0.v0
    public /* synthetic */ boolean n0() {
        return F0.u0.a(this);
    }

    @Override // F0.v0
    public /* synthetic */ void t0() {
        F0.u0.b(this);
    }

    @Override // F0.v0
    public void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        this.f11999X.w0(c7380p, rVar, j6);
        this.f12000Y.w0(c7380p, rVar, j6);
    }
}
