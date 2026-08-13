package S;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S.s1.a f11748b = new S.s1.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11749c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f11750d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11751a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return S.s1.f11749c;
        }

        public final int b() {
            return S.s1.f11750d;
        }
    }

    private /* synthetic */ s1(int i6) {
        this.f11751a = i6;
    }

    public static final /* synthetic */ S.s1 c(int i6) {
        return new S.s1(i6);
    }

    private static int d(int i6) {
        return i6;
    }

    public static boolean e(int i6, java.lang.Object obj) {
        return (obj instanceof S.s1) && i6 == ((S.s1) obj).i();
    }

    public static final boolean f(int i6, int i10) {
        return i6 == i10;
    }

    public static int g(int i6) {
        return i6;
    }

    public static java.lang.String h(int i6) {
        if (f(i6, f11749c)) {
            return "Hour";
        }
        return f(i6, f11750d) ? "Minute" : "";
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f11751a, obj);
    }

    public int hashCode() {
        return g(this.f11751a);
    }

    public final /* synthetic */ int i() {
        return this.f11751a;
    }

    public java.lang.String toString() {
        return h(this.f11751a);
    }
}
