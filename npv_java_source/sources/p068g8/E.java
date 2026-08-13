package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {
    public static final java.lang.Object a(p068g8.p pVar, java.lang.Object obj, boolean z6) {
        p247y7.AbstractC7350t.f(pVar, "<this>");
        p247y7.AbstractC7350t.f(obj, "possiblyPrimitiveType");
        return z6 ? pVar.e(obj) : obj;
    }

    public static final java.lang.Object b(F8.o0 o0Var, J8.i iVar, p068g8.p pVar, p068g8.D d6) {
        p247y7.AbstractC7350t.f(o0Var, "<this>");
        p247y7.AbstractC7350t.f(iVar, "type");
        p247y7.AbstractC7350t.f(pVar, "typeFactory");
        p247y7.AbstractC7350t.f(d6, "mode");
        J8.m mVarU0 = o0Var.u0(iVar);
        if (!o0Var.X(mVarU0)) {
            return null;
        }
        L7.h hVarO = o0Var.o(mVarU0);
        if (hVarO != null) {
            return a(pVar, pVar.a(hVarO), o0Var.p(iVar) || p058f8.s.c(o0Var, iVar));
        }
        L7.h hVarN = o0Var.N(mVarU0);
        if (hVarN != null) {
            return pVar.c('[' + p228w8.e.g(hVarN).m());
        }
        if (o0Var.C(mVarU0)) {
            p138n8.d dVarK = o0Var.K(mVarU0);
            p138n8.b bVarN = dVarK != null ? N7.c.f7820a.n(dVarK) : null;
            if (bVarN != null) {
                if (!d6.a()) {
                    java.util.List listI = N7.c.f7820a.i();
                    if (!(listI instanceof java.util.Collection) || !listI.isEmpty()) {
                        java.util.Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            if (p247y7.AbstractC7350t.b(((N7.c.a) it.next()).d(), bVarN)) {
                                return null;
                            }
                        }
                    }
                }
                java.lang.String strF = p228w8.d.b(bVarN).f();
                p247y7.AbstractC7350t.e(strF, "getInternalName(...)");
                return pVar.d(strF);
            }
        }
        return null;
    }
}
