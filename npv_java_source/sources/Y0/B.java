package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final long a(float f6, float f10) {
        return Y0.A.c((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }
}
