package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class W0 extends j$.util.stream.M0 {
    @Override // j$.util.stream.K0
    public final void forEach(java.util.function.Consumer consumer) {
        this.f48286a.forEach(consumer);
        this.f48287b.forEach(consumer);
    }

    @Override // j$.util.stream.K0
    public final j$.util.stream.K0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        if (j6 == 0 && j10 == count()) {
            return this;
        }
        long jCount = this.f48286a.count();
        if (j6 >= jCount) {
            return this.f48287b.g(j6 - jCount, j10 - jCount, intFunction);
        }
        if (j10 <= jCount) {
            return this.f48286a.g(j6, j10, intFunction);
        }
        return j$.util.stream.AbstractC6845y0.I(j$.util.stream.EnumC6761g3.REFERENCE, this.f48286a.g(j6, jCount, intFunction), this.f48287b.g(0L, j10 - jCount, intFunction));
    }

    @Override // j$.util.stream.K0
    public final void h(java.lang.Object[] objArr, int i6) {
        j$.util.Objects.requireNonNull(objArr);
        j$.util.stream.K0 k6 = this.f48286a;
        k6.h(objArr, i6);
        this.f48287b.h(objArr, i6 + ((int) k6.count()));
    }

    @Override // j$.util.stream.K0
    public final java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) jCount);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return new j$.util.stream.C6794n1(this);
    }

    public final java.lang.String toString() {
        return count() < 32 ? java.lang.String.format("ConcNode[%s.%s]", this.f48286a, this.f48287b) : java.lang.String.format("ConcNode[size=%d]", java.lang.Long.valueOf(count()));
    }
}
