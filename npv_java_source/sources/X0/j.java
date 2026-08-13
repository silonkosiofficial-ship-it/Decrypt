package X0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X0.j.a f15622b = new X0.j.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15623c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15624d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f15625e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f15626f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f15627g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f15628h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f15629i = i(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15630a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return X0.j.f15625e;
        }

        public final int b() {
            return X0.j.f15628h;
        }

        public final int c() {
            return X0.j.f15626f;
        }

        public final int d() {
            return X0.j.f15623c;
        }

        public final int e() {
            return X0.j.f15624d;
        }

        public final int f() {
            return X0.j.f15627g;
        }

        public final int g() {
            return X0.j.f15629i;
        }
    }

    private /* synthetic */ j(int i6) {
        this.f15630a = i6;
    }

    public static final /* synthetic */ X0.j h(int i6) {
        return new X0.j(i6);
    }

    public static int i(int i6) {
        return i6;
    }

    public static boolean j(int i6, java.lang.Object obj) {
        return (obj instanceof X0.j) && i6 == ((X0.j) obj).n();
    }

    public static final boolean k(int i6, int i10) {
        return i6 == i10;
    }

    public static int l(int i6) {
        return i6;
    }

    public static java.lang.String m(int i6) {
        if (k(i6, f15623c)) {
            return "Left";
        }
        if (k(i6, f15624d)) {
            return "Right";
        }
        if (k(i6, f15625e)) {
            return "Center";
        }
        if (k(i6, f15626f)) {
            return "Justify";
        }
        if (k(i6, f15627g)) {
            return "Start";
        }
        if (k(i6, f15628h)) {
            return "End";
        }
        return k(i6, f15629i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return j(this.f15630a, obj);
    }

    public int hashCode() {
        return l(this.f15630a);
    }

    public final /* synthetic */ int n() {
        return this.f15630a;
    }

    public java.lang.String toString() {
        return m(this.f15630a);
    }
}
