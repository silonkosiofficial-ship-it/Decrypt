package p251z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0.P.a f57513a = new z0.P.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f57514b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f57515c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f57516d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f57517e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f57518f = f(4);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p251z0.P.f57518f;
        }

        public final int b() {
            return p251z0.P.f57516d;
        }

        public final int c() {
            return p251z0.P.f57517e;
        }

        public final int d() {
            return p251z0.P.f57515c;
        }

        public final int e() {
            return p251z0.P.f57514b;
        }
    }

    private static int f(int i6) {
        return i6;
    }

    public static final boolean g(int i6, int i10) {
        return i6 == i10;
    }

    public static int h(int i6) {
        return i6;
    }

    public static java.lang.String i(int i6) {
        if (i6 == 1) {
            return "Touch";
        }
        if (i6 == 2) {
            return "Mouse";
        }
        if (i6 != 3) {
            return i6 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }
}
