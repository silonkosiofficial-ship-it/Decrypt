package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements p178r8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X7.t.a f16039a = new X7.t.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final boolean b(O7.InterfaceC1443y interfaceC1443y) {
            if (interfaceC1443y.n().size() != 1) {
                return false;
            }
            O7.InterfaceC1432m interfaceC1432mB = interfaceC1443y.b();
            O7.InterfaceC1424e interfaceC1424e = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
            if (interfaceC1424e == null) {
                return false;
            }
            java.util.List listN = interfaceC1443y.n();
            p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
            O7.InterfaceC1427h interfaceC1427hW = ((O7.j0) p097j7.AbstractC6879v.G0(listN)).getType().W0().w();
            O7.InterfaceC1424e interfaceC1424e2 = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
            return interfaceC1424e2 != null && L7.g.r0(interfaceC1424e) && p247y7.AbstractC7350t.b(p218v8.c.l(interfaceC1424e), p218v8.c.l(interfaceC1424e2));
        }

        private final p068g8.o c(O7.InterfaceC1443y interfaceC1443y, O7.j0 j0Var) {
            F8.E eW;
            if (p068g8.y.e(interfaceC1443y) || b(interfaceC1443y)) {
                F8.E type = j0Var.getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                eW = K8.a.w(type);
            } else {
                eW = j0Var.getType();
                p247y7.AbstractC7350t.e(eW, "getType(...)");
            }
            return p068g8.y.g(eW);
        }

        public final boolean a(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2) {
            p247y7.AbstractC7350t.f(interfaceC1420a, "superDescriptor");
            p247y7.AbstractC7350t.f(interfaceC1420a2, "subDescriptor");
            if ((interfaceC1420a2 instanceof Z7.e) && (interfaceC1420a instanceof O7.InterfaceC1443y)) {
                Z7.e eVar = (Z7.e) interfaceC1420a2;
                eVar.n().size();
                O7.InterfaceC1443y interfaceC1443y = (O7.InterfaceC1443y) interfaceC1420a;
                interfaceC1443y.n().size();
                java.util.List listN = eVar.a().n();
                p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
                java.util.List listN2 = interfaceC1443y.a().n();
                p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
                for (p087i7.u uVar : p097j7.AbstractC6879v.c1(listN, listN2)) {
                    O7.j0 j0Var = (O7.j0) uVar.a();
                    O7.j0 j0Var2 = (O7.j0) uVar.b();
                    p247y7.AbstractC7350t.c(j0Var);
                    boolean z6 = c((O7.InterfaceC1443y) interfaceC1420a2, j0Var) instanceof g8.o.d;
                    p247y7.AbstractC7350t.c(j0Var2);
                    if (z6 != (c(interfaceC1443y, j0Var2) instanceof g8.o.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final boolean c(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, O7.InterfaceC1424e interfaceC1424e) {
        if ((interfaceC1420a instanceof O7.InterfaceC1421b) && (interfaceC1420a2 instanceof O7.InterfaceC1443y) && !L7.g.g0(interfaceC1420a2)) {
            X7.C1828f c1828f = X7.C1828f.f16011o;
            O7.InterfaceC1443y interfaceC1443y = (O7.InterfaceC1443y) interfaceC1420a2;
            p138n8.f name = interfaceC1443y.getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            if (!c1828f.l(name)) {
                X7.I.a aVar = X7.I.f15954a;
                p138n8.f name2 = interfaceC1443y.getName();
                p247y7.AbstractC7350t.e(name2, "getName(...)");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            O7.InterfaceC1421b interfaceC1421bE = X7.H.e((O7.InterfaceC1421b) interfaceC1420a);
            boolean z6 = interfaceC1420a instanceof O7.InterfaceC1443y;
            O7.InterfaceC1443y interfaceC1443y2 = z6 ? (O7.InterfaceC1443y) interfaceC1420a : null;
            if ((!(interfaceC1443y2 != null && interfaceC1443y.F0() == interfaceC1443y2.F0())) && (interfaceC1421bE == null || !interfaceC1443y.F0())) {
                return true;
            }
            if ((interfaceC1424e instanceof Z7.c) && interfaceC1443y.l0() == null && interfaceC1421bE != null && !X7.H.f(interfaceC1424e, interfaceC1421bE)) {
                if ((interfaceC1421bE instanceof O7.InterfaceC1443y) && z6 && X7.C1828f.k((O7.InterfaceC1443y) interfaceC1421bE) != null) {
                    java.lang.String strC = p068g8.y.c(interfaceC1443y, false, false, 2, null);
                    O7.InterfaceC1443y interfaceC1443yA = ((O7.InterfaceC1443y) interfaceC1420a).a();
                    p247y7.AbstractC7350t.e(interfaceC1443yA, "getOriginal(...)");
                    if (p247y7.AbstractC7350t.b(strC, p068g8.y.c(interfaceC1443yA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p178r8.g
    public r8.g.a a() {
        return r8.g.a.CONFLICTS_ONLY;
    }

    @Override // p178r8.g
    public r8.g.b b(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "superDescriptor");
        p247y7.AbstractC7350t.f(interfaceC1420a2, "subDescriptor");
        if (!c(interfaceC1420a, interfaceC1420a2, interfaceC1424e) && !f16039a.a(interfaceC1420a, interfaceC1420a2)) {
            return r8.g.b.UNKNOWN;
        }
        return r8.g.b.INCOMPATIBLE;
    }
}
