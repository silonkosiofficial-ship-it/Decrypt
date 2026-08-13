package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
class N0 implements j$.util.stream.K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Object[] f48294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48295b;

    N0(long j6, java.util.function.IntFunction intFunction) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48294a = (java.lang.Object[]) intFunction.apply((int) j6);
        this.f48295b = 0;
    }

    N0(java.lang.Object[] objArr) {
        this.f48294a = objArr;
        this.f48295b = objArr.length;
    }

    @Override // j$.util.stream.K0
    public final j$.util.stream.K0 b(int i6) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f48295b;
    }

    @Override // j$.util.stream.K0
    public final void forEach(java.util.function.Consumer consumer) {
        for (int i6 = 0; i6 < this.f48295b; i6++) {
            consumer.accept(this.f48294a[i6]);
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ j$.util.stream.K0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.w(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void h(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f48294a, 0, objArr, i6, this.f48295b);
    }

    @Override // j$.util.stream.K0
    public final java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        java.lang.Object[] objArr = this.f48294a;
        if (objArr.length == this.f48295b) {
            return objArr;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.m(this.f48294a, 0, this.f48295b);
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = this.f48294a;
        return java.lang.String.format("ArrayNode[%d][%s]", java.lang.Integer.valueOf(objArr.length - this.f48295b), java.util.Arrays.toString(objArr));
    }
}
