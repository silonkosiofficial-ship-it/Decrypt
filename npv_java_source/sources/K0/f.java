package K0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K0.f.a f5947b = new K0.f.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f5948c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5949d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5950a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return K0.f.f5949d;
        }

        public final int b() {
            return K0.f.f5948c;
        }
    }

    private /* synthetic */ f(int i6) {
        this.f5950a = i6;
    }

    public static final /* synthetic */ K0.f c(int i6) {
        return new K0.f(i6);
    }

    private static int d(int i6) {
        return i6;
    }

    public static boolean e(int i6, java.lang.Object obj) {
        return (obj instanceof K0.f) && i6 == ((K0.f) obj).i();
    }

    public static final boolean f(int i6, int i10) {
        return i6 == i10;
    }

    public static int g(int i6) {
        return i6;
    }

    public static java.lang.String h(int i6) {
        if (f(i6, f5948c)) {
            return "Polite";
        }
        return f(i6, f5949d) ? "Assertive" : "Unknown";
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f5950a, obj);
    }

    public int hashCode() {
        return g(this.f5950a);
    }

    public final /* synthetic */ int i() {
        return this.f5950a;
    }

    public java.lang.String toString() {
        return h(this.f5950a);
    }
}
