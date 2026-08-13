package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6749e1 implements j$.util.stream.K0 {
    @Override // j$.util.stream.K0
    public j$.util.stream.K0 b(int i6) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return 0L;
    }

    public final void e(java.lang.Object obj) {
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ j$.util.stream.K0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.w(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        return (java.lang.Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int p() {
        return 0;
    }

    public final void q(int i6, java.lang.Object obj) {
    }
}
