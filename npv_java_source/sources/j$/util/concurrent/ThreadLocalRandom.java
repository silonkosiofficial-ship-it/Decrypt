package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadLocalRandom extends java.util.Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f48068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f48070c;
    private static final java.io.ObjectStreamField[] serialPersistentFields = {new java.io.ObjectStreamField("rnd", java.lang.Long.TYPE), new java.io.ObjectStreamField("initialized", java.lang.Boolean.TYPE)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.ThreadLocal f48064d = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f48065e = new java.util.concurrent.atomic.AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.ThreadLocal f48066f = new j$.util.concurrent.w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicLong f48067g = new java.util.concurrent.atomic.AtomicLong(h(java.lang.System.currentTimeMillis()) ^ h(java.lang.System.nanoTime()));

    static {
        if (((java.lang.Boolean) java.security.AccessController.doPrivileged(new j$.util.concurrent.x())).booleanValue()) {
            byte[] seed = java.security.SecureRandom.getSeed(8);
            long j6 = ((long) seed[0]) & 255;
            for (int i6 = 1; i6 < 8; i6++) {
                j6 = (j6 << 8) | (((long) seed[i6]) & 255);
            }
            f48067g.set(j6);
        }
    }

    private ThreadLocalRandom() {
        this.f48070c = true;
    }

    /* synthetic */ ThreadLocalRandom(int i6) {
        this();
    }

    static final int a(int i6) {
        int i10 = i6 ^ (i6 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        int i12 = i11 ^ (i11 << 5);
        ((j$.util.concurrent.ThreadLocalRandom) f48066f.get()).f48069b = i12;
        return i12;
    }

    static final int b() {
        return ((j$.util.concurrent.ThreadLocalRandom) f48066f.get()).f48069b;
    }

    public static j$.util.concurrent.ThreadLocalRandom current() {
        j$.util.concurrent.ThreadLocalRandom threadLocalRandom = (j$.util.concurrent.ThreadLocalRandom) f48066f.get();
        if (threadLocalRandom.f48069b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    static final void f() {
        int iAddAndGet = f48065e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jH = h(f48067g.getAndAdd(-4942790177534073029L));
        j$.util.concurrent.ThreadLocalRandom threadLocalRandom = (j$.util.concurrent.ThreadLocalRandom) f48066f.get();
        threadLocalRandom.f48068a = jH;
        threadLocalRandom.f48069b = iAddAndGet;
    }

    private static int g(long j6) {
        long j10 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
        return (int) (((j10 ^ (j10 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j6) {
        long j10 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
        long j11 = (j10 ^ (j10 >>> 33)) * (-4265267296055464877L);
        return j11 ^ (j11 >>> 33);
    }

    private java.lang.Object readResolve() {
        return current();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        java.io.ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f48068a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    final double c(double d6, double d10) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d6 >= d10) {
            return dNextLong;
        }
        double d11 = ((d10 - d6) * dNextLong) + d6;
        return d11 >= d10 ? java.lang.Double.longBitsToDouble(java.lang.Double.doubleToLongBits(d10) - 1) : d11;
    }

    final int d(int i6, int i10) {
        int i11;
        int iG = g(i());
        if (i6 >= i10) {
            return iG;
        }
        int i12 = i10 - i6;
        int i13 = i12 - 1;
        if ((i12 & i13) == 0) {
            i11 = iG & i13;
        } else if (i12 > 0) {
            int iG2 = iG >>> 1;
            while (true) {
                int i14 = iG2 + i13;
                i11 = iG2 % i12;
                if (i14 - i11 >= 0) {
                    break;
                }
                iG2 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (iG >= i6 && iG < i10) {
                    return iG;
                }
                iG = g(i());
            }
        }
        return i11 + i6;
    }

    @Override // java.util.Random
    public final java.util.stream.DoubleStream doubles() {
        return j$.util.stream.E.w(j$.util.stream.AbstractC6845y0.K(new j$.util.concurrent.y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final java.util.stream.DoubleStream doubles(double d6, double d10) {
        if (d6 < d10) {
            return j$.util.stream.E.w(j$.util.stream.AbstractC6845y0.K(new j$.util.concurrent.y(0L, Long.MAX_VALUE, d6, d10)));
        }
        throw new java.lang.IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.DoubleStream doubles(long j6) {
        if (j6 >= 0) {
            return j$.util.stream.E.w(j$.util.stream.AbstractC6845y0.K(new j$.util.concurrent.y(0L, j6, Double.MAX_VALUE, 0.0d)));
        }
        throw new java.lang.IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.DoubleStream doubles(long j6, double d6, double d10) {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException("size must be non-negative");
        }
        if (d6 < d10) {
            return j$.util.stream.E.w(j$.util.stream.AbstractC6845y0.K(new j$.util.concurrent.y(0L, j6, d6, d10)));
        }
        throw new java.lang.IllegalArgumentException("bound must be greater than origin");
    }

    final long e(long j6, long j10) {
        long jH = h(i());
        if (j6 >= j10) {
            return jH;
        }
        long j11 = j10 - j6;
        long j12 = j11 - 1;
        if ((j11 & j12) == 0) {
            return (jH & j12) + j6;
        }
        if (j11 > 0) {
            while (true) {
                long j13 = jH >>> 1;
                long j14 = j13 + j12;
                long j15 = j13 % j11;
                if (j14 - j15 >= 0) {
                    return j15 + j6;
                }
                jH = h(i());
            }
        } else {
            while (true) {
                if (jH >= j6 && jH < j10) {
                    return jH;
                }
                jH = h(i());
            }
        }
    }

    final long i() {
        long j6 = this.f48068a - 7046029254386353131L;
        this.f48068a = j6;
        return j6;
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.AbstractC6845y0.T(new j$.util.concurrent.z(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i6, int i10) {
        if (i6 < i10) {
            return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.AbstractC6845y0.T(new j$.util.concurrent.z(0L, Long.MAX_VALUE, i6, i10)));
        }
        throw new java.lang.IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j6) {
        if (j6 >= 0) {
            return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.AbstractC6845y0.T(new j$.util.concurrent.z(0L, j6, Integer.MAX_VALUE, 0)));
        }
        throw new java.lang.IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j6, int i6, int i10) {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException("size must be non-negative");
        }
        if (i6 < i10) {
            return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.AbstractC6845y0.T(new j$.util.concurrent.z(0L, j6, i6, i10)));
        }
        throw new java.lang.IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.LongStream longs() {
        return j$.util.stream.C6788m0.w(j$.util.stream.AbstractC6845y0.V(new j$.util.concurrent.A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final java.util.stream.LongStream longs(long j6) {
        if (j6 >= 0) {
            return j$.util.stream.C6788m0.w(j$.util.stream.AbstractC6845y0.V(new j$.util.concurrent.A(0L, j6, Long.MAX_VALUE, 0L)));
        }
        throw new java.lang.IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.LongStream longs(long j6, long j10) {
        if (j6 < j10) {
            return j$.util.stream.C6788m0.w(j$.util.stream.AbstractC6845y0.V(new j$.util.concurrent.A(0L, Long.MAX_VALUE, j6, j10)));
        }
        throw new java.lang.IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.LongStream longs(long j6, long j10, long j11) {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException("size must be non-negative");
        }
        if (j10 < j11) {
            return j$.util.stream.C6788m0.w(j$.util.stream.AbstractC6845y0.V(new j$.util.concurrent.A(0L, j6, j10, j11)));
        }
        throw new java.lang.IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    protected final int next(int i6) {
        return nextInt() >>> (32 - i6);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        java.lang.ThreadLocal threadLocal = f48064d;
        java.lang.Double d6 = (java.lang.Double) threadLocal.get();
        if (d6 != null) {
            threadLocal.set(null);
            return d6.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d10 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d10 < 1.0d && d10 != 0.0d) {
                double dSqrt = java.lang.StrictMath.sqrt((java.lang.StrictMath.log(d10) * (-2.0d)) / d10);
                threadLocal.set(java.lang.Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i6) {
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("bound must be positive");
        }
        int iG = g(i());
        int i10 = i6 - 1;
        if ((i6 & i10) == 0) {
            return iG & i10;
        }
        while (true) {
            int i11 = iG >>> 1;
            int i12 = i11 + i10;
            int i13 = i11 % i6;
            if (i12 - i13 >= 0) {
                return i13;
            }
            iG = g(i());
        }
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    @Override // java.util.Random
    public final void setSeed(long j6) {
        if (this.f48070c) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
