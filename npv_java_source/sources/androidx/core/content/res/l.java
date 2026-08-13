package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final androidx.core.content.res.l f21526k = k(androidx.core.content.res.b.f21495c, (float) ((((double) androidx.core.content.res.b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f21529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f21530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f21531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f21532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f21533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f21534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f21535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f21536j;

    private l(float f6, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f21532f = f6;
        this.f21527a = f10;
        this.f21528b = f11;
        this.f21529c = f12;
        this.f21530d = f13;
        this.f21531e = f14;
        this.f21533g = fArr;
        this.f21534h = f15;
        this.f21535i = f16;
        this.f21536j = f17;
    }

    static androidx.core.content.res.l k(float[] fArr, float f6, float f10, float f11, boolean z6) {
        float[][] fArr2 = androidx.core.content.res.b.f21493a;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = f13 + (fArr3[1] * f14);
        float f16 = fArr[2];
        float f17 = f15 + (fArr3[2] * f16);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[0] * f12) + (fArr4[1] * f14) + (fArr4[2] * f16);
        float[] fArr5 = fArr2[2];
        float f19 = (f12 * fArr5[0]) + (f14 * fArr5[1]) + (f16 * fArr5[2]);
        float f20 = (f11 / 10.0f) + 0.8f;
        float fD = ((double) f20) >= 0.9d ? androidx.core.content.res.b.d(0.59f, 0.69f, (f20 - 0.9f) * 10.0f) : androidx.core.content.res.b.d(0.525f, 0.59f, (f20 - 0.8f) * 10.0f);
        float fExp = z6 ? 1.0f : (1.0f - (((float) java.lang.Math.exp(((-f6) - 42.0f) / 92.0f)) * 0.2777778f)) * f20;
        double d6 = fExp;
        if (d6 > 1.0d) {
            fExp = 1.0f;
        } else if (d6 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp};
        float f21 = 1.0f / ((5.0f * f6) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float fCbrt = (f22 * f6) + (0.1f * f23 * f23 * ((float) java.lang.Math.cbrt(((double) f6) * 5.0d)));
        float fH = androidx.core.content.res.b.h(f10) / fArr[1];
        double d10 = fH;
        float fSqrt = ((float) java.lang.Math.sqrt(d10)) + 1.48f;
        float fPow = 0.725f / ((float) java.lang.Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) java.lang.Math.pow(((double) ((fArr6[0] * fCbrt) * f17)) / 100.0d, 0.42d), (float) java.lang.Math.pow(((double) ((fArr6[1] * fCbrt) * f18)) / 100.0d, 0.42d), (float) java.lang.Math.pow(((double) ((fArr6[2] * fCbrt) * f19)) / 100.0d, 0.42d)};
        float f24 = fArr7[0];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[1];
        float f27 = (f26 * 400.0f) / (f26 + 27.13f);
        float f28 = fArr7[2];
        float[] fArr8 = {f25, f27, (400.0f * f28) / (f28 + 27.13f)};
        return new androidx.core.content.res.l(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f20, fArr6, fCbrt, (float) java.lang.Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f21527a;
    }

    float b() {
        return this.f21530d;
    }

    float c() {
        return this.f21534h;
    }

    float d() {
        return this.f21535i;
    }

    float e() {
        return this.f21532f;
    }

    float f() {
        return this.f21528b;
    }

    float g() {
        return this.f21531e;
    }

    float h() {
        return this.f21529c;
    }

    float[] i() {
        return this.f21533g;
    }

    float j() {
        return this.f21536j;
    }
}
