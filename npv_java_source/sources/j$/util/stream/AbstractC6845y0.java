package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6845y0 implements j$.util.stream.L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.util.stream.C6744d1 f48592a = new j$.util.stream.C6744d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j$.util.stream.G0 f48593b = new j$.util.stream.C6734b1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j$.util.stream.I0 f48594c = new j$.util.stream.C6739c1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j$.util.stream.E0 f48595d = new j$.util.stream.C6729a1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f48596e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f48597f = new long[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double[] f48598g = new double[0];

    AbstractC6845y0(j$.util.stream.EnumC6761g3 enumC6761g3) {
    }

    static long A(long j6, long j10, long j11) {
        if (j6 >= 0) {
            return java.lang.Math.max(-1L, java.lang.Math.min(j6 - j10, j11));
        }
        return -1L;
    }

    static long B(long j6, long j10) {
        long j11 = j10 >= 0 ? j6 + j10 : Long.MAX_VALUE;
        if (j11 >= 0) {
            return j11;
        }
        return Long.MAX_VALUE;
    }

    static j$.util.Spliterator C(j$.util.stream.EnumC6761g3 enumC6761g3, j$.util.Spliterator spliterator, long j6, long j10) {
        long j11 = j10 >= 0 ? j6 + j10 : Long.MAX_VALUE;
        long j12 = j11 >= 0 ? j11 : Long.MAX_VALUE;
        int i6 = j$.util.stream.AbstractC6851z2.f48606a[enumC6761g3.ordinal()];
        if (i6 == 1) {
            return new j$.util.stream.z3(spliterator, j6, j12);
        }
        if (i6 == 2) {
            return new j$.util.stream.w3((j$.util.X) spliterator, j6, j12);
        }
        if (i6 == 3) {
            return new j$.util.stream.x3((j$.util.a0) spliterator, j6, j12);
        }
        if (i6 == 4) {
            return new j$.util.stream.C6835v3((j$.util.U) spliterator, j6, j12);
        }
        throw new java.lang.IllegalStateException("Unknown shape " + enumC6761g3);
    }

    static j$.util.stream.C0 D(long j6, java.util.function.IntFunction intFunction) {
        return (j6 < 0 || j6 >= 2147483639) ? new j$.util.stream.C6842x1() : new j$.util.stream.C6754f1(j6, intFunction);
    }

    public static j$.util.stream.K0 E(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6, java.util.function.IntFunction intFunction) {
        long jC = abstractC6732b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.Q0 q6 = new j$.util.stream.Q0();
            q6.f48317a = intFunction;
            j$.util.stream.K0 k6 = (j$.util.stream.K0) new j$.util.stream.P0(abstractC6732b, spliterator, q6, new j$.util.stream.C6807q(14), 3).invoke();
            return z6 ? N(k6, intFunction) : k6;
        }
        if (jC >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) jC);
        new j$.util.stream.C6833v1(spliterator, abstractC6732b, objArr).invoke();
        return new j$.util.stream.N0(objArr);
    }

    public static j$.util.stream.E0 F(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6) {
        long jC = abstractC6732b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.E0 e6 = (j$.util.stream.E0) new j$.util.stream.P0(abstractC6732b, spliterator, new j$.util.stream.C6807q(8), new j$.util.stream.C6807q(9), 0).invoke();
            return z6 ? O(e6) : e6;
        }
        if (jC >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jC];
        new j$.util.stream.C6818s1(spliterator, abstractC6732b, dArr).invoke();
        return new j$.util.stream.X0(dArr);
    }

    public static j$.util.stream.G0 G(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6) {
        long jC = abstractC6732b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.G0 g6 = (j$.util.stream.G0) new j$.util.stream.P0(abstractC6732b, spliterator, new j$.util.stream.C6807q(10), new j$.util.stream.C6807q(11), 1).invoke();
            return z6 ? P(g6) : g6;
        }
        if (jC >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jC];
        new j$.util.stream.C6823t1(spliterator, abstractC6732b, iArr).invoke();
        return new j$.util.stream.C6759g1(iArr);
    }

    public static j$.util.stream.I0 H(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6) {
        long jC = abstractC6732b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.I0 i6 = (j$.util.stream.I0) new j$.util.stream.P0(abstractC6732b, spliterator, new j$.util.stream.C6807q(12), new j$.util.stream.C6807q(13), 2).invoke();
            return z6 ? Q(i6) : i6;
        }
        if (jC >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jC];
        new j$.util.stream.C6828u1(spliterator, abstractC6732b, jArr).invoke();
        return new j$.util.stream.C6804p1(jArr);
    }

    static j$.util.stream.M0 I(j$.util.stream.EnumC6761g3 enumC6761g3, j$.util.stream.K0 k6, j$.util.stream.K0 k10) {
        int i6 = j$.util.stream.L0.f48277a[enumC6761g3.ordinal()];
        if (i6 == 1) {
            return new j$.util.stream.W0(k6, k10);
        }
        if (i6 == 2) {
            return new j$.util.stream.T0((j$.util.stream.G0) k6, (j$.util.stream.G0) k10);
        }
        if (i6 == 3) {
            return new j$.util.stream.U0((j$.util.stream.I0) k6, (j$.util.stream.I0) k10);
        }
        if (i6 == 4) {
            return new j$.util.stream.S0((j$.util.stream.E0) k6, (j$.util.stream.E0) k10);
        }
        throw new java.lang.IllegalStateException("Unknown shape " + enumC6761g3);
    }

    static j$.util.stream.InterfaceC6849z0 J(long j6) {
        return (j6 < 0 || j6 >= 2147483639) ? new j$.util.stream.Z0() : new j$.util.stream.Y0(j6);
    }

    public static j$.util.stream.F K(j$.util.U u6) {
        return new j$.util.stream.A(u6, j$.util.stream.EnumC6756f3.q(u6), false);
    }

    static j$.util.stream.AbstractC6749e1 L(j$.util.stream.EnumC6761g3 enumC6761g3) {
        j$.util.stream.K0 k6;
        int i6 = j$.util.stream.L0.f48277a[enumC6761g3.ordinal()];
        if (i6 == 1) {
            return f48592a;
        }
        if (i6 == 2) {
            k6 = f48593b;
        } else if (i6 == 3) {
            k6 = f48594c;
        } else {
            if (i6 != 4) {
                throw new java.lang.IllegalStateException("Unknown shape " + enumC6761g3);
            }
            k6 = f48595d;
        }
        return (j$.util.stream.AbstractC6749e1) k6;
    }

    private static int M(long j6) {
        return (j6 != -1 ? j$.util.stream.EnumC6756f3.f48463u : 0) | j$.util.stream.EnumC6756f3.f48462t;
    }

    public static j$.util.stream.K0 N(j$.util.stream.K0 k6, java.util.function.IntFunction intFunction) {
        if (k6.p() <= 0) {
            return k6;
        }
        long jCount = k6.count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) jCount);
        new j$.util.stream.C6850z1(k6, objArr, 1).invoke();
        return new j$.util.stream.N0(objArr);
    }

    public static j$.util.stream.E0 O(j$.util.stream.E0 e6) {
        if (e6.p() <= 0) {
            return e6;
        }
        long jCount = e6.count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new j$.util.stream.C6846y1(e6, dArr, 0).invoke();
        return new j$.util.stream.X0(dArr);
    }

    public static j$.util.stream.G0 P(j$.util.stream.G0 g6) {
        if (g6.p() <= 0) {
            return g6;
        }
        long jCount = g6.count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new j$.util.stream.C6846y1(g6, iArr, 0).invoke();
        return new j$.util.stream.C6759g1(iArr);
    }

    public static j$.util.stream.I0 Q(j$.util.stream.I0 i6) {
        if (i6.p() <= 0) {
            return i6;
        }
        long jCount = i6.count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new j$.util.stream.C6846y1(i6, jArr, 0).invoke();
        return new j$.util.stream.C6804p1(jArr);
    }

    public static j$.util.stream.C6727a R(java.util.function.Function function) {
        j$.util.stream.C6727a c6727a = new j$.util.stream.C6727a(8);
        c6727a.f48404b = function;
        return c6727a;
    }

    static j$.util.stream.A0 S(long j6) {
        return (j6 < 0 || j6 >= 2147483639) ? new j$.util.stream.C6769i1() : new j$.util.stream.C6764h1(j6);
    }

    public static j$.util.stream.IntStream T(j$.util.X x6) {
        return new j$.util.stream.C6728a0(x6, j$.util.stream.EnumC6756f3.q(x6), false);
    }

    static j$.util.stream.B0 U(long j6) {
        return (j6 < 0 || j6 >= 2147483639) ? new j$.util.stream.C6813r1() : new j$.util.stream.C6809q1(j6);
    }

    public static j$.util.stream.InterfaceC6793n0 V(j$.util.a0 a0Var) {
        return new j$.util.stream.C6768i0(a0Var, j$.util.stream.EnumC6756f3.q(a0Var), false);
    }

    public static j$.util.stream.F W(j$.util.stream.AbstractC6732b abstractC6732b, long j6, long j10) {
        if (j6 >= 0) {
            return new j$.util.stream.C6847y2(abstractC6732b, M(j10), j6, j10);
        }
        throw new java.lang.IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    public static j$.util.stream.C6837w0 X(j$.util.stream.EnumC6832v0 enumC6832v0) {
        j$.util.Objects.requireNonNull(null);
        j$.util.Objects.requireNonNull(enumC6832v0);
        return new j$.util.stream.C6837w0(j$.util.stream.EnumC6761g3.DOUBLE_VALUE, enumC6832v0, new j$.util.stream.C6798o0(enumC6832v0, 2));
    }

    public static j$.util.stream.IntStream Y(j$.util.stream.AbstractC6732b abstractC6732b, long j6, long j10) {
        if (j6 >= 0) {
            return new j$.util.stream.C6829u2(abstractC6732b, M(j10), j6, j10);
        }
        throw new java.lang.IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    public static j$.util.stream.C6837w0 Z(j$.util.stream.EnumC6832v0 enumC6832v0) {
        j$.util.Objects.requireNonNull(null);
        j$.util.Objects.requireNonNull(enumC6832v0);
        return new j$.util.stream.C6837w0(j$.util.stream.EnumC6761g3.INT_VALUE, enumC6832v0, new j$.util.stream.C6798o0(enumC6832v0, 1));
    }

    public static void a() {
        throw new java.lang.IllegalStateException("called wrong accept method");
    }

    public static j$.util.stream.InterfaceC6793n0 a0(j$.util.stream.AbstractC6732b abstractC6732b, long j6, long j10) {
        if (j6 >= 0) {
            return new j$.util.stream.C6839w2(abstractC6732b, M(j10), j6, j10);
        }
        throw new java.lang.IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    public static j$.util.stream.C6837w0 b0(j$.util.stream.EnumC6832v0 enumC6832v0) {
        j$.util.Objects.requireNonNull(null);
        j$.util.Objects.requireNonNull(enumC6832v0);
        return new j$.util.stream.C6837w0(j$.util.stream.EnumC6761g3.LONG_VALUE, enumC6832v0, new j$.util.stream.C6798o0(enumC6832v0, 0));
    }

    public static j$.util.stream.C6837w0 c0(j$.util.stream.EnumC6832v0 enumC6832v0, java.util.function.Predicate predicate) {
        j$.util.Objects.requireNonNull(predicate);
        j$.util.Objects.requireNonNull(enumC6832v0);
        return new j$.util.stream.C6837w0(j$.util.stream.EnumC6761g3.REFERENCE, enumC6832v0, new j$.util.stream.C6803p0(0, enumC6832v0, predicate));
    }

    public static j$.util.stream.Stream d0(j$.util.stream.AbstractC6732b abstractC6732b, long j6, long j10) {
        if (j6 >= 0) {
            return new j$.util.stream.C6819s2(abstractC6732b, M(j10), j6, j10);
        }
        throw new java.lang.IllegalArgumentException("Skip must be non-negative: " + j6);
    }

    public static void e(j$.util.stream.InterfaceC6795n2 interfaceC6795n2, java.lang.Double d6) {
        if (j$.util.stream.O3.f48308a) {
            j$.util.stream.O3.a(interfaceC6795n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC6795n2.accept(d6.doubleValue());
    }

    public static j$.util.stream.Stream f0(j$.util.Spliterator spliterator, boolean z6) {
        j$.util.Objects.requireNonNull(spliterator);
        return new j$.util.stream.C6760g2(spliterator, j$.util.stream.EnumC6756f3.q(spliterator), z6);
    }

    public static void g(j$.util.stream.InterfaceC6800o2 interfaceC6800o2, java.lang.Integer num) {
        if (j$.util.stream.O3.f48308a) {
            j$.util.stream.O3.a(interfaceC6800o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC6800o2.accept(num.intValue());
    }

    public static void i(j$.util.stream.InterfaceC6805p2 interfaceC6805p2, java.lang.Long l6) {
        if (j$.util.stream.O3.f48308a) {
            j$.util.stream.O3.a(interfaceC6805p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC6805p2.accept(l6.longValue());
    }

    public static void k() {
        throw new java.lang.IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new java.lang.IllegalStateException("called wrong accept method");
    }

    public static java.lang.Object[] m(j$.util.stream.J0 j6, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.O3.f48308a) {
            j$.util.stream.O3.a(j6.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (j6.count() >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) j6.count());
        j6.h(objArr, 0);
        return objArr;
    }

    public static void n(j$.util.stream.E0 e6, java.lang.Double[] dArr, int i6) {
        if (j$.util.stream.O3.f48308a) {
            j$.util.stream.O3.a(e6.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) e6.d();
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr[i6 + i10] = java.lang.Double.valueOf(dArr2[i10]);
        }
    }

    public static void o(j$.util.stream.G0 g6, java.lang.Integer[] numArr, int i6) {
        if (j$.util.stream.O3.f48308a) {
            j$.util.stream.O3.a(g6.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) g6.d();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i6 + i10] = java.lang.Integer.valueOf(iArr[i10]);
        }
    }

    public static void p(j$.util.stream.I0 i6, java.lang.Long[] lArr, int i10) {
        if (j$.util.stream.O3.f48308a) {
            j$.util.stream.O3.a(i6.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) i6.d();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = java.lang.Long.valueOf(jArr[i11]);
        }
    }

    public static void q(j$.util.stream.E0 e6, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            e6.e((java.util.function.DoubleConsumer) consumer);
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(e6.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.U) e6.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(j$.util.stream.G0 g6, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            g6.e((java.util.function.IntConsumer) consumer);
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(g6.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.X) g6.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(j$.util.stream.I0 i6, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            i6.e((java.util.function.LongConsumer) consumer);
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(i6.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.a0) i6.spliterator()).forEachRemaining(consumer);
        }
    }

    public static j$.util.stream.E0 t(j$.util.stream.E0 e6, long j6, long j10) {
        if (j6 == 0 && j10 == e6.count()) {
            return e6;
        }
        long j11 = j10 - j6;
        j$.util.U u6 = (j$.util.U) e6.spliterator();
        j$.util.stream.InterfaceC6849z0 interfaceC6849z0J = J(j11);
        interfaceC6849z0J.k(j11);
        for (int i6 = 0; i6 < j6 && u6.tryAdvance((java.util.function.DoubleConsumer) new j$.util.stream.D0(0)); i6++) {
        }
        if (j10 == e6.count()) {
            u6.forEachRemaining((java.util.function.DoubleConsumer) interfaceC6849z0J);
        } else {
            for (int i10 = 0; i10 < j11 && u6.tryAdvance((java.util.function.DoubleConsumer) interfaceC6849z0J); i10++) {
            }
        }
        interfaceC6849z0J.j();
        return interfaceC6849z0J.a();
    }

    public static j$.util.stream.G0 u(j$.util.stream.G0 g6, long j6, long j10) {
        if (j6 == 0 && j10 == g6.count()) {
            return g6;
        }
        long j11 = j10 - j6;
        j$.util.X x6 = (j$.util.X) g6.spliterator();
        j$.util.stream.A0 a0S = S(j11);
        a0S.k(j11);
        for (int i6 = 0; i6 < j6 && x6.tryAdvance((java.util.function.IntConsumer) new j$.util.stream.F0(0)); i6++) {
        }
        if (j10 == g6.count()) {
            x6.forEachRemaining((java.util.function.IntConsumer) a0S);
        } else {
            for (int i10 = 0; i10 < j11 && x6.tryAdvance((java.util.function.IntConsumer) a0S); i10++) {
            }
        }
        a0S.j();
        return a0S.a();
    }

    public static j$.util.stream.I0 v(j$.util.stream.I0 i6, long j6, long j10) {
        if (j6 == 0 && j10 == i6.count()) {
            return i6;
        }
        long j11 = j10 - j6;
        j$.util.a0 a0Var = (j$.util.a0) i6.spliterator();
        j$.util.stream.B0 b0U = U(j11);
        b0U.k(j11);
        for (int i10 = 0; i10 < j6 && a0Var.tryAdvance((java.util.function.LongConsumer) new j$.util.stream.H0(0)); i10++) {
        }
        if (j10 == i6.count()) {
            a0Var.forEachRemaining((java.util.function.LongConsumer) b0U);
        } else {
            for (int i11 = 0; i11 < j11 && a0Var.tryAdvance((java.util.function.LongConsumer) b0U); i11++) {
            }
        }
        b0U.j();
        return b0U.a();
    }

    public static j$.util.stream.K0 w(j$.util.stream.K0 k6, long j6, long j10, java.util.function.IntFunction intFunction) {
        if (j6 == 0 && j10 == k6.count()) {
            return k6;
        }
        j$.util.Spliterator spliterator = k6.spliterator();
        long j11 = j10 - j6;
        j$.util.stream.C0 c0D = D(j11, intFunction);
        c0D.k(j11);
        for (int i6 = 0; i6 < j6 && spliterator.tryAdvance(new j$.util.stream.C6816s(28)); i6++) {
        }
        if (j10 == k6.count()) {
            spliterator.forEachRemaining(c0D);
        } else {
            for (int i10 = 0; i10 < j11 && spliterator.tryAdvance(c0D); i10++) {
            }
        }
        c0D.j();
        return c0D.a();
    }

    @Override // j$.util.stream.L3
    public java.lang.Object b(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        j$.util.stream.U1 u1E0 = e0();
        abstractC6732b.R(spliterator, u1E0);
        return u1E0.get();
    }

    @Override // j$.util.stream.L3
    public java.lang.Object c(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        return ((j$.util.stream.U1) new j$.util.stream.C6735b2(this, abstractC6732b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.L3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract j$.util.stream.U1 e0();
}
