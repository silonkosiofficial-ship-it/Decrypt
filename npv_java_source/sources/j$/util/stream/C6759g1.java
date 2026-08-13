package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C6759g1 implements j$.util.stream.G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f48474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48475b;

    C6759g1(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48474a = new int[(int) j6];
        this.f48475b = 0;
    }

    C6759g1(int[] iArr) {
        this.f48474a = iArr;
        this.f48475b = iArr.length;
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
        return this.f48475b;
    }

    @Override // j$.util.stream.J0
    public final java.lang.Object d() {
        int[] iArr = this.f48474a;
        int length = iArr.length;
        int i6 = this.f48475b;
        return length == i6 ? iArr : java.util.Arrays.copyOf(iArr, i6);
    }

    @Override // j$.util.stream.J0
    public final void e(java.lang.Object obj) {
        java.util.function.IntConsumer intConsumer = (java.util.function.IntConsumer) obj;
        for (int i6 = 0; i6 < this.f48475b; i6++) {
            intConsumer.accept(this.f48474a[i6]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.AbstractC6845y0.r(this, consumer);
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
        int i10 = this.f48475b;
        java.lang.System.arraycopy(this.f48474a, 0, (int[]) obj, i6, i10);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(java.lang.Integer[] numArr, int i6) {
        j$.util.stream.AbstractC6845y0.o(this, numArr, i6);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ j$.util.stream.G0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.u(this, j6, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.k(this.f48474a, 0, this.f48475b);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return j$.util.Spliterators.k(this.f48474a, 0, this.f48475b);
    }

    public java.lang.String toString() {
        int[] iArr = this.f48474a;
        return java.lang.String.format("IntArrayNode[%d][%s]", java.lang.Integer.valueOf(iArr.length - this.f48475b), java.util.Arrays.toString(iArr));
    }
}
