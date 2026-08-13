package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6760g2 extends j$.util.stream.AbstractC6770i2 {
    @Override // j$.util.stream.AbstractC6732b
    final boolean M() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC6770i2, j$.util.stream.Stream
    public final void forEach(java.util.function.Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC6770i2, j$.util.stream.Stream
    public final void forEachOrdered(java.util.function.Consumer consumer) {
        if (isParallel()) {
            super.forEachOrdered(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h unordered() {
        return !H() ? this : new j$.util.stream.C6750e2(this, j$.util.stream.EnumC6756f3.f48460r, 1);
    }
}
