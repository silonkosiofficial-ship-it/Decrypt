package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class B3 extends j$.util.stream.E3 implements j$.util.U, java.util.function.DoubleConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double f48210f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f48210f = d6;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.H3
    protected final j$.util.Spliterator c(j$.util.Spliterator spliterator) {
        return new j$.util.stream.B3((j$.util.U) spliterator, this);
    }

    @Override // j$.util.stream.E3
    protected final void e(java.lang.Object obj) {
        ((java.util.function.DoubleConsumer) obj).accept(this.f48210f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.stream.E3
    protected final j$.util.stream.AbstractC6786l3 g(int i6) {
        return new j$.util.stream.C6771i3(i6);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }
}
