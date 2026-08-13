package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.m f834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.E f835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p237x7.l f839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Map f840g;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final O7.InterfaceC1427h a(int i6) {
            return B8.E.this.d(i6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p088i8.q f843E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p088i8.q qVar) {
            super(0);
            this.f843E = qVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return B8.E.this.f834a.c().d().g(this.f843E, B8.E.this.f834a.g());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final O7.InterfaceC1427h a(int i6) {
            return B8.E.this.f(i6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    /* synthetic */ class d extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final B8.E.d f845L = new B8.E.d();

        d() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "getOuterClassId";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(p138n8.b.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final p138n8.b l(p138n8.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "p0");
            return bVar.g();
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p088i8.q l(p088i8.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "it");
            return p108k8.f.j(qVar, B8.E.this.f834a.j());
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final B8.E.f f847D = new B8.E.f();

        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer l(p088i8.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "it");
            return java.lang.Integer.valueOf(qVar.U());
        }
    }

    public E(B8.m mVar, B8.E e6, java.util.List list, java.lang.String str, java.lang.String str2) {
        java.util.Map linkedHashMap;
        p247y7.AbstractC7350t.f(mVar, "c");
        p247y7.AbstractC7350t.f(list, "typeParameterProtos");
        p247y7.AbstractC7350t.f(str, "debugName");
        p247y7.AbstractC7350t.f(str2, "containerPresentableName");
        this.f834a = mVar;
        this.f835b = e6;
        this.f836c = str;
        this.f837d = str2;
        this.f838e = mVar.h().h(new B8.E.a());
        this.f839f = mVar.h().h(new B8.E.c());
        if (list.isEmpty()) {
            linkedHashMap = p097j7.S.h();
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = list.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                p088i8.s sVar = (p088i8.s) it.next();
                linkedHashMap.put(java.lang.Integer.valueOf(sVar.M()), new D8.m(this.f834a, sVar, i6));
                i6++;
            }
        }
        this.f840g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1427h d(int i6) {
        p138n8.b bVarA = B8.y.a(this.f834a.g(), i6);
        return bVarA.k() ? this.f834a.c().b(bVarA) : O7.AbstractC1442x.b(this.f834a.c().q(), bVarA);
    }

    private final F8.M e(int i6) {
        if (B8.y.a(this.f834a.g(), i6).k()) {
            return this.f834a.c().o().a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1427h f(int i6) {
        p138n8.b bVarA = B8.y.a(this.f834a.g(), i6);
        if (bVarA.k()) {
            return null;
        }
        return O7.AbstractC1442x.d(this.f834a.c().q(), bVarA);
    }

    private final F8.M g(F8.E e6, F8.E e10) {
        L7.g gVarI = K8.a.i(e6);
        P7.g gVarK = e6.k();
        F8.E eK = L7.f.k(e6);
        java.util.List listE = L7.f.e(e6);
        java.util.List listD0 = p097j7.AbstractC6879v.d0(L7.f.m(e6), 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listD0, 10));
        java.util.Iterator it = listD0.iterator();
        while (it.hasNext()) {
            arrayList.add(((F8.i0) it.next()).getType());
        }
        return L7.f.b(gVarI, gVarK, eK, listE, arrayList, null, e10, true).a1(e6.X0());
    }

    private final F8.M h(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6) {
        F8.M mI;
        int size;
        int size2 = e0Var.x().size() - list.size();
        if (size2 != 0) {
            mI = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                F8.e0 e0VarP = e0Var.t().X(size).p();
                p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
                mI = F8.F.l(a0Var, e0VarP, list, z6, null, 16, null);
            }
        } else {
            mI = i(a0Var, e0Var, list, z6);
        }
        return mI == null ? H8.k.f4528a.f(H8.j.f4517r0, list, e0Var, new java.lang.String[0]) : mI;
    }

    private final F8.M i(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6) {
        F8.M mL = F8.F.l(a0Var, e0Var, list, z6, null, 16, null);
        if (L7.f.q(mL)) {
            return p(mL);
        }
        return null;
    }

    private final O7.f0 k(int i6) {
        O7.f0 f0Var = (O7.f0) this.f840g.get(java.lang.Integer.valueOf(i6));
        if (f0Var != null) {
            return f0Var;
        }
        B8.E e6 = this.f835b;
        if (e6 != null) {
            return e6.k(i6);
        }
        return null;
    }

    private static final java.util.List m(p088i8.q qVar, B8.E e6) {
        java.util.List listV = qVar.V();
        p247y7.AbstractC7350t.e(listV, "getArgumentList(...)");
        java.util.List list = listV;
        p088i8.q qVarJ = p108k8.f.j(qVar, e6.f834a.j());
        java.util.List listM = qVarJ != null ? m(qVarJ, e6) : null;
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        return p097j7.AbstractC6879v.C0(list, listM);
    }

    public static /* synthetic */ F8.M n(B8.E e6, p088i8.q qVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        return e6.l(qVar, z6);
    }

    private final F8.a0 o(java.util.List list, P7.g gVar, F8.e0 e0Var, O7.InterfaceC1432m interfaceC1432m) {
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((F8.Z) it.next()).a(gVar, e0Var, interfaceC1432m));
        }
        return F8.a0.f2872D.h(p097j7.AbstractC6879v.z(arrayList));
    }

    private final F8.M p(F8.E e6) {
        F8.E type;
        F8.i0 i0Var = (F8.i0) p097j7.AbstractC6879v.v0(L7.f.m(e6));
        if (i0Var == null || (type = i0Var.getType()) == null) {
            return null;
        }
        O7.InterfaceC1427h interfaceC1427hW = type.W0().w();
        p138n8.c cVarL = interfaceC1427hW != null ? p218v8.c.l(interfaceC1427hW) : null;
        if (type.U0().size() != 1 || (!p247y7.AbstractC7350t.b(cVarL, L7.j.f6320t) && !p247y7.AbstractC7350t.b(cVarL, B8.F.f848a))) {
            return (F8.M) e6;
        }
        F8.E type2 = ((F8.i0) p097j7.AbstractC6879v.G0(type.U0())).getType();
        p247y7.AbstractC7350t.e(type2, "getType(...)");
        O7.InterfaceC1432m interfaceC1432mE = this.f834a.e();
        O7.InterfaceC1420a interfaceC1420a = interfaceC1432mE instanceof O7.InterfaceC1420a ? (O7.InterfaceC1420a) interfaceC1432mE : null;
        p247y7.AbstractC7350t.b(interfaceC1420a != null ? p218v8.c.h(interfaceC1420a) : null, B8.D.f832a);
        return g(e6, type2);
    }

    private final F8.i0 r(O7.f0 f0Var, i8.q.b bVar) {
        if (bVar.x() == i8.q.b.c.STAR) {
            return f0Var == null ? new F8.S(this.f834a.c().q().t()) : new F8.T(f0Var);
        }
        B8.B b6 = B8.B.f820a;
        i8.q.b.c cVarX = bVar.x();
        p247y7.AbstractC7350t.e(cVarX, "getProjection(...)");
        F8.u0 u0VarC = b6.c(cVarX);
        p088i8.q qVarP = p108k8.f.p(bVar, this.f834a.j());
        return qVarP == null ? new F8.k0(H8.k.d(H8.j.f4491b1, bVar.toString())) : new F8.k0(u0VarC, q(qVarP));
    }

    private final F8.e0 s(p088i8.q qVar) {
        O7.InterfaceC1427h interfaceC1427hK;
        int iH0;
        java.lang.Object next;
        if (qVar.m0()) {
            interfaceC1427hK = (O7.InterfaceC1427h) this.f838e.l(java.lang.Integer.valueOf(qVar.W()));
            if (interfaceC1427hK == null) {
                iH0 = qVar.W();
                interfaceC1427hK = t(this, qVar, iH0);
            }
        } else if (qVar.v0()) {
            interfaceC1427hK = k(qVar.i0());
            if (interfaceC1427hK == null) {
                return H8.k.f4528a.e(H8.j.f4515p0, java.lang.String.valueOf(qVar.i0()), this.f837d);
            }
        } else if (qVar.w0()) {
            java.lang.String string = this.f834a.g().getString(qVar.j0());
            java.util.Iterator it = j().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p247y7.AbstractC7350t.b(((O7.f0) next).getName().g(), string));
            interfaceC1427hK = (O7.f0) next;
            if (interfaceC1427hK == null) {
                return H8.k.f4528a.e(H8.j.f4516q0, string, this.f834a.e().toString());
            }
        } else {
            if (!qVar.u0()) {
                return H8.k.f4528a.e(H8.j.f4519t0, new java.lang.String[0]);
            }
            interfaceC1427hK = (O7.InterfaceC1427h) this.f839f.l(java.lang.Integer.valueOf(qVar.h0()));
            if (interfaceC1427hK == null) {
                iH0 = qVar.h0();
                interfaceC1427hK = t(this, qVar, iH0);
            }
        }
        F8.e0 e0VarP = interfaceC1427hK.p();
        p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
        return e0VarP;
    }

    private static final O7.InterfaceC1424e t(B8.E e6, p088i8.q qVar, int i6) {
        p138n8.b bVarA = B8.y.a(e6.f834a.g(), i6);
        java.util.List listN = R8.k.N(R8.k.G(R8.k.n(qVar, e6.new e()), B8.E.f.f847D));
        int iU = R8.k.u(R8.k.n(bVarA, B8.E.d.f845L));
        while (listN.size() < iU) {
            listN.add(0);
        }
        return e6.f834a.c().r().d(bVarA, listN);
    }

    public final java.util.List j() {
        return p097j7.AbstractC6879v.T0(this.f840g.values());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
    /* JADX WARN: Code duplicated, block: B:42:0x0147  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0149, please report this as an issue */
    public final F8.M l(p088i8.q qVar, boolean z6) {
        F8.M mE;
        int iH0;
        F8.e0 e0VarS;
        F8.a0 a0VarO;
        java.util.ArrayList arrayList;
        int i6;
        java.util.List listT0;
        java.lang.Boolean boolD;
        F8.M mL;
        java.lang.Boolean boolD2;
        F8.C0954o c0954oC;
        F8.M mJ;
        p247y7.AbstractC7350t.f(qVar, "proto");
        if (!qVar.m0()) {
            if (qVar.u0()) {
                iH0 = qVar.h0();
            } else {
                mE = null;
            }
            if (mE != null) {
                return mE;
            }
            e0VarS = s(qVar);
            if (H8.k.m(e0VarS.w())) {
                return H8.k.f4528a.c(H8.j.f4481W0, e0VarS, e0VarS.toString());
            }
            D8.a aVar = new D8.a(this.f834a.h(), new B8.E.b(qVar));
            a0VarO = o(this.f834a.c().v(), aVar, e0VarS, this.f834a.e());
            java.util.List listM = m(qVar, this);
            arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listM, 10));
            i6 = 0;
            for (java.lang.Object obj : listM) {
                int i10 = i6 + 1;
                if (i6 < 0) {
                    p097j7.AbstractC6879v.w();
                }
                java.util.List listX = e0VarS.x();
                p247y7.AbstractC7350t.e(listX, "getParameters(...)");
                arrayList.add(r((O7.f0) p097j7.AbstractC6879v.l0(listX, i6), (i8.q.b) obj));
                i6 = i10;
            }
            listT0 = p097j7.AbstractC6879v.T0(arrayList);
            O7.InterfaceC1427h interfaceC1427hW = e0VarS.w();
            if (z6 || !(interfaceC1427hW instanceof O7.e0)) {
                boolD = p108k8.b.f49784a.d(qVar.Z());
                p247y7.AbstractC7350t.e(boolD, "get(...)");
                if (boolD.booleanValue()) {
                    mL = h(a0VarO, e0VarS, listT0, qVar.d0());
                } else {
                    mL = F8.F.l(a0VarO, e0VarS, listT0, qVar.d0(), null, 16, null);
                    boolD2 = p108k8.b.f49785b.d(qVar.Z());
                    p247y7.AbstractC7350t.e(boolD2, "get(...)");
                    if (boolD2.booleanValue()) {
                        c0954oC = F8.C0954o.a.c(F8.C0954o.f2958F, mL, true, false, 4, null);
                        if (c0954oC == null) {
                            throw new java.lang.IllegalStateException(("null DefinitelyNotNullType for '" + mL + '\'').toString());
                        }
                        mL = c0954oC;
                    }
                }
            } else {
                F8.M mB = F8.F.b((O7.e0) interfaceC1427hW, listT0);
                mL = mB.a1(F8.G.b(mB) || qVar.d0()).c1(o(this.f834a.c().v(), P7.g.f8385d.a(p097j7.AbstractC6879v.A0(aVar, mB.k())), e0VarS, this.f834a.e()));
            }
            p088i8.q qVarA = p108k8.f.a(qVar, this.f834a.j());
            return (qVarA == null || (mJ = F8.Q.j(mL, l(qVarA, false))) == null) ? mL : mJ;
        }
        iH0 = qVar.W();
        mE = e(iH0);
        if (mE != null) {
            return mE;
        }
        e0VarS = s(qVar);
        if (H8.k.m(e0VarS.w())) {
            return H8.k.f4528a.c(H8.j.f4481W0, e0VarS, e0VarS.toString());
        }
        D8.a aVar2 = new D8.a(this.f834a.h(), new B8.E.b(qVar));
        a0VarO = o(this.f834a.c().v(), aVar2, e0VarS, this.f834a.e());
        java.util.List listM2 = m(qVar, this);
        arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listM2, 10));
        i6 = 0;
        while (r5.hasNext()) {
            int i11 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            java.util.List listX2 = e0VarS.x();
            p247y7.AbstractC7350t.e(listX2, "getParameters(...)");
            arrayList.add(r((O7.f0) p097j7.AbstractC6879v.l0(listX2, i6), (i8.q.b) obj));
            i6 = i11;
        }
        listT0 = p097j7.AbstractC6879v.T0(arrayList);
        O7.InterfaceC1427h interfaceC1427hW2 = e0VarS.w();
        if (z6) {
            boolD = p108k8.b.f49784a.d(qVar.Z());
            p247y7.AbstractC7350t.e(boolD, "get(...)");
            if (boolD.booleanValue()) {
                mL = h(a0VarO, e0VarS, listT0, qVar.d0());
            } else {
                mL = F8.F.l(a0VarO, e0VarS, listT0, qVar.d0(), null, 16, null);
                boolD2 = p108k8.b.f49785b.d(qVar.Z());
                p247y7.AbstractC7350t.e(boolD2, "get(...)");
                if (boolD2.booleanValue()) {
                    c0954oC = F8.C0954o.a.c(F8.C0954o.f2958F, mL, true, false, 4, null);
                    if (c0954oC == null) {
                        throw new java.lang.IllegalStateException(("null DefinitelyNotNullType for '" + mL + '\'').toString());
                    }
                    mL = c0954oC;
                }
            }
        } else {
            boolD = p108k8.b.f49784a.d(qVar.Z());
            p247y7.AbstractC7350t.e(boolD, "get(...)");
            if (boolD.booleanValue()) {
                mL = h(a0VarO, e0VarS, listT0, qVar.d0());
            } else {
                mL = F8.F.l(a0VarO, e0VarS, listT0, qVar.d0(), null, 16, null);
                boolD2 = p108k8.b.f49785b.d(qVar.Z());
                p247y7.AbstractC7350t.e(boolD2, "get(...)");
                if (boolD2.booleanValue()) {
                    c0954oC = F8.C0954o.a.c(F8.C0954o.f2958F, mL, true, false, 4, null);
                    if (c0954oC == null) {
                        throw new java.lang.IllegalStateException(("null DefinitelyNotNullType for '" + mL + '\'').toString());
                    }
                    mL = c0954oC;
                }
            }
        }
        p088i8.q qVarA2 = p108k8.f.a(qVar, this.f834a.j());
        if (qVarA2 == null) {
            return mL;
        }
    }

    public final F8.E q(p088i8.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "proto");
        if (!qVar.o0()) {
            return l(qVar, true);
        }
        java.lang.String string = this.f834a.g().getString(qVar.a0());
        F8.M mN = n(this, qVar, false, 2, null);
        p088i8.q qVarF = p108k8.f.f(qVar, this.f834a.j());
        p247y7.AbstractC7350t.c(qVarF);
        return this.f834a.c().m().a(qVar, string, mN, n(this, qVarF, false, 2, null));
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f836c);
        if (this.f835b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f835b.f836c;
        }
        sb.append(str);
        return sb.toString();
    }
}
