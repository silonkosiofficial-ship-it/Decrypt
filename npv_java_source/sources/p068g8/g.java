package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final java.lang.String a(O7.InterfaceC1424e interfaceC1424e, p068g8.B b6) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "klass");
        p247y7.AbstractC7350t.f(b6, "typeMappingConfiguration");
        java.lang.String strA = b6.a(interfaceC1424e);
        if (strA != null) {
            return strA;
        }
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1424e.b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        java.lang.String strM = p138n8.h.b(interfaceC1424e.getName()).m();
        p247y7.AbstractC7350t.e(strM, "getIdentifier(...)");
        if (interfaceC1432mB instanceof O7.K) {
            p138n8.c cVarE = ((O7.K) interfaceC1432mB).e();
            if (cVarE.d()) {
                return strM;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strB = cVarE.b();
            p247y7.AbstractC7350t.e(strB, "asString(...)");
            sb.append(S8.r.Q(strB, '.', '/', false, 4, null));
            sb.append('/');
            sb.append(strM);
            return sb.toString();
        }
        O7.InterfaceC1424e interfaceC1424e2 = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
        if (interfaceC1424e2 == null) {
            throw new java.lang.IllegalArgumentException("Unexpected container: " + interfaceC1432mB + " for " + interfaceC1424e);
        }
        java.lang.String strF = b6.f(interfaceC1424e2);
        if (strF == null) {
            strF = a(interfaceC1424e2, b6);
        }
        return strF + '$' + strM;
    }

    public static /* synthetic */ java.lang.String b(O7.InterfaceC1424e interfaceC1424e, p068g8.B b6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            b6 = p068g8.C.f45593a;
        }
        return a(interfaceC1424e, b6);
    }

    public static final boolean c(O7.InterfaceC1420a interfaceC1420a) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "descriptor");
        if (interfaceC1420a instanceof O7.InterfaceC1431l) {
            return true;
        }
        F8.E eL = interfaceC1420a.l();
        p247y7.AbstractC7350t.c(eL);
        if (L7.g.C0(eL)) {
            F8.E eL2 = interfaceC1420a.l();
            p247y7.AbstractC7350t.c(eL2);
            if (!F8.q0.l(eL2) && !(interfaceC1420a instanceof O7.V)) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.Object d(F8.E e6, p068g8.p pVar, p068g8.D d6, p068g8.B b6, p068g8.m mVar, p237x7.q qVar) {
        java.lang.Object objD;
        F8.E e10;
        java.lang.Object objD2;
        p247y7.AbstractC7350t.f(e6, "kotlinType");
        p247y7.AbstractC7350t.f(pVar, "factory");
        p247y7.AbstractC7350t.f(d6, "mode");
        p247y7.AbstractC7350t.f(b6, "typeMappingConfiguration");
        p247y7.AbstractC7350t.f(qVar, "writeGenericType");
        F8.E e11 = b6.e(e6);
        if (e11 != null) {
            return d(e11, pVar, d6, b6, mVar, qVar);
        }
        if (L7.f.r(e6)) {
            return d(L7.k.a(e6), pVar, d6, b6, mVar, qVar);
        }
        G8.o oVar = G8.o.f3161a;
        java.lang.Object objB = p068g8.E.b(oVar, e6, pVar, d6);
        if (objB != null) {
            java.lang.Object objA = p068g8.E.a(pVar, objB, d6.d());
            qVar.j(e6, objA, d6);
            return objA;
        }
        F8.e0 e0VarW0 = e6.W0();
        if (e0VarW0 instanceof F8.D) {
            F8.D d10 = (F8.D) e0VarW0;
            F8.E eD = d10.d();
            if (eD == null) {
                eD = b6.d(d10.u());
            }
            return d(K8.a.y(eD), pVar, d6, b6, mVar, qVar);
        }
        O7.InterfaceC1427h interfaceC1427hW = e0VarW0.w();
        if (interfaceC1427hW == null) {
            throw new java.lang.UnsupportedOperationException("no descriptor for type constructor of " + e6);
        }
        if (H8.k.m(interfaceC1427hW)) {
            java.lang.Object objD3 = pVar.d("error/NonExistentClass");
            b6.b(e6, (O7.InterfaceC1424e) interfaceC1427hW);
            return objD3;
        }
        boolean z6 = interfaceC1427hW instanceof O7.InterfaceC1424e;
        if (z6 && L7.g.c0(e6)) {
            if (e6.U0().size() != 1) {
                throw new java.lang.UnsupportedOperationException("arrays must have one type argument");
            }
            F8.i0 i0Var = (F8.i0) e6.U0().get(0);
            F8.E type = i0Var.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            if (i0Var.a() == F8.u0.IN_VARIANCE) {
                objD2 = pVar.d("java/lang/Object");
            } else {
                F8.u0 u0VarA = i0Var.a();
                p247y7.AbstractC7350t.e(u0VarA, "getProjectionKind(...)");
                objD2 = d(type, pVar, d6.f(u0VarA, true), b6, mVar, qVar);
            }
            return pVar.c('[' + pVar.b(objD2));
        }
        if (!z6) {
            if (interfaceC1427hW instanceof O7.f0) {
                F8.E eJ = K8.a.j((O7.f0) interfaceC1427hW);
                if (e6.X0()) {
                    eJ = K8.a.w(eJ);
                }
                return d(eJ, pVar, d6, b6, null, P8.e.b());
            }
            if ((interfaceC1427hW instanceof O7.e0) && d6.b()) {
                return d(((O7.e0) interfaceC1427hW).c0(), pVar, d6, b6, mVar, qVar);
            }
            throw new java.lang.UnsupportedOperationException("Unknown type " + e6);
        }
        if (p178r8.h.b(interfaceC1427hW) && !d6.c() && (e10 = (F8.E) F8.AbstractC0962x.a(oVar, e6)) != null) {
            return d(e10, pVar, d6.g(), b6, mVar, qVar);
        }
        if (d6.e() && L7.g.l0((O7.InterfaceC1424e) interfaceC1427hW)) {
            objD = pVar.f();
        } else {
            O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) interfaceC1427hW;
            O7.InterfaceC1424e interfaceC1424eA = interfaceC1424e.a();
            p247y7.AbstractC7350t.e(interfaceC1424eA, "getOriginal(...)");
            java.lang.Object objC = b6.c(interfaceC1424eA);
            if (objC == null) {
                if (interfaceC1424e.j() == O7.EnumC1425f.ENUM_ENTRY) {
                    O7.InterfaceC1432m interfaceC1432mB = interfaceC1424e.b();
                    p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC1424e = (O7.InterfaceC1424e) interfaceC1432mB;
                }
                O7.InterfaceC1424e interfaceC1424eA2 = interfaceC1424e.a();
                p247y7.AbstractC7350t.e(interfaceC1424eA2, "getOriginal(...)");
                objD = pVar.d(a(interfaceC1424eA2, b6));
            } else {
                objD = objC;
            }
        }
        qVar.j(e6, objD, d6);
        return objD;
    }

    public static /* synthetic */ java.lang.Object e(F8.E e6, p068g8.p pVar, p068g8.D d6, p068g8.B b6, p068g8.m mVar, p237x7.q qVar, int i6, java.lang.Object obj) {
        if ((i6 & 32) != 0) {
            qVar = P8.e.b();
        }
        return d(e6, pVar, d6, b6, mVar, qVar);
    }
}
