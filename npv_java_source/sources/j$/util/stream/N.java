package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class N extends j$.util.stream.S implements j$.util.stream.InterfaceC6795n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.function.DoubleConsumer f48293b;

    N(java.util.function.DoubleConsumer doubleConsumer, boolean z6) {
        super(z6);
        this.f48293b = doubleConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        this.f48293b.accept(d6);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        o((java.lang.Double) obj);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
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

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }
}
