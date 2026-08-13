package R0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R0.p.a f9325b = new R0.p.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f9326c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f9327d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f9328e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f9329f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9330a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return R0.p.f9327d;
        }

        public final int b() {
            return R0.p.f9326c;
        }

        public final int c() {
            return R0.p.f9329f;
        }

        public final int d() {
            return R0.p.f9328e;
        }
    }

    private /* synthetic */ p(int i6) {
        this.f9330a = i6;
    }

    public static final /* synthetic */ R0.p e(int i6) {
        return new R0.p(i6);
    }

    public static int f(int i6) {
        return i6;
    }

    public static boolean g(int i6, java.lang.Object obj) {
        return (obj instanceof R0.p) && i6 == ((R0.p) obj).k();
    }

    public static final boolean h(int i6, int i10) {
        return i6 == i10;
    }

    public static int i(int i6) {
        return i6;
    }

    public static java.lang.String j(int i6) {
        if (h(i6, f9326c)) {
            return "None";
        }
        if (h(i6, f9327d)) {
            return "All";
        }
        if (h(i6, f9328e)) {
            return "Weight";
        }
        return h(i6, f9329f) ? "Style" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return g(this.f9330a, obj);
    }

    public int hashCode() {
        return i(this.f9330a);
    }

    public final /* synthetic */ int k() {
        return this.f9330a;
    }

    public java.lang.String toString() {
        return j(this.f9330a);
    }
}
