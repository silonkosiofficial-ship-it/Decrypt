package Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p201u0.d f8703a;

    public static final p201u0.d a(O.b.a aVar) {
        p201u0.d dVar = f8703a;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }
        u0.d.a aVar2 = new u0.d.a("Filled.PowerSettingsNew", Y0.i.q(24.0f), Y0.i.q(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = p201u0.o.b();
        p141o0.f2 f2Var = new p141o0.f2(p141o0.C7016y0.f52264b.a(), null);
        int iA = p141o0.g2.f52226a.a();
        int iA2 = p141o0.h2.f52230a.a();
        p201u0.f fVar = new p201u0.f();
        fVar.j(13.0f, 3.0f);
        fVar.g(-2.0f);
        fVar.o(10.0f);
        fVar.g(2.0f);
        fVar.h(13.0f, 3.0f);
        fVar.b();
        fVar.j(17.83f, 5.17f);
        fVar.i(-1.42f, 1.42f);
        fVar.c(17.99f, 7.86f, 19.0f, 9.81f, 19.0f, 12.0f);
        fVar.d(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        fVar.m(-7.0f, -3.13f, -7.0f, -7.0f);
        fVar.d(0.0f, -2.19f, 1.01f, -4.14f, 2.58f, -5.42f);
        fVar.h(6.17f, 5.17f);
        fVar.c(4.23f, 6.82f, 3.0f, 9.26f, 3.0f, 12.0f);
        fVar.d(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        fVar.m(9.0f, -4.03f, 9.0f, -9.0f);
        fVar.d(0.0f, -2.74f, -1.23f, -5.18f, -3.17f, -6.83f);
        fVar.b();
        p201u0.d dVarF = aVar2.c(fVar.e(), (14336 & 2) != 0 ? p201u0.o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f2Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? p201u0.o.c() : iA, (14336 & 512) != 0 ? p201u0.o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f8703a = dVarF;
        p247y7.AbstractC7350t.c(dVarF);
        return dVarF;
    }
}
