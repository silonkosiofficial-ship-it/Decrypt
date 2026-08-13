package p131n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final long a(float f6, float f10) {
        return p131n0.g.e((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static final boolean b(long j6) {
        long j10 = (j6 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j10) & (j10 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean c(long j6) {
        return (j6 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean d(long j6) {
        return (j6 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final long e(long j6, long j10, float f6) {
        float fB = p002a1.b.b(java.lang.Float.intBitsToFloat((int) (j6 >> 32)), java.lang.Float.intBitsToFloat((int) (j10 >> 32)), f6);
        float fB2 = p002a1.b.b(java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L)), f6);
        return p131n0.g.e((((long) java.lang.Float.floatToRawIntBits(fB)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fB2)) & 4294967295L));
    }
}
