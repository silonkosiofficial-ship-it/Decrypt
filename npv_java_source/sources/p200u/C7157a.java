package p200u;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7157a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.x0 f54780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f54781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f54782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p200u.C7179l f54783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p200u.C7164d0 f54786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p200u.C7180l0 f54787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p200u.r f54788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p200u.r f54789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p200u.r f54790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p200u.r f54791l;

    /* JADX INFO: renamed from: u.a$a, reason: collision with other inner class name */
    static final class C0716a extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f54792G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f54793H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f54794I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54796K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p200u.InterfaceC7165e f54797L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ long f54798M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ p237x7.l f54799N;

        /* JADX INFO: renamed from: u.a$a$a, reason: collision with other inner class name */
        static final class C0717a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p200u.C7157a f54800D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p200u.C7179l f54801E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p237x7.l f54802F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p247y7.K f54803G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0717a(p200u.C7157a c7157a, p200u.C7179l c7179l, p237x7.l lVar, p247y7.K k6) {
                super(1);
                this.f54800D = c7157a;
                this.f54801E = c7179l;
                this.f54802F = lVar;
                this.f54803G = k6;
            }

            public final void a(p200u.C7173i c7173i) {
                p200u.AbstractC7190q0.o(c7173i, this.f54800D.j());
                java.lang.Object objH = this.f54800D.h(c7173i.e());
                if (p247y7.AbstractC7350t.b(objH, c7173i.e())) {
                    p237x7.l lVar = this.f54802F;
                    if (lVar != null) {
                        lVar.l(this.f54800D);
                        return;
                    }
                    return;
                }
                this.f54800D.j().v(objH);
                this.f54801E.v(objH);
                p237x7.l lVar2 = this.f54802F;
                if (lVar2 != null) {
                    lVar2.l(this.f54800D);
                }
                c7173i.a();
                this.f54803G.f57250C = true;
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p200u.C7173i) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0716a(java.lang.Object obj, p200u.InterfaceC7165e interfaceC7165e, long j6, p237x7.l lVar, p127m7.e eVar) {
            super(1, eVar);
            this.f54796K = obj;
            this.f54797L = interfaceC7165e;
            this.f54798M = j6;
            this.f54799N = lVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p200u.C7179l c7179l;
            p247y7.K k6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f54794I;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p200u.C7157a.this.j().w((p200u.r) p200u.C7157a.this.l().a().l(this.f54796K));
                    p200u.C7157a.this.r(this.f54797L.g());
                    p200u.C7157a.this.q(true);
                    p200u.C7179l c7179lH = p200u.AbstractC7181m.h(p200u.C7157a.this.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    p247y7.K k10 = new p247y7.K();
                    p200u.InterfaceC7165e interfaceC7165e = this.f54797L;
                    long j6 = this.f54798M;
                    p200u.C7157a.C0716a.C0717a c0717a = new p200u.C7157a.C0716a.C0717a(p200u.C7157a.this, c7179lH, this.f54799N, k10);
                    this.f54792G = c7179lH;
                    this.f54793H = k10;
                    this.f54794I = 1;
                    if (p200u.AbstractC7190q0.c(c7179lH, interfaceC7165e, j6, c0717a, this) == objG) {
                        return objG;
                    }
                    c7179l = c7179lH;
                    k6 = k10;
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6 = (p247y7.K) this.f54793H;
                    c7179l = (p200u.C7179l) this.f54792G;
                    p087i7.x.b(obj);
                }
                p200u.EnumC7167f enumC7167f = k6.f57250C ? p200u.EnumC7167f.BoundReached : p200u.EnumC7167f.Finished;
                p200u.C7157a.this.i();
                return new p200u.C7171h(c7179l, enumC7167f);
            } catch (java.util.concurrent.CancellationException e6) {
                p200u.C7157a.this.i();
                throw e6;
            }
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((p200u.C7157a.C0716a) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return p200u.C7157a.this.new C0716a(this.f54796K, this.f54797L, this.f54798M, this.f54799N, eVar);
        }
    }

    /* JADX INFO: renamed from: u.a$b */
    static final class b extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f54804G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f54806I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Object obj, p127m7.e eVar) {
            super(1, eVar);
            this.f54806I = obj;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f54804G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            p200u.C7157a.this.i();
            java.lang.Object objH = p200u.C7157a.this.h(this.f54806I);
            p200u.C7157a.this.j().v(objH);
            p200u.C7157a.this.r(objH);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((p200u.C7157a.b) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return p200u.C7157a.this.new b(this.f54806I, eVar);
        }
    }

    public C7157a(java.lang.Object obj, p200u.x0 x0Var, java.lang.Object obj2, java.lang.String str) {
        this.f54780a = x0Var;
        this.f54781b = obj2;
        this.f54782c = str;
        this.f54783d = new p200u.C7179l(x0Var, obj, null, 0L, 0L, false, 60, null);
        this.f54784e = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);
        this.f54785f = V.A1.d(obj, null, 2, null);
        this.f54786g = new p200u.C7164d0();
        this.f54787h = new p200u.C7180l0(0.0f, 0.0f, obj2, 3, null);
        p200u.r rVarO = o();
        p200u.r rVar = rVarO instanceof p200u.C7183n ? p200u.AbstractC7159b.f54815e : rVarO instanceof p200u.C7185o ? p200u.AbstractC7159b.f54816f : rVarO instanceof p200u.C7187p ? p200u.AbstractC7159b.f54817g : p200u.AbstractC7159b.f54818h;
        p247y7.AbstractC7350t.d(rVar, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f54788i = rVar;
        p200u.r rVarO2 = o();
        p200u.r rVar2 = rVarO2 instanceof p200u.C7183n ? p200u.AbstractC7159b.f54811a : rVarO2 instanceof p200u.C7185o ? p200u.AbstractC7159b.f54812b : rVarO2 instanceof p200u.C7187p ? p200u.AbstractC7159b.f54813c : p200u.AbstractC7159b.f54814d;
        p247y7.AbstractC7350t.d(rVar2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f54789j = rVar2;
        this.f54790k = rVar;
        this.f54791l = rVar2;
    }

    public /* synthetic */ C7157a(java.lang.Object obj, p200u.x0 x0Var, java.lang.Object obj2, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(obj, x0Var, (i6 & 4) != 0 ? null : obj2, (i6 & 8) != 0 ? "Animatable" : str);
    }

    public static /* synthetic */ java.lang.Object f(p200u.C7157a c7157a, java.lang.Object obj, p200u.InterfaceC7175j interfaceC7175j, java.lang.Object obj2, p237x7.l lVar, p127m7.e eVar, int i6, java.lang.Object obj3) {
        if ((i6 & 2) != 0) {
            interfaceC7175j = c7157a.f54787h;
        }
        p200u.InterfaceC7175j interfaceC7175j2 = interfaceC7175j;
        if ((i6 & 4) != 0) {
            obj2 = c7157a.n();
        }
        java.lang.Object obj4 = obj2;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        return c7157a.e(obj, interfaceC7175j2, obj4, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object h(java.lang.Object obj) {
        if (p247y7.AbstractC7350t.b(this.f54790k, this.f54788i) && p247y7.AbstractC7350t.b(this.f54791l, this.f54789j)) {
            return obj;
        }
        p200u.r rVar = (p200u.r) this.f54780a.a().l(obj);
        int iB = rVar.b();
        boolean z6 = false;
        for (int i6 = 0; i6 < iB; i6++) {
            if (rVar.a(i6) < this.f54790k.a(i6) || rVar.a(i6) > this.f54791l.a(i6)) {
                rVar.e(i6, E7.j.j(rVar.a(i6), this.f54790k.a(i6), this.f54791l.a(i6)));
                z6 = true;
            }
        }
        return z6 ? this.f54780a.b().l(rVar) : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        p200u.C7179l c7179l = this.f54783d;
        c7179l.q().d();
        c7179l.t(Long.MIN_VALUE);
        q(false);
    }

    private final java.lang.Object p(p200u.InterfaceC7165e interfaceC7165e, java.lang.Object obj, p237x7.l lVar, p127m7.e eVar) {
        return p200u.C7164d0.e(this.f54786g, null, new p200u.C7157a.C0716a(obj, interfaceC7165e, this.f54783d.g(), lVar, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(boolean z6) {
        this.f54784e.setValue(java.lang.Boolean.valueOf(z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(java.lang.Object obj) {
        this.f54785f.setValue(obj);
    }

    public final java.lang.Object e(java.lang.Object obj, p200u.InterfaceC7175j interfaceC7175j, java.lang.Object obj2, p237x7.l lVar, p127m7.e eVar) {
        return p(p200u.AbstractC7169g.a(interfaceC7175j, this.f54780a, m(), obj, obj2), obj2, lVar, eVar);
    }

    public final V.G1 g() {
        return this.f54783d;
    }

    public final p200u.C7179l j() {
        return this.f54783d;
    }

    public final java.lang.Object k() {
        return this.f54785f.getValue();
    }

    public final p200u.x0 l() {
        return this.f54780a;
    }

    public final java.lang.Object m() {
        return this.f54783d.getValue();
    }

    public final java.lang.Object n() {
        return this.f54780a.b().l(o());
    }

    public final p200u.r o() {
        return this.f54783d.q();
    }

    public final java.lang.Object s(java.lang.Object obj, p127m7.e eVar) {
        java.lang.Object objE = p200u.C7164d0.e(this.f54786g, null, new p200u.C7157a.b(obj, null), eVar, 1, null);
        return objE == p137n7.b.g() ? objE : p087i7.M.f46721a;
    }
}
