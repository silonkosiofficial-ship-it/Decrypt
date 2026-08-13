package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class J1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0.J1.a f52134b = new o0.J1.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f52135a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private /* synthetic */ J1(float[] fArr) {
        this.f52135a = fArr;
    }

    public static final /* synthetic */ p141o0.J1 a(float[] fArr) {
        return new p141o0.J1(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i6, p247y7.AbstractC7342k abstractC7342k) {
        if ((i6 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, java.lang.Object obj) {
        return (obj instanceof p141o0.J1) && p247y7.AbstractC7350t.b(fArr, ((p141o0.J1) obj).r());
    }

    public static int e(float[] fArr) {
        return java.util.Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j6) {
        float fM = p131n0.g.m(j6);
        float fN = p131n0.g.n(j6);
        float f6 = 1 / (((fArr[3] * fM) + (fArr[7] * fN)) + fArr[15]);
        if (java.lang.Float.isInfinite(f6) || java.lang.Float.isNaN(f6)) {
            f6 = 0.0f;
        }
        return p131n0.h.a(((fArr[0] * fM) + (fArr[4] * fN) + fArr[12]) * f6, f6 * ((fArr[1] * fM) + (fArr[5] * fN) + fArr[13]));
    }

    public static final void g(float[] fArr, p131n0.e eVar) {
        long jF = f(fArr, p131n0.h.a(eVar.b(), eVar.d()));
        long jF2 = f(fArr, p131n0.h.a(eVar.b(), eVar.a()));
        long jF3 = f(fArr, p131n0.h.a(eVar.c(), eVar.d()));
        long jF4 = f(fArr, p131n0.h.a(eVar.c(), eVar.a()));
        eVar.i(java.lang.Math.min(java.lang.Math.min(p131n0.g.m(jF), p131n0.g.m(jF2)), java.lang.Math.min(p131n0.g.m(jF3), p131n0.g.m(jF4))));
        eVar.k(java.lang.Math.min(java.lang.Math.min(p131n0.g.n(jF), p131n0.g.n(jF2)), java.lang.Math.min(p131n0.g.n(jF3), p131n0.g.n(jF4))));
        eVar.j(java.lang.Math.max(java.lang.Math.max(p131n0.g.m(jF), p131n0.g.m(jF2)), java.lang.Math.max(p131n0.g.m(jF3), p131n0.g.m(jF4))));
        eVar.h(java.lang.Math.max(java.lang.Math.max(p131n0.g.n(jF), p131n0.g.n(jF2)), java.lang.Math.max(p131n0.g.n(jF3), p131n0.g.n(jF4))));
    }

    public static final void h(float[] fArr) {
        int i6 = 0;
        while (i6 < 4) {
            int i10 = 0;
            while (i10 < 4) {
                fArr[(i10 * 4) + i6] = i6 == i10 ? 1.0f : 0.0f;
                i10++;
            }
            i6++;
        }
    }

    public static final void i(float[] fArr, float f6) {
        double d6 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) java.lang.Math.cos(d6);
        float fSin = (float) java.lang.Math.sin(d6);
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[9];
        float f15 = fArr[10];
        float f16 = fArr[13];
        float f17 = fArr[14];
        fArr[1] = (f10 * fCos) - (f11 * fSin);
        fArr[2] = (f10 * fSin) + (f11 * fCos);
        fArr[5] = (f12 * fCos) - (f13 * fSin);
        fArr[6] = (f12 * fSin) + (f13 * fCos);
        fArr[9] = (f14 * fCos) - (f15 * fSin);
        fArr[10] = (f14 * fSin) + (f15 * fCos);
        fArr[13] = (f16 * fCos) - (f17 * fSin);
        fArr[14] = (f16 * fSin) + (f17 * fCos);
    }

    public static final void j(float[] fArr, float f6) {
        double d6 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) java.lang.Math.cos(d6);
        float fSin = (float) java.lang.Math.sin(d6);
        float f10 = fArr[0];
        float f11 = fArr[2];
        float f12 = fArr[4];
        float f13 = fArr[6];
        float f14 = fArr[8];
        float f15 = fArr[10];
        float f16 = fArr[12];
        float f17 = fArr[14];
        fArr[0] = (f10 * fCos) + (f11 * fSin);
        fArr[2] = ((-f10) * fSin) + (f11 * fCos);
        fArr[4] = (f12 * fCos) + (f13 * fSin);
        fArr[6] = ((-f12) * fSin) + (f13 * fCos);
        fArr[8] = (f14 * fCos) + (f15 * fSin);
        fArr[10] = ((-f14) * fSin) + (f15 * fCos);
        fArr[12] = (f16 * fCos) + (f17 * fSin);
        fArr[14] = ((-f16) * fSin) + (f17 * fCos);
    }

    public static final void k(float[] fArr, float f6) {
        double d6 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) java.lang.Math.cos(d6);
        float fSin = (float) java.lang.Math.sin(d6);
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = (fCos * f10) + (fSin * f11);
        float f13 = -fSin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = (fCos * f14) + (fSin * f15);
        float f17 = fArr[2];
        float f18 = fArr[6];
        float f19 = (fCos * f17) + (fSin * f18);
        float f20 = fArr[3];
        float f21 = fArr[7];
        fArr[0] = f12;
        fArr[1] = f16;
        fArr[2] = f19;
        fArr[3] = (fCos * f20) + (fSin * f21);
        fArr[4] = (f10 * f13) + (f11 * fCos);
        fArr[5] = (f14 * f13) + (f15 * fCos);
        fArr[6] = (f17 * f13) + (f18 * fCos);
        fArr[7] = (f13 * f20) + (fCos * f21);
    }

    public static final void l(float[] fArr, float f6, float f10, float f11) {
        fArr[0] = fArr[0] * f6;
        fArr[1] = fArr[1] * f6;
        fArr[2] = fArr[2] * f6;
        fArr[3] = fArr[3] * f6;
        fArr[4] = fArr[4] * f10;
        fArr[5] = fArr[5] * f10;
        fArr[6] = fArr[6] * f10;
        fArr[7] = fArr[7] * f10;
        fArr[8] = fArr[8] * f11;
        fArr[9] = fArr[9] * f11;
        fArr[10] = fArr[10] * f11;
        fArr[11] = fArr[11] * f11;
    }

    public static /* synthetic */ void m(float[] fArr, float f6, float f10, float f11, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i6 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i6 & 4) != 0) {
            f11 = 1.0f;
        }
        l(fArr, f6, f10, f11);
    }

    public static final void n(float[] fArr, float[] fArr2) {
        float fB = p141o0.K1.b(fArr, 0, fArr2, 0);
        float fB2 = p141o0.K1.b(fArr, 0, fArr2, 1);
        float fB3 = p141o0.K1.b(fArr, 0, fArr2, 2);
        float fB4 = p141o0.K1.b(fArr, 0, fArr2, 3);
        float fB5 = p141o0.K1.b(fArr, 1, fArr2, 0);
        float fB6 = p141o0.K1.b(fArr, 1, fArr2, 1);
        float fB7 = p141o0.K1.b(fArr, 1, fArr2, 2);
        float fB8 = p141o0.K1.b(fArr, 1, fArr2, 3);
        float fB9 = p141o0.K1.b(fArr, 2, fArr2, 0);
        float fB10 = p141o0.K1.b(fArr, 2, fArr2, 1);
        float fB11 = p141o0.K1.b(fArr, 2, fArr2, 2);
        float fB12 = p141o0.K1.b(fArr, 2, fArr2, 3);
        float fB13 = p141o0.K1.b(fArr, 3, fArr2, 0);
        float fB14 = p141o0.K1.b(fArr, 3, fArr2, 1);
        float fB15 = p141o0.K1.b(fArr, 3, fArr2, 2);
        float fB16 = p141o0.K1.b(fArr, 3, fArr2, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static java.lang.String o(float[] fArr) {
        return S8.r.o("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void p(float[] fArr, float f6, float f10, float f11) {
        float f12 = (fArr[0] * f6) + (fArr[4] * f10) + (fArr[8] * f11) + fArr[12];
        float f13 = (fArr[1] * f6) + (fArr[5] * f10) + (fArr[9] * f11) + fArr[13];
        float f14 = (fArr[2] * f6) + (fArr[6] * f10) + (fArr[10] * f11) + fArr[14];
        float f15 = (fArr[3] * f6) + (fArr[7] * f10) + (fArr[11] * f11) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public static /* synthetic */ void q(float[] fArr, float f6, float f10, float f11, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i6 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i6 & 4) != 0) {
            f11 = 0.0f;
        }
        p(fArr, f6, f10, f11);
    }

    public boolean equals(java.lang.Object obj) {
        return d(this.f52135a, obj);
    }

    public int hashCode() {
        return e(this.f52135a);
    }

    public final /* synthetic */ float[] r() {
        return this.f52135a;
    }

    public java.lang.String toString() {
        return o(this.f52135a);
    }
}
