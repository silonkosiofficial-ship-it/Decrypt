package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class O extends j$.util.stream.S implements j$.util.stream.InterfaceC6800o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.function.IntConsumer f48301b;

    O(java.util.function.IntConsumer intConsumer, boolean z6) {
        super(z6);
        this.f48301b = intConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        this.f48301b.accept(i6);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        l((java.lang.Integer) obj);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
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

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        j$.util.stream.AbstractC6845y0.g(this, num);
    }
}
