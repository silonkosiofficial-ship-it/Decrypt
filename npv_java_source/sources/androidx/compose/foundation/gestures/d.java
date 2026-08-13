package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p237x7.l f19085a = androidx.compose.foundation.gestures.d.a.f19089D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p230x.w f19086b = new androidx.compose.foundation.gestures.d.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p071h0.k f19087c = new androidx.compose.foundation.gestures.d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final androidx.compose.foundation.gestures.d.C0365d f19088d = new androidx.compose.foundation.gestures.d.C0365d();

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.foundation.gestures.d.a f19089D = new androidx.compose.foundation.gestures.d.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p251z0.B b6) {
            return java.lang.Boolean.valueOf(!p251z0.P.g(b6.n(), p251z0.P.f57513a.b()));
        }
    }

    public static final class b implements p071h0.k {
        b() {
        }

        @Override // p127m7.i
        public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
            return h0.k.a.a(this, obj, pVar);
        }

        @Override // m7.i.b
        public /* synthetic */ m7.i.c getKey() {
            return p071h0.j.a(this);
        }

        @Override // m7.i.b, p127m7.i
        public m7.i.b i(m7.i.c cVar) {
            return h0.k.a.b(this, cVar);
        }

        @Override // p071h0.k
        public float n0() {
            return 1.0f;
        }

        @Override // p127m7.i
        public p127m7.i o0(p127m7.i iVar) {
            return h0.k.a.d(this, iVar);
        }

        @Override // p127m7.i
        public p127m7.i y0(m7.i.c cVar) {
            return h0.k.a.c(this, cVar);
        }
    }

    public static final class c implements p230x.w {
        c() {
        }

        @Override // p230x.w
        public float a(float f6) {
            return f6;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.d$d, reason: collision with other inner class name */
    public static final class C0365d implements Y0.e {
        C0365d() {
        }

        @Override // Y0.e
        public /* synthetic */ float B0(float f6) {
            return Y0.d.g(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ int K0(long j6) {
            return Y0.d.a(this, j6);
        }

        @Override // Y0.n
        public /* synthetic */ long O(float f6) {
            return Y0.m.b(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ long P(long j6) {
            return Y0.d.e(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ int S0(float f6) {
            return Y0.d.b(this, f6);
        }

        @Override // Y0.n
        public /* synthetic */ float X(long j6) {
            return Y0.m.a(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ long b1(long j6) {
            return Y0.d.h(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ float g1(long j6) {
            return Y0.d.f(this, j6);
        }

        @Override // Y0.e
        public float getDensity() {
            return 1.0f;
        }

        @Override // Y0.e
        public /* synthetic */ long k0(float f6) {
            return Y0.d.i(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ float o0(int i6) {
            return Y0.d.d(this, i6);
        }

        @Override // Y0.e
        public /* synthetic */ float q0(float f6) {
            return Y0.d.c(this, f6);
        }

        @Override // Y0.n
        public float v0() {
            return 1.0f;
        }
    }

    static final class e extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f19090F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f19091G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19092H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f19093I;

        e(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19092H = obj;
            this.f19093I |= Integer.MIN_VALUE;
            return androidx.compose.foundation.gestures.d.j(null, 0L, this);
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19094G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19095H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p230x.C f19096I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f19097J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p247y7.L f19098K;

        static final class a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p247y7.L f19099D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p230x.C f19100E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p230x.r f19101F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p247y7.L l6, p230x.C c6, p230x.r rVar) {
                super(2);
                this.f19099D = l6;
                this.f19100E = c6;
                this.f19101F = rVar;
            }

            public final void a(float f6, float f10) {
                float f11 = f6 - this.f19099D.f57251C;
                p230x.C c6 = this.f19100E;
                this.f19099D.f57251C += c6.t(c6.A(this.f19101F.b(c6.B(c6.t(f11)), p241y0.f.f57150a.b())));
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                a(((java.lang.Number) obj).floatValue(), ((java.lang.Number) obj2).floatValue());
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p230x.C c6, long j6, p247y7.L l6, p127m7.e eVar) {
            super(2, eVar);
            this.f19096I = c6;
            this.f19097J = j6;
            this.f19098K = l6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19094G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.r rVar = (p230x.r) this.f19095H;
                float fA = this.f19096I.A(this.f19097J);
                androidx.compose.foundation.gestures.d.f.a aVar = new androidx.compose.foundation.gestures.d.f.a(this.f19098K, this.f19096I, rVar);
                this.f19094G = 1;
                if (p200u.AbstractC7190q0.e(0.0f, fA, 0.0f, null, aVar, this, 12, null) == objG) {
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
            return ((androidx.compose.foundation.gestures.d.f) x(rVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.d.f fVar = new androidx.compose.foundation.gestures.d.f(this.f19096I, this.f19097J, this.f19098K, eVar);
            fVar.f19095H = obj;
            return fVar;
        }
    }

    public static final p071h0.k e() {
        return f19087c;
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, p230x.A a6, p230x.s sVar, p210v.T t6, boolean z6, boolean z10, p230x.p pVar, p250z.l lVar, p230x.InterfaceC7286f interfaceC7286f) {
        return dVar.b(new androidx.compose.foundation.gestures.ScrollableElement(a6, sVar, t6, z6, z10, pVar, lVar, interfaceC7286f));
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, p230x.A a6, p230x.s sVar, boolean z6, boolean z10, p230x.p pVar, p250z.l lVar) {
        return h(dVar, a6, sVar, null, z6, z10, pVar, lVar, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.d h(androidx.compose.ui.d dVar, p230x.A a6, p230x.s sVar, p210v.T t6, boolean z6, boolean z10, p230x.p pVar, p250z.l lVar, p230x.InterfaceC7286f interfaceC7286f, int i6, java.lang.Object obj) {
        return f(dVar, a6, sVar, t6, (i6 & 8) != 0 ? true : z6, (i6 & 16) != 0 ? false : z10, (i6 & 32) != 0 ? null : pVar, (i6 & 64) != 0 ? null : lVar, (i6 & 128) != 0 ? null : interfaceC7286f);
    }

    public static /* synthetic */ androidx.compose.ui.d i(androidx.compose.ui.d dVar, p230x.A a6, p230x.s sVar, boolean z6, boolean z10, p230x.p pVar, p250z.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        boolean z11 = z6;
        if ((i6 & 8) != 0) {
            z10 = false;
        }
        return g(dVar, a6, sVar, z11, z10, (i6 & 16) != 0 ? null : pVar, (i6 & 32) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object j(p230x.C c6, long j6, p127m7.e eVar) {
        androidx.compose.foundation.gestures.d.e eVar2;
        p247y7.L l6;
        if (eVar instanceof androidx.compose.foundation.gestures.d.e) {
            eVar2 = (androidx.compose.foundation.gestures.d.e) eVar;
            int i6 = eVar2.f19093I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar2.f19093I = i6 - Integer.MIN_VALUE;
            } else {
                eVar2 = new androidx.compose.foundation.gestures.d.e(eVar);
            }
        } else {
            eVar2 = new androidx.compose.foundation.gestures.d.e(eVar);
        }
        java.lang.Object obj = eVar2.f19092H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = eVar2.f19093I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            l6 = new p247y7.L();
            p210v.L l10 = p210v.L.Default;
            androidx.compose.foundation.gestures.d.f fVar = new androidx.compose.foundation.gestures.d.f(c6, j6, l6, null);
            eVar2.f19090F = c6;
            eVar2.f19091G = l6;
            eVar2.f19093I = 1;
            if (c6.v(l10, fVar, eVar2) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p247y7.L l11 = (p247y7.L) eVar2.f19091G;
            p230x.C c10 = (p230x.C) eVar2.f19090F;
            p087i7.x.b(obj);
            l6 = l11;
            c6 = c10;
        }
        return p131n0.g.d(c6.B(l6.f57251C));
    }
}
