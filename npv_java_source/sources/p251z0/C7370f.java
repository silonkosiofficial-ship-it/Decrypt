package p251z0;

/* JADX INFO: renamed from: z0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7370f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f57556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f57557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f57558c;

    private C7370f(long j6, long j10) {
        this.f57556a = j6;
        this.f57557b = j10;
        this.f57558c = p131n0.g.f51312b.c();
    }

    private C7370f(long j6, long j10, long j11) {
        this(j6, j10, (p247y7.AbstractC7342k) null);
        this.f57558c = j11;
    }

    public /* synthetic */ C7370f(long j6, long j10, long j11, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11);
    }

    public /* synthetic */ C7370f(long j6, long j10, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10);
    }

    public final long a() {
        return this.f57558c;
    }

    public final long b() {
        return this.f57557b;
    }

    public final long c() {
        return this.f57556a;
    }

    public java.lang.String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f57556a + ", position=" + ((java.lang.Object) p131n0.g.t(this.f57557b)) + ')';
    }
}
