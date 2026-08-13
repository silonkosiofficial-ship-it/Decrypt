package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f21537a = new java.lang.ThreadLocal();

    public static void a(int i6, int i10, int i11, double[] dArr) {
        if (dArr.length != 3) {
            throw new java.lang.IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d6 = ((double) i6) / 255.0d;
        double dPow = d6 < 0.04045d ? d6 / 12.92d : java.lang.Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d10 = ((double) i10) / 255.0d;
        double dPow2 = d10 < 0.04045d ? d10 / 12.92d : java.lang.Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) i11) / 255.0d;
        double dPow3 = d11 < 0.04045d ? d11 / 12.92d : java.lang.Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int b(double d6, double d10, double d11) {
        double d12 = (((3.2406d * d6) + ((-1.5372d) * d10)) + ((-0.4986d) * d11)) / 100.0d;
        double d13 = ((((-0.9689d) * d6) + (1.8758d * d10)) + (0.0415d * d11)) / 100.0d;
        double d14 = (((0.0557d * d6) + ((-0.204d) * d10)) + (1.057d * d11)) / 100.0d;
        return android.graphics.Color.rgb(i((int) java.lang.Math.round((d12 > 0.0031308d ? (java.lang.Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255), i((int) java.lang.Math.round((d13 > 0.0031308d ? (java.lang.Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), i((int) java.lang.Math.round((d14 > 0.0031308d ? (java.lang.Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255));
    }

    public static int c(int i6, int i10, float f6) {
        float f10 = 1.0f - f6;
        return android.graphics.Color.argb((int) ((android.graphics.Color.alpha(i6) * f10) + (android.graphics.Color.alpha(i10) * f6)), (int) ((android.graphics.Color.red(i6) * f10) + (android.graphics.Color.red(i10) * f6)), (int) ((android.graphics.Color.green(i6) * f10) + (android.graphics.Color.green(i10) * f6)), (int) ((android.graphics.Color.blue(i6) * f10) + (android.graphics.Color.blue(i10) * f6)));
    }

    public static double d(int i6) {
        double[] dArrJ = j();
        e(i6, dArrJ);
        return dArrJ[1] / 100.0d;
    }

    public static void e(int i6, double[] dArr) {
        a(android.graphics.Color.red(i6), android.graphics.Color.green(i6), android.graphics.Color.blue(i6), dArr);
    }

    private static int f(int i6, int i10) {
        return 255 - (((255 - i10) * (255 - i6)) / 255);
    }

    public static int g(int i6, int i10) {
        int iAlpha = android.graphics.Color.alpha(i10);
        int iAlpha2 = android.graphics.Color.alpha(i6);
        int iF = f(iAlpha2, iAlpha);
        return android.graphics.Color.argb(iF, h(android.graphics.Color.red(i6), iAlpha2, android.graphics.Color.red(i10), iAlpha, iF), h(android.graphics.Color.green(i6), iAlpha2, android.graphics.Color.green(i10), iAlpha, iF), h(android.graphics.Color.blue(i6), iAlpha2, android.graphics.Color.blue(i10), iAlpha, iF));
    }

    private static int h(int i6, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((i6 * 255) * i10) + ((i11 * i12) * (255 - i10))) / (i13 * 255);
    }

    private static int i(int i6, int i10, int i11) {
        return i6 < i10 ? i10 : java.lang.Math.min(i6, i11);
    }

    private static double[] j() {
        java.lang.ThreadLocal threadLocal = f21537a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int k(int i6, int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i6 & 16777215) | (i10 << 24);
    }
}
