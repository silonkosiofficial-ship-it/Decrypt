package C;

/* JADX INFO: loaded from: classes.dex */
public final class K implements p230x.A {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C.K.c f1010v = new C.K.c(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final p041e0.j f1011w = p041e0.a.a(C.K.a.f1033D, C.K.b.f1034D);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.B f1012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C.F f1013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p250z.l f1015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p230x.A f1017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private D0.Z f1020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final D0.a0 f1021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final D.C0865b f1022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator f1023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D.C0873j f1024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f1025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C.z f1026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C.C0831e f1027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final D.D f1028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1032u;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final C.K.a f1033D = new C.K.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List u(p041e0.l lVar, C.K k6) {
            return p097j7.AbstractC6879v.p(java.lang.Integer.valueOf(k6.n()), java.lang.Integer.valueOf(k6.o()));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final C.K.b f1034D = new C.K.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C.K l(java.util.List list) {
            return new C.K(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a() {
            return C.K.f1011w;
        }
    }

    public static final class d implements C.z {
        d() {
        }

        @Override // C.z
        public java.util.List a(int i6) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            f0.k.a aVar = p051f0.k.f44821e;
            C.K k6 = C.K.this;
            p051f0.k kVarD = aVar.d();
            p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
            p051f0.k kVarF = aVar.f(kVarD);
            try {
                java.util.List list = (java.util.List) ((C.u) k6.f1014c.getValue()).r().l(java.lang.Integer.valueOf(i6));
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p087i7.u uVar = (p087i7.u) list.get(i10);
                    arrayList.add(k6.w().e(((java.lang.Number) uVar.c()).intValue(), ((Y0.C1859b) uVar.d()).r()));
                }
                p087i7.M m6 = p087i7.M.f46721a;
                return arrayList;
            } finally {
                aVar.m(kVarD, kVarF, lVarH);
            }
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1037E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i6) {
            super(1);
            this.f1037E = i6;
        }

        public final void a(D.K k6) {
            C.B b6 = C.K.this.f1012a;
            int i6 = this.f1037E;
            f0.k.a aVar = p051f0.k.f44821e;
            p051f0.k kVarD = aVar.d();
            aVar.m(kVarD, aVar.f(kVarD), kVarD != null ? kVarD.h() : null);
            b6.a(k6, i6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D.K) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class f implements D0.a0 {
        f() {
        }

        @Override // D0.a0
        public void a(D0.Z z6) {
            C.K.this.f1020i = z6;
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
            return p071h0.f.a(this, dVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
            return p071h0.g.b(this, obj, pVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ boolean d(p237x7.l lVar) {
            return p071h0.g.a(this, lVar);
        }
    }

    static final class g extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f1039F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f1040G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f1041H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1042I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f1044K;

        g(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f1042I = obj;
            this.f1044K |= Integer.MIN_VALUE;
            return C.K.this.d(null, null, this);
        }
    }

    static final class h extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1045G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f1047I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f1048J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i6, int i10, p127m7.e eVar) {
            super(2, eVar);
            this.f1047I = i6;
            this.f1048J = i10;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f1045G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            C.K.this.H(this.f1047I, this.f1048J, true);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p230x.w wVar, p127m7.e eVar) {
            return ((C.K.h) x(wVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return C.K.this.new h(this.f1047I, this.f1048J, eVar);
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {
        i() {
            super(1);
        }

        public final java.lang.Float a(float f6) {
            return java.lang.Float.valueOf(-C.K.this.C(-f6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).floatValue());
        }
    }

    public K(int i6, int i10) {
        this(i6, i10, C.C.b(0, 1, null));
    }

    public K(int i6, int i10, C.B b6) {
        this.f1012a = b6;
        C.F f6 = new C.F(i6, i10);
        this.f1013b = f6;
        this.f1014c = V.v1.h(C.L.f1050a, V.v1.j());
        this.f1015d = p250z.k.a();
        this.f1017f = p230x.B.a(new C.K.i());
        this.f1019h = true;
        this.f1021j = new C.K.f();
        this.f1022k = new D.C0865b();
        this.f1023l = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator();
        this.f1024m = new D.C0873j();
        this.f1025n = new androidx.compose.foundation.lazy.layout.d(b6.b(), new C.K.e(i6));
        this.f1026o = new C.K.d();
        this.f1027p = new C.C0831e(this);
        this.f1028q = new D.D();
        f6.b();
        this.f1029r = D.L.c(null, 1, null);
        this.f1030s = D.L.c(null, 1, null);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f1031t = V.A1.d(bool, null, 2, null);
        this.f1032u = V.A1.d(bool, null, 2, null);
    }

    private final void B(float f6, C.s sVar) {
        if (this.f1019h) {
            this.f1012a.c(this.f1026o, f6, sVar);
        }
    }

    public static /* synthetic */ java.lang.Object E(C.K k6, int i6, int i10, p127m7.e eVar, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return k6.D(i6, i10, eVar);
    }

    private void F(boolean z6) {
        this.f1032u.setValue(java.lang.Boolean.valueOf(z6));
    }

    private void G(boolean z6) {
        this.f1031t.setValue(java.lang.Boolean.valueOf(z6));
    }

    public static /* synthetic */ void k(C.K k6, C.u uVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        k6.j(uVar, z6);
    }

    public final int A() {
        return ((C.u) this.f1014c.getValue()).s();
    }

    public final float C(float f6) {
        float f10;
        C.s sVarR;
        if ((f6 < 0.0f && !c()) || (f6 > 0.0f && !b())) {
            return 0.0f;
        }
        if (java.lang.Math.abs(this.f1016e) > 0.5f) {
            throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + this.f1016e).toString());
        }
        float f11 = this.f1016e + f6;
        this.f1016e = f11;
        if (java.lang.Math.abs(f11) > 0.5f) {
            C.u uVar = (C.u) this.f1014c.getValue();
            float f12 = this.f1016e;
            if (uVar.t(A7.a.d(f12))) {
                j(uVar, true);
                D.L.d(this.f1029r);
                f10 = f12 - this.f1016e;
                sVarR = uVar;
            } else {
                D0.Z z6 = this.f1020i;
                if (z6 != null) {
                    z6.j();
                }
                f10 = f12 - this.f1016e;
                sVarR = r();
            }
            B(f10, sVarR);
        }
        if (java.lang.Math.abs(this.f1016e) <= 0.5f) {
            return f6;
        }
        float f13 = f6 - this.f1016e;
        this.f1016e = 0.0f;
        return f13;
    }

    public final java.lang.Object D(int i6, int i10, p127m7.e eVar) {
        java.lang.Object objC = p230x.z.c(this, null, new C.K.h(i6, i10, null), eVar, 1, null);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }

    public final void H(int i6, int i10, boolean z6) {
        if (this.f1013b.a() != i6 || this.f1013b.c() != i10) {
            this.f1023l.n();
        }
        this.f1013b.d(i6, i10);
        if (!z6) {
            D.L.d(this.f1030s);
            return;
        }
        D0.Z z10 = this.f1020i;
        if (z10 != null) {
            z10.j();
        }
    }

    public final int I(C.InterfaceC0838l interfaceC0838l, int i6) {
        return this.f1013b.j(interfaceC0838l, i6);
    }

    @Override // p230x.A
    public boolean a() {
        return this.f1017f.a();
    }

    @Override // p230x.A
    public boolean b() {
        return ((java.lang.Boolean) this.f1032u.getValue()).booleanValue();
    }

    @Override // p230x.A
    public boolean c() {
        return ((java.lang.Boolean) this.f1031t.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p230x.A
    public java.lang.Object d(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
        C.K.g gVar;
        C.K k6;
        if (eVar instanceof C.K.g) {
            gVar = (C.K.g) eVar;
            int i6 = gVar.f1044K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.f1044K = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new C.K.g(eVar);
            }
        } else {
            gVar = new C.K.g(eVar);
        }
        java.lang.Object obj = gVar.f1042I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = gVar.f1044K;
        if (i10 != 0) {
            if (i10 == 1) {
                pVar = (p237x7.p) gVar.f1041H;
                l6 = (p210v.L) gVar.f1040G;
                k6 = (C.K) gVar.f1039F;
                p087i7.x.b(obj);
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }
        p087i7.x.b(obj);
        D.C0865b c0865b = this.f1022k;
        gVar.f1039F = this;
        gVar.f1040G = l6;
        gVar.f1041H = pVar;
        gVar.f1044K = 1;
        if (c0865b.g(gVar) == objG) {
            return objG;
        }
        k6 = this;
        p230x.A a6 = k6.f1017f;
        gVar.f1039F = null;
        gVar.f1040G = null;
        gVar.f1041H = null;
        gVar.f1044K = 2;
        if (a6.d(l6, pVar, gVar) == objG) {
            return objG;
        }
        return p087i7.M.f46721a;
    }

    @Override // p230x.A
    public float e(float f6) {
        return this.f1017f.e(f6);
    }

    public final void j(C.u uVar, boolean z6) {
        this.f1016e -= uVar.o();
        this.f1014c.setValue(uVar);
        F(uVar.m());
        G(uVar.n());
        if (z6) {
            this.f1013b.i(uVar.q());
        } else {
            this.f1013b.h(uVar);
            if (this.f1019h) {
                this.f1012a.d(this.f1026o, uVar);
            }
        }
        this.f1018g++;
    }

    public final D.C0865b l() {
        return this.f1022k;
    }

    public final D.C0873j m() {
        return this.f1024m;
    }

    public final int n() {
        return this.f1013b.a();
    }

    public final int o() {
        return this.f1013b.c();
    }

    public final p250z.l p() {
        return this.f1015d;
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator q() {
        return this.f1023l;
    }

    public final C.s r() {
        return (C.s) this.f1014c.getValue();
    }

    public final V.InterfaceC1753w0 s() {
        return this.f1030s;
    }

    public final E7.i t() {
        return (E7.i) this.f1013b.b().getValue();
    }

    public final D.D u() {
        return this.f1028q;
    }

    public final V.InterfaceC1753w0 v() {
        return this.f1029r;
    }

    public final androidx.compose.foundation.lazy.layout.d w() {
        return this.f1025n;
    }

    public final D0.Z x() {
        return this.f1020i;
    }

    public final D0.a0 y() {
        return this.f1021j;
    }

    public final float z() {
        return this.f1016e;
    }
}
