package O7;

/* JADX INFO: renamed from: O7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1437s {
    public static final O7.InterfaceC1427h a(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1432m.b();
        if (interfaceC1432mB == null || (interfaceC1432m instanceof O7.K)) {
            return null;
        }
        if (!b(interfaceC1432mB)) {
            return a(interfaceC1432mB);
        }
        if (interfaceC1432mB instanceof O7.InterfaceC1427h) {
            return (O7.InterfaceC1427h) interfaceC1432mB;
        }
        return null;
    }

    public static final boolean b(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return interfaceC1432m.b() instanceof O7.K;
    }

    public static final boolean c(O7.InterfaceC1443y interfaceC1443y) {
        F8.M mW;
        F8.E eY;
        F8.E eL;
        p247y7.AbstractC7350t.f(interfaceC1443y, "<this>");
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1443y.b();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
        if (interfaceC1424e == null) {
            return false;
        }
        O7.InterfaceC1424e interfaceC1424e2 = p178r8.h.g(interfaceC1424e) ? interfaceC1424e : null;
        if (interfaceC1424e2 == null || (mW = interfaceC1424e2.w()) == null || (eY = K8.a.y(mW)) == null || (eL = interfaceC1443y.l()) == null || !p247y7.AbstractC7350t.b(interfaceC1443y.getName(), M8.q.f7142e)) {
            return false;
        }
        if ((!K8.a.n(eL) && !K8.a.o(eL)) || interfaceC1443y.n().size() != 1) {
            return false;
        }
        F8.E type = ((O7.j0) interfaceC1443y.n().get(0)).getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        return p247y7.AbstractC7350t.b(K8.a.y(type), eY) && interfaceC1443y.A0().isEmpty() && interfaceC1443y.v0() == null;
    }

    public static final O7.InterfaceC1424e d(O7.G g6, p138n8.c cVar, W7.b bVar) {
        O7.InterfaceC1427h interfaceC1427hG;
        p248y8.h hVarH0;
        p247y7.AbstractC7350t.f(g6, "<this>");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(bVar, "lookupLocation");
        if (cVar.d()) {
            return null;
        }
        p138n8.c cVarE = cVar.e();
        p247y7.AbstractC7350t.e(cVarE, "parent(...)");
        p248y8.h hVarU = g6.s0(cVarE).u();
        p138n8.f fVarG = cVar.g();
        p247y7.AbstractC7350t.e(fVarG, "shortName(...)");
        O7.InterfaceC1427h interfaceC1427hG2 = hVarU.g(fVarG, bVar);
        O7.InterfaceC1424e interfaceC1424e = interfaceC1427hG2 instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hG2 : null;
        if (interfaceC1424e != null) {
            return interfaceC1424e;
        }
        p138n8.c cVarE2 = cVar.e();
        p247y7.AbstractC7350t.e(cVarE2, "parent(...)");
        O7.InterfaceC1424e interfaceC1424eD = d(g6, cVarE2, bVar);
        if (interfaceC1424eD == null || (hVarH0 = interfaceC1424eD.H0()) == null) {
            interfaceC1427hG = null;
        } else {
            p138n8.f fVarG2 = cVar.g();
            p247y7.AbstractC7350t.e(fVarG2, "shortName(...)");
            interfaceC1427hG = hVarH0.g(fVarG2, bVar);
        }
        if (interfaceC1427hG instanceof O7.InterfaceC1424e) {
            return (O7.InterfaceC1424e) interfaceC1427hG;
        }
        return null;
    }
}
