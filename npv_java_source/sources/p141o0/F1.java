package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class F1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0.F1.a f52118b = new o0.F1.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52119c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52120d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f52121e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f52122f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f52123g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52124a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p141o0.F1.f52120d;
        }

        public final int b() {
            return p141o0.F1.f52119c;
        }

        public final int c() {
            return p141o0.F1.f52122f;
        }

        public final int d() {
            return p141o0.F1.f52123g;
        }

        public final int e() {
            return p141o0.F1.f52121e;
        }
    }

    private /* synthetic */ F1(int i6) {
        this.f52124a = i6;
    }

    public static final /* synthetic */ p141o0.F1 f(int i6) {
        return new p141o0.F1(i6);
    }

    public static int g(int i6) {
        return i6;
    }

    public static boolean h(int i6, java.lang.Object obj) {
        return (obj instanceof p141o0.F1) && i6 == ((p141o0.F1) obj).l();
    }

    public static final boolean i(int i6, int i10) {
        return i6 == i10;
    }

    public static int j(int i6) {
        return i6;
    }

    public static java.lang.String k(int i6) {
        if (i(i6, f52119c)) {
            return "Argb8888";
        }
        if (i(i6, f52120d)) {
            return "Alpha8";
        }
        if (i(i6, f52121e)) {
            return "Rgb565";
        }
        if (i(i6, f52122f)) {
            return "F16";
        }
        return i(i6, f52123g) ? "Gpu" : "Unknown";
    }

    public boolean equals(java.lang.Object obj) {
        return h(this.f52124a, obj);
    }

    public int hashCode() {
        return j(this.f52124a);
    }

    public final /* synthetic */ int l() {
        return this.f52124a;
    }

    public java.lang.String toString() {
        return k(this.f52124a);
    }
}
