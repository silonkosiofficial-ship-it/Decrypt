package R7;

/* JADX INFO: loaded from: classes2.dex */
public class L extends R7.M implements O7.j0 {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final R7.L.a f9565N = new R7.L.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f9566H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f9567I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final boolean f9568J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f9569K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final F8.E f9570L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final O7.j0 f9571M;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final R7.L a(O7.InterfaceC1420a interfaceC1420a, O7.j0 j0Var, int i6, P7.g gVar, p138n8.f fVar, F8.E e6, boolean z6, boolean z10, boolean z11, F8.E e10, O7.a0 a0Var, p237x7.a aVar) {
            p247y7.AbstractC7350t.f(interfaceC1420a, "containingDeclaration");
            p247y7.AbstractC7350t.f(gVar, "annotations");
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(e6, "outType");
            p247y7.AbstractC7350t.f(a0Var, "source");
            return aVar == null ? new R7.L(interfaceC1420a, j0Var, i6, gVar, fVar, e6, z6, z10, z11, e10, a0Var) : new R7.L.b(interfaceC1420a, j0Var, i6, gVar, fVar, e6, z6, z10, z11, e10, a0Var, aVar);
        }
    }

    public static final class b extends R7.L {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f9572O;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {
            a() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List b() {
                return R7.L.b.this.W0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O7.InterfaceC1420a interfaceC1420a, O7.j0 j0Var, int i6, P7.g gVar, p138n8.f fVar, F8.E e6, boolean z6, boolean z10, boolean z11, F8.E e10, O7.a0 a0Var, p237x7.a aVar) {
            super(interfaceC1420a, j0Var, i6, gVar, fVar, e6, z6, z10, z11, e10, a0Var);
            p247y7.AbstractC7350t.f(interfaceC1420a, "containingDeclaration");
            p247y7.AbstractC7350t.f(gVar, "annotations");
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(e6, "outType");
            p247y7.AbstractC7350t.f(a0Var, "source");
            p247y7.AbstractC7350t.f(aVar, "destructuringVariables");
            this.f9572O = p087i7.AbstractC6669o.b(aVar);
        }

        public final java.util.List W0() {
            return (java.util.List) this.f9572O.getValue();
        }

        @Override // R7.L, O7.j0
        public O7.j0 g0(O7.InterfaceC1420a interfaceC1420a, p138n8.f fVar, int i6) {
            p247y7.AbstractC7350t.f(interfaceC1420a, "newOwner");
            p247y7.AbstractC7350t.f(fVar, "newName");
            P7.g gVarK = k();
            p247y7.AbstractC7350t.e(gVarK, "<get-annotations>(...)");
            F8.E type = getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            boolean zD0 = D0();
            boolean zJ0 = j0();
            boolean zE0 = e0();
            F8.E eU0 = u0();
            O7.a0 a0Var = O7.a0.f8143a;
            p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
            return new R7.L.b(interfaceC1420a, null, i6, gVarK, fVar, type, zD0, zJ0, zE0, eU0, a0Var, new R7.L.b.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O7.InterfaceC1420a interfaceC1420a, O7.j0 j0Var, int i6, P7.g gVar, p138n8.f fVar, F8.E e6, boolean z6, boolean z10, boolean z11, F8.E e10, O7.a0 a0Var) {
        super(interfaceC1420a, gVar, fVar, e6, a0Var);
        p247y7.AbstractC7350t.f(interfaceC1420a, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(e6, "outType");
        p247y7.AbstractC7350t.f(a0Var, "source");
        this.f9566H = i6;
        this.f9567I = z6;
        this.f9568J = z10;
        this.f9569K = z11;
        this.f9570L = e10;
        this.f9571M = j0Var == null ? this : j0Var;
    }

    public static final R7.L T0(O7.InterfaceC1420a interfaceC1420a, O7.j0 j0Var, int i6, P7.g gVar, p138n8.f fVar, F8.E e6, boolean z6, boolean z10, boolean z11, F8.E e10, O7.a0 a0Var, p237x7.a aVar) {
        return f9565N.a(interfaceC1420a, j0Var, i6, gVar, fVar, e6, z6, z10, z11, e10, a0Var, aVar);
    }

    @Override // O7.j0
    public boolean D0() {
        if (this.f9567I) {
            O7.InterfaceC1420a interfaceC1420aB = b();
            p247y7.AbstractC7350t.d(interfaceC1420aB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((O7.InterfaceC1421b) interfaceC1420aB).j().e()) {
                return true;
            }
        }
        return false;
    }

    public java.lang.Void U0() {
        return null;
    }

    @Override // O7.c0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public O7.j0 c(F8.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "substitutor");
        if (n0Var.k()) {
            return this;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    public O7.j0 a() {
        O7.j0 j0Var = this.f9571M;
        return j0Var == this ? this : j0Var.a();
    }

    @Override // R7.AbstractC1505k, O7.InterfaceC1432m
    public O7.InterfaceC1420a b() {
        O7.InterfaceC1432m interfaceC1432mB = super.b();
        p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (O7.InterfaceC1420a) interfaceC1432mB;
    }

    @Override // O7.k0
    public /* bridge */ /* synthetic */ p198t8.g d0() {
        return (p198t8.g) U0();
    }

    @Override // O7.j0
    public boolean e0() {
        return this.f9569K;
    }

    @Override // O7.InterfaceC1420a
    public java.util.Collection f() {
        java.util.Collection collectionF = b().f();
        p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
        java.util.Collection collection = collectionF;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((O7.j0) ((O7.InterfaceC1420a) it.next()).n().get(getIndex()));
        }
        return arrayList;
    }

    @Override // O7.j0
    public O7.j0 g0(O7.InterfaceC1420a interfaceC1420a, p138n8.f fVar, int i6) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "newOwner");
        p247y7.AbstractC7350t.f(fVar, "newName");
        P7.g gVarK = k();
        p247y7.AbstractC7350t.e(gVarK, "<get-annotations>(...)");
        F8.E type = getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        boolean zD0 = D0();
        boolean zJ0 = j0();
        boolean zE0 = e0();
        F8.E eU0 = u0();
        O7.a0 a0Var = O7.a0.f8143a;
        p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
        return new R7.L(interfaceC1420a, null, i6, gVarK, fVar, type, zD0, zJ0, zE0, eU0, a0Var);
    }

    @Override // O7.j0
    public int getIndex() {
        return this.f9566H;
    }

    @Override // O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8187f;
        p247y7.AbstractC7350t.e(abstractC1439u, "LOCAL");
        return abstractC1439u;
    }

    @Override // O7.j0
    public boolean j0() {
        return this.f9568J;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(interfaceC1434o, "visitor");
        return interfaceC1434o.b(this, obj);
    }

    @Override // O7.k0
    public boolean t0() {
        return false;
    }

    @Override // O7.j0
    public F8.E u0() {
        return this.f9570L;
    }
}
