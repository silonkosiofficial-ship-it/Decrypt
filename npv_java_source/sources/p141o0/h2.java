package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0.h2.a f52230a = new o0.h2.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52231b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52232c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52233d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p141o0.h2.f52233d;
        }

        public final int b() {
            return p141o0.h2.f52231b;
        }

        public final int c() {
            return p141o0.h2.f52232c;
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
        if (e(i6, f52231b)) {
            return "Miter";
        }
        if (e(i6, f52232c)) {
            return "Round";
        }
        return e(i6, f52233d) ? "Bevel" : "Unknown";
    }
}
