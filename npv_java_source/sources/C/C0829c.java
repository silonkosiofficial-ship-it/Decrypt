package C;

/* JADX INFO: renamed from: C.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0829c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1063a;

    private /* synthetic */ C0829c(long j6) {
        this.f1063a = j6;
    }

    public static final /* synthetic */ C.C0829c a(long j6) {
        return new C.C0829c(j6);
    }

    public static long b(long j6) {
        return j6;
    }

    public static boolean c(long j6, java.lang.Object obj) {
        return (obj instanceof C.C0829c) && j6 == ((C.C0829c) obj).g();
    }

    public static final int d(long j6) {
        return (int) j6;
    }

    public static int e(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String f(long j6) {
        return "GridItemSpan(packedValue=" + j6 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return c(this.f1063a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f1063a;
    }

    public int hashCode() {
        return e(this.f1063a);
    }

    public java.lang.String toString() {
        return f(this.f1063a);
    }
}
