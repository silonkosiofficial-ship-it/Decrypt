package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C extends S8.B {
    public static final java.lang.Void u(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "input");
        throw new java.lang.NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static java.lang.Integer v(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return w(str, 10);
    }

    public static final java.lang.Integer w(java.lang.String str, int i6) {
        boolean z6;
        int i10;
        int i11;
        p247y7.AbstractC7350t.f(str, "<this>");
        S8.AbstractC1628a.a(i6);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (p247y7.AbstractC7350t.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z6 = true;
            }
        } else {
            z6 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iB = S8.AbstractC1629b.b(str.charAt(i10), i6);
            if (iB < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / i6))) || (i11 = i12 * i6) < i13 + iB) {
                return null;
            }
            i12 = i11 - iB;
            i10++;
        }
        return z6 ? java.lang.Integer.valueOf(i12) : java.lang.Integer.valueOf(-i12);
    }

    public static java.lang.Long x(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return y(str, 10);
    }

    public static final java.lang.Long y(java.lang.String str, int i6) {
        boolean z6;
        p247y7.AbstractC7350t.f(str, "<this>");
        S8.AbstractC1628a.a(i6);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j6 = -9223372036854775807L;
        if (p247y7.AbstractC7350t.g(cCharAt, 48) < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
                i10 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j6 = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z6 = false;
        }
        long j10 = -256204778801521550L;
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int iB = S8.AbstractC1629b.b(str.charAt(i10), i6);
            if (iB < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 == j10) {
                    j12 = j6 / ((long) i6);
                    if (j11 < j12) {
                    }
                }
                return null;
            }
            long j13 = j11 * ((long) i6);
            long j14 = iB;
            if (j13 < j6 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i10++;
            j10 = -256204778801521550L;
        }
        return z6 ? java.lang.Long.valueOf(j11) : java.lang.Long.valueOf(-j11);
    }
}
