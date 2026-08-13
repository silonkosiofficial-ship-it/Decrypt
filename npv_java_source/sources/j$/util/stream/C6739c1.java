package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6739c1 extends j$.util.stream.AbstractC6749e1 implements j$.util.stream.I0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(java.lang.Long[] lArr, int i6) {
        j$.util.stream.AbstractC6845y0.p(this, lArr, i6);
    }

    @Override // j$.util.stream.AbstractC6749e1, j$.util.stream.K0
    public final j$.util.stream.J0 b(int i6) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC6749e1, j$.util.stream.K0
    public final /* bridge */ /* synthetic */ j$.util.stream.K0 b(int i6) {
        b(i6);
        throw null;
    }

    @Override // j$.util.stream.J0
    public final java.lang.Object d() {
        return j$.util.stream.AbstractC6845y0.f48597f;
    }

    @Override // j$.util.stream.AbstractC6749e1, j$.util.stream.K0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ j$.util.stream.I0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.v(this, j6, j10);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.AbstractC6845y0.s(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.d();
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return j$.util.Spliterators.d();
    }
}
