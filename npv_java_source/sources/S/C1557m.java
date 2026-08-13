package S;

/* JADX INFO: renamed from: S.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1557m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f11399e;

    /* JADX INFO: renamed from: S.m$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f11400G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p250z.j f11401H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p051f0.r f11402I;

        /* JADX INFO: renamed from: S.m$a$a, reason: collision with other inner class name */
        static final class C0249a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p051f0.r f11403C;

            C0249a(p051f0.r rVar) {
                this.f11403C = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:4:0x0004  */
            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p250z.i iVar, p127m7.e eVar) {
                p051f0.r rVar;
                java.lang.Object objA;
                if (iVar instanceof p250z.g) {
                    this.f11403C.add(iVar);
                } else {
                    if (iVar instanceof p250z.h) {
                        rVar = this.f11403C;
                        objA = ((p250z.h) iVar).a();
                    } else if (iVar instanceof p250z.d) {
                        this.f11403C.add(iVar);
                    } else if (iVar instanceof p250z.e) {
                        rVar = this.f11403C;
                        objA = ((p250z.e) iVar).a();
                    } else if (iVar instanceof z.n.b) {
                        this.f11403C.add(iVar);
                    } else if (iVar instanceof z.n.c) {
                        rVar = this.f11403C;
                        objA = ((z.n.c) iVar).a();
                    } else if (iVar instanceof z.n.a) {
                        rVar = this.f11403C;
                        objA = ((z.n.a) iVar).a();
                    }
                    rVar.remove(objA);
                }
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p250z.j jVar, p051f0.r rVar, p127m7.e eVar) {
            super(2, eVar);
            this.f11401H = jVar;
            this.f11402I = rVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f11400G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869fB = this.f11401H.b();
                S.C1557m.a.C0249a c0249a = new S.C1557m.a.C0249a(this.f11402I);
                this.f11400G = 1;
                if (interfaceC1869fB.b(c0249a, this) == objG) {
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
            return ((S.C1557m.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.C1557m.a(this.f11401H, this.f11402I, eVar);
        }
    }

    /* JADX INFO: renamed from: S.m$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f11404G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p200u.C7157a f11405H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f11406I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f11407J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ S.C1557m f11408K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p250z.i f11409L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p200u.C7157a c7157a, float f6, boolean z6, S.C1557m c1557m, p250z.i iVar, p127m7.e eVar) {
            super(2, eVar);
            this.f11405H = c7157a;
            this.f11406I = f6;
            this.f11407J = z6;
            this.f11408K = c1557m;
            this.f11409L = iVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f11404G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                if (!Y0.i.s(((Y0.i) this.f11405H.k()).v(), this.f11406I)) {
                    if (this.f11407J) {
                        float fV = ((Y0.i) this.f11405H.k()).v();
                        p250z.i dVar = null;
                        if (Y0.i.s(fV, this.f11408K.f11396b)) {
                            dVar = new z.n.b(p131n0.g.f51312b.c(), null);
                        } else if (Y0.i.s(fV, this.f11408K.f11398d)) {
                            dVar = new p250z.g();
                        } else if (Y0.i.s(fV, this.f11408K.f11397c)) {
                            dVar = new p250z.d();
                        }
                        p200u.C7157a c7157a = this.f11405H;
                        float f6 = this.f11406I;
                        p250z.i iVar = this.f11409L;
                        this.f11404G = 2;
                        if (T.o.d(c7157a, f6, dVar, iVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        p200u.C7157a c7157a2 = this.f11405H;
                        Y0.i iVarM = Y0.i.m(this.f11406I);
                        this.f11404G = 1;
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
            return ((S.C1557m.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.C1557m.b(this.f11405H, this.f11406I, this.f11407J, this.f11408K, this.f11409L, eVar);
        }
    }

    private C1557m(float f6, float f10, float f11, float f12, float f13) {
        this.f11395a = f6;
        this.f11396b = f10;
        this.f11397c = f11;
        this.f11398d = f12;
        this.f11399e = f13;
    }

    public /* synthetic */ C1557m(float f6, float f10, float f11, float f12, float f13, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, f13);
    }

    private final V.G1 d(boolean z6, p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        float f6;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1312510462, i6, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)");
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
            objG2 = new S.C1557m.a(jVar, rVar, null);
            interfaceC1734n.K(objG2);
        }
        V.Q.e(jVar, (p237x7.p) objG2, interfaceC1734n, (i6 >> 3) & 14);
        p250z.i iVar = (p250z.i) p097j7.AbstractC6879v.v0(rVar);
        if (!z6) {
            f6 = this.f11399e;
        } else if (iVar instanceof z.n.b) {
            f6 = this.f11396b;
        } else if (iVar instanceof p250z.g) {
            f6 = this.f11398d;
        } else {
            f6 = iVar instanceof p250z.d ? this.f11397c : this.f11395a;
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
            java.lang.Object bVar = new S.C1557m.b(c7157a, f10, z6, this, iVar, null);
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

    public final V.G1 e(boolean z6, p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-2045116089, i6, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)");
        }
        V.G1 g1D = d(z6, jVar, interfaceC1734n, i6 & 1022);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1D;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S.C1557m)) {
            return false;
        }
        S.C1557m c1557m = (S.C1557m) obj;
        return Y0.i.s(this.f11395a, c1557m.f11395a) && Y0.i.s(this.f11396b, c1557m.f11396b) && Y0.i.s(this.f11397c, c1557m.f11397c) && Y0.i.s(this.f11398d, c1557m.f11398d) && Y0.i.s(this.f11399e, c1557m.f11399e);
    }

    public int hashCode() {
        return (((((((Y0.i.t(this.f11395a) * 31) + Y0.i.t(this.f11396b)) * 31) + Y0.i.t(this.f11397c)) * 31) + Y0.i.t(this.f11398d)) * 31) + Y0.i.t(this.f11399e);
    }
}
