package p221w0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p221w0.a.C0741a f56161b = new p221w0.a.C0741a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f56162c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f56163d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56164a;

    /* JADX INFO: renamed from: w0.a$a, reason: collision with other inner class name */
    public static final class C0741a {
        private C0741a() {
        }

        public /* synthetic */ C0741a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p221w0.a.f56163d;
        }

        public final int b() {
            return p221w0.a.f56162c;
        }
    }

    private /* synthetic */ a(int i6) {
        this.f56164a = i6;
    }

    public static final /* synthetic */ p221w0.a c(int i6) {
        return new p221w0.a(i6);
    }

    public static int d(int i6) {
        return i6;
    }

    public static boolean e(int i6, java.lang.Object obj) {
        return (obj instanceof p221w0.a) && i6 == ((p221w0.a) obj).i();
    }

    public static final boolean f(int i6, int i10) {
        return i6 == i10;
    }

    public static int g(int i6) {
        return i6;
    }

    public static java.lang.String h(int i6) {
        if (f(i6, f56162c)) {
            return "Touch";
        }
        return f(i6, f56163d) ? "Keyboard" : "Error";
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f56164a, obj);
    }

    public int hashCode() {
        return g(this.f56164a);
    }

    public final /* synthetic */ int i() {
        return this.f56164a;
    }

    public java.lang.String toString() {
        return h(this.f56164a);
    }
}
