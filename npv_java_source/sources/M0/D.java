package M0;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f6629a = Y0.y.f(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f6630b = Y0.y.f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f6631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f6632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X0.o f6633e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final M0.D.a f6634D = new M0.D.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X0.o b() {
            return M0.D.f6633e;
        }
    }

    static {
        p141o0.C7016y0.a aVar = p141o0.C7016y0.f52264b;
        f6631c = aVar.f();
        long jA = aVar.a();
        f6632d = jA;
        f6633e = X0.o.f15646a.b(jA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public static final M0.C b(M0.C c6, long j6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, M0.z zVar, p161q0.h hVar2) {
        X0.p pVarU;
        long jD;
        M0.z zVar2;
        p161q0.h hVarH;
        R0.q qVarN = qVar;
        R0.o oVarL = oVar;
        R0.p pVarM = pVar;
        java.lang.String strJ = str;
        X0.a aVarE = aVar;
        if ((!Y0.y.g(j10)) && !Y0.x.e(j10, c6.k())) {
            pVarU = pVar2;
            jD = j12;
            zVar2 = zVar;
            hVarH = hVar2;
        } else if ((abstractC6984n0 != null || j6 == 16 || p141o0.C7016y0.o(j6, c6.t().c())) && ((oVarL == null || p247y7.AbstractC7350t.b(oVarL, c6.l())) && ((qVarN == null || p247y7.AbstractC7350t.b(qVarN, c6.n())) && ((abstractC1494h == null || abstractC1494h == c6.i()) && (!(!Y0.y.g(j11)) || Y0.x.e(j11, c6.o())))))) {
            if ((kVar == null || p247y7.AbstractC7350t.b(kVar, c6.s())) && p247y7.AbstractC7350t.b(abstractC6984n0, c6.t().f()) && ((abstractC6984n0 == null || f6 == c6.t().a()) && ((pVarM == null || p247y7.AbstractC7350t.b(pVarM, c6.m())) && ((strJ == null || p247y7.AbstractC7350t.b(strJ, c6.j())) && (aVarE == null || p247y7.AbstractC7350t.b(aVarE, c6.e())))))) {
                pVarU = pVar2;
                if ((pVarU == null || p247y7.AbstractC7350t.b(pVarU, c6.u())) && (hVar == null || p247y7.AbstractC7350t.b(hVar, c6.p()))) {
                    jD = j12;
                    if ((jD == 16 || p141o0.C7016y0.o(jD, c6.d())) && (c2Var == null || p247y7.AbstractC7350t.b(c2Var, c6.r()))) {
                        zVar2 = zVar;
                        if (zVar2 == null || p247y7.AbstractC7350t.b(zVar2, c6.q())) {
                            hVarH = hVar2;
                            if (hVarH == null || p247y7.AbstractC7350t.b(hVarH, c6.h())) {
                                return c6;
                            }
                            c6 = c6;
                        } else {
                            c6 = c6;
                            hVarH = hVar2;
                        }
                    } else {
                        c6 = c6;
                        zVar2 = zVar;
                        hVarH = hVar2;
                    }
                }
            } else {
                pVarU = pVar2;
            }
            jD = j12;
            zVar2 = zVar;
            hVarH = hVar2;
        } else {
            pVarU = pVar2;
            jD = j12;
            zVar2 = zVar;
            hVarH = hVar2;
        }
        X0.o oVarE = c6.t().e(abstractC6984n0 != null ? X0.o.f15646a.a(abstractC6984n0, f6) : X0.o.f15646a.b(j6));
        R0.AbstractC1494h abstractC1494hI = abstractC1494h == null ? c6.i() : abstractC1494h;
        long jK = !Y0.y.g(j10) ? j10 : c6.k();
        if (qVarN == null) {
            qVarN = c6.n();
        }
        if (oVarL == null) {
            oVarL = c6.l();
        }
        if (pVarM == null) {
            pVarM = c6.m();
        }
        if (strJ == null) {
            strJ = c6.j();
        }
        long jO = !Y0.y.g(j11) ? j11 : c6.o();
        if (aVarE == null) {
            aVarE = c6.e();
        }
        if (pVarU == null) {
            pVarU = c6.u();
        }
        T0.h hVarP = hVar == null ? c6.p() : hVar;
        if (jD == 16) {
            jD = c6.d();
        }
        X0.k kVarS = kVar == null ? c6.s() : kVar;
        p141o0.c2 c2VarR = c2Var == null ? c6.r() : c2Var;
        M0.z zVarG = g(c6, zVar2);
        if (hVarH == null) {
            hVarH = c6.h();
        }
        return new M0.C(oVarE, jK, qVarN, oVarL, pVarM, abstractC1494hI, strJ, jO, aVarE, pVarU, hVarP, jD, kVarS, c2VarR, zVarG, hVarH, (p247y7.AbstractC7342k) null);
    }

    public static final M0.C c(M0.C c6, M0.C c10, float f6) {
        X0.o oVarB = X0.m.b(c6.t(), c10.t(), f6);
        R0.AbstractC1494h abstractC1494h = (R0.AbstractC1494h) d(c6.i(), c10.i(), f6);
        long jF = f(c6.k(), c10.k(), f6);
        R0.q qVarN = c6.n();
        if (qVarN == null) {
            qVarN = R0.q.f9331D.d();
        }
        R0.q qVarN2 = c10.n();
        if (qVarN2 == null) {
            qVarN2 = R0.q.f9331D.d();
        }
        R0.q qVarA = R0.t.a(qVarN, qVarN2, f6);
        R0.o oVar = (R0.o) d(c6.l(), c10.l(), f6);
        R0.p pVar = (R0.p) d(c6.m(), c10.m(), f6);
        java.lang.String str = (java.lang.String) d(c6.j(), c10.j(), f6);
        long jF2 = f(c6.o(), c10.o(), f6);
        X0.a aVarE = c6.e();
        float fH = aVarE != null ? aVarE.h() : X0.a.c(0.0f);
        X0.a aVarE2 = c10.e();
        float fA = X0.b.a(fH, aVarE2 != null ? aVarE2.h() : X0.a.c(0.0f), f6);
        X0.p pVarU = c6.u();
        if (pVarU == null) {
            pVarU = X0.p.f15649c.a();
        }
        X0.p pVarU2 = c10.u();
        if (pVarU2 == null) {
            pVarU2 = X0.p.f15649c.a();
        }
        X0.p pVarA = X0.q.a(pVarU, pVarU2, f6);
        T0.h hVar = (T0.h) d(c6.p(), c10.p(), f6);
        long jI = p141o0.A0.i(c6.d(), c10.d(), f6);
        X0.k kVar = (X0.k) d(c6.s(), c10.s(), f6);
        p141o0.c2 c2VarR = c6.r();
        if (c2VarR == null) {
            c2VarR = new p141o0.c2(0L, 0L, 0.0f, 7, null);
        }
        p141o0.c2 c2VarR2 = c10.r();
        if (c2VarR2 == null) {
            c2VarR2 = new p141o0.c2(0L, 0L, 0.0f, 7, null);
        }
        return new M0.C(oVarB, jF, qVarA, oVar, pVar, abstractC1494h, str, jF2, X0.a.b(fA), pVarA, hVar, jI, kVar, p141o0.d2.a(c2VarR, c2VarR2, f6), e(c6.q(), c10.q(), f6), (p161q0.h) d(c6.h(), c10.h(), f6), (p247y7.AbstractC7342k) null);
    }

    public static final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, float f6) {
        return ((double) f6) < 0.5d ? obj : obj2;
    }

    private static final M0.z e(M0.z zVar, M0.z zVar2, float f6) {
        if (zVar == null && zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            zVar = M0.z.f6769a.a();
        }
        if (zVar2 == null) {
            zVar2 = M0.z.f6769a.a();
        }
        return M0.AbstractC1331c.c(zVar, zVar2, f6);
    }

    public static final long f(long j6, long j10, float f6) {
        return (Y0.y.g(j6) || Y0.y.g(j10)) ? ((Y0.x) d(Y0.x.b(j6), Y0.x.b(j10), f6)).k() : Y0.y.h(j6, j10, f6);
    }

    private static final M0.z g(M0.C c6, M0.z zVar) {
        if (c6.q() == null) {
            return zVar;
        }
        M0.z zVarQ = c6.q();
        return zVar == null ? zVarQ : zVarQ.b(zVar);
    }

    public static final M0.C h(M0.C c6) {
        X0.o oVarD = c6.t().d(M0.D.a.f6634D);
        long jK = Y0.y.g(c6.k()) ? f6629a : c6.k();
        R0.q qVarN = c6.n();
        if (qVarN == null) {
            qVarN = R0.q.f9331D.d();
        }
        R0.q qVar = qVarN;
        R0.o oVarL = c6.l();
        R0.o oVarC = R0.o.c(oVarL != null ? oVarL.i() : R0.o.f9321b.b());
        R0.p pVarM = c6.m();
        R0.p pVarE = R0.p.e(pVarM != null ? pVarM.k() : R0.p.f9325b.a());
        R0.AbstractC1494h abstractC1494hI = c6.i();
        if (abstractC1494hI == null) {
            abstractC1494hI = R0.AbstractC1494h.f9297b.a();
        }
        R0.AbstractC1494h abstractC1494h = abstractC1494hI;
        java.lang.String strJ = c6.j();
        if (strJ == null) {
            strJ = "";
        }
        java.lang.String str = strJ;
        long jO = Y0.y.g(c6.o()) ? f6630b : c6.o();
        X0.a aVarE = c6.e();
        X0.a aVarB = X0.a.b(aVarE != null ? aVarE.h() : X0.a.f15571b.a());
        X0.p pVarU = c6.u();
        if (pVarU == null) {
            pVarU = X0.p.f15649c.a();
        }
        X0.p pVar = pVarU;
        T0.h hVarP = c6.p();
        if (hVarP == null) {
            hVarP = T0.h.f12889E.a();
        }
        T0.h hVar = hVarP;
        long jD = c6.d();
        if (jD == 16) {
            jD = f6631c;
        }
        long j6 = jD;
        X0.k kVarS = c6.s();
        if (kVarS == null) {
            kVarS = X0.k.f15631b.c();
        }
        X0.k kVar = kVarS;
        p141o0.c2 c2VarR = c6.r();
        if (c2VarR == null) {
            c2VarR = p141o0.c2.f52187d.a();
        }
        p141o0.c2 c2Var = c2VarR;
        M0.z zVarQ = c6.q();
        p161q0.h hVarH = c6.h();
        if (hVarH == null) {
            hVarH = p161q0.l.f52928a;
        }
        return new M0.C(oVarD, jK, qVar, oVarC, pVarE, abstractC1494h, str, jO, aVarB, pVar, hVar, j6, kVar, c2Var, zVarQ, hVarH, (p247y7.AbstractC7342k) null);
    }
}
