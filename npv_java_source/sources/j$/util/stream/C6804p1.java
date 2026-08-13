package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C6804p1 implements j$.util.stream.I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long[] f48530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48531b;

    C6804p1(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48530a = new long[(int) j6];
        this.f48531b = 0;
    }

    C6804p1(long[] jArr) {
        this.f48530a = jArr;
        this.f48531b = jArr.length;
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.stream.J0 b(int i6) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ j$.util.stream.K0 b(int i6) {
        b(i6);
        throw null;
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f48531b;
    }

    @Override // j$.util.stream.J0
    public final java.lang.Object d() {
        long[] jArr = this.f48530a;
        int length = jArr.length;
        int i6 = this.f48531b;
        return length == i6 ? jArr : java.util.Arrays.copyOf(jArr, i6);
    }

    @Override // j$.util.stream.J0
    public final void e(java.lang.Object obj) {
        java.util.function.LongConsumer longConsumer = (java.util.function.LongConsumer) obj;
        for (int i6 = 0; i6 < this.f48531b; i6++) {
            longConsumer.accept(this.f48530a[i6]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.AbstractC6845y0.s(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.m(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public final void q(int i6, java.lang.Object obj) {
        int i10 = this.f48531b;
        java.lang.System.arraycopy(this.f48530a, 0, (long[]) obj, i6, i10);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(java.lang.Long[] lArr, int i6) {
        j$.util.stream.AbstractC6845y0.p(this, lArr, i6);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ j$.util.stream.I0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.v(this, j6, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.l(this.f48530a, 0, this.f48531b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return j$.util.Spliterators.l(this.f48530a, 0, this.f48531b);
    }

    public java.lang.String toString() {
        long[] jArr = this.f48530a;
        return java.lang.String.format("LongArrayNode[%d][%s]", java.lang.Integer.valueOf(jArr.length - this.f48531b), java.util.Arrays.toString(jArr));
    }
}
