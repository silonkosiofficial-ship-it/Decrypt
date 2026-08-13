package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class J2 extends j$.util.stream.AbstractC6733b0 {
    @Override // j$.util.stream.AbstractC6732b
    public final j$.util.stream.K0 K(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.EnumC6756f3.SORTED.u(abstractC6732b.G())) {
            return abstractC6732b.y(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((j$.util.stream.G0) abstractC6732b.y(spliterator, true, intFunction)).d();
        java.util.Arrays.sort(iArr);
        return new j$.util.stream.C6759g1(iArr);
    }

    @Override // j$.util.stream.AbstractC6732b
    public final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        j$.util.Objects.requireNonNull(interfaceC6810q2);
        if (j$.util.stream.EnumC6756f3.SORTED.u(i6)) {
            return interfaceC6810q2;
        }
        return j$.util.stream.EnumC6756f3.SIZED.u(i6) ? new j$.util.stream.O2(interfaceC6810q2) : new j$.util.stream.G2(interfaceC6810q2);
    }
}
