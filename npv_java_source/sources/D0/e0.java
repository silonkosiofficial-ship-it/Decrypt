package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D0.e0.a f1837a = new D0.e0.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f1838b = D0.f0.a(Float.NaN, Float.NaN);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static long a(long j6) {
        return j6;
    }

    public static final float b(long j6) {
        if (!(j6 != f1838b)) {
            C0.a.b("ScaleFactor is unspecified");
        }
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float c(long j6) {
        if (!(j6 != f1838b)) {
            C0.a.b("ScaleFactor is unspecified");
        }
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }
}
