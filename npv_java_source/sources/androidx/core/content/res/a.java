package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f21486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f21487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f21488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f21489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f21490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f21491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f21492i;

    a(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f21484a = f6;
        this.f21485b = f10;
        this.f21486c = f11;
        this.f21487d = f12;
        this.f21488e = f13;
        this.f21489f = f14;
        this.f21490g = f15;
        this.f21491h = f16;
        this.f21492i = f17;
    }

    private static androidx.core.content.res.a b(float f6, float f10, float f11) {
        float f12 = 100.0f;
        float f13 = 1000.0f;
        float f14 = 0.0f;
        androidx.core.content.res.a aVar = null;
        float f15 = 1000.0f;
        while (java.lang.Math.abs(f14 - f12) > 0.01f) {
            float f16 = ((f12 - f14) / 2.0f) + f14;
            int iP = e(f16, f10, f6).p();
            float fB = androidx.core.content.res.b.b(iP);
            float fAbs = java.lang.Math.abs(f11 - fB);
            if (fAbs < 0.2f) {
                androidx.core.content.res.a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f6));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f13 = fAbs;
                    f15 = fA;
                }
            }
            if (f13 == 0.0f && f15 == 0.0f) {
                break;
            }
            if (fB < f11) {
                f14 = f16;
            } else {
                f12 = f16;
            }
        }
        return aVar;
    }

    static androidx.core.content.res.a c(int i6) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i6, androidx.core.content.res.l.f21526k, fArr, fArr2);
        return new androidx.core.content.res.a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i6, androidx.core.content.res.l lVar, float[] fArr, float[] fArr2) {
        androidx.core.content.res.b.f(i6, fArr2);
        float[][] fArr3 = androidx.core.content.res.b.f21493a;
        float f6 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f10 = fArr4[0] * f6;
        float f11 = fArr2[1];
        float f12 = f10 + (fArr4[1] * f11);
        float f13 = fArr2[2];
        float f14 = f12 + (fArr4[2] * f13);
        float[] fArr5 = fArr3[1];
        float f15 = (fArr5[0] * f6) + (fArr5[1] * f11) + (fArr5[2] * f13);
        float[] fArr6 = fArr3[2];
        float f16 = (f6 * fArr6[0]) + (f11 * fArr6[1]) + (f13 * fArr6[2]);
        float f17 = lVar.i()[0] * f14;
        float f18 = lVar.i()[1] * f15;
        float f19 = lVar.i()[2] * f16;
        float fPow = (float) java.lang.Math.pow(((double) (lVar.c() * java.lang.Math.abs(f17))) / 100.0d, 0.42d);
        float fPow2 = (float) java.lang.Math.pow(((double) (lVar.c() * java.lang.Math.abs(f18))) / 100.0d, 0.42d);
        float fPow3 = (float) java.lang.Math.pow(((double) (lVar.c() * java.lang.Math.abs(f19))) / 100.0d, 0.42d);
        float fSignum = ((java.lang.Math.signum(f17) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((java.lang.Math.signum(f18) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((java.lang.Math.signum(f19) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d6 = fSignum3;
        float f20 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d6)) / 11.0f;
        float f21 = ((float) (((double) (fSignum + fSignum2)) - (d6 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = (((fSignum * 20.0f) + f22) + (21.0f * fSignum3)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) java.lang.Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) java.lang.Math.pow((f24 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float fB = (4.0f / lVar.b()) * ((float) java.lang.Math.sqrt(fPow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float fPow5 = ((float) java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) java.lang.Math.pow((((((((float) (java.lang.Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) java.lang.Math.sqrt((f20 * f20) + (f21 * f21)))) / (f23 + 0.305f), 0.9d));
        float fSqrt = ((float) java.lang.Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fD = lVar.d() * fSqrt;
        float fSqrt2 = ((float) java.lang.Math.sqrt((fPow5 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f26 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) java.lang.Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d10 = f25;
        float fCos = ((float) java.lang.Math.cos(d10)) * fLog;
        float fSin = fLog * ((float) java.lang.Math.sin(d10));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f26;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static androidx.core.content.res.a e(float f6, float f10, float f11) {
        return f(f6, f10, f11, androidx.core.content.res.l.f21526k);
    }

    private static androidx.core.content.res.a f(float f6, float f10, float f11, androidx.core.content.res.l lVar) {
        double d6 = ((double) f6) / 100.0d;
        float fB = (4.0f / lVar.b()) * ((float) java.lang.Math.sqrt(d6)) * (lVar.a() + 4.0f) * lVar.d();
        float fD = f10 * lVar.d();
        float fSqrt = ((float) java.lang.Math.sqrt(((f10 / ((float) java.lang.Math.sqrt(d6))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f12 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float fLog = ((float) java.lang.Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new androidx.core.content.res.a(f11, f10, f6, fB, fD, fSqrt, f12, fLog * ((float) java.lang.Math.cos(d10)), fLog * ((float) java.lang.Math.sin(d10)));
    }

    public static int m(float f6, float f10, float f11) {
        return n(f6, f10, f11, androidx.core.content.res.l.f21526k);
    }

    static int n(float f6, float f10, float f11, androidx.core.content.res.l lVar) {
        if (f10 < 1.0d || java.lang.Math.round(f11) <= 0.0d || java.lang.Math.round(f11) >= 100.0d) {
            return androidx.core.content.res.b.a(f11);
        }
        float fMin = f6 < 0.0f ? 0.0f : java.lang.Math.min(360.0f, f6);
        androidx.core.content.res.a aVar = null;
        boolean z6 = true;
        float f12 = 0.0f;
        float f13 = f10;
        while (java.lang.Math.abs(f12 - f10) >= 0.4f) {
            androidx.core.content.res.a aVarB = b(fMin, f13, f11);
            if (!z6) {
                if (aVarB == null) {
                    f10 = f13;
                } else {
                    f12 = f13;
                    aVar = aVarB;
                }
                f13 = ((f10 - f12) / 2.0f) + f12;
            } else {
                if (aVarB != null) {
                    return aVarB.o(lVar);
                }
                f13 = ((f10 - f12) / 2.0f) + f12;
                z6 = false;
            }
        }
        return aVar == null ? androidx.core.content.res.b.a(f11) : aVar.o(lVar);
    }

    float a(androidx.core.content.res.a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (java.lang.Math.pow(java.lang.Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f21491h;
    }

    float h() {
        return this.f21492i;
    }

    float i() {
        return this.f21485b;
    }

    float j() {
        return this.f21484a;
    }

    float k() {
        return this.f21486c;
    }

    float l() {
        return this.f21490g;
    }

    int o(androidx.core.content.res.l lVar) {
        float fPow = (float) java.lang.Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) java.lang.Math.sqrt(((double) k()) / 100.0d)))) / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (java.lang.Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = lVar.a() * ((float) java.lang.Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float fG = fCos * 3846.1538f * lVar.g() * lVar.h();
        float f6 = fA / lVar.f();
        float fSin = (float) java.lang.Math.sin(dJ);
        float fCos2 = (float) java.lang.Math.cos(dJ);
        float f10 = (((0.305f + f6) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = f6 * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
        float fSignum = java.lang.Math.signum(f14) * (100.0f / lVar.c()) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f14)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f14)))), 2.380952380952381d));
        float fSignum2 = java.lang.Math.signum(f15) * (100.0f / lVar.c()) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f15)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f15)))), 2.380952380952381d));
        float fSignum3 = java.lang.Math.signum(f16) * (100.0f / lVar.c()) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f16)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f16)))), 2.380952380952381d));
        float f17 = fSignum / lVar.i()[0];
        float f18 = fSignum2 / lVar.i()[1];
        float f19 = fSignum3 / lVar.i()[2];
        float[][] fArr = androidx.core.content.res.b.f21494b;
        float[] fArr2 = fArr[0];
        float f20 = (fArr2[0] * f17) + (fArr2[1] * f18) + (fArr2[2] * f19);
        float[] fArr3 = fArr[1];
        float f21 = (fArr3[0] * f17) + (fArr3[1] * f18) + (fArr3[2] * f19);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.b(f20, f21, (f17 * fArr4[0]) + (f18 * fArr4[1]) + (f19 * fArr4[2]));
    }

    int p() {
        return o(androidx.core.content.res.l.f21526k);
    }
}
