package L9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f6449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private L9.d f6451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6452d;

    public a(java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f6449a = str;
        this.f6450b = z6;
        this.f6452d = -1L;
    }

    public /* synthetic */ a(java.lang.String str, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, (i6 & 2) != 0 ? true : z6);
    }

    public final boolean a() {
        return this.f6450b;
    }

    public final java.lang.String b() {
        return this.f6449a;
    }

    public final long c() {
        return this.f6452d;
    }

    public final L9.d d() {
        return this.f6451c;
    }

    public final void e(L9.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "queue");
        L9.d dVar2 = this.f6451c;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            throw new java.lang.IllegalStateException("task is in multiple queues".toString());
        }
        this.f6451c = dVar;
    }

    public abstract long f();

    public final void g(long j6) {
        this.f6452d = j6;
    }

    public java.lang.String toString() {
        return this.f6449a;
    }
}
