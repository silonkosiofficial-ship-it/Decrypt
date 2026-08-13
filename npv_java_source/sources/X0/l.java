package X0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X0.l.a f15636b = new X0.l.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15637c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15638d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f15639e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f15640f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f15641g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f15642h = h(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15643a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return X0.l.f15639e;
        }

        public final int b() {
            return X0.l.f15640f;
        }

        public final int c() {
            return X0.l.f15641g;
        }

        public final int d() {
            return X0.l.f15637c;
        }

        public final int e() {
            return X0.l.f15638d;
        }

        public final int f() {
            return X0.l.f15642h;
        }
    }

    private /* synthetic */ l(int i6) {
        this.f15643a = i6;
    }

    public static final /* synthetic */ X0.l g(int i6) {
        return new X0.l(i6);
    }

    public static int h(int i6) {
        return i6;
    }

    public static boolean i(int i6, java.lang.Object obj) {
        return (obj instanceof X0.l) && i6 == ((X0.l) obj).m();
    }

    public static final boolean j(int i6, int i10) {
        return i6 == i10;
    }

    public static int k(int i6) {
        return i6;
    }

    public static java.lang.String l(int i6) {
        if (j(i6, f15637c)) {
            return "Ltr";
        }
        if (j(i6, f15638d)) {
            return "Rtl";
        }
        if (j(i6, f15639e)) {
            return "Content";
        }
        if (j(i6, f15640f)) {
            return "ContentOrLtr";
        }
        if (j(i6, f15641g)) {
            return "ContentOrRtl";
        }
        return j(i6, f15642h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return i(this.f15643a, obj);
    }

    public int hashCode() {
        return k(this.f15643a);
    }

    public final /* synthetic */ int m() {
        return this.f15643a;
    }

    public java.lang.String toString() {
        return l(this.f15643a);
    }
}
