package p190t;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i6) {
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < i6; i10++) {
            float f19 = i10 / i6;
            float f20 = 1.0f;
            while (true) {
                f6 = ((f20 - f17) / 2.0f) + f17;
                f10 = 1.0f - f6;
                f11 = f6 * 3.0f * f10;
                f12 = f6 * f6 * f6;
                float f21 = (((f10 * 0.175f) + (f6 * 0.35000002f)) * f11) + f12;
                if (java.lang.Math.abs(f21 - f19) < 1.0E-5d) {
                    break;
                } else if (f21 > f19) {
                    f20 = f6;
                } else {
                    f17 = f6;
                }
            }
            float f22 = 0.5f;
            fArr[i10] = (f11 * ((f10 * 0.5f) + f6)) + f12;
            float f23 = 1.0f;
            while (true) {
                f13 = ((f23 - f18) / 2.0f) + f18;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f24 = (((f14 * f22) + f13) * f15) + f16;
                if (java.lang.Math.abs(f24 - f19) >= 1.0E-5d) {
                    if (f24 > f19) {
                        f23 = f13;
                    } else {
                        f18 = f13;
                    }
                    f22 = 0.5f;
                }
            }
            fArr2[i10] = (f15 * ((f14 * 0.175f) + (f13 * 0.35000002f))) + f16;
        }
        fArr2[i6] = 1.0f;
        fArr[i6] = 1.0f;
    }

    public static final p200u.B c(Y0.e eVar) {
        return p200u.D.d(new p190t.A(eVar));
    }
}
