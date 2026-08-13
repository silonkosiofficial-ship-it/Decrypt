package p131n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p131n0.a.C0648a f51306a = new p131n0.a.C0648a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f51307b = p131n0.b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    public static final class C0648a {
        private C0648a() {
        }

        public /* synthetic */ C0648a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return p131n0.a.f51307b;
        }
    }

    public static long b(long j6) {
        return j6;
    }

    public static final boolean c(long j6, long j10) {
        return j6 == j10;
    }

    public static final float d(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float e(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static int f(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String g(long j6) {
        java.lang.StringBuilder sb;
        float fE;
        if (d(j6) == e(j6)) {
            sb = new java.lang.StringBuilder();
            sb.append("CornerRadius.circular(");
            fE = d(j6);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("CornerRadius.elliptical(");
            sb.append(p131n0.c.a(d(j6), 1));
            sb.append(", ");
            fE = e(j6);
        }
        sb.append(p131n0.c.a(fE, 1));
        sb.append(')');
        return sb.toString();
    }
}
