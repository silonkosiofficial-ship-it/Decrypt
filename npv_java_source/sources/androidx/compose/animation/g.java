package androidx.compose.animation;

/* JADX INFO: loaded from: classes.dex */
final class g extends p190t.s {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p200u.s0 f18774P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private u.s0.a f18775Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private u.s0.a f18776R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private u.s0.a f18777S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private androidx.compose.animation.h f18778T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private androidx.compose.animation.j f18779U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private p237x7.a f18780V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p190t.r f18781W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f18782X;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p071h0.c f18785a0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f18783Y = p190t.g.a();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f18784Z = Y0.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final p237x7.l f18786b0 = new androidx.compose.animation.g.i();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final p237x7.l f18787c0 = new androidx.compose.animation.g.j();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18788a;

        static {
            int[] iArr = new int[p190t.m.values().length];
            try {
                iArr[p190t.m.Visible.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p190t.m.PreEnter.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p190t.m.PostExit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f18788a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f18789D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D0.X x6) {
            super(1);
            this.f18789D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f18789D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f18790D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f18791E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f18792F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f18793G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D0.X x6, long j6, long j10, p237x7.l lVar) {
            super(1);
            this.f18790D = x6;
            this.f18791E = j6;
            this.f18792F = j10;
            this.f18793G = lVar;
        }

        public final void a(D0.X.a aVar) {
            aVar.u(this.f18790D, Y0.p.h(this.f18792F) + Y0.p.h(this.f18791E), Y0.p.i(this.f18792F) + Y0.p.i(this.f18791E), 0.0f, this.f18793G);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f18794D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(D0.X x6) {
            super(1);
            this.f18794D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f18794D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f18796E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j6) {
            super(1);
            this.f18796E = j6;
        }

        public final long a(p190t.m mVar) {
            return androidx.compose.animation.g.this.f2(mVar, this.f18796E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.t.b(a((p190t.m) obj));
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.animation.g.f f18797D = new androidx.compose.animation.g.f();

        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p200u.I l(u.s0.b bVar) {
            return androidx.compose.animation.f.f18735c;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.g$g, reason: collision with other inner class name */
    static final class C0354g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f18799E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0354g(long j6) {
            super(1);
            this.f18799E = j6;
        }

        public final long a(p190t.m mVar) {
            return androidx.compose.animation.g.this.h2(mVar, this.f18799E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.p.b(a((p190t.m) obj));
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f18801E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j6) {
            super(1);
            this.f18801E = j6;
        }

        public final long a(p190t.m mVar) {
            return androidx.compose.animation.g.this.g2(mVar, this.f18801E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return Y0.p.b(a((p190t.m) obj));
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {
        i() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001b A[PHI: r4
  0x001b: PHI (r4v6 t.i) = (r4v5 t.i), (r4v10 t.i) binds: [B:10:0x0036, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p200u.I l(u.s0.b bVar) {
            p190t.i iVarA;
            p190t.m mVar = p190t.m.PreEnter;
            p190t.m mVar2 = p190t.m.Visible;
            p200u.I iB = null;
            if (bVar.c(mVar, mVar2)) {
                iVarA = androidx.compose.animation.g.this.U1().b().a();
                if (iVarA != null) {
                    iB = iVarA.b();
                }
            } else if (bVar.c(mVar2, p190t.m.PostExit)) {
                iVarA = androidx.compose.animation.g.this.V1().b().a();
                if (iVarA != null) {
                    iB = iVarA.b();
                }
            } else {
                iB = androidx.compose.animation.f.f18736d;
            }
            return iB == null ? androidx.compose.animation.f.f18736d : iB;
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.l {
        j() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p200u.I l(u.s0.b bVar) {
            p190t.y yVarF;
            p200u.I iA;
            p200u.I iA2;
            p190t.m mVar = p190t.m.PreEnter;
            p190t.m mVar2 = p190t.m.Visible;
            if (bVar.c(mVar, mVar2)) {
                p190t.y yVarF2 = androidx.compose.animation.g.this.U1().b().f();
                if (yVarF2 != null && (iA2 = yVarF2.a()) != null) {
                    return iA2;
                }
            } else if (bVar.c(mVar2, p190t.m.PostExit) && (yVarF = androidx.compose.animation.g.this.V1().b().f()) != null && (iA = yVarF.a()) != null) {
                return iA;
            }
            return androidx.compose.animation.f.f18735c;
        }
    }

    public g(p200u.s0 s0Var, u.s0.a aVar, u.s0.a aVar2, u.s0.a aVar3, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, p237x7.a aVar4, p190t.r rVar) {
        this.f18774P = s0Var;
        this.f18775Q = aVar;
        this.f18776R = aVar2;
        this.f18777S = aVar3;
        this.f18778T = hVar;
        this.f18779U = jVar;
        this.f18780V = aVar4;
        this.f18781W = rVar;
    }

    private final void a2(long j6) {
        this.f18782X = true;
        this.f18784Z = j6;
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        super.D1();
        this.f18782X = false;
        this.f18783Y = p190t.g.a();
    }

    public final p071h0.c T1() {
        p190t.i iVarA;
        p071h0.c cVarA;
        if (this.f18774P.n().c(p190t.m.PreEnter, p190t.m.Visible)) {
            p190t.i iVarA2 = this.f18778T.b().a();
            if (iVarA2 == null || (cVarA = iVarA2.a()) == null) {
                iVarA = this.f18779U.b().a();
                if (iVarA == null) {
                    return null;
                }
                return iVarA.a();
            }
            return cVarA;
        }
        p190t.i iVarA3 = this.f18779U.b().a();
        if (iVarA3 == null || (cVarA = iVarA3.a()) == null) {
            iVarA = this.f18778T.b().a();
            if (iVarA == null) {
                return null;
            }
            return iVarA.a();
        }
        return cVarA;
    }

    public final androidx.compose.animation.h U1() {
        return this.f18778T;
    }

    public final androidx.compose.animation.j V1() {
        return this.f18779U;
    }

    public final void W1(p237x7.a aVar) {
        this.f18780V = aVar;
    }

    public final void X1(androidx.compose.animation.h hVar) {
        this.f18778T = hVar;
    }

    public final void Y1(androidx.compose.animation.j jVar) {
        this.f18779U = jVar;
    }

    public final void Z1(p190t.r rVar) {
        this.f18781W = rVar;
    }

    public final void b2(u.s0.a aVar) {
        this.f18776R = aVar;
    }

    public final void c2(u.s0.a aVar) {
        this.f18775Q = aVar;
    }

    public final void d2(u.s0.a aVar) {
        this.f18777S = aVar;
    }

    public final void e2(p200u.s0 s0Var) {
        this.f18774P = s0Var;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        V.G1 g1A;
        V.G1 g1A2;
        if (this.f18774P.i() == this.f18774P.p()) {
            this.f18785a0 = null;
        } else if (this.f18785a0 == null) {
            p071h0.c cVarT1 = T1();
            if (cVarT1 == null) {
                cVarT1 = p071h0.c.f45778a.o();
            }
            this.f18785a0 = cVarT1;
        }
        if (m6.A0()) {
            D0.X xU = g6.U(j6);
            long jA = Y0.u.a(xU.I0(), xU.w0());
            this.f18783Y = jA;
            a2(j6);
            return D0.L.b(m6, Y0.t.g(jA), Y0.t.f(jA), null, new androidx.compose.animation.g.b(xU), 4, null);
        }
        if (!((java.lang.Boolean) this.f18780V.b()).booleanValue()) {
            D0.X xU2 = g6.U(j6);
            return D0.L.b(m6, xU2.I0(), xU2.w0(), null, new androidx.compose.animation.g.d(xU2), 4, null);
        }
        p237x7.l lVarA = this.f18781W.a();
        D0.X xU3 = g6.U(j6);
        long jA2 = Y0.u.a(xU3.I0(), xU3.w0());
        long j10 = p190t.g.b(this.f18783Y) ? this.f18783Y : jA2;
        u.s0.a aVar = this.f18775Q;
        V.G1 g1A3 = aVar != null ? aVar.a(this.f18786b0, new androidx.compose.animation.g.e(j10)) : null;
        if (g1A3 != null) {
            jA2 = ((Y0.t) g1A3.getValue()).j();
        }
        long jF = Y0.c.f(j6, jA2);
        u.s0.a aVar2 = this.f18776R;
        long jA3 = (aVar2 == null || (g1A2 = aVar2.a(androidx.compose.animation.g.f.f18797D, new androidx.compose.animation.g.C0354g(j10))) == null) ? Y0.p.f16221b.a() : ((Y0.p) g1A2.getValue()).n();
        u.s0.a aVar3 = this.f18777S;
        long jA4 = (aVar3 == null || (g1A = aVar3.a(this.f18787c0, new androidx.compose.animation.g.h(j10))) == null) ? Y0.p.f16221b.a() : ((Y0.p) g1A.getValue()).n();
        p071h0.c cVar = this.f18785a0;
        return D0.L.b(m6, Y0.t.g(jF), Y0.t.f(jF), null, new androidx.compose.animation.g.c(xU3, Y0.p.l(cVar != null ? cVar.a(j10, jF, Y0.v.Ltr) : Y0.p.f16221b.a(), jA4), jA3, lVarA), 4, null);
    }

    public final long f2(p190t.m mVar, long j6) {
        p237x7.l lVarD;
        int i6 = androidx.compose.animation.g.a.f18788a[mVar.ordinal()];
        if (i6 == 1) {
            return j6;
        }
        if (i6 == 2) {
            p190t.i iVarA = this.f18778T.b().a();
            if (iVarA == null || (lVarD = iVarA.d()) == null) {
                return j6;
            }
        } else {
            if (i6 != 3) {
                throw new p087i7.s();
            }
            p190t.i iVarA2 = this.f18779U.b().a();
            if (iVarA2 == null || (lVarD = iVarA2.d()) == null) {
                return j6;
            }
        }
        return ((Y0.t) lVarD.l(Y0.t.b(j6))).j();
    }

    public final long g2(p190t.m mVar, long j6) {
        p237x7.l lVarB;
        p237x7.l lVarB2;
        p190t.y yVarF = this.f18778T.b().f();
        long jA = (yVarF == null || (lVarB2 = yVarF.b()) == null) ? Y0.p.f16221b.a() : ((Y0.p) lVarB2.l(Y0.t.b(j6))).n();
        p190t.y yVarF2 = this.f18779U.b().f();
        long jA2 = (yVarF2 == null || (lVarB = yVarF2.b()) == null) ? Y0.p.f16221b.a() : ((Y0.p) lVarB.l(Y0.t.b(j6))).n();
        int i6 = androidx.compose.animation.g.a.f18788a[mVar.ordinal()];
        if (i6 == 1) {
            return Y0.p.f16221b.a();
        }
        if (i6 == 2) {
            return jA;
        }
        if (i6 == 3) {
            return jA2;
        }
        throw new p087i7.s();
    }

    public final long h2(p190t.m mVar, long j6) {
        int i6;
        if (this.f18785a0 != null && T1() != null && !p247y7.AbstractC7350t.b(this.f18785a0, T1()) && (i6 = androidx.compose.animation.g.a.f18788a[mVar.ordinal()]) != 1 && i6 != 2) {
            if (i6 != 3) {
                throw new p087i7.s();
            }
            p190t.i iVarA = this.f18779U.b().a();
            if (iVarA != null) {
                long j10 = ((Y0.t) iVarA.d().l(Y0.t.b(j6))).j();
                p071h0.c cVarT1 = T1();
                p247y7.AbstractC7350t.c(cVarT1);
                Y0.v vVar = Y0.v.Ltr;
                long jA = cVarT1.a(j6, j10, vVar);
                p071h0.c cVar = this.f18785a0;
                p247y7.AbstractC7350t.c(cVar);
                return Y0.p.k(jA, cVar.a(j6, j10, vVar));
            }
        }
        return Y0.p.f16221b.a();
    }
}
