package Q;

/* JADX INFO: renamed from: Q.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1458i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p201u0.d f8721a;

    public static final p201u0.d a(O.b.a aVar) {
        p201u0.d dVar = f8721a;
        if (dVar != null) {
            p247y7.AbstractC7350t.c(dVar);
            return dVar;
        }
        u0.d.a aVar2 = new u0.d.a("Filled.Cloud", Y0.i.q(24.0f), Y0.i.q(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = p201u0.o.b();
        p141o0.f2 f2Var = new p141o0.f2(p141o0.C7016y0.f52264b.a(), null);
        int iA = p141o0.g2.f52226a.a();
        int iA2 = p141o0.h2.f52230a.a();
        p201u0.f fVar = new p201u0.f();
        fVar.j(19.35f, 10.04f);
        fVar.c(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        fVar.c(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        fVar.c(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        fVar.d(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        fVar.g(13.0f);
        fVar.d(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        fVar.d(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        fVar.b();
        p201u0.d dVarF = aVar2.c(fVar.e(), (14336 & 2) != 0 ? p201u0.o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f2Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? p201u0.o.c() : iA, (14336 & 512) != 0 ? p201u0.o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f8721a = dVarF;
        p247y7.AbstractC7350t.c(dVarF);
        return dVarF;
    }
}
