package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static long a(long j6) {
        return j6;
    }

    public static final float b(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float c(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }
}
