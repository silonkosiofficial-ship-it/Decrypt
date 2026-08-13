package Z7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final java.util.List a(java.util.Collection collection, java.util.Collection collection2, O7.InterfaceC1420a interfaceC1420a) {
        p247y7.AbstractC7350t.f(collection, "newValueParameterTypes");
        p247y7.AbstractC7350t.f(collection2, "oldValueParameters");
        p247y7.AbstractC7350t.f(interfaceC1420a, "newOwner");
        collection.size();
        collection2.size();
        java.util.List listC1 = p097j7.AbstractC6879v.c1(collection, collection2);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listC1, 10));
        for (java.util.Iterator it = listC1.iterator(); it.hasNext(); it = it) {
            p087i7.u uVar = (p087i7.u) it.next();
            F8.E e6 = (F8.E) uVar.a();
            O7.j0 j0Var = (O7.j0) uVar.b();
            int index = j0Var.getIndex();
            P7.g gVarK = j0Var.k();
            p138n8.f name = j0Var.getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            boolean zD0 = j0Var.D0();
            boolean zJ0 = j0Var.j0();
            boolean zE0 = j0Var.e0();
            F8.E eK = j0Var.u0() != null ? p218v8.c.p(interfaceC1420a).t().k(e6) : null;
            O7.a0 a0VarO = j0Var.o();
            p247y7.AbstractC7350t.e(a0VarO, "getSource(...)");
            arrayList.add(new R7.L(interfaceC1420a, null, index, gVarK, name, e6, zD0, zJ0, zE0, eK, a0VarO));
        }
        return arrayList;
    }

    public static final p018b8.l b(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "<this>");
        O7.InterfaceC1424e interfaceC1424eU = p218v8.c.u(interfaceC1424e);
        if (interfaceC1424eU == null) {
            return null;
        }
        p248y8.h hVarY = interfaceC1424eU.Y();
        p018b8.l lVar = hVarY instanceof p018b8.l ? (p018b8.l) hVarY : null;
        return lVar == null ? b(interfaceC1424eU) : lVar;
    }
}
