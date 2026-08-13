package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public final class m implements p230x.A {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.compose.foundation.m.c f19433i = new androidx.compose.foundation.m.c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p041e0.j f19434j = p041e0.k.a(androidx.compose.foundation.m.a.f19443D, androidx.compose.foundation.m.b.f19444D);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1745s0 f19435a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19439e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1745s0 f19436b = V.AbstractC1730l1.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p250z.l f19437c = p250z.k.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V.InterfaceC1745s0 f19438d = V.AbstractC1730l1.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p230x.A f19440f = p230x.B.a(new androidx.compose.foundation.m.f());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V.G1 f19441g = V.v1.e(new androidx.compose.foundation.m.e());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V.G1 f19442h = V.v1.e(new androidx.compose.foundation.m.d());

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.foundation.m.a f19443D = new androidx.compose.foundation.m.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer u(p041e0.l lVar, androidx.compose.foundation.m mVar) {
            return java.lang.Integer.valueOf(mVar.l());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.foundation.m.b f19444D = new androidx.compose.foundation.m.b();

        b() {
            super(1);
        }

        public final androidx.compose.foundation.m a(int i6) {
            return new androidx.compose.foundation.m(i6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a() {
            return androidx.compose.foundation.m.f19434j;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(androidx.compose.foundation.m.this.l() > 0);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(androidx.compose.foundation.m.this.l() < androidx.compose.foundation.m.this.k());
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {
        f() {
            super(1);
        }

        public final java.lang.Float a(float f6) {
            float fL = androidx.compose.foundation.m.this.l() + f6 + androidx.compose.foundation.m.this.f19439e;
            float fJ = E7.j.j(fL, 0.0f, androidx.compose.foundation.m.this.k());
            boolean z6 = !(fL == fJ);
            float fL2 = fJ - androidx.compose.foundation.m.this.l();
            int iRound = java.lang.Math.round(fL2);
            androidx.compose.foundation.m mVar = androidx.compose.foundation.m.this;
            mVar.n(mVar.l() + iRound);
            androidx.compose.foundation.m.this.f19439e = fL2 - iRound;
            if (z6) {
                f6 = fL2;
            }
            return java.lang.Float.valueOf(f6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).floatValue());
        }
    }

    public m(int i6) {
        this.f19435a = V.AbstractC1730l1.a(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i6) {
        this.f19435a.i(i6);
    }

    @Override // p230x.A
    public boolean a() {
        return this.f19440f.a();
    }

    @Override // p230x.A
    public boolean b() {
        return ((java.lang.Boolean) this.f19442h.getValue()).booleanValue();
    }

    @Override // p230x.A
    public boolean c() {
        return ((java.lang.Boolean) this.f19441g.getValue()).booleanValue();
    }

    @Override // p230x.A
    public java.lang.Object d(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objD = this.f19440f.d(l6, pVar, eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    @Override // p230x.A
    public float e(float f6) {
        return this.f19440f.e(f6);
    }

    public final p250z.l j() {
        return this.f19437c;
    }

    public final int k() {
        return this.f19438d.d();
    }

    public final int l() {
        return this.f19435a.d();
    }

    public final void m(int i6) {
        this.f19438d.i(i6);
        f0.k.a aVar = p051f0.k.f44821e;
        p051f0.k kVarD = aVar.d();
        p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
        p051f0.k kVarF = aVar.f(kVarD);
        try {
            if (l() > i6) {
                n(i6);
            }
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            aVar.m(kVarD, kVarF, lVarH);
        }
    }

    public final void o(int i6) {
        this.f19436b.i(i6);
    }
}
