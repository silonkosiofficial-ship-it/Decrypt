package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i6, int i10, int i11, int i12) {
        boolean z6 = false;
        if (!(i10 >= i6)) {
            Y0.o.a("maxWidth(" + i10 + ") must be >= than minWidth(" + i6 + ')');
        }
        if (!(i12 >= i11)) {
            Y0.o.a("maxHeight(" + i12 + ") must be >= than minHeight(" + i11 + ')');
        }
        if (i6 >= 0 && i11 >= 0) {
            z6 = true;
        }
        if (!z6) {
            Y0.o.a("minWidth(" + i6 + ") and minHeight(" + i11 + ") must be >= 0");
        }
        return j(i6, i10, i11, i12);
    }

    public static /* synthetic */ long b(int i6, int i10, int i11, int i12, int i13, java.lang.Object obj) {
        if ((i13 & 1) != 0) {
            i6 = 0;
        }
        if ((i13 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return a(i6, i10, i11, i12);
    }

    private static final int d(int i6, int i10) {
        return i6 == Integer.MAX_VALUE ? i6 : E7.j.d(i6 + i10, 0);
    }

    private static final int e(int i6) {
        if (i6 < 8191) {
            return 13;
        }
        if (i6 < 32767) {
            return 15;
        }
        if (i6 < 65535) {
            return 16;
        }
        return i6 < 262143 ? 18 : 255;
    }

    public static final long f(long j6, long j10) {
        return Y0.u.a(E7.j.k(Y0.t.g(j10), Y0.C1859b.n(j6), Y0.C1859b.l(j6)), E7.j.k(Y0.t.f(j10), Y0.C1859b.m(j6), Y0.C1859b.k(j6)));
    }

    public static final long g(long j6, long j10) {
        return a(E7.j.k(Y0.C1859b.n(j10), Y0.C1859b.n(j6), Y0.C1859b.l(j6)), E7.j.k(Y0.C1859b.l(j10), Y0.C1859b.n(j6), Y0.C1859b.l(j6)), E7.j.k(Y0.C1859b.m(j10), Y0.C1859b.m(j6), Y0.C1859b.k(j6)), E7.j.k(Y0.C1859b.k(j10), Y0.C1859b.m(j6), Y0.C1859b.k(j6)));
    }

    public static final int h(long j6, int i6) {
        return E7.j.k(i6, Y0.C1859b.m(j6), Y0.C1859b.k(j6));
    }

    public static final int i(long j6, int i6) {
        return E7.j.k(i6, Y0.C1859b.n(j6), Y0.C1859b.l(j6));
    }

    public static final long j(int i6, int i10, int i11, int i12) {
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iE = e(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i6 : i10;
        int iE2 = e(i14);
        if (iE + iE2 > 31) {
            k(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i15 & (~(i15 >> 31));
        int i17 = i12 + 1;
        int i18 = i17 & (~(i17 >> 31));
        int i19 = 0;
        if (iE2 != 13) {
            if (iE2 == 18) {
                i19 = 3;
            } else if (iE2 == 15) {
                i19 = 1;
            } else if (iE2 == 16) {
                i19 = 2;
            }
        }
        int i20 = ((i19 & 1) << 1) + (((i19 & 2) >> 1) * 3);
        return Y0.C1859b.b((((long) i16) << 33) | ((long) i19) | (((long) i6) << 2) | (((long) i11) << (i20 + 15)) | (((long) i18) << (i20 + 46)));
    }

    private static final void k(int i6, int i10) {
        throw new java.lang.IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i10 + " in Constraints");
    }

    private static final java.lang.Void l(int i6) {
        throw new java.lang.IllegalArgumentException("Can't represent a size of " + i6 + " in Constraints");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i6) {
        if (i6 < 8191) {
            return 262142;
        }
        if (i6 < 32767) {
            return 65534;
        }
        if (i6 < 65535) {
            return 32766;
        }
        if (i6 < 262143) {
            return 8190;
        }
        l(i6);
        throw new p087i7.C6665k();
    }

    public static final long n(long j6, int i6, int i10) {
        return a(E7.j.d(Y0.C1859b.n(j6) + i6, 0), d(Y0.C1859b.l(j6), i6), E7.j.d(Y0.C1859b.m(j6) + i10, 0), d(Y0.C1859b.k(j6), i10));
    }

    public static /* synthetic */ long o(long j6, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return n(j6, i6, i10);
    }
}
