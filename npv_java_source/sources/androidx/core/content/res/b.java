package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final float[][] f21493a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float[][] f21494b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final float[] f21495c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float[][] f21496d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f6) {
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f10 = (f6 + 16.0f) / 116.0f;
        float f11 = f6 > 8.0f ? f10 * f10 * f10 : f6 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z6 = f12 > 0.008856452f;
        float f13 = z6 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z6) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f21495c;
        return androidx.core.graphics.a.b(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    static float b(int i6) {
        return c(g(i6));
    }

    static float c(float f6) {
        float f10 = f6 / 100.0f;
        return f10 <= 0.008856452f ? f10 * 903.2963f : (((float) java.lang.Math.cbrt(f10)) * 116.0f) - 16.0f;
    }

    static float d(float f6, float f10, float f11) {
        return f6 + ((f10 - f6) * f11);
    }

    static float e(int i6) {
        float f6 = i6 / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) java.lang.Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static void f(int i6, float[] fArr) {
        float fE = e(android.graphics.Color.red(i6));
        float fE2 = e(android.graphics.Color.green(i6));
        float fE3 = e(android.graphics.Color.blue(i6));
        float[][] fArr2 = f21496d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fE) + (fArr3[1] * fE2) + (fArr3[2] * fE3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fE) + (fArr4[1] * fE2) + (fArr4[2] * fE3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fE * fArr5[0]) + (fE2 * fArr5[1]) + (fE3 * fArr5[2]);
    }

    static float g(int i6) {
        float fE = e(android.graphics.Color.red(i6));
        float fE2 = e(android.graphics.Color.green(i6));
        float fE3 = e(android.graphics.Color.blue(i6));
        float[] fArr = f21496d[1];
        return (fE * fArr[0]) + (fE2 * fArr[1]) + (fE3 * fArr[2]);
    }

    static float h(float f6) {
        return (f6 > 8.0f ? (float) java.lang.Math.pow((((double) f6) + 16.0d) / 116.0d, 3.0d) : f6 / 903.2963f) * 100.0f;
    }
}
