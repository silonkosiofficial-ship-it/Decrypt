package p201u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final p201u0.q a(p201u0.q qVar, long j6, long j10, java.lang.String str, p141o0.AbstractC7019z0 abstractC7019z0, boolean z6) {
        qVar.u(j6);
        qVar.q(z6);
        qVar.r(abstractC7019z0);
        qVar.v(j10);
        qVar.t(str);
        return qVar;
    }

    private static final p141o0.AbstractC7019z0 b(long j6, int i6) {
        if (j6 != 16) {
            return p141o0.AbstractC7019z0.f52280b.a(j6, i6);
        }
        return null;
    }

    public static final p201u0.c c(p201u0.c cVar, p201u0.n nVar) {
        p201u0.l lVar;
        int iM = nVar.M();
        for (int i6 = 0; i6 < iM; i6++) {
            p201u0.p pVarE = nVar.e(i6);
            if (pVarE instanceof p201u0.s) {
                p201u0.g gVar = new p201u0.g();
                p201u0.s sVar = (p201u0.s) pVarE;
                gVar.k(sVar.g());
                gVar.l(sVar.o());
                gVar.j(sVar.f());
                gVar.h(sVar.d());
                gVar.i(sVar.e());
                gVar.m(sVar.s());
                gVar.n(sVar.C());
                gVar.r(sVar.N());
                gVar.o(sVar.D());
                gVar.p(sVar.E());
                gVar.q(sVar.M());
                gVar.u(sVar.Q());
                gVar.s(sVar.O());
                gVar.t(sVar.P());
                lVar = gVar;
            } else {
                if (pVarE instanceof p201u0.n) {
                    p201u0.c cVar2 = new p201u0.c();
                    p201u0.n nVar2 = (p201u0.n) pVarE;
                    cVar2.p(nVar2.g());
                    cVar2.s(nVar2.C());
                    cVar2.t(nVar2.D());
                    cVar2.u(nVar2.E());
                    cVar2.v(nVar2.N());
                    cVar2.w(nVar2.O());
                    cVar2.q(nVar2.o());
                    cVar2.r(nVar2.s());
                    cVar2.o(nVar2.f());
                    c(cVar2, nVar2);
                    lVar = cVar2;
                }
            }
            cVar.i(i6, lVar);
        }
        return cVar;
    }

    public static final p201u0.q d(Y0.e eVar, p201u0.d dVar, p201u0.c cVar) {
        long jE = e(eVar, dVar.e(), dVar.d());
        return a(new p201u0.q(cVar), jE, f(jE, dVar.l(), dVar.k()), dVar.g(), b(dVar.j(), dVar.i()), dVar.c());
    }

    private static final long e(Y0.e eVar, float f6, float f10) {
        return p131n0.n.a(eVar.B0(f6), eVar.B0(f10));
    }

    private static final long f(long j6, float f6, float f10) {
        if (java.lang.Float.isNaN(f6)) {
            f6 = p131n0.m.i(j6);
        }
        if (java.lang.Float.isNaN(f10)) {
            f10 = p131n0.m.g(j6);
        }
        return p131n0.n.a(f6, f10);
    }

    public static final p201u0.q g(p201u0.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1413834416, i6, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        Y0.e eVar = (Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e());
        float f6 = dVar.f();
        boolean zJ = interfaceC1734n.j((((long) java.lang.Float.floatToRawIntBits(eVar.getDensity())) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
        java.lang.Object objG = interfaceC1734n.g();
        if (zJ || objG == V.InterfaceC1734n.f14931a.a()) {
            p201u0.c cVar = new p201u0.c();
            c(cVar, dVar.h());
            p087i7.M m6 = p087i7.M.f46721a;
            objG = d(eVar, dVar, cVar);
            interfaceC1734n.K(objG);
        }
        p201u0.q qVar = (p201u0.q) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return qVar;
    }
}
