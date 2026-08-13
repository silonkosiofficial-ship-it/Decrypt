package S;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S.Y.a f10606b = new S.Y.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f10607c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f10608d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10609a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return S.Y.f10608d;
        }

        public final int b() {
            return S.Y.f10607c;
        }
    }

    private /* synthetic */ Y(int i6) {
        this.f10609a = i6;
    }

    public static final /* synthetic */ S.Y c(int i6) {
        return new S.Y(i6);
    }

    public static int d(int i6) {
        return i6;
    }

    public static boolean e(int i6, java.lang.Object obj) {
        return (obj instanceof S.Y) && i6 == ((S.Y) obj).i();
    }

    public static final boolean f(int i6, int i10) {
        return i6 == i10;
    }

    public static int g(int i6) {
        return i6;
    }

    public static java.lang.String h(int i6) {
        if (f(i6, f10607c)) {
            return "Picker";
        }
        return f(i6, f10608d) ? "Input" : "Unknown";
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f10609a, obj);
    }

    public int hashCode() {
        return g(this.f10609a);
    }

    public final /* synthetic */ int i() {
        return this.f10609a;
    }

    public java.lang.String toString() {
        return h(this.f10609a);
    }
}
