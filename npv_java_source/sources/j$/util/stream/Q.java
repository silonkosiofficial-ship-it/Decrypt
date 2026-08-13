package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Q extends j$.util.stream.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.function.Consumer f48316b;

    Q(java.util.function.Consumer consumer, boolean z6) {
        super(z6);
        this.f48316b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48316b.accept(obj);
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
}
