package p131n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final java.lang.String a(float f6, int i6) {
        if (java.lang.Float.isNaN(f6)) {
            return "NaN";
        }
        if (java.lang.Float.isInfinite(f6)) {
            return f6 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = java.lang.Math.max(i6, 0);
        float fPow = (float) java.lang.Math.pow(10.0f, iMax);
        float f10 = f6 * fPow;
        int i10 = (int) f10;
        if (f10 - i10 >= 0.5f) {
            i10++;
        }
        float f11 = i10 / fPow;
        return iMax > 0 ? java.lang.String.valueOf(f11) : java.lang.String.valueOf((int) f11);
    }
}
