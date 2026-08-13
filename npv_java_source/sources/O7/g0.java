package O7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g0 {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final O7.g0.a f8163D = new O7.g0.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1432m interfaceC1432m) {
            p247y7.AbstractC7350t.f(interfaceC1432m, "it");
            return java.lang.Boolean.valueOf(interfaceC1432m instanceof O7.InterfaceC1420a);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final O7.g0.b f8164D = new O7.g0.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1432m interfaceC1432m) {
            p247y7.AbstractC7350t.f(interfaceC1432m, "it");
            return java.lang.Boolean.valueOf(!(interfaceC1432m instanceof O7.InterfaceC1431l));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final O7.g0.c f8165D = new O7.g0.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R8.h l(O7.InterfaceC1432m interfaceC1432m) {
            p247y7.AbstractC7350t.f(interfaceC1432m, "it");
            java.util.List listG = ((O7.InterfaceC1420a) interfaceC1432m).g();
            p247y7.AbstractC7350t.e(listG, "getTypeParameters(...)");
            return p097j7.AbstractC6879v.Y(listG);
        }
    }

    public static final O7.S a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        return b(e6, interfaceC1427hW instanceof O7.InterfaceC1428i ? (O7.InterfaceC1428i) interfaceC1427hW : null, 0);
    }

    private static final O7.S b(F8.E e6, O7.InterfaceC1428i interfaceC1428i, int i6) {
        if (interfaceC1428i == null || H8.k.m(interfaceC1428i)) {
            return null;
        }
        int size = interfaceC1428i.A().size() + i6;
        if (interfaceC1428i.S()) {
            java.util.List listSubList = e6.U0().subList(i6, size);
            O7.InterfaceC1432m interfaceC1432mB = interfaceC1428i.b();
            return new O7.S(interfaceC1428i, listSubList, b(e6, interfaceC1432mB instanceof O7.InterfaceC1428i ? (O7.InterfaceC1428i) interfaceC1432mB : null, size));
        }
        if (size != e6.U0().size()) {
            p178r8.f.E(interfaceC1428i);
        }
        return new O7.S(interfaceC1428i, e6.U0().subList(i6, e6.U0().size()), null);
    }

    private static final O7.C1422c c(O7.f0 f0Var, O7.InterfaceC1432m interfaceC1432m, int i6) {
        return new O7.C1422c(f0Var, interfaceC1432m, i6);
    }

    public static final java.util.List d(O7.InterfaceC1428i interfaceC1428i) {
        java.util.List listM;
        java.lang.Object next;
        F8.e0 e0VarP;
        p247y7.AbstractC7350t.f(interfaceC1428i, "<this>");
        java.util.List listA = interfaceC1428i.A();
        p247y7.AbstractC7350t.e(listA, "getDeclaredTypeParameters(...)");
        if (!interfaceC1428i.S() && !(interfaceC1428i.b() instanceof O7.InterfaceC1420a)) {
            return listA;
        }
        java.util.List listM2 = R8.k.M(R8.k.B(R8.k.w(R8.k.K(p218v8.c.r(interfaceC1428i), O7.g0.a.f8163D), O7.g0.b.f8164D), O7.g0.c.f8165D));
        java.util.Iterator it = p218v8.c.r(interfaceC1428i).iterator();
        do {
            listM = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof O7.InterfaceC1424e));
        O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) next;
        if (interfaceC1424e != null && (e0VarP = interfaceC1424e.p()) != null) {
            listM = e0VarP.x();
        }
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        if (listM2.isEmpty() && listM.isEmpty()) {
            java.util.List listA2 = interfaceC1428i.A();
            p247y7.AbstractC7350t.e(listA2, "getDeclaredTypeParameters(...)");
            return listA2;
        }
        java.util.List<O7.f0> listC0 = p097j7.AbstractC6879v.C0(listM2, listM);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listC0, 10));
        for (O7.f0 f0Var : listC0) {
            p247y7.AbstractC7350t.c(f0Var);
            arrayList.add(c(f0Var, interfaceC1428i, listA.size()));
        }
        return p097j7.AbstractC6879v.C0(listA, arrayList);
    }
}
