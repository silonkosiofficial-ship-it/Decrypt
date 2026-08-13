package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.c f54003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.b f54004b;

    static {
        p138n8.c cVar = new p138n8.c("kotlin.jvm.JvmInline");
        f54003a = cVar;
        p138n8.b bVarM = p138n8.b.m(cVar);
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        f54004b = bVarM;
    }

    public static final boolean a(O7.InterfaceC1420a interfaceC1420a) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "<this>");
        if (interfaceC1420a instanceof O7.V) {
            O7.U uK0 = ((O7.V) interfaceC1420a).K0();
            p247y7.AbstractC7350t.e(uK0, "getCorrespondingProperty(...)");
            if (f(uK0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return (interfaceC1432m instanceof O7.InterfaceC1424e) && (((O7.InterfaceC1424e) interfaceC1432m).I0() instanceof O7.C1444z);
    }

    public static final boolean c(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW != null) {
            return b(interfaceC1427hW);
        }
        return false;
    }

    public static final boolean d(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return (interfaceC1432m instanceof O7.InterfaceC1424e) && (((O7.InterfaceC1424e) interfaceC1432m).I0() instanceof O7.H);
    }

    public static final boolean e(O7.k0 k0Var) {
        O7.C1444z c1444zN;
        p247y7.AbstractC7350t.f(k0Var, "<this>");
        if (k0Var.v0() == null) {
            O7.InterfaceC1432m interfaceC1432mB = k0Var.b();
            p138n8.f fVarD = null;
            O7.InterfaceC1424e interfaceC1424e = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
            if (interfaceC1424e != null && (c1444zN = p218v8.c.n(interfaceC1424e)) != null) {
                fVarD = c1444zN.d();
            }
            if (p247y7.AbstractC7350t.b(fVarD, k0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(O7.k0 k0Var) {
        O7.h0 h0VarI0;
        p247y7.AbstractC7350t.f(k0Var, "<this>");
        if (k0Var.v0() == null) {
            O7.InterfaceC1432m interfaceC1432mB = k0Var.b();
            O7.InterfaceC1424e interfaceC1424e = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
            if (interfaceC1424e != null && (h0VarI0 = interfaceC1424e.I0()) != null) {
                p138n8.f name = k0Var.getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                if (h0VarI0.a(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        return b(interfaceC1432m) || d(interfaceC1432m);
    }

    public static final boolean h(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW != null) {
            return g(interfaceC1427hW);
        }
        return false;
    }

    public static final boolean i(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        return (interfaceC1427hW == null || !d(interfaceC1427hW) || G8.o.f3161a.p(e6)) ? false : true;
    }

    public static final F8.E j(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        F8.E eK = k(e6);
        if (eK != null) {
            return F8.n0.f(e6).p(eK, F8.u0.INVARIANT);
        }
        return null;
    }

    public static final F8.E k(F8.E e6) {
        O7.C1444z c1444zN;
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
        if (interfaceC1424e == null || (c1444zN = p218v8.c.n(interfaceC1424e)) == null) {
            return null;
        }
        return (F8.M) c1444zN.e();
    }
}
