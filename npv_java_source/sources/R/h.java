package R;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p131n0.g f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Float f9189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p131n0.g f9190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p200u.C7157a f9191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p200u.C7157a f9192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p200u.C7157a f9193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final W8.InterfaceC1813v f9194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V.InterfaceC1753w0 f9195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final V.InterfaceC1753w0 f9196k;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f9197F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f9198G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f9200I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f9198G = obj;
            this.f9200I |= Integer.MIN_VALUE;
            return R.h.this.d(this);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9201G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f9202H;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f9204G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ R.h f9205H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(R.h hVar, p127m7.e eVar) {
                super(2, eVar);
                this.f9205H = hVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f9204G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p200u.C7157a c7157a = this.f9205H.f9191f;
                    java.lang.Float fB = p147o7.b.b(1.0f);
                    p200u.w0 w0VarL = p200u.AbstractC7177k.l(75, 0, p200u.H.e(), 2, null);
                    this.f9204G = 1;
                    if (p200u.C7157a.f(c7157a, fB, w0VarL, null, null, this, 12, null) == objG) {
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
                return ((R.h.b.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new R.h.b.a(this.f9205H, eVar);
            }
        }

        /* JADX INFO: renamed from: R.h$b$b, reason: collision with other inner class name */
        static final class C0212b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f9206G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ R.h f9207H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0212b(R.h hVar, p127m7.e eVar) {
                super(2, eVar);
                this.f9207H = hVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f9206G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p200u.C7157a c7157a = this.f9207H.f9192g;
                    java.lang.Float fB = p147o7.b.b(1.0f);
                    p200u.w0 w0VarL = p200u.AbstractC7177k.l(225, 0, p200u.H.d(), 2, null);
                    this.f9206G = 1;
                    if (p200u.C7157a.f(c7157a, fB, w0VarL, null, null, this, 12, null) == objG) {
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
                return ((R.h.b.C0212b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new R.h.b.C0212b(this.f9207H, eVar);
            }
        }

        static final class c extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f9208G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ R.h f9209H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(R.h hVar, p127m7.e eVar) {
                super(2, eVar);
                this.f9209H = hVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f9208G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p200u.C7157a c7157a = this.f9209H.f9193h;
                    java.lang.Float fB = p147o7.b.b(1.0f);
                    p200u.w0 w0VarL = p200u.AbstractC7177k.l(225, 0, p200u.H.e(), 2, null);
                    this.f9208G = 1;
                    if (p200u.C7157a.f(c7157a, fB, w0VarL, null, null, this, 12, null) == objG) {
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
                return ((R.h.b.c) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new R.h.b.c(this.f9209H, eVar);
            }
        }

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f9201G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            W8.N n6 = (W8.N) this.f9202H;
            W8.AbstractC1788i.d(n6, null, null, new R.h.b.a(R.h.this, null), 3, null);
            W8.AbstractC1788i.d(n6, null, null, new R.h.b.C0212b(R.h.this, null), 3, null);
            return W8.AbstractC1788i.d(n6, null, null, new R.h.b.c(R.h.this, null), 3, null);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((R.h.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            R.h.b bVar = R.h.this.new b(eVar);
            bVar.f9202H = obj;
            return bVar;
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9210G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f9211H;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f9213G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ R.h f9214H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(R.h hVar, p127m7.e eVar) {
                super(2, eVar);
                this.f9214H = hVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f9213G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p200u.C7157a c7157a = this.f9214H.f9191f;
                    java.lang.Float fB = p147o7.b.b(0.0f);
                    p200u.w0 w0VarL = p200u.AbstractC7177k.l(150, 0, p200u.H.e(), 2, null);
                    this.f9213G = 1;
                    if (p200u.C7157a.f(c7157a, fB, w0VarL, null, null, this, 12, null) == objG) {
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
                return ((R.h.c.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new R.h.c.a(this.f9214H, eVar);
            }
        }

        c(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f9210G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return W8.AbstractC1788i.d((W8.N) this.f9211H, null, null, new R.h.c.a(R.h.this, null), 3, null);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((R.h.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            R.h.c cVar = R.h.this.new c(eVar);
            cVar.f9211H = obj;
            return cVar;
        }
    }

    private h(p131n0.g gVar, float f6, boolean z6) {
        this.f9186a = gVar;
        this.f9187b = f6;
        this.f9188c = z6;
        this.f9191f = p200u.AbstractC7159b.b(0.0f, 0.0f, 2, null);
        this.f9192g = p200u.AbstractC7159b.b(0.0f, 0.0f, 2, null);
        this.f9193h = p200u.AbstractC7159b.b(0.0f, 0.0f, 2, null);
        this.f9194i = W8.AbstractC1817x.a(null);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f9195j = V.A1.d(bool, null, 2, null);
        this.f9196k = V.A1.d(bool, null, 2, null);
    }

    public /* synthetic */ h(p131n0.g gVar, float f6, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, f6, z6);
    }

    private final java.lang.Object f(p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new R.h.b(null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }

    private final java.lang.Object g(p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new R.h.c(null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }

    private final boolean i() {
        return ((java.lang.Boolean) this.f9196k.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((java.lang.Boolean) this.f9195j.getValue()).booleanValue();
    }

    private final void k(boolean z6) {
        this.f9196k.setValue(java.lang.Boolean.valueOf(z6));
    }

    private final void l(boolean z6) {
        this.f9195j.setValue(java.lang.Boolean.valueOf(z6));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p127m7.e eVar) {
        R.h.a aVar;
        R.h hVar;
        if (eVar instanceof R.h.a) {
            aVar = (R.h.a) eVar;
            int i6 = aVar.f9200I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f9200I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new R.h.a(eVar);
            }
        } else {
            aVar = new R.h.a(eVar);
        }
        java.lang.Object obj = aVar.f9198G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f9200I;
        if (i10 != 0) {
            if (i10 == 1) {
                hVar = (R.h) aVar.f9197F;
                p087i7.x.b(obj);
            } else if (i10 == 2) {
                hVar = (R.h) aVar.f9197F;
                p087i7.x.b(obj);
                aVar.f9197F = null;
                aVar.f9200I = 3;
                if (hVar.g(aVar) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }
        p087i7.x.b(obj);
        aVar.f9197F = this;
        aVar.f9200I = 1;
        if (f(aVar) == objG) {
            return objG;
        }
        hVar = this;
        hVar.l(true);
        W8.InterfaceC1813v interfaceC1813v = hVar.f9194i;
        aVar.f9197F = hVar;
        aVar.f9200I = 2;
        if (interfaceC1813v.d1(aVar) == objG) {
            return objG;
        }
        aVar.f9197F = null;
        aVar.f9200I = 3;
        if (hVar.g(aVar) == objG) {
            return objG;
        }
        return p087i7.M.f46721a;
    }

    public final void e(p161q0.g gVar, long j6) {
        if (this.f9189d == null) {
            this.f9189d = java.lang.Float.valueOf(R.i.b(gVar.i()));
        }
        if (this.f9186a == null) {
            this.f9186a = p131n0.g.d(gVar.W0());
        }
        if (this.f9190e == null) {
            this.f9190e = p131n0.g.d(p131n0.h.a(p131n0.m.i(gVar.i()) / 2.0f, p131n0.m.g(gVar.i()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? ((java.lang.Number) this.f9191f.m()).floatValue() : 1.0f;
        java.lang.Float f6 = this.f9189d;
        p247y7.AbstractC7350t.c(f6);
        float fB = p002a1.b.b(f6.floatValue(), this.f9187b, ((java.lang.Number) this.f9192g.m()).floatValue());
        p131n0.g gVar2 = this.f9186a;
        p247y7.AbstractC7350t.c(gVar2);
        float fM = p131n0.g.m(gVar2.v());
        p131n0.g gVar3 = this.f9190e;
        p247y7.AbstractC7350t.c(gVar3);
        float fB2 = p002a1.b.b(fM, p131n0.g.m(gVar3.v()), ((java.lang.Number) this.f9193h.m()).floatValue());
        p131n0.g gVar4 = this.f9186a;
        p247y7.AbstractC7350t.c(gVar4);
        float fN = p131n0.g.n(gVar4.v());
        p131n0.g gVar5 = this.f9190e;
        p247y7.AbstractC7350t.c(gVar5);
        long jA = p131n0.h.a(fB2, p002a1.b.b(fN, p131n0.g.n(gVar5.v()), ((java.lang.Number) this.f9193h.m()).floatValue()));
        long jM = p141o0.C7016y0.m(j6, p141o0.C7016y0.p(j6) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f9188c) {
            p161q0.f.e(gVar, jM, fB, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fI = p131n0.m.i(gVar.i());
        float fG = p131n0.m.g(gVar.i());
        int iB = p141o0.AbstractC7013x0.f52260a.b();
        p161q0.d dVarF0 = gVar.F0();
        long jI = dVarF0.i();
        dVarF0.h().m();
        try {
            dVarF0.c().c(0.0f, 0.0f, fI, fG, iB);
            p161q0.f.e(gVar, jM, fB, jA, 0.0f, null, null, 0, 120, null);
        } finally {
            dVarF0.h().s();
            dVarF0.d(jI);
        }
    }

    public final void h() {
        k(true);
        this.f9194i.R0(p087i7.M.f46721a);
    }
}
