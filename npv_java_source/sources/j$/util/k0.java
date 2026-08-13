package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class k0 implements j$.util.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double[] f48165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48168d;

    public k0(double[] dArr, int i6, int i10, int i11) {
        this.f48165a = dArr;
        this.f48166b = i6;
        this.f48167c = i10;
        this.f48168d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f48168d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48167c - this.f48166b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        int i6;
        doubleConsumer.getClass();
        double[] dArr = this.f48165a;
        int length = dArr.length;
        int i10 = this.f48167c;
        if (length < i10 || (i6 = this.f48166b) < 0) {
            return;
        }
        this.f48166b = i10;
        if (i6 < i10) {
            do {
                doubleConsumer.accept(dArr[i6]);
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
        return j$.util.Q.f(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i6 = this.f48166b;
        if (i6 < 0 || i6 >= this.f48167c) {
            return false;
        }
        this.f48166b = i6 + 1;
        doubleConsumer.accept(this.f48165a[i6]);
        return true;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final j$.util.U trySplit() {
        int i6 = this.f48166b;
        int i10 = (this.f48167c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f48166b = i10;
        return new j$.util.k0(this.f48165a, i6, i10, this.f48168d);
    }
}
