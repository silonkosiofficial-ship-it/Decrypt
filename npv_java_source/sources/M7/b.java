package M7;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends R7.AbstractC1495a {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final M7.b.a f7041P = new M7.b.a(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final p138n8.b f7042Q = new p138n8.b(L7.j.f6325y, p138n8.f.o("Function"));

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final p138n8.b f7043R = new p138n8.b(L7.j.f6322v, p138n8.f.o("KFunction"));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final E8.n f7044H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final O7.K f7045I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final M7.f f7046J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f7047K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final M7.b.C0170b f7048L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final M7.d f7049M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.util.List f7050N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final M7.c f7051O;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: M7.b$b, reason: collision with other inner class name */
    private final class C0170b extends F8.AbstractC0941b {
        public C0170b() {
            super(M7.b.this.f7044H);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0011  */
        @Override // F8.AbstractC0945f
        protected java.util.Collection g() {
            java.util.List listP;
            M7.f fVarD1 = M7.b.this.d1();
            M7.f.a aVar = M7.f.a.f7066e;
            if (p247y7.AbstractC7350t.b(fVarD1, aVar)) {
                listP = p097j7.AbstractC6879v.e(M7.b.f7042Q);
            } else if (p247y7.AbstractC7350t.b(fVarD1, M7.f.b.f7067e)) {
                listP = p097j7.AbstractC6879v.p(M7.b.f7043R, new p138n8.b(L7.j.f6325y, aVar.c(M7.b.this.Z0())));
            } else {
                M7.f.d dVar = M7.f.d.f7069e;
                if (p247y7.AbstractC7350t.b(fVarD1, dVar)) {
                    listP = p097j7.AbstractC6879v.e(M7.b.f7042Q);
                } else {
                    if (!p247y7.AbstractC7350t.b(fVarD1, M7.f.c.f7068e)) {
                        Q8.a.b(null, 1, null);
                        throw null;
                    }
                    listP = p097j7.AbstractC6879v.p(M7.b.f7043R, new p138n8.b(L7.j.f6317q, dVar.c(M7.b.this.Z0())));
                }
            }
            O7.G gB = M7.b.this.f7045I.b();
            java.util.List<p138n8.b> list = listP;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (p138n8.b bVar : list) {
                O7.InterfaceC1424e interfaceC1424eA = O7.AbstractC1442x.a(gB, bVar);
                if (interfaceC1424eA == null) {
                    throw new java.lang.IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                java.util.List listN0 = p097j7.AbstractC6879v.N0(x(), interfaceC1424eA.p().x().size());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(listN0, 10));
                java.util.Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new F8.k0(((O7.f0) it.next()).w()));
                }
                arrayList.add(F8.F.g(F8.a0.f2872D.i(), interfaceC1424eA, arrayList2));
            }
            return p097j7.AbstractC6879v.T0(arrayList);
        }

        @Override // F8.AbstractC0945f
        protected O7.d0 k() {
            return O7.d0.a.f8153a;
        }

        @Override // F8.AbstractC0951l, F8.e0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public M7.b w() {
            return M7.b.this;
        }

        public java.lang.String toString() {
            return w().toString();
        }

        @Override // F8.e0
        public java.util.List x() {
            return M7.b.this.f7050N;
        }

        @Override // F8.e0
        public boolean y() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(E8.n nVar, O7.K k6, M7.f fVar, int i6) {
        super(nVar, fVar.c(i6));
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(k6, "containingDeclaration");
        p247y7.AbstractC7350t.f(fVar, "functionTypeKind");
        this.f7044H = nVar;
        this.f7045I = k6;
        this.f7046J = fVar;
        this.f7047K = i6;
        this.f7048L = new M7.b.C0170b();
        this.f7049M = new M7.d(nVar, this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        E7.i iVar = new E7.i(1, i6);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(iVar, 10));
        java.util.Iterator it = iVar.iterator();
        while (it.hasNext()) {
            int iB = ((p097j7.O) it).b();
            F8.u0 u0Var = F8.u0.IN_VARIANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('P');
            sb.append(iB);
            T0(arrayList, this, u0Var, sb.toString());
            arrayList2.add(p087i7.M.f46721a);
        }
        T0(arrayList, this, F8.u0.OUT_VARIANCE, "R");
        this.f7050N = p097j7.AbstractC6879v.T0(arrayList);
        this.f7051O = M7.c.f7053C.a(this.f7046J);
    }

    private static final void T0(java.util.ArrayList arrayList, M7.b bVar, F8.u0 u0Var, java.lang.String str) {
        arrayList.add(R7.K.a1(bVar, P7.g.f8385d.b(), false, u0Var, p138n8.f.o(str), arrayList.size(), bVar.f7044H));
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
    public java.util.List A() {
        return this.f7050N;
    }

    @Override // O7.C
    public boolean C() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean E() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean I() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public O7.h0 I0() {
        return null;
    }

    @Override // O7.C
    public boolean N0() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean P() {
        return false;
    }

    @Override // O7.C
    public boolean R() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean R0() {
        return false;
    }

    @Override // O7.InterfaceC1428i
    public boolean S() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public /* bridge */ /* synthetic */ O7.InterfaceC1423d X() {
        return (O7.InterfaceC1423d) h1();
    }

    public final int Z0() {
        return this.f7047K;
    }

    @Override // O7.InterfaceC1424e
    public /* bridge */ /* synthetic */ O7.InterfaceC1424e a0() {
        return (O7.InterfaceC1424e) a1();
    }

    public java.lang.Void a1() {
        return null;
    }

    @Override // O7.InterfaceC1424e
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public java.util.List r() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1433n, O7.InterfaceC1432m
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public O7.K b() {
        return this.f7045I;
    }

    public final M7.f d1() {
        return this.f7046J;
    }

    @Override // O7.InterfaceC1424e
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public java.util.List O() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // O7.InterfaceC1424e
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public y8.h.b Y() {
        return y8.h.b.f57356b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.t
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public M7.d Q(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return this.f7049M;
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8186e;
        p247y7.AbstractC7350t.e(abstractC1439u, "PUBLIC");
        return abstractC1439u;
    }

    public java.lang.Void h1() {
        return null;
    }

    @Override // O7.InterfaceC1424e
    public O7.EnumC1425f j() {
        return O7.EnumC1425f.INTERFACE;
    }

    @Override // P7.a
    public P7.g k() {
        return P7.g.f8385d.b();
    }

    @Override // O7.InterfaceC1424e
    public boolean m() {
        return false;
    }

    @Override // O7.InterfaceC1435p
    public O7.a0 o() {
        O7.a0 a0Var = O7.a0.f8143a;
        p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
        return a0Var;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        return this.f7048L;
    }

    @Override // O7.InterfaceC1424e, O7.C
    public O7.D q() {
        return O7.D.ABSTRACT;
    }

    public java.lang.String toString() {
        java.lang.String strG = getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return strG;
    }
}
