package J0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    private static final boolean a(K0.o oVar) {
        p237x7.p pVarC = c(oVar);
        K0.i iVar = (K0.i) K0.l.a(oVar.w(), K0.r.f6030a.I());
        return (pVarC == null || iVar == null || ((java.lang.Number) iVar.a().b()).floatValue() <= 0.0f) ? false : true;
    }

    private static final java.util.List b(K0.o oVar) {
        return oVar.l(false, false, false);
    }

    public static final p237x7.p c(K0.o oVar) {
        return (p237x7.p) K0.l.a(oVar.w(), K0.j.f5973a.u());
    }

    private static final void d(K0.o oVar, int i6, p237x7.l lVar) {
        X.b bVar = new X.b(new K0.o[16], 0);
        while (true) {
            bVar.g(bVar.t(), b(oVar));
            while (bVar.x()) {
                oVar = (K0.o) bVar.D(bVar.t() - 1);
                if (androidx.compose.ui.platform.AbstractC1970q1.g(oVar) && !oVar.w().f(K0.r.f6030a.f())) {
                    F0.AbstractC0914d0 abstractC0914d0E = oVar.e();
                    if (abstractC0914d0E == null) {
                        C0.a.c("Expected semantics node to have a coordinator.");
                        throw new p087i7.C6665k();
                    }
                    D0.InterfaceC0900t interfaceC0900tM1 = abstractC0914d0E.m1();
                    Y0.r rVarB = Y0.s.b(D0.AbstractC0901u.c(interfaceC0900tM1));
                    if (rVarB.l()) {
                        continue;
                    } else if (a(oVar)) {
                        int i10 = i6 + 1;
                        lVar.l(new J0.m(oVar, i10, rVarB, interfaceC0900tM1));
                        d(oVar, i10, lVar);
                    }
                }
            }
            return;
        }
    }

    static /* synthetic */ void e(K0.o oVar, int i6, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        d(oVar, i6, lVar);
    }
}
