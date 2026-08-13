package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class A extends j$.util.stream.C {
    @Override // j$.util.stream.AbstractC6732b
    final boolean M() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEach(doubleConsumer);
        } else {
            j$.util.stream.C.V(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEachOrdered(doubleConsumer);
        } else {
            j$.util.stream.C.V(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.F parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.F sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h unordered() {
        return !H() ? this : new j$.util.stream.C6848z(this, j$.util.stream.EnumC6756f3.f48460r, 0);
    }
}
