package p200u;

/* JADX INFO: renamed from: u.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7178k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f54950a = Float.MAX_VALUE;

    public static final long a(float f6, float f10) {
        return p200u.Y.a((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static final float b() {
        return f54950a;
    }
}
