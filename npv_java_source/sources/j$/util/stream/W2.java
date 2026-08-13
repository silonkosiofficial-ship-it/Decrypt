package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class W2 extends j$.util.stream.Y2 implements j$.util.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.X2 f48386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W2(j$.util.stream.X2 x6, int i6, int i10, int i11, int i12) {
        super(x6, i6, i10, i11, i12);
        this.f48386g = x6;
    }

    @Override // j$.util.stream.Y2
    final void a(int i6, java.lang.Object obj, java.lang.Object obj2) {
        ((java.util.function.LongConsumer) obj2).accept(((long[]) obj)[i6]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.d0 b(java.lang.Object obj, int i6, int i10) {
        return j$.util.Spliterators.l((long[]) obj, i6, i10 + i6);
    }

    @Override // j$.util.stream.Y2
    final j$.util.d0 c(int i6, int i10, int i11, int i12) {
        return new j$.util.stream.W2(this.f48386g, i6, i10, i11, i12);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.h(this, consumer);
    }
}
