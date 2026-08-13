package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class f extends j$.util.concurrent.p implements j$.util.Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final j$.util.concurrent.ConcurrentHashMap f48074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f48075j;

    f(j$.util.concurrent.l[] lVarArr, int i6, int i10, int i11, long j6, j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i6, i10, i11);
        this.f48074i = concurrentHashMap;
        this.f48075j = j6;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48075j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        consumer.getClass();
        while (true) {
            j$.util.concurrent.l lVarA = a();
            if (lVarA == null) {
                return;
            } else {
                consumer.accept(new j$.util.concurrent.k(lVarA.f48084b, lVarA.f48085c, this.f48074i));
            }
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
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        consumer.getClass();
        j$.util.concurrent.l lVarA = a();
        if (lVarA == null) {
            return false;
        }
        consumer.accept(new j$.util.concurrent.k(lVarA.f48084b, lVarA.f48085c, this.f48074i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        int i6 = this.f48096f;
        int i10 = this.f48097g;
        int i11 = (i6 + i10) >>> 1;
        if (i11 <= i6) {
            return null;
        }
        j$.util.concurrent.l[] lVarArr = this.f48091a;
        this.f48097g = i11;
        long j6 = this.f48075j >>> 1;
        this.f48075j = j6;
        return new j$.util.concurrent.f(lVarArr, this.f48098h, i11, i10, j6, this.f48074i);
    }
}
