package M0;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M0.M f6665a = new M0.M();

    private M() {
    }

    public final void a(p141o0.InterfaceC6993q0 interfaceC6993q0, M0.K k6) {
        boolean z6 = k6.i() && !X0.u.e(k6.l().f(), X0.u.f15666a.c());
        if (z6) {
            p131n0.i iVarB = p131n0.j.b(p131n0.g.f51312b.c(), p131n0.n.a(Y0.t.g(k6.B()), Y0.t.f(k6.B())));
            interfaceC6993q0.m();
            p141o0.AbstractC6990p0.e(interfaceC6993q0, iVarB, 0, 2, null);
        }
        M0.C cY = k6.l().i().y();
        X0.k kVarS = cY.s();
        if (kVarS == null) {
            kVarS = X0.k.f15631b.c();
        }
        X0.k kVar = kVarS;
        p141o0.c2 c2VarR = cY.r();
        if (c2VarR == null) {
            c2VarR = p141o0.c2.f52187d.a();
        }
        p141o0.c2 c2Var = c2VarR;
        p161q0.h hVarH = cY.h();
        if (hVarH == null) {
            hVarH = p161q0.l.f52928a;
        }
        p161q0.h hVar = hVarH;
        try {
            p141o0.AbstractC6984n0 abstractC6984n0F = cY.f();
            if (abstractC6984n0F != null) {
                k6.w().E(interfaceC6993q0, abstractC6984n0F, (64 & 4) != 0 ? Float.NaN : cY.t() != X0.o.b.f15648b ? cY.t().a() : 1.0f, (64 & 8) != 0 ? null : c2Var, (64 & 16) != 0 ? null : kVar, (64 & 32) != 0 ? null : hVar, (64 & 64) != 0 ? p161q0.g.f52924B.a() : 0);
            } else {
                k6.w().C(interfaceC6993q0, (32 & 2) != 0 ? p141o0.C7016y0.f52264b.g() : cY.t() != X0.o.b.f15648b ? cY.t().c() : p141o0.C7016y0.f52264b.a(), (32 & 4) != 0 ? null : c2Var, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? hVar : null, (32 & 32) != 0 ? p161q0.g.f52924B.a() : 0);
            }
        } finally {
            if (z6) {
                interfaceC6993q0.s();
            }
        }
    }
}
