package J7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(J7.e eVar, int i6, O7.InterfaceC1421b interfaceC1421b, boolean z6) {
        if (J7.g.a(eVar) == i6) {
            return;
        }
        throw new I7.D("Inconsistent number of parameters in the descriptor and Java reflection object: " + J7.g.a(eVar) + " != " + i6 + "\nCalling: " + interfaceC1421b + "\nParameter types: " + eVar.m() + ")\nDefault: " + z6);
    }

    public static final java.lang.Object g(java.lang.Object obj, O7.InterfaceC1421b interfaceC1421b) {
        F8.E eK;
        java.lang.Class clsR;
        java.lang.reflect.Method methodL;
        p247y7.AbstractC7350t.f(interfaceC1421b, "descriptor");
        return (((interfaceC1421b instanceof O7.U) && p178r8.h.e((O7.k0) interfaceC1421b)) || (eK = k(interfaceC1421b)) == null || (clsR = r(eK)) == null || (methodL = l(clsR, interfaceC1421b)) == null) ? obj : methodL.invoke(obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:21:0x0066->B:37:?, LOOP_END, SYNTHETIC] */
    public static final J7.e h(J7.e eVar, O7.InterfaceC1421b interfaceC1421b, boolean z6) {
        java.util.List list;
        java.util.Iterator it;
        F8.E type;
        F8.E eL;
        p247y7.AbstractC7350t.f(eVar, "<this>");
        p247y7.AbstractC7350t.f(interfaceC1421b, "descriptor");
        if (!p178r8.h.a(interfaceC1421b)) {
            java.util.List listA0 = interfaceC1421b.A0();
            p247y7.AbstractC7350t.e(listA0, "getContextReceiverParameters(...)");
            java.util.List list2 = listA0;
            if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                java.util.List listN = interfaceC1421b.n();
                p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
                list = listN;
                if (!(list instanceof java.util.Collection)) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((O7.j0) it.next()).getType();
                        p247y7.AbstractC7350t.e(type, "getType(...)");
                        if (p178r8.h.h(type)) {
                        }
                    }
                    eL = interfaceC1421b.l();
                    if (eL != null) {
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    type = ((O7.j0) it.next()).getType();
                    p247y7.AbstractC7350t.e(type, "getType(...)");
                    if (p178r8.h.h(type)) {
                    }
                }
                eL = interfaceC1421b.l();
                if (eL != null) {
                }
            }
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                F8.E type2 = ((O7.X) it2.next()).getType();
                p247y7.AbstractC7350t.e(type2, "getType(...)");
                if (p178r8.h.h(type2)) {
                }
            }
            java.util.List listN2 = interfaceC1421b.n();
            p247y7.AbstractC7350t.e(listN2, "getValueParameters(...)");
            list = listN2;
            if (!(list instanceof java.util.Collection) && list.isEmpty()) {
                eL = interfaceC1421b.l();
                return eL != null ? eVar : eVar;
            }
            it = list.iterator();
            while (it.hasNext()) {
                type = ((O7.j0) it.next()).getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                if (p178r8.h.h(type)) {
                }
            }
            eL = interfaceC1421b.l();
            if ((eL != null || !p178r8.h.c(eL)) && !p(interfaceC1421b)) {
            }
        }
        return new J7.j(interfaceC1421b, eVar, z6);
    }

    public static /* synthetic */ J7.e i(J7.e eVar, O7.InterfaceC1421b interfaceC1421b, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return h(eVar, interfaceC1421b, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Method j(java.lang.Class cls, O7.InterfaceC1421b interfaceC1421b) {
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("box-impl", l(cls, interfaceC1421b).getReturnType());
            p247y7.AbstractC7350t.c(declaredMethod);
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new I7.D("No box method found in inline class: " + cls + " (calling " + interfaceC1421b + ')');
        }
    }

    private static final F8.E k(O7.InterfaceC1421b interfaceC1421b) {
        O7.X xV0 = interfaceC1421b.v0();
        O7.X xM0 = interfaceC1421b.m0();
        if (xV0 != null) {
            return xV0.getType();
        }
        if (xM0 != null) {
            if (interfaceC1421b instanceof O7.InterfaceC1431l) {
                return xM0.getType();
            }
            O7.InterfaceC1432m interfaceC1432mB = interfaceC1421b.b();
            O7.InterfaceC1424e interfaceC1424e = interfaceC1432mB instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1432mB : null;
            if (interfaceC1424e != null) {
                return interfaceC1424e.w();
            }
        }
        return null;
    }

    public static final java.lang.reflect.Method l(java.lang.Class cls, O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        p247y7.AbstractC7350t.f(interfaceC1421b, "descriptor");
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            p247y7.AbstractC7350t.c(declaredMethod);
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            throw new I7.D("No unbox method found in inline class: " + cls + " (calling " + interfaceC1421b + ')');
        }
    }

    public static final java.util.List m(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "type");
        java.util.List listN = n(F8.m0.a(m6));
        if (listN == null) {
            return null;
        }
        java.util.List list = listN;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((java.lang.String) it.next()));
        }
        O7.InterfaceC1427h interfaceC1427hW = m6.W0().w();
        p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        java.lang.Class clsQ = I7.M.q((O7.InterfaceC1424e) interfaceC1427hW);
        p247y7.AbstractC7350t.c(clsQ);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((java.lang.String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final java.util.List n(F8.M m6) {
        java.util.Collection collectionE;
        if (!p178r8.h.i(m6)) {
            return null;
        }
        O7.InterfaceC1427h interfaceC1427hW = m6.W0().w();
        p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        O7.H hQ = p218v8.c.q((O7.InterfaceC1424e) interfaceC1427hW);
        p247y7.AbstractC7350t.c(hQ);
        java.util.List<p087i7.u> listB = hQ.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p087i7.u uVar : listB) {
            p138n8.f fVar = (p138n8.f) uVar.a();
            java.util.List listN = n((F8.M) uVar.b());
            if (listN != null) {
                java.util.List list = listN;
                collectionE = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    collectionE.add(fVar.m() + '-' + ((java.lang.String) it.next()));
                }
            } else {
                collectionE = p097j7.AbstractC6879v.e(fVar.m());
            }
            p097j7.AbstractC6879v.C(arrayList, collectionE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List o(F8.M m6, O7.InterfaceC1421b interfaceC1421b) {
        java.lang.reflect.Method methodL;
        java.util.List listM = m(m6);
        if (listM != null) {
            return listM;
        }
        java.lang.Class clsR = r(m6);
        if (clsR == null || (methodL = l(clsR, interfaceC1421b)) == null) {
            return null;
        }
        return p097j7.AbstractC6879v.e(methodL);
    }

    private static final boolean p(O7.InterfaceC1421b interfaceC1421b) {
        F8.E eK = k(interfaceC1421b);
        return eK != null && p178r8.h.h(eK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List q(O7.InterfaceC1421b interfaceC1421b, p237x7.l lVar) {
        F8.M mW;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        O7.X xV0 = interfaceC1421b.v0();
        F8.E type = xV0 != null ? xV0.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (interfaceC1421b instanceof O7.InterfaceC1431l) {
            O7.InterfaceC1424e interfaceC1424eH = ((O7.InterfaceC1431l) interfaceC1421b).H();
            p247y7.AbstractC7350t.e(interfaceC1424eH, "getConstructedClass(...)");
            if (interfaceC1424eH.S()) {
                O7.InterfaceC1432m interfaceC1432mB = interfaceC1424eH.b();
                p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                mW = ((O7.InterfaceC1424e) interfaceC1432mB).w();
                arrayList.add(mW);
            }
        } else {
            O7.InterfaceC1432m interfaceC1432mB2 = interfaceC1421b.b();
            p247y7.AbstractC7350t.e(interfaceC1432mB2, "getContainingDeclaration(...)");
            if ((interfaceC1432mB2 instanceof O7.InterfaceC1424e) && ((java.lang.Boolean) lVar.l(interfaceC1432mB2)).booleanValue()) {
                mW = ((O7.InterfaceC1424e) interfaceC1432mB2).w();
                arrayList.add(mW);
            }
        }
        java.util.List listN = interfaceC1421b.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        java.util.Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(((O7.j0) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Class r(F8.E e6) {
        java.lang.Class clsS = s(e6.W0().w());
        if (clsS == null) {
            return null;
        }
        if (!F8.q0.l(e6)) {
            return clsS;
        }
        F8.E eK = p178r8.h.k(e6);
        if (eK == null || F8.q0.l(eK) || L7.g.s0(eK)) {
            return null;
        }
        return clsS;
    }

    public static final java.lang.Class s(O7.InterfaceC1432m interfaceC1432m) {
        if (!(interfaceC1432m instanceof O7.InterfaceC1424e) || !p178r8.h.b(interfaceC1432m)) {
            return null;
        }
        O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) interfaceC1432m;
        java.lang.Class clsQ = I7.M.q(interfaceC1424e);
        if (clsQ != null) {
            return clsQ;
        }
        throw new I7.D("Class object for the class " + interfaceC1424e.getName() + " cannot be found (classId=" + p218v8.c.k((O7.InterfaceC1427h) interfaceC1432m) + ')');
    }

    public static final java.lang.String t(O7.InterfaceC1427h interfaceC1427h) {
        p247y7.AbstractC7350t.f(interfaceC1427h, "<this>");
        p138n8.b bVarK = p218v8.c.k(interfaceC1427h);
        p247y7.AbstractC7350t.c(bVarK);
        java.lang.String strC = bVarK.c();
        p247y7.AbstractC7350t.e(strC, "asString(...)");
        return p128m8.b.b(strC);
    }
}
