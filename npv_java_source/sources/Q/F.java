package Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p201u0.d f8706a;

    public static final p201u0.d a(O.b.a aVar) {
        p201u0.d dVar = f8706a;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }
        u0.d.a aVar2 = new u0.d.a("Filled.Search", Y0.i.q(24.0f), Y0.i.q(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = p201u0.o.b();
        p141o0.f2 f2Var = new p141o0.f2(p141o0.C7016y0.f52264b.a(), null);
        int iA = p141o0.g2.f52226a.a();
        int iA2 = p141o0.h2.f52230a.a();
        p201u0.f fVar = new p201u0.f();
        fVar.j(15.5f, 14.0f);
        fVar.g(-0.79f);
        fVar.i(-0.28f, -0.27f);
        fVar.c(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        fVar.c(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        fVar.l(3.0f, 5.91f, 3.0f, 9.5f);
        fVar.l(5.91f, 16.0f, 9.5f, 16.0f);
        fVar.d(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        fVar.i(0.27f, 0.28f);
        fVar.o(0.79f);
        fVar.i(5.0f, 4.99f);
        fVar.h(20.49f, 19.0f);
        fVar.i(-4.99f, -5.0f);
        fVar.b();
        fVar.j(9.5f, 14.0f);
        fVar.c(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        fVar.l(7.01f, 5.0f, 9.5f, 5.0f);
        fVar.l(14.0f, 7.01f, 14.0f, 9.5f);
        fVar.l(11.99f, 14.0f, 9.5f, 14.0f);
        fVar.b();
        p201u0.d dVarF = aVar2.c(fVar.e(), (14336 & 2) != 0 ? p201u0.o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f2Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? p201u0.o.c() : iA, (14336 & 512) != 0 ? p201u0.o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f8706a = dVarF;
        p247y7.AbstractC7350t.c(dVarF);
        return dVarF;
    }
}
