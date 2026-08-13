package G;

/* JADX INFO: loaded from: classes.dex */
final class e implements G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f3010a;

    public e(float f6) {
        this.f3010a = f6;
        if (f6 < 0.0f || f6 > 100.0f) {
            throw new java.lang.IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // G.b
    public float a(long j6, Y0.e eVar) {
        return p131n0.m.h(j6) * (this.f3010a / 100.0f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G.e) && java.lang.Float.compare(this.f3010a, ((G.e) obj).f3010a) == 0;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.f3010a);
    }

    public java.lang.String toString() {
        return "CornerSize(size = " + this.f3010a + "%)";
    }
}
