package R;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9215a = Y0.i.q(10);

    public static final float a(Y0.e eVar, boolean z6, long j6) {
        float fK = p131n0.g.k(p131n0.h.a(p131n0.m.i(j6), p131n0.m.g(j6))) / 2.0f;
        return z6 ? fK + eVar.B0(f9215a) : fK;
    }

    public static final float b(long j6) {
        return java.lang.Math.max(p131n0.m.i(j6), p131n0.m.g(j6)) * 0.3f;
    }
}
