package L7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final int a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        P7.c cVarJ = e6.k().j(L7.j.a.f6333D);
        if (cVarJ == null) {
            return 0;
        }
        p198t8.g gVar = (p198t8.g) p097j7.S.i(cVarJ.a(), L7.j.f6315o);
        p247y7.AbstractC7350t.d(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((java.lang.Number) ((p198t8.m) gVar).b()).intValue();
    }

    public static final F8.M b(L7.g gVar, P7.g gVar2, F8.E e6, java.util.List list, java.util.List list2, java.util.List list3, F8.E e10, boolean z6) {
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        p247y7.AbstractC7350t.f(gVar2, "annotations");
        p247y7.AbstractC7350t.f(list, "contextReceiverTypes");
        p247y7.AbstractC7350t.f(list2, "parameterTypes");
        p247y7.AbstractC7350t.f(e10, "returnType");
        java.util.List listG = g(e6, list, list2, list3, e10, gVar);
        O7.InterfaceC1424e interfaceC1424eF = f(gVar, list2.size() + list.size() + (e6 == null ? 0 : 1), z6);
        if (e6 != null) {
            gVar2 = u(gVar2, gVar);
        }
        if (!list.isEmpty()) {
            gVar2 = t(gVar2, gVar, list.size());
        }
        return F8.F.g(F8.b0.b(gVar2), interfaceC1424eF, listG);
    }

    public static final p138n8.f d(F8.E e6) {
        java.lang.String str;
        p247y7.AbstractC7350t.f(e6, "<this>");
        P7.c cVarJ = e6.k().j(L7.j.a.f6335E);
        if (cVarJ == null) {
            return null;
        }
        java.lang.Object objH0 = p097j7.AbstractC6879v.H0(cVarJ.a().values());
        p198t8.u uVar = objH0 instanceof p198t8.u ? (p198t8.u) objH0 : null;
        if (uVar != null && (str = (java.lang.String) uVar.b()) != null) {
            if (!p138n8.f.r(str)) {
                str = null;
            }
            if (str != null) {
                return p138n8.f.o(str);
            }
        }
        return null;
    }

    public static final java.util.List e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p(e6);
        int iA = a(e6);
        if (iA == 0) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.List listSubList = e6.U0().subList(0, iA);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listSubList, 10));
        java.util.Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            F8.E type = ((F8.i0) it.next()).getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final O7.InterfaceC1424e f(L7.g gVar, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        O7.InterfaceC1424e interfaceC1424eX = z6 ? gVar.X(i6) : gVar.C(i6);
        p247y7.AbstractC7350t.c(interfaceC1424eX);
        return interfaceC1424eX;
    }

    public static final java.util.List g(F8.E e6, java.util.List list, java.util.List list2, java.util.List list3, F8.E e10, L7.g gVar) {
        p138n8.f fVar;
        p247y7.AbstractC7350t.f(list, "contextReceiverTypes");
        p247y7.AbstractC7350t.f(list2, "parameterTypes");
        p247y7.AbstractC7350t.f(e10, "returnType");
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        int i6 = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() + list.size() + (e6 != null ? 1 : 0) + 1);
        java.util.List list4 = list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list4, 10));
        java.util.Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(K8.a.a((F8.E) it.next()));
        }
        arrayList.addAll(arrayList2);
        P8.a.a(arrayList, e6 != null ? K8.a.a(e6) : null);
        for (java.lang.Object obj : list2) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            F8.E eX = (F8.E) obj;
            if (list3 == null || (fVar = (p138n8.f) list3.get(i6)) == null || fVar.q()) {
                fVar = null;
            }
            if (fVar != null) {
                p138n8.c cVar = L7.j.a.f6335E;
                p138n8.f fVar2 = L7.j.f6311k;
                java.lang.String strG = fVar.g();
                p247y7.AbstractC7350t.e(strG, "asString(...)");
                eX = K8.a.x(eX, P7.g.f8385d.a(p097j7.AbstractC6879v.B0(eX.k(), new P7.j(gVar, cVar, p097j7.S.e(p087i7.B.a(fVar2, new p198t8.u(strG))), false, 8, null))));
            }
            arrayList.add(K8.a.a(eX));
            i6 = i10;
        }
        arrayList.add(K8.a.a(e10));
        return arrayList;
    }

    public static final M7.f h(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (interfaceC1427hW != null) {
            return i(interfaceC1427hW);
        }
        return null;
    }

    public static final M7.f i(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        if ((interfaceC1432m instanceof O7.InterfaceC1424e) && L7.g.B0(interfaceC1432m)) {
            return j(p218v8.c.m(interfaceC1432m));
        }
        return null;
    }

    private static final M7.f j(p138n8.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        M7.g gVarA = M7.g.f7070c.a();
        p138n8.c cVarE = dVar.l().e();
        p247y7.AbstractC7350t.e(cVarE, "parent(...)");
        java.lang.String strG = dVar.i().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return gVarA.b(cVarE, strG);
    }

    public static final F8.E k(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p(e6);
        if (!s(e6)) {
            return null;
        }
        return ((F8.i0) e6.U0().get(a(e6))).getType();
    }

    public static final F8.E l(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p(e6);
        F8.E type = ((F8.i0) p097j7.AbstractC6879v.t0(e6.U0())).getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        return type;
    }

    public static final java.util.List m(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p(e6);
        java.util.List listU0 = e6.U0();
        return listU0.subList(a(e6) + (n(e6) ? 1 : 0), listU0.size() - 1);
    }

    public static final boolean n(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return p(e6) && s(e6);
    }

    public static final boolean o(O7.InterfaceC1432m interfaceC1432m) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "<this>");
        M7.f fVarI = i(interfaceC1432m);
        return p247y7.AbstractC7350t.b(fVarI, M7.f.a.f7066e) || p247y7.AbstractC7350t.b(fVarI, M7.f.d.f7069e);
    }

    public static final boolean p(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        return interfaceC1427hW != null && o(interfaceC1427hW);
    }

    public static final boolean q(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return p247y7.AbstractC7350t.b(h(e6), M7.f.a.f7066e);
    }

    public static final boolean r(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return p247y7.AbstractC7350t.b(h(e6), M7.f.d.f7069e);
    }

    private static final boolean s(F8.E e6) {
        return e6.k().j(L7.j.a.f6331C) != null;
    }

    public static final P7.g t(P7.g gVar, L7.g gVar2, int i6) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(gVar2, "builtIns");
        p138n8.c cVar = L7.j.a.f6333D;
        if (gVar.H(cVar)) {
            return gVar;
        }
        return P7.g.f8385d.a(p097j7.AbstractC6879v.B0(gVar, new P7.j(gVar2, cVar, p097j7.S.e(p087i7.B.a(L7.j.f6315o, new p198t8.m(i6))), false, 8, null)));
    }

    public static final P7.g u(P7.g gVar, L7.g gVar2) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(gVar2, "builtIns");
        p138n8.c cVar = L7.j.a.f6331C;
        if (gVar.H(cVar)) {
            return gVar;
        }
        return P7.g.f8385d.a(p097j7.AbstractC6879v.B0(gVar, new P7.j(gVar2, cVar, p097j7.S.h(), false, 8, null)));
    }
}
