package p235x4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static float a(float f6, float f10, float f11, float f12) {
        return (float) java.lang.Math.hypot(f11 - f6, f12 - f10);
    }

    public static float b(float f6, float f10, float f11) {
        return ((1.0f - f11) * f6) + (f11 * f10);
    }
}
