package p151p0;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f52714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f52715b;

    public z(float f6, float f10) {
        this.f52714a = f6;
        this.f52715b = f10;
    }

    public z(float f6, float f10, float f11) {
        this(f6, f10, f11, f6 + f10 + f11);
    }

    private z(float f6, float f10, float f11, float f12) {
        this(f6 / f12, f10 / f12);
    }

    public final float a() {
        return this.f52714a;
    }

    public final float b() {
        return this.f52715b;
    }

    public final float[] c() {
        float f6 = this.f52714a;
        float f10 = this.f52715b;
        return new float[]{f6 / f10, 1.0f, ((1.0f - f6) - f10) / f10};
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p151p0.z)) {
            return false;
        }
        p151p0.z zVar = (p151p0.z) obj;
        return java.lang.Float.compare(this.f52714a, zVar.f52714a) == 0 && java.lang.Float.compare(this.f52715b, zVar.f52715b) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f52714a) * 31) + java.lang.Float.floatToIntBits(this.f52715b);
    }

    public java.lang.String toString() {
        return "WhitePoint(x=" + this.f52714a + ", y=" + this.f52715b + ')';
    }
}
