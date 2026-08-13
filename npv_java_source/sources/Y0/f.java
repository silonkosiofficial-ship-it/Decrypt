package Y0;

/* JADX INFO: loaded from: classes.dex */
final class f implements Y0.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float f16203C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final float f16204D;

    public f(float f6, float f10) {
        this.f16203C = f6;
        this.f16204D = f10;
    }

    @Override // Y0.e
    public /* synthetic */ float B0(float f6) {
        return Y0.d.g(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ int K0(long j6) {
        return Y0.d.a(this, j6);
    }

    @Override // Y0.n
    public /* synthetic */ long O(float f6) {
        return Y0.m.b(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ long P(long j6) {
        return Y0.d.e(this, j6);
    }

    @Override // Y0.e
    public /* synthetic */ int S0(float f6) {
        return Y0.d.b(this, f6);
    }

    @Override // Y0.n
    public /* synthetic */ float X(long j6) {
        return Y0.m.a(this, j6);
    }

    @Override // Y0.e
    public /* synthetic */ long b1(long j6) {
        return Y0.d.h(this, j6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0.f)) {
            return false;
        }
        Y0.f fVar = (Y0.f) obj;
        return java.lang.Float.compare(this.f16203C, fVar.f16203C) == 0 && java.lang.Float.compare(this.f16204D, fVar.f16204D) == 0;
    }

    @Override // Y0.e
    public /* synthetic */ float g1(long j6) {
        return Y0.d.f(this, j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f16203C;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f16203C) * 31) + java.lang.Float.floatToIntBits(this.f16204D);
    }

    @Override // Y0.e
    public /* synthetic */ long k0(float f6) {
        return Y0.d.i(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ float o0(int i6) {
        return Y0.d.d(this, i6);
    }

    @Override // Y0.e
    public /* synthetic */ float q0(float f6) {
        return Y0.d.c(this, f6);
    }

    public java.lang.String toString() {
        return "DensityImpl(density=" + this.f16203C + ", fontScale=" + this.f16204D + ')';
    }

    @Override // Y0.n
    public float v0() {
        return this.f16204D;
    }
}
