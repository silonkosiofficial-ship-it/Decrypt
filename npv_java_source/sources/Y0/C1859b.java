package Y0;

/* JADX INFO: renamed from: Y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1859b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.C1859b.a f16201b = new Y0.C1859b.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16202a;

    /* JADX INFO: renamed from: Y0.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a(int i6, int i10, int i11, int i12) {
            int iMin = java.lang.Math.min(i11, 262142);
            int iMin2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i12, 262142);
            int iM = Y0.c.m(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return Y0.c.a(java.lang.Math.min(iM, i6), i10 != Integer.MAX_VALUE ? java.lang.Math.min(iM, i10) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public final long b(int i6, int i10, int i11, int i12) {
            int iMin = java.lang.Math.min(i6, 262142);
            int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i10, 262142);
            int iM = Y0.c.m(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return Y0.c.a(iMin, iMin2, java.lang.Math.min(iM, i11), i12 != Integer.MAX_VALUE ? java.lang.Math.min(iM, i12) : Integer.MAX_VALUE);
        }

        public final long c(int i6, int i10) {
            if (!(i6 >= 0 && i10 >= 0)) {
                Y0.o.a("width(" + i6 + ") and height(" + i10 + ") must be >= 0");
            }
            return Y0.c.j(i6, i6, i10, i10);
        }

        public final long d(int i6) {
            if (!(i6 >= 0)) {
                Y0.o.a("height(" + i6 + ") must be >= 0");
            }
            return Y0.c.j(0, Integer.MAX_VALUE, i6, i6);
        }

        public final long e(int i6) {
            if (!(i6 >= 0)) {
                Y0.o.a("width(" + i6 + ") must be >= 0");
            }
            return Y0.c.j(i6, i6, 0, Integer.MAX_VALUE);
        }
    }

    private /* synthetic */ C1859b(long j6) {
        this.f16202a = j6;
    }

    public static final /* synthetic */ Y0.C1859b a(long j6) {
        return new Y0.C1859b(j6);
    }

    public static long b(long j6) {
        return j6;
    }

    public static final long c(long j6, int i6, int i10, int i11, int i12) {
        if (!(i11 >= 0 && i6 >= 0)) {
            Y0.o.a("minHeight(" + i11 + ") and minWidth(" + i6 + ") must be >= 0");
        }
        if (!(i10 >= i6)) {
            Y0.o.a("maxWidth(" + i10 + ") must be >= minWidth(" + i6 + ')');
        }
        if (!(i12 >= i11)) {
            Y0.o.a("maxHeight(" + i12 + ") must be >= minHeight(" + i11 + ')');
        }
        return Y0.c.j(i6, i10, i11, i12);
    }

    public static /* synthetic */ long d(long j6, int i6, int i10, int i11, int i12, int i13, java.lang.Object obj) {
        if ((i13 & 1) != 0) {
            i6 = n(j6);
        }
        int i14 = i6;
        if ((i13 & 2) != 0) {
            i10 = l(j6);
        }
        int i15 = i10;
        if ((i13 & 4) != 0) {
            i11 = m(j6);
        }
        int i16 = i11;
        if ((i13 & 8) != 0) {
            i12 = k(j6);
        }
        return c(j6, i14, i15, i16, i12);
    }

    public static boolean e(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.C1859b) && j6 == ((Y0.C1859b) obj).r();
    }

    public static final boolean f(long j6, long j10) {
        return j6 == j10;
    }

    public static final boolean g(long j6) {
        int i6 = (int) (3 & j6);
        int i10 = ((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3);
        return (((int) (j6 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0;
    }

    public static final boolean h(long j6) {
        int i6 = (int) (3 & j6);
        return (((int) (j6 >> 33)) & ((1 << ((((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean i(long j6) {
        int i6 = (int) (3 & j6);
        int i10 = ((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j6 >> (i10 + 15))) & i11;
        int i13 = ((int) (j6 >> (i10 + 46))) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final boolean j(long j6) {
        int i6 = (int) (3 & j6);
        int i10 = (1 << ((((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3)) + 13)) - 1;
        int i11 = ((int) (j6 >> 2)) & i10;
        int i12 = ((int) (j6 >> 33)) & i10;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    public static final int k(long j6) {
        int i6 = (int) (3 & j6);
        int i10 = ((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3);
        int i11 = ((int) (j6 >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int l(long j6) {
        int i6 = (int) (3 & j6);
        int i10 = ((int) (j6 >> 33)) & ((1 << ((((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3)) + 13)) - 1);
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int m(long j6) {
        int i6 = (int) (3 & j6);
        int i10 = ((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3);
        return ((int) (j6 >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    public static final int n(long j6) {
        int i6 = (int) (3 & j6);
        return ((int) (j6 >> 2)) & ((1 << ((((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long j6) {
        return p170r.r.a(j6);
    }

    public static final boolean p(long j6) {
        int i6 = (int) (3 & j6);
        int i10 = ((i6 & 1) << 1) + (((i6 & 2) >> 1) * 3);
        return (((int) (j6 >> 33)) & ((1 << (i10 + 13)) - 1)) - 1 == 0 || (((int) (j6 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) - 1 == 0;
    }

    public static java.lang.String q(long j6) {
        int iL = l(j6);
        java.lang.String strValueOf = iL == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(iL);
        int iK = k(j6);
        return "Constraints(minWidth = " + n(j6) + ", maxWidth = " + strValueOf + ", minHeight = " + m(j6) + ", maxHeight = " + (iK != Integer.MAX_VALUE ? java.lang.String.valueOf(iK) : "Infinity") + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f16202a, obj);
    }

    public int hashCode() {
        return o(this.f16202a);
    }

    public final /* synthetic */ long r() {
        return this.f16202a;
    }

    public java.lang.String toString() {
        return q(this.f16202a);
    }
}
