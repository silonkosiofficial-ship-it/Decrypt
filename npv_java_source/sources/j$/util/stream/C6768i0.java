package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6768i0 extends j$.util.stream.AbstractC6778k0 {
    @Override // j$.util.stream.AbstractC6732b
    final boolean M() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC6778k0, j$.util.stream.InterfaceC6793n0
    public final void forEach(java.util.function.LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            j$.util.stream.AbstractC6778k0.V(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC6778k0, j$.util.stream.InterfaceC6793n0
    public final void forEachOrdered(java.util.function.LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            j$.util.stream.AbstractC6778k0.V(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.InterfaceC6793n0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.InterfaceC6793n0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h unordered() {
        return !H() ? this : new j$.util.stream.C6840x(this, j$.util.stream.EnumC6756f3.f48460r, 4);
    }
}
