package S0;

/* JADX INFO: renamed from: S0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1615x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S0.C1615x.a f12398b = new S0.C1615x.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12399c = g(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f12400d = g(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f12401e = g(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f12402f = g(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f12403g = g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12404a;

    /* JADX INFO: renamed from: S0.x$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return S0.C1615x.f12401e;
        }

        public final int b() {
            return S0.C1615x.f12400d;
        }

        public final int c() {
            return S0.C1615x.f12403g;
        }

        public final int d() {
            return S0.C1615x.f12399c;
        }

        public final int e() {
            return S0.C1615x.f12402f;
        }
    }

    private /* synthetic */ C1615x(int i6) {
        this.f12404a = i6;
    }

    public static final /* synthetic */ S0.C1615x f(int i6) {
        return new S0.C1615x(i6);
    }

    private static int g(int i6) {
        return i6;
    }

    public static boolean h(int i6, java.lang.Object obj) {
        return (obj instanceof S0.C1615x) && i6 == ((S0.C1615x) obj).l();
    }

    public static final boolean i(int i6, int i10) {
        return i6 == i10;
    }

    public static int j(int i6) {
        return i6;
    }

    public static java.lang.String k(int i6) {
        if (i(i6, f12399c)) {
            return "Unspecified";
        }
        if (i(i6, f12400d)) {
            return "None";
        }
        if (i(i6, f12401e)) {
            return "Characters";
        }
        if (i(i6, f12402f)) {
            return "Words";
        }
        return i(i6, f12403g) ? "Sentences" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return h(this.f12404a, obj);
    }

    public int hashCode() {
        return j(this.f12404a);
    }

    public final /* synthetic */ int l() {
        return this.f12404a;
    }

    public java.lang.String toString() {
        return k(this.f12404a);
    }
}
