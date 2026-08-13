package p230x;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p230x.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p200u.B f56499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p071h0.k f56500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f56501c;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56502G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f56503H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f56504I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ float f56505J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p230x.j f56506K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p230x.w f56507L;

        /* JADX INFO: renamed from: x.j$a$a, reason: collision with other inner class name */
        static final class C0749a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p247y7.L f56508D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p230x.w f56509E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p247y7.L f56510F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p230x.j f56511G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0749a(p247y7.L l6, p230x.w wVar, p247y7.L l10, p230x.j jVar) {
                super(1);
                this.f56508D = l6;
                this.f56509E = wVar;
                this.f56510F = l10;
                this.f56511G = jVar;
            }

            public final void a(p200u.C7173i c7173i) {
                float fFloatValue = ((java.lang.Number) c7173i.e()).floatValue() - this.f56508D.f57251C;
                float fA = this.f56509E.a(fFloatValue);
                this.f56508D.f57251C = ((java.lang.Number) c7173i.e()).floatValue();
                this.f56510F.f57251C = ((java.lang.Number) c7173i.f()).floatValue();
                if (java.lang.Math.abs(fFloatValue - fA) > 0.5f) {
                    c7173i.a();
                }
                p230x.j jVar = this.f56511G;
                jVar.f(jVar.d() + 1);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p200u.C7173i) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f6, p230x.j jVar, p230x.w wVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56505J = f6;
            this.f56506K = jVar;
            this.f56507L = wVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            float f6;
            p247y7.L l6;
            p200u.C7179l c7179l;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56504I;
            if (i6 == 0) {
                p087i7.x.b(obj);
                if (java.lang.Math.abs(this.f56505J) > 1.0f) {
                    p247y7.L l10 = new p247y7.L();
                    l10.f57251C = this.f56505J;
                    p247y7.L l11 = new p247y7.L();
                    p200u.C7179l c7179lC = p200u.AbstractC7181m.c(0.0f, this.f56505J, 0L, 0L, false, 28, null);
                    try {
                        p200u.B bC = this.f56506K.c();
                        x.j.a.C0749a c0749a = new x.j.a.C0749a(l11, this.f56507L, l10, this.f56506K);
                        this.f56502G = l10;
                        this.f56503H = c7179lC;
                        this.f56504I = 1;
                        if (p200u.AbstractC7190q0.h(c7179lC, bC, false, c0749a, this, 2, null) == objG) {
                            return objG;
                        }
                        l6 = l10;
                        f6 = l6.f57251C;
                    } catch (java.util.concurrent.CancellationException unused) {
                        l6 = l10;
                        c7179l = c7179lC;
                        l6.f57251C = ((java.lang.Number) c7179l.o()).floatValue();
                    }
                } else {
                    f6 = this.f56505J;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7179l = (p200u.C7179l) this.f56503H;
                l6 = (p247y7.L) this.f56502G;
                try {
                    p087i7.x.b(obj);
                } catch (java.util.concurrent.CancellationException unused2) {
                    l6.f57251C = ((java.lang.Number) c7179l.o()).floatValue();
                }
                f6 = l6.f57251C;
            }
            return p147o7.b.b(f6);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((x.j.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new x.j.a(this.f56505J, this.f56506K, this.f56507L, eVar);
        }
    }

    public j(p200u.B b6, p071h0.k kVar) {
        this.f56499a = b6;
        this.f56500b = kVar;
    }

    public /* synthetic */ j(p200u.B b6, p071h0.k kVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(b6, (i6 & 2) != 0 ? androidx.compose.foundation.gestures.d.e() : kVar);
    }

    @Override // p230x.p
    public java.lang.Object b(p230x.w wVar, float f6, p127m7.e eVar) {
        this.f56501c = 0;
        return W8.AbstractC1784g.g(this.f56500b, new x.j.a(f6, this, wVar, null), eVar);
    }

    public final p200u.B c() {
        return this.f56499a;
    }

    public final int d() {
        return this.f56501c;
    }

    public final void e(p200u.B b6) {
        this.f56499a = b6;
    }

    public final void f(int i6) {
        this.f56501c = i6;
    }
}
