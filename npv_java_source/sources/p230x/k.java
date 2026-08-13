package p230x;

/* JADX INFO: loaded from: classes.dex */
final class k implements p230x.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f56512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p230x.w f56513b = new x.k.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p210v.N f56514c = new p210v.N();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1753w0 f56515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f56516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V.InterfaceC1753w0 f56517f;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56518G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p210v.L f56520I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f56521J;

        /* JADX INFO: renamed from: x.k$a$a, reason: collision with other inner class name */
        static final class C0750a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f56522G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f56523H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p230x.k f56524I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p237x7.p f56525J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0750a(p230x.k kVar, p237x7.p pVar, p127m7.e eVar) {
                super(2, eVar);
                this.f56524I = kVar;
                this.f56525J = pVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f56522G;
                try {
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        p230x.w wVar = (p230x.w) this.f56523H;
                        this.f56524I.f56515d.setValue(p147o7.b.a(true));
                        p237x7.p pVar = this.f56525J;
                        this.f56522G = 1;
                        if (pVar.u(wVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    this.f56524I.f56515d.setValue(p147o7.b.a(false));
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    this.f56524I.f56515d.setValue(p147o7.b.a(false));
                    throw th;
                }
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p230x.w wVar, p127m7.e eVar) {
                return ((x.k.a.C0750a) x(wVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                x.k.a.C0750a c0750a = new x.k.a.C0750a(this.f56524I, this.f56525J, eVar);
                c0750a.f56523H = obj;
                return c0750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56520I = l6;
            this.f56521J = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56518G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p210v.N n6 = p230x.k.this.f56514c;
                p230x.w wVar = p230x.k.this.f56513b;
                p210v.L l6 = this.f56520I;
                x.k.a.C0750a c0750a = new x.k.a.C0750a(p230x.k.this, this.f56521J, null);
                this.f56518G = 1;
                if (n6.e(wVar, l6, c0750a, this) == objG) {
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
            return ((x.k.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p230x.k.this.new a(this.f56520I, this.f56521J, eVar);
        }
    }

    public static final class b implements p230x.w {
        b() {
        }

        @Override // p230x.w
        public float a(float f6) {
            if (java.lang.Float.isNaN(f6)) {
                return 0.0f;
            }
            float fFloatValue = ((java.lang.Number) p230x.k.this.k().l(java.lang.Float.valueOf(f6))).floatValue();
            p230x.k.this.f56516e.setValue(java.lang.Boolean.valueOf(fFloatValue > 0.0f));
            p230x.k.this.f56517f.setValue(java.lang.Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    public k(p237x7.l lVar) {
        this.f56512a = lVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f56515d = V.A1.d(bool, null, 2, null);
        this.f56516e = V.A1.d(bool, null, 2, null);
        this.f56517f = V.A1.d(bool, null, 2, null);
    }

    @Override // p230x.A
    public boolean a() {
        return ((java.lang.Boolean) this.f56515d.getValue()).booleanValue();
    }

    @Override // p230x.A
    public /* synthetic */ boolean b() {
        return p230x.z.a(this);
    }

    @Override // p230x.A
    public /* synthetic */ boolean c() {
        return p230x.z.b(this);
    }

    @Override // p230x.A
    public java.lang.Object d(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new x.k.a(l6, pVar, null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }

    @Override // p230x.A
    public float e(float f6) {
        return ((java.lang.Number) this.f56512a.l(java.lang.Float.valueOf(f6))).floatValue();
    }

    public final p237x7.l k() {
        return this.f56512a;
    }
}
