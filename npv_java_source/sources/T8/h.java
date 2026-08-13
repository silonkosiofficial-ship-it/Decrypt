package T8;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T8.h f13329a = new T8.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f13330b = java.lang.System.nanoTime();

    private h() {
    }

    private final long c() {
        return java.lang.System.nanoTime() - f13330b;
    }

    public final long a(long j6) {
        return T8.g.b(c(), j6, T8.d.NANOSECONDS);
    }

    public long b() {
        return T8.i.a.e(c());
    }

    public java.lang.String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
