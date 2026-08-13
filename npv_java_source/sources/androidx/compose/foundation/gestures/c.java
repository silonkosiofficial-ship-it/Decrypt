package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.compose.foundation.gestures.b {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p230x.o f19065a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private p230x.s f19066b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f19067c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private p237x7.q f19068d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private p237x7.q f19069e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f19070f0;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19071G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19072H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f19073I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.c f19074J;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c$a$a, reason: collision with other inner class name */
        static final class C0363a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p230x.m f19075D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.c f19076E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0363a(p230x.m mVar, androidx.compose.foundation.gestures.c cVar) {
                super(1);
                this.f19075D = mVar;
                this.f19076E = cVar;
            }

            public final void a(androidx.compose.foundation.gestures.a.b bVar) {
                this.f19075D.a(p230x.n.j(this.f19076E.A2(bVar.a()), this.f19076E.f19066b0));
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((androidx.compose.foundation.gestures.a.b) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, androidx.compose.foundation.gestures.c cVar, p127m7.e eVar) {
            super(2, eVar);
            this.f19073I = pVar;
            this.f19074J = cVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19071G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.m mVar = (p230x.m) this.f19072H;
                p237x7.p pVar = this.f19073I;
                androidx.compose.foundation.gestures.c.a.C0363a c0363a = new androidx.compose.foundation.gestures.c.a.C0363a(mVar, this.f19074J);
                this.f19071G = 1;
                if (pVar.u(c0363a, this) == objG) {
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
        public final java.lang.Object u(p230x.m mVar, p127m7.e eVar) {
            return ((androidx.compose.foundation.gestures.c.a) x(mVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.c.a aVar = new androidx.compose.foundation.gestures.c.a(this.f19073I, this.f19074J, eVar);
            aVar.f19072H = obj;
            return aVar;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19077G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19078H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f19080J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f19080J = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19077G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f19078H;
                p237x7.q qVar = androidx.compose.foundation.gestures.c.this.f19068d0;
                p131n0.g gVarD = p131n0.g.d(this.f19080J);
                this.f19077G = 1;
                if (qVar.j(n6, gVarD, this) == objG) {
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
            return ((androidx.compose.foundation.gestures.c.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.c.b bVar = androidx.compose.foundation.gestures.c.this.new b(this.f19080J, eVar);
            bVar.f19078H = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    static final class C0364c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19081G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19082H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f19084J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0364c(long j6, p127m7.e eVar) {
            super(2, eVar);
            this.f19084J = j6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19081G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f19082H;
                p237x7.q qVar = androidx.compose.foundation.gestures.c.this.f19069e0;
                java.lang.Float fB = p147o7.b.b(p230x.n.k(androidx.compose.foundation.gestures.c.this.z2(this.f19084J), androidx.compose.foundation.gestures.c.this.f19066b0));
                this.f19081G = 1;
                if (qVar.j(n6, fB, this) == objG) {
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
            return ((androidx.compose.foundation.gestures.c.C0364c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.foundation.gestures.c.C0364c c0364c = androidx.compose.foundation.gestures.c.this.new C0364c(this.f19084J, eVar);
            c0364c.f19082H = obj;
            return c0364c;
        }
    }

    public c(p230x.o oVar, p237x7.l lVar, p230x.s sVar, boolean z6, p250z.l lVar2, boolean z10, p237x7.q qVar, p237x7.q qVar2, boolean z11) {
        super(lVar, z6, lVar2, sVar);
        this.f19065a0 = oVar;
        this.f19066b0 = sVar;
        this.f19067c0 = z10;
        this.f19068d0 = qVar;
        this.f19069e0 = qVar2;
        this.f19070f0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long A2(long j6) {
        return p131n0.g.s(j6, this.f19070f0 ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z2(long j6) {
        return Y0.A.m(j6, this.f19070f0 ? -1.0f : 1.0f);
    }

    public final void B2(p230x.o oVar, p237x7.l lVar, p230x.s sVar, boolean z6, p250z.l lVar2, boolean z10, p237x7.q qVar, p237x7.q qVar2, boolean z11) {
        boolean z12;
        boolean z13;
        if (p247y7.AbstractC7350t.b(this.f19065a0, oVar)) {
            z12 = false;
        } else {
            this.f19065a0 = oVar;
            z12 = true;
        }
        if (this.f19066b0 != sVar) {
            this.f19066b0 = sVar;
            z12 = true;
        }
        if (this.f19070f0 != z11) {
            this.f19070f0 = z11;
            z13 = true;
        } else {
            z13 = z12;
        }
        this.f19068d0 = qVar;
        this.f19069e0 = qVar2;
        this.f19067c0 = z10;
        t2(lVar, z6, lVar2, sVar, z13);
    }

    @Override // androidx.compose.foundation.gestures.b
    public java.lang.Object i2(p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objA = this.f19065a0.a(p210v.L.UserInput, new androidx.compose.foundation.gestures.c.a(pVar, this, null), eVar);
        return objA == p137n7.b.g() ? objA : p087i7.M.f46721a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public void m2(long j6) {
        if (!A1() || p247y7.AbstractC7350t.b(this.f19068d0, p230x.n.f56571a)) {
            return;
        }
        W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.gestures.c.b(j6, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public void n2(long j6) {
        if (!A1() || p247y7.AbstractC7350t.b(this.f19069e0, p230x.n.f56572b)) {
            return;
        }
        W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.gestures.c.C0364c(j6, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public boolean r2() {
        return this.f19067c0;
    }
}
