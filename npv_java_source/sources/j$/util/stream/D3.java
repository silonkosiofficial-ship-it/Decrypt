package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class D3 extends j$.util.stream.E3 implements j$.util.a0, java.util.function.LongConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f48222f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f48222f = j6;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.H3
    protected final j$.util.Spliterator c(j$.util.Spliterator spliterator) {
        return new j$.util.stream.D3((j$.util.a0) spliterator, this);
    }

    @Override // j$.util.stream.E3
    protected final void e(java.lang.Object obj) {
        ((java.util.function.LongConsumer) obj).accept(this.f48222f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.stream.E3
    protected final j$.util.stream.AbstractC6786l3 g(int i6) {
        return new j$.util.stream.C6781k3(i6);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.h(this, consumer);
    }
}
