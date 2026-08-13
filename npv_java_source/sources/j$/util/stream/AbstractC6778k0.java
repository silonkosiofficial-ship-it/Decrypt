package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6778k0 extends j$.util.stream.AbstractC6732b implements j$.util.stream.InterfaceC6793n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.a0 V(j$.util.Spliterator spliterator) {
        if (spliterator instanceof j$.util.a0) {
            return (j$.util.a0) spliterator;
        }
        if (!j$.util.stream.O3.f48308a) {
            throw new java.lang.UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        j$.util.stream.O3.a(j$.util.stream.AbstractC6732b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 B(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.H(abstractC6732b, spliterator, z6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final boolean D(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        java.util.function.LongConsumer c6743d0;
        boolean zM;
        j$.util.a0 a0VarV = V(spliterator);
        if (interfaceC6810q2 instanceof java.util.function.LongConsumer) {
            c6743d0 = (java.util.function.LongConsumer) interfaceC6810q2;
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(j$.util.stream.AbstractC6732b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            j$.util.Objects.requireNonNull(interfaceC6810q2);
            c6743d0 = new j$.util.stream.C6743d0(interfaceC6810q2);
        }
        do {
            zM = interfaceC6810q2.m();
            if (zM) {
                break;
            }
        } while (a0VarV.tryAdvance(c6743d0));
        return zM;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.EnumC6761g3 E() {
        return j$.util.stream.EnumC6761g3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.C0 J(long j6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.U(j6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator Q(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.Supplier supplier, boolean z6) {
        return new j$.util.stream.C6830u3(abstractC6732b, supplier, z6);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 a() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6840x(this, j$.util.stream.EnumC6756f3.f48462t, 5);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.F asDoubleStream() {
        return new j$.util.stream.C6848z(this, j$.util.stream.EnumC6756f3.f48456n, 4);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.C6858z average() {
        long[] jArr = (long[]) collect(new j$.util.stream.C6816s(23), new j$.util.stream.C6816s(24), new j$.util.stream.C6816s(25));
        long j6 = jArr[0];
        return j6 > 0 ? j$.util.C6858z.d(jArr[1] / j6) : j$.util.C6858z.a();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 b(j$.util.stream.C6727a c6727a) {
        j$.util.Objects.requireNonNull(c6727a);
        return new j$.util.stream.C6763h0(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n | j$.util.stream.EnumC6756f3.f48462t, c6727a, 0);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.Stream boxed() {
        return new j$.util.stream.C6826u(this, 0, new j$.util.stream.C6816s(22), 2);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 c() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6840x(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 3);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer) {
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.stream.r rVar = new j$.util.stream.r(biConsumer, 2);
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(objLongConsumer);
        j$.util.Objects.requireNonNull(rVar);
        return z(new j$.util.stream.E1(j$.util.stream.EnumC6761g3.LONG_VALUE, (java.util.function.BinaryOperator) rVar, (java.lang.Object) objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final long count() {
        return ((java.lang.Long) z(new j$.util.stream.G1(0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 distinct() {
        return ((j$.util.stream.AbstractC6770i2) ((j$.util.stream.AbstractC6770i2) boxed()).distinct()).mapToLong(new j$.util.stream.C6816s(19));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.B findAny() {
        return (j$.util.B) z(j$.util.stream.J.f48264d);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.B findFirst() {
        return (j$.util.B) z(j$.util.stream.J.f48263c);
    }

    public void forEach(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        z(new j$.util.stream.P(longConsumer, false));
    }

    public void forEachOrdered(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        z(new j$.util.stream.P(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.F h() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6848z(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 5);
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final j$.util.N iterator() {
        return j$.util.Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final boolean j() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.b0(j$.util.stream.EnumC6832v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 limit(long j6) {
        if (j6 >= 0) {
            return j$.util.stream.AbstractC6845y0.a0(this, 0L, j6);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction) {
        j$.util.Objects.requireNonNull(longFunction);
        return new j$.util.stream.C6826u(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.B max() {
        return reduce(new j$.util.stream.C6816s(26));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.B min() {
        return reduce(new j$.util.stream.C6816s(18));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final boolean n() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.b0(j$.util.stream.EnumC6832v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 peek(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        return new j$.util.stream.C6763h0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final long reduce(long j6, java.util.function.LongBinaryOperator longBinaryOperator) {
        j$.util.Objects.requireNonNull(longBinaryOperator);
        return ((java.lang.Long) z(new j$.util.stream.A1(j$.util.stream.EnumC6761g3.LONG_VALUE, longBinaryOperator, j6))).longValue();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.B reduce(java.util.function.LongBinaryOperator longBinaryOperator) {
        j$.util.Objects.requireNonNull(longBinaryOperator);
        return (j$.util.B) z(new j$.util.stream.C1(j$.util.stream.EnumC6761g3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final boolean s() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.b0(j$.util.stream.EnumC6832v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : j$.util.stream.AbstractC6845y0.a0(this, j6, -1L);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.InterfaceC6793n0 sorted() {
        return new j$.util.stream.K2(this, j$.util.stream.EnumC6756f3.f48459q | j$.util.stream.EnumC6756f3.f48457o, 0);
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h
    public final j$.util.a0 spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final long sum() {
        return reduce(0L, new j$.util.stream.C6816s(27));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.C6857y summaryStatistics() {
        return (j$.util.C6857y) collect(new j$.util.stream.C6807q(18), new j$.util.stream.C6816s(17), new j$.util.stream.C6816s(20));
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final j$.util.stream.IntStream t() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6836w(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 4);
    }

    @Override // j$.util.stream.InterfaceC6793n0
    public final long[] toArray() {
        return (long[]) j$.util.stream.AbstractC6845y0.Q((j$.util.stream.I0) A(new j$.util.stream.C6816s(21))).d();
    }
}
