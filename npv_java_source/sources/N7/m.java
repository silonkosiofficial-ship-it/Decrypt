package N7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    public static final F8.f0 a(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1424e interfaceC1424e2) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "from");
        p247y7.AbstractC7350t.f(interfaceC1424e2, "to");
        interfaceC1424e.A().size();
        interfaceC1424e2.A().size();
        F8.f0.a aVar = F8.f0.f2923c;
        java.util.List listA = interfaceC1424e.A();
        p247y7.AbstractC7350t.e(listA, "getDeclaredTypeParameters(...)");
        java.util.List list = listA;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((O7.f0) it.next()).p());
        }
        java.util.List listA2 = interfaceC1424e2.A();
        p247y7.AbstractC7350t.e(listA2, "getDeclaredTypeParameters(...)");
        java.util.List list2 = listA2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            F8.M mW = ((O7.f0) it2.next()).w();
            p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
            arrayList2.add(K8.a.a(mW));
        }
        return F8.f0.a.e(aVar, p097j7.S.q(p097j7.AbstractC6879v.c1(arrayList, arrayList2)), false, 2, null);
    }
}
