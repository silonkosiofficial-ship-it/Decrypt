package p200u;

/* JADX INFO: renamed from: u.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7198z implements p200u.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f55130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f55131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f55132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f55133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f55134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f55135f;

    public C7198z(float f6, float f10, float f11, float f12) {
        this.f55130a = f6;
        this.f55131b = f10;
        this.f55132c = f11;
        this.f55133d = f12;
        if (!((java.lang.Float.isNaN(f6) || java.lang.Float.isNaN(f10) || java.lang.Float.isNaN(f11) || java.lang.Float.isNaN(f12)) ? false : true)) {
            p200u.AbstractC7166e0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f6 + ", " + f10 + ", " + f11 + ", " + f12 + '.');
        }
        long jB = p141o0.AbstractC6957e0.b(0.0f, f10, f12, 1.0f, new float[5], 0);
        this.f55134e = java.lang.Float.intBitsToFloat((int) (jB >> 32));
        this.f55135f = java.lang.Float.intBitsToFloat((int) (jB & 4294967295L));
    }

    private final void b(float f6) {
        throw new java.lang.IllegalArgumentException("The cubic curve with parameters (" + this.f55130a + ", " + this.f55131b + ", " + this.f55132c + ", " + this.f55133d + ") has no solution at " + f6);
    }

    @Override // p200u.F
    public float a(float f6) {
        if (f6 <= 0.0f || f6 >= 1.0f) {
            return f6;
        }
        float fE = p141o0.AbstractC6957e0.e(0.0f - f6, this.f55130a - f6, this.f55132c - f6, 1.0f - f6);
        if (java.lang.Float.isNaN(fE)) {
            b(f6);
        }
        float fC = p141o0.AbstractC6957e0.c(this.f55131b, this.f55133d, fE);
        float f10 = this.f55134e;
        float f11 = this.f55135f;
        if (fC < f10) {
            fC = f10;
        }
        return fC > f11 ? f11 : fC;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p200u.C7198z) {
            p200u.C7198z c7198z = (p200u.C7198z) obj;
            if (this.f55130a == c7198z.f55130a && this.f55131b == c7198z.f55131b && this.f55132c == c7198z.f55132c && this.f55133d == c7198z.f55133d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.f55130a) * 31) + java.lang.Float.floatToIntBits(this.f55131b)) * 31) + java.lang.Float.floatToIntBits(this.f55132c)) * 31) + java.lang.Float.floatToIntBits(this.f55133d);
    }

    public java.lang.String toString() {
        return "CubicBezierEasing(a=" + this.f55130a + ", b=" + this.f55131b + ", c=" + this.f55132c + ", d=" + this.f55133d + ')';
    }
}
