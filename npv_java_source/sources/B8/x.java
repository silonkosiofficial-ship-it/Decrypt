package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.m f932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.C0824e f933b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p158p8.p f935E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ B8.EnumC0821b f936F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p158p8.p pVar, B8.EnumC0821b enumC0821b) {
            super(0);
            this.f935E = pVar;
            this.f936F = enumC0821b;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List listT0;
            B8.x xVar = B8.x.this;
            B8.A aC = xVar.c(xVar.f932a.e());
            if (aC != null) {
                listT0 = p097j7.AbstractC6879v.T0(B8.x.this.f932a.c().d().i(aC, this.f935E, this.f936F));
            } else {
                listT0 = null;
            }
            return listT0 == null ? p097j7.AbstractC6879v.m() : listT0;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f938E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p088i8.n f939F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z6, p088i8.n nVar) {
            super(0);
            this.f938E = z6;
            this.f939F = nVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List listT0;
            B8.x xVar = B8.x.this;
            B8.A aC = xVar.c(xVar.f932a.e());
            if (aC != null) {
                boolean z6 = this.f938E;
                B8.x xVar2 = B8.x.this;
                p088i8.n nVar = this.f939F;
                listT0 = p097j7.AbstractC6879v.T0(z6 ? xVar2.f932a.c().d().f(aC, nVar) : xVar2.f932a.c().d().d(aC, nVar));
            } else {
                listT0 = null;
            }
            return listT0 == null ? p097j7.AbstractC6879v.m() : listT0;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p158p8.p f941E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ B8.EnumC0821b f942F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p158p8.p pVar, B8.EnumC0821b enumC0821b) {
            super(0);
            this.f941E = pVar;
            this.f942F = enumC0821b;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List listJ;
            B8.x xVar = B8.x.this;
            B8.A aC = xVar.c(xVar.f932a.e());
            if (aC != null) {
                listJ = B8.x.this.f932a.c().d().j(aC, this.f941E, this.f942F);
            } else {
                listJ = null;
            }
            return listJ == null ? p097j7.AbstractC6879v.m() : listJ;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p088i8.n f944E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D8.j f945F;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ B8.x f946D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p088i8.n f947E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ D8.j f948F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B8.x xVar, p088i8.n nVar, D8.j jVar) {
                super(0);
                this.f946D = xVar;
                this.f947E = nVar;
                this.f948F = jVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p198t8.g b() {
                B8.x xVar = this.f946D;
                B8.A aC = xVar.c(xVar.f932a.e());
                p247y7.AbstractC7350t.c(aC);
                B8.InterfaceC0822c interfaceC0822cD = this.f946D.f932a.c().d();
                p088i8.n nVar = this.f947E;
                F8.E eL = this.f948F.l();
                p247y7.AbstractC7350t.e(eL, "getReturnType(...)");
                return (p198t8.g) interfaceC0822cD.e(aC, nVar, eL);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p088i8.n nVar, D8.j jVar) {
            super(0);
            this.f944E = nVar;
            this.f945F = jVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E8.j b() {
            return B8.x.this.f932a.h().f(new B8.x.d.a(B8.x.this, this.f944E, this.f945F));
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p088i8.n f950E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D8.j f951F;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ B8.x f952D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p088i8.n f953E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ D8.j f954F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B8.x xVar, p088i8.n nVar, D8.j jVar) {
                super(0);
                this.f952D = xVar;
                this.f953E = nVar;
                this.f954F = jVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p198t8.g b() {
                B8.x xVar = this.f952D;
                B8.A aC = xVar.c(xVar.f932a.e());
                p247y7.AbstractC7350t.c(aC);
                B8.InterfaceC0822c interfaceC0822cD = this.f952D.f932a.c().d();
                p088i8.n nVar = this.f953E;
                F8.E eL = this.f954F.l();
                p247y7.AbstractC7350t.e(eL, "getReturnType(...)");
                return (p198t8.g) interfaceC0822cD.k(aC, nVar, eL);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p088i8.n nVar, D8.j jVar) {
            super(0);
            this.f950E = nVar;
            this.f951F = jVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E8.j b() {
            return B8.x.this.f932a.h().f(new B8.x.e.a(B8.x.this, this.f950E, this.f951F));
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ B8.A f956E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p158p8.p f957F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ B8.EnumC0821b f958G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f959H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p088i8.u f960I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(B8.A a6, p158p8.p pVar, B8.EnumC0821b enumC0821b, int i6, p088i8.u uVar) {
            super(0);
            this.f956E = a6;
            this.f957F = pVar;
            this.f958G = enumC0821b;
            this.f959H = i6;
            this.f960I = uVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return p097j7.AbstractC6879v.T0(B8.x.this.f932a.c().d().b(this.f956E, this.f957F, this.f958G, this.f959H, this.f960I));
        }
    }

    public x(B8.m mVar) {
        p247y7.AbstractC7350t.f(mVar, "c");
        this.f932a = mVar;
        this.f933b = new B8.C0824e(mVar.c().q(), mVar.c().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B8.A c(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m instanceof O7.K) {
            return new B8.A.b(((O7.K) interfaceC1432m).e(), this.f932a.g(), this.f932a.j(), this.f932a.d());
        }
        if (interfaceC1432m instanceof D8.d) {
            return ((D8.d) interfaceC1432m).n1();
        }
        return null;
    }

    private final P7.g d(p158p8.p pVar, int i6, B8.EnumC0821b enumC0821b) {
        return !p108k8.b.f49786c.d(i6).booleanValue() ? P7.g.f8385d.b() : new D8.n(this.f932a.h(), new B8.x.a(pVar, enumC0821b));
    }

    private final O7.X e() {
        O7.InterfaceC1432m interfaceC1432mE = this.f932a.e();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1432mE instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mE : null;
        if (interfaceC1424e != null) {
            return interfaceC1424e.S0();
        }
        return null;
    }

    private final P7.g f(p088i8.n nVar, boolean z6) {
        return !p108k8.b.f49786c.d(nVar.a0()).booleanValue() ? P7.g.f8385d.b() : new D8.n(this.f932a.h(), new B8.x.b(z6, nVar));
    }

    private final P7.g g(p158p8.p pVar, B8.EnumC0821b enumC0821b) {
        return new D8.a(this.f932a.h(), new B8.x.c(pVar, enumC0821b));
    }

    private final void h(D8.k kVar, O7.X x6, O7.X x10, java.util.List list, java.util.List list2, java.util.List list3, F8.E e6, O7.D d6, O7.AbstractC1439u abstractC1439u, java.util.Map map) {
        kVar.x1(x6, x10, list, list2, list3, e6, d6, abstractC1439u, map);
    }

    private final int k(int i6) {
        return (i6 & 63) + ((i6 >> 8) << 6);
    }

    private final O7.X n(p088i8.q qVar, B8.m mVar, O7.InterfaceC1420a interfaceC1420a, int i6) {
        return p178r8.e.b(interfaceC1420a, mVar.i().q(qVar), null, P7.g.f8385d.b(), i6);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    private final java.util.List o(java.util.List list, p158p8.p pVar, B8.EnumC0821b enumC0821b) {
        P7.g gVarB;
        O7.InterfaceC1432m interfaceC1432mE = this.f932a.e();
        p247y7.AbstractC7350t.d(interfaceC1432mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        O7.InterfaceC1420a interfaceC1420a = (O7.InterfaceC1420a) interfaceC1432mE;
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1420a.b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        B8.A aC = c(interfaceC1432mB);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        int i6 = 0;
        for (java.lang.Object obj : list2) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            p088i8.u uVar = (p088i8.u) obj;
            int iK = uVar.Q() ? uVar.K() : 0;
            if (aC != null) {
                java.lang.Boolean boolD = p108k8.b.f49786c.d(iK);
                p247y7.AbstractC7350t.e(boolD, "get(...)");
                if (boolD.booleanValue()) {
                    gVarB = new D8.n(this.f932a.h(), new B8.x.f(aC, pVar, enumC0821b, i6, uVar));
                } else {
                    gVarB = P7.g.f8385d.b();
                }
            } else {
                gVarB = P7.g.f8385d.b();
            }
            p138n8.f fVarB = B8.y.b(this.f932a.g(), uVar.L());
            F8.E eQ = this.f932a.i().q(p108k8.f.q(uVar, this.f932a.j()));
            java.lang.Boolean boolD2 = p108k8.b.f49775H.d(iK);
            p247y7.AbstractC7350t.e(boolD2, "get(...)");
            boolean zBooleanValue = boolD2.booleanValue();
            java.lang.Boolean boolD3 = p108k8.b.f49776I.d(iK);
            p247y7.AbstractC7350t.e(boolD3, "get(...)");
            boolean zBooleanValue2 = boolD3.booleanValue();
            java.lang.Boolean boolD4 = p108k8.b.f49777J.d(iK);
            p247y7.AbstractC7350t.e(boolD4, "get(...)");
            boolean zBooleanValue3 = boolD4.booleanValue();
            p088i8.q qVarT = p108k8.f.t(uVar, this.f932a.j());
            F8.E eQ2 = qVarT != null ? this.f932a.i().q(qVarT) : null;
            O7.a0 a0Var = O7.a0.f8143a;
            p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new R7.L(interfaceC1420a, null, i6, gVarB, fVarB, eQ, zBooleanValue, zBooleanValue2, zBooleanValue3, eQ2, a0Var));
            arrayList = arrayList2;
            i6 = i10;
        }
        return p097j7.AbstractC6879v.T0(arrayList);
    }

    public final O7.InterfaceC1423d i(p088i8.d dVar, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "proto");
        O7.InterfaceC1432m interfaceC1432mE = this.f932a.e();
        p247y7.AbstractC7350t.d(interfaceC1432mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) interfaceC1432mE;
        int iJ = dVar.J();
        B8.EnumC0821b enumC0821b = B8.EnumC0821b.FUNCTION;
        D8.c cVar = new D8.c(interfaceC1424e, null, d(dVar, iJ, enumC0821b), z6, O7.InterfaceC1421b.a.DECLARATION, dVar, this.f932a.g(), this.f932a.j(), this.f932a.k(), this.f932a.d(), null, 1024, null);
        B8.x xVarF = B8.m.b(this.f932a, cVar, p097j7.AbstractC6879v.m(), null, null, null, null, 60, null).f();
        java.util.List listM = dVar.M();
        p247y7.AbstractC7350t.e(listM, "getValueParameterList(...)");
        cVar.z1(xVarF.o(listM, dVar, enumC0821b), B8.C.a(B8.B.f820a, (p088i8.x) p108k8.b.f49787d.d(dVar.J())));
        cVar.p1(interfaceC1424e.w());
        cVar.f1(interfaceC1424e.R());
        cVar.h1(!p108k8.b.f49798o.d(dVar.J()).booleanValue());
        return cVar;
    }

    public final O7.Z j(p088i8.i iVar) {
        F8.E eQ;
        p247y7.AbstractC7350t.f(iVar, "proto");
        int iC0 = iVar.t0() ? iVar.c0() : k(iVar.e0());
        B8.EnumC0821b enumC0821b = B8.EnumC0821b.FUNCTION;
        P7.g gVarD = d(iVar, iC0, enumC0821b);
        P7.g gVarG = p108k8.f.g(iVar) ? g(iVar, enumC0821b) : P7.g.f8385d.b();
        D8.k kVar = new D8.k(this.f932a.e(), null, gVarD, B8.y.b(this.f932a.g(), iVar.d0()), B8.C.b(B8.B.f820a, (p088i8.j) p108k8.b.f49799p.d(iC0)), iVar, this.f932a.g(), this.f932a.j(), p247y7.AbstractC7350t.b(p218v8.c.l(this.f932a.e()).c(B8.y.b(this.f932a.g(), iVar.d0())), B8.D.f832a) ? p108k8.h.f49817b.b() : this.f932a.k(), this.f932a.d(), null, 1024, null);
        B8.m mVar = this.f932a;
        java.util.List listM0 = iVar.m0();
        p247y7.AbstractC7350t.e(listM0, "getTypeParameterList(...)");
        B8.m mVarB = B8.m.b(mVar, kVar, listM0, null, null, null, null, 60, null);
        p088i8.q qVarK = p108k8.f.k(iVar, this.f932a.j());
        O7.X xI = (qVarK == null || (eQ = mVarB.i().q(qVarK)) == null) ? null : p178r8.e.i(kVar, eQ, gVarG);
        O7.X xE = e();
        java.util.List listC = p108k8.f.c(iVar, this.f932a.j());
        java.util.List arrayList = new java.util.ArrayList();
        int i6 = 0;
        for (java.lang.Object obj : listC) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            O7.X xN = n((p088i8.q) obj, mVarB, kVar, i6);
            if (xN != null) {
                arrayList.add(xN);
            }
            i6 = i10;
        }
        java.util.List listJ = mVarB.i().j();
        B8.x xVarF = mVarB.f();
        java.util.List listQ0 = iVar.q0();
        p247y7.AbstractC7350t.e(listQ0, "getValueParameterList(...)");
        java.util.List listO = xVarF.o(listQ0, iVar, B8.EnumC0821b.FUNCTION);
        F8.E eQ2 = mVarB.i().q(p108k8.f.m(iVar, this.f932a.j()));
        B8.B b6 = B8.B.f820a;
        h(kVar, xI, xE, arrayList, listJ, listO, eQ2, b6.b((p088i8.k) p108k8.b.f49788e.d(iC0)), B8.C.a(b6, (p088i8.x) p108k8.b.f49787d.d(iC0)), p097j7.S.h());
        java.lang.Boolean boolD = p108k8.b.f49800q.d(iC0);
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        kVar.o1(boolD.booleanValue());
        java.lang.Boolean boolD2 = p108k8.b.f49801r.d(iC0);
        p247y7.AbstractC7350t.e(boolD2, "get(...)");
        kVar.l1(boolD2.booleanValue());
        java.lang.Boolean boolD3 = p108k8.b.f49804u.d(iC0);
        p247y7.AbstractC7350t.e(boolD3, "get(...)");
        kVar.g1(boolD3.booleanValue());
        java.lang.Boolean boolD4 = p108k8.b.f49802s.d(iC0);
        p247y7.AbstractC7350t.e(boolD4, "get(...)");
        kVar.n1(boolD4.booleanValue());
        java.lang.Boolean boolD5 = p108k8.b.f49803t.d(iC0);
        p247y7.AbstractC7350t.e(boolD5, "get(...)");
        kVar.r1(boolD5.booleanValue());
        java.lang.Boolean boolD6 = p108k8.b.f49805v.d(iC0);
        p247y7.AbstractC7350t.e(boolD6, "get(...)");
        kVar.q1(boolD6.booleanValue());
        java.lang.Boolean boolD7 = p108k8.b.f49806w.d(iC0);
        p247y7.AbstractC7350t.e(boolD7, "get(...)");
        kVar.f1(boolD7.booleanValue());
        kVar.h1(!p108k8.b.f49807x.d(iC0).booleanValue());
        p087i7.u uVarA = this.f932a.c().h().a(iVar, kVar, this.f932a.j(), mVarB.i());
        if (uVarA != null) {
            kVar.d1((O7.InterfaceC1420a.InterfaceC0196a) uVarA.c(), uVarA.d());
        }
        return kVar;
    }

    public final O7.U l(p088i8.n nVar) {
        p088i8.n nVar2;
        P7.g gVarB;
        D8.j jVar;
        O7.X xI;
        k8.b.d dVar;
        k8.b.d dVar2;
        D8.j jVar2;
        R7.D d6;
        R7.E e6;
        B8.x xVar;
        R7.D d10;
        F8.E eQ;
        p247y7.AbstractC7350t.f(nVar, "proto");
        int iA0 = nVar.p0() ? nVar.a0() : k(nVar.d0());
        O7.InterfaceC1432m interfaceC1432mE = this.f932a.e();
        P7.g gVarD = d(nVar, iA0, B8.EnumC0821b.PROPERTY);
        B8.B b6 = B8.B.f820a;
        O7.D dB = b6.b((p088i8.k) p108k8.b.f49788e.d(iA0));
        O7.AbstractC1439u abstractC1439uA = B8.C.a(b6, (p088i8.x) p108k8.b.f49787d.d(iA0));
        java.lang.Boolean boolD = p108k8.b.f49808y.d(iA0);
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        p138n8.f fVarB = B8.y.b(this.f932a.g(), nVar.c0());
        O7.InterfaceC1421b.a aVarB = B8.C.b(b6, (p088i8.j) p108k8.b.f49799p.d(iA0));
        java.lang.Boolean boolD2 = p108k8.b.f49770C.d(iA0);
        p247y7.AbstractC7350t.e(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        java.lang.Boolean boolD3 = p108k8.b.f49769B.d(iA0);
        p247y7.AbstractC7350t.e(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        java.lang.Boolean boolD4 = p108k8.b.f49772E.d(iA0);
        p247y7.AbstractC7350t.e(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        java.lang.Boolean boolD5 = p108k8.b.f49773F.d(iA0);
        p247y7.AbstractC7350t.e(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        java.lang.Boolean boolD6 = p108k8.b.f49774G.d(iA0);
        p247y7.AbstractC7350t.e(boolD6, "get(...)");
        D8.j jVar3 = new D8.j(interfaceC1432mE, null, gVarD, dB, abstractC1439uA, zBooleanValue, fVarB, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), nVar, this.f932a.g(), this.f932a.j(), this.f932a.k(), this.f932a.d());
        B8.m mVar = this.f932a;
        java.util.List listN0 = nVar.n0();
        p247y7.AbstractC7350t.e(listN0, "getTypeParameterList(...)");
        B8.m mVarB = B8.m.b(mVar, jVar3, listN0, null, null, null, null, 60, null);
        java.lang.Boolean boolD7 = p108k8.b.f49809z.d(iA0);
        p247y7.AbstractC7350t.e(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        if (zBooleanValue6 && p108k8.f.h(nVar)) {
            nVar2 = nVar;
            gVarB = g(nVar2, B8.EnumC0821b.PROPERTY_GETTER);
        } else {
            nVar2 = nVar;
            gVarB = P7.g.f8385d.b();
        }
        F8.E eQ2 = mVarB.i().q(p108k8.f.n(nVar2, this.f932a.j()));
        java.util.List listJ = mVarB.i().j();
        O7.X xE = e();
        p088i8.q qVarL = p108k8.f.l(nVar2, this.f932a.j());
        if (qVarL == null || (eQ = mVarB.i().q(qVarL)) == null) {
            jVar = jVar3;
            xI = null;
        } else {
            jVar = jVar3;
            xI = p178r8.e.i(jVar, eQ, gVarB);
        }
        java.util.List listD = p108k8.f.d(nVar2, this.f932a.j());
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listD, 10));
        int i6 = 0;
        for (java.lang.Object obj : listD) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            arrayList.add(n((p088i8.q) obj, mVarB, jVar, i6));
            i6 = i10;
        }
        jVar.k1(eQ2, listJ, xE, xI, arrayList);
        java.lang.Boolean boolD8 = p108k8.b.f49786c.d(iA0);
        p247y7.AbstractC7350t.e(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        k8.b.d dVar3 = p108k8.b.f49787d;
        p088i8.x xVar2 = (p088i8.x) dVar3.d(iA0);
        k8.b.d dVar4 = p108k8.b.f49788e;
        int iB = p108k8.b.b(zBooleanValue7, xVar2, (p088i8.k) dVar4.d(iA0), false, false, false);
        if (zBooleanValue6) {
            int iB0 = nVar.q0() ? nVar.b0() : iB;
            java.lang.Boolean boolD9 = p108k8.b.f49778K.d(iB0);
            p247y7.AbstractC7350t.e(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            java.lang.Boolean boolD10 = p108k8.b.f49779L.d(iB0);
            p247y7.AbstractC7350t.e(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            java.lang.Boolean boolD11 = p108k8.b.f49780M.d(iB0);
            p247y7.AbstractC7350t.e(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            P7.g gVarD2 = d(nVar2, iB0, B8.EnumC0821b.PROPERTY_GETTER);
            if (zBooleanValue8) {
                B8.B b10 = B8.B.f820a;
                dVar = dVar4;
                jVar2 = jVar;
                dVar2 = dVar3;
                d10 = new R7.D(jVar, gVarD2, b10.b((p088i8.k) dVar4.d(iB0)), B8.C.a(b10, (p088i8.x) dVar3.d(iB0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, jVar.j(), null, O7.a0.f8143a);
            } else {
                dVar = dVar4;
                dVar2 = dVar3;
                jVar2 = jVar;
                R7.D d11 = p178r8.e.d(jVar2, gVarD2);
                p247y7.AbstractC7350t.c(d11);
                d10 = d11;
            }
            d10.Y0(jVar2.l());
            d6 = d10;
        } else {
            mVarB = mVarB;
            dVar = dVar4;
            dVar2 = dVar3;
            jVar2 = jVar;
            nVar2 = nVar2;
            d6 = null;
        }
        java.lang.Boolean boolD12 = p108k8.b.f49768A.d(iA0);
        p247y7.AbstractC7350t.e(boolD12, "get(...)");
        if (boolD12.booleanValue()) {
            if (nVar.x0()) {
                iB = nVar.j0();
            }
            int i11 = iB;
            java.lang.Boolean boolD13 = p108k8.b.f49778K.d(i11);
            p247y7.AbstractC7350t.e(boolD13, "get(...)");
            boolean zBooleanValue11 = boolD13.booleanValue();
            java.lang.Boolean boolD14 = p108k8.b.f49779L.d(i11);
            p247y7.AbstractC7350t.e(boolD14, "get(...)");
            boolean zBooleanValue12 = boolD14.booleanValue();
            java.lang.Boolean boolD15 = p108k8.b.f49780M.d(i11);
            p247y7.AbstractC7350t.e(boolD15, "get(...)");
            boolean zBooleanValue13 = boolD15.booleanValue();
            B8.EnumC0821b enumC0821b = B8.EnumC0821b.PROPERTY_SETTER;
            P7.g gVarD3 = d(nVar2, i11, enumC0821b);
            if (zBooleanValue11) {
                B8.B b11 = B8.B.f820a;
                R7.E e10 = new R7.E(jVar2, gVarD3, b11.b((p088i8.k) dVar.d(i11)), B8.C.a(b11, (p088i8.x) dVar2.d(i11)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, jVar2.j(), null, O7.a0.f8143a);
                e10.Z0((O7.j0) p097j7.AbstractC6879v.G0(B8.m.b(mVarB, e10, p097j7.AbstractC6879v.m(), null, null, null, null, 60, null).f().o(p097j7.AbstractC6879v.e(nVar.k0()), nVar2, enumC0821b)));
                e6 = e10;
            } else {
                e6 = p178r8.e.e(jVar2, gVarD3, P7.g.f8385d.b());
                p247y7.AbstractC7350t.c(e6);
            }
        } else {
            e6 = null;
        }
        java.lang.Boolean boolD16 = p108k8.b.f49771D.d(iA0);
        p247y7.AbstractC7350t.e(boolD16, "get(...)");
        if (boolD16.booleanValue()) {
            xVar = this;
            jVar2.U0(xVar.new d(nVar2, jVar2));
        } else {
            xVar = this;
        }
        O7.InterfaceC1432m interfaceC1432mE2 = xVar.f932a.e();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1432mE2 instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mE2 : null;
        if ((interfaceC1424e != null ? interfaceC1424e.j() : null) == O7.EnumC1425f.ANNOTATION_CLASS) {
            jVar2.U0(xVar.new e(nVar2, jVar2));
        }
        jVar2.e1(d6, e6, new R7.o(xVar.f(nVar2, false), jVar2), new R7.o(xVar.f(nVar2, true), jVar2));
        return jVar2;
    }

    public final O7.e0 m(p088i8.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "proto");
        P7.g.a aVar = P7.g.f8385d;
        java.util.List listQ = rVar.Q();
        p247y7.AbstractC7350t.e(listQ, "getAnnotationList(...)");
        java.util.List<p088i8.b> list = listQ;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        for (p088i8.b bVar : list) {
            B8.C0824e c0824e = this.f933b;
            p247y7.AbstractC7350t.c(bVar);
            arrayList.add(c0824e.a(bVar, this.f932a.g()));
        }
        D8.l lVar = new D8.l(this.f932a.h(), this.f932a.e(), aVar.a(arrayList), B8.y.b(this.f932a.g(), rVar.W()), B8.C.a(B8.B.f820a, (p088i8.x) p108k8.b.f49787d.d(rVar.V())), rVar, this.f932a.g(), this.f932a.j(), this.f932a.k(), this.f932a.d());
        B8.m mVar = this.f932a;
        java.util.List listZ = rVar.Z();
        p247y7.AbstractC7350t.e(listZ, "getTypeParameterList(...)");
        B8.m mVarB = B8.m.b(mVar, lVar, listZ, null, null, null, null, 60, null);
        lVar.Z0(mVarB.i().j(), mVarB.i().l(p108k8.f.r(rVar, this.f932a.j()), false), mVarB.i().l(p108k8.f.e(rVar, this.f932a.j()), false));
        return lVar;
    }
}
