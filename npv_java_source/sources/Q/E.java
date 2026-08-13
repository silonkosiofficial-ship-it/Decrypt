package Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p201u0.d f8705a;

    public static final p201u0.d a(O.b.a aVar) {
        p201u0.d dVar = f8705a;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }
        u0.d.a aVar2 = new u0.d.a("Filled.Refresh", Y0.i.q(24.0f), Y0.i.q(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = p201u0.o.b();
        p141o0.f2 f2Var = new p141o0.f2(p141o0.C7016y0.f52264b.a(), null);
        int iA = p141o0.g2.f52226a.a();
        int iA2 = p141o0.h2.f52230a.a();
        p201u0.f fVar = new p201u0.f();
        fVar.j(17.65f, 6.35f);
        fVar.c(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        fVar.d(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        fVar.m(3.57f, 8.0f, 7.99f, 8.0f);
        fVar.d(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        fVar.g(-2.08f);
        fVar.d(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        fVar.d(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        fVar.m(2.69f, -6.0f, 6.0f, -6.0f);
        fVar.d(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        fVar.h(13.0f, 11.0f);
        fVar.g(7.0f);
        fVar.n(4.0f);
        fVar.i(-2.35f, 2.35f);
        fVar.b();
        p201u0.d dVarF = aVar2.c(fVar.e(), (14336 & 2) != 0 ? p201u0.o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f2Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? p201u0.o.c() : iA, (14336 & 512) != 0 ? p201u0.o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f8705a = dVarF;
        p247y7.AbstractC7350t.c(dVarF);
        return dVarF;
    }
}
