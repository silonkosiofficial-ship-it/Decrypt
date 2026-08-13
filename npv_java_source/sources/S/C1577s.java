package S;

/* JADX INFO: renamed from: S.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1577s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f11687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f11688f;

    /* JADX INFO: renamed from: S.s$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f11689G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p250z.j f11690H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p051f0.r f11691I;

        /* JADX INFO: renamed from: S.s$a$a, reason: collision with other inner class name */
        static final class C0255a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p051f0.r f11692C;

            C0255a(p051f0.r rVar) {
                this.f11692C = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:4:0x0004  */
            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p250z.i iVar, p127m7.e eVar) {
                p051f0.r rVar;
                java.lang.Object objA;
                if (iVar instanceof p250z.g) {
                    this.f11692C.add(iVar);
                } else {
                    if (iVar instanceof p250z.h) {
                        rVar = this.f11692C;
                        objA = ((p250z.h) iVar).a();
                    } else if (iVar instanceof p250z.d) {
                        this.f11692C.add(iVar);
                    } else if (iVar instanceof p250z.e) {
                        rVar = this.f11692C;
                        objA = ((p250z.e) iVar).a();
                    } else if (iVar instanceof z.n.b) {
                        this.f11692C.add(iVar);
                    } else if (iVar instanceof z.n.c) {
                        rVar = this.f11692C;
                        objA = ((z.n.c) iVar).a();
                    } else if (iVar instanceof z.n.a) {
                        rVar = this.f11692C;
                        objA = ((z.n.a) iVar).a();
                    } else if (iVar instanceof p250z.b) {
                        this.f11692C.add(iVar);
                    } else if (iVar instanceof p250z.c) {
                        rVar = this.f11692C;
                        objA = ((p250z.c) iVar).a();
                    } else if (iVar instanceof p250z.a) {
                        rVar = this.f11692C;
                        objA = ((p250z.a) iVar).a();
                    }
                    rVar.remove(objA);
                }
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p250z.j jVar, p051f0.r rVar, p127m7.e eVar) {
            super(2, eVar);
            this.f11690H = jVar;
            this.f11691I = rVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f11689G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869fB = this.f11690H.b();
                S.C1577s.a.C0255a c0255a = new S.C1577s.a.C0255a(this.f11691I);
                this.f11689G = 1;
                if (interfaceC1869fB.b(c0255a, this) == objG) {
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
            return ((S.C1577s.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.C1577s.a(this.f11690H, this.f11691I, eVar);
        }
    }

    /* JADX INFO: renamed from: S.s$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f11693G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p200u.C7157a f11694H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f11695I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f11696J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ S.C1577s f11697K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p250z.i f11698L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p200u.C7157a c7157a, float f6, boolean z6, S.C1577s c1577s, p250z.i iVar, p127m7.e eVar) {
            super(2, eVar);
            this.f11694H = c7157a;
            this.f11695I = f6;
            this.f11696J = z6;
            this.f11697K = c1577s;
            this.f11698L = iVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f11693G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                if (!Y0.i.s(((Y0.i) this.f11694H.k()).v(), this.f11695I)) {
                    if (this.f11696J) {
                        float fV = ((Y0.i) this.f11694H.k()).v();
                        p250z.i bVar = null;
                        if (Y0.i.s(fV, this.f11697K.f11684b)) {
                            bVar = new z.n.b(p131n0.g.f51312b.c(), null);
                        } else if (Y0.i.s(fV, this.f11697K.f11686d)) {
                            bVar = new p250z.g();
                        } else if (Y0.i.s(fV, this.f11697K.f11685c)) {
                            bVar = new p250z.d();
                        } else if (Y0.i.s(fV, this.f11697K.f11687e)) {
                            bVar = new p250z.b();
                        }
                        p200u.C7157a c7157a = this.f11694H;
                        float f6 = this.f11695I;
                        p250z.i iVar = this.f11698L;
                        this.f11693G = 2;
                        if (T.o.d(c7157a, f6, bVar, iVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        p200u.C7157a c7157a2 = this.f11694H;
                        Y0.i iVarM = Y0.i.m(this.f11695I);
                        this.f11693G = 1;
                        if (c7157a2.s(iVarM, this) == objG) {
                            return objG;
                        }
                    }
                }
            } else {
                if (i6 != 1 && i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S.C1577s.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.C1577s.b(this.f11694H, this.f11695I, this.f11696J, this.f11697K, this.f11698L, eVar);
        }
    }

    private C1577s(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f11683a = f6;
        this.f11684b = f10;
        this.f11685c = f11;
        this.f11686d = f12;
        this.f11687e = f13;
        this.f11688f = f14;
    }

    public /* synthetic */ C1577s(float f6, float f10, float f11, float f12, float f13, float f14, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, f13, f14);
    }

    private final V.G1 e(boolean z6, p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        float f6;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1421890746, i6, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = V.v1.f();
            interfaceC1734n.K(objG);
        }
        p051f0.r rVar = (p051f0.r) objG;
        boolean z10 = true;
        boolean z11 = (((i6 & 112) ^ 48) > 32 && interfaceC1734n.S(jVar)) || (i6 & 48) == 32;
        java.lang.Object objG2 = interfaceC1734n.g();
        if (z11 || objG2 == aVar.a()) {
            objG2 = new S.C1577s.a(jVar, rVar, null);
            interfaceC1734n.K(objG2);
        }
        V.Q.e(jVar, (p237x7.p) objG2, interfaceC1734n, (i6 >> 3) & 14);
        p250z.i iVar = (p250z.i) p097j7.AbstractC6879v.v0(rVar);
        if (!z6) {
            f6 = this.f11688f;
        } else if (iVar instanceof z.n.b) {
            f6 = this.f11684b;
        } else if (iVar instanceof p250z.g) {
            f6 = this.f11686d;
        } else if (iVar instanceof p250z.d) {
            f6 = this.f11685c;
        } else {
            f6 = iVar instanceof p250z.b ? this.f11687e : this.f11683a;
        }
        float f10 = f6;
        java.lang.Object objG3 = interfaceC1734n.g();
        if (objG3 == aVar.a()) {
            objG3 = new p200u.C7157a(Y0.i.m(f10), p200u.z0.b(Y0.i.f16208D), null, null, 12, null);
            interfaceC1734n.K(objG3);
        }
        p200u.C7157a c7157a = (p200u.C7157a) objG3;
        Y0.i iVarM = Y0.i.m(f10);
        boolean zL = interfaceC1734n.l(c7157a) | interfaceC1734n.h(f10) | ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.d(z6)) || (i6 & 6) == 4);
        if ((((i6 & 896) ^ 384) <= 256 || !interfaceC1734n.S(this)) && (i6 & 384) != 256) {
            z10 = false;
        }
        boolean zL2 = zL | z10 | interfaceC1734n.l(iVar);
        java.lang.Object objG4 = interfaceC1734n.g();
        if (zL2 || objG4 == aVar.a()) {
            java.lang.Object bVar = new S.C1577s.b(c7157a, f10, z6, this, iVar, null);
            interfaceC1734n.K(bVar);
            objG4 = bVar;
        }
        V.Q.e(iVarM, (p237x7.p) objG4, interfaceC1734n, 0);
        V.G1 g1G = c7157a.g();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1G;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1577s)) {
            return false;
        }
        S.C1577s c1577s = (S.C1577s) obj;
        return Y0.i.s(this.f11683a, c1577s.f11683a) && Y0.i.s(this.f11684b, c1577s.f11684b) && Y0.i.s(this.f11685c, c1577s.f11685c) && Y0.i.s(this.f11686d, c1577s.f11686d) && Y0.i.s(this.f11688f, c1577s.f11688f);
    }

    public final V.G1 f(boolean z6, p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.T(-1763481333);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1763481333, i6, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
        }
        interfaceC1734n.T(-734838460);
        if (jVar != null) {
            interfaceC1734n.J();
            V.G1 g1E = e(z6, jVar, interfaceC1734n, i6 & 1022);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return g1E;
        }
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            objG = V.A1.d(Y0.i.m(this.f11683a), null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return interfaceC1753w0;
    }

    public int hashCode() {
        return (((((((Y0.i.t(this.f11683a) * 31) + Y0.i.t(this.f11684b)) * 31) + Y0.i.t(this.f11685c)) * 31) + Y0.i.t(this.f11686d)) * 31) + Y0.i.t(this.f11688f);
    }
}
