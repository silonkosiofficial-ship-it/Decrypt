package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.Spliterator f48250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f48251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f48252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f48253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f48254e;

    H3(j$.util.Spliterator spliterator, long j6, long j10) {
        this.f48250a = spliterator;
        this.f48251b = j10 < 0;
        this.f48253d = j10 >= 0 ? j10 : 0L;
        this.f48252c = 128;
        this.f48254e = new java.util.concurrent.atomic.AtomicLong(j10 >= 0 ? j6 + j10 : j6);
    }

    H3(j$.util.Spliterator spliterator, j$.util.stream.H3 h6) {
        this.f48250a = spliterator;
        this.f48251b = h6.f48251b;
        this.f48254e = h6.f48254e;
        this.f48253d = h6.f48253d;
        this.f48252c = h6.f48252c;
    }

    protected final long b(long j6) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j10;
        boolean z6;
        long jMin;
        do {
            atomicLong = this.f48254e;
            j10 = atomicLong.get();
            z6 = this.f48251b;
            if (j10 != 0) {
                jMin = java.lang.Math.min(j10, j6);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z6) {
                    return j6;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j10, j10 - jMin));
        if (z6) {
            return java.lang.Math.max(j6 - jMin, 0L);
        }
        long j11 = this.f48253d;
        return j10 > j11 ? java.lang.Math.max(jMin - (j10 - j11), 0L) : jMin;
    }

    protected abstract j$.util.Spliterator c(j$.util.Spliterator spliterator);

    public final int characteristics() {
        return this.f48250a.characteristics() & (-16465);
    }

    protected final j$.util.stream.G3 d() {
        if (this.f48254e.get() > 0) {
            return j$.util.stream.G3.MAYBE_MORE;
        }
        return this.f48251b ? j$.util.stream.G3.UNLIMITED : j$.util.stream.G3.NO_MORE;
    }

    public final long estimateSize() {
        return this.f48250a.estimateSize();
    }

    public final j$.util.Spliterator trySplit() {
        j$.util.Spliterator spliteratorTrySplit;
        if (this.f48254e.get() == 0 || (spliteratorTrySplit = this.f48250a.trySplit()) == null) {
            return null;
        }
        return c(spliteratorTrySplit);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.U m164trySplit() {
        return (j$.util.U) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.X m165trySplit() {
        return (j$.util.X) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a0 m166trySplit() {
        return (j$.util.a0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d0 m167trySplit() {
        return (j$.util.d0) trySplit();
    }
}
