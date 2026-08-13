package R7;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends R7.p implements R7.I {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final E8.n f9556g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final O7.e0 f9557h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final E8.j f9558i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private O7.InterfaceC1423d f9559j0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f9555l0 = {p247y7.P.j(new p247y7.G(p247y7.P.b(R7.J.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final R7.J.a f9554k0 = new R7.J.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final F8.n0 c(O7.e0 e0Var) {
            if (e0Var.v() == null) {
                return null;
            }
            return F8.n0.f(e0Var.c0());
        }

        public final R7.I b(E8.n nVar, O7.e0 e0Var, O7.InterfaceC1423d interfaceC1423d) {
            O7.InterfaceC1423d interfaceC1423dC;
            java.util.List listM;
            p247y7.AbstractC7350t.f(nVar, "storageManager");
            p247y7.AbstractC7350t.f(e0Var, "typeAliasDescriptor");
            p247y7.AbstractC7350t.f(interfaceC1423d, "constructor");
            F8.n0 n0VarC = c(e0Var);
            if (n0VarC == null || (interfaceC1423dC = interfaceC1423d.c(n0VarC)) == null) {
                return null;
            }
            P7.g gVarK = interfaceC1423d.k();
            O7.InterfaceC1421b.a aVarJ = interfaceC1423d.j();
            p247y7.AbstractC7350t.e(aVarJ, "getKind(...)");
            O7.a0 a0VarO = e0Var.o();
            p247y7.AbstractC7350t.e(a0VarO, "getSource(...)");
            R7.J j6 = new R7.J(nVar, e0Var, interfaceC1423dC, null, gVarK, aVarJ, a0VarO, null);
            java.util.List listX0 = R7.p.X0(j6, interfaceC1423d.n(), n0VarC);
            if (listX0 == null) {
                return null;
            }
            F8.M mC = F8.B.c(interfaceC1423dC.l().Z0());
            F8.M mW = e0Var.w();
            p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
            F8.M mJ = F8.Q.j(mC, mW);
            O7.X xM0 = interfaceC1423d.m0();
            O7.X xI = xM0 != null ? p178r8.e.i(j6, n0VarC.n(xM0.getType(), F8.u0.INVARIANT), P7.g.f8385d.b()) : null;
            O7.InterfaceC1424e interfaceC1424eV = e0Var.v();
            if (interfaceC1424eV != null) {
                java.util.List listA0 = interfaceC1423d.A0();
                p247y7.AbstractC7350t.e(listA0, "getContextReceiverParameters(...)");
                java.util.List list = listA0;
                listM = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                int i6 = 0;
                for (java.lang.Object obj : list) {
                    int i10 = i6 + 1;
                    if (i6 < 0) {
                        p097j7.AbstractC6879v.w();
                    }
                    O7.X x6 = (O7.X) obj;
                    F8.E eN = n0VarC.n(x6.getType(), F8.u0.INVARIANT);
                    p257z8.g value = x6.getValue();
                    p247y7.AbstractC7350t.d(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listM.add(p178r8.e.c(interfaceC1424eV, eN, ((p257z8.f) value).a(), P7.g.f8385d.b(), i6));
                    i6 = i10;
                }
            } else {
                listM = p097j7.AbstractC6879v.m();
            }
            j6.a1(xI, null, listM, e0Var.A(), listX0, mJ, O7.D.FINAL, e0Var.h());
            return j6;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1423d f9561E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O7.InterfaceC1423d interfaceC1423d) {
            super(0);
            this.f9561E = interfaceC1423d;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R7.J b() {
            E8.n nVarP0 = R7.J.this.p0();
            O7.e0 e0VarX1 = R7.J.this.x1();
            O7.InterfaceC1423d interfaceC1423d = this.f9561E;
            R7.J j6 = R7.J.this;
            P7.g gVarK = interfaceC1423d.k();
            O7.InterfaceC1421b.a aVarJ = this.f9561E.j();
            p247y7.AbstractC7350t.e(aVarJ, "getKind(...)");
            O7.a0 a0VarO = R7.J.this.x1().o();
            p247y7.AbstractC7350t.e(a0VarO, "getSource(...)");
            R7.J j10 = new R7.J(nVarP0, e0VarX1, interfaceC1423d, j6, gVarK, aVarJ, a0VarO, null);
            R7.J j11 = R7.J.this;
            O7.InterfaceC1423d interfaceC1423d2 = this.f9561E;
            F8.n0 n0VarC = R7.J.f9554k0.c(j11.x1());
            if (n0VarC == null) {
                return null;
            }
            O7.X xM0 = interfaceC1423d2.m0();
            O7.X xC = xM0 != null ? xM0.c(n0VarC) : null;
            java.util.List listA0 = interfaceC1423d2.A0();
            p247y7.AbstractC7350t.e(listA0, "getContextReceiverParameters(...)");
            java.util.List list = listA0;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((O7.X) it.next()).c(n0VarC));
            }
            j10.a1(null, xC, arrayList, j11.x1().A(), j11.n(), j11.l(), O7.D.FINAL, j11.x1().h());
            return j10;
        }
    }

    private J(E8.n nVar, O7.e0 e0Var, O7.InterfaceC1423d interfaceC1423d, R7.I i6, P7.g gVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var) {
        super(e0Var, i6, gVar, p138n8.h.f51972i, aVar, a0Var);
        this.f9556g0 = nVar;
        this.f9557h0 = e0Var;
        e1(x1().N0());
        this.f9558i0 = nVar.f(new R7.J.b(interfaceC1423d));
        this.f9559j0 = interfaceC1423d;
    }

    public /* synthetic */ J(E8.n nVar, O7.e0 e0Var, O7.InterfaceC1423d interfaceC1423d, R7.I i6, P7.g gVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var, p247y7.AbstractC7342k abstractC7342k) {
        this(nVar, e0Var, interfaceC1423d, i6, gVar, aVar, a0Var);
    }

    @Override // O7.InterfaceC1431l
    public boolean G() {
        return y0().G();
    }

    @Override // O7.InterfaceC1431l
    public O7.InterfaceC1424e H() {
        O7.InterfaceC1424e interfaceC1424eH = y0().H();
        p247y7.AbstractC7350t.e(interfaceC1424eH, "getConstructedClass(...)");
        return interfaceC1424eH;
    }

    @Override // R7.p, O7.InterfaceC1420a
    public F8.E l() {
        F8.E eL = super.l();
        p247y7.AbstractC7350t.c(eL);
        return eL;
    }

    public final E8.n p0() {
        return this.f9556g0;
    }

    @Override // O7.InterfaceC1421b
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public R7.I i0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.InterfaceC1421b.a aVar, boolean z6) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "newOwner");
        p247y7.AbstractC7350t.f(d6, "modality");
        p247y7.AbstractC7350t.f(abstractC1439u, "visibility");
        p247y7.AbstractC7350t.f(aVar, "kind");
        O7.InterfaceC1443y interfaceC1443yI = z().o(interfaceC1432m).x(d6).r(abstractC1439u).l(aVar).v(z6).i();
        p247y7.AbstractC7350t.d(interfaceC1443yI, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (R7.I) interfaceC1443yI;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.p
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public R7.J U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "newOwner");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(a0Var, "source");
        O7.InterfaceC1421b.a aVar2 = O7.InterfaceC1421b.a.DECLARATION;
        if (aVar != aVar2) {
            O7.InterfaceC1421b.a aVar3 = O7.InterfaceC1421b.a.SYNTHESIZED;
        }
        return new R7.J(this.f9556g0, x1(), y0(), this, gVar, aVar2, a0Var);
    }

    @Override // R7.AbstractC1505k, O7.InterfaceC1432m
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public O7.e0 b() {
        return x1();
    }

    @Override // R7.p, R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public R7.I a() {
        O7.InterfaceC1443y interfaceC1443yA = super.a();
        p247y7.AbstractC7350t.d(interfaceC1443yA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (R7.I) interfaceC1443yA;
    }

    public O7.e0 x1() {
        return this.f9557h0;
    }

    @Override // R7.I
    public O7.InterfaceC1423d y0() {
        return this.f9559j0;
    }

    @Override // R7.p, O7.InterfaceC1443y, O7.c0
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public R7.I c(F8.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "substitutor");
        O7.InterfaceC1443y interfaceC1443yC = super.c(n0Var);
        p247y7.AbstractC7350t.d(interfaceC1443yC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        R7.J j6 = (R7.J) interfaceC1443yC;
        F8.n0 n0VarF = F8.n0.f(j6.l());
        p247y7.AbstractC7350t.e(n0VarF, "create(...)");
        O7.InterfaceC1423d interfaceC1423dC = y0().a().c(n0VarF);
        if (interfaceC1423dC == null) {
            return null;
        }
        j6.f9559j0 = interfaceC1423dC;
        return j6;
    }
}
