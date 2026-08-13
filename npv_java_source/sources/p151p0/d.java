package p151p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final double a(double d6, double d10, double d11, double d12, double d13, double d14) {
        return java.lang.Math.copySign(o(d6 < 0.0d ? -d6 : d6, d10, d11, d12, d13, d14), d6);
    }

    public static final double b(double d6, double d10, double d11, double d12, double d13, double d14) {
        return java.lang.Math.copySign(q(d6 < 0.0d ? -d6 : d6, d10, d11, d12, d13, d14), d6);
    }

    public static final p151p0.c c(p151p0.c cVar, p151p0.z zVar, p151p0.AbstractC7025a abstractC7025a) {
        if (!p151p0.b.e(cVar.e(), p151p0.b.f52614a.b())) {
            return cVar;
        }
        p247y7.AbstractC7350t.d(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        p151p0.x xVar = (p151p0.x) cVar;
        if (f(xVar.N(), zVar)) {
            return cVar;
        }
        return new p151p0.x(xVar, l(e(abstractC7025a.b(), xVar.N().c(), zVar.c()), xVar.M()), zVar);
    }

    public static /* synthetic */ p151p0.c d(p151p0.c cVar, p151p0.z zVar, p151p0.AbstractC7025a abstractC7025a, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            abstractC7025a = p151p0.AbstractC7025a.f52609b.a();
        }
        return c(cVar, zVar, abstractC7025a);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final boolean f(p151p0.z zVar, p151p0.z zVar2) {
        if (zVar == zVar2) {
            return true;
        }
        return java.lang.Math.abs(zVar.a() - zVar2.a()) < 0.001f && java.lang.Math.abs(zVar.b() - zVar2.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (java.lang.Float.compare(fArr[i6], fArr2[i6]) != 0 && java.lang.Math.abs(fArr[i6] - fArr2[i6]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final p151p0.h h(p151p0.c cVar, p151p0.c cVar2, int i6) {
        int iB = cVar.b();
        int iB2 = cVar2.b();
        if ((iB | iB2) < 0) {
            return j(cVar, cVar2, i6);
        }
        p170r.C cA = p151p0.i.a();
        int i10 = iB | (iB2 << 6) | (i6 << 12);
        java.lang.Object objC = cA.c(i10);
        if (objC == null) {
            objC = j(cVar, cVar2, i6);
            cA.s(i10, objC);
        }
        return (p151p0.h) objC;
    }

    public static /* synthetic */ p151p0.h i(p151p0.c cVar, p151p0.c cVar2, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            cVar2 = p151p0.g.f52623a.w();
        }
        if ((i10 & 2) != 0) {
            i6 = p151p0.n.f52675a.b();
        }
        return h(cVar, cVar2, i6);
    }

    private static final p151p0.h j(p151p0.c cVar, p151p0.c cVar2, int i6) {
        p151p0.h hVar;
        if (cVar == cVar2) {
            return p151p0.h.f52647g.c(cVar);
        }
        long jE = cVar.e();
        p0.b.a aVar = p151p0.b.f52614a;
        p247y7.AbstractC7342k abstractC7342k = null;
        if (p151p0.b.e(jE, aVar.b()) && p151p0.b.e(cVar2.e(), aVar.b())) {
            p247y7.AbstractC7350t.d(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            p247y7.AbstractC7350t.d(cVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            hVar = new p0.h.b((p151p0.x) cVar, (p151p0.x) cVar2, i6, abstractC7342k);
        } else {
            hVar = new p151p0.h(cVar, cVar2, i6, abstractC7342k);
        }
        return hVar;
    }

    public static final float[] k(float[] fArr) {
        float f6 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f6 * f18) + (f10 * f19) + (f11 * f20);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f6) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f6)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f6)) / f21;
        fArr2[8] = ((f6 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f10 = fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        float f15 = (f6 * f10) + (f11 * f12) + (f13 * f14);
        float f16 = fArr[1];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = (f16 * f10) + (f17 * f12) + (f18 * f14);
        float f20 = fArr[2];
        float f21 = fArr[5];
        float f22 = fArr[8];
        float f23 = (f10 * f20) + (f12 * f21) + (f14 * f22);
        float f24 = fArr2[3];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        float f27 = (f6 * f24) + (f11 * f25) + (f13 * f26);
        float f28 = (f16 * f24) + (f17 * f25) + (f18 * f26);
        float f29 = (f24 * f20) + (f25 * f21) + (f26 * f22);
        float f30 = fArr2[6];
        float f31 = fArr2[7];
        float f32 = (f6 * f30) + (f11 * f31);
        float f33 = fArr2[8];
        return new float[]{f15, f19, f23, f27, f28, f29, f32 + (f13 * f33), (f16 * f30) + (f17 * f31) + (f18 * f33), (f20 * f30) + (f21 * f31) + (f22 * f33)};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f10 = fArr2[0] * f6;
        float f11 = fArr[1];
        float f12 = fArr2[1] * f11;
        float f13 = fArr[2];
        return new float[]{f10, f12, fArr2[2] * f13, fArr2[3] * f6, fArr2[4] * f11, fArr2[5] * f13, f6 * fArr2[6], f11 * fArr2[7], f13 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        float f6 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[0] * f6) + (fArr[3] * f10) + (fArr[6] * f11);
        fArr2[1] = (fArr[1] * f6) + (fArr[4] * f10) + (fArr[7] * f11);
        fArr2[2] = (fArr[2] * f6) + (fArr[5] * f10) + (fArr[8] * f11);
        return fArr2;
    }

    public static final double o(double d6, double d10, double d11, double d12, double d13, double d14) {
        return d6 >= d13 * d12 ? (java.lang.Math.pow(d6, 1.0d / d14) - d11) / d10 : d6 / d12;
    }

    public static final double p(double d6, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return d6 >= d13 * d12 ? (java.lang.Math.pow(d6 - d14, 1.0d / d16) - d11) / d10 : (d6 - d15) / d12;
    }

    public static final double q(double d6, double d10, double d11, double d12, double d13, double d14) {
        return d6 >= d13 ? java.lang.Math.pow((d10 * d6) + d11, d14) : d6 * d12;
    }

    public static final double r(double d6, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return d6 >= d13 ? java.lang.Math.pow((d10 * d6) + d11, d16) + d14 : (d12 * d6) + d15;
    }
}
