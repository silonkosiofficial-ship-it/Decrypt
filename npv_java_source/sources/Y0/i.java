package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Y0.i.a f16208D = new Y0.i.a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final float f16209E = q(0.0f);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final float f16210F = q(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final float f16211G = q(Float.NaN);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float f16212C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final float a() {
            return Y0.i.f16209E;
        }

        public final float b() {
            return Y0.i.f16210F;
        }

        public final float c() {
            return Y0.i.f16211G;
        }
    }

    private /* synthetic */ i(float f6) {
        this.f16212C = f6;
    }

    public static final /* synthetic */ Y0.i m(float f6) {
        return new Y0.i(f6);
    }

    public static int o(float f6, float f10) {
        return java.lang.Float.compare(f6, f10);
    }

    public static float q(float f6) {
        return f6;
    }

    public static boolean r(float f6, java.lang.Object obj) {
        return (obj instanceof Y0.i) && java.lang.Float.compare(f6, ((Y0.i) obj).v()) == 0;
    }

    public static final boolean s(float f6, float f10) {
        return java.lang.Float.compare(f6, f10) == 0;
    }

    public static int t(float f6) {
        return java.lang.Float.floatToIntBits(f6);
    }

    public static java.lang.String u(float f6) {
        if (java.lang.Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return n(((Y0.i) obj).v());
    }

    public boolean equals(java.lang.Object obj) {
        return r(this.f16212C, obj);
    }

    public int hashCode() {
        return t(this.f16212C);
    }

    public int n(float f6) {
        return o(this.f16212C, f6);
    }

    public java.lang.String toString() {
        return u(this.f16212C);
    }

    public final /* synthetic */ float v() {
        return this.f16212C;
    }
}
