package F0;

/* JADX INFO: loaded from: classes.dex */
final class t0 implements F0.p0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final D0.K f2710C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F0.T f2711D;

    public t0(D0.K k6, F0.T t6) {
        this.f2710C = k6;
        this.f2711D = t6;
    }

    @Override // F0.p0
    public boolean R() {
        return this.f2711D.m1().K();
    }

    public final F0.T a() {
        return this.f2711D;
    }

    public final D0.K b() {
        return this.f2710C;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0.t0)) {
            return false;
        }
        F0.t0 t0Var = (F0.t0) obj;
        return p247y7.AbstractC7350t.b(this.f2710C, t0Var.f2710C) && p247y7.AbstractC7350t.b(this.f2711D, t0Var.f2711D);
    }

    public int hashCode() {
        return (this.f2710C.hashCode() * 31) + this.f2711D.hashCode();
    }

    public java.lang.String toString() {
        return "PlaceableResult(result=" + this.f2710C + ", placeable=" + this.f2711D + ')';
    }
}
