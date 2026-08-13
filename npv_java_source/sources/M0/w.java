package M0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f6764a = Y0.x.f16237b.a();

    public static final M0.v a(M0.v vVar, int i6, int i10, long j6, X0.r rVar, M0.y yVar, X0.h hVar, int i11, int i12, X0.t tVar) {
        long j10;
        int iH = i6;
        X0.r rVarJ = rVar;
        X0.j.a aVar = X0.j.f15622b;
        if (X0.j.k(iH, aVar.g()) || X0.j.k(iH, vVar.h())) {
            if (!Y0.y.g(j6)) {
                j10 = j6;
                if (Y0.x.e(j10, vVar.e())) {
                }
            } else {
                j10 = j6;
            }
            if ((rVarJ == null || p247y7.AbstractC7350t.b(rVarJ, vVar.j())) && ((X0.l.j(i10, X0.l.f15636b.f()) || X0.l.j(i10, vVar.i())) && ((yVar == null || p247y7.AbstractC7350t.b(yVar, vVar.g())) && ((hVar == null || p247y7.AbstractC7350t.b(hVar, vVar.f())) && ((X0.f.f(i11, X0.f.f15584b.b()) || X0.f.f(i11, vVar.d())) && ((X0.e.g(i12, X0.e.f15579b.c()) || X0.e.g(i12, vVar.c())) && (tVar == null || p247y7.AbstractC7350t.b(tVar, vVar.k())))))))) {
                return vVar;
            }
        } else {
            j10 = j6;
        }
        long jE = Y0.y.g(j6) ? vVar.e() : j10;
        if (rVarJ == null) {
            rVarJ = vVar.j();
        }
        X0.r rVar2 = rVarJ;
        if (X0.j.k(iH, aVar.g())) {
            iH = vVar.h();
        }
        return new M0.v(iH, !X0.l.j(i10, X0.l.f15636b.f()) ? i10 : vVar.i(), jE, rVar2, d(vVar, yVar), hVar == null ? vVar.f() : hVar, !X0.f.f(i11, X0.f.f15584b.b()) ? i11 : vVar.d(), !X0.e.g(i12, X0.e.f15579b.c()) ? i12 : vVar.c(), tVar == null ? vVar.k() : tVar, null);
    }

    public static final M0.v b(M0.v vVar, M0.v vVar2, float f6) {
        int iN = ((X0.j) M0.D.d(X0.j.h(vVar.h()), X0.j.h(vVar2.h()), f6)).n();
        int iM = ((X0.l) M0.D.d(X0.l.g(vVar.i()), X0.l.g(vVar2.i()), f6)).m();
        long jF = M0.D.f(vVar.e(), vVar2.e(), f6);
        X0.r rVarJ = vVar.j();
        if (rVarJ == null) {
            rVarJ = X0.r.f15653c.a();
        }
        X0.r rVarJ2 = vVar2.j();
        if (rVarJ2 == null) {
            rVarJ2 = X0.r.f15653c.a();
        }
        return new M0.v(iN, iM, jF, X0.s.a(rVarJ, rVarJ2, f6), c(vVar.g(), vVar2.g(), f6), (X0.h) M0.D.d(vVar.f(), vVar2.f(), f6), ((X0.f) M0.D.d(X0.f.c(vVar.d()), X0.f.c(vVar2.d()), f6)).l(), ((X0.e) M0.D.d(X0.e.d(vVar.c()), X0.e.d(vVar2.c()), f6)).j(), (X0.t) M0.D.d(vVar.k(), vVar2.k(), f6), null);
    }

    private static final M0.y c(M0.y yVar, M0.y yVar2, float f6) {
        if (yVar == null && yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            yVar = M0.y.f6765c.a();
        }
        if (yVar2 == null) {
            yVar2 = M0.y.f6765c.a();
        }
        return M0.AbstractC1331c.b(yVar, yVar2, f6);
    }

    private static final M0.y d(M0.v vVar, M0.y yVar) {
        if (vVar.g() == null) {
            return yVar;
        }
        M0.y yVarG = vVar.g();
        return yVar == null ? yVarG : yVarG.d(yVar);
    }

    public static final M0.v e(M0.v vVar, Y0.v vVar2) {
        int iH = vVar.h();
        X0.j.a aVar = X0.j.f15622b;
        int iF = X0.j.k(iH, aVar.g()) ? aVar.f() : vVar.h();
        int iE = M0.Q.e(vVar2, vVar.i());
        long jE = Y0.y.g(vVar.e()) ? f6764a : vVar.e();
        X0.r rVarJ = vVar.j();
        if (rVarJ == null) {
            rVarJ = X0.r.f15653c.a();
        }
        X0.r rVar = rVarJ;
        M0.y yVarG = vVar.g();
        X0.h hVarF = vVar.f();
        int iD = vVar.d();
        X0.f.a aVar2 = X0.f.f15584b;
        int iA = X0.f.f(iD, aVar2.b()) ? aVar2.a() : vVar.d();
        int iC = vVar.c();
        X0.e.a aVar3 = X0.e.f15579b;
        int iB = X0.e.g(iC, aVar3.c()) ? aVar3.b() : vVar.c();
        X0.t tVarK = vVar.k();
        if (tVarK == null) {
            tVarK = X0.t.f15657c.a();
        }
        return new M0.v(iF, iE, jE, rVar, yVarG, hVarF, iA, iB, tVarK, null);
    }
}
