package p019b9;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class G {
    public static final int a(java.lang.String str, int i6, int i10, int i11) {
        return (int) p019b9.E.c(str, i6, i10, i11);
    }

    public static final long b(java.lang.String str, long j6, long j10, long j11) {
        java.lang.String strD = p019b9.E.d(str);
        if (strD == null) {
            return j6;
        }
        java.lang.Long lX = S8.r.x(strD);
        if (lX == null) {
            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lX.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final java.lang.String c(java.lang.String str, java.lang.String str2) {
        java.lang.String strD = p019b9.E.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(java.lang.String str, boolean z6) {
        java.lang.String strD = p019b9.E.d(str);
        return strD != null ? java.lang.Boolean.parseBoolean(strD) : z6;
    }

    public static /* synthetic */ int e(java.lang.String str, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 1;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return p019b9.E.b(str, i6, i10, i11);
    }

    public static /* synthetic */ long f(java.lang.String str, long j6, long j10, long j11, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            j10 = 1;
        }
        long j12 = j10;
        if ((i6 & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return p019b9.E.c(str, j6, j12, j11);
    }
}
