package R;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements p210v.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.G1 f9175c;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9176G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f9177H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.j f9178I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ R.o f9179J;

        /* JADX INFO: renamed from: R.f$a$a, reason: collision with other inner class name */
        static final class C0211a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ R.o f9180C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ W8.N f9181D;

            C0211a(R.o oVar, W8.N n6) {
                this.f9180C = oVar;
                this.f9181D = n6;
            }

            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p250z.i iVar, p127m7.e eVar) {
                R.o oVar;
                z.n.b bVarA;
                if (iVar instanceof z.n.b) {
                    this.f9180C.e((z.n.b) iVar, this.f9181D);
                } else {
                    if (iVar instanceof z.n.c) {
                        oVar = this.f9180C;
                        bVarA = ((z.n.c) iVar).a();
                    } else if (iVar instanceof z.n.a) {
                        oVar = this.f9180C;
                        bVarA = ((z.n.a) iVar).a();
                    } else {
                        this.f9180C.h(iVar, this.f9181D);
                    }
                    oVar.g(bVarA);
                }
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p250z.j jVar, R.o oVar, p127m7.e eVar) {
            super(2, eVar);
            this.f9178I = jVar;
            this.f9179J = oVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f9176G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f9177H;
                Z8.InterfaceC1869f interfaceC1869fB = this.f9178I.b();
                R.f.a.C0211a c0211a = new R.f.a.C0211a(this.f9179J, n6);
                this.f9176G = 1;
                if (interfaceC1869fB.b(c0211a, this) == objG) {
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
            return ((R.f.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            R.f.a aVar = new R.f.a(this.f9178I, this.f9179J, eVar);
            aVar.f9177H = obj;
            return aVar;
        }
    }

    private f(boolean z6, float f6, V.G1 g6) {
        this.f9173a = z6;
        this.f9174b = f6;
        this.f9175c = g6;
    }

    public /* synthetic */ f(boolean z6, float f6, V.G1 g6, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, f6, g6);
    }

    @Override // p210v.G
    public final p210v.H b(p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        long jB;
        interfaceC1734n.T(988743187);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(988743187, i6, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        R.r rVar = (R.r) interfaceC1734n.n(R.s.d());
        if (((p141o0.C7016y0) this.f9175c.getValue()).w() != 16) {
            interfaceC1734n.T(-303571590);
            interfaceC1734n.J();
            jB = ((p141o0.C7016y0) this.f9175c.getValue()).w();
        } else {
            interfaceC1734n.T(-303521246);
            jB = rVar.b(interfaceC1734n, 0);
            interfaceC1734n.J();
        }
        V.G1 g1N = V.v1.n(p141o0.C7016y0.i(jB), interfaceC1734n, 0);
        V.G1 g1N2 = V.v1.n(rVar.a(interfaceC1734n, 0), interfaceC1734n, 0);
        int i10 = i6 & 14;
        R.o oVarC = c(jVar, this.f9173a, this.f9174b, g1N, g1N2, interfaceC1734n, i10 | ((i6 << 12) & 458752));
        boolean zL = interfaceC1734n.l(oVarC) | (((i10 ^ 6) > 4 && interfaceC1734n.S(jVar)) || (i6 & 6) == 4);
        java.lang.Object objG = interfaceC1734n.g();
        if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new R.f.a(jVar, oVarC, null);
            interfaceC1734n.K(objG);
        }
        V.Q.d(oVarC, jVar, (p237x7.p) objG, interfaceC1734n, (i6 << 3) & 112);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return oVarC;
    }

    public abstract R.o c(p250z.j jVar, boolean z6, float f6, V.G1 g6, V.G1 g10, V.InterfaceC1734n interfaceC1734n, int i6);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R.f)) {
            return false;
        }
        R.f fVar = (R.f) obj;
        return this.f9173a == fVar.f9173a && Y0.i.s(this.f9174b, fVar.f9174b) && p247y7.AbstractC7350t.b(this.f9175c, fVar.f9175c);
    }

    public int hashCode() {
        return (((p190t.h.a(this.f9173a) * 31) + Y0.i.t(this.f9174b)) * 31) + this.f9175c.hashCode();
    }
}
