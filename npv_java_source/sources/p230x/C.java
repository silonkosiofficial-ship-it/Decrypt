package p230x;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p230x.A f56294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p210v.T f56295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p230x.p f56296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p230x.s f56297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f56298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p241y0.c f56299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56300g = p241y0.f.f57150a.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p230x.w f56301h = androidx.compose.foundation.gestures.d.f19086b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x.C.c f56302i = new x.C.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p237x7.l f56303j = new x.C.e();

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56304F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56305G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f56307I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56305G = obj;
            this.f56307I |= Integer.MIN_VALUE;
            return p230x.C.this.n(0L, this);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56308G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f56309H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        long f56310I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f56311J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56312K;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p247y7.N f56314M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ long f56315N;

        public static final class a implements p230x.w {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p230x.C f56316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p230x.r f56317b;

            a(p230x.C c6, p230x.r rVar) {
                this.f56316a = c6;
                this.f56317b = rVar;
            }

            @Override // p230x.w
            public float a(float f6) {
                p230x.C c6 = this.f56316a;
                return c6.t(c6.A(this.f56317b.a(c6.u(c6.B(f6)), p241y0.f.f57150a.a())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p247y7.N n6, long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f56314M = n6;
            this.f56315N = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p230x.C c6;
            p247y7.N n6;
            p230x.C c10;
            long j6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56311J;
            if (i6 == 0) {
                p087i7.x.b(obj);
                x.C.b.a aVar = new x.C.b.a(p230x.C.this, (p230x.r) this.f56312K);
                c6 = p230x.C.this;
                p247y7.N n10 = this.f56314M;
                long j10 = this.f56315N;
                p230x.p pVar = c6.f56296c;
                long j11 = n10.f57253C;
                float fT = c6.t(c6.z(j10));
                this.f56312K = c6;
                this.f56308G = c6;
                this.f56309H = n10;
                this.f56310I = j11;
                this.f56311J = 1;
                java.lang.Object objB = pVar.b(aVar, fT, this);
                if (objB == objG) {
                    return objG;
                }
                n6 = n10;
                obj = objB;
                c10 = c6;
                j6 = j11;
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = this.f56310I;
                n6 = (p247y7.N) this.f56309H;
                c6 = (p230x.C) this.f56308G;
                c10 = (p230x.C) this.f56312K;
                p087i7.x.b(obj);
            }
            n6.f57253C = c6.D(j6, c10.t(((java.lang.Number) obj).floatValue()));
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p230x.r rVar, p127m7.e eVar) {
            return ((x.C.b) x(rVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            x.C.b bVar = p230x.C.this.new b(this.f56314M, this.f56315N, eVar);
            bVar.f56312K = obj;
            return bVar;
        }
    }

    public static final class c implements p230x.r {
        c() {
        }

        @Override // p230x.r
        public long a(long j6, int i6) {
            p230x.C.this.f56300g = i6;
            p210v.T t6 = p230x.C.this.f56295b;
            if (t6 != null && p230x.C.this.o()) {
                return t6.a(j6, p230x.C.this.f56300g, p230x.C.this.f56303j);
            }
            return p230x.C.this.s(p230x.C.this.f56301h, j6, i6);
        }

        @Override // p230x.r
        public long b(long j6, int i6) {
            return p230x.C.this.s(p230x.C.this.f56301h, j6, i6);
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        long f56319G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f56320H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ long f56321I;

        d(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0087 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0088  */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objC;
            long j6;
            java.lang.Object objN;
            long j10;
            long j11;
            long jO;
            java.lang.Object objA;
            long j12;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56320H;
            if (i6 != 0) {
                if (i6 == 1) {
                    j6 = this.f56321I;
                    p087i7.x.b(obj);
                    objC = obj;
                } else if (i6 == 2) {
                    j10 = this.f56319G;
                    long j13 = this.f56321I;
                    p087i7.x.b(obj);
                    objN = obj;
                    j11 = j13;
                    jO = ((Y0.A) objN).o();
                    p241y0.c cVar = p230x.C.this.f56299f;
                    long jK = Y0.A.k(j10, jO);
                    this.f56321I = j11;
                    this.f56319G = jO;
                    this.f56320H = 3;
                    objA = cVar.a(jK, jO, this);
                    if (objA == objG) {
                        return objG;
                    }
                    j12 = j11;
                } else {
                    if (i6 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j14 = this.f56319G;
                    j12 = this.f56321I;
                    p087i7.x.b(obj);
                    jO = j14;
                    objA = obj;
                }
                return Y0.A.b(Y0.A.k(j12, Y0.A.k(jO, ((Y0.A) objA).o())));
            }
            p087i7.x.b(obj);
            long j15 = this.f56321I;
            p241y0.c cVar2 = p230x.C.this.f56299f;
            this.f56321I = j15;
            this.f56320H = 1;
            objC = cVar2.c(j15, this);
            if (objC == objG) {
                return objG;
            }
            j6 = j15;
            long jK2 = Y0.A.k(j6, ((Y0.A) objC).o());
            p230x.C c6 = p230x.C.this;
            this.f56321I = j6;
            this.f56319G = jK2;
            this.f56320H = 2;
            objN = c6.n(jK2, this);
            if (objN == objG) {
                return objG;
            }
            j10 = jK2;
            j11 = j6;
            jO = ((Y0.A) objN).o();
            p241y0.c cVar3 = p230x.C.this.f56299f;
            long jK3 = Y0.A.k(j10, jO);
            this.f56321I = j11;
            this.f56319G = jO;
            this.f56320H = 3;
            objA = cVar3.a(jK3, jO, this);
            if (objA == objG) {
                return objG;
            }
            j12 = j11;
            return Y0.A.b(Y0.A.k(j12, Y0.A.k(jO, ((Y0.A) objA).o())));
        }

        public final java.lang.Object H(long j6, p127m7.e eVar) {
            return ((x.C.d) x(Y0.A.b(j6), eVar)).B(p087i7.M.f46721a);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return H(((Y0.A) obj).o(), (p127m7.e) obj2);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            x.C.d dVar = p230x.C.this.new d(eVar);
            dVar.f56321I = ((Y0.A) obj).o();
            return dVar;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        public final long a(long j6) {
            p230x.w wVar = p230x.C.this.f56301h;
            p230x.C c6 = p230x.C.this;
            return c6.s(wVar, j6, c6.f56300g);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return p131n0.g.d(a(((p131n0.g) obj).v()));
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56324G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56325H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f56327J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56327J = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56324G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.C.this.f56301h = (p230x.w) this.f56325H;
                p237x7.p pVar = this.f56327J;
                x.C.c cVar = p230x.C.this.f56302i;
                this.f56324G = 1;
                if (pVar.u(cVar, this) == objG) {
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
        public final java.lang.Object u(p230x.w wVar, p127m7.e eVar) {
            return ((x.C.f) x(wVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            x.C.f fVar = p230x.C.this.new f(this.f56327J, eVar);
            fVar.f56325H = obj;
            return fVar;
        }
    }

    public C(p230x.A a6, p210v.T t6, p230x.p pVar, p230x.s sVar, boolean z6, p241y0.c cVar) {
        this.f56294a = a6;
        this.f56295b = t6;
        this.f56296c = pVar;
        this.f56297d = sVar;
        this.f56298e = z6;
        this.f56299f = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D(long j6, float f6) {
        return this.f56297d == p230x.s.Horizontal ? Y0.A.e(j6, f6, 0.0f, 2, null) : Y0.A.e(j6, 0.0f, f6, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return this.f56294a.c() || this.f56294a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s(p230x.w wVar, long j6, int i6) {
        long jD = this.f56299f.d(j6, i6);
        long jQ = p131n0.g.q(j6, jD);
        long jU = u(B(wVar.a(A(u(x(jQ))))));
        return p131n0.g.r(p131n0.g.r(jD, jU), this.f56299f.b(jU, p131n0.g.q(jQ, jU), i6));
    }

    private final long y(long j6) {
        return this.f56297d == p230x.s.Horizontal ? Y0.A.e(j6, 0.0f, 0.0f, 1, null) : Y0.A.e(j6, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float z(long j6) {
        return this.f56297d == p230x.s.Horizontal ? Y0.A.h(j6) : Y0.A.i(j6);
    }

    public final float A(long j6) {
        return this.f56297d == p230x.s.Horizontal ? p131n0.g.m(j6) : p131n0.g.n(j6);
    }

    public final long B(float f6) {
        if (f6 == 0.0f) {
            return p131n0.g.f51312b.c();
        }
        return this.f56297d == p230x.s.Horizontal ? p131n0.h.a(f6, 0.0f) : p131n0.h.a(0.0f, f6);
    }

    public final boolean C(p230x.A a6, p230x.s sVar, p210v.T t6, boolean z6, p230x.p pVar, p241y0.c cVar) {
        boolean z10;
        boolean z11 = true;
        if (p247y7.AbstractC7350t.b(this.f56294a, a6)) {
            z10 = false;
        } else {
            this.f56294a = a6;
            z10 = true;
        }
        this.f56295b = t6;
        if (this.f56297d != sVar) {
            this.f56297d = sVar;
            z10 = true;
        }
        if (this.f56298e != z6) {
            this.f56298e = z6;
        } else {
            z11 = z10;
        }
        this.f56296c = pVar;
        this.f56299f = cVar;
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(long j6, p127m7.e eVar) {
        x.C.a aVar;
        p247y7.N n6;
        if (eVar instanceof x.C.a) {
            aVar = (x.C.a) eVar;
            int i6 = aVar.f56307I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f56307I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new x.C.a(eVar);
            }
        } else {
            aVar = new x.C.a(eVar);
        }
        java.lang.Object obj = aVar.f56305G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f56307I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p247y7.N n10 = new p247y7.N();
            n10.f57253C = j6;
            p210v.L l6 = p210v.L.Default;
            p237x7.p bVar = new x.C.b(n10, j6, null);
            aVar.f56304F = n10;
            aVar.f56307I = 1;
            if (v(l6, bVar, aVar) == objG) {
                return objG;
            }
            n6 = n10;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n6 = (p247y7.N) aVar.f56304F;
            p087i7.x.b(obj);
        }
        return Y0.A.b(n6.f57253C);
    }

    public final boolean p() {
        return this.f56297d == p230x.s.Vertical;
    }

    public final java.lang.Object q(long j6, p127m7.e eVar) {
        long jY = y(j6);
        x.C.d dVar = new x.C.d(null);
        p210v.T t6 = this.f56295b;
        if (t6 == null || !o()) {
            java.lang.Object objU = dVar.u(Y0.A.b(jY), eVar);
            return objU == p137n7.b.g() ? objU : p087i7.M.f46721a;
        }
        java.lang.Object objB = t6.b(jY, dVar, eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }

    public final long r(long j6) {
        return this.f56294a.a() ? p131n0.g.f51312b.c() : B(t(this.f56294a.e(t(A(j6)))));
    }

    public final float t(float f6) {
        return this.f56298e ? f6 * (-1) : f6;
    }

    public final long u(long j6) {
        return this.f56298e ? p131n0.g.s(j6, -1.0f) : j6;
    }

    public final java.lang.Object v(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objD = this.f56294a.d(l6, new x.C.f(pVar, null), eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    public final boolean w() {
        if (!this.f56294a.a()) {
            p210v.T t6 = this.f56295b;
            if (!(t6 != null ? t6.d() : false)) {
                return false;
            }
        }
        return true;
    }

    public final long x(long j6) {
        return this.f56297d == p230x.s.Horizontal ? p131n0.g.g(j6, 0.0f, 0.0f, 1, null) : p131n0.g.g(j6, 0.0f, 0.0f, 2, null);
    }
}
