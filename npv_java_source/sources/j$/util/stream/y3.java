package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class y3 extends j$.util.stream.A3 implements j$.util.d0 {
    y3(j$.util.d0 d0Var, long j6, long j10) {
        super(d0Var, j6, j10, 0L, java.lang.Math.min(d0Var.estimateSize(), j10));
    }

    protected abstract java.lang.Object b();

    @Override // j$.util.d0
    public final void forEachRemaining(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        long j6 = this.f48204e;
        long j10 = this.f48200a;
        if (j10 >= j6) {
            return;
        }
        long j11 = this.f48203d;
        if (j11 >= j6) {
            return;
        }
        if (j11 >= j10 && ((j$.util.d0) this.f48202c).estimateSize() + j11 <= this.f48201b) {
            ((j$.util.d0) this.f48202c).forEachRemaining(obj);
            this.f48203d = this.f48204e;
            return;
        }
        while (j10 > this.f48203d) {
            ((j$.util.d0) this.f48202c).tryAdvance(b());
            this.f48203d++;
        }
        while (this.f48203d < this.f48204e) {
            ((j$.util.d0) this.f48202c).tryAdvance(obj);
            this.f48203d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        forEachRemaining((java.lang.Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.lang.Object) longConsumer);
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

    @Override // j$.util.d0
    public final boolean tryAdvance(java.lang.Object obj) {
        long j6;
        j$.util.Objects.requireNonNull(obj);
        long j10 = this.f48204e;
        long j11 = this.f48200a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j6 = this.f48203d;
            if (j11 <= j6) {
                break;
            }
            ((j$.util.d0) this.f48202c).tryAdvance(b());
            this.f48203d++;
        }
        if (j6 >= this.f48204e) {
            return false;
        }
        this.f48203d = j6 + 1;
        return ((j$.util.d0) this.f48202c).tryAdvance(obj);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return tryAdvance((java.lang.Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.lang.Object) longConsumer);
    }
}
