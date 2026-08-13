package Y0;

/* JADX INFO: loaded from: classes.dex */
final class w implements Z0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16236a;

    public w(float f6) {
        this.f16236a = f6;
    }

    @Override // Z0.a
    public float a(float f6) {
        return f6 / this.f16236a;
    }

    @Override // Z0.a
    public float b(float f6) {
        return f6 * this.f16236a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y0.w) && java.lang.Float.compare(this.f16236a, ((Y0.w) obj).f16236a) == 0;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.f16236a);
    }

    public java.lang.String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f16236a + ')';
    }
}
