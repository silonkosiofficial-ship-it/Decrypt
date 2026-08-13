package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final class Spliterators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.util.Spliterator f48026a = new j$.util.o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j$.util.X f48027b = new j$.util.m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j$.util.a0 f48028c = new j$.util.n0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j$.util.U f48029d = new j$.util.l0();

    private static void a(int i6, int i10, int i11) {
        if (i10 <= i11) {
            if (i10 < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(i10);
            }
            if (i11 > i6) {
                throw new java.lang.ArrayIndexOutOfBoundsException(i11);
            }
            return;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("origin(" + i10 + ") > fence(" + i11 + ")");
    }

    public static j$.util.U b() {
        return f48029d;
    }

    public static j$.util.X c() {
        return f48027b;
    }

    public static j$.util.a0 d() {
        return f48028c;
    }

    public static j$.util.Spliterator e() {
        return f48026a;
    }

    public static j$.util.F f(j$.util.U u6) {
        j$.util.Objects.requireNonNull(u6);
        return new j$.util.i0(u6);
    }

    public static j$.util.J g(j$.util.X x6) {
        j$.util.Objects.requireNonNull(x6);
        return new j$.util.g0(x6);
    }

    public static j$.util.N h(j$.util.a0 a0Var) {
        j$.util.Objects.requireNonNull(a0Var);
        return new j$.util.h0(a0Var);
    }

    public static java.util.Iterator i(j$.util.Spliterator spliterator) {
        j$.util.Objects.requireNonNull(spliterator);
        return new j$.util.f0(spliterator);
    }

    public static j$.util.U j(double[] dArr, int i6, int i10) {
        a(((double[]) j$.util.Objects.requireNonNull(dArr)).length, i6, i10);
        return new j$.util.k0(dArr, i6, i10, 1040);
    }

    public static j$.util.X k(int[] iArr, int i6, int i10) {
        a(((int[]) j$.util.Objects.requireNonNull(iArr)).length, i6, i10);
        return new j$.util.p0(iArr, i6, i10, 1040);
    }

    public static j$.util.a0 l(long[] jArr, int i6, int i10) {
        a(((long[]) j$.util.Objects.requireNonNull(jArr)).length, i6, i10);
        return new j$.util.r0(jArr, i6, i10, 1040);
    }

    public static j$.util.Spliterator m(java.lang.Object[] objArr, int i6, int i10) {
        a(((java.lang.Object[]) j$.util.Objects.requireNonNull(objArr)).length, i6, i10);
        return new j$.util.j0(objArr, i6, i10, 1040);
    }

    public static <T> j$.util.Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i6) {
        return new j$.util.q0((java.util.Collection) j$.util.Objects.requireNonNull(collection), i6);
    }
}
