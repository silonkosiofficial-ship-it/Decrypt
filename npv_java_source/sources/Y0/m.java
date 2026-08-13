package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static float a(Y0.n nVar, long j6) {
        Z0.a aVarB;
        if (!Y0.z.g(Y0.x.g(j6), Y0.z.f16241b.b())) {
            Y0.o.b("Only Sp can convert to Px");
        }
        Z0.b bVar = Z0.b.f16660a;
        if (bVar.f(nVar.v0()) && (aVarB = bVar.b(nVar.v0())) != null) {
            return Y0.i.q(aVarB.b(Y0.x.h(j6)));
        }
        return Y0.i.q(Y0.x.h(j6) * nVar.v0());
    }

    public static long b(Y0.n nVar, float f6) {
        Z0.b bVar = Z0.b.f16660a;
        if (!bVar.f(nVar.v0())) {
            return Y0.y.e(f6 / nVar.v0());
        }
        Z0.a aVarB = bVar.b(nVar.v0());
        return Y0.y.e(aVarB != null ? aVarB.a(f6) : f6 / nVar.v0());
    }
}
