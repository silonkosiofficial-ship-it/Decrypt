package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I7.I f5334a = new I7.I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.b f5335b;

    static {
        p138n8.b bVarM = p138n8.b.m(new p138n8.c("java.lang.Void"));
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        f5335b = bVarM;
    }

    private I() {
    }

    private final L7.h a(java.lang.Class cls) {
        if (cls.isPrimitive()) {
            return p228w8.e.i(cls.getSimpleName()).o();
        }
        return null;
    }

    private final boolean b(O7.InterfaceC1443y interfaceC1443y) {
        if (p178r8.e.p(interfaceC1443y) || p178r8.e.q(interfaceC1443y)) {
            return true;
        }
        return p247y7.AbstractC7350t.b(interfaceC1443y.getName(), N7.a.f7816e.a()) && interfaceC1443y.n().isEmpty();
    }

    private final I7.AbstractC1272h.e d(O7.InterfaceC1443y interfaceC1443y) {
        return new I7.AbstractC1272h.e(new m8.d.b(e(interfaceC1443y), p068g8.y.c(interfaceC1443y, false, false, 1, null)));
    }

    private final java.lang.String e(O7.InterfaceC1421b interfaceC1421b) {
        java.lang.String strB = X7.H.b(interfaceC1421b);
        if (strB != null) {
            return strB;
        }
        if (interfaceC1421b instanceof O7.V) {
            java.lang.String strG = p218v8.c.t(interfaceC1421b).getName().g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            return X7.A.b(strG);
        }
        if (interfaceC1421b instanceof O7.W) {
            java.lang.String strG2 = p218v8.c.t(interfaceC1421b).getName().g();
            p247y7.AbstractC7350t.e(strG2, "asString(...)");
            return X7.A.e(strG2);
        }
        java.lang.String strG3 = interfaceC1421b.getName().g();
        p247y7.AbstractC7350t.e(strG3, "asString(...)");
        return strG3;
    }

    public final p138n8.b c(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "klass");
        if (cls.isArray()) {
            java.lang.Class<?> componentType = cls.getComponentType();
            p247y7.AbstractC7350t.e(componentType, "getComponentType(...)");
            L7.h hVarA = a(componentType);
            if (hVarA != null) {
                return new p138n8.b(L7.j.f6325y, hVarA.i());
            }
            p138n8.b bVarM = p138n8.b.m(L7.j.a.f6381i.l());
            p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
            return bVarM;
        }
        if (p247y7.AbstractC7350t.b(cls, java.lang.Void.TYPE)) {
            return f5335b;
        }
        L7.h hVarA2 = a(cls);
        if (hVarA2 != null) {
            return new p138n8.b(L7.j.f6325y, hVarA2.n());
        }
        p138n8.b bVarA = U7.d.a(cls);
        if (!bVarA.k()) {
            N7.c cVar = N7.c.f7820a;
            p138n8.c cVarB = bVarA.b();
            p247y7.AbstractC7350t.e(cVarB, "asSingleFqName(...)");
            p138n8.b bVarM2 = cVar.m(cVarB);
            if (bVarM2 != null) {
                return bVarM2;
            }
        }
        return bVarA;
    }

    public final I7.AbstractC1273i f(O7.U u6) {
        p247y7.AbstractC7350t.f(u6, "possiblyOverriddenProperty");
        O7.U uA = ((O7.U) p178r8.f.L(u6)).a();
        p247y7.AbstractC7350t.e(uA, "getOriginal(...)");
        if (uA instanceof D8.j) {
            D8.j jVar = (D8.j) uA;
            p088i8.n nVarO1 = jVar.J();
            p8.i.f fVar = p118l8.a.f50075d;
            p247y7.AbstractC7350t.e(fVar, "propertySignature");
            l8.a.d dVar = (l8.a.d) p108k8.e.a(nVarO1, fVar);
            if (dVar != null) {
                return new I7.AbstractC1273i.c(uA, nVarO1, dVar, jVar.h0(), jVar.Z());
            }
        } else if (uA instanceof Z7.f) {
            O7.a0 a0VarO = ((Z7.f) uA).o();
            p038d8.a aVar = a0VarO instanceof p038d8.a ? (p038d8.a) a0VarO : null;
            p048e8.l lVarB = aVar != null ? aVar.b() : null;
            if (lVarB instanceof U7.r) {
                return new I7.AbstractC1273i.a(((U7.r) lVarB).Y());
            }
            if (lVarB instanceof U7.u) {
                java.lang.reflect.Method methodA0 = ((U7.u) lVarB).Y();
                O7.W wI = uA.i();
                O7.a0 a0VarO2 = wI != null ? wI.o() : null;
                p038d8.a aVar2 = a0VarO2 instanceof p038d8.a ? (p038d8.a) a0VarO2 : null;
                p048e8.l lVarB2 = aVar2 != null ? aVar2.b() : null;
                U7.u uVar = lVarB2 instanceof U7.u ? (U7.u) lVarB2 : null;
                return new I7.AbstractC1273i.b(methodA0, uVar != null ? uVar.Y() : null);
            }
            throw new I7.D("Incorrect resolution sequence for Java field " + uA + " (source = " + lVarB + ')');
        }
        O7.V vD = uA.d();
        p247y7.AbstractC7350t.c(vD);
        I7.AbstractC1272h.e eVarD = d(vD);
        O7.W wI2 = uA.i();
        return new I7.AbstractC1273i.d(eVarD, wI2 != null ? d(wI2) : null);
    }

    public final I7.AbstractC1272h g(O7.InterfaceC1443y interfaceC1443y) {
        java.lang.reflect.Method methodA0;
        m8.d.b bVarB;
        m8.d.b bVarE;
        p247y7.AbstractC7350t.f(interfaceC1443y, "possiblySubstitutedFunction");
        O7.InterfaceC1443y interfaceC1443yA = ((O7.InterfaceC1443y) p178r8.f.L(interfaceC1443y)).a();
        p247y7.AbstractC7350t.e(interfaceC1443yA, "getOriginal(...)");
        if (!(interfaceC1443yA instanceof D8.b)) {
            if (interfaceC1443yA instanceof Z7.e) {
                O7.a0 a0VarO = ((Z7.e) interfaceC1443yA).o();
                p038d8.a aVar = a0VarO instanceof p038d8.a ? (p038d8.a) a0VarO : null;
                p048e8.l lVarB = aVar != null ? aVar.b() : null;
                U7.u uVar = lVarB instanceof U7.u ? (U7.u) lVarB : null;
                if (uVar != null && (methodA0 = uVar.Y()) != null) {
                    return new I7.AbstractC1272h.c(methodA0);
                }
                throw new I7.D("Incorrect resolution sequence for Java method " + interfaceC1443yA);
            }
            if (!(interfaceC1443yA instanceof Z7.b)) {
                if (b(interfaceC1443yA)) {
                    return d(interfaceC1443yA);
                }
                throw new I7.D("Unknown origin of " + interfaceC1443yA + " (" + interfaceC1443yA.getClass() + ')');
            }
            O7.a0 a0VarO2 = ((Z7.b) interfaceC1443yA).o();
            p038d8.a aVar2 = a0VarO2 instanceof p038d8.a ? (p038d8.a) a0VarO2 : null;
            p048e8.l lVarB2 = aVar2 != null ? aVar2.b() : null;
            if (lVarB2 instanceof U7.o) {
                return new I7.AbstractC1272h.b(((U7.o) lVarB2).Y());
            }
            if (lVarB2 instanceof U7.l) {
                U7.l lVar = (U7.l) lVarB2;
                if (lVar.t()) {
                    return new I7.AbstractC1272h.a(lVar.A());
                }
            }
            throw new I7.D("Incorrect resolution sequence for Java constructor " + interfaceC1443yA + " (" + lVarB2 + ')');
        }
        D8.b bVar = (D8.b) interfaceC1443yA;
        p158p8.p pVarJ = bVar.J();
        if ((pVarJ instanceof p088i8.i) && (bVarE = p128m8.i.f51228a.e((p088i8.i) pVarJ, bVar.h0(), bVar.Z())) != null) {
            return new I7.AbstractC1272h.e(bVarE);
        }
        if (!(pVarJ instanceof p088i8.d) || (bVarB = p128m8.i.f51228a.b((p088i8.d) pVarJ, bVar.h0(), bVar.Z())) == null) {
            return d(interfaceC1443yA);
        }
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1443y.b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        if (p178r8.h.b(interfaceC1432mB)) {
            return new I7.AbstractC1272h.e(bVarB);
        }
        O7.InterfaceC1432m interfaceC1432mB2 = interfaceC1443y.b();
        p247y7.AbstractC7350t.e(interfaceC1432mB2, "getContainingDeclaration(...)");
        if (!p178r8.h.d(interfaceC1432mB2)) {
            return new I7.AbstractC1272h.d(bVarB);
        }
        O7.InterfaceC1431l interfaceC1431l = (O7.InterfaceC1431l) interfaceC1443y;
        if (interfaceC1431l.G()) {
            if (!p247y7.AbstractC7350t.b(bVarB.c(), "constructor-impl") || !S8.r.J(bVarB.b(), ")V", false, 2, null)) {
                throw new java.lang.IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        } else {
            if (!p247y7.AbstractC7350t.b(bVarB.c(), "constructor-impl")) {
                throw new java.lang.IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
            O7.InterfaceC1424e interfaceC1424eH = interfaceC1431l.H();
            p247y7.AbstractC7350t.e(interfaceC1424eH, "getConstructedClass(...)");
            java.lang.String strT = J7.k.t(interfaceC1424eH);
            if (S8.r.J(bVarB.b(), ")V", false, 2, null)) {
                bVarB = m8.d.b.e(bVarB, null, S8.r.K0(bVarB.b(), "V") + strT, 1, null);
            } else if (!S8.r.J(bVarB.b(), strT, false, 2, null)) {
                throw new java.lang.IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        }
        return new I7.AbstractC1272h.e(bVarB);
    }
}
