package p170r;

/* JADX INFO: renamed from: r.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7032g {
    public static long a(float f6, float f10) {
        return b((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static long b(long j6) {
        return j6;
    }
}
