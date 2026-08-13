package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final long a(float f6, float f10) {
        return Y0.k.b((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static final long b(float f6, float f10) {
        return Y0.l.d((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static final float c(float f6, float f10, float f11) {
        return Y0.i.q(p002a1.b.b(f6, f10, f11));
    }
}
