package p200u;

/* JADX INFO: renamed from: u.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7170g0 extends p200u.v0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p200u.C7170g0.a f54859r = new p200u.C7170g0.a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f54860s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p200u.C7183n f54861t = new p200u.C7183n(0.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p200u.C7183n f54862u = new p200u.C7183n(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object f54865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p200u.s0 f54866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p237x7.a f54868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V.InterfaceC1742q0 f54869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private W8.InterfaceC1794l f54870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p059f9.a f54871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p200u.C7164d0 f54872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p170r.I f54874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p200u.C7170g0.b f54875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p237x7.l f54876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f54877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p237x7.l f54878q;

    /* JADX INFO: renamed from: u.g0$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p200u.C7183n a() {
            return p200u.C7170g0.f54862u;
        }

        public final p200u.C7183n b() {
            return p200u.C7170g0.f54861t;
        }
    }

    /* JADX INFO: renamed from: u.g0$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f54879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p200u.B0 f54880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f54881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f54882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p200u.C7183n f54883e = new p200u.C7183n(0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p200u.C7183n f54884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f54885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f54886h;

        public final p200u.B0 a() {
            return this.f54880b;
        }

        public final long b() {
            return this.f54886h;
        }

        public final long c() {
            return this.f54885g;
        }

        public final p200u.C7183n d() {
            return this.f54884f;
        }

        public final long e() {
            return this.f54879a;
        }

        public final p200u.C7183n f() {
            return this.f54883e;
        }

        public final float g() {
            return this.f54882d;
        }

        public final boolean h() {
            return this.f54881c;
        }

        public final void i(p200u.B0 b6) {
            this.f54880b = b6;
        }

        public final void j(long j6) {
            this.f54886h = j6;
        }

        public final void k(boolean z6) {
            this.f54881c = z6;
        }

        public final void l(long j6) {
            this.f54885g = j6;
        }

        public final void m(p200u.C7183n c7183n) {
            this.f54884f = c7183n;
        }

        public final void n(long j6) {
            this.f54879a = j6;
        }

        public final void o(float f6) {
            this.f54882d = f6;
        }

        public java.lang.String toString() {
            return "progress nanos: " + this.f54879a + ", animationSpec: " + this.f54880b + ", isComplete: " + this.f54881c + ", value: " + this.f54882d + ", start: " + this.f54883e + ", initialVelocity: " + this.f54884f + ", durationNanos: " + this.f54885g + ", animationSpecDuration: " + this.f54886h;
        }
    }

    /* JADX INFO: renamed from: u.g0$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final void a(long j6) {
            long j10 = j6 - p200u.C7170g0.this.f54873l;
            p200u.C7170g0.this.f54873l = j6;
            long jE = A7.a.e(j10 / ((double) p200u.C7170g0.this.f54877p));
            if (p200u.C7170g0.this.f54874m.d()) {
                p170r.I i6 = p200u.C7170g0.this.f54874m;
                p200u.C7170g0 c7170g0 = p200u.C7170g0.this;
                java.lang.Object[] objArr = i6.f53322a;
                int i10 = i6.f53323b;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    p200u.C7170g0.b bVar = (p200u.C7170g0.b) objArr[i12];
                    c7170g0.M(bVar, jE);
                    bVar.k(true);
                }
                p200u.s0 s0Var = p200u.C7170g0.this.f54866e;
                if (s0Var != null) {
                    s0Var.Q();
                }
                p170r.I i13 = p200u.C7170g0.this.f54874m;
                int i14 = i13.f53323b;
                java.lang.Object[] objArr2 = i13.f53322a;
                E7.i iVarQ = E7.j.q(0, i14);
                int iF = iVarQ.f();
                int iG = iVarQ.g();
                if (iF <= iG) {
                    while (true) {
                        objArr2[iF - i11] = objArr2[iF];
                        if (((p200u.C7170g0.b) objArr2[iF]).h()) {
                            i11++;
                        }
                        if (iF == iG) {
                            break;
                        } else {
                            iF++;
                        }
                    }
                }
                p097j7.AbstractC6872n.w(objArr2, null, i14 - i11, i14);
                i13.f53323b -= i11;
            }
            p200u.C7170g0.b bVar2 = p200u.C7170g0.this.f54875n;
            if (bVar2 != null) {
                bVar2.l(p200u.C7170g0.this.I());
                p200u.C7170g0.this.M(bVar2, jE);
                p200u.C7170g0.this.S(bVar2.g());
                if (bVar2.g() == 1.0f) {
                    p200u.C7170g0.this.f54875n = null;
                }
                p200u.C7170g0.this.P();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).longValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: u.g0$d */
    static final class d extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f54888G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54889H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p200u.C7170g0 f54890I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54891J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p200u.I f54892K;

        /* JADX INFO: renamed from: u.g0$d$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f54893G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            java.lang.Object f54894H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            int f54895I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p200u.C7170g0 f54896J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f54897K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ p200u.s0 f54898L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ p200u.I f54899M;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p200u.C7170g0 c7170g0, java.lang.Object obj, p200u.s0 s0Var, p200u.I i6, p127m7.e eVar) {
                super(2, eVar);
                this.f54896J = c7170g0;
                this.f54897K = obj;
                this.f54898L = s0Var;
                this.f54899M = i6;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00b7 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
            /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
            /* JADX WARN: Code duplicated, block: B:43:0x00f4 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:49:0x0115  */
            /* JADX WARN: Code duplicated, block: B:51:0x0126  */
            /* JADX WARN: Code duplicated, block: B:52:0x0128  */
            /* JADX WARN: Code duplicated, block: B:60:0x014a  */
            /* JADX WARN: Code duplicated, block: B:63:0x015c  */
            /* JADX WARN: Code duplicated, block: B:66:0x018f  */
            /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
            /* JADX WARN: Code duplicated, block: B:71:0x01cc A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:74:0x01de A[RETURN] */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p059f9.a aVar;
                p200u.C7170g0 c7170g0;
                p200u.C7170g0 c7170g1;
                p200u.C7170g0 c7170g2;
                p200u.C7170g0.b bVar;
                p200u.I i6;
                p200u.H0 h0A;
                p200u.B0 b0A;
                p200u.C7183n c7183nB;
                long jE;
                p200u.C7183n c7183nD;
                p200u.C7170g0 c7170g3;
                java.lang.Object objG = p137n7.b.g();
                int i10 = this.f54895I;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c7170g0 = (p200u.C7170g0) this.f54894H;
                            aVar = (p059f9.a) this.f54893G;
                            p087i7.x.b(obj);
                        } else {
                            if (i10 == 2) {
                                p087i7.x.b(obj);
                                c7170g1 = this.f54896J;
                                this.f54895I = 3;
                                if (c7170g1.W(this) == objG) {
                                    return objG;
                                }
                                if (!p247y7.AbstractC7350t.b(this.f54896J.a(), this.f54897K)) {
                                    if (this.f54896J.H() < 1.0f) {
                                        bVar = this.f54896J.f54875n;
                                        i6 = this.f54899M;
                                        if (i6 != null) {
                                            h0A = i6.a(p200u.z0.i(p247y7.C7344m.f57303a));
                                        } else {
                                            h0A = null;
                                        }
                                        if (bVar != null) {
                                            if (bVar != null) {
                                                b0A = bVar.a();
                                            } else {
                                                b0A = null;
                                            }
                                            if (b0A != null) {
                                                long jE2 = bVar.e();
                                                p200u.C7183n c7183nF = bVar.f();
                                                p200u.C7183n c7183nA = p200u.C7170g0.f54859r.a();
                                                c7183nD = bVar.d();
                                                if (c7183nD == null) {
                                                    c7183nD = p200u.C7170g0.f54859r.b();
                                                }
                                                c7183nB = (p200u.C7183n) b0A.b(jE2, c7183nF, c7183nA, c7183nD);
                                            } else if (bVar != null) {
                                                c7183nB = p200u.C7170g0.f54859r.b();
                                            } else {
                                                c7183nB = p200u.C7170g0.f54859r.b();
                                            }
                                            if (bVar == null) {
                                                bVar = new p200u.C7170g0.b();
                                            }
                                            bVar.i(h0A);
                                            bVar.k(false);
                                            bVar.o(this.f54896J.H());
                                            bVar.f().e(0, this.f54896J.H());
                                            bVar.l(this.f54896J.I());
                                            bVar.n(0L);
                                            bVar.m(c7183nB);
                                            if (h0A != null) {
                                                jE = h0A.e(bVar.f(), p200u.C7170g0.f54859r.a(), c7183nB);
                                            } else {
                                                jE = A7.a.e(this.f54896J.I() * (1.0d - ((double) this.f54896J.H())));
                                            }
                                            bVar.j(jE);
                                            this.f54896J.f54875n = bVar;
                                        } else {
                                            if (bVar != null) {
                                                b0A = bVar.a();
                                            } else {
                                                b0A = null;
                                            }
                                            if (b0A != null) {
                                                long jE3 = bVar.e();
                                                p200u.C7183n c7183nF2 = bVar.f();
                                                p200u.C7183n c7183nA2 = p200u.C7170g0.f54859r.a();
                                                c7183nD = bVar.d();
                                                if (c7183nD == null) {
                                                    c7183nD = p200u.C7170g0.f54859r.b();
                                                }
                                                c7183nB = (p200u.C7183n) b0A.b(jE3, c7183nF2, c7183nA2, c7183nD);
                                            } else if (bVar != null) {
                                                c7183nB = p200u.C7170g0.f54859r.b();
                                            } else {
                                                c7183nB = p200u.C7170g0.f54859r.b();
                                            }
                                            if (bVar == null) {
                                                bVar = new p200u.C7170g0.b();
                                            }
                                            bVar.i(h0A);
                                            bVar.k(false);
                                            bVar.o(this.f54896J.H());
                                            bVar.f().e(0, this.f54896J.H());
                                            bVar.l(this.f54896J.I());
                                            bVar.n(0L);
                                            bVar.m(c7183nB);
                                            if (h0A != null) {
                                                jE = h0A.e(bVar.f(), p200u.C7170g0.f54859r.a(), c7183nB);
                                            } else {
                                                jE = A7.a.e(this.f54896J.I() * (1.0d - ((double) this.f54896J.H())));
                                            }
                                            bVar.j(jE);
                                            this.f54896J.f54875n = bVar;
                                        }
                                    }
                                    c7170g2 = this.f54896J;
                                    this.f54893G = null;
                                    this.f54894H = null;
                                    this.f54895I = 4;
                                    if (c7170g2.N(this) == objG) {
                                        return objG;
                                    }
                                    this.f54896J.d(this.f54897K);
                                    c7170g3 = this.f54896J;
                                    this.f54895I = 5;
                                    if (c7170g3.V(this) == objG) {
                                        return objG;
                                    }
                                }
                                return p087i7.M.f46721a;
                            }
                            if (i10 == 3) {
                                p087i7.x.b(obj);
                                if (!p247y7.AbstractC7350t.b(this.f54896J.a(), this.f54897K)) {
                                    if (this.f54896J.H() < 1.0f) {
                                        bVar = this.f54896J.f54875n;
                                        i6 = this.f54899M;
                                        if (i6 != null) {
                                            h0A = i6.a(p200u.z0.i(p247y7.C7344m.f57303a));
                                        } else {
                                            h0A = null;
                                        }
                                        if (bVar != null || !p247y7.AbstractC7350t.b(h0A, bVar.a())) {
                                            if (bVar != null) {
                                                b0A = bVar.a();
                                            } else {
                                                b0A = null;
                                            }
                                            if (b0A != null) {
                                                long jE4 = bVar.e();
                                                p200u.C7183n c7183nF3 = bVar.f();
                                                p200u.C7183n c7183nA3 = p200u.C7170g0.f54859r.a();
                                                c7183nD = bVar.d();
                                                if (c7183nD == null) {
                                                    c7183nD = p200u.C7170g0.f54859r.b();
                                                }
                                                c7183nB = (p200u.C7183n) b0A.b(jE4, c7183nF3, c7183nA3, c7183nD);
                                            } else if (bVar != null || bVar.e() == 0) {
                                                c7183nB = p200u.C7170g0.f54859r.b();
                                            } else {
                                                long jC = bVar.c();
                                                if (jC == Long.MIN_VALUE) {
                                                    jC = this.f54896J.I();
                                                }
                                                float f6 = jC / 1.0E9f;
                                                if (f6 <= 0.0f) {
                                                    c7183nB = p200u.C7170g0.f54859r.b();
                                                } else {
                                                    c7183nB = new p200u.C7183n(1.0f / f6);
                                                }
                                            }
                                            if (bVar == null) {
                                                bVar = new p200u.C7170g0.b();
                                            }
                                            bVar.i(h0A);
                                            bVar.k(false);
                                            bVar.o(this.f54896J.H());
                                            bVar.f().e(0, this.f54896J.H());
                                            bVar.l(this.f54896J.I());
                                            bVar.n(0L);
                                            bVar.m(c7183nB);
                                            if (h0A != null) {
                                                jE = h0A.e(bVar.f(), p200u.C7170g0.f54859r.a(), c7183nB);
                                            } else {
                                                jE = A7.a.e(this.f54896J.I() * (1.0d - ((double) this.f54896J.H())));
                                            }
                                            bVar.j(jE);
                                            this.f54896J.f54875n = bVar;
                                        }
                                    }
                                    c7170g2 = this.f54896J;
                                    this.f54893G = null;
                                    this.f54894H = null;
                                    this.f54895I = 4;
                                    if (c7170g2.N(this) == objG) {
                                        return objG;
                                    }
                                    this.f54896J.d(this.f54897K);
                                    c7170g3 = this.f54896J;
                                    this.f54895I = 5;
                                    if (c7170g3.V(this) == objG) {
                                        return objG;
                                    }
                                }
                                return p087i7.M.f46721a;
                            }
                            if (i10 == 4) {
                                p087i7.x.b(obj);
                                this.f54896J.d(this.f54897K);
                                c7170g3 = this.f54896J;
                                this.f54895I = 5;
                                if (c7170g3.V(this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 5) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                p087i7.x.b(obj);
                            }
                        }
                        this.f54896J.S(0.0f);
                        return p087i7.M.f46721a;
                    }
                    p087i7.x.b(obj);
                    java.lang.Object objB = this.f54896J.b();
                    if (!p247y7.AbstractC7350t.b(this.f54897K, objB)) {
                        this.f54896J.J();
                        this.f54896J.S(0.0f);
                        this.f54898L.R(this.f54897K);
                        this.f54898L.J(0L);
                        this.f54896J.d(objB);
                        this.f54896J.T(this.f54897K);
                    }
                    p059f9.a aVarG = this.f54896J.G();
                    p200u.C7170g0 c7170g4 = this.f54896J;
                    this.f54893G = aVarG;
                    this.f54894H = c7170g4;
                    this.f54895I = 1;
                    if (aVarG.c(null, this) == objG) {
                        return objG;
                    }
                    aVar = aVarG;
                    c7170g0 = c7170g4;
                    java.lang.Object objE = c7170g0.E();
                    aVar.d(null);
                    if (!p247y7.AbstractC7350t.b(this.f54897K, objE)) {
                        p200u.C7170g0 c7170g5 = this.f54896J;
                        this.f54893G = null;
                        this.f54894H = null;
                        this.f54895I = 2;
                        if (c7170g5.C(this) == objG) {
                            return objG;
                        }
                        c7170g1 = this.f54896J;
                        this.f54895I = 3;
                        if (c7170g1.W(this) == objG) {
                            return objG;
                        }
                        if (!p247y7.AbstractC7350t.b(this.f54896J.a(), this.f54897K)) {
                            if (this.f54896J.H() < 1.0f) {
                                bVar = this.f54896J.f54875n;
                                i6 = this.f54899M;
                                if (i6 != null) {
                                    h0A = i6.a(p200u.z0.i(p247y7.C7344m.f57303a));
                                } else {
                                    h0A = null;
                                }
                                if (bVar != null) {
                                    if (bVar != null) {
                                        b0A = bVar.a();
                                    } else {
                                        b0A = null;
                                    }
                                    if (b0A != null) {
                                        long jE5 = bVar.e();
                                        p200u.C7183n c7183nF4 = bVar.f();
                                        p200u.C7183n c7183nA4 = p200u.C7170g0.f54859r.a();
                                        c7183nD = bVar.d();
                                        if (c7183nD == null) {
                                            c7183nD = p200u.C7170g0.f54859r.b();
                                        }
                                        c7183nB = (p200u.C7183n) b0A.b(jE5, c7183nF4, c7183nA4, c7183nD);
                                    } else if (bVar != null) {
                                        c7183nB = p200u.C7170g0.f54859r.b();
                                    } else {
                                        c7183nB = p200u.C7170g0.f54859r.b();
                                    }
                                    if (bVar == null) {
                                        bVar = new p200u.C7170g0.b();
                                    }
                                    bVar.i(h0A);
                                    bVar.k(false);
                                    bVar.o(this.f54896J.H());
                                    bVar.f().e(0, this.f54896J.H());
                                    bVar.l(this.f54896J.I());
                                    bVar.n(0L);
                                    bVar.m(c7183nB);
                                    if (h0A != null) {
                                        jE = h0A.e(bVar.f(), p200u.C7170g0.f54859r.a(), c7183nB);
                                    } else {
                                        jE = A7.a.e(this.f54896J.I() * (1.0d - ((double) this.f54896J.H())));
                                    }
                                    bVar.j(jE);
                                    this.f54896J.f54875n = bVar;
                                } else {
                                    if (bVar != null) {
                                        b0A = bVar.a();
                                    } else {
                                        b0A = null;
                                    }
                                    if (b0A != null) {
                                        long jE6 = bVar.e();
                                        p200u.C7183n c7183nF5 = bVar.f();
                                        p200u.C7183n c7183nA5 = p200u.C7170g0.f54859r.a();
                                        c7183nD = bVar.d();
                                        if (c7183nD == null) {
                                            c7183nD = p200u.C7170g0.f54859r.b();
                                        }
                                        c7183nB = (p200u.C7183n) b0A.b(jE6, c7183nF5, c7183nA5, c7183nD);
                                    } else if (bVar != null) {
                                        c7183nB = p200u.C7170g0.f54859r.b();
                                    } else {
                                        c7183nB = p200u.C7170g0.f54859r.b();
                                    }
                                    if (bVar == null) {
                                        bVar = new p200u.C7170g0.b();
                                    }
                                    bVar.i(h0A);
                                    bVar.k(false);
                                    bVar.o(this.f54896J.H());
                                    bVar.f().e(0, this.f54896J.H());
                                    bVar.l(this.f54896J.I());
                                    bVar.n(0L);
                                    bVar.m(c7183nB);
                                    if (h0A != null) {
                                        jE = h0A.e(bVar.f(), p200u.C7170g0.f54859r.a(), c7183nB);
                                    } else {
                                        jE = A7.a.e(this.f54896J.I() * (1.0d - ((double) this.f54896J.H())));
                                    }
                                    bVar.j(jE);
                                    this.f54896J.f54875n = bVar;
                                }
                            }
                            c7170g2 = this.f54896J;
                            this.f54893G = null;
                            this.f54894H = null;
                            this.f54895I = 4;
                            if (c7170g2.N(this) == objG) {
                                return objG;
                            }
                            this.f54896J.d(this.f54897K);
                            c7170g3 = this.f54896J;
                            this.f54895I = 5;
                            if (c7170g3.V(this) == objG) {
                                return objG;
                            }
                            this.f54896J.S(0.0f);
                        }
                    } else if (!p247y7.AbstractC7350t.b(this.f54896J.a(), this.f54897K)) {
                        if (this.f54896J.H() < 1.0f) {
                            bVar = this.f54896J.f54875n;
                            i6 = this.f54899M;
                            if (i6 != null) {
                                h0A = i6.a(p200u.z0.i(p247y7.C7344m.f57303a));
                            } else {
                                h0A = null;
                            }
                            if (bVar != null) {
                                if (bVar != null) {
                                    b0A = bVar.a();
                                } else {
                                    b0A = null;
                                }
                                if (b0A != null) {
                                    long jE7 = bVar.e();
                                    p200u.C7183n c7183nF6 = bVar.f();
                                    p200u.C7183n c7183nA6 = p200u.C7170g0.f54859r.a();
                                    c7183nD = bVar.d();
                                    if (c7183nD == null) {
                                        c7183nD = p200u.C7170g0.f54859r.b();
                                    }
                                    c7183nB = (p200u.C7183n) b0A.b(jE7, c7183nF6, c7183nA6, c7183nD);
                                } else if (bVar != null) {
                                    c7183nB = p200u.C7170g0.f54859r.b();
                                } else {
                                    c7183nB = p200u.C7170g0.f54859r.b();
                                }
                                if (bVar == null) {
                                    bVar = new p200u.C7170g0.b();
                                }
                                bVar.i(h0A);
                                bVar.k(false);
                                bVar.o(this.f54896J.H());
                                bVar.f().e(0, this.f54896J.H());
                                bVar.l(this.f54896J.I());
                                bVar.n(0L);
                                bVar.m(c7183nB);
                                if (h0A != null) {
                                    jE = h0A.e(bVar.f(), p200u.C7170g0.f54859r.a(), c7183nB);
                                } else {
                                    jE = A7.a.e(this.f54896J.I() * (1.0d - ((double) this.f54896J.H())));
                                }
                                bVar.j(jE);
                                this.f54896J.f54875n = bVar;
                            } else {
                                if (bVar != null) {
                                    b0A = bVar.a();
                                } else {
                                    b0A = null;
                                }
                                if (b0A != null) {
                                    long jE8 = bVar.e();
                                    p200u.C7183n c7183nF7 = bVar.f();
                                    p200u.C7183n c7183nA7 = p200u.C7170g0.f54859r.a();
                                    c7183nD = bVar.d();
                                    if (c7183nD == null) {
                                        c7183nD = p200u.C7170g0.f54859r.b();
                                    }
                                    c7183nB = (p200u.C7183n) b0A.b(jE8, c7183nF7, c7183nA7, c7183nD);
                                } else if (bVar != null) {
                                    c7183nB = p200u.C7170g0.f54859r.b();
                                } else {
                                    c7183nB = p200u.C7170g0.f54859r.b();
                                }
                                if (bVar == null) {
                                    bVar = new p200u.C7170g0.b();
                                }
                                bVar.i(h0A);
                                bVar.k(false);
                                bVar.o(this.f54896J.H());
                                bVar.f().e(0, this.f54896J.H());
                                bVar.l(this.f54896J.I());
                                bVar.n(0L);
                                bVar.m(c7183nB);
                                if (h0A != null) {
                                    jE = h0A.e(bVar.f(), p200u.C7170g0.f54859r.a(), c7183nB);
                                } else {
                                    jE = A7.a.e(this.f54896J.I() * (1.0d - ((double) this.f54896J.H())));
                                }
                                bVar.j(jE);
                                this.f54896J.f54875n = bVar;
                            }
                        }
                        c7170g2 = this.f54896J;
                        this.f54893G = null;
                        this.f54894H = null;
                        this.f54895I = 4;
                        if (c7170g2.N(this) == objG) {
                            return objG;
                        }
                        this.f54896J.d(this.f54897K);
                        c7170g3 = this.f54896J;
                        this.f54895I = 5;
                        if (c7170g3.V(this) == objG) {
                            return objG;
                        }
                        this.f54896J.S(0.0f);
                    }
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    aVar.d(null);
                    throw th;
                }
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p200u.C7170g0.d.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new p200u.C7170g0.d.a(this.f54896J, this.f54897K, this.f54898L, this.f54899M, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p200u.s0 s0Var, p200u.C7170g0 c7170g0, java.lang.Object obj, p200u.I i6, p127m7.e eVar) {
            super(1, eVar);
            this.f54889H = s0Var;
            this.f54890I = c7170g0;
            this.f54891J = obj;
            this.f54892K = i6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f54888G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7170g0.d.a aVar = new p200u.C7170g0.d.a(this.f54890I, this.f54891J, this.f54889H, this.f54892K, null);
                this.f54888G = 1;
                if (W8.O.f(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            this.f54889H.z();
            return p087i7.M.f46721a;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((p200u.C7170g0.d) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return new p200u.C7170g0.d(this.f54889H, this.f54890I, this.f54891J, this.f54892K, eVar);
        }
    }

    /* JADX INFO: renamed from: u.g0$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        public final void a(long j6) {
            p200u.C7170g0.this.f54873l = j6;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).longValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: u.g0$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.a {
        f() {
            super(0);
        }

        public final void a() {
            p200u.C7170g0 c7170g0 = p200u.C7170g0.this;
            p200u.s0 s0Var = c7170g0.f54866e;
            c7170g0.U(s0Var != null ? s0Var.q() : 0L);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: u.g0$g */
    static final class g extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f54902F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f54903G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f54905I;

        g(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f54903G = obj;
            this.f54905I |= Integer.MIN_VALUE;
            return p200u.C7170g0.this.N(this);
        }
    }

    /* JADX INFO: renamed from: u.g0$h */
    static final class h extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f54906G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54907H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54908I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p200u.C7170g0 f54909J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54910K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ float f54911L;

        /* JADX INFO: renamed from: u.g0$h$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f54912G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f54913H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f54914I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f54915J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p200u.C7170g0 f54916K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ p200u.s0 f54917L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ float f54918M;

            /* JADX INFO: renamed from: u.g0$h$a$a, reason: collision with other inner class name */
            static final class C0718a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f54919G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ p200u.C7170g0 f54920H;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0718a(p200u.C7170g0 c7170g0, p127m7.e eVar) {
                    super(2, eVar);
                    this.f54920H = c7170g0;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f54919G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        p200u.C7170g0 c7170g0 = this.f54920H;
                        this.f54919G = 1;
                        if (c7170g0.N(this) == objG) {
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
                    return ((p200u.C7170g0.h.a.C0718a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new p200u.C7170g0.h.a.C0718a(this.f54920H, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(java.lang.Object obj, java.lang.Object obj2, p200u.C7170g0 c7170g0, p200u.s0 s0Var, float f6, p127m7.e eVar) {
                super(2, eVar);
                this.f54914I = obj;
                this.f54915J = obj2;
                this.f54916K = c7170g0;
                this.f54917L = s0Var;
                this.f54918M = f6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f54912G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    W8.N n6 = (W8.N) this.f54913H;
                    if (p247y7.AbstractC7350t.b(this.f54914I, this.f54915J)) {
                        this.f54916K.f54875n = null;
                        if (p247y7.AbstractC7350t.b(this.f54916K.a(), this.f54914I)) {
                            return p087i7.M.f46721a;
                        }
                    } else {
                        this.f54916K.J();
                    }
                    if (!p247y7.AbstractC7350t.b(this.f54914I, this.f54915J)) {
                        this.f54917L.R(this.f54914I);
                        this.f54917L.J(0L);
                        this.f54916K.T(this.f54914I);
                        this.f54917L.E(this.f54918M);
                    }
                    this.f54916K.S(this.f54918M);
                    if (this.f54916K.f54874m.d()) {
                        W8.AbstractC1788i.d(n6, null, null, new p200u.C7170g0.h.a.C0718a(this.f54916K, null), 3, null);
                    } else {
                        this.f54916K.f54873l = Long.MIN_VALUE;
                    }
                    p200u.C7170g0 c7170g0 = this.f54916K;
                    this.f54912G = 1;
                    if (c7170g0.W(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                this.f54916K.P();
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p200u.C7170g0.h.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p200u.C7170g0.h.a aVar = new p200u.C7170g0.h.a(this.f54914I, this.f54915J, this.f54916K, this.f54917L, this.f54918M, eVar);
                aVar.f54913H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(java.lang.Object obj, java.lang.Object obj2, p200u.C7170g0 c7170g0, p200u.s0 s0Var, float f6, p127m7.e eVar) {
            super(1, eVar);
            this.f54907H = obj;
            this.f54908I = obj2;
            this.f54909J = c7170g0;
            this.f54910K = s0Var;
            this.f54911L = f6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f54906G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7170g0.h.a aVar = new p200u.C7170g0.h.a(this.f54907H, this.f54908I, this.f54909J, this.f54910K, this.f54911L, null);
                this.f54906G = 1;
                if (W8.O.f(aVar, this) == objG) {
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

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((p200u.C7170g0.h) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return new p200u.C7170g0.h(this.f54907H, this.f54908I, this.f54909J, this.f54910K, this.f54911L, eVar);
        }
    }

    /* JADX INFO: renamed from: u.g0$i */
    static final class i extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f54921F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f54922G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f54923H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f54925J;

        i(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f54923H = obj;
            this.f54925J |= Integer.MIN_VALUE;
            return p200u.C7170g0.this.V(this);
        }
    }

    /* JADX INFO: renamed from: u.g0$j */
    static final class j extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f54926F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f54927G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f54928H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f54930J;

        j(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f54928H = obj;
            this.f54930J |= Integer.MIN_VALUE;
            return p200u.C7170g0.this.W(this);
        }
    }

    public C7170g0(java.lang.Object obj) {
        super(null);
        this.f54863b = V.A1.d(obj, null, 2, null);
        this.f54864c = V.A1.d(obj, null, 2, null);
        this.f54865d = obj;
        this.f54868g = new p200u.C7170g0.f();
        this.f54869h = V.J0.a(0.0f);
        this.f54871j = p059f9.g.b(false, 1, null);
        this.f54872k = new p200u.C7164d0();
        this.f54873l = Long.MIN_VALUE;
        this.f54874m = new p170r.I(0, 1, null);
        this.f54876o = new p200u.C7170g0.e();
        this.f54878q = new p200u.C7170g0.c();
    }

    public static /* synthetic */ java.lang.Object B(p200u.C7170g0 c7170g0, java.lang.Object obj, p200u.I i6, p127m7.e eVar, int i10, java.lang.Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c7170g0.b();
        }
        if ((i10 & 2) != 0) {
            i6 = null;
        }
        return c7170g0.A(obj, i6, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object C(p127m7.e eVar) {
        if (this.f54873l == Long.MIN_VALUE) {
            java.lang.Object objC = V.AbstractC1729l0.c(this.f54876o, eVar);
            return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
        }
        java.lang.Object objZ = z(eVar);
        return objZ == p137n7.b.g() ? objZ : p087i7.M.f46721a;
    }

    private final void D() {
        p200u.s0 s0Var = this.f54866e;
        if (s0Var != null) {
            s0Var.g();
        }
        this.f54874m.h();
        if (this.f54875n != null) {
            this.f54875n = null;
            S(1.0f);
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        p200u.s0 s0Var = this.f54866e;
        if (s0Var == null) {
            return;
        }
        p200u.C7170g0.b bVar = this.f54875n;
        if (bVar == null) {
            if (this.f54867f <= 0 || H() == 1.0f || p247y7.AbstractC7350t.b(a(), b())) {
                bVar = null;
            } else {
                bVar = new p200u.C7170g0.b();
                bVar.o(H());
                long j6 = this.f54867f;
                bVar.l(j6);
                bVar.j(A7.a.e(j6 * (1.0d - ((double) H()))));
                bVar.f().e(0, H());
            }
        }
        if (bVar != null) {
            bVar.l(this.f54867f);
            this.f54874m.g(bVar);
            s0Var.I(bVar);
        }
        this.f54875n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(p200u.C7170g0.b bVar, long j6) {
        float fK;
        long jE = bVar.e() + j6;
        bVar.n(jE);
        long jB = bVar.b();
        if (jE >= jB) {
            bVar.o(1.0f);
            return;
        }
        p200u.B0 b0A = bVar.a();
        if (b0A != null) {
            p200u.C7183n c7183nF = bVar.f();
            p200u.C7183n c7183n = f54862u;
            p200u.C7183n c7183nD = bVar.d();
            if (c7183nD == null) {
                c7183nD = f54861t;
            }
            fK = E7.j.j(((p200u.C7183n) b0A.c(jE, c7183nF, c7183n, c7183nD)).a(0), 0.0f, 1.0f);
        } else {
            fK = p200u.z0.k(bVar.f().a(0), 1.0f, jE / jB);
        }
        bVar.o(fK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object N(p127m7.e eVar) {
        p200u.C7170g0.g gVar;
        p200u.C7170g0 c7170g0;
        if (eVar instanceof p200u.C7170g0.g) {
            gVar = (p200u.C7170g0.g) eVar;
            int i6 = gVar.f54905I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.f54905I = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new p200u.C7170g0.g(eVar);
            }
        } else {
            gVar = new p200u.C7170g0.g(eVar);
        }
        java.lang.Object obj = gVar.f54903G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = gVar.f54905I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            if (this.f54874m.c() && this.f54875n == null) {
                return p087i7.M.f46721a;
            }
            if (p200u.AbstractC7190q0.n(gVar.getContext()) == 0.0f) {
                D();
                this.f54873l = Long.MIN_VALUE;
            } else {
                if (this.f54873l == Long.MIN_VALUE) {
                    p237x7.l lVar = this.f54876o;
                    gVar.f54902F = this;
                    gVar.f54905I = 1;
                    if (V.AbstractC1729l0.c(lVar, gVar) == objG) {
                        return objG;
                    }
                }
                c7170g0 = this;
            }
            return p087i7.M.f46721a;
        }
        if (i10 != 1 && i10 != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c7170g0 = (p200u.C7170g0) gVar.f54902F;
        p087i7.x.b(obj);
        do {
            if (!c7170g0.f54874m.d() && c7170g0.f54875n == null) {
                c7170g0.f54873l = Long.MIN_VALUE;
                return p087i7.M.f46721a;
            }
            gVar.f54902F = c7170g0;
            gVar.f54905I = 2;
        } while (c7170g0.z(gVar) != objG);
        return objG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        p200u.s0 s0Var = this.f54866e;
        if (s0Var == null) {
            return;
        }
        s0Var.H(A7.a.e(((double) H()) * s0Var.q()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(float f6) {
        this.f54869h.h(f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object V(p127m7.e eVar) {
        p200u.C7170g0.i iVar;
        java.lang.Object objB;
        p200u.C7170g0 c7170g0;
        java.lang.Object obj;
        p200u.C7170g0 c7170g1;
        if (eVar instanceof p200u.C7170g0.i) {
            iVar = (p200u.C7170g0.i) eVar;
            int i6 = iVar.f54925J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iVar.f54925J = i6 - Integer.MIN_VALUE;
            } else {
                iVar = new p200u.C7170g0.i(eVar);
            }
        } else {
            iVar = new p200u.C7170g0.i(eVar);
        }
        java.lang.Object obj2 = iVar.f54923H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = iVar.f54925J;
        if (i10 != 0) {
            if (i10 == 1) {
                java.lang.Object obj3 = iVar.f54922G;
                c7170g0 = (p200u.C7170g0) iVar.f54921F;
                p087i7.x.b(obj2);
                objB = obj3;
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iVar.f54922G;
                c7170g1 = (p200u.C7170g0) iVar.f54921F;
                p087i7.x.b(obj2);
            }
            if (p247y7.AbstractC7350t.b(obj2, obj)) {
                return p087i7.M.f46721a;
            }
            c7170g1.f54873l = Long.MIN_VALUE;
            throw new java.util.concurrent.CancellationException("targetState while waiting for composition");
        }
        p087i7.x.b(obj2);
        objB = b();
        p059f9.a aVar = this.f54871j;
        iVar.f54921F = this;
        iVar.f54922G = objB;
        iVar.f54925J = 1;
        if (p059f9.a.C0508a.a(aVar, null, iVar, 1, null) == objG) {
            return objG;
        }
        c7170g0 = this;
        iVar.f54921F = c7170g0;
        iVar.f54922G = objB;
        iVar.f54925J = 2;
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(iVar), 1);
        c1798n.E();
        c7170g0.R(c1798n);
        p059f9.a.C0508a.c(c7170g0.G(), null, 1, null);
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(iVar);
        }
        if (objX == objG) {
            return objG;
        }
        obj = objB;
        obj2 = objX;
        c7170g1 = c7170g0;
        if (p247y7.AbstractC7350t.b(obj2, obj)) {
            return p087i7.M.f46721a;
        }
        c7170g1.f54873l = Long.MIN_VALUE;
        throw new java.util.concurrent.CancellationException("targetState while waiting for composition");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00a3, please report this as an issue */
    public final java.lang.Object W(p127m7.e eVar) {
        p200u.C7170g0.j jVar;
        java.lang.Object objB;
        p200u.C7170g0 c7170g0;
        java.lang.Object obj;
        p200u.C7170g0 c7170g1;
        if (eVar instanceof p200u.C7170g0.j) {
            jVar = (p200u.C7170g0.j) eVar;
            int i6 = jVar.f54930J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                jVar.f54930J = i6 - Integer.MIN_VALUE;
            } else {
                jVar = new p200u.C7170g0.j(eVar);
            }
        } else {
            jVar = new p200u.C7170g0.j(eVar);
        }
        java.lang.Object obj2 = jVar.f54928H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = jVar.f54930J;
        if (i10 != 0) {
            if (i10 == 1) {
                java.lang.Object obj3 = jVar.f54927G;
                c7170g0 = (p200u.C7170g0) jVar.f54926F;
                p087i7.x.b(obj2);
                objB = obj3;
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = jVar.f54927G;
                c7170g1 = (p200u.C7170g0) jVar.f54926F;
                p087i7.x.b(obj2);
            }
            if (!p247y7.AbstractC7350t.b(obj2, obj)) {
                c7170g1.f54873l = Long.MIN_VALUE;
                throw new java.util.concurrent.CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
            }
            return p087i7.M.f46721a;
        }
        p087i7.x.b(obj2);
        objB = b();
        p059f9.a aVar = this.f54871j;
        jVar.f54926F = this;
        jVar.f54927G = objB;
        jVar.f54930J = 1;
        if (p059f9.a.C0508a.a(aVar, null, jVar, 1, null) == objG) {
            return objG;
        }
        c7170g0 = this;
        if (p247y7.AbstractC7350t.b(objB, c7170g0.f54865d)) {
            p059f9.a.C0508a.c(c7170g0.f54871j, null, 1, null);
        } else {
            jVar.f54926F = c7170g0;
            jVar.f54927G = objB;
            jVar.f54930J = 2;
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(jVar), 1);
            c1798n.E();
            c7170g0.R(c1798n);
            p059f9.a.C0508a.c(c7170g0.G(), null, 1, null);
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(jVar);
            }
            if (objX == objG) {
                return objG;
            }
            obj = objB;
            obj2 = objX;
            c7170g1 = c7170g0;
            if (!p247y7.AbstractC7350t.b(obj2, obj)) {
                c7170g1.f54873l = Long.MIN_VALUE;
                throw new java.util.concurrent.CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
            }
        }
        return p087i7.M.f46721a;
    }

    private final java.lang.Object z(p127m7.e eVar) {
        float fN = p200u.AbstractC7190q0.n(eVar.getContext());
        if (fN <= 0.0f) {
            D();
            return p087i7.M.f46721a;
        }
        this.f54877p = fN;
        java.lang.Object objC = V.AbstractC1729l0.c(this.f54878q, eVar);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }

    public final java.lang.Object A(java.lang.Object obj, p200u.I i6, p127m7.e eVar) {
        java.lang.Object objE;
        p200u.s0 s0Var = this.f54866e;
        return (s0Var != null && (objE = p200u.C7164d0.e(this.f54872k, null, new p200u.C7170g0.d(s0Var, this, obj, i6, null), eVar, 1, null)) == p137n7.b.g()) ? objE : p087i7.M.f46721a;
    }

    public final java.lang.Object E() {
        return this.f54865d;
    }

    public final W8.InterfaceC1794l F() {
        return this.f54870i;
    }

    public final p059f9.a G() {
        return this.f54871j;
    }

    public final float H() {
        return this.f54869h.b();
    }

    public final long I() {
        return this.f54867f;
    }

    public final void K() {
        p200u.u0.e().o(this, p200u.u0.f55072a, this.f54868g);
    }

    public final void L() {
        long j6 = this.f54867f;
        K();
        long j10 = this.f54867f;
        if (j6 != j10) {
            p200u.C7170g0.b bVar = this.f54875n;
            if (bVar == null) {
                if (j10 != 0) {
                    P();
                }
            } else {
                bVar.l(j10);
                if (bVar.a() == null) {
                    bVar.j(A7.a.e((1.0d - ((double) bVar.f().a(0))) * this.f54867f));
                }
            }
        }
    }

    public final java.lang.Object O(float f6, java.lang.Object obj, p127m7.e eVar) {
        boolean z6 = false;
        if (0.0f <= f6 && f6 <= 1.0f) {
            z6 = true;
        }
        if (!z6) {
            p200u.AbstractC7166e0.a("Expecting fraction between 0 and 1. Got " + f6);
        }
        p200u.s0 s0Var = this.f54866e;
        if (s0Var == null) {
            return p087i7.M.f46721a;
        }
        java.lang.Object objE = p200u.C7164d0.e(this.f54872k, null, new p200u.C7170g0.h(obj, b(), this, s0Var, f6, null), eVar, 1, null);
        return objE == p137n7.b.g() ? objE : p087i7.M.f46721a;
    }

    public final void Q(java.lang.Object obj) {
        this.f54865d = obj;
    }

    public final void R(W8.InterfaceC1794l interfaceC1794l) {
        this.f54870i = interfaceC1794l;
    }

    public void T(java.lang.Object obj) {
        this.f54863b.setValue(obj);
    }

    public final void U(long j6) {
        this.f54867f = j6;
    }

    @Override // p200u.v0
    public java.lang.Object a() {
        return this.f54864c.getValue();
    }

    @Override // p200u.v0
    public java.lang.Object b() {
        return this.f54863b.getValue();
    }

    @Override // p200u.v0
    public void d(java.lang.Object obj) {
        this.f54864c.setValue(obj);
    }

    @Override // p200u.v0
    public void f(p200u.s0 s0Var) {
        p200u.s0 s0Var2 = this.f54866e;
        if (!(s0Var2 == null || p247y7.AbstractC7350t.b(s0Var, s0Var2))) {
            p200u.AbstractC7166e0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f54866e + ", new instance: " + s0Var);
        }
        this.f54866e = s0Var;
    }

    @Override // p200u.v0
    public void g() {
        this.f54866e = null;
        p200u.u0.e().k(this);
    }
}
