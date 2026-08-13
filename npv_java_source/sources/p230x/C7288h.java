package p230x;

/* JADX INFO: renamed from: x.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7288h extends androidx.compose.ui.d.c implements E.c, F0.C, F0.InterfaceC0921h {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p230x.s f56459P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p230x.C f56460Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f56461R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p230x.InterfaceC7286f f56462S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final boolean f56463T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private D0.InterfaceC0900t f56465V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p131n0.i f56466W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f56467X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f56469Z;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p230x.C7284d f56464U = new p230x.C7284d();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f56468Y = Y0.t.f16230b.a();

    /* JADX INFO: renamed from: x.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p237x7.a f56470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final W8.InterfaceC1794l f56471b;

        public a(p237x7.a aVar, W8.InterfaceC1794l interfaceC1794l) {
            this.f56470a = aVar;
            this.f56471b = interfaceC1794l;
        }

        public final W8.InterfaceC1794l a() {
            return this.f56471b;
        }

        public final p237x7.a b() {
            return this.f56470a;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0050  */
        public java.lang.String toString() {
            java.lang.String str;
            W8.M m6 = (W8.M) this.f56471b.getContext().i(W8.M.f15458E);
            java.lang.String strT1 = m6 != null ? m6.t1() : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Request@");
            java.lang.String string = java.lang.Integer.toString(hashCode(), S8.AbstractC1628a.a(16));
            p247y7.AbstractC7350t.e(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            if (strT1 != null) {
                str = '[' + strT1 + "](";
                if (str == null) {
                    str = "(";
                }
            } else {
                str = "(";
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.f56470a.b());
            sb.append(", continuation=");
            sb.append(this.f56471b);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: x.h$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56472a;

        static {
            int[] iArr = new int[p230x.s.values().length];
            try {
                iArr[p230x.s.Vertical.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p230x.s.Horizontal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f56472a = iArr;
        }
    }

    /* JADX INFO: renamed from: x.h$c */
    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56473G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56474H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p230x.I f56476J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p230x.InterfaceC7286f f56477K;

        /* JADX INFO: renamed from: x.h$c$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f56478G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f56479H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p230x.I f56480I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p230x.C7288h f56481J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p230x.InterfaceC7286f f56482K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ W8.InterfaceC1822z0 f56483L;

            /* JADX INFO: renamed from: x.h$c$a$a, reason: collision with other inner class name */
            static final class C0748a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ p230x.C7288h f56484D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ p230x.I f56485E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ W8.InterfaceC1822z0 f56486F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                final /* synthetic */ p230x.r f56487G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0748a(p230x.C7288h c7288h, p230x.I i6, W8.InterfaceC1822z0 interfaceC1822z0, p230x.r rVar) {
                    super(1);
                    this.f56484D = c7288h;
                    this.f56485E = i6;
                    this.f56486F = interfaceC1822z0;
                    this.f56487G = rVar;
                }

                public final void a(float f6) {
                    float f10 = this.f56484D.f56461R ? 1.0f : -1.0f;
                    p230x.C c6 = this.f56484D.f56460Q;
                    float fA = f10 * c6.A(c6.u(this.f56487G.b(c6.u(c6.B(f10 * f6)), p241y0.f.f57150a.b())));
                    if (java.lang.Math.abs(fA) < java.lang.Math.abs(f6)) {
                        W8.D0.e(this.f56486F, "Scroll animation cancelled because scroll was not consumed (" + fA + " < " + f6 + ')', null, 2, null);
                    }
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a(((java.lang.Number) obj).floatValue());
                    return p087i7.M.f46721a;
                }
            }

            /* JADX INFO: renamed from: x.h$c$a$b */
            static final class b extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ p230x.C7288h f56488D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ p230x.I f56489E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ p230x.InterfaceC7286f f56490F;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(p230x.C7288h c7288h, p230x.I i6, p230x.InterfaceC7286f interfaceC7286f) {
                    super(0);
                    this.f56488D = c7288h;
                    this.f56489E = i6;
                    this.f56490F = interfaceC7286f;
                }

                public final void a() {
                    p230x.C7284d c7284d = this.f56488D.f56464U;
                    p230x.C7288h c7288h = this.f56488D;
                    while (true) {
                        if (!c7284d.f56446a.x()) {
                            break;
                        }
                        p131n0.i iVar = (p131n0.i) ((p230x.C7288h.a) c7284d.f56446a.y()).b().b();
                        if (!(iVar == null ? true : p230x.C7288h.l2(c7288h, iVar, 0L, 1, null))) {
                            break;
                        } else {
                            ((p230x.C7288h.a) c7284d.f56446a.D(c7284d.f56446a.t() - 1)).a().t(p087i7.w.b(p087i7.M.f46721a));
                        }
                    }
                    if (this.f56488D.f56467X) {
                        p131n0.i iVarI2 = this.f56488D.i2();
                        if (iVarI2 != null && p230x.C7288h.l2(this.f56488D, iVarI2, 0L, 1, null)) {
                            this.f56488D.f56467X = false;
                        }
                    }
                    this.f56489E.j(this.f56488D.d2(this.f56490F));
                }

                @Override // p237x7.a
                public /* bridge */ /* synthetic */ java.lang.Object b() {
                    a();
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p230x.I i6, p230x.C7288h c7288h, p230x.InterfaceC7286f interfaceC7286f, W8.InterfaceC1822z0 interfaceC1822z0, p127m7.e eVar) {
                super(2, eVar);
                this.f56480I = i6;
                this.f56481J = c7288h;
                this.f56482K = interfaceC7286f;
                this.f56483L = interfaceC1822z0;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f56478G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p230x.r rVar = (p230x.r) this.f56479H;
                    this.f56480I.j(this.f56481J.d2(this.f56482K));
                    p230x.I i10 = this.f56480I;
                    p230x.C7288h.c.a.C0748a c0748a = new p230x.C7288h.c.a.C0748a(this.f56481J, i10, this.f56483L, rVar);
                    p230x.C7288h.c.a.b bVar = new p230x.C7288h.c.a.b(this.f56481J, this.f56480I, this.f56482K);
                    this.f56478G = 1;
                    if (i10.h(c0748a, bVar, this) == objG) {
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
            public final java.lang.Object u(p230x.r rVar, p127m7.e eVar) {
                return ((p230x.C7288h.c.a) x(rVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p230x.C7288h.c.a aVar = new p230x.C7288h.c.a(this.f56480I, this.f56481J, this.f56482K, this.f56483L, eVar);
                aVar.f56479H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p230x.I i6, p230x.InterfaceC7286f interfaceC7286f, p127m7.e eVar) {
            super(2, eVar);
            this.f56476J = i6;
            this.f56477K = interfaceC7286f;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56473G;
            try {
                try {
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        W8.InterfaceC1822z0 interfaceC1822z0M = W8.C0.m(((W8.N) this.f56474H).getCoroutineContext());
                        p230x.C7288h.this.f56469Z = true;
                        p230x.C c6 = p230x.C7288h.this.f56460Q;
                        p210v.L l6 = p210v.L.Default;
                        p230x.C7288h.c.a aVar = new p230x.C7288h.c.a(this.f56476J, p230x.C7288h.this, this.f56477K, interfaceC1822z0M, null);
                        this.f56473G = 1;
                        if (c6.v(l6, aVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    p230x.C7288h.this.f56464U.d();
                    p230x.C7288h.this.f56469Z = false;
                    p230x.C7288h.this.f56464U.b(null);
                    p230x.C7288h.this.f56467X = false;
                    return p087i7.M.f46721a;
                } catch (java.util.concurrent.CancellationException e6) {
                    throw e6;
                }
            } catch (java.lang.Throwable th) {
                p230x.C7288h.this.f56469Z = false;
                p230x.C7288h.this.f56464U.b(null);
                p230x.C7288h.this.f56467X = false;
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p230x.C7288h.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p230x.C7288h.c cVar = p230x.C7288h.this.new c(this.f56476J, this.f56477K, eVar);
            cVar.f56474H = obj;
            return cVar;
        }
    }

    public C7288h(p230x.s sVar, p230x.C c6, boolean z6, p230x.InterfaceC7286f interfaceC7286f) {
        this.f56459P = sVar;
        this.f56460Q = c6;
        this.f56461R = z6;
        this.f56462S = interfaceC7286f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float d2(p230x.InterfaceC7286f interfaceC7286f) {
        float fL;
        float fE;
        float fG;
        if (Y0.t.e(this.f56468Y, Y0.t.f16230b.a())) {
            return 0.0f;
        }
        p131n0.i iVarH2 = h2();
        if (iVarH2 == null) {
            iVarH2 = this.f56467X ? i2() : null;
            if (iVarH2 == null) {
                return 0.0f;
            }
        }
        long jD = Y0.u.d(this.f56468Y);
        int i6 = p230x.C7288h.b.f56472a[this.f56459P.ordinal()];
        if (i6 == 1) {
            fL = iVarH2.l();
            fE = iVarH2.e() - iVarH2.l();
            fG = p131n0.m.g(jD);
        } else {
            if (i6 != 2) {
                throw new p087i7.s();
            }
            fL = iVarH2.i();
            fE = iVarH2.j() - iVarH2.i();
            fG = p131n0.m.i(jD);
        }
        return interfaceC7286f.a(fL, fE, fG);
    }

    private final int e2(long j6, long j10) {
        int iF;
        int iF2;
        int i6 = p230x.C7288h.b.f56472a[this.f56459P.ordinal()];
        if (i6 == 1) {
            iF = Y0.t.f(j6);
            iF2 = Y0.t.f(j10);
        } else {
            if (i6 != 2) {
                throw new p087i7.s();
            }
            iF = Y0.t.g(j6);
            iF2 = Y0.t.g(j10);
        }
        return p247y7.AbstractC7350t.g(iF, iF2);
    }

    private final int f2(long j6, long j10) {
        float fG;
        float fG2;
        int i6 = p230x.C7288h.b.f56472a[this.f56459P.ordinal()];
        if (i6 == 1) {
            fG = p131n0.m.g(j6);
            fG2 = p131n0.m.g(j10);
        } else {
            if (i6 != 2) {
                throw new p087i7.s();
            }
            fG = p131n0.m.i(j6);
            fG2 = p131n0.m.i(j10);
        }
        return java.lang.Float.compare(fG, fG2);
    }

    private final p131n0.i g2(p131n0.i iVar, long j6) {
        return iVar.t(p131n0.g.u(o2(iVar, j6)));
    }

    private final p131n0.i h2() {
        X.b bVar = this.f56464U.f56446a;
        int iT = bVar.t();
        p131n0.i iVar = null;
        if (iT > 0) {
            int i6 = iT - 1;
            java.lang.Object[] objArrS = bVar.s();
            do {
                p131n0.i iVar2 = (p131n0.i) ((p230x.C7288h.a) objArrS[i6]).b().b();
                if (iVar2 != null) {
                    if (f2(iVar2.k(), Y0.u.d(this.f56468Y)) > 0) {
                        return iVar == null ? iVar2 : iVar;
                    }
                    iVar = iVar2;
                }
                i6--;
            } while (i6 >= 0);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p131n0.i i2() {
        if (!A1()) {
            return null;
        }
        D0.InterfaceC0900t interfaceC0900tK = F0.AbstractC0925k.k(this);
        D0.InterfaceC0900t interfaceC0900t = this.f56465V;
        if (interfaceC0900t != null) {
            if (!interfaceC0900t.K()) {
                interfaceC0900t = null;
            }
            if (interfaceC0900t != null) {
                return interfaceC0900tK.N(interfaceC0900t, false);
            }
        }
        return null;
    }

    private final boolean k2(p131n0.i iVar, long j6) {
        long jO2 = o2(iVar, j6);
        return java.lang.Math.abs(p131n0.g.m(jO2)) <= 0.5f && java.lang.Math.abs(p131n0.g.n(jO2)) <= 0.5f;
    }

    static /* synthetic */ boolean l2(p230x.C7288h c7288h, p131n0.i iVar, long j6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            j6 = c7288h.f56468Y;
        }
        return c7288h.k2(iVar, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2() {
        p230x.InterfaceC7286f interfaceC7286fP2 = p2();
        if (!(!this.f56469Z)) {
            throw new java.lang.IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        W8.AbstractC1788i.d(t1(), null, W8.P.UNDISPATCHED, new p230x.C7288h.c(new p230x.I(interfaceC7286fP2.b()), interfaceC7286fP2, null), 1, null);
    }

    private final long o2(p131n0.i iVar, long j6) {
        long jD = Y0.u.d(j6);
        int i6 = p230x.C7288h.b.f56472a[this.f56459P.ordinal()];
        if (i6 == 1) {
            return p131n0.h.a(0.0f, p2().a(iVar.l(), iVar.e() - iVar.l(), p131n0.m.g(jD)));
        }
        if (i6 == 2) {
            return p131n0.h.a(p2().a(iVar.i(), iVar.j() - iVar.i(), p131n0.m.i(jD)), 0.0f);
        }
        throw new p087i7.s();
    }

    private final p230x.InterfaceC7286f p2() {
        p230x.InterfaceC7286f interfaceC7286f = this.f56462S;
        return interfaceC7286f == null ? (p230x.InterfaceC7286f) F0.AbstractC0923i.a(this, p230x.AbstractC7287g.a()) : interfaceC7286f;
    }

    @Override // F0.C
    public void M(long j6) {
        p131n0.i iVarI2;
        long j10 = this.f56468Y;
        this.f56468Y = j6;
        if (e2(j6, j10) < 0 && (iVarI2 = i2()) != null) {
            p131n0.i iVar = this.f56466W;
            if (iVar == null) {
                iVar = iVarI2;
            }
            if (!this.f56469Z && !this.f56467X && k2(iVar, j10) && !k2(iVarI2, j6)) {
                this.f56467X = true;
                m2();
            }
            this.f56466W = iVarI2;
        }
    }

    @Override // E.c
    public p131n0.i T(p131n0.i iVar) {
        if (!Y0.t.e(this.f56468Y, Y0.t.f16230b.a())) {
            return g2(iVar, this.f56468Y);
        }
        throw new java.lang.IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // E.c
    public java.lang.Object Z(p237x7.a aVar, p127m7.e eVar) {
        p131n0.i iVar = (p131n0.i) aVar.b();
        if (iVar == null || l2(this, iVar, 0L, 1, null)) {
            return p087i7.M.f46721a;
        }
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        if (this.f56464U.c(new p230x.C7288h.a(aVar, c1798n)) && !this.f56469Z) {
            m2();
        }
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    public final long j2() {
        return this.f56468Y;
    }

    @Override // F0.C
    public /* synthetic */ void m1(D0.InterfaceC0900t interfaceC0900t) {
        F0.B.a(this, interfaceC0900t);
    }

    public final void n2(D0.InterfaceC0900t interfaceC0900t) {
        this.f56465V = interfaceC0900t;
    }

    public final void q2(p230x.s sVar, boolean z6, p230x.InterfaceC7286f interfaceC7286f) {
        this.f56459P = sVar;
        this.f56461R = z6;
        this.f56462S = interfaceC7286f;
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f56463T;
    }
}
