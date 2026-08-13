package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
final class f extends androidx.compose.foundation.a implements F0.v0 {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private java.lang.String f18965l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private p237x7.a f18966m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private p237x7.a f18967n0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            p237x7.a aVar = androidx.compose.foundation.f.this.f18966m0;
            if (aVar != null) {
                aVar.b();
            }
            return java.lang.Boolean.TRUE;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        public final void a(long j6) {
            p237x7.a aVar = androidx.compose.foundation.f.this.f18967n0;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p131n0.g) obj).v());
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final void a(long j6) {
            p237x7.a aVar = androidx.compose.foundation.f.this.f18966m0;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p131n0.g) obj).v());
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18971G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f18972H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ long f18973I;

        d(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18971G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.t tVar = (p230x.t) this.f18972H;
                long j6 = this.f18973I;
                if (androidx.compose.foundation.f.this.l2()) {
                    androidx.compose.foundation.f fVar = androidx.compose.foundation.f.this;
                    this.f18971G = 1;
                    if (fVar.n2(tVar, j6, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        public final java.lang.Object H(p230x.t tVar, long j6, p127m7.e eVar) {
            androidx.compose.foundation.f.d dVar = androidx.compose.foundation.f.this.new d(eVar);
            dVar.f18972H = tVar;
            dVar.f18973I = j6;
            return dVar.B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((p230x.t) obj, ((p131n0.g) obj2).v(), (p127m7.e) obj3);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        public final void a(long j6) {
            if (androidx.compose.foundation.f.this.l2()) {
                androidx.compose.foundation.f.this.m2().b();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p131n0.g) obj).v());
            return p087i7.M.f46721a;
        }
    }

    private f(p237x7.a aVar, java.lang.String str, p237x7.a aVar2, p237x7.a aVar3, p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str2, K0.h hVar) {
        super(lVar, i6, z6, str2, hVar, aVar, null);
        this.f18965l0 = str;
        this.f18966m0 = aVar2;
        this.f18967n0 = aVar3;
    }

    public /* synthetic */ f(p237x7.a aVar, java.lang.String str, p237x7.a aVar2, p237x7.a aVar3, p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str2, K0.h hVar, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, str, aVar2, aVar3, lVar, i6, z6, str2, hVar);
    }

    @Override // androidx.compose.foundation.a
    public void f2(K0.w wVar) {
        if (this.f18966m0 != null) {
            K0.u.y(wVar, this.f18965l0, new androidx.compose.foundation.f.a());
        }
    }

    @Override // androidx.compose.foundation.a
    public java.lang.Object g2(p251z0.K k6, p127m7.e eVar) {
        java.lang.Object objI = p230x.D.i(k6, (!l2() || this.f18967n0 == null) ? null : new androidx.compose.foundation.f.b(), (!l2() || this.f18966m0 == null) ? null : new androidx.compose.foundation.f.c(), new androidx.compose.foundation.f.d(null), new androidx.compose.foundation.f.e(), eVar);
        return objI == p137n7.b.g() ? objI : p087i7.M.f46721a;
    }

    public void u2(p237x7.a aVar, java.lang.String str, p237x7.a aVar2, p237x7.a aVar3, p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str2, K0.h hVar) {
        boolean z10;
        if (!p247y7.AbstractC7350t.b(this.f18965l0, str)) {
            this.f18965l0 = str;
            F0.A0.b(this);
        }
        if ((this.f18966m0 == null) != (aVar2 == null)) {
            i2();
            F0.A0.b(this);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18966m0 = aVar2;
        if ((this.f18967n0 == null) != (aVar3 == null)) {
            z10 = true;
        }
        this.f18967n0 = aVar3;
        boolean z11 = l2() != z6 ? true : z10;
        r2(lVar, i6, z6, str2, hVar, aVar);
        if (z11) {
            p2();
        }
    }
}
