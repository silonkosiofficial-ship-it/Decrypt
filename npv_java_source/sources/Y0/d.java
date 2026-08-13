package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static int a(Y0.e eVar, long j6) {
        return java.lang.Math.round(eVar.g1(j6));
    }

    public static int b(Y0.e eVar, float f6) {
        float fB0 = eVar.B0(f6);
        if (java.lang.Float.isInfinite(fB0)) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.round(fB0);
    }

    public static float c(Y0.e eVar, float f6) {
        return Y0.i.q(f6 / eVar.getDensity());
    }

    public static float d(Y0.e eVar, int i6) {
        return Y0.i.q(i6 / eVar.getDensity());
    }

    public static long e(Y0.e eVar, long j6) {
        return j6 != 9205357640488583168L ? Y0.j.b(eVar.q0(p131n0.m.i(j6)), eVar.q0(p131n0.m.g(j6))) : Y0.l.f16217b.a();
    }

    public static float f(Y0.e eVar, long j6) {
        if (Y0.z.g(Y0.x.g(j6), Y0.z.f16241b.b())) {
            return eVar.B0(eVar.X(j6));
        }
        throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float g(Y0.e eVar, float f6) {
        return f6 * eVar.getDensity();
    }

    public static long h(Y0.e eVar, long j6) {
        return j6 != 9205357640488583168L ? p131n0.n.a(eVar.B0(Y0.l.h(j6)), eVar.B0(Y0.l.g(j6))) : p131n0.m.f51333b.a();
    }

    public static long i(Y0.e eVar, float f6) {
        return eVar.O(eVar.q0(f6));
    }
}
