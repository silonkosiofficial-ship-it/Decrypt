package p228w8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    private static final boolean a(O7.InterfaceC1424e interfaceC1424e) {
        return p247y7.AbstractC7350t.b(p218v8.c.l(interfaceC1424e), L7.j.f6321u);
    }

    private static final boolean b(F8.E e6, boolean z6) {
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        O7.f0 f0Var = interfaceC1427hW instanceof O7.f0 ? (O7.f0) interfaceC1427hW : null;
        if (f0Var == null) {
            return false;
        }
        return (z6 || !p178r8.h.d(f0Var)) && e(K8.a.j(f0Var));
    }

    public static final boolean c(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW != null) {
            return (p178r8.h.b(interfaceC1427hW) && d(interfaceC1427hW)) || p178r8.h.i(e6);
        }
        return false;
    }

    public static final boolean d(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return p178r8.h.g(interfaceC1432m) && !a((O7.InterfaceC1424e) interfaceC1432m);
    }

    private static final boolean e(F8.E e6) {
        return c(e6) || b(e6, true);
    }

    public static final boolean f(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "descriptor");
        O7.InterfaceC1423d interfaceC1423d = interfaceC1421b instanceof O7.InterfaceC1423d ? (O7.InterfaceC1423d) interfaceC1421b : null;
        if (interfaceC1423d == null || O7.AbstractC1438t.g(interfaceC1423d.h())) {
            return false;
        }
        O7.InterfaceC1424e interfaceC1424eH = interfaceC1423d.H();
        p247y7.AbstractC7350t.e(interfaceC1424eH, "getConstructedClass(...)");
        if (p178r8.h.g(interfaceC1424eH) || p178r8.f.G(interfaceC1423d.H())) {
            return false;
        }
        java.util.List listN = interfaceC1423d.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        java.util.List list = listN;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            F8.E type = ((O7.j0) it.next()).getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
