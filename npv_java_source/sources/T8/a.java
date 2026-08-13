package T8;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final T8.a.C0279a f13312D = new T8.a.C0279a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final long f13313E = s(0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final long f13314F = T8.c.j(4611686018427387903L);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final long f13315G = T8.c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f13316C;

    /* JADX INFO: renamed from: T8.a$a, reason: collision with other inner class name */
    public static final class C0279a {
        private C0279a() {
        }

        public /* synthetic */ C0279a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return T8.a.f13314F;
        }

        public final long b() {
            return T8.a.f13315G;
        }

        public final long c() {
            return T8.a.f13313E;
        }

        public final long d(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            try {
                return T8.c.p(str, true);
            } catch (java.lang.IllegalArgumentException e6) {
                throw new java.lang.IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e6);
            }
        }
    }

    private /* synthetic */ a(long j6) {
        this.f13316C = j6;
    }

    public static final long A(long j6) {
        return Q(j6, T8.d.MINUTES);
    }

    public static final long B(long j6) {
        return Q(j6, T8.d.SECONDS);
    }

    public static final int C(long j6) {
        if (L(j6)) {
            return 0;
        }
        return (int) (A(j6) % ((long) 60));
    }

    public static final int D(long j6) {
        if (L(j6)) {
            return 0;
        }
        boolean zJ = J(j6);
        long jG = G(j6);
        return (int) (zJ ? T8.c.n(jG % ((long) 1000)) : jG % ((long) 1000000000));
    }

    public static final int E(long j6) {
        if (L(j6)) {
            return 0;
        }
        return (int) (B(j6) % ((long) 60));
    }

    private static final T8.d F(long j6) {
        return K(j6) ? T8.d.NANOSECONDS : T8.d.MILLISECONDS;
    }

    private static final long G(long j6) {
        return j6 >> 1;
    }

    public static int H(long j6) {
        return p170r.r.a(j6);
    }

    public static final boolean I(long j6) {
        return !L(j6);
    }

    private static final boolean J(long j6) {
        return (((int) j6) & 1) == 1;
    }

    private static final boolean K(long j6) {
        return (((int) j6) & 1) == 0;
    }

    public static final boolean L(long j6) {
        return j6 == f13314F || j6 == f13315G;
    }

    public static final boolean M(long j6) {
        return j6 < 0;
    }

    public static final boolean N(long j6) {
        return j6 > 0;
    }

    public static final long O(long j6, long j10) {
        if (L(j6)) {
            if (I(j10) || (j10 ^ j6) >= 0) {
                return j6;
            }
            throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (L(j10)) {
            return j10;
        }
        if ((((int) j6) & 1) != (((int) j10) & 1)) {
            return J(j6) ? m(j6, G(j6), G(j10)) : m(j6, G(j10), G(j6));
        }
        long jG = G(j6) + G(j10);
        return K(j6) ? T8.c.m(jG) : T8.c.k(jG);
    }

    public static final java.lang.String P(long j6) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (M(j6)) {
            sb.append('-');
        }
        sb.append("PT");
        long jV = v(j6);
        long jY = y(jV);
        int iC = C(jV);
        int iE = E(jV);
        int iD = D(jV);
        if (L(j6)) {
            jY = 9999999999999L;
        }
        boolean z6 = false;
        boolean z10 = jY != 0;
        boolean z11 = (iE == 0 && iD == 0) ? false : true;
        if (iC != 0 || (z11 && z10)) {
            z6 = true;
        }
        if (z10) {
            sb.append(jY);
            sb.append('H');
        }
        if (z6) {
            sb.append(iC);
            sb.append('M');
        }
        if (z11 || (!z10 && !z6)) {
            n(j6, sb, iE, iD, 9, "S", true);
        }
        return sb.toString();
    }

    public static final long Q(long j6, T8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "unit");
        if (j6 == f13314F) {
            return Long.MAX_VALUE;
        }
        if (j6 == f13315G) {
            return Long.MIN_VALUE;
        }
        return T8.e.b(G(j6), F(j6), dVar);
    }

    public static java.lang.String R(long j6) {
        int i6;
        int i10;
        int i11;
        java.lang.String str;
        boolean z6;
        if (j6 == 0) {
            return "0s";
        }
        if (j6 == f13314F) {
            return "Infinity";
        }
        if (j6 == f13315G) {
            return "-Infinity";
        }
        boolean zM = M(j6);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (zM) {
            sb.append('-');
        }
        long jV = v(j6);
        long jX = x(jV);
        int iW = w(jV);
        int iC = C(jV);
        int iE = E(jV);
        int iD = D(jV);
        int i12 = 0;
        boolean z10 = jX != 0;
        boolean z11 = iW != 0;
        boolean z12 = iC != 0;
        boolean z13 = (iE == 0 && iD == 0) ? false : true;
        if (z10) {
            sb.append(jX);
            sb.append('d');
            i12 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i13 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            sb.append(iW);
            sb.append('h');
            i12 = i13;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i14 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            sb.append(iC);
            sb.append('m');
            i12 = i14;
        }
        if (z13) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            if (iE != 0 || z10 || z11 || z12) {
                i6 = 9;
                i10 = iE;
                i11 = iD;
                str = "s";
                z6 = false;
            } else if (iD >= 1000000) {
                i10 = iD / 1000000;
                i11 = iD % 1000000;
                str = "ms";
                z6 = false;
                i6 = 6;
            } else {
                if (iD >= 1000) {
                    i10 = iD / 1000;
                    i11 = iD % 1000;
                    str = "us";
                    z6 = false;
                    i6 = 3;
                } else {
                    sb.append(iD);
                    sb.append("ns");
                }
                i12 = i15;
            }
            n(j6, sb, i10, i11, i6, str, z6);
            i12 = i15;
        }
        if (zM && i12 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long S(long j6) {
        return T8.c.i(-G(j6), ((int) j6) & 1);
    }

    private static final long m(long j6, long j10, long j11) {
        long jO = T8.c.o(j11);
        long j12 = j10 + jO;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return T8.c.j(E7.j.l(j12, -4611686018427387903L, 4611686018427387903L));
        }
        return T8.c.l(T8.c.n(j12) + (j11 - T8.c.n(jO)));
    }

    private static final void n(long j6, java.lang.StringBuilder sb, int i6, int i10, int i11, java.lang.String str, boolean z6) {
        sb.append(i6);
        if (i10 != 0) {
            sb.append('.');
            java.lang.String strB0 = S8.r.B0(java.lang.String.valueOf(i10), i11, '0');
            int i12 = -1;
            int length = strB0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (strB0.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z6 || i14 >= 3) {
                sb.append((java.lang.CharSequence) strB0, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb.append((java.lang.CharSequence) strB0, 0, i14);
            }
            p247y7.AbstractC7350t.e(sb, "append(...)");
        }
        sb.append(str);
    }

    public static final /* synthetic */ T8.a o(long j6) {
        return new T8.a(j6);
    }

    public static int r(long j6, long j10) {
        long j11 = j6 ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return p247y7.AbstractC7350t.h(j6, j10);
        }
        int i6 = (((int) j6) & 1) - (((int) j10) & 1);
        return M(j6) ? -i6 : i6;
    }

    public static long s(long j6) {
        if (T8.b.a()) {
            if (K(j6)) {
                long jG = G(j6);
                if (-4611686018426999999L > jG || jG >= 4611686018427000000L) {
                    throw new java.lang.AssertionError(G(j6) + " ns is out of nanoseconds range");
                }
            } else {
                long jG2 = G(j6);
                if (-4611686018427387903L > jG2 || jG2 >= 4611686018427387904L) {
                    throw new java.lang.AssertionError(G(j6) + " ms is out of milliseconds range");
                }
                long jG3 = G(j6);
                if (-4611686018426L <= jG3 && jG3 < 4611686018427L) {
                    throw new java.lang.AssertionError(G(j6) + " ms is denormalized");
                }
            }
        }
        return j6;
    }

    public static boolean t(long j6, java.lang.Object obj) {
        return (obj instanceof T8.a) && j6 == ((T8.a) obj).T();
    }

    public static final boolean u(long j6, long j10) {
        return j6 == j10;
    }

    public static final long v(long j6) {
        return M(j6) ? S(j6) : j6;
    }

    public static final int w(long j6) {
        if (L(j6)) {
            return 0;
        }
        return (int) (y(j6) % ((long) 24));
    }

    public static final long x(long j6) {
        return Q(j6, T8.d.DAYS);
    }

    public static final long y(long j6) {
        return Q(j6, T8.d.HOURS);
    }

    public static final long z(long j6) {
        return (J(j6) && I(j6)) ? G(j6) : Q(j6, T8.d.MILLISECONDS);
    }

    public final /* synthetic */ long T() {
        return this.f13316C;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return q(((T8.a) obj).T());
    }

    public boolean equals(java.lang.Object obj) {
        return t(this.f13316C, obj);
    }

    public int hashCode() {
        return H(this.f13316C);
    }

    public int q(long j6) {
        return r(this.f13316C, j6);
    }

    public java.lang.String toString() {
        return R(this.f13316C);
    }
}
