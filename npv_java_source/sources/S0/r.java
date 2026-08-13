package S0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S0.r.a f12375b = new S0.r.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12376c = k(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f12377d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f12378e = k(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f12379f = k(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f12380g = k(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f12381h = k(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f12382i = k(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f12383j = k(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f12384k = k(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12385a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return S0.r.f12377d;
        }

        public final int b() {
            return S0.r.f12384k;
        }

        public final int c() {
            return S0.r.f12379f;
        }

        public final int d() {
            return S0.r.f12383j;
        }

        public final int e() {
            return S0.r.f12378e;
        }

        public final int f() {
            return S0.r.f12382i;
        }

        public final int g() {
            return S0.r.f12380g;
        }

        public final int h() {
            return S0.r.f12381h;
        }

        public final int i() {
            return S0.r.f12376c;
        }
    }

    private /* synthetic */ r(int i6) {
        this.f12385a = i6;
    }

    public static final /* synthetic */ S0.r j(int i6) {
        return new S0.r(i6);
    }

    private static int k(int i6) {
        return i6;
    }

    public static boolean l(int i6, java.lang.Object obj) {
        return (obj instanceof S0.r) && i6 == ((S0.r) obj).p();
    }

    public static final boolean m(int i6, int i10) {
        return i6 == i10;
    }

    public static int n(int i6) {
        return i6;
    }

    public static java.lang.String o(int i6) {
        if (m(i6, f12376c)) {
            return "Unspecified";
        }
        if (m(i6, f12378e)) {
            return "None";
        }
        if (m(i6, f12377d)) {
            return "Default";
        }
        if (m(i6, f12379f)) {
            return "Go";
        }
        if (m(i6, f12380g)) {
            return "Search";
        }
        if (m(i6, f12381h)) {
            return "Send";
        }
        if (m(i6, f12382i)) {
            return "Previous";
        }
        if (m(i6, f12383j)) {
            return "Next";
        }
        return m(i6, f12384k) ? "Done" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return l(this.f12385a, obj);
    }

    public int hashCode() {
        return n(this.f12385a);
    }

    public final /* synthetic */ int p() {
        return this.f12385a;
    }

    public java.lang.String toString() {
        return o(this.f12385a);
    }
}
