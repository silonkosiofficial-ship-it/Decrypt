package p258z9;

/* JADX INFO: renamed from: z9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC7406t {
    public static /* synthetic */ java.lang.String a(long j6, int i6) {
        if (j6 == 0) {
            return "0";
        }
        if (j6 > 0) {
            return java.lang.Long.toString(j6, i6);
        }
        if (i6 < 2 || i6 > 36) {
            i6 = 10;
        }
        int i10 = 64;
        char[] cArr = new char[64];
        int i11 = i6 - 1;
        if ((i6 & i11) == 0) {
            int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i6);
            do {
                i10--;
                cArr[i10] = java.lang.Character.forDigit(((int) j6) & i11, i6);
                j6 >>>= iNumberOfTrailingZeros;
            } while (j6 != 0);
        } else {
            long jA = (i6 & 1) == 0 ? (j6 >>> 1) / ((long) (i6 >>> 1)) : S8.K.a(j6, i6);
            long j10 = i6;
            cArr[63] = java.lang.Character.forDigit((int) (j6 - (jA * j10)), i6);
            i10 = 63;
            while (jA > 0) {
                i10--;
                cArr[i10] = java.lang.Character.forDigit((int) (jA % j10), i6);
                jA /= j10;
            }
        }
        return new java.lang.String(cArr, i10, 64 - i10);
    }
}
