package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class A implements j$.util.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f48045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f48046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f48047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f48048d;

    A(long j6, long j10, long j11, long j12) {
        this.f48045a = j6;
        this.f48046b = j10;
        this.f48047c = j11;
        this.f48048d = j12;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j$.util.concurrent.A trySplit() {
        long j6 = this.f48045a;
        long j10 = (this.f48046b + j6) >>> 1;
        if (j10 <= j6) {
            return null;
        }
        this.f48045a = j10;
        return new j$.util.concurrent.A(j6, j10, this.f48047c, this.f48048d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48046b - this.f48045a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        longConsumer.getClass();
        long j6 = this.f48045a;
        long j10 = this.f48046b;
        if (j6 < j10) {
            this.f48045a = j10;
            j$.util.concurrent.ThreadLocalRandom threadLocalRandomCurrent = j$.util.concurrent.ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.e(this.f48047c, this.f48048d));
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
        return j$.util.Q.h(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        longConsumer.getClass();
        long j6 = this.f48045a;
        if (j6 >= this.f48046b) {
            return false;
        }
        longConsumer.accept(j$.util.concurrent.ThreadLocalRandom.current().e(this.f48047c, this.f48048d));
        this.f48045a = j6 + 1;
        return true;
    }
}
