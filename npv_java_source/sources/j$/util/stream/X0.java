package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
class X0 implements j$.util.stream.E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double[] f48389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48390b;

    X0(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48389a = new double[(int) j6];
        this.f48390b = 0;
    }

    X0(double[] dArr) {
        this.f48389a = dArr;
        this.f48390b = dArr.length;
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
        return this.f48390b;
    }

    @Override // j$.util.stream.J0
    public final java.lang.Object d() {
        double[] dArr = this.f48389a;
        int length = dArr.length;
        int i6 = this.f48390b;
        return length == i6 ? dArr : java.util.Arrays.copyOf(dArr, i6);
    }

    @Override // j$.util.stream.J0
    public final void e(java.lang.Object obj) {
        java.util.function.DoubleConsumer doubleConsumer = (java.util.function.DoubleConsumer) obj;
        for (int i6 = 0; i6 < this.f48390b; i6++) {
            doubleConsumer.accept(this.f48389a[i6]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.AbstractC6845y0.q(this, consumer);
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
        int i10 = this.f48390b;
        java.lang.System.arraycopy(this.f48389a, 0, (double[]) obj, i6, i10);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(java.lang.Double[] dArr, int i6) {
        j$.util.stream.AbstractC6845y0.n(this, dArr, i6);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ j$.util.stream.E0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.t(this, j6, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.j(this.f48389a, 0, this.f48390b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return j$.util.Spliterators.j(this.f48389a, 0, this.f48390b);
    }

    public java.lang.String toString() {
        double[] dArr = this.f48389a;
        return java.lang.String.format("DoubleArrayNode[%d][%s]", java.lang.Integer.valueOf(dArr.length - this.f48390b), java.util.Arrays.toString(dArr));
    }
}
