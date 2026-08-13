package P;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p201u0.d f8233a;

    public static final p201u0.d a(O.a aVar) {
        p201u0.d dVar = f8233a;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }
        u0.d.a aVar2 = new u0.d.a("AutoMirrored.Filled.KeyboardArrowLeft", Y0.i.q(24.0f), Y0.i.q(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iB = p201u0.o.b();
        p141o0.f2 f2Var = new p141o0.f2(p141o0.C7016y0.f52264b.a(), null);
        int iA = p141o0.g2.f52226a.a();
        int iA2 = p141o0.h2.f52230a.a();
        p201u0.f fVar = new p201u0.f();
        fVar.j(15.41f, 16.59f);
        fVar.h(10.83f, 12.0f);
        fVar.i(4.58f, -4.59f);
        fVar.h(14.0f, 6.0f);
        fVar.i(-6.0f, 6.0f);
        fVar.i(6.0f, 6.0f);
        fVar.i(1.41f, -1.41f);
        fVar.b();
        p201u0.d dVarF = aVar2.c(fVar.e(), (14336 & 2) != 0 ? p201u0.o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f2Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? p201u0.o.c() : iA, (14336 & 512) != 0 ? p201u0.o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f8233a = dVarF;
        p247y7.AbstractC7350t.c(dVarF);
        return dVarF;
    }
}
