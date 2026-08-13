package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.z.a f16241b = new Y0.z.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16242c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f16243d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f16244e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16245a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return Y0.z.f16244e;
        }

        public final long b() {
            return Y0.z.f16243d;
        }

        public final long c() {
            return Y0.z.f16242c;
        }
    }

    private /* synthetic */ z(long j6) {
        this.f16245a = j6;
    }

    public static final /* synthetic */ Y0.z d(long j6) {
        return new Y0.z(j6);
    }

    public static long e(long j6) {
        return j6;
    }

    public static boolean f(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.z) && j6 == ((Y0.z) obj).j();
    }

    public static final boolean g(long j6, long j10) {
        return j6 == j10;
    }

    public static int h(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String i(long j6) {
        if (g(j6, f16242c)) {
            return "Unspecified";
        }
        if (g(j6, f16243d)) {
            return "Sp";
        }
        return g(j6, f16244e) ? "Em" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return f(this.f16245a, obj);
    }

    public int hashCode() {
        return h(this.f16245a);
    }

    public final /* synthetic */ long j() {
        return this.f16245a;
    }

    public java.lang.String toString() {
        return i(this.f16245a);
    }
}
