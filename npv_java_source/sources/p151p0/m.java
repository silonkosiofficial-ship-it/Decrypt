package p151p0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p151p0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0.m.a f52670e = new p0.m.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f52671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float[] f52672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f52673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float[] f52674i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        float[] fArrB = p151p0.AbstractC7025a.f52609b.a().b();
        p151p0.k kVar = p151p0.k.f52658a;
        float[] fArrL = p151p0.d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, p151p0.d.e(fArrB, kVar.b().c(), kVar.e().c()));
        f52671f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f52672g = fArr;
        f52673h = p151p0.d.k(fArrL);
        f52674i = p151p0.d.k(fArr);
    }

    public m(java.lang.String str, int i6) {
        super(str, p151p0.b.f52614a.a(), i6, null);
    }

    @Override // p151p0.c
    public float c(int i6) {
        return i6 == 0 ? 1.0f : 0.5f;
    }

    @Override // p151p0.c
    public float d(int i6) {
        return i6 == 0 ? 0.0f : -0.5f;
    }

    @Override // p151p0.c
    public long h(float f6, float f10, float f11) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f52674i;
        float f13 = (fArr[0] * f6) + (fArr[3] * f10) + (fArr[6] * f12);
        float f14 = (fArr[1] * f6) + (fArr[4] * f10) + (fArr[7] * f12);
        float f15 = (fArr[2] * f6) + (fArr[5] * f10) + (fArr[8] * f12);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f52673h;
        return (((long) java.lang.Float.floatToRawIntBits(((fArr2[0] * f16) + (fArr2[3] * f17)) + (fArr2[6] * f18))) << 32) | (((long) java.lang.Float.floatToRawIntBits((fArr2[1] * f16) + (fArr2[4] * f17) + (fArr2[7] * f18))) & 4294967295L);
    }

    @Override // p151p0.c
    public float i(float f6, float f10, float f11) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f52674i;
        float f13 = (fArr[0] * f6) + (fArr[3] * f10) + (fArr[6] * f12);
        float f14 = (fArr[1] * f6) + (fArr[4] * f10) + (fArr[7] * f12);
        float f15 = (fArr[2] * f6) + (fArr[5] * f10) + (fArr[8] * f12);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float[] fArr2 = f52673h;
        return (fArr2[2] * f16) + (fArr2[5] * f17) + (fArr2[8] * f15 * f15 * f15);
    }

    @Override // p151p0.c
    public long j(float f6, float f10, float f11, float f12, p151p0.c cVar) {
        float[] fArr = f52671f;
        float f13 = (fArr[0] * f6) + (fArr[3] * f10) + (fArr[6] * f11);
        float f14 = (fArr[1] * f6) + (fArr[4] * f10) + (fArr[7] * f11);
        float f15 = (fArr[2] * f6) + (fArr[5] * f10) + (fArr[8] * f11);
        float fA = p002a1.b.a(f13);
        float fA2 = p002a1.b.a(f14);
        float fA3 = p002a1.b.a(f15);
        float[] fArr2 = f52672g;
        return p141o0.A0.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), f12, cVar);
    }
}
