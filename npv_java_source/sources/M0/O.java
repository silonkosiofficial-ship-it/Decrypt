package M0;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static final long a(int i6) {
        return b(i6, i6);
    }

    public static final long b(int i6, int i10) {
        return M0.N.c(d(i6, i10));
    }

    public static final long c(long j6, int i6, int i10) {
        int iK = E7.j.k(M0.N.n(j6), i6, i10);
        int iK2 = E7.j.k(M0.N.i(j6), i6, i10);
        return (iK == M0.N.n(j6) && iK2 == M0.N.i(j6)) ? j6 : b(iK, iK2);
    }

    private static final long d(int i6, int i10) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("start cannot be negative. [start: " + i6 + ", end: " + i10 + ']').toString());
        }
        if (i10 >= 0) {
            return (((long) i10) & 4294967295L) | (((long) i6) << 32);
        }
        throw new java.lang.IllegalArgumentException(("end cannot be negative. [start: " + i6 + ", end: " + i10 + ']').toString());
    }

    public static final java.lang.String e(java.lang.CharSequence charSequence, long j6) {
        return charSequence.subSequence(M0.N.l(j6), M0.N.k(j6)).toString();
    }
}
