package A;

/* JADX INFO: loaded from: classes.dex */
public final class C implements A.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f3b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f4c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5d;

    private C(float f6, float f10, float f11, float f12) {
        this.f2a = f6;
        this.f3b = f10;
        this.f4c = f11;
        this.f5d = f12;
        if (f6 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Start padding must be non-negative".toString());
        }
        if (f10 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Top padding must be non-negative".toString());
        }
        if (f11 < 0.0f) {
            throw new java.lang.IllegalArgumentException("End padding must be non-negative".toString());
        }
        if (f12 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Bottom padding must be non-negative".toString());
        }
    }

    public /* synthetic */ C(float f6, float f10, float f11, float f12, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12);
    }

    @Override // A.B
    public float a(Y0.v vVar) {
        return vVar == Y0.v.Ltr ? this.f2a : this.f4c;
    }

    @Override // A.B
    public float b(Y0.v vVar) {
        return vVar == Y0.v.Ltr ? this.f4c : this.f2a;
    }

    @Override // A.B
    public float c() {
        return this.f5d;
    }

    @Override // A.B
    public float d() {
        return this.f3b;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof A.C)) {
            return false;
        }
        A.C c6 = (A.C) obj;
        return Y0.i.s(this.f2a, c6.f2a) && Y0.i.s(this.f3b, c6.f3b) && Y0.i.s(this.f4c, c6.f4c) && Y0.i.s(this.f5d, c6.f5d);
    }

    public int hashCode() {
        return (((((Y0.i.t(this.f2a) * 31) + Y0.i.t(this.f3b)) * 31) + Y0.i.t(this.f4c)) * 31) + Y0.i.t(this.f5d);
    }

    public java.lang.String toString() {
        return "PaddingValues(start=" + ((java.lang.Object) Y0.i.u(this.f2a)) + ", top=" + ((java.lang.Object) Y0.i.u(this.f3b)) + ", end=" + ((java.lang.Object) Y0.i.u(this.f4c)) + ", bottom=" + ((java.lang.Object) Y0.i.u(this.f5d)) + ')';
    }
}
