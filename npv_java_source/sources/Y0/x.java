package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.x.a f16237b = new Y0.x.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Y0.z[] f16238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f16239d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16240a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return Y0.x.f16239d;
        }
    }

    static {
        Y0.z.a aVar = Y0.z.f16241b;
        f16238c = new Y0.z[]{Y0.z.d(aVar.c()), Y0.z.d(aVar.b()), Y0.z.d(aVar.a())};
        f16239d = Y0.y.i(0L, Float.NaN);
    }

    private /* synthetic */ x(long j6) {
        this.f16240a = j6;
    }

    public static final /* synthetic */ Y0.x b(long j6) {
        return new Y0.x(j6);
    }

    public static long c(long j6) {
        return j6;
    }

    public static boolean d(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.x) && j6 == ((Y0.x) obj).k();
    }

    public static final boolean e(long j6, long j10) {
        return j6 == j10;
    }

    public static final long f(long j6) {
        return j6 & 1095216660480L;
    }

    public static final long g(long j6) {
        return f16238c[(int) (f(j6) >>> 32)].j();
    }

    public static final float h(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static int i(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String j(long j6) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        long jG = g(j6);
        Y0.z.a aVar = Y0.z.f16241b;
        if (Y0.z.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (Y0.z.g(jG, aVar.b())) {
            sb = new java.lang.StringBuilder();
            sb.append(h(j6));
            str = ".sp";
        } else {
            if (!Y0.z.g(jG, aVar.a())) {
                return "Invalid";
            }
            sb = new java.lang.StringBuilder();
            sb.append(h(j6));
            str = ".em";
        }
        sb.append(str);
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        return d(this.f16240a, obj);
    }

    public int hashCode() {
        return i(this.f16240a);
    }

    public final /* synthetic */ long k() {
        return this.f16240a;
    }

    public java.lang.String toString() {
        return j(this.f16240a);
    }
}
