package M7;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends R7.G {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final M7.e.a f7061g0 = new M7.e.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final O7.j0 b(M7.e eVar, int i6, O7.f0 f0Var) {
            java.lang.String lowerCase;
            java.lang.String strG = f0Var.getName().g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            if (p247y7.AbstractC7350t.b(strG, "T")) {
                lowerCase = "instance";
            } else if (p247y7.AbstractC7350t.b(strG, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strG.toLowerCase(java.util.Locale.ROOT);
                p247y7.AbstractC7350t.e(lowerCase, "toLowerCase(...)");
            }
            P7.g gVarB = P7.g.f8385d.b();
            p138n8.f fVarO = p138n8.f.o(lowerCase);
            p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
            F8.M mW = f0Var.w();
            p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
            O7.a0 a0Var = O7.a0.f8143a;
            p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
            return new R7.L(eVar, null, i6, gVarB, fVarO, mW, false, false, false, null, a0Var);
        }

        public final M7.e a(M7.b bVar, boolean z6) {
            p247y7.AbstractC7350t.f(bVar, "functionClass");
            java.util.List listA = bVar.A();
            M7.e eVar = new M7.e(bVar, null, O7.InterfaceC1421b.a.DECLARATION, z6, null);
            O7.X xS0 = bVar.S0();
            java.util.List listM = p097j7.AbstractC6879v.m();
            java.util.List listM2 = p097j7.AbstractC6879v.m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listA) {
                if (((O7.f0) obj).s() != F8.u0.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            java.lang.Iterable<p097j7.L> iterableA1 = p097j7.AbstractC6879v.a1(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterableA1, 10));
            for (p097j7.L l6 : iterableA1) {
                arrayList2.add(M7.e.f7061g0.b(eVar, l6.c(), (O7.f0) l6.d()));
            }
            eVar.a1(null, xS0, listM, listM2, arrayList2, ((O7.f0) p097j7.AbstractC6879v.t0(listA)).w(), O7.D.ABSTRACT, O7.AbstractC1438t.f8186e);
            eVar.i1(true);
            return eVar;
        }
    }

    private e(O7.InterfaceC1432m interfaceC1432m, M7.e eVar, O7.InterfaceC1421b.a aVar, boolean z6) {
        super(interfaceC1432m, eVar, P7.g.f8385d.b(), M8.q.f7146i, aVar, O7.a0.f8143a);
        o1(true);
        q1(z6);
        h1(false);
    }

    public /* synthetic */ e(O7.InterfaceC1432m interfaceC1432m, M7.e eVar, O7.InterfaceC1421b.a aVar, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC1432m, eVar, aVar, z6);
    }

    private final O7.InterfaceC1443y y1(java.util.List list) {
        p138n8.f fVar;
        int size = n().size() - list.size();
        boolean z6 = true;
        if (size == 0) {
            java.util.List listN = n();
            p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
            java.util.List<p087i7.u> listC1 = p097j7.AbstractC6879v.c1(list, listN);
            if (!(listC1 instanceof java.util.Collection) || !listC1.isEmpty()) {
                for (p087i7.u uVar : listC1) {
                    if (!p247y7.AbstractC7350t.b((p138n8.f) uVar.a(), ((O7.j0) uVar.b()).getName())) {
                    }
                }
            }
            return this;
        }
        java.util.List listN2 = n();
        p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
        java.util.List<O7.j0> list2 = listN2;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        for (O7.j0 j0Var : list2) {
            p138n8.f name = j0Var.getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            int index = j0Var.getIndex();
            int i6 = index - size;
            if (i6 >= 0 && (fVar = (p138n8.f) list.get(i6)) != null) {
                name = fVar;
            }
            arrayList.add(j0Var.g0(this, name, index));
        }
        R7.p.c cVarB1 = b1(F8.n0.f2951b);
        java.util.List list3 = list;
        if ((list3 instanceof java.util.Collection) && list3.isEmpty()) {
            z6 = false;
        } else {
            java.util.Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((p138n8.f) it.next()) == null) {
                }
            }
            z6 = false;
        }
        R7.p.c cVarZ = cVarB1.H(z6).m(arrayList).z(a());
        p247y7.AbstractC7350t.e(cVarZ, "setOriginal(...)");
        O7.InterfaceC1443y interfaceC1443yV0 = super.V0(cVarZ);
        p247y7.AbstractC7350t.c(interfaceC1443yV0);
        return interfaceC1443yV0;
    }

    @Override // R7.p, O7.C
    public boolean C() {
        return false;
    }

    @Override // R7.G, R7.p
    protected R7.p U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "newOwner");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(gVar, "annotations");
        p247y7.AbstractC7350t.f(a0Var, "source");
        return new M7.e(interfaceC1432m, (M7.e) interfaceC1443y, aVar, y());
    }

    @Override // R7.p, O7.InterfaceC1443y
    public boolean V() {
        return false;
    }

    @Override // R7.p
    protected O7.InterfaceC1443y V0(R7.p.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "configuration");
        M7.e eVar = (M7.e) super.V0(cVar);
        if (eVar == null) {
            return null;
        }
        java.util.List listN = eVar.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        java.util.List list = listN;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return eVar;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            F8.E type = ((O7.j0) it.next()).getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            if (L7.f.d(type) != null) {
                java.util.List listN2 = eVar.n();
                p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
                java.util.List list2 = listN2;
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    F8.E type2 = ((O7.j0) it2.next()).getType();
                    p247y7.AbstractC7350t.e(type2, "getType(...)");
                    arrayList.add(L7.f.d(type2));
                }
                return eVar.y1(arrayList);
            }
        }
        return eVar;
    }

    @Override // R7.p, O7.InterfaceC1443y
    public boolean m() {
        return false;
    }
}
