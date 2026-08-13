package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0.g2.a f52226a = new o0.g2.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52227b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52228c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52229d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p141o0.g2.f52227b;
        }

        public final int b() {
            return p141o0.g2.f52228c;
        }

        public final int c() {
            return p141o0.g2.f52229d;
        }
    }

    public static int d(int i6) {
        return i6;
    }

    public static final boolean e(int i6, int i10) {
        return i6 == i10;
    }

    public static int f(int i6) {
        return i6;
    }

    public static java.lang.String g(int i6) {
        if (e(i6, f52227b)) {
            return "Butt";
        }
        if (e(i6, f52228c)) {
            return "Round";
        }
        return e(i6, f52229d) ? "Square" : "Unknown";
    }
}
