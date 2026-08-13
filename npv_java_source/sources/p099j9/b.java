package p099j9;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ long a(long j6, long j10) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j6) + java.lang.Long.numberOfLeadingZeros(~j6) + java.lang.Long.numberOfLeadingZeros(j10) + java.lang.Long.numberOfLeadingZeros(~j10);
        if (iNumberOfLeadingZeros > 65) {
            return j6 * j10;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j10 != Long.MIN_VALUE) | (j6 >= 0)) {
                long j11 = j6 * j10;
                if (j6 == 0 || j11 / j6 == j10) {
                    return j11;
                }
            }
        }
        throw new java.lang.ArithmeticException();
    }
}
