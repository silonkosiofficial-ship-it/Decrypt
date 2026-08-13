package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    private static final java.util.List a(F8.t0 t0Var, J8.b bVar) {
        if (t0Var.U0().size() != t0Var.W0().x().size()) {
            return null;
        }
        java.util.List listU0 = t0Var.U0();
        java.util.List list = listU0;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((F8.i0) it.next()).a() != F8.u0.INVARIANT) {
                    java.util.List listX = t0Var.W0().x();
                    p247y7.AbstractC7350t.e(listX, "getParameters(...)");
                    java.util.List<p087i7.u> listC1 = p097j7.AbstractC6879v.c1(list, listX);
                    java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listC1, 10));
                    for (p087i7.u uVar : listC1) {
                        F8.i0 i0VarA = (F8.i0) uVar.a();
                        O7.f0 f0Var = (O7.f0) uVar.b();
                        if (i0VarA.a() != F8.u0.INVARIANT) {
                            F8.t0 t0VarZ0 = (i0VarA.b() || i0VarA.a() != F8.u0.IN_VARIANCE) ? null : i0VarA.getType().Z0();
                            p247y7.AbstractC7350t.c(f0Var);
                            i0VarA = K8.a.a(new G8.i(bVar, t0VarZ0, i0VarA, f0Var));
                        }
                        arrayList.add(i0VarA);
                    }
                    F8.n0 n0VarC = F8.f0.f2923c.b(t0Var.W0(), arrayList).c();
                    int size = listU0.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        F8.i0 i0Var = (F8.i0) listU0.get(i6);
                        F8.i0 i0Var2 = (F8.i0) arrayList.get(i6);
                        if (i0Var.a() != F8.u0.INVARIANT) {
                            java.util.List upperBounds = ((O7.f0) t0Var.W0().x().get(i6)).getUpperBounds();
                            p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(G8.f.a.f3135a.a(n0VarC.n((F8.E) it2.next(), F8.u0.INVARIANT).Z0()));
                            }
                            if (!i0Var.b() && i0Var.a() == F8.u0.OUT_VARIANCE) {
                                arrayList2.add(G8.f.a.f3135a.a(i0Var.getType().Z0()));
                            }
                            F8.E type = i0Var2.getType();
                            p247y7.AbstractC7350t.d(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((G8.i) type).W0().e(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final F8.M b(F8.M m6, J8.b bVar) {
        p247y7.AbstractC7350t.f(m6, "type");
        p247y7.AbstractC7350t.f(bVar, "status");
        java.util.List listA = a(m6, bVar);
        if (listA != null) {
            return c(m6, listA);
        }
        return null;
    }

    private static final F8.M c(F8.t0 t0Var, java.util.List list) {
        return F8.F.l(t0Var.V0(), t0Var.W0(), list, t0Var.X0(), null, 16, null);
    }
}
