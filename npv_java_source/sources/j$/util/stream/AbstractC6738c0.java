package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6738c0 extends j$.util.stream.AbstractC6732b implements j$.util.stream.IntStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.X V(j$.util.Spliterator spliterator) {
        if (spliterator instanceof j$.util.X) {
            return (j$.util.X) spliterator;
        }
        if (!j$.util.stream.O3.f48308a) {
            throw new java.lang.UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        j$.util.stream.O3.a(j$.util.stream.AbstractC6732b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 B(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.G(abstractC6732b, spliterator, z6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final boolean D(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        java.util.function.IntConsumer v6;
        boolean zM;
        j$.util.X xV = V(spliterator);
        if (interfaceC6810q2 instanceof java.util.function.IntConsumer) {
            v6 = (java.util.function.IntConsumer) interfaceC6810q2;
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(j$.util.stream.AbstractC6732b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            j$.util.Objects.requireNonNull(interfaceC6810q2);
            v6 = new j$.util.stream.V(interfaceC6810q2);
        }
        do {
            zM = interfaceC6810q2.m();
            if (zM) {
                break;
            }
        } while (xV.tryAdvance(v6));
        return zM;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.EnumC6761g3 E() {
        return j$.util.stream.EnumC6761g3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.C0 J(long j6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.S(j6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator Q(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.Supplier supplier, boolean z6) {
        return new j$.util.stream.C6820s3(abstractC6732b, supplier, z6);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream a() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6836w(this, j$.util.stream.EnumC6756f3.f48462t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.F asDoubleStream() {
        return new j$.util.stream.C6848z(this, 0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.InterfaceC6793n0 asLongStream() {
        return new j$.util.stream.C6840x(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C6858z average() {
        long[] jArr = (long[]) collect(new j$.util.stream.C6816s(14), new j$.util.stream.C6816s(15), new j$.util.stream.C6816s(16));
        long j6 = jArr[0];
        return j6 > 0 ? j$.util.C6858z.d(jArr[1] / j6) : j$.util.C6858z.a();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.Stream boxed() {
        return new j$.util.stream.C6826u(this, 0, new j$.util.stream.C6816s(8), 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream c() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6836w(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.stream.r rVar = new j$.util.stream.r(biConsumer, 1);
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(objIntConsumer);
        j$.util.Objects.requireNonNull(rVar);
        return z(new j$.util.stream.E1(j$.util.stream.EnumC6761g3.INT_VALUE, (java.util.function.BinaryOperator) rVar, (java.lang.Object) objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((java.lang.Long) z(new j$.util.stream.G1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.F d() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6848z(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 3);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream distinct() {
        return ((j$.util.stream.AbstractC6770i2) ((j$.util.stream.AbstractC6770i2) boxed()).distinct()).mapToInt(new j$.util.stream.C6816s(7));
    }

    @Override // j$.util.stream.IntStream
    public final boolean e() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.Z(j$.util.stream.EnumC6832v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A findAny() {
        return (j$.util.A) z(j$.util.stream.I.f48256d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A findFirst() {
        return (j$.util.A) z(j$.util.stream.I.f48255c);
    }

    public void forEach(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        z(new j$.util.stream.O(intConsumer, false));
    }

    public void forEachOrdered(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        z(new j$.util.stream.O(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.InterfaceC6793n0 i() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6840x(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 2);
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final j$.util.J iterator() {
        return j$.util.Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream limit(long j6) {
        if (j6 >= 0) {
            return j$.util.stream.AbstractC6845y0.Y(this, 0L, j6);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream m(j$.util.stream.Q0 q6) {
        j$.util.Objects.requireNonNull(q6);
        return new j$.util.stream.X(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n | j$.util.stream.EnumC6756f3.f48462t, q6, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
        j$.util.Objects.requireNonNull(intFunction);
        return new j$.util.stream.C6826u(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A max() {
        return reduce(new j$.util.stream.C6816s(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A min() {
        return reduce(new j$.util.stream.C6816s(9));
    }

    @Override // j$.util.stream.IntStream
    public final boolean o() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.Z(j$.util.stream.EnumC6832v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        return new j$.util.stream.X(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.Z(j$.util.stream.EnumC6832v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i6, java.util.function.IntBinaryOperator intBinaryOperator) {
        j$.util.Objects.requireNonNull(intBinaryOperator);
        return ((java.lang.Integer) z(new j$.util.stream.P1(j$.util.stream.EnumC6761g3.INT_VALUE, intBinaryOperator, i6))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A reduce(java.util.function.IntBinaryOperator intBinaryOperator) {
        j$.util.Objects.requireNonNull(intBinaryOperator);
        return (j$.util.A) z(new j$.util.stream.C1(j$.util.stream.EnumC6761g3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : j$.util.stream.AbstractC6845y0.Y(this, j6, -1L);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream sorted() {
        return new j$.util.stream.J2(this, j$.util.stream.EnumC6756f3.f48459q | j$.util.stream.EnumC6756f3.f48457o, 0);
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h
    public final j$.util.X spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new j$.util.stream.C6816s(12));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C6855w summaryStatistics() {
        return (j$.util.C6855w) collect(new j$.util.stream.C6807q(17), new j$.util.stream.C6816s(10), new j$.util.stream.C6816s(11));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) j$.util.stream.AbstractC6845y0.P((j$.util.stream.G0) A(new j$.util.stream.C6816s(6))).d();
    }
}
