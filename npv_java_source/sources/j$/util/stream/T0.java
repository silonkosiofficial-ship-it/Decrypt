package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class T0 extends j$.util.stream.V0 implements j$.util.stream.G0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(java.lang.Integer[] numArr, int i6) {
        j$.util.stream.AbstractC6845y0.o(this, numArr, i6);
    }

    @Override // j$.util.stream.J0
    public final java.lang.Object c(int i6) {
        return new int[i6];
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ j$.util.stream.G0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.u(this, j6, j10);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.AbstractC6845y0.r(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final j$.util.Spliterator spliterator() {
        return new j$.util.stream.C6779k1(this);
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return new j$.util.stream.C6779k1(this);
    }
}
