package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J {
    public static final P7.c a(p008a8.g gVar, p048e8.C c6) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(c6, "wildcardType");
        if (c6.G() == null) {
            throw new java.lang.IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
        }
        java.util.Iterator it = new p008a8.d(gVar, c6, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            P7.c cVar = (P7.c) next;
            for (p138n8.c cVar2 : X7.v.f()) {
                if (p247y7.AbstractC7350t.b(cVar.e(), cVar2)) {
                    return (P7.c) next;
                }
            }
        }
        next = null;
        return (P7.c) next;
    }

    public static final boolean b(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "memberDescriptor");
        return (interfaceC1421b instanceof O7.InterfaceC1443y) && p247y7.AbstractC7350t.b(interfaceC1421b.D(Z7.e.f16713j0), java.lang.Boolean.TRUE);
    }

    public static final boolean c(X7.x xVar) {
        p247y7.AbstractC7350t.f(xVar, "javaTypeEnhancementState");
        return xVar.c().l(X7.v.e()) == X7.G.STRICT;
    }

    public static final O7.AbstractC1439u d(O7.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "<this>");
        O7.AbstractC1439u abstractC1439uG = X7.s.g(n0Var);
        p247y7.AbstractC7350t.e(abstractC1439uG, "toDescriptorVisibility(...)");
        return abstractC1439uG;
    }
}
