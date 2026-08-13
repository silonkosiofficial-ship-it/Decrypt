package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f57458a;

    private /* synthetic */ A(long j6) {
        this.f57458a = j6;
    }

    public static final /* synthetic */ p251z0.A a(long j6) {
        return new p251z0.A(j6);
    }

    public static long b(long j6) {
        return j6;
    }

    public static boolean c(long j6, java.lang.Object obj) {
        return (obj instanceof p251z0.A) && j6 == ((p251z0.A) obj).g();
    }

    public static final boolean d(long j6, long j10) {
        return j6 == j10;
    }

    public static int e(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String f(long j6) {
        return "PointerId(value=" + j6 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return c(this.f57458a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f57458a;
    }

    public int hashCode() {
        return e(this.f57458a);
    }

    public java.lang.String toString() {
        return f(this.f57458a);
    }
}
