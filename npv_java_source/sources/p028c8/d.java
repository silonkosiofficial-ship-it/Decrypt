package p028c8;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p008a8.g f24445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p008a8.k f24446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p028c8.f f24447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.h0 f24448d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ O7.f0 f24450E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p028c8.a f24451F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ F8.e0 f24452G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p048e8.j f24453H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O7.f0 f0Var, p028c8.a aVar, F8.e0 e0Var, p048e8.j jVar) {
            super(0);
            this.f24450E = f0Var;
            this.f24451F = aVar;
            this.f24452G = e0Var;
            this.f24453H = jVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E b() {
            F8.h0 h0Var = p028c8.d.this.f24448d;
            O7.f0 f0Var = this.f24450E;
            p028c8.a aVar = this.f24451F;
            O7.InterfaceC1427h interfaceC1427hW = this.f24452G.w();
            return h0Var.c(f0Var, aVar.k(interfaceC1427hW != null ? interfaceC1427hW.w() : null).j(this.f24453H.B()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(p008a8.g gVar, p008a8.k kVar) {
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(kVar, "typeParameterResolver");
        this.f24445a = gVar;
        this.f24446b = kVar;
        p028c8.f fVar = new p028c8.f();
        this.f24447c = fVar;
        this.f24448d = new F8.h0(fVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(p048e8.j jVar, O7.InterfaceC1424e interfaceC1424e) {
        F8.u0 u0VarS;
        if (!p048e8.A.a((p048e8.x) p097j7.AbstractC6879v.v0(jVar.K()))) {
            return false;
        }
        java.util.List listX = N7.d.f7840a.b(interfaceC1424e).p().x();
        p247y7.AbstractC7350t.e(listX, "getParameters(...)");
        O7.f0 f0Var = (O7.f0) p097j7.AbstractC6879v.v0(listX);
        return (f0Var == null || (u0VarS = f0Var.s()) == null || u0VarS == F8.u0.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private final java.util.List c(p048e8.j jVar, p028c8.a aVar, F8.e0 e0Var) {
        boolean z6 = true;
        if (!jVar.B()) {
            if (jVar.K().isEmpty()) {
                java.util.List listX = e0Var.x();
                p247y7.AbstractC7350t.e(listX, "getParameters(...)");
                if (!(!listX.isEmpty())) {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
        }
        java.util.List listX2 = e0Var.x();
        p247y7.AbstractC7350t.e(listX2, "getParameters(...)");
        if (z6) {
            return d(jVar, listX2, e0Var, aVar);
        }
        if (listX2.size() != jVar.K().size()) {
            java.util.List<O7.f0> list = listX2;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (O7.f0 f0Var : list) {
                H8.j jVar2 = H8.j.f4524y0;
                java.lang.String strG = f0Var.getName().g();
                p247y7.AbstractC7350t.e(strG, "asString(...)");
                arrayList.add(new F8.k0(H8.k.d(jVar2, strG)));
            }
            return p097j7.AbstractC6879v.T0(arrayList);
        }
        java.lang.Iterable<p097j7.L> iterableA1 = p097j7.AbstractC6879v.a1(jVar.K());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterableA1, 10));
        for (p097j7.L l6 : iterableA1) {
            int iA = l6.a();
            p048e8.x xVar = (p048e8.x) l6.b();
            listX2.size();
            O7.f0 f0Var2 = (O7.f0) listX2.get(iA);
            p028c8.a aVarB = p028c8.b.b(F8.p0.COMMON, false, false, null, 7, null);
            p247y7.AbstractC7350t.c(f0Var2);
            arrayList2.add(p(xVar, aVarB, f0Var2));
        }
        return p097j7.AbstractC6879v.T0(arrayList2);
    }

    private final java.util.List d(p048e8.j jVar, java.util.List list, F8.e0 e0Var, p028c8.a aVar) {
        java.util.List<O7.f0> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        for (O7.f0 f0Var : list2) {
            arrayList.add(K8.a.l(f0Var, null, aVar.c()) ? F8.q0.t(f0Var, aVar) : this.f24447c.a(f0Var, aVar.j(jVar.B()), this.f24448d, new F8.H(this.f24445a.e(), new c8.d.a(f0Var, aVar, e0Var, jVar))));
        }
        return arrayList;
    }

    private final F8.M e(p048e8.j jVar, p028c8.a aVar, F8.M m6) {
        F8.a0 a0VarB;
        if (m6 == null || (a0VarB = m6.V0()) == null) {
            a0VarB = F8.b0.b(new p008a8.d(this.f24445a, jVar, false, 4, null));
        }
        F8.a0 a0Var = a0VarB;
        F8.e0 e0VarF = f(jVar, aVar);
        if (e0VarF == null) {
            return null;
        }
        boolean zI = i(aVar);
        return (p247y7.AbstractC7350t.b(m6 != null ? m6.W0() : null, e0VarF) && !jVar.B() && zI) ? m6.a1(true) : F8.F.l(a0Var, e0VarF, c(jVar, aVar, e0VarF), zI, null, 16, null);
    }

    private final F8.e0 f(p048e8.j jVar, p028c8.a aVar) {
        F8.e0 e0VarP;
        p048e8.i iVarB = jVar.b();
        if (iVarB == null) {
            return g(jVar);
        }
        if (!(iVarB instanceof p048e8.g)) {
            if (iVarB instanceof p048e8.y) {
                O7.f0 f0VarA = this.f24446b.a((p048e8.y) iVarB);
                if (f0VarA != null) {
                    return f0VarA.p();
                }
                return null;
            }
            throw new java.lang.IllegalStateException("Unknown classifier kind: " + iVarB);
        }
        p048e8.g gVar = (p048e8.g) iVarB;
        p138n8.c cVarE = gVar.e();
        if (cVarE != null) {
            O7.InterfaceC1424e interfaceC1424eJ = j(jVar, aVar, cVarE);
            if (interfaceC1424eJ == null) {
                interfaceC1424eJ = this.f24445a.a().n().a(gVar);
            }
            return (interfaceC1424eJ == null || (e0VarP = interfaceC1424eJ.p()) == null) ? g(jVar) : e0VarP;
        }
        throw new java.lang.AssertionError("Class type should have a FQ name: " + iVarB);
    }

    private final F8.e0 g(p048e8.j jVar) {
        p138n8.b bVarM = p138n8.b.m(new p138n8.c(jVar.C()));
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        F8.e0 e0VarP = this.f24445a.a().b().d().r().d(bVarM, p097j7.AbstractC6879v.e(0)).p();
        p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
        return e0VarP;
    }

    private final boolean h(F8.u0 u0Var, O7.f0 f0Var) {
        return (f0Var.s() == F8.u0.INVARIANT || u0Var == f0Var.s()) ? false : true;
    }

    private final boolean i(p028c8.a aVar) {
        return (aVar.g() == p028c8.c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == F8.p0.SUPERTYPE) ? false : true;
    }

    private final O7.InterfaceC1424e j(p048e8.j jVar, p028c8.a aVar, p138n8.c cVar) {
        if (aVar.h() && p247y7.AbstractC7350t.b(cVar, p028c8.e.f24454a)) {
            return this.f24445a.a().p().c();
        }
        N7.d dVar = N7.d.f7840a;
        O7.InterfaceC1424e interfaceC1424eF = N7.d.f(dVar, cVar, this.f24445a.d().t(), null, 4, null);
        if (interfaceC1424eF == null) {
            return null;
        }
        return (dVar.d(interfaceC1424eF) && (aVar.g() == p028c8.c.FLEXIBLE_LOWER_BOUND || aVar.b() == F8.p0.SUPERTYPE || b(jVar, interfaceC1424eF))) ? dVar.b(interfaceC1424eF) : interfaceC1424eF;
    }

    public static /* synthetic */ F8.E l(p028c8.d dVar, p048e8.f fVar, p028c8.a aVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return dVar.k(fVar, aVar, z6);
    }

    private final F8.E m(p048e8.j jVar, p028c8.a aVar) {
        F8.M mE;
        boolean z6 = (aVar.h() || aVar.b() == F8.p0.SUPERTYPE) ? false : true;
        boolean zB = jVar.B();
        if (!zB && !z6) {
            F8.M mE2 = e(jVar, aVar, null);
            return mE2 != null ? mE2 : n(jVar);
        }
        F8.M mE3 = e(jVar, aVar.l(p028c8.c.FLEXIBLE_LOWER_BOUND), null);
        if (mE3 != null && (mE = e(jVar, aVar.l(p028c8.c.FLEXIBLE_UPPER_BOUND), mE3)) != null) {
            return zB ? new p028c8.h(mE3, mE) : F8.F.d(mE3, mE);
        }
        return n(jVar);
    }

    private static final H8.h n(p048e8.j jVar) {
        return H8.k.d(H8.j.f4450H, jVar.s());
    }

    private final F8.i0 p(p048e8.x xVar, p028c8.a aVar, O7.f0 f0Var) {
        F8.i0 i0VarT;
        if (!(xVar instanceof p048e8.C)) {
            return new F8.k0(F8.u0.INVARIANT, o(xVar, aVar));
        }
        p048e8.C c6 = (p048e8.C) xVar;
        p048e8.x xVarG = c6.G();
        F8.u0 u0Var = c6.P() ? F8.u0.OUT_VARIANCE : F8.u0.IN_VARIANCE;
        if (xVarG == null || h(u0Var, f0Var)) {
            i0VarT = F8.q0.t(f0Var, aVar);
        } else {
            P7.c cVarA = X7.J.a(this.f24445a, c6);
            F8.E eO = o(xVarG, p028c8.b.b(F8.p0.COMMON, false, false, null, 7, null));
            if (cVarA != null) {
                eO = K8.a.x(eO, P7.g.f8385d.a(p097j7.AbstractC6879v.B0(eO.k(), cVarA)));
            }
            i0VarT = K8.a.f(eO, u0Var, f0Var);
        }
        p247y7.AbstractC7350t.c(i0VarT);
        return i0VarT;
    }

    public final F8.E k(p048e8.f fVar, p028c8.a aVar, boolean z6) {
        p247y7.AbstractC7350t.f(fVar, "arrayType");
        p247y7.AbstractC7350t.f(aVar, "attr");
        p048e8.x xVarP = fVar.p();
        p048e8.v vVar = xVarP instanceof p048e8.v ? (p048e8.v) xVarP : null;
        L7.h type = vVar != null ? vVar.getType() : null;
        p008a8.d dVar = new p008a8.d(this.f24445a, fVar, true);
        if (type != null) {
            F8.M mO = this.f24445a.d().t().O(type);
            p247y7.AbstractC7350t.c(mO);
            F8.E eX = K8.a.x(mO, new P7.k(mO.k(), dVar));
            p247y7.AbstractC7350t.d(eX, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            F8.M m6 = (F8.M) eX;
            return aVar.h() ? m6 : F8.F.d(m6, m6.a1(true));
        }
        F8.E eO = o(xVarP, p028c8.b.b(F8.p0.COMMON, aVar.h(), false, null, 6, null));
        if (aVar.h()) {
            F8.M m10 = this.f24445a.d().t().m(z6 ? F8.u0.OUT_VARIANCE : F8.u0.INVARIANT, eO, dVar);
            p247y7.AbstractC7350t.e(m10, "getArrayType(...)");
            return m10;
        }
        F8.M m11 = this.f24445a.d().t().m(F8.u0.INVARIANT, eO, dVar);
        p247y7.AbstractC7350t.e(m11, "getArrayType(...)");
        return F8.F.d(m11, this.f24445a.d().t().m(F8.u0.OUT_VARIANCE, eO, dVar).a1(true));
    }

    public final F8.E o(p048e8.x xVar, p028c8.a aVar) {
        F8.E eO;
        p247y7.AbstractC7350t.f(aVar, "attr");
        if (xVar instanceof p048e8.v) {
            L7.h type = ((p048e8.v) xVar).getType();
            F8.M mR = type != null ? this.f24445a.d().t().R(type) : this.f24445a.d().t().Z();
            p247y7.AbstractC7350t.c(mR);
            return mR;
        }
        if (xVar instanceof p048e8.j) {
            return m((p048e8.j) xVar, aVar);
        }
        if (xVar instanceof p048e8.f) {
            return l(this, (p048e8.f) xVar, aVar, false, 4, null);
        }
        if (xVar instanceof p048e8.C) {
            p048e8.x xVarG = ((p048e8.C) xVar).G();
            if (xVarG != null && (eO = o(xVarG, aVar)) != null) {
                return eO;
            }
        } else if (xVar != null) {
            throw new java.lang.UnsupportedOperationException("Unsupported type: " + xVar);
        }
        F8.M mY = this.f24445a.d().t().y();
        p247y7.AbstractC7350t.e(mY, "getDefaultBound(...)");
        return mY;
    }
}
