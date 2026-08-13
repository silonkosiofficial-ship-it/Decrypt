package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class C3 extends j$.util.stream.E3 implements j$.util.X, java.util.function.IntConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f48214f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f48214f = i6;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.H3
    protected final j$.util.Spliterator c(j$.util.Spliterator spliterator) {
        return new j$.util.stream.C3((j$.util.X) spliterator, this);
    }

    @Override // j$.util.stream.E3
    protected final void e(java.lang.Object obj) {
        ((java.util.function.IntConsumer) obj).accept(this.f48214f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.stream.E3
    protected final j$.util.stream.AbstractC6786l3 g(int i6) {
        return new j$.util.stream.C6776j3(i6);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.g(this, consumer);
    }
}
