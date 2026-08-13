package p002a1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final float a(float f6) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(((int) ((((long) java.lang.Float.floatToRawIntBits(f6)) & 8589934591L) / ((long) 3))) + 709952852);
        float f10 = fIntBitsToFloat - ((fIntBitsToFloat - (f6 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f10 - ((f10 - (f6 / (f10 * f10))) * 0.33333334f);
    }

    public static final float b(float f6, float f10, float f11) {
        return ((1 - f11) * f6) + (f11 * f10);
    }

    public static final int c(int i6, int i10, float f6) {
        return i6 + ((int) java.lang.Math.round(((double) (i10 - i6)) * ((double) f6)));
    }
}
