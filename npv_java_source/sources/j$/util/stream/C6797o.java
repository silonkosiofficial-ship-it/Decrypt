package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6797o extends j$.util.stream.AbstractC6765h2 {
    static j$.util.stream.O0 U(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        j$.util.stream.C6807q c6807q = new j$.util.stream.C6807q(19);
        j$.util.stream.C6807q c6807q2 = new j$.util.stream.C6807q(20);
        j$.util.stream.C6807q c6807q3 = new j$.util.stream.C6807q(21);
        j$.util.Objects.requireNonNull(c6807q);
        j$.util.Objects.requireNonNull(c6807q2);
        j$.util.Objects.requireNonNull(c6807q3);
        return new j$.util.stream.O0((java.util.Collection) new j$.util.stream.E1(j$.util.stream.EnumC6761g3.REFERENCE, (java.lang.Object) c6807q3, (java.lang.Object) c6807q2, (java.lang.Object) c6807q, 3).c(abstractC6732b, spliterator));
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 K(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.EnumC6756f3.DISTINCT.u(abstractC6732b.G())) {
            return abstractC6732b.y(spliterator, false, intFunction);
        }
        if (j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G())) {
            return U(abstractC6732b, spliterator);
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
        j$.util.stream.C6803p0 c6803p0 = new j$.util.stream.C6803p0(2, atomicBoolean, concurrentHashMap);
        j$.util.Objects.requireNonNull(c6803p0);
        new j$.util.stream.Q(c6803p0, false).e(abstractC6732b, spliterator);
        java.util.Set setKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            java.util.HashSet hashSet = new java.util.HashSet(setKeySet);
            hashSet.add(null);
            setKeySet = hashSet;
        }
        return new j$.util.stream.O0(setKeySet);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator L(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        if (j$.util.stream.EnumC6756f3.DISTINCT.u(abstractC6732b.G())) {
            return abstractC6732b.T(spliterator);
        }
        return j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G()) ? U(abstractC6732b, spliterator).spliterator() : new j$.util.stream.C6801o3(abstractC6732b.T(spliterator));
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        j$.util.Objects.requireNonNull(interfaceC6810q2);
        if (j$.util.stream.EnumC6756f3.DISTINCT.u(i6)) {
            return interfaceC6810q2;
        }
        return j$.util.stream.EnumC6756f3.SORTED.u(i6) ? new j$.util.stream.C6787m(interfaceC6810q2) : new j$.util.stream.C6792n(interfaceC6810q2);
    }
}
