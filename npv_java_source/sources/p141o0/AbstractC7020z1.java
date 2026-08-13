package p141o0;

/* JADX INFO: renamed from: o0.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7020z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p141o0.AbstractC7020z1.a f52282a = new p141o0.AbstractC7020z1.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52283b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52284c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52285d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f52286e = c(3);

    /* JADX INFO: renamed from: o0.z1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p141o0.AbstractC7020z1.f52284c;
        }

        public final int b() {
            return p141o0.AbstractC7020z1.f52283b;
        }
    }

    public static int c(int i6) {
        return i6;
    }

    public static final boolean d(int i6, int i10) {
        return i6 == i10;
    }

    public static int e(int i6) {
        return i6;
    }

    public static java.lang.String f(int i6) {
        if (d(i6, f52283b)) {
            return "None";
        }
        if (d(i6, f52284c)) {
            return "Low";
        }
        if (d(i6, f52285d)) {
            return "Medium";
        }
        return d(i6, f52286e) ? "High" : "Unknown";
    }
}
