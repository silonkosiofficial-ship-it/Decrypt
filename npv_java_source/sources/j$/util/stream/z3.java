package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class z3 extends j$.util.stream.A3 implements j$.util.Spliterator {
    z3(j$.util.Spliterator spliterator, long j6, long j10) {
        super(spliterator, j6, j10, 0L, java.lang.Math.min(spliterator.estimateSize(), j10));
    }

    @Override // j$.util.stream.A3
    protected final j$.util.Spliterator a(j$.util.Spliterator spliterator, long j6, long j10, long j11, long j12) {
        return new j$.util.stream.z3(spliterator, j6, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        long j6 = this.f48204e;
        long j10 = this.f48200a;
        if (j10 >= j6) {
            return;
        }
        long j11 = this.f48203d;
        if (j11 >= j6) {
            return;
        }
        if (j11 >= j10 && this.f48202c.estimateSize() + j11 <= this.f48201b) {
            this.f48202c.forEachRemaining(consumer);
            this.f48203d = this.f48204e;
            return;
        }
        while (j10 > this.f48203d) {
            this.f48202c.tryAdvance(new j$.util.stream.C6740c2(5));
            this.f48203d++;
        }
        while (this.f48203d < this.f48204e) {
            this.f48202c.tryAdvance(consumer);
            this.f48203d++;
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
        long j6;
        j$.util.Objects.requireNonNull(consumer);
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
            this.f48202c.tryAdvance(new j$.util.stream.C6740c2(4));
            this.f48203d++;
        }
        if (j6 >= this.f48204e) {
            return false;
        }
        this.f48203d = j6 + 1;
        return this.f48202c.tryAdvance(consumer);
    }
}
