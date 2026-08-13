package X0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X0.a.C0296a f15571b = new X0.a.C0296a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f15572c = c(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f15573d = c(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f15574e = c(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15575a;

    /* JADX INFO: renamed from: X0.a$a, reason: collision with other inner class name */
    public static final class C0296a {
        private C0296a() {
        }

        public /* synthetic */ C0296a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final float a() {
            return X0.a.f15574e;
        }
    }

    private /* synthetic */ a(float f6) {
        this.f15575a = f6;
    }

    public static final /* synthetic */ X0.a b(float f6) {
        return new X0.a(f6);
    }

    public static float c(float f6) {
        return f6;
    }

    public static boolean d(float f6, java.lang.Object obj) {
        return (obj instanceof X0.a) && java.lang.Float.compare(f6, ((X0.a) obj).h()) == 0;
    }

    public static final boolean e(float f6, float f10) {
        return java.lang.Float.compare(f6, f10) == 0;
    }

    public static int f(float f6) {
        return java.lang.Float.floatToIntBits(f6);
    }

    public static java.lang.String g(float f6) {
        return "BaselineShift(multiplier=" + f6 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return d(this.f15575a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f15575a;
    }

    public int hashCode() {
        return f(this.f15575a);
    }

    public java.lang.String toString() {
        return g(this.f15575a);
    }
}
