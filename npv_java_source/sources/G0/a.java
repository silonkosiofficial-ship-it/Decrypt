package G0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: G0.a$a, reason: collision with other inner class name */
    static final class C0073a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final G0.a.C0073a f3012D = new G0.a.C0073a();

        C0073a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.FALSE;
        }
    }

    private static final boolean a(java.util.List list) {
        java.util.List listM;
        java.lang.Object objI0;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listM = p097j7.AbstractC6879v.m();
        } else {
            listM = new java.util.ArrayList();
            java.lang.Object obj = list.get(0);
            int iO = p097j7.AbstractC6879v.o(list);
            int i6 = 0;
            while (i6 < iO) {
                i6++;
                java.lang.Object obj2 = list.get(i6);
                K0.o oVar = (K0.o) obj2;
                K0.o oVar2 = (K0.o) obj;
                listM.add(p131n0.g.d(p131n0.h.a(java.lang.Math.abs(p131n0.g.m(oVar2.i().g()) - p131n0.g.m(oVar.i().g())), java.lang.Math.abs(p131n0.g.n(oVar2.i().g()) - p131n0.g.n(oVar.i().g())))));
                obj = obj2;
            }
        }
        if (listM.size() == 1) {
            objI0 = p097j7.AbstractC6879v.i0(listM);
        } else if (!listM.isEmpty()) {
            objI0 = p097j7.AbstractC6879v.i0(listM);
            int iO2 = p097j7.AbstractC6879v.o(listM);
            if (1 <= iO2) {
                int i10 = 1;
                while (true) {
                    objI0 = p131n0.g.d(p131n0.g.r(((p131n0.g) objI0).v(), ((p131n0.g) listM.get(i10)).v()));
                    if (i10 == iO2) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        long jV = ((p131n0.g) objI0).v();
        return p131n0.g.n(jV) < p131n0.g.m(jV);
    }

    public static final boolean b(K0.o oVar) {
        K0.k kVarN = oVar.n();
        K0.r rVar = K0.r.f6030a;
        return (K0.l.a(kVarN, rVar.a()) == null && K0.l.a(oVar.n(), rVar.z()) == null) ? false : true;
    }

    private static final boolean c(K0.b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(K0.o oVar, C1.B b6) {
        K0.k kVarN = oVar.n();
        K0.r rVar = K0.r.f6030a;
        K0.b bVar = (K0.b) K0.l.a(kVarN, rVar.a());
        if (bVar != null) {
            b6.o0(f(bVar));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (K0.l.a(oVar.n(), rVar.z()) != null) {
            java.util.List listT = oVar.t();
            int size = listT.size();
            for (int i6 = 0; i6 < size; i6++) {
                K0.o oVar2 = (K0.o) listT.get(i6);
                if (oVar2.n().f(K0.r.f6030a.A())) {
                    arrayList.add(oVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zA = a(arrayList);
            b6.o0(C1.B.e.a(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void e(K0.o oVar, C1.B b6) {
        K0.k kVarN = oVar.n();
        K0.r rVar = K0.r.f6030a;
        androidx.appcompat.app.D.a(K0.l.a(kVarN, rVar.b()));
        K0.o oVarR = oVar.r();
        if (oVarR == null || K0.l.a(oVarR.n(), rVar.z()) == null) {
            return;
        }
        K0.b bVar = (K0.b) K0.l.a(oVarR.n(), rVar.a());
        if ((bVar == null || !c(bVar)) && oVar.n().f(rVar.A())) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List listT = oVarR.t();
            int size = listT.size();
            int i6 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                K0.o oVar2 = (K0.o) listT.get(i10);
                if (oVar2.n().f(K0.r.f6030a.A())) {
                    arrayList.add(oVar2);
                    if (oVar2.q().p0() < oVar.q().p0()) {
                        i6++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zA = a(arrayList);
                C1.B.f fVarA = C1.B.f.a(zA ? 0 : i6, 1, zA ? i6 : 0, 1, false, ((java.lang.Boolean) oVar.n().C(K0.r.f6030a.A(), G0.a.C0073a.f3012D)).booleanValue());
                if (fVarA != null) {
                    b6.p0(fVarA);
                }
            }
        }
    }

    private static final C1.B.e f(K0.b bVar) {
        return C1.B.e.a(bVar.b(), bVar.a(), false, 0);
    }
}
