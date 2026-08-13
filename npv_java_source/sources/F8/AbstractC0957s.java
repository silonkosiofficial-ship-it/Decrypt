package F8;

/* JADX INFO: renamed from: F8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0957s {
    private static /* synthetic */ void a(int i6) {
        java.lang.String str = i6 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i6 != 4 ? 3 : 2];
        switch (i6) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i6 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i6 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 == 4) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static F8.n0 b(java.util.List list, F8.l0 l0Var, O7.InterfaceC1432m interfaceC1432m, java.util.List list2) {
        if (list == null) {
            a(0);
        }
        if (l0Var == null) {
            a(1);
        }
        if (interfaceC1432m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        F8.n0 n0VarC = c(list, l0Var, interfaceC1432m, list2, null);
        if (n0VarC != null) {
            return n0VarC;
        }
        throw new java.lang.AssertionError("Substitution failed");
    }

    public static F8.n0 c(java.util.List list, F8.l0 l0Var, O7.InterfaceC1432m interfaceC1432m, java.util.List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (l0Var == null) {
            a(6);
        }
        if (interfaceC1432m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            O7.f0 f0Var = (O7.f0) it.next();
            R7.K kY0 = R7.K.Y0(interfaceC1432m, f0Var.k(), f0Var.K(), f0Var.s(), f0Var.getName(), i6, O7.a0.f8143a, f0Var.p0());
            map.put(f0Var.p(), new F8.k0(kY0.w()));
            map2.put(f0Var, kY0);
            list2.add(kY0);
            i6++;
        }
        F8.f0 f0VarJ = F8.f0.j(map);
        F8.n0 n0VarH = F8.n0.h(l0Var, f0VarJ);
        F8.n0 n0VarH2 = F8.n0.h(l0Var.h(), f0VarJ);
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            O7.f0 f0Var2 = (O7.f0) it2.next();
            R7.K k6 = (R7.K) map2.get(f0Var2);
            for (F8.E e6 : f0Var2.getUpperBounds()) {
                O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
                F8.E eP = (((interfaceC1427hW instanceof O7.f0) && K8.a.k((O7.f0) interfaceC1427hW)) ? n0VarH : n0VarH2).p(e6, F8.u0.OUT_VARIANCE);
                if (eP == null) {
                    return null;
                }
                if (eP != e6 && zArr != null) {
                    zArr[0] = true;
                }
                k6.V0(eP);
            }
            k6.e1();
        }
        return n0VarH;
    }
}
