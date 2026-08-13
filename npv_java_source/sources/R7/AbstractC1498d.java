package R7;

/* JADX INFO: renamed from: R7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1498d extends R7.AbstractC1505k implements O7.e0 {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f9586L = {p247y7.P.j(new p247y7.G(p247y7.P.b(R7.AbstractC1498d.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final E8.n f9587G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final O7.AbstractC1439u f9588H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final E8.i f9589I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.List f9590J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final R7.AbstractC1498d.C0221d f9591K;

    /* JADX INFO: renamed from: R7.d$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M l(G8.g gVar) {
            O7.InterfaceC1427h interfaceC1427hF = gVar.f(R7.AbstractC1498d.this);
            if (interfaceC1427hF != null) {
                return interfaceC1427hF.w();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: R7.d$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection b() {
            return R7.AbstractC1498d.this.U0();
        }
    }

    /* JADX INFO: renamed from: R7.d$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0025  */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F8.t0 t0Var) {
            boolean z6;
            p247y7.AbstractC7350t.c(t0Var);
            if (F8.G.a(t0Var)) {
                z6 = false;
            } else {
                R7.AbstractC1498d abstractC1498d = R7.AbstractC1498d.this;
                O7.InterfaceC1427h interfaceC1427hW = t0Var.W0().w();
                if (!(interfaceC1427hW instanceof O7.f0) || p247y7.AbstractC7350t.b(((O7.f0) interfaceC1427hW).b(), abstractC1498d)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    /* JADX INFO: renamed from: R7.d$d, reason: collision with other inner class name */
    public static final class C0221d implements F8.e0 {
        C0221d() {
        }

        @Override // F8.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public O7.e0 w() {
            return R7.AbstractC1498d.this;
        }

        @Override // F8.e0
        public L7.g t() {
            return p218v8.c.j(w());
        }

        public java.lang.String toString() {
            return "[typealias " + w().getName().g() + ']';
        }

        @Override // F8.e0
        public java.util.Collection u() {
            java.util.Collection collectionU = w().o0().W0().u();
            p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
            return collectionU;
        }

        @Override // F8.e0
        public F8.e0 v(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            return this;
        }

        @Override // F8.e0
        public java.util.List x() {
            return R7.AbstractC1498d.this.V0();
        }

        @Override // F8.e0
        public boolean y() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1498d(E8.n nVar, O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, O7.a0 a0Var, O7.AbstractC1439u abstractC1439u) {
        super(interfaceC1432m, gVar, fVar, a0Var);
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(a0Var, "sourceElement");
        p247y7.AbstractC7350t.f(abstractC1439u, "visibilityImpl");
        this.f9587G = nVar;
        this.f9588H = abstractC1439u;
        this.f9589I = nVar.d(new R7.AbstractC1498d.b());
        this.f9591K = new R7.AbstractC1498d.C0221d();
    }

    @Override // O7.InterfaceC1428i
    public java.util.List A() {
        java.util.List list = this.f9590J;
        if (list != null) {
            return list;
        }
        p247y7.AbstractC7350t.p("declaredTypeParametersImpl");
        return null;
    }

    @Override // O7.C
    public boolean C() {
        return false;
    }

    @Override // O7.C
    public boolean N0() {
        return false;
    }

    protected final F8.M O0() {
        p248y8.h hVarM0;
        O7.InterfaceC1424e interfaceC1424eV = v();
        if (interfaceC1424eV == null || (hVarM0 = interfaceC1424eV.M0()) == null) {
            hVarM0 = y8.h.b.f57356b;
        }
        F8.M mV = F8.q0.v(this, hVarM0, new R7.AbstractC1498d.a());
        p247y7.AbstractC7350t.e(mV, "makeUnsubstitutedType(...)");
        return mV;
    }

    @Override // O7.C
    public boolean R() {
        return false;
    }

    @Override // O7.InterfaceC1428i
    public boolean S() {
        return F8.q0.c(o0(), new R7.AbstractC1498d.c());
    }

    @Override // R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public O7.e0 a() {
        O7.InterfaceC1435p interfaceC1435pA = super.a();
        p247y7.AbstractC7350t.d(interfaceC1435pA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (O7.e0) interfaceC1435pA;
    }

    public final java.util.Collection U0() {
        O7.InterfaceC1424e interfaceC1424eV = v();
        if (interfaceC1424eV == null) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.Collection<O7.InterfaceC1423d> collectionR = interfaceC1424eV.r();
        p247y7.AbstractC7350t.e(collectionR, "getConstructors(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (O7.InterfaceC1423d interfaceC1423d : collectionR) {
            R7.J.a aVar = R7.J.f9554k0;
            E8.n nVar = this.f9587G;
            p247y7.AbstractC7350t.c(interfaceC1423d);
            R7.I iB = aVar.b(nVar, this, interfaceC1423d);
            if (iB != null) {
                arrayList.add(iB);
            }
        }
        return arrayList;
    }

    protected abstract java.util.List V0();

    public final void W0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "declaredTypeParameters");
        this.f9590J = list;
    }

    @Override // O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        return this.f9588H;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        return this.f9591K;
    }

    protected final E8.n p0() {
        return this.f9587G;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(interfaceC1434o, "visitor");
        return interfaceC1434o.c(this, obj);
    }

    @Override // R7.AbstractC1504j
    public java.lang.String toString() {
        return "typealias " + getName().g();
    }
}
