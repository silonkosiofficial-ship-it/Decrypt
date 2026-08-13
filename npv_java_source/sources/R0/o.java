package R0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R0.o.a f9321b = new R0.o.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f9322c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f9323d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9324a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return R0.o.f9323d;
        }

        public final int b() {
            return R0.o.f9322c;
        }
    }

    private /* synthetic */ o(int i6) {
        this.f9324a = i6;
    }

    public static final /* synthetic */ R0.o c(int i6) {
        return new R0.o(i6);
    }

    public static int d(int i6) {
        return i6;
    }

    public static boolean e(int i6, java.lang.Object obj) {
        return (obj instanceof R0.o) && i6 == ((R0.o) obj).i();
    }

    public static final boolean f(int i6, int i10) {
        return i6 == i10;
    }

    public static int g(int i6) {
        return i6;
    }

    public static java.lang.String h(int i6) {
        if (f(i6, f9322c)) {
            return "Normal";
        }
        return f(i6, f9323d) ? "Italic" : "Invalid";
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f9324a, obj);
    }

    public int hashCode() {
        return g(this.f9324a);
    }

    public final /* synthetic */ int i() {
        return this.f9324a;
    }

    public java.lang.String toString() {
        return h(this.f9324a);
    }
}
