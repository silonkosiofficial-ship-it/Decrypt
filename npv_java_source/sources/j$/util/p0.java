package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class p0 implements j$.util.X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f48174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48177d;

    public p0(int[] iArr, int i6, int i10, int i11) {
        this.f48174a = iArr;
        this.f48175b = i6;
        this.f48176c = i10;
        this.f48177d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f48177d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48176c - this.f48175b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        int i6;
        intConsumer.getClass();
        int[] iArr = this.f48174a;
        int length = iArr.length;
        int i10 = this.f48176c;
        if (length < i10 || (i6 = this.f48175b) < 0) {
            return;
        }
        this.f48175b = i10;
        if (i6 < i10) {
            do {
                intConsumer.accept(iArr[i6]);
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
        return j$.util.Q.g(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        intConsumer.getClass();
        int i6 = this.f48175b;
        if (i6 < 0 || i6 >= this.f48176c) {
            return false;
        }
        this.f48175b = i6 + 1;
        intConsumer.accept(this.f48174a[i6]);
        return true;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final j$.util.X trySplit() {
        int i6 = this.f48175b;
        int i10 = (this.f48176c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f48175b = i10;
        return new j$.util.p0(this.f48174a, i6, i10, this.f48177d);
    }
}
