package A0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f192a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f193b;

    public static final void c(A0.d dVar, p251z0.B b6) {
        if (f192a) {
            e(dVar, b6);
        } else {
            d(dVar, b6);
        }
    }

    private static final void d(A0.d dVar, p251z0.B b6) {
        if (p251z0.AbstractC7381q.b(b6)) {
            dVar.f(b6.h());
            dVar.e();
        }
        long jK = b6.k();
        java.util.List listE = b6.e();
        int size = listE.size();
        int i6 = 0;
        while (i6 < size) {
            p251z0.C7370f c7370f = (p251z0.C7370f) listE.get(i6);
            long jQ = p131n0.g.q(c7370f.b(), jK);
            long jB = c7370f.b();
            dVar.f(p131n0.g.r(dVar.c(), jQ));
            dVar.a(c7370f.c(), dVar.c());
            i6++;
            jK = jB;
        }
        dVar.f(p131n0.g.r(dVar.c(), p131n0.g.q(b6.h(), jK)));
        dVar.a(b6.o(), dVar.c());
    }

    private static final void e(A0.d dVar, p251z0.B b6) {
        if (p251z0.AbstractC7381q.b(b6)) {
            dVar.e();
        }
        if (!p251z0.AbstractC7381q.d(b6)) {
            java.util.List listE = b6.e();
            int size = listE.size();
            for (int i6 = 0; i6 < size; i6++) {
                p251z0.C7370f c7370f = (p251z0.C7370f) listE.get(i6);
                dVar.a(c7370f.c(), c7370f.a());
            }
            dVar.a(b6.o(), b6.g());
        }
        if (p251z0.AbstractC7381q.d(b6) && b6.o() - dVar.d() > 40) {
            dVar.e();
        }
        dVar.g(b6.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float[] fArr, float[] fArr2, int i6, boolean z6) {
        int i10 = i6 - 1;
        float f6 = fArr2[i10];
        float fSignum = 0.0f;
        int i11 = i10;
        while (i11 > 0) {
            int i12 = i11 - 1;
            float f10 = fArr2[i12];
            if (f6 != f10) {
                float f11 = (z6 ? -fArr[i12] : fArr[i11] - fArr[i12]) / (f6 - f10);
                fSignum += (f11 - (java.lang.Math.signum(fSignum) * ((float) java.lang.Math.sqrt(2 * java.lang.Math.abs(fSignum))))) * java.lang.Math.abs(f11);
                if (i11 == i10) {
                    fSignum *= 0.5f;
                }
            }
            i11--;
            f6 = f10;
        }
        return java.lang.Math.signum(fSignum) * ((float) java.lang.Math.sqrt(2 * java.lang.Math.abs(fSignum)));
    }

    private static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < length; i6++) {
            f6 += fArr[i6] * fArr2[i6];
        }
        return f6;
    }

    public static final boolean h() {
        return f193b;
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i6, int i10, float[] fArr3) {
        int i11 = i10;
        if (i11 < 1) {
            C0.a.a("The degree must be at positive integer");
        }
        if (i6 == 0) {
            C0.a.a("At least one point must be provided");
        }
        if (i11 >= i6) {
            i11 = i6 - 1;
        }
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i6];
        }
        for (int i14 = 0; i14 < i6; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i6];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] fArr7 = fArr5[i18];
            p097j7.AbstractC6872n.i(fArr4[i18], fArr7, 0, 0, i6);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr8 = fArr5[i19];
                float fG = g(fArr7, fArr8);
                for (int i20 = 0; i20 < i6; i20++) {
                    fArr7[i20] = fArr7[i20] - (fArr8[i20] * fG);
                }
            }
            float fSqrt = (float) java.lang.Math.sqrt(g(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f6 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i6; i21++) {
                fArr7[i21] = fArr7[i21] * f6;
            }
            float[] fArr9 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr9[i22] = i22 < i18 ? 0.0f : g(fArr7, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fG2 = g(fArr5[i23], fArr2);
            float[] fArr10 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fG2 -= fArr10[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fG2 / fArr10[i23];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(A0.a[] aVarArr, int i6, long j6, float f6) {
        A0.a aVar = aVarArr[i6];
        if (aVar == null) {
            aVarArr[i6] = new A0.a(j6, f6);
        } else {
            aVar.d(j6);
            aVar.c(f6);
        }
    }
}
