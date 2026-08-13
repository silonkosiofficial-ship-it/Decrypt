package p190t;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7153a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p190t.C7153a f54422a = new p190t.C7153a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f54423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f54424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54425d;

    /* JADX INFO: renamed from: t.a$a, reason: collision with other inner class name */
    public static final class C0706a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f54426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f54427b;

        public C0706a(float f6, float f10) {
            this.f54426a = f6;
            this.f54427b = f10;
        }

        public final float a() {
            return this.f54426a;
        }

        public final float b() {
            return this.f54427b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p190t.C7153a.C0706a)) {
                return false;
            }
            p190t.C7153a.C0706a c0706a = (p190t.C7153a.C0706a) obj;
            return java.lang.Float.compare(this.f54426a, c0706a.f54426a) == 0 && java.lang.Float.compare(this.f54427b, c0706a.f54427b) == 0;
        }

        public int hashCode() {
            return (java.lang.Float.floatToIntBits(this.f54426a) * 31) + java.lang.Float.floatToIntBits(this.f54427b);
        }

        public java.lang.String toString() {
            return "FlingResult(distanceCoefficient=" + this.f54426a + ", velocityCoefficient=" + this.f54427b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f54423b = fArr;
        float[] fArr2 = new float[101];
        f54424c = fArr2;
        p190t.z.b(fArr, fArr2, 100);
        f54425d = 8;
    }

    private C7153a() {
    }

    public final double a(float f6, float f10) {
        return java.lang.Math.log(((double) (java.lang.Math.abs(f6) * 0.35f)) / ((double) f10));
    }

    public final p190t.C7153a.C0706a b(float f6) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        float fJ = E7.j.j(f6, 0.0f, 1.0f);
        float f12 = 100;
        int i6 = (int) (f12 * fJ);
        if (i6 < 100) {
            float f13 = i6 / f12;
            int i10 = i6 + 1;
            float f14 = i10 / f12;
            float[] fArr = f54423b;
            float f15 = fArr[i6];
            float f16 = (fArr[i10] - f15) / (f14 - f13);
            float f17 = ((fJ - f13) * f16) + f15;
            f10 = f16;
            f11 = f17;
        }
        return new p190t.C7153a.C0706a(f11, f10);
    }
}
