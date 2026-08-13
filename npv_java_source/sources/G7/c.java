package G7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3131a;

        static {
            int[] iArr = new int[F7.r.values().length];
            try {
                iArr[F7.r.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[F7.r.IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[F7.r.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f3131a = iArr;
        }
    }

    private static final F8.M a(F8.a0 a0Var, F8.e0 e0Var, java.util.List list, boolean z6) {
        F8.j0 t6;
        java.util.List listX = e0Var.x();
        p247y7.AbstractC7350t.e(listX, "getParameters(...)");
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        int i6 = 0;
        for (java.lang.Object obj : list2) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            F7.q qVar = (F7.q) obj;
            I7.A a6 = (I7.A) qVar.c();
            F8.E eF = a6 != null ? a6.f() : null;
            F7.r rVarD = qVar.d();
            int i11 = rVarD == null ? -1 : G7.c.a.f3131a[rVarD.ordinal()];
            if (i11 == -1) {
                java.lang.Object obj2 = listX.get(i6);
                p247y7.AbstractC7350t.e(obj2, "get(...)");
                t6 = new F8.T((O7.f0) obj2);
            } else if (i11 == 1) {
                F8.u0 u0Var = F8.u0.INVARIANT;
                p247y7.AbstractC7350t.c(eF);
                t6 = new F8.k0(u0Var, eF);
            } else if (i11 == 2) {
                F8.u0 u0Var2 = F8.u0.IN_VARIANCE;
                p247y7.AbstractC7350t.c(eF);
                t6 = new F8.k0(u0Var2, eF);
            } else {
                if (i11 != 3) {
                    throw new p087i7.s();
                }
                F8.u0 u0Var3 = F8.u0.OUT_VARIANCE;
                p247y7.AbstractC7350t.c(eF);
                t6 = new F8.k0(u0Var3, eF);
            }
            arrayList.add(t6);
            i6 = i10;
        }
        return F8.F.l(a0Var, e0Var, arrayList, z6, null, 16, null);
    }

    public static final F7.o b(F7.d dVar, java.util.List list, boolean z6, java.util.List list2) {
        O7.InterfaceC1427h interfaceC1427hA;
        p247y7.AbstractC7350t.f(dVar, "<this>");
        p247y7.AbstractC7350t.f(list, "arguments");
        p247y7.AbstractC7350t.f(list2, "annotations");
        I7.InterfaceC1276l interfaceC1276l = dVar instanceof I7.InterfaceC1276l ? (I7.InterfaceC1276l) dVar : null;
        if (interfaceC1276l == null || (interfaceC1427hA = interfaceC1276l.a()) == null) {
            throw new I7.D("Cannot create type for an unsupported classifier: " + dVar + " (" + dVar.getClass() + ')');
        }
        F8.e0 e0VarP = interfaceC1427hA.p();
        p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
        java.util.List listX = e0VarP.x();
        p247y7.AbstractC7350t.e(listX, "getParameters(...)");
        if (listX.size() == list.size()) {
            list2.isEmpty();
            return new I7.A(a(F8.a0.f2872D.i(), e0VarP, list, z6), null, 2, null);
        }
        throw new java.lang.IllegalArgumentException("Class declares " + listX.size() + " type parameters, but " + list.size() + " were provided.");
    }
}
