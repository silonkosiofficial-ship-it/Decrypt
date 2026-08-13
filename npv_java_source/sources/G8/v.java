package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v {
    private static final F8.E a(F8.E e6) {
        return (F8.E) L8.b.a(e6).d();
    }

    private static final java.lang.String b(F8.e0 e0Var) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        c("type: " + e0Var, sb);
        c("hashCode: " + e0Var.hashCode(), sb);
        c("javaClass: " + e0Var.getClass().getCanonicalName(), sb);
        for (O7.InterfaceC1432m interfaceC1432mW = e0Var.w(); interfaceC1432mW != null; interfaceC1432mW = interfaceC1432mW.b()) {
            c("fqName: " + p168q8.c.f53159g.q(interfaceC1432mW), sb);
            c("javaClass: " + interfaceC1432mW.getClass().getCanonicalName(), sb);
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    private static final java.lang.StringBuilder c(java.lang.String str, java.lang.StringBuilder sb) {
        p247y7.AbstractC7350t.f(str, "<this>");
        sb.append(str);
        p247y7.AbstractC7350t.e(sb, "append(...)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append(...)");
        return sb;
    }

    public static final F8.E d(F8.E e6, F8.E e10, G8.t tVar) {
        p247y7.AbstractC7350t.f(e6, "subtype");
        p247y7.AbstractC7350t.f(e10, "supertype");
        p247y7.AbstractC7350t.f(tVar, "typeCheckingProcedureCallbacks");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.add(new G8.q(e6, null));
        F8.e0 e0VarW0 = e10.W0();
        while (!arrayDeque.isEmpty()) {
            G8.q qVarA = (G8.q) arrayDeque.poll();
            F8.E eB = qVarA.b();
            F8.e0 e0VarW1 = eB.W0();
            if (tVar.a(e0VarW1, e0VarW0)) {
                boolean zX0 = eB.X0();
                while (true) {
                    qVarA = qVarA.a();
                    if (qVarA == null) {
                        break;
                    }
                    F8.E eB2 = qVarA.b();
                    java.util.List listU0 = eB2.U0();
                    if (!(listU0 instanceof java.util.Collection) || !listU0.isEmpty()) {
                        java.util.Iterator it = listU0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                eB = F8.f0.f2923c.a(eB2).c().n(eB, F8.u0.INVARIANT);
                                p247y7.AbstractC7350t.c(eB);
                                break;
                            }
                            F8.u0 u0VarA = ((F8.i0) it.next()).a();
                            F8.u0 u0Var = F8.u0.INVARIANT;
                            if (u0VarA != u0Var) {
                                F8.E eN = p188s8.d.f(F8.f0.f2923c.a(eB2), false, 1, null).c().n(eB, u0Var);
                                p247y7.AbstractC7350t.e(eN, "safeSubstitute(...)");
                                eB = a(eN);
                                break;
                            }
                        }
                    } else {
                        eB = F8.f0.f2923c.a(eB2).c().n(eB, F8.u0.INVARIANT);
                        p247y7.AbstractC7350t.c(eB);
                        break;
                    }
                    zX0 = zX0 || eB2.X0();
                }
                F8.e0 e0VarW2 = eB.W0();
                if (tVar.a(e0VarW2, e0VarW0)) {
                    return F8.q0.p(eB, zX0);
                }
                throw new java.lang.AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(e0VarW2) + ", \n\nsupertype: " + b(e0VarW0) + " \n" + tVar.a(e0VarW2, e0VarW0));
            }
            for (F8.E e11 : e0VarW1.u()) {
                p247y7.AbstractC7350t.c(e11);
                arrayDeque.add(new G8.q(e11, qVarA));
            }
        }
        return null;
    }
}
