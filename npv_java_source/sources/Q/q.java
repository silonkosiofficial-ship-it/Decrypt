package Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p201u0.d f8729a;

    public static final p201u0.d a(O.b.a aVar) {
        p201u0.d dVar = f8729a;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }
        u0.d.a aVar2 = new u0.d.a("Filled.FileDownload", Y0.i.q(24.0f), Y0.i.q(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = p201u0.o.b();
        p141o0.f2 f2Var = new p141o0.f2(p141o0.C7016y0.f52264b.a(), null);
        int iA = p141o0.g2.f52226a.a();
        int iA2 = p141o0.h2.f52230a.a();
        p201u0.f fVar = new p201u0.f();
        fVar.j(19.0f, 9.0f);
        fVar.g(-4.0f);
        fVar.n(3.0f);
        fVar.f(9.0f);
        fVar.o(6.0f);
        fVar.f(5.0f);
        fVar.i(7.0f, 7.0f);
        fVar.i(7.0f, -7.0f);
        fVar.b();
        fVar.j(5.0f, 18.0f);
        fVar.o(2.0f);
        fVar.g(14.0f);
        fVar.o(-2.0f);
        fVar.f(5.0f);
        fVar.b();
        p201u0.d dVarF = aVar2.c(fVar.e(), (14336 & 2) != 0 ? p201u0.o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f2Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? p201u0.o.c() : iA, (14336 & 512) != 0 ? p201u0.o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f8729a = dVarF;
        p247y7.AbstractC7350t.c(dVarF);
        return dVarF;
    }
}
