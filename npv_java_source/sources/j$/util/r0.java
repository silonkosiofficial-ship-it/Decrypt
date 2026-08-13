package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class r0 implements j$.util.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f48184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48187d;

    public r0(long[] jArr, int i6, int i10, int i11) {
        this.f48184a = jArr;
        this.f48185b = i6;
        this.f48186c = i10;
        this.f48187d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f48187d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48186c - this.f48185b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        int i6;
        longConsumer.getClass();
        long[] jArr = this.f48184a;
        int length = jArr.length;
        int i10 = this.f48186c;
        if (length < i10 || (i6 = this.f48185b) < 0) {
            return;
        }
        this.f48185b = i10;
        if (i6 < i10) {
            do {
                longConsumer.accept(jArr[i6]);
                i6++;
            } while (i6 < i10);
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.util.Q.e(this, 4)) {
            return null;
        }
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
        int i6 = this.f48185b;
        if (i6 < 0 || i6 >= this.f48186c) {
            return false;
        }
        this.f48185b = i6 + 1;
        longConsumer.accept(this.f48184a[i6]);
        return true;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final j$.util.a0 trySplit() {
        int i6 = this.f48185b;
        int i10 = (this.f48186c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f48185b = i10;
        return new j$.util.r0(this.f48184a, i6, i10, this.f48187d);
    }
}
