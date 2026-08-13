package M;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M.a.C0157a f6472a = new M.a.C0157a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f6473b = b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: M.a$a, reason: collision with other inner class name */
    public static final class C0157a {
        private C0157a() {
        }

        public /* synthetic */ C0157a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return M.a.f6473b;
        }
    }

    public static long b(float f6, float f10) {
        return c((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    private static long c(long j6) {
        return j6;
    }

    public static long d(Y0.e eVar) {
        return b(eVar.getDensity(), eVar.v0());
    }

    public static final boolean e(long j6, long j10) {
        return j6 == j10;
    }

    public static final float f(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float g(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static java.lang.String h(long j6) {
        return "InlineDensity(density=" + f(j6) + ", fontScale=" + g(j6) + ')';
    }
}
