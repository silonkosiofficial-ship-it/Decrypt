package p101k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(p101k0.d dVar, long j6) {
        if (!dVar.E0().A1()) {
            return false;
        }
        D0.InterfaceC0900t interfaceC0900tL = F0.AbstractC0925k.m(dVar).l();
        if (!interfaceC0900tL.K()) {
            return false;
        }
        long jA = interfaceC0900tL.a();
        int iG = Y0.t.g(jA);
        int iF = Y0.t.f(jA);
        long jE = D0.AbstractC0901u.e(interfaceC0900tL);
        float fM = p131n0.g.m(jE);
        float fN = p131n0.g.n(jE);
        float f6 = iG + fM;
        float f10 = iF + fN;
        float fM2 = p131n0.g.m(j6);
        if (fM > fM2 || fM2 > f6) {
            return false;
        }
        float fN2 = p131n0.g.n(j6);
        return fN <= fN2 && fN2 <= f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p101k0.g gVar, p101k0.b bVar) {
        gVar.x0(bVar);
        gVar.U(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(F0.E0 e6, p237x7.l lVar) {
        if (lVar.l(e6) != F0.D0.ContinueTraversal) {
            return;
        }
        F0.F0.f(e6, lVar);
    }
}
