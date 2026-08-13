package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class G implements j$.util.stream.L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f48236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Object f48237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.function.Predicate f48238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.util.function.Supplier f48239d;

    G(boolean z6, j$.util.stream.EnumC6761g3 enumC6761g3, java.lang.Object obj, java.util.function.Predicate predicate, java.util.function.Supplier supplier) {
        this.f48236a = (z6 ? 0 : j$.util.stream.EnumC6756f3.f48460r) | j$.util.stream.EnumC6756f3.f48463u;
        this.f48237b = obj;
        this.f48238c = predicate;
        this.f48239d = supplier;
    }

    @Override // j$.util.stream.L3
    public final java.lang.Object b(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        j$.util.stream.M3 m6 = (j$.util.stream.M3) this.f48239d.get();
        abstractC6732b.R(spliterator, m6);
        java.lang.Object obj = m6.get();
        return obj != null ? obj : this.f48237b;
    }

    @Override // j$.util.stream.L3
    public final java.lang.Object c(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        return new j$.util.stream.M(this, j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G()), abstractC6732b, spliterator).invoke();
    }

    @Override // j$.util.stream.L3
    public final int d() {
        return this.f48236a;
    }
}
