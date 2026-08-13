package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class C extends j$.util.stream.AbstractC6732b implements j$.util.stream.F {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.U V(j$.util.Spliterator spliterator) {
        if (spliterator instanceof j$.util.U) {
            return (j$.util.U) spliterator;
        }
        if (!j$.util.stream.O3.f48308a) {
            throw new java.lang.UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        j$.util.stream.O3.a(j$.util.stream.AbstractC6732b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 B(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.F(abstractC6732b, spliterator, z6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final boolean D(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        java.util.function.DoubleConsumer c6802p;
        boolean zM;
        j$.util.U uV = V(spliterator);
        if (interfaceC6810q2 instanceof java.util.function.DoubleConsumer) {
            c6802p = (java.util.function.DoubleConsumer) interfaceC6810q2;
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(j$.util.stream.AbstractC6732b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            j$.util.Objects.requireNonNull(interfaceC6810q2);
            c6802p = new j$.util.stream.C6802p(interfaceC6810q2);
        }
        do {
            zM = interfaceC6810q2.m();
            if (zM) {
                break;
            }
        } while (uV.tryAdvance(c6802p));
        return zM;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.EnumC6761g3 E() {
        return j$.util.stream.EnumC6761g3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.C0 J(long j6, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.J(j6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator Q(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.Supplier supplier, boolean z6) {
        return new j$.util.stream.C6811q3(abstractC6732b, supplier, z6);
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F a() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6848z(this, j$.util.stream.EnumC6756f3.f48462t, 1);
    }

    @Override // j$.util.stream.F
    public final j$.util.C6858z average() {
        double[] dArr = (double[]) collect(new j$.util.stream.C6807q(23), new j$.util.stream.C6807q(1), new j$.util.stream.C6807q(2));
        if (dArr[2] <= 0.0d) {
            return j$.util.C6858z.a();
        }
        java.util.Set set = j$.util.stream.AbstractC6782l.f48502a;
        double d6 = dArr[0] + dArr[1];
        double d10 = dArr[dArr.length - 1];
        if (java.lang.Double.isNaN(d6) && java.lang.Double.isInfinite(d10)) {
            d6 = d10;
        }
        return j$.util.C6858z.d(d6 / dArr[2]);
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F b(j$.util.stream.C6727a c6727a) {
        j$.util.Objects.requireNonNull(c6727a);
        return new j$.util.stream.C6831v(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n | j$.util.stream.EnumC6756f3.f48462t, c6727a, 1);
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.Stream boxed() {
        return new j$.util.stream.C6826u(this, 0, new j$.util.stream.C6807q(26), 0);
    }

    @Override // j$.util.stream.F
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer) {
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.stream.r rVar = new j$.util.stream.r(biConsumer, 0);
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(objDoubleConsumer);
        j$.util.Objects.requireNonNull(rVar);
        return z(new j$.util.stream.E1(j$.util.stream.EnumC6761g3.DOUBLE_VALUE, (java.util.function.BinaryOperator) rVar, (java.lang.Object) objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.F
    public final long count() {
        return ((java.lang.Long) z(new j$.util.stream.G1(1))).longValue();
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F distinct() {
        return ((j$.util.stream.AbstractC6770i2) ((j$.util.stream.AbstractC6770i2) boxed()).distinct()).mapToDouble(new j$.util.stream.C6807q(27));
    }

    @Override // j$.util.stream.F
    public final boolean f() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.X(j$.util.stream.EnumC6832v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.F
    public final j$.util.C6858z findAny() {
        return (j$.util.C6858z) z(j$.util.stream.H.f48244d);
    }

    @Override // j$.util.stream.F
    public final j$.util.C6858z findFirst() {
        return (j$.util.C6858z) z(j$.util.stream.H.f48243c);
    }

    public void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        z(new j$.util.stream.N(doubleConsumer, false));
    }

    public void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        z(new j$.util.stream.N(doubleConsumer, true));
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.InterfaceC6793n0 g() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6840x(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 0);
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final j$.util.F iterator() {
        return j$.util.Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.F
    public final boolean l() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.X(j$.util.stream.EnumC6832v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F limit(long j6) {
        if (j6 >= 0) {
            return j$.util.stream.AbstractC6845y0.W(this, 0L, j6);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F map(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        j$.util.Objects.requireNonNull(doubleUnaryOperator);
        return new j$.util.stream.C6831v(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction) {
        j$.util.Objects.requireNonNull(doubleFunction);
        return new j$.util.stream.C6826u(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, doubleFunction, 0);
    }

    @Override // j$.util.stream.F
    public final j$.util.C6858z max() {
        return reduce(new j$.util.stream.C6807q(29));
    }

    @Override // j$.util.stream.F
    public final j$.util.C6858z min() {
        return reduce(new j$.util.stream.C6807q(22));
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F peek(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        return new j$.util.stream.C6831v(this, doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.IntStream q() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.C6836w(this, j$.util.stream.EnumC6756f3.f48458p | j$.util.stream.EnumC6756f3.f48456n, 0);
    }

    @Override // j$.util.stream.F
    public final double reduce(double d6, java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        j$.util.Objects.requireNonNull(doubleBinaryOperator);
        return ((java.lang.Double) z(new j$.util.stream.I1(j$.util.stream.EnumC6761g3.DOUBLE_VALUE, doubleBinaryOperator, d6))).doubleValue();
    }

    @Override // j$.util.stream.F
    public final j$.util.C6858z reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        j$.util.Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.C6858z) z(new j$.util.stream.C1(j$.util.stream.EnumC6761g3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : j$.util.stream.AbstractC6845y0.W(this, j6, -1L);
        }
        throw new java.lang.IllegalArgumentException(java.lang.Long.toString(j6));
    }

    @Override // j$.util.stream.F
    public final j$.util.stream.F sorted() {
        return new j$.util.stream.I2(this, j$.util.stream.EnumC6756f3.f48459q | j$.util.stream.EnumC6756f3.f48457o, 0);
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h
    public final j$.util.U spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.F
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.util.stream.C6816s(0), new j$.util.stream.C6807q(3), new j$.util.stream.C6807q(0));
        java.util.Set set = j$.util.stream.AbstractC6782l.f48502a;
        double d6 = dArr[0] + dArr[1];
        double d10 = dArr[dArr.length - 1];
        return (java.lang.Double.isNaN(d6) && java.lang.Double.isInfinite(d10)) ? d10 : d6;
    }

    @Override // j$.util.stream.F
    public final j$.util.C6854v summaryStatistics() {
        return (j$.util.C6854v) collect(new j$.util.stream.C6807q(16), new j$.util.stream.C6807q(24), new j$.util.stream.C6807q(25));
    }

    @Override // j$.util.stream.F
    public final double[] toArray() {
        return (double[]) j$.util.stream.AbstractC6845y0.O((j$.util.stream.E0) A(new j$.util.stream.C6807q(28))).d();
    }

    @Override // j$.util.stream.F
    public final boolean u() {
        return ((java.lang.Boolean) z(j$.util.stream.AbstractC6845y0.X(j$.util.stream.EnumC6832v0.NONE))).booleanValue();
    }
}
