package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6728a0 extends j$.util.stream.AbstractC6738c0 {
    @Override // j$.util.stream.AbstractC6732b
    final boolean M() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC6738c0, j$.util.stream.IntStream
    public final void forEach(java.util.function.IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEach(intConsumer);
        } else {
            j$.util.stream.AbstractC6738c0.V(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC6738c0, j$.util.stream.IntStream
    public final void forEachOrdered(java.util.function.IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
        } else {
            j$.util.stream.AbstractC6738c0.V(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h unordered() {
        return !H() ? this : new j$.util.stream.C6836w(this, j$.util.stream.EnumC6756f3.f48460r, 2);
    }
}
