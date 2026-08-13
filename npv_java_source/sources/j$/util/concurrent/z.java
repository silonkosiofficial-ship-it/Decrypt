package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class z implements j$.util.X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f48116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f48117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f48118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f48119d;

    z(long j6, long j10, int i6, int i10) {
        this.f48116a = j6;
        this.f48117b = j10;
        this.f48118c = i6;
        this.f48119d = i10;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j$.util.concurrent.z trySplit() {
        long j6 = this.f48116a;
        long j10 = (this.f48117b + j6) >>> 1;
        if (j10 <= j6) {
            return null;
        }
        this.f48116a = j10;
        return new j$.util.concurrent.z(j6, j10, this.f48118c, this.f48119d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48117b - this.f48116a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        intConsumer.getClass();
        long j6 = this.f48116a;
        long j10 = this.f48117b;
        if (j6 < j10) {
            this.f48116a = j10;
            j$.util.concurrent.ThreadLocalRandom threadLocalRandomCurrent = j$.util.concurrent.ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.d(this.f48118c, this.f48119d));
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
        return j$.util.Q.g(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        intConsumer.getClass();
        long j6 = this.f48116a;
        if (j6 >= this.f48117b) {
            return false;
        }
        intConsumer.accept(j$.util.concurrent.ThreadLocalRandom.current().d(this.f48118c, this.f48119d));
        this.f48116a = j6 + 1;
        return true;
    }
}
