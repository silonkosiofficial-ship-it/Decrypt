package B3;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D3.a f661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f665e = new java.util.concurrent.atomic.AtomicBoolean(false);

    public n0(D3.a aVar, java.lang.String str, long j6, int i6) {
        this.f661a = aVar;
        this.f662b = str;
        this.f663c = j6;
        this.f664d = i6;
    }

    public final int a() {
        return this.f664d;
    }

    public final D3.a b() {
        return this.f661a;
    }

    public final java.lang.String c() {
        return this.f662b;
    }

    public final void d() {
        this.f665e.set(true);
    }

    public final boolean e() {
        return this.f663c <= p174r3.v.c().a();
    }

    public final boolean f() {
        return this.f665e.get();
    }
}
