package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class L2 extends j$.util.stream.AbstractC6765h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f48282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.util.Comparator f48283n;

    L2(j$.util.stream.AbstractC6732b abstractC6732b) {
        super(abstractC6732b, j$.util.stream.EnumC6756f3.f48459q | j$.util.stream.EnumC6756f3.f48457o, 0);
        this.f48282m = true;
        this.f48283n = j$.util.Comparator.CC.a();
    }

    L2(j$.util.stream.AbstractC6732b abstractC6732b, java.util.Comparator comparator) {
        super(abstractC6732b, j$.util.stream.EnumC6756f3.f48459q | j$.util.stream.EnumC6756f3.f48458p, 0);
        this.f48282m = false;
        this.f48283n = (java.util.Comparator) j$.util.Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC6732b
    public final j$.util.stream.K0 K(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.EnumC6756f3.SORTED.u(abstractC6732b.G()) && this.f48282m) {
            return abstractC6732b.y(spliterator, false, intFunction);
        }
        java.lang.Object[] objArrN = abstractC6732b.y(spliterator, true, intFunction).n(intFunction);
        java.util.Arrays.sort(objArrN, this.f48283n);
        return new j$.util.stream.N0(objArrN);
    }

    @Override // j$.util.stream.AbstractC6732b
    public final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        j$.util.Objects.requireNonNull(interfaceC6810q2);
        if (j$.util.stream.EnumC6756f3.SORTED.u(i6) && this.f48282m) {
            return interfaceC6810q2;
        }
        boolean zU = j$.util.stream.EnumC6756f3.SIZED.u(i6);
        java.util.Comparator comparator = this.f48283n;
        return zU ? new j$.util.stream.Q2(interfaceC6810q2, comparator) : new j$.util.stream.M2(interfaceC6810q2, comparator);
    }
}
