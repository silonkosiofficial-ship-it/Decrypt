package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class R3 extends j$.util.stream.AbstractC6765h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ java.util.function.Predicate f48339m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(j$.util.stream.AbstractC6732b abstractC6732b, int i6, java.util.function.Predicate predicate) {
        super(abstractC6732b, i6, 0);
        this.f48339m = predicate;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 K(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        return (j$.util.stream.K0) new j$.util.stream.S3(this, abstractC6732b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator L(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        return j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G()) ? K(abstractC6732b, spliterator, new j$.util.stream.C6816s(29)).spliterator() : new j$.util.stream.U3(abstractC6732b.T(spliterator), this.f48339m, 0);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        return new j$.util.stream.Q3(this, interfaceC6810q2, false);
    }
}
