package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    private static final void a(java.lang.StringBuilder sb, F8.E e6) {
        sb.append(g(e6));
    }

    public static final java.lang.String b(O7.InterfaceC1443y interfaceC1443y, boolean z6, boolean z10) {
        java.lang.String strG;
        p247y7.AbstractC7350t.f(interfaceC1443y, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z10) {
            if (interfaceC1443y instanceof O7.InterfaceC1431l) {
                strG = "<init>";
            } else {
                strG = interfaceC1443y.getName().g();
                p247y7.AbstractC7350t.e(strG, "asString(...)");
            }
            sb.append(strG);
        }
        sb.append("(");
        O7.X xV0 = interfaceC1443y.v0();
        if (xV0 != null) {
            F8.E type = xV0.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            a(sb, type);
        }
        java.util.Iterator it = interfaceC1443y.n().iterator();
        while (it.hasNext()) {
            F8.E type2 = ((O7.j0) it.next()).getType();
            p247y7.AbstractC7350t.e(type2, "getType(...)");
            a(sb, type2);
        }
        sb.append(")");
        if (z6) {
            if (p068g8.g.c(interfaceC1443y)) {
                sb.append("V");
            } else {
                F8.E eL = interfaceC1443y.l();
                p247y7.AbstractC7350t.c(eL);
                a(sb, eL);
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String c(O7.InterfaceC1443y interfaceC1443y, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        if ((i6 & 2) != 0) {
            z10 = true;
        }
        return b(interfaceC1443y, z6, z10);
    }

    public static final java.lang.String d(O7.InterfaceC1420a interfaceC1420a) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "<this>");
        p068g8.A a6 = p068g8.A.f45591a;
        if (p178r8.f.E(interfaceC1420a)) {
            return null;
        }
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1420a.b();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
        if (interfaceC1424e == null || interfaceC1424e.getName().q()) {
            return null;
        }
        O7.InterfaceC1420a interfaceC1420aA = interfaceC1420a.a();
        O7.Z z6 = interfaceC1420aA instanceof O7.Z ? (O7.Z) interfaceC1420aA : null;
        if (z6 == null) {
            return null;
        }
        return p068g8.x.a(a6, interfaceC1424e, c(z6, false, false, 3, null));
    }

    public static final boolean e(O7.InterfaceC1420a interfaceC1420a) {
        O7.InterfaceC1443y interfaceC1443yK;
        p247y7.AbstractC7350t.f(interfaceC1420a, "f");
        if (!(interfaceC1420a instanceof O7.InterfaceC1443y)) {
            return false;
        }
        O7.InterfaceC1443y interfaceC1443y = (O7.InterfaceC1443y) interfaceC1420a;
        if (!p247y7.AbstractC7350t.b(interfaceC1443y.getName().g(), "remove") || interfaceC1443y.n().size() != 1 || X7.H.h((O7.InterfaceC1421b) interfaceC1420a)) {
            return false;
        }
        java.util.List listN = interfaceC1443y.a().n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        F8.E type = ((O7.j0) p097j7.AbstractC6879v.G0(listN)).getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        p068g8.o oVarG = g(type);
        g8.o.d dVar = oVarG instanceof g8.o.d ? (g8.o.d) oVarG : null;
        if ((dVar != null ? dVar.i() : null) != p228w8.e.INT || (interfaceC1443yK = X7.C1828f.k(interfaceC1443y)) == null) {
            return false;
        }
        java.util.List listN2 = interfaceC1443yK.a().n();
        p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
        F8.E type2 = ((O7.j0) p097j7.AbstractC6879v.G0(listN2)).getType();
        p247y7.AbstractC7350t.e(type2, "getType(...)");
        p068g8.o oVarG2 = g(type2);
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1443yK.b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        return p247y7.AbstractC7350t.b(p218v8.c.m(interfaceC1432mB), L7.j.a.f6372d0.j()) && (oVarG2 instanceof g8.o.c) && p247y7.AbstractC7350t.b(((g8.o.c) oVarG2).i(), "java/lang/Object");
    }

    public static final java.lang.String f(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "<this>");
        N7.c cVar = N7.c.f7820a;
        p138n8.d dVarJ = p218v8.c.l(interfaceC1424e).j();
        p247y7.AbstractC7350t.e(dVarJ, "toUnsafe(...)");
        p138n8.b bVarN = cVar.n(dVarJ);
        if (bVarN == null) {
            return p068g8.g.b(interfaceC1424e, null, 2, null);
        }
        java.lang.String strF = p228w8.d.b(bVarN).f();
        p247y7.AbstractC7350t.e(strF, "getInternalName(...)");
        return strF;
    }

    public static final p068g8.o g(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return (p068g8.o) p068g8.g.e(e6, p068g8.q.f45699a, p068g8.D.f45598o, p068g8.C.f45593a, null, null, 32, null);
    }
}
