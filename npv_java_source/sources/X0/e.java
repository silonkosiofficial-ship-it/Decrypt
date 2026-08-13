package X0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X0.e.a f15579b = new X0.e.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15580c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15581d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f15582e = e(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15583a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return X0.e.f15581d;
        }

        public final int b() {
            return X0.e.f15580c;
        }

        public final int c() {
            return X0.e.f15582e;
        }
    }

    private /* synthetic */ e(int i6) {
        this.f15583a = i6;
    }

    public static final /* synthetic */ X0.e d(int i6) {
        return new X0.e(i6);
    }

    private static int e(int i6) {
        return i6;
    }

    public static boolean f(int i6, java.lang.Object obj) {
        return (obj instanceof X0.e) && i6 == ((X0.e) obj).j();
    }

    public static final boolean g(int i6, int i10) {
        return i6 == i10;
    }

    public static int h(int i6) {
        return i6;
    }

    public static java.lang.String i(int i6) {
        if (g(i6, f15580c)) {
            return "Hyphens.None";
        }
        if (g(i6, f15581d)) {
            return "Hyphens.Auto";
        }
        return g(i6, f15582e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return f(this.f15583a, obj);
    }

    public int hashCode() {
        return h(this.f15583a);
    }

    public final /* synthetic */ int j() {
        return this.f15583a;
    }

    public java.lang.String toString() {
        return i(this.f15583a);
    }
}
