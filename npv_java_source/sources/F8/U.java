package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U {

    public static final class a extends F8.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.util.List f2859d;

        a(java.util.List list) {
            this.f2859d = list;
        }

        @Override // F8.f0
        public F8.i0 k(F8.e0 e0Var) {
            p247y7.AbstractC7350t.f(e0Var, "key");
            if (!this.f2859d.contains(e0Var)) {
                return null;
            }
            O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
            p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return F8.q0.s((O7.f0) interfaceC1427hW);
        }
    }

    private static final F8.E a(java.util.List list, java.util.List list2, L7.g gVar) {
        F8.E eP = F8.n0.g(new F8.U.a(list)).p((F8.E) p097j7.AbstractC6879v.i0(list2), F8.u0.OUT_VARIANCE);
        if (eP == null) {
            eP = gVar.y();
        }
        p247y7.AbstractC7350t.c(eP);
        return eP;
    }

    public static final F8.E b(O7.f0 f0Var) {
        java.util.ArrayList arrayList;
        p247y7.AbstractC7350t.f(f0Var, "<this>");
        O7.InterfaceC1432m interfaceC1432mB = f0Var.b();
        p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
        if (interfaceC1432mB instanceof O7.InterfaceC1428i) {
            java.util.List listX = ((O7.InterfaceC1428i) interfaceC1432mB).p().x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            java.util.List list = listX;
            arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                F8.e0 e0VarP = ((O7.f0) it.next()).p();
                p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
                arrayList.add(e0VarP);
            }
        } else {
            if (!(interfaceC1432mB instanceof O7.InterfaceC1443y)) {
                throw new java.lang.IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
            }
            java.util.List listG = ((O7.InterfaceC1443y) interfaceC1432mB).g();
            p247y7.AbstractC7350t.e(listG, "getTypeParameters(...)");
            java.util.List list2 = listG;
            arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                F8.e0 e0VarP2 = ((O7.f0) it2.next()).p();
                p247y7.AbstractC7350t.e(e0VarP2, "getTypeConstructor(...)");
                arrayList.add(e0VarP2);
            }
        }
        java.util.List upperBounds = f0Var.getUpperBounds();
        p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
        return a(arrayList, upperBounds, p218v8.c.j(f0Var));
    }
}
