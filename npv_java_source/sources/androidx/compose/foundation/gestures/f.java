package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
final class f extends androidx.compose.foundation.gestures.b implements F0.i0, F0.InterfaceC0921h, p121m0.j, p231x0.e, F0.z0 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p210v.T f19108a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private p230x.p f19109b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final boolean f19110c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final p241y0.c f19111d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final p230x.x f19112e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final p230x.j f19113f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final p230x.C f19114g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final androidx.compose.foundation.gestures.e f19115h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final p230x.C7288h f19116i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private p230x.v f19117j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private p237x7.p f19118k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private p237x7.p f19119l0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(D0.InterfaceC0900t interfaceC0900t) {
            androidx.compose.foundation.gestures.f.this.f19116i0.n2(interfaceC0900t);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.InterfaceC0900t) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19121G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19122H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f19123I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p230x.C f19124J;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p230x.r f19125D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p230x.C f19126E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p230x.r rVar, p230x.C c6) {
                super(1);
                this.f19125D = rVar;
                this.f19126E = c6;
            }

            public final void a(androidx.compose.foundation.gestures.a.b bVar) {
                this.f19125D.a(this.f19126E.x(bVar.a()), p241y0.f.f57150a.b());
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((androidx.compose.foundation.gestures.a.b) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.p pVar, p230x.C c6, p127m7.e eVar) {
            super(2, eVar);
            this.f19123I = pVar;
            this.f19124J = c6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19121G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.r rVar = (p230x.r) this.f19122H;
                p237x7.p pVar = this.f19123I;
                androidx.compose.foundation.gestures.f.b.a aVar = new androidx.compose.foundation.gestures.f.b.a(rVar, this.f19124J);
                this.f19121G = 1;
                if (pVar.u(aVar, this) == objG) {
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
            return ((androidx.compose.foundation.gestures.f.b) x(rVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.f.b bVar = new androidx.compose.foundation.gestures.f.b(this.f19123I, this.f19124J, eVar);
            bVar.f19122H = obj;
            return bVar;
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19127G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f19129I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f19129I = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19127G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.C c6 = androidx.compose.foundation.gestures.f.this.f19114g0;
                long j6 = this.f19129I;
                this.f19127G = 1;
                if (c6.q(j6, this) == objG) {
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
            return ((androidx.compose.foundation.gestures.f.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.foundation.gestures.f.this.new c(this.f19129I, eVar);
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19130G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f19132I;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19133G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f19134H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ long f19135I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j6, p127m7.e eVar) {
                super(2, eVar);
                this.f19135I = j6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f19133G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                ((p230x.r) this.f19134H).b(this.f19135I, p241y0.f.f57150a.b());
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p230x.r rVar, p127m7.e eVar) {
                return ((androidx.compose.foundation.gestures.f.d.a) x(rVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                androidx.compose.foundation.gestures.f.d.a aVar = new androidx.compose.foundation.gestures.f.d.a(this.f19135I, eVar);
                aVar.f19134H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f19132I = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19130G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.C c6 = androidx.compose.foundation.gestures.f.this.f19114g0;
                p210v.L l6 = p210v.L.UserInput;
                androidx.compose.foundation.gestures.f.d.a aVar = new androidx.compose.foundation.gestures.f.d.a(this.f19132I, null);
                this.f19130G = 1;
                if (c6.v(l6, aVar, this) == objG) {
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
            return ((androidx.compose.foundation.gestures.f.d) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.foundation.gestures.f.this.new d(this.f19132I, eVar);
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19136G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f19138I;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19139G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f19140H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ long f19141I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j6, p127m7.e eVar) {
                super(2, eVar);
                this.f19141I = j6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f19139G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                ((p230x.r) this.f19140H).b(this.f19141I, p241y0.f.f57150a.b());
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p230x.r rVar, p127m7.e eVar) {
                return ((androidx.compose.foundation.gestures.f.e.a) x(rVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                androidx.compose.foundation.gestures.f.e.a aVar = new androidx.compose.foundation.gestures.f.e.a(this.f19141I, eVar);
                aVar.f19140H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f19138I = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19136G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.C c6 = androidx.compose.foundation.gestures.f.this.f19114g0;
                p210v.L l6 = p210v.L.UserInput;
                androidx.compose.foundation.gestures.f.e.a aVar = new androidx.compose.foundation.gestures.f.e.a(this.f19138I, null);
                this.f19136G = 1;
                if (c6.v(l6, aVar, this) == objG) {
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
            return ((androidx.compose.foundation.gestures.f.e) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return androidx.compose.foundation.gestures.f.this.new e(this.f19138I, eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$f, reason: collision with other inner class name */
    static final class C0366f extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$f$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19143G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.f f19144H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ float f19145I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ float f19146J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.gestures.f fVar, float f6, float f10, p127m7.e eVar) {
                super(2, eVar);
                this.f19144H = fVar;
                this.f19145I = f6;
                this.f19146J = f10;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f19143G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p230x.C c6 = this.f19144H.f19114g0;
                    long jA = p131n0.h.a(this.f19145I, this.f19146J);
                    this.f19143G = 1;
                    if (androidx.compose.foundation.gestures.d.j(c6, jA, this) == objG) {
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
                return ((androidx.compose.foundation.gestures.f.C0366f.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new androidx.compose.foundation.gestures.f.C0366f.a(this.f19144H, this.f19145I, this.f19146J, eVar);
            }
        }

        C0366f() {
            super(2);
        }

        public final java.lang.Boolean a(float f6, float f10) {
            W8.AbstractC1788i.d(androidx.compose.foundation.gestures.f.this.t1(), null, null, new androidx.compose.foundation.gestures.f.C0366f.a(androidx.compose.foundation.gestures.f.this, f6, f10, null), 3, null);
            return java.lang.Boolean.TRUE;
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return a(((java.lang.Number) obj).floatValue(), ((java.lang.Number) obj2).floatValue());
        }
    }

    static final class g extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19147G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ long f19148H;

        g(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19147G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                long j6 = this.f19148H;
                p230x.C c6 = androidx.compose.foundation.gestures.f.this.f19114g0;
                this.f19147G = 1;
                obj = androidx.compose.foundation.gestures.d.j(c6, j6, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        public final java.lang.Object H(long j6, p127m7.e eVar) {
            return ((androidx.compose.foundation.gestures.f.g) x(p131n0.g.d(j6), eVar)).B(p087i7.M.f46721a);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return H(((p131n0.g) obj).v(), (p127m7.e) obj2);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.f.g gVar = androidx.compose.foundation.gestures.f.this.new g(eVar);
            gVar.f19148H = ((p131n0.g) obj).v();
            return gVar;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {
        h() {
            super(0);
        }

        public final void a() {
            androidx.compose.foundation.gestures.f.this.f19113f0.e(p190t.z.c((Y0.e) F0.AbstractC0923i.a(androidx.compose.foundation.gestures.f.this, androidx.compose.ui.platform.AbstractC1966p0.e())));
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public f(p230x.A a6, p210v.T t6, p230x.p pVar, p230x.s sVar, boolean z6, boolean z10, p250z.l lVar, p230x.InterfaceC7286f interfaceC7286f) {
        super(androidx.compose.foundation.gestures.d.f19085a, z6, lVar, sVar);
        this.f19108a0 = t6;
        this.f19109b0 = pVar;
        p241y0.c cVar = new p241y0.c();
        this.f19111d0 = cVar;
        this.f19112e0 = (p230x.x) T1(new p230x.x(z6));
        p230x.j jVar = new p230x.j(p190t.z.c(androidx.compose.foundation.gestures.d.f19088d), null, 2, null);
        this.f19113f0 = jVar;
        p210v.T t10 = this.f19108a0;
        p230x.p pVar2 = this.f19109b0;
        p230x.C c6 = new p230x.C(a6, t10, pVar2 == null ? jVar : pVar2, sVar, z10, cVar);
        this.f19114g0 = c6;
        androidx.compose.foundation.gestures.e eVar = new androidx.compose.foundation.gestures.e(c6, z6);
        this.f19115h0 = eVar;
        p230x.C7288h c7288h = (p230x.C7288h) T1(new p230x.C7288h(sVar, c6, z10, interfaceC7286f));
        this.f19116i0 = c7288h;
        T1(p241y0.e.a(eVar, cVar));
        T1(p121m0.q.a());
        T1(new androidx.compose.foundation.relocation.f(c7288h));
        T1(new p210v.D(new androidx.compose.foundation.gestures.f.a()));
    }

    private final void B2() {
        F0.j0.a(this, new androidx.compose.foundation.gestures.f.h());
    }

    private final void x2() {
        this.f19118k0 = null;
        this.f19119l0 = null;
    }

    private final void y2(p251z0.C7380p c7380p, long j6) {
        java.util.List listC = c7380p.c();
        int size = listC.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!(!((p251z0.B) listC.get(i6)).p())) {
                return;
            }
        }
        p230x.v vVar = this.f19117j0;
        p247y7.AbstractC7350t.c(vVar);
        W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.gestures.f.e(vVar.a(F0.AbstractC0925k.i(this), c7380p, j6), null), 3, null);
        java.util.List listC2 = c7380p.c();
        int size2 = listC2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((p251z0.B) listC2.get(i10)).a();
        }
    }

    private final void z2() {
        this.f19118k0 = new androidx.compose.foundation.gestures.f.C0366f();
        this.f19119l0 = new androidx.compose.foundation.gestures.f.g(null);
    }

    public final void A2(p230x.A a6, p230x.s sVar, p210v.T t6, boolean z6, boolean z10, p230x.p pVar, p250z.l lVar, p230x.InterfaceC7286f interfaceC7286f) {
        boolean z11;
        if (k2() != z6) {
            this.f19115h0.a(z6);
            this.f19112e0.U1(z6);
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        boolean zC = this.f19114g0.C(a6, sVar, t6, z10, pVar == null ? this.f19113f0 : pVar, this.f19111d0);
        this.f19116i0.q2(sVar, z10, interfaceC7286f);
        this.f19108a0 = t6;
        this.f19109b0 = pVar;
        t2(androidx.compose.foundation.gestures.d.f19085a, z6, lVar, this.f19114g0.p() ? p230x.s.Vertical : p230x.s.Horizontal, zC);
        if (z12) {
            x2();
            F0.A0.b(this);
        }
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        B2();
        this.f19117j0 = p230x.AbstractC7283c.a(this);
    }

    @Override // p231x0.e
    public boolean H(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // F0.i0
    public void L0() {
        B2();
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        if (k2() && (this.f19118k0 == null || this.f19119l0 == null)) {
            z2();
        }
        p237x7.p pVar = this.f19118k0;
        if (pVar != null) {
            K0.u.H(wVar, null, pVar, 1, null);
        }
        p237x7.p pVar2 = this.f19119l0;
        if (pVar2 != null) {
            K0.u.I(wVar, pVar2);
        }
    }

    @Override // p121m0.j
    public void Y(androidx.compose.ui.focus.j jVar) {
        jVar.y(false);
    }

    @Override // p231x0.e
    public boolean b0(android.view.KeyEvent keyEvent) {
        long jA;
        if (k2()) {
            long jA2 = p231x0.d.a(keyEvent);
            p231x0.a.C0751a c0751a = p231x0.a.f56741b;
            if ((p231x0.a.p(jA2, c0751a.j()) || p231x0.a.p(p231x0.d.a(keyEvent), c0751a.k())) && p231x0.c.e(p231x0.d.b(keyEvent), p231x0.c.f56893a.a()) && !p231x0.d.e(keyEvent)) {
                if (this.f19114g0.p()) {
                    int iF = Y0.t.f(this.f19116i0.j2());
                    jA = p131n0.h.a(0.0f, p231x0.a.p(p231x0.d.a(keyEvent), c0751a.k()) ? iF : -iF);
                } else {
                    int iG = Y0.t.g(this.f19116i0.j2());
                    jA = p131n0.h.a(p231x0.a.p(p231x0.d.a(keyEvent), c0751a.k()) ? iG : -iG, 0.0f);
                }
                W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.gestures.f.d(jA, null), 3, null);
                return true;
            }
        }
        return false;
    }

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    @Override // androidx.compose.foundation.gestures.b
    public java.lang.Object i2(p237x7.p pVar, p127m7.e eVar) {
        p230x.C c6 = this.f19114g0;
        java.lang.Object objV = c6.v(p210v.L.UserInput, new androidx.compose.foundation.gestures.f.b(pVar, c6, null), eVar);
        return objV == p137n7.b.g() ? objV : p087i7.M.f46721a;
    }

    @Override // F0.z0
    public /* synthetic */ boolean k1() {
        return F0.y0.b(this);
    }

    @Override // androidx.compose.foundation.gestures.b
    public void m2(long j6) {
    }

    @Override // androidx.compose.foundation.gestures.b
    public void n2(long j6) {
        W8.AbstractC1788i.d(this.f19111d0.e(), null, null, new androidx.compose.foundation.gestures.f.c(j6, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public boolean r2() {
        return this.f19114g0.w();
    }

    @Override // androidx.compose.foundation.gestures.b, F0.v0
    public void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        java.util.List listC = c7380p.c();
        int size = listC.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((java.lang.Boolean) j2().l((p251z0.B) listC.get(i6))).booleanValue()) {
                super.w0(c7380p, rVar, j6);
                break;
            }
        }
        if (rVar == p251z0.r.Main && p251z0.AbstractC7383t.i(c7380p.f(), p251z0.AbstractC7383t.f57591a.f())) {
            y2(c7380p, j6);
        }
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f19110c0;
    }
}
