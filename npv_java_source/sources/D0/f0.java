package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static final long a(float f6, float f10) {
        return D0.e0.a((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static final long b(long j6, long j10) {
        return p131n0.n.a(p131n0.m.i(j6) * D0.e0.b(j10), p131n0.m.g(j6) * D0.e0.c(j10));
    }
}
