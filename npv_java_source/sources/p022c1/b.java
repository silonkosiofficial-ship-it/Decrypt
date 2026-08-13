package p022c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static long a(int i6, int i10) {
        return b((((long) i10) & 4294967295L) | (((long) i6) << 32));
    }

    public static long b(long j6) {
        return j6;
    }

    public static final int c(long j6) {
        return (int) (j6 >> 32);
    }

    public static final int d(long j6) {
        return (int) (j6 & 4294967295L);
    }
}
