package S8;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class K {
    public static /* synthetic */ long a(long j6, long j10) {
        if (j10 < 0) {
            return (j6 ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j6 >= 0) {
            return j6 / j10;
        }
        long j11 = ((j6 >>> 1) / j10) << 1;
        return j11 + ((long) (((j6 - (j11 * j10)) ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE) ? 0 : 1));
    }
}
