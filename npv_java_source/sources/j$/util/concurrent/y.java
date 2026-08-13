package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class y implements j$.util.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f48112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f48113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double f48114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final double f48115d;

    y(long j6, long j10, double d6, double d10) {
        this.f48112a = j6;
        this.f48113b = j10;
        this.f48114c = d6;
        this.f48115d = d10;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j$.util.concurrent.y trySplit() {
        long j6 = this.f48112a;
        long j10 = (this.f48113b + j6) >>> 1;
        if (j10 <= j6) {
            return null;
        }
        this.f48112a = j10;
        return new j$.util.concurrent.y(j6, j10, this.f48114c, this.f48115d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48113b - this.f48112a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j6 = this.f48112a;
        long j10 = this.f48113b;
        if (j6 < j10) {
            this.f48112a = j10;
            j$.util.concurrent.ThreadLocalRandom threadLocalRandomCurrent = j$.util.concurrent.ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.c(this.f48114c, this.f48115d));
                j6++;
            } while (j6 < j10);
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Q.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return j$.util.Q.e(this, i6);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j6 = this.f48112a;
        if (j6 >= this.f48113b) {
            return false;
        }
        doubleConsumer.accept(j$.util.concurrent.ThreadLocalRandom.current().c(this.f48114c, this.f48115d));
        this.f48112a = j6 + 1;
        return true;
    }
}
