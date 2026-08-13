package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class P extends j$.util.stream.S implements j$.util.stream.InterfaceC6805p2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.function.LongConsumer f48309b;

    P(java.util.function.LongConsumer longConsumer, boolean z6) {
        super(z6);
        this.f48309b = longConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f48309b.accept(j6);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.L3
    public final java.lang.Object b(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        abstractC6732b.R(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.L3
    public final /* bridge */ /* synthetic */ java.lang.Object c(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        e(abstractC6732b, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }
}
