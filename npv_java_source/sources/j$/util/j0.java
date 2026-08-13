package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class j0 implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object[] f48159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48162d;

    public j0(java.lang.Object[] objArr, int i6, int i10, int i11) {
        this.f48159a = objArr;
        this.f48160b = i6;
        this.f48161c = i10;
        this.f48162d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f48162d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48161c - this.f48160b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        int i6;
        consumer.getClass();
        java.lang.Object[] objArr = this.f48159a;
        int length = objArr.length;
        int i10 = this.f48161c;
        if (length < i10 || (i6 = this.f48160b) < 0) {
            return;
        }
        this.f48160b = i10;
        if (i6 < i10) {
            do {
                consumer.accept(objArr[i6]);
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
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        consumer.getClass();
        int i6 = this.f48160b;
        if (i6 < 0 || i6 >= this.f48161c) {
            return false;
        }
        this.f48160b = i6 + 1;
        consumer.accept(this.f48159a[i6]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        int i6 = this.f48160b;
        int i10 = (this.f48161c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f48160b = i10;
        return new j$.util.j0(this.f48159a, i6, i10, this.f48162d);
    }
}
