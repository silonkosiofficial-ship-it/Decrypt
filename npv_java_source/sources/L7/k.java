package L7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final R7.y f6417a;

    static {
        R7.C1507m c1507m = new R7.C1507m(H8.k.f4528a.i(), L7.j.f6317q);
        O7.EnumC1425f enumC1425f = O7.EnumC1425f.INTERFACE;
        p138n8.f fVarG = L7.j.f6320t.g();
        O7.a0 a0Var = O7.a0.f8143a;
        E8.n nVar = E8.f.f2273e;
        R7.y yVar = new R7.y(c1507m, enumC1425f, false, false, fVarG, a0Var, nVar);
        yVar.V0(O7.D.ABSTRACT);
        yVar.X0(O7.AbstractC1438t.f8186e);
        yVar.W0(p097j7.AbstractC6879v.e(R7.K.a1(yVar, P7.g.f8385d.b(), false, F8.u0.IN_VARIANCE, p138n8.f.o("T"), 0, nVar)));
        yVar.T0();
        f6417a = yVar;
    }

    public static final F8.M a(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "suspendFunType");
        L7.f.r(e6);
        L7.g gVarI = K8.a.i(e6);
        P7.g gVarK = e6.k();
        F8.E eK = L7.f.k(e6);
        java.util.List listE = L7.f.e(e6);
        java.util.List listM = L7.f.m(e6);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listM, 10));
        java.util.Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((F8.i0) it.next()).getType());
        }
        F8.a0 a0VarI = F8.a0.f2872D.i();
        F8.e0 e0VarP = f6417a.p();
        p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
        java.util.List listD0 = p097j7.AbstractC6879v.D0(arrayList, F8.F.l(a0VarI, e0VarP, p097j7.AbstractC6879v.e(K8.a.a(L7.f.l(e6))), false, null, 16, null));
        F8.M mI = K8.a.i(e6).I();
        p247y7.AbstractC7350t.e(mI, "getNullableAnyType(...)");
        return L7.f.b(gVarI, gVarK, eK, listE, listD0, null, mI, (128 & 128) != 0 ? false : false).a1(e6.X0());
    }
}
