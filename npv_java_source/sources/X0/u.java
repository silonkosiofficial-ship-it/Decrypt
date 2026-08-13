package X0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0.u.a f15666a = new X0.u.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f15667b = d(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15668c = d(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15669d = d(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return X0.u.f15667b;
        }

        public final int b() {
            return X0.u.f15668c;
        }

        public final int c() {
            return X0.u.f15669d;
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
        if (e(i6, f15667b)) {
            return "Clip";
        }
        if (e(i6, f15668c)) {
            return "Ellipsis";
        }
        return e(i6, f15669d) ? "Visible" : "Invalid";
    }
}
