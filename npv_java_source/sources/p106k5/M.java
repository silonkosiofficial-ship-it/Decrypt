package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f49579a = new java.util.concurrent.atomic.AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f49580b = new java.util.concurrent.atomic.AtomicInteger();

    public void a() {
        this.f49580b.getAndIncrement();
    }

    public void b() {
        this.f49579a.getAndIncrement();
    }

    public void c() {
        this.f49580b.set(0);
    }
}
