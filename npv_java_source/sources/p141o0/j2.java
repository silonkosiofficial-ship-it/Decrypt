package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0.j2.a f52237a = new o0.j2.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52238b = e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52239c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52240d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f52241e = e(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p141o0.j2.f52238b;
        }

        public final int b() {
            return p141o0.j2.f52241e;
        }

        public final int c() {
            return p141o0.j2.f52240d;
        }

        public final int d() {
            return p141o0.j2.f52239c;
        }
    }

    public static int e(int i6) {
        return i6;
    }

    public static final boolean f(int i6, int i10) {
        return i6 == i10;
    }

    public static int g(int i6) {
        return i6;
    }

    public static java.lang.String h(int i6) {
        if (f(i6, f52238b)) {
            return "Clamp";
        }
        if (f(i6, f52239c)) {
            return "Repeated";
        }
        if (f(i6, f52240d)) {
            return "Mirror";
        }
        return f(i6, f52241e) ? "Decal" : "Unknown";
    }
}
