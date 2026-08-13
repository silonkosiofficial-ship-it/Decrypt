package I7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public static final J7.e b(I7.y.a aVar, boolean z6) {
        I7.AbstractC1272h.e eVarC;
        java.lang.reflect.Method methodC;
        J7.e aVar2;
        java.lang.reflect.Field fieldB;
        l8.a.c cVarC;
        J7.e cVar;
        java.lang.reflect.Method methodL;
        if (I7.AbstractC1278n.f5446C.a().d(aVar.a().L())) {
            return J7.i.f5801a;
        }
        I7.AbstractC1273i abstractC1273iF = I7.I.f5334a.f(aVar.a().F());
        if (abstractC1273iF instanceof I7.AbstractC1273i.c) {
            I7.AbstractC1273i.c cVar2 = (I7.AbstractC1273i.c) abstractC1273iF;
            l8.a.d dVarF = cVar2.f();
            if (z6) {
                if (dVarF.G()) {
                    cVarC = dVarF.B();
                } else {
                    cVarC = null;
                }
            } else if (dVarF.H()) {
                cVarC = dVarF.C();
            } else {
                cVarC = null;
            }
            java.lang.reflect.Method methodN = cVarC != null ? aVar.a().t().n(cVar2.d().getString(cVarC.x()), cVar2.d().getString(cVarC.w())) : null;
            if (methodN != null) {
                if (!java.lang.reflect.Modifier.isStatic(methodN.getModifiers())) {
                    cVar = aVar.E() ? new J7.f.h.a(methodN, f(aVar)) : new J7.f.h.e(methodN);
                } else if (d(aVar)) {
                    cVar = aVar.E() ? new J7.f.h.b(methodN) : new J7.f.h.C0136f(methodN);
                } else {
                    cVar = aVar.E() ? new J7.f.h.c(methodN, f(aVar)) : new J7.f.h.g(methodN);
                }
                aVar2 = cVar;
            } else if (p178r8.h.e(aVar.a().F()) && p247y7.AbstractC7350t.b(aVar.a().F().h(), O7.AbstractC1438t.f8185d)) {
                java.lang.Class clsS = J7.k.s(aVar.a().F().b());
                if (clsS == null || (methodL = J7.k.l(clsS, aVar.a().F())) == null) {
                    throw new I7.D("Underlying property of inline class " + aVar.a() + " should have a field");
                }
                aVar2 = aVar.E() ? new J7.h.a(methodL, f(aVar)) : new J7.h.b(methodL);
            } else {
                fieldB = aVar.a().K();
                if (fieldB == null) {
                    throw new I7.D("No accessors or field is found for property " + aVar.a());
                }
                aVar2 = c(aVar, z6, fieldB);
            }
        } else if (abstractC1273iF instanceof I7.AbstractC1273i.a) {
            fieldB = ((I7.AbstractC1273i.a) abstractC1273iF).b();
            aVar2 = c(aVar, z6, fieldB);
        } else {
            if (!(abstractC1273iF instanceof I7.AbstractC1273i.b)) {
                if (!(abstractC1273iF instanceof I7.AbstractC1273i.d)) {
                    throw new p087i7.s();
                }
                I7.AbstractC1273i.d dVar = (I7.AbstractC1273i.d) abstractC1273iF;
                if (z6) {
                    eVarC = dVar.b();
                } else {
                    eVarC = dVar.c();
                    if (eVarC == null) {
                        throw new I7.D("No setter found for property " + aVar.a());
                    }
                }
                java.lang.reflect.Method methodN2 = aVar.a().t().n(eVarC.c(), eVarC.b());
                if (methodN2 != null) {
                    java.lang.reflect.Modifier.isStatic(methodN2.getModifiers());
                    return aVar.E() ? new J7.f.h.a(methodN2, f(aVar)) : new J7.f.h.e(methodN2);
                }
                throw new I7.D("No accessor found for property " + aVar.a());
            }
            I7.AbstractC1273i.b bVar = (I7.AbstractC1273i.b) abstractC1273iF;
            if (z6) {
                methodC = bVar.b();
            } else {
                methodC = bVar.c();
                if (methodC == null) {
                    throw new I7.D("No source found for setter of Java method property: " + bVar.b());
                }
            }
            aVar2 = aVar.E() ? new J7.f.h.a(methodC, f(aVar)) : new J7.f.h.e(methodC);
        }
        return J7.k.i(aVar2, aVar.F(), false, 2, null);
    }

    private static final J7.f c(I7.y.a aVar, boolean z6, java.lang.reflect.Field field) {
        J7.f aVar2;
        if (g(aVar.a().F()) || !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
            if (!z6) {
                aVar2 = aVar.E() ? new J7.f.g.a(field, e(aVar), f(aVar)) : new J7.f.g.c(field, e(aVar));
            } else {
                if (!aVar.E()) {
                    return new J7.f.AbstractC0135f.c(field);
                }
                aVar2 = new J7.f.AbstractC0135f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z6) {
                return aVar.E() ? new J7.f.AbstractC0135f.b(field) : new J7.f.AbstractC0135f.d(field);
            }
            aVar2 = aVar.E() ? new J7.f.g.b(field, e(aVar)) : new J7.f.g.d(field, e(aVar));
        } else {
            if (z6) {
                return new J7.f.AbstractC0135f.e(field);
            }
            aVar2 = new J7.f.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(I7.y.a aVar) {
        return aVar.a().F().k().H(I7.M.j());
    }

    private static final boolean e(I7.y.a aVar) {
        return !F8.q0.l(aVar.a().F().getType());
    }

    public static final java.lang.Object f(I7.y.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        return aVar.a().G();
    }

    private static final boolean g(O7.U u6) {
        O7.InterfaceC1432m interfaceC1432mB = u6.b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        if (!p178r8.f.x(interfaceC1432mB)) {
            return false;
        }
        O7.InterfaceC1432m interfaceC1432mB2 = interfaceC1432mB.b();
        return !(p178r8.f.C(interfaceC1432mB2) || p178r8.f.t(interfaceC1432mB2)) || ((u6 instanceof D8.j) && p128m8.i.f(((D8.j) u6).J()));
    }
}
