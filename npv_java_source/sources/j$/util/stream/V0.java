package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class V0 extends j$.util.stream.M0 implements j$.util.stream.J0 {
    @Override // j$.util.stream.J0
    public final java.lang.Object d() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        java.lang.Object objC = c((int) jCount);
        q(0, objC);
        return objC;
    }

    @Override // j$.util.stream.J0
    public final void e(java.lang.Object obj) {
        ((j$.util.stream.J0) this.f48286a).e(obj);
        ((j$.util.stream.J0) this.f48287b).e(obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.m(this, intFunction);
    }

    @Override // j$.util.stream.J0
    public final void q(int i6, java.lang.Object obj) {
        j$.util.stream.K0 k6 = this.f48286a;
        ((j$.util.stream.J0) k6).q(i6, obj);
        ((j$.util.stream.J0) this.f48287b).q(i6 + ((int) ((j$.util.stream.J0) k6).count()), obj);
    }

    public final java.lang.String toString() {
        return count() < 32 ? java.lang.String.format("%s[%s.%s]", getClass().getName(), this.f48286a, this.f48287b) : java.lang.String.format("%s[size=%d]", getClass().getName(), java.lang.Long.valueOf(count()));
    }
}
