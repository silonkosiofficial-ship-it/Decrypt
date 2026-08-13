package p251z0;

/* JADX INFO: renamed from: z0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7381q {
    public static final boolean a(p251z0.B b6) {
        return (b6.p() || b6.l() || !b6.i()) ? false : true;
    }

    public static final boolean b(p251z0.B b6) {
        return !b6.l() && b6.i();
    }

    public static final boolean c(p251z0.B b6) {
        return (b6.p() || !b6.l() || b6.i()) ? false : true;
    }

    public static final boolean d(p251z0.B b6) {
        return b6.l() && !b6.i();
    }

    public static final boolean e(p251z0.B b6, long j6) {
        long jH = b6.h();
        float fM = p131n0.g.m(jH);
        float fN = p131n0.g.n(jH);
        return fM < 0.0f || fM > ((float) Y0.t.g(j6)) || fN < 0.0f || fN > ((float) Y0.t.f(j6));
    }

    public static final boolean f(p251z0.B b6, long j6, long j10) {
        if (!p251z0.P.g(b6.n(), p251z0.P.f57513a.d())) {
            return e(b6, j6);
        }
        long jH = b6.h();
        float fM = p131n0.g.m(jH);
        float fN = p131n0.g.n(jH);
        return fM < (-p131n0.m.i(j10)) || fM > ((float) Y0.t.g(j6)) + p131n0.m.i(j10) || fN < (-p131n0.m.g(j10)) || fN > ((float) Y0.t.f(j6)) + p131n0.m.g(j10);
    }

    public static final long g(p251z0.B b6) {
        return i(b6, false);
    }

    public static final long h(p251z0.B b6) {
        return i(b6, true);
    }

    private static final long i(p251z0.B b6, boolean z6) {
        long jQ = p131n0.g.q(b6.h(), b6.k());
        return (z6 || !b6.p()) ? jQ : p131n0.g.f51312b.c();
    }

    public static final boolean j(p251z0.B b6) {
        return !p131n0.g.j(i(b6, true), p131n0.g.f51312b.c());
    }
}
