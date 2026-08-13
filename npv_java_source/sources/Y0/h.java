package Y0;

/* JADX INFO: loaded from: classes.dex */
final class h implements Y0.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float f16205C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final float f16206D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Z0.a f16207E;

    public h(float f6, float f10, Z0.a aVar) {
        this.f16205C = f6;
        this.f16206D = f10;
        this.f16207E = aVar;
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
    public long O(float f6) {
        return Y0.y.e(this.f16207E.a(f6));
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
    public float X(long j6) {
        if (Y0.z.g(Y0.x.g(j6), Y0.z.f16241b.b())) {
            return Y0.i.q(this.f16207E.b(Y0.x.h(j6)));
        }
        throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Override // Y0.e
    public /* synthetic */ long b1(long j6) {
        return Y0.d.h(this, j6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0.h)) {
            return false;
        }
        Y0.h hVar = (Y0.h) obj;
        return java.lang.Float.compare(this.f16205C, hVar.f16205C) == 0 && java.lang.Float.compare(this.f16206D, hVar.f16206D) == 0 && p247y7.AbstractC7350t.b(this.f16207E, hVar.f16207E);
    }

    @Override // Y0.e
    public /* synthetic */ float g1(long j6) {
        return Y0.d.f(this, j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f16205C;
    }

    public int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.f16205C) * 31) + java.lang.Float.floatToIntBits(this.f16206D)) * 31) + this.f16207E.hashCode();
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
        return "DensityWithConverter(density=" + this.f16205C + ", fontScale=" + this.f16206D + ", converter=" + this.f16207E + ')';
    }

    @Override // Y0.n
    public float v0() {
        return this.f16206D;
    }
}
