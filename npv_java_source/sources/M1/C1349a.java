package M1;

/* JADX INFO: renamed from: M1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1349a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f6776a;

    public C1349a(int i6) {
        this.f6776a = new java.util.concurrent.atomic.AtomicInteger(i6);
    }

    public final int a() {
        return this.f6776a.decrementAndGet();
    }

    public final int b() {
        return this.f6776a.get();
    }

    public final int c() {
        return this.f6776a.getAndIncrement();
    }

    public final int d() {
        return this.f6776a.incrementAndGet();
    }
}
