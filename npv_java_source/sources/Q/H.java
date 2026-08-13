package Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p201u0.d f8708a;

    public static final p201u0.d a(O.b.a aVar) {
        p201u0.d dVar = f8708a;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }
        u0.d.a aVar2 = new u0.d.a("Filled.Share", Y0.i.q(24.0f), Y0.i.q(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = p201u0.o.b();
        p141o0.f2 f2Var = new p141o0.f2(p141o0.C7016y0.f52264b.a(), null);
        int iA = p141o0.g2.f52226a.a();
        int iA2 = p141o0.h2.f52230a.a();
        p201u0.f fVar = new p201u0.f();
        fVar.j(18.0f, 16.08f);
        fVar.d(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        fVar.h(8.91f, 12.7f);
        fVar.d(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        fVar.m(-0.04f, -0.47f, -0.09f, -0.7f);
        fVar.i(7.05f, -4.11f);
        fVar.d(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        fVar.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        fVar.m(-1.34f, -3.0f, -3.0f, -3.0f);
        fVar.m(-3.0f, 1.34f, -3.0f, 3.0f);
        fVar.d(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        fVar.h(8.04f, 9.81f);
        fVar.c(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        fVar.d(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        fVar.m(1.34f, 3.0f, 3.0f, 3.0f);
        fVar.d(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        fVar.i(7.12f, 4.16f);
        fVar.d(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        fVar.d(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        fVar.d(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        fVar.m(-1.31f, -2.92f, -2.92f, -2.92f);
        fVar.b();
        p201u0.d dVarF = aVar2.c(fVar.e(), (14336 & 2) != 0 ? p201u0.o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f2Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? p201u0.o.c() : iA, (14336 & 512) != 0 ? p201u0.o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f8708a = dVarF;
        p247y7.AbstractC7350t.c(dVarF);
        return dVarF;
    }
}
