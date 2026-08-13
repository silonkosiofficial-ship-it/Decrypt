package D0;

/* JADX INFO: renamed from: D0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0901u {
    public static final p131n0.i a(D0.InterfaceC0900t interfaceC0900t) {
        p131n0.i iVarA;
        D0.InterfaceC0900t interfaceC0900tB0 = interfaceC0900t.b0();
        return (interfaceC0900tB0 == null || (iVarA = D0.AbstractC0899s.a(interfaceC0900tB0, interfaceC0900t, false, 2, null)) == null) ? new p131n0.i(0.0f, 0.0f, Y0.t.g(interfaceC0900t.a()), Y0.t.f(interfaceC0900t.a())) : iVarA;
    }

    public static final p131n0.i b(D0.InterfaceC0900t interfaceC0900t) {
        return D0.AbstractC0899s.a(d(interfaceC0900t), interfaceC0900t, false, 2, null);
    }

    public static final p131n0.i c(D0.InterfaceC0900t interfaceC0900t) {
        D0.InterfaceC0900t interfaceC0900tD = d(interfaceC0900t);
        float fG = Y0.t.g(interfaceC0900tD.a());
        float f6 = Y0.t.f(interfaceC0900tD.a());
        p131n0.i iVarB = b(interfaceC0900t);
        float fI = iVarB.i();
        if (fI < 0.0f) {
            fI = 0.0f;
        }
        if (fI > fG) {
            fI = fG;
        }
        float fL = iVarB.l();
        if (fL < 0.0f) {
            fL = 0.0f;
        }
        if (fL > f6) {
            fL = f6;
        }
        float fJ = iVarB.j();
        if (fJ < 0.0f) {
            fJ = 0.0f;
        }
        if (fJ <= fG) {
            fG = fJ;
        }
        float fE = iVarB.e();
        float f10 = fE >= 0.0f ? fE : 0.0f;
        if (f10 <= f6) {
            f6 = f10;
        }
        if (fI == fG || fL == f6) {
            return p131n0.i.f51317e.a();
        }
        long jC = interfaceC0900tD.C(p131n0.h.a(fI, fL));
        long jC2 = interfaceC0900tD.C(p131n0.h.a(fG, fL));
        long jC3 = interfaceC0900tD.C(p131n0.h.a(fG, f6));
        long jC4 = interfaceC0900tD.C(p131n0.h.a(fI, f6));
        float fM = p131n0.g.m(jC);
        float fM2 = p131n0.g.m(jC2);
        float fM3 = p131n0.g.m(jC4);
        float fM4 = p131n0.g.m(jC3);
        float fMin = java.lang.Math.min(fM, java.lang.Math.min(fM2, java.lang.Math.min(fM3, fM4)));
        float fMax = java.lang.Math.max(fM, java.lang.Math.max(fM2, java.lang.Math.max(fM3, fM4)));
        float fN = p131n0.g.n(jC);
        float fN2 = p131n0.g.n(jC2);
        float fN3 = p131n0.g.n(jC4);
        float fN4 = p131n0.g.n(jC3);
        return new p131n0.i(fMin, java.lang.Math.min(fN, java.lang.Math.min(fN2, java.lang.Math.min(fN3, fN4))), fMax, java.lang.Math.max(fN, java.lang.Math.max(fN2, java.lang.Math.max(fN3, fN4))));
    }

    public static final D0.InterfaceC0900t d(D0.InterfaceC0900t interfaceC0900t) {
        D0.InterfaceC0900t interfaceC0900t2;
        F0.AbstractC0914d0 abstractC0914d0;
        do {
            interfaceC0900t2 = interfaceC0900t;
            interfaceC0900t = interfaceC0900t.b0();
        } while (interfaceC0900t != null);
        F0.AbstractC0914d0 abstractC0914d0P2 = interfaceC0900t2 instanceof F0.AbstractC0914d0 ? (F0.AbstractC0914d0) interfaceC0900t2 : null;
        if (abstractC0914d0P2 == null) {
            return interfaceC0900t2;
        }
        do {
            abstractC0914d0 = abstractC0914d0P2;
            abstractC0914d0P2 = abstractC0914d0P2.p2();
        } while (abstractC0914d0P2 != null);
        return abstractC0914d0;
    }

    public static final long e(D0.InterfaceC0900t interfaceC0900t) {
        return interfaceC0900t.h0(p131n0.g.f51312b.c());
    }

    public static final long f(D0.InterfaceC0900t interfaceC0900t) {
        return interfaceC0900t.C(p131n0.g.f51312b.c());
    }
}
