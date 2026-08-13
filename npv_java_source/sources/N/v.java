package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f7495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f7496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final K0.v f7497c = new K0.v("SelectionHandleInfo", null, 2, null);

    static {
        float f6 = 25;
        f7495a = Y0.i.q(f6);
        f7496b = Y0.i.q(f6);
    }

    public static final long a(long j6) {
        return p131n0.h.a(p131n0.g.m(j6), p131n0.g.n(j6) - 1.0f);
    }

    public static final float b() {
        return f7496b;
    }

    public static final float c() {
        return f7495a;
    }

    public static final K0.v d() {
        return f7497c;
    }

    public static final boolean e(X0.i iVar, boolean z6) {
        return (iVar == X0.i.Ltr && !z6) || (iVar == X0.i.Rtl && z6);
    }

    public static final boolean f(boolean z6, X0.i iVar, boolean z10) {
        if (z6) {
            return e(iVar, z10);
        }
        return !e(iVar, z10);
    }
}
