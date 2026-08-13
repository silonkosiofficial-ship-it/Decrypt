package S;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f10976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f10978c;

    private e1(float f6, float f10, float f11) {
        this.f10976a = f6;
        this.f10977b = f10;
        this.f10978c = f11;
    }

    public /* synthetic */ e1(float f6, float f10, float f11, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11);
    }

    public final float a() {
        return this.f10976a;
    }

    public final float b() {
        return Y0.i.q(this.f10976a + this.f10977b);
    }

    public final float c() {
        return this.f10977b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S.e1)) {
            return false;
        }
        S.e1 e1Var = (S.e1) obj;
        return Y0.i.s(this.f10976a, e1Var.f10976a) && Y0.i.s(this.f10977b, e1Var.f10977b) && Y0.i.s(this.f10978c, e1Var.f10978c);
    }

    public int hashCode() {
        return (((Y0.i.t(this.f10976a) * 31) + Y0.i.t(this.f10977b)) * 31) + Y0.i.t(this.f10978c);
    }

    public java.lang.String toString() {
        return "TabPosition(left=" + ((java.lang.Object) Y0.i.u(this.f10976a)) + ", right=" + ((java.lang.Object) Y0.i.u(b())) + ", width=" + ((java.lang.Object) Y0.i.u(this.f10977b)) + ", contentWidth=" + ((java.lang.Object) Y0.i.u(this.f10978c)) + ')';
    }
}
